package com.example;


public class EstructurasDeControl {

    public static void main(String[] args) {

        System.out.println("BUCLE IF");
        System.out.println(bucleIf(0));
        System.out.println(bucleIf(1));
        System.out.println(bucleIf(2));

        System.out.println(" ");

        System.out.println("BUCLE WHILE");
        System.out.println(bucleWhile(0));

        System.out.println(" ");

        System.out.println("BUCLE DOWHILE");
        System.out.println(bucleDoWhile(0));

        System.out.println(" ");

        System.out.println("BUCLE FOR");
        System.out.println(bucleFor());

        System.out.println(" ");

        System.out.println("BUCLE SWITCH");
        System.out.println(bucleSwitch("verano"));
        System.out.println(" ");
        System.out.println(bucleSwitch("primavera"));
        System.out.println(" ");
        System.out.println(bucleSwitch("otoño"));
        System.out.println(" ");
        System.out.println(bucleSwitch("invierno"));
        System.out.println(" ");
        System.out.println(bucleSwitch("Jorge"));
    }

    //- Usando un if, crear una condición que compare si la variable numeroIf es positivo, negativo, o 0.

    public static String bucleIf(int numeroIf) {
        String alerta = "El número " + numeroIf + " es ";
        if(numeroIf < 0){
            return alerta + "positivo";
        }else if(numeroIf >0){
            return alerta + "negativo";
        }else{
            return alerta + "0";
        }

    }


    //- Crea un bucle While, este bucle tendrá que tener como condición que la variable numeroWhile sea inferior
    // a 3, el bloque de código que tendrá el bucle deberá:
    //- Incrementar el valor de la variable en uno cada vez que se ejecute.
    //- Mostrarlo por pantalla cada vez que se ejecute.

    public static String bucleWhile(int numeroWhile){
        while(numeroWhile < 3){
            System.out.println("El numeroWhile es: " + numeroWhile);
            numeroWhile++;
        }

        return "Bucle while finalizado";

    }

    //- Para el bucle Do While, deberás crear la misma estructura que en el While, pero solo se debe
    // ejecutar una vez.

    public static String bucleDoWhile(int numeroDoWhile){
        do{
            System.out.println("El numeroDoWhile es: " + numeroDoWhile);
            numeroDoWhile++;
            break;

        }while(numeroDoWhile < 3);

        return "Bucle do while finalizado";
    }


    //- Para el bucle For, crea una variable numeroFor, esta variable tendrá como valor 0 y su condición será que
    // la variable sea igual o menor que 3, se irá incrementando en 1 su valor cada vez que se ejecute y deberá
    // mostrarse por pantalla.

    public static String bucleFor(){
        for(int numeroFor =0; numeroFor < 3; numeroFor++){
            System.out.println("El numeroFor es " + numeroFor);
        }

        return "Bucle for finalizado";
    }

    //- Por último, para el Switch, deberás crear la variable estacion, y distintos *case* para las cuatro
    // estaciones del año. Dependiendo del valor de la variable estacion se deberá mandar un mensaje por consola
    // informando de la estación en la que está. También habrá que poner un default para cuando el valor de la
    // variable no sea una estación.

    public static String bucleSwitch(String estacion){
        switch(estacion){
            case "verano":
                System.out.println("La estación es verano");
                break;
            case "primavera":
                System.out.println("La estación es primavera");
                break;
            case "otoño":
                System.out.println("La estación es otoño");
                break;
            case "invierno":
                System.out.println("La estaciín es invierno");
                break;
            default:
                System.out.println("No es una estación válida");
                break;

        }

        return "Bucle switch finalizado";
    }

}
