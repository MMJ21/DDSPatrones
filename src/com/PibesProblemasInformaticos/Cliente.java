package com.PibesProblemasInformaticos;

import java.util.Locale;
import java.util.Scanner;

public class Cliente {

    private String DireccionDestino;
    private String DireccionOrigen;
    private int CodigoPostalDestino;
    private int CodigoPostalOrigen;
    private double Peso;
    private Envio MyEnvio;
    private final Scanner Scanner = new Scanner(System.in).useLocale(Locale.US);
    private static Cliente MyCliente;


    public Cliente() { }

    public static void main(String[] args) {
        Cliente myClient = new Cliente();
        System.out.println("Creando envío...\n");
        myClient.crearEnvio();
    }

    public void crearEnvio() {
        recogerDatosEnvio();
        ITransportista transportista = TransportistaFactory.crearTransportista(CodigoPostalOrigen);
        MyEnvio = new Urgente(EnvioFactory.crearEnvio(DireccionOrigen, CodigoPostalOrigen, DireccionDestino, CodigoPostalDestino, Peso, transportista));
        System.out.println(MyEnvio.enviar() + "\n");
        System.out.println("TOTAL: " + MyEnvio.coste());
    }

    private void recogerDatosEnvio() {
        System.out.println("Escriba la dirección origen: ");
        DireccionOrigen = Scanner.nextLine();
        System.out.println("Escriba el código postal origen: ");
        CodigoPostalOrigen = getIntWithRetry();
        System.out.println("Escriba la dirección destino: ");
        DireccionDestino = Scanner.nextLine();
        System.out.println("Escriba el código postal destino: ");
        CodigoPostalDestino = getIntWithRetry();
        System.out.println("Indique el peso del envío: ");
        Peso = getDoubleWithRetry();
    }

    private int getIntWithRetry() {
        boolean done = false;
        int result = 0;

        while(!done) {
            try {
                result = Integer.parseInt(Scanner.nextLine());
                done = true;
            }
            catch (Exception e) {
                System.out.println("Inválido, inténtelo de nuevo: ");
            }
        }
        return result;
    }

    private double getDoubleWithRetry() {
        boolean done = false;
        double result = 0;

        while(!done) {
            try {
                result = Double.parseDouble(Scanner.nextLine());
                done = true;
            }
            catch (Exception e) {
                System.out.println("Inválido, inténtelo de nuevo: ");
            }
        }
        return result;
    }

}
