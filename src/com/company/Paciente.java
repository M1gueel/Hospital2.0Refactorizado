package com.company;

public class Paciente {
    private String nombreDelPaciente;       //Se cambió nombre por nombreDelPaciente
    private Sexo sexo;
    private int edad;
    private Enfermedad tipoDeEnfermedad;
    private boolean esAportante;

    public Paciente(String nombreDelPaciente, Sexo sexo, int edad, Enfermedad tipoDeEnfermedad, boolean EsAportante) {
        this.nombreDelPaciente = nombreDelPaciente;
        this.sexo = sexo;
        this.edad = edad;
        this.tipoDeEnfermedad = tipoDeEnfermedad;
        esAportante = EsAportante;
    }

    public Sexo getSexo() {
        return sexo;
    }

    public int getEdad() {
        return edad;
    }

    public Enfermedad getTipoDeEnfermedad() {
        return tipoDeEnfermedad;
    }

    public boolean esAportante() {
        return esAportante;
    }


    public String getNombreDelPaciente() {
        return nombreDelPaciente;
    }
}

