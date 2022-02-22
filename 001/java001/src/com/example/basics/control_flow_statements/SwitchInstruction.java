package com.example.basics.control_flow_statements;

public class SwitchInstruction {
    public static void main(String[] args) {

        enum CarVariant {SEDAN, COMBI, SPORT};

        int num = 10;

        switch (num) {
            case 1:
                System.out.println(1);
                System.out.println(" ok");
                break;
            case 3:
                System.out.println(3);
                break;
            case 10:
                System.out.println(10);
                break;
            case 11:
                System.out.println(11);
                break;
            default:
                System.out.println("Default: " + num);

        }
        
        String str = "Ania2";

        switch (str) {
            case "Ola":
                System.out.println("Ola");
                break;
            case "Anie":
                System.out.println("Ania");
            default:
                System.out.println("Default: " + str);
        }

        CarVariant car = CarVariant.COMBI;

        switch (car) {
            case COMBI:
                System.out.println(CarVariant.COMBI);
                break;
            case SEDAN:
                System.out.println(CarVariant.SEDAN);
                break;
            case SPORT:
                System.out.println(CarVariant.SPORT);
                break;
            default:
                System.out.println("Jakieś inne");
        }
    }

}