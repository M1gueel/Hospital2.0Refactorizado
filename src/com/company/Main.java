package com.company;
/*
    Se necesita gestionar la lista de medicamentos que se deben comprar para el hospital,
    Para esto el doctor de cabecera necesita registrar, si es mayor de edad, género,
    tipo de medicamento que toma, dependiendo si aporta se enlista el medicamento que
    necesita en caso de no aportar se agrega a la lista de espera. El doctor necesita
    ir agregando los datos de los pacientes para identificar el tipo de medicamento \
    que se va a comprar. Al final se debe imprimir en pantalla cuantos medicamentos
    se necesita.
 */

public class Main {

    public static void main(String[] args) {
        Hospital hospitalPadreCarolo = new Hospital(" Hospital Padre Carolo ");
        Paciente paciente1 = new Paciente( " Carlos " ,new Masculino(), 19, new EnfermedadCritica(), true);
        Paciente paciente2 = new Paciente( " Erica " , new Femenino(), 14, new EnfermedadEstable(), true);
        Paciente paciente3 = new Paciente( " Jorge ", new Masculino(), 17, new EnfermedadCritica(), false);

        hospitalPadreCarolo.agregarPacienteALaLista(paciente1);
        hospitalPadreCarolo.agregarPacienteALaLista(paciente2);
        hospitalPadreCarolo.agregarPacienteALaLista(paciente3);
        hospitalPadreCarolo.imprimirNumeroDePacientesEnlistados();
        hospitalPadreCarolo.imprimirListaDeMedicamentosNecesarios();
        hospitalPadreCarolo.imprimirNumeroDePacientesAportantes();  //aqui
        hospitalPadreCarolo.imprimirListaDePacientesQueNecesitanPermiso();

    }
}

