package com.company;

public class Hospital {
    private String nombreDelHospital;   //Se cambió nombre por nombreDelHospital
    Paciente[] listaDePacientes;
    int numeroDePacientes=0;
    String[] listaDeMedicamentos;       //Se deberia cambiar el nombre a cantidadDeMedicamentos
    int MedicamentosImportados =0;
    int MedicamentosGenericos =0;
    int PacientesAportantes =0;
    int PacientesNoAportantes =0;

    public Hospital(String nombreDelHospital) {
        this.nombreDelHospital = nombreDelHospital;
        listaDePacientes = new Paciente[10];
    }

    public void agregarPacienteALaLista(Paciente paciente) {
    listaDePacientes[numeroDePacientes++]= paciente;
    listaDeMedicamentos = new String[numeroDePacientes];
     }

    public void imprimirNumeroDePacientesEnlistados() {
        //Se agregó una comprobocaion previa para saber si existen pacientes en lista con el metodo
        if (!comprobarPacientesEnLista()){
            System.out.println(" El hospital no mantiene pacientes en lista");
        }
        System.out.println(" El numero de pacientes que tiene el hospital es: " + numeroDePacientes);
    }

    //Metodo nuevo
    private boolean comprobarPacientesEnLista() {
        if (numeroDePacientes >0){
            return true;
        }
        return false;
    }

    //Se debe sacar las variables locales para poder ser usadas a nivel global
    
    public void imprimirListaDeMedicamentosNecesarios() {
        //int contadorMedicamentosCaros=0;
        //int contadorMedicamentosBaratos=0;
        for (Paciente paciente:listaDePacientes) {
            if (paciente!= null){
                if (paciente.getTipoDeEnfermedad() instanceof EnfermedadCritica){
                    MedicamentosImportados++;
                } else if (paciente.getTipoDeEnfermedad() instanceof  EnfermedadEstable) {
                    MedicamentosGenericos++;
                }
            }
        }
        imprimir();
        //System.out.println( " El numero de medicamentos caros que se necesitan son: " + contadorMedicamentosCaros   );
        //System.out.println( " El numero de medicamentos baratos que se necesitan son: " + contadorMedicamentosBaratos   );
    }
    public void imprimir(){
        System.out.println( " Cantidad de medicamentos importados necesarios: " + MedicamentosImportados);
        System.out.println( " Cantidad de medicamentos genéricos necesarios: " + MedicamentosGenericos);
    }


    //Se extrajo las variables locales
    public void imprimirNumeroDePacientesAportantes() {
        //int contadorDePacientesAportantes=0;
        //int contadorDePacientesQueNoAportan =0;
        for (Paciente paciente: listaDePacientes) {
            if (paciente != null){
                if (paciente.esAportante() == true ){
                    PacientesAportantes++;
                    System.out.println(" Paciente: " + paciente.getNombreDelPaciente() + " aporta ");
                } else if ( paciente.esAportante()== false ){
                    System.out.println( " Paciente: " + paciente.getNombreDelPaciente() + " no aporta "  );
                    PacientesNoAportantes++;
                }
            }
        }
        System.out.println(" Total aportantes: " + PacientesAportantes);
        System.out.println(" Total no aportantes: " + PacientesNoAportantes);

    }

    public void imprimirListaDePacientesQueNecesitanPermiso() {

        for (Paciente paciente: listaDePacientes) {
            if (paciente!=null){
                if (paciente.getEdad()>=18){
                    System.out.println(" El paciente : " + paciente.getNombreDelPaciente() + " no necesita permiso "  );
                } else if (paciente.getEdad()<18){
                    System.out.println(" El paciente : " + paciente.getNombreDelPaciente() + " si necesita autorizacion " );
                }
            }
        }

    }
}
