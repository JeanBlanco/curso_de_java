package com.company;

public class Switch {

    public static void main(String[] args) {
        String dia = "sabadojuhdhfbhd";

        switch (dia){
            case "domingo":
                System.out.println("Primer dia de la semana");
                break;

            case "Lunes":
                System.out.println("Segundo dia de la semana");
                break;

            case "Martes":
                System.out.println("tercer dia de la semana");
                break;

            case "miercoles":
                System.out.println("cuarto dia de la semana");
                break;

            case "jueves":
                System.out.println("quinto dia de la semana");
                break;

            case "viernes":
                System.out.println("sexto dia de la semana");
                break;

            case "sabado":
                System.out.println("Dia de reposo");
                break;
            default:
                System.out.println("No es un dia valido");
                break;
        }
    }
}
