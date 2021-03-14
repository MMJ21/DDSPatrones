package com.PibesProblemasInformaticos;

public abstract class Envio {

    protected double Peso;
    protected ITransportista Transportista;
    private static int ultimoID = 0;
    private int ID;
    private String DireccionOrigen;
    private int CodigoPostalOrigen;
    private String DireccionDestino;
    private int CodigoPostalDestino;

    public Envio() { }

    public Envio(String direccionOrigen, int codigoPostalOrigen,String direccionDestino, int codigoPostalDestino, double peso, ITransportista transportista)
    {
        this.ID = obtenerIdEnvio();
        this.DireccionOrigen = direccionOrigen;
        this.CodigoPostalOrigen = codigoPostalOrigen;
        this.DireccionDestino = direccionDestino;
        this.CodigoPostalDestino = codigoPostalDestino;
        this.Peso = peso;
        this.Transportista = transportista;
    }

    public String enviar()
    {
        return "Su envio con ID " + this.ID + "\n" +
                "será recogido en " + this.DireccionOrigen +
                " (código postal: " + this.CodigoPostalOrigen + ")\n" +
                "y enviado a " + this.DireccionDestino +
                " (código postal: " + this.CodigoPostalDestino + ")\n" ;
    }

    protected abstract double coste();

    private int obtenerIdEnvio()
    {
        return ++ultimoID;
    }



}
