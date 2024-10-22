import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        int opcion=0;
        String monedaBase = "";
        String monedaConvertir = "";

        Scanner lectura =new Scanner(System.in);
        ConvertirMoneda convertor= new ConvertirMoneda();


        while ( opcion !=7){

            System.out.println("********************************************");
            System.out.println("Sea bienvenido/a al Conversor de Moneda  =] \n");
            System.out.println("1) Dólar =>> Peso argentino");
            System.out.println("2) Peso argentino  ==> Dolar");
            System.out.println("3)  Dólar =>> Real brasileño ");
            System.out.println("4) Real Brasileño =>>Dólar");
            System.out.println("5) Dólar =>> Peso Colombiano");
            System.out.println("6) Peso colombiano ==< Dólar");
            System.out.println("Salir ");
            System.out.println("Elija una opcion valida:");
            System.out.println("*****************************************");

            try {
                opcion = Integer.valueOf(lectura.nextLine());
                if (opcion >= 1 && opcion <= 6) {
                    System.out.println("Ingrese el valor que desea convertir");

                    var valor = Double.valueOf(lectura.nextLine());

                    switch (opcion) {
                        case 1:
                            monedaBase = "USD";
                            monedaConvertir = "ARS";
                            break;
                        case 2:
                            monedaBase = "ARS";
                            monedaConvertir = "USD";
                            break;
                        case 3:
                            monedaBase = "USD";
                            monedaConvertir = "BRL";
                            break;
                        case 4:
                            monedaBase = "BRL";
                            monedaConvertir = "USD";
                            break;
                        case 5:
                            monedaBase = "USD";
                            monedaConvertir = "COP";
                            break;
                        case 6:
                            monedaBase = "COP";
                            monedaConvertir = "USD";
                    }

                    Moneda moneda = convertor.convertirMoneda(monedaBase, monedaConvertir);
                    double valorTotal = moneda.conversion_rate() * valor;

                    System.out.println("El valor  " + valor + " [" + monedaBase + "] " +
                            "corresponde al valor final de =>>>> " + valorTotal + " [" + monedaConvertir + "] ");
                }
            }catch (NumberFormatException e) {
                System.out.println("Opcion invalida");
            }

            }

        }




    }

