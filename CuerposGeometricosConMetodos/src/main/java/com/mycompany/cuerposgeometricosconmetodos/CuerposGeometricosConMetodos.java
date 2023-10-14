package com.mycompany.cuerposgeometricosconmetodos;

import java.util.Scanner;

public class CuerposGeometricosConMetodos {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int intentos = 3;

        while (intentos > 0) {
            mostrarMenu();
            if (lector.hasNextInt()) {
                int opcion = lector.nextInt();
                lector.nextLine(); // Limpiar el buffer de entrada

                if (opcion >= 1 && opcion <= 16) {
                    calcularFigura(opcion, lector);
                    break; // Sale del bucle si la opción es válida
                } else {
                    System.out.println("Opción inválida. Debes seleccionar un número del 1 al 16.");
                    intentos--;
                    System.out.println("Intentos restantes: " + intentos);
                }
            } else {
                System.out.println("Entrada no válida. Debes ingresar un número entero.");
                lector.nextLine(); // Limpiar el buffer en caso de entrada no válida
                intentos--;
                System.out.println("Intentos restantes: " + intentos);
            }
        }

        if (intentos == 0) {
            System.out.println("Has agotado tus intentos. Adiós.");
        }

        lector.close();
    }

    public static void mostrarMenu() {
        System.out.println("Selecciona una figura geométrica:");
        System.out.println("1. Prisma");
        System.out.println("2. Cilindro");
        System.out.println("3. Pirámide");
        System.out.println("4. Cono");
        System.out.println("5. Esfera");
        System.out.println("6. Zona esférica");
        System.out.println("7. Casquete esférico");
        System.out.println("8. Huso esférico y cuña esférica");
        System.out.println("9. Ortoedro");
        System.out.println("10. Tetraedro");
        System.out.println("11. Hexaedro");
        System.out.println("12. Octaedro");
        System.out.println("13. Dodecaedro");
        System.out.println("14. Icosaedro");
        System.out.println("15. Tronco de cono");
        System.out.println("16. Tronco de pirámide");
        System.out.print("Elige una opción: ");
    }

    public static void calcularFigura(int opcion, Scanner lector) {
        switch (opcion) {
            case 1:
                calcularPrisma(lector);
                break;
            case 2:
                calcularCilindro(lector);
                break;
            case 3:
                calcularPiramide(lector);
                break;
            case 4:
                calcularCono(lector);
                break;
            case 5:
                calcularEsfera(lector);
                break;
            case 6:
                calcularZonaEsferica(lector);
                break;
            case 7:
                calcularCasqueteEsferico(lector);
                break;
            case 8:
                calcularHusoYCuñaEsferica(lector);
                break;
            case 9:
                calcularOrtoedro(lector);
                break;
            case 10:
                calcularTetraedro(lector);
                break;
            case 11:
                calcularHexaedro(lector);
                break;
            case 12:
                calcularOctaedro(lector);
                break;
            case 13:
                calcularDodecaedro(lector);
                break;
            case 14:
                calcularIcosaedro(lector);
                break;
            case 15:
                calcularTroncoDeCono(lector);
                break;
            case 16:
                calcularTroncoDePiramide(lector);
                break;
            default:
                System.out.println("Opción inválida.");
        }
    }

    public static void calcularPrisma(Scanner lector) {
        System.out.println("Cantidad de lados: ");
        int cantidadLadosPrisma = lector.nextInt();
        System.out.println("Longitud de los lados: ");
        double longitudLadosPrisma = lector.nextDouble();
        System.out.println("Altura: ");
        double alturaPrisma = lector.nextDouble();
        double perimetroBasePrisma = cantidadLadosPrisma * longitudLadosPrisma;
        double areaLateralPrisma = perimetroBasePrisma * alturaPrisma;
        double alfaPrisma = (Math.PI / 180) * (360 / cantidadLadosPrisma);
        double apotemaPrisma = longitudLadosPrisma / (2 * Math.tan(alfaPrisma / 2));
        double areaBasePrisma = (perimetroBasePrisma * apotemaPrisma / 2);
        double areaTotalPrisma = areaLateralPrisma + 2 * areaBasePrisma;
        double volumenPrisma = areaBasePrisma * alturaPrisma;
        System.out.println("Área Lateral: " + areaLateralPrisma + " unidades cuadradas.");
        System.out.println("Área Total: " + areaTotalPrisma + " unidades cuadradas.");
        System.out.println("Volumen: " + volumenPrisma + " unidades cúbicas");
    }

    public static void calcularCilindro(Scanner lector) {
        System.out.println("Ingrese el radio: ");
        double radioCilindro = lector.nextDouble();
        System.out.println("Ingrese la altura: ");
        double alturaCilindro = lector.nextDouble();
        double perimetroBaseCilindro = 2 * Math.PI * radioCilindro;
        double areaLateralCilindro = perimetroBaseCilindro * alturaCilindro;
        double areaBaseCilindro = Math.PI * Math.pow(radioCilindro, 2);
        double areaTotalCilindro = areaLateralCilindro + areaBaseCilindro;
        double volumenCilindro = areaBaseCilindro * alturaCilindro;
        System.out.println("Área Lateral: " + areaLateralCilindro + " unidades cuadradas.");
        System.out.println("Área Total: " + areaTotalCilindro + " unidades cuadradas.");
        System.out.println("Volumen: " + volumenCilindro + " unidades cúbicas");
    }

    public static void calcularPiramide(Scanner lector) {
        System.out.println("Ingrese la cantidad de lados: ");
        int cantidadLadosPiramide = lector.nextInt();
        System.out.println("Ingrese su longitud: ");
        double longitudLadosPiramide = lector.nextDouble();
        System.out.println("Ingrese la altura: ");
        double alturaPiramide = lector.nextDouble();
        double perimetroBasePiramide = cantidadLadosPiramide * longitudLadosPiramide;
        double alfaPiramide = (Math.PI / 180) * (360 / cantidadLadosPiramide);
        double apotemaPiramide = longitudLadosPiramide / (2 * Math.tan(alfaPiramide / 2));
        double areaBasePiramide = (perimetroBasePiramide * apotemaPiramide / 2);
        double areaLateralPiramide = perimetroBasePiramide * alturaPiramide / 2;
        double areaTotalPiramide = areaLateralPiramide + areaBasePiramide;
        double volumenPiramide = (areaBasePiramide * alturaPiramide) / 3;
        System.out.println("Área Lateral: " + areaLateralPiramide + " unidades cuadradas.");
        System.out.println("Área Total: " + areaTotalPiramide + " unidades cuadradas.");
        System.out.println("Volumen: " + volumenPiramide + " unidades cúbicas");
    }

    public static void calcularCono(Scanner lector) {
        System.out.println("Ingrese el radio: ");
        double radioCono = lector.nextDouble();
        System.out.println("Ingrese la altura: ");
        double alturaCono = lector.nextDouble();
        double generatrizCono = Math.sqrt(Math.pow(radioCono, 2) + Math.pow(alturaCono, 2));
        double areaLateralCono = Math.PI * radioCono * generatrizCono;
        double areaBaseCono = Math.PI * Math.pow(radioCono, 2);
        double areaTotalCono = areaLateralCono + areaBaseCono;
        double volumenCono = (areaBaseCono * alturaCono) / 3;
        System.out.println("Área Lateral: " + areaLateralCono + " unidades cuadradas.");
        System.out.println("Área Total: " + areaTotalCono + " unidades cuadradas.");
        System.out.println("Volumen: " + volumenCono + " unidades cúbicas");
    }

    public static void calcularEsfera(Scanner lector) {
        System.out.println("Ingrese el radio: ");
        double radioEsfera = lector.nextDouble();
        double areaSuperficieEsfera = 4 * Math.PI * Math.pow(radioEsfera, 2);
        double volumenEsfera = (4.0 / 3) * Math.PI * Math.pow(radioEsfera, 3);
        System.out.println("Área Superficie: " + areaSuperficieEsfera + " unidades cuadradas.");
        System.out.println("Volumen: " + volumenEsfera + " unidades cúbicas");
    }

    public static void calcularZonaEsferica(Scanner lector) {
        System.out.println("Ingrese el radio: ");
        double radioZonaEsferica = lector.nextDouble();
        System.out.println("Ingrese el ángulo central en grados: ");
        double anguloCentralZonaEsferica = lector.nextDouble();
        double areaZonaEsferica = (anguloCentralZonaEsferica / 360) * (4 * Math.PI * Math.pow(radioZonaEsferica, 2));
        System.out.println("Área: " + areaZonaEsferica + " unidades cuadradas.");
    }

    public static void calcularCasqueteEsferico(Scanner lector) {
        System.out.println("Ingrese el radio: ");
        double radioCasqueteEsferico = lector.nextDouble();
        System.out.println("Ingrese la altura: ");
        double alturaCasqueteEsferico = lector.nextDouble();
        double generatrizCasqueteEsferico = Math.sqrt(Math.pow(radioCasqueteEsferico, 2) - Math.pow(alturaCasqueteEsferico, 2));
        double areaCasqueteEsferico = 2 * Math.PI * radioCasqueteEsferico * generatrizCasqueteEsferico;
        double areaBaseCasqueteEsferico = Math.PI * Math.pow(radioCasqueteEsferico, 2);
        System.out.println("Área Lateral: " + areaCasqueteEsferico + " unidades cuadradas.");
        System.out.println("Área Base: " + areaBaseCasqueteEsferico + " unidades cuadradas.");
    }

    public static void calcularHusoYCuñaEsferica(Scanner lector) {
        System.out.println("Ingrese el radio: ");
        double radioHusoCuñaEsferica = lector.nextDouble();
        System.out.println("Ingrese el ángulo central en grados: ");
        double anguloCentralHusoCuñaEsferica = lector.nextDouble();
        double areaHusoEsferico = (anguloCentralHusoCuñaEsferica / 360) * (4 * Math.PI * Math.pow(radioHusoCuñaEsferica, 2));
        double volumenCuñaEsferica = (anguloCentralHusoCuñaEsferica / 360) * (2.0 / 3) * Math.PI * Math.pow(radioHusoCuñaEsferica, 3);
        System.out.println("Área: " + areaHusoEsferico + " unidades cuadradas.");
        System.out.println("Volumen Cuña Esférica: " + volumenCuñaEsferica + " unidades cúbicas.");
    }

    public static void calcularOrtoedro(Scanner lector) {
        System.out.println("Ingrese la longitud: ");
        double longitudOrtoedro = lector.nextDouble();
        System.out.println("Ingrese la anchura: ");
        double anchuraOrtoedro = lector.nextDouble();
        System.out.println("Ingrese la altura: ");
        double alturaOrtoedro = lector.nextDouble();
        double areaLateralOrtoedro = 2 * (longitudOrtoedro * alturaOrtoedro + longitudOrtoedro * anchuraOrtoedro + alturaOrtoedro * anchuraOrtoedro);
        double volumenOrtoedro = longitudOrtoedro * anchuraOrtoedro * alturaOrtoedro;
        System.out.println("Área Lateral: " + areaLateralOrtoedro + " unidades cuadradas.");
        System.out.println("Volumen: " + volumenOrtoedro + " unidades cúbicas.");
    }

    public static void calcularTetraedro(Scanner lector) {
        System.out.println("Ingrese la longitud de un lado: ");
        double longitudLadoTetraedro = lector.nextDouble();
        double areaLateralTetraedro = Math.sqrt(3) * Math.pow(longitudLadoTetraedro, 2);
        double areaBaseTetraedro = (Math.pow(longitudLadoTetraedro, 2) * Math.sqrt(3)) / 4;
        double areaTotalTetraedro = areaLateralTetraedro + 3 * areaBaseTetraedro;
        double volumenTetraedro = (Math.pow(longitudLadoTetraedro, 3) * Math.sqrt(2)) / 12;
        System.out.println("Área Lateral: " + areaLateralTetraedro + " unidades cuadradas.");
        System.out.println("Área Total: " + areaTotalTetraedro + " unidades cuadradas.");
        System.out.println("Volumen: " + volumenTetraedro + " unidades cúbicas.");
    }

    public static void calcularHexaedro(Scanner lector) {
        System.out.println("Ingrese la longitud de un lado: ");
        double longitudLadoHexaedro = lector.nextDouble();
        double areaLateralHexaedro = 4 * Math.pow(longitudLadoHexaedro, 2);
        double areaTotalHexaedro = 6 * Math.pow(longitudLadoHexaedro, 2);
        double volumenHexaedro = Math.pow(longitudLadoHexaedro, 3);
        System.out.println("Área Lateral: " + areaLateralHexaedro + " unidades cuadradas.");
        System.out.println("Área Total: " + areaTotalHexaedro + " unidades cuadradas.");
        System.out.println("Volumen: " + volumenHexaedro + " unidades cúbicas.");
    }

    public static void calcularOctaedro(Scanner lector) {
        System.out.println("Ingrese la longitud de un lado: ");
        double longitudLadoOctaedro = lector.nextDouble();
        double areaLateralOctaedro = 2 * Math.pow(longitudLadoOctaedro, 2) * Math.sqrt(2);
        double areaTotalOctaedro = 2 * Math.sqrt(2) * Math.pow(longitudLadoOctaedro, 2);
        double volumenOctaedro = (Math.sqrt(2) / 3) * Math.pow(longitudLadoOctaedro, 3);
        System.out.println("Área Lateral: " + areaLateralOctaedro + " unidades cuadradas.");
        System.out.println("Área Total: " + areaTotalOctaedro + " unidades cuadradas.");
        System.out.println("Volumen: " + volumenOctaedro + " unidades cúbicas.");
    }

    public static void calcularDodecaedro(Scanner lector) {
        System.out.println("Ingrese la longitud de un lado: ");
        double longitudLadoDodecaedro = lector.nextDouble();
        double areaLateralDodecaedro = 3 * Math.pow(longitudLadoDodecaedro, 2) * Math.sqrt(5);
        double areaTotalDodecaedro = 15 * Math.pow(longitudLadoDodecaedro, 2);
        double volumenDodecaedro = (15 + 7.5 * Math.sqrt(5)) * Math.pow(longitudLadoDodecaedro, 3) / 4;
        System.out.println("Área Lateral: " + areaLateralDodecaedro + " unidades cuadradas.");
        System.out.println("Área Total: " + areaTotalDodecaedro + " unidades cuadradas.");
        System.out.println("Volumen: " + volumenDodecaedro + " unidades cúbicas.");
    }

    public static void calcularIcosaedro(Scanner lector) {
        System.out.println("Ingrese la longitud de un lado: ");
        double longitudLadoIcosaedro = lector.nextDouble();
        double areaLateralIcosaedro = 5 * Math.sqrt(3) * Math.pow(longitudLadoIcosaedro, 2);
        double areaTotalIcosaedro = 5 * Math.sqrt(3) * Math.pow(longitudLadoIcosaedro, 2);
        double volumenIcosaedro = (5 / 12) * (3 + Math.sqrt(5)) * Math.pow(longitudLadoIcosaedro, 3);
        System.out.println("Área Lateral: " + areaLateralIcosaedro + " unidades cuadradas.");
        System.out.println("Área Total: " + areaTotalIcosaedro + " unidades cuadradas.");
        System.out.println("Volumen: " + volumenIcosaedro + " unidades cúbicas.");
    }

    public static void calcularTroncoDeCono(Scanner lector) {
        System.out.println("Ingrese el radio mayor: ");
        double radioMayorTroncoCono = lector.nextDouble();
        System.out.println("Ingrese el radio menor: ");
        double radioMenorTroncoCono = lector.nextDouble();
        System.out.println("Ingrese la altura: ");
        double alturaTroncoCono = lector.nextDouble();
        double generatrizMayorTroncoCono = Math.sqrt(Math.pow(radioMayorTroncoCono, 2) + Math.pow(alturaTroncoCono, 2));
        double generatrizMenorTroncoCono = Math.sqrt(Math.pow(radioMenorTroncoCono, 2) + Math.pow(alturaTroncoCono, 2));
        double areaLateralTroncoCono = Math.PI * (radioMayorTroncoCono + radioMenorTroncoCono) * (generatrizMayorTroncoCono + generatrizMenorTroncoCono);
        double areaBaseMayorTroncoCono = Math.PI * Math.pow(radioMayorTroncoCono, 2);
        double areaBaseMenorTroncoCono = Math.PI * Math.pow(radioMenorTroncoCono, 2);
        double areaTotalTroncoCono = areaLateralTroncoCono + areaBaseMayorTroncoCono + areaBaseMenorTroncoCono;
        double volumenTroncoCono = (1.0 / 3) * Math.PI * alturaTroncoCono * (Math.pow(radioMayorTroncoCono, 2) + Math.pow(radioMenorTroncoCono, 2) + (radioMayorTroncoCono * radioMenorTroncoCono));
        System.out.println("Área Lateral: " + areaLateralTroncoCono + " unidades cuadradas.");
        System.out.println("Área Total: " + areaTotalTroncoCono + " unidades cuadradas.");
        System.out.println("Volumen: " + volumenTroncoCono + " unidades cúbicas.");
    }

    public static void calcularTroncoDePiramide(Scanner lector) {
        System.out.println("Ingrese la longitud de un lado de la base mayor: ");
        double longitudBaseMayorTroncoPiramide = lector.nextDouble();
        System.out.println("Ingrese la longitud de un lado de la base menor: ");
        double longitudBaseMenorTroncoPiramide = lector.nextDouble();
        System.out.println("Ingrese la altura: ");
        double alturaTroncoPiramide = lector.nextDouble();
        double perimetroBaseMayorTroncoPiramide = 5 * longitudBaseMayorTroncoPiramide;
        double apotemaBaseMayorTroncoPiramide = longitudBaseMayorTroncoPiramide / (2 * Math.tan(Math.PI / 5));
        double areaBaseMayorTroncoPiramide = (perimetroBaseMayorTroncoPiramide * apotemaBaseMayorTroncoPiramide) / 2;
        double perimetroBaseMenorTroncoPiramide = 5 * longitudBaseMenorTroncoPiramide;
        double apotemaBaseMenorTroncoPiramide = longitudBaseMenorTroncoPiramide / (2 * Math.tan(Math.PI / 5));
        double areaBaseMenorTroncoPiramide = (perimetroBaseMenorTroncoPiramide * apotemaBaseMenorTroncoPiramide) / 2;
        double areaLateralTroncoPiramide = (5 * (longitudBaseMayorTroncoPiramide + longitudBaseMenorTroncoPiramide) / 2) * alturaTroncoPiramide;
        double areaTotalTroncoPiramide = areaBaseMayorTroncoPiramide + areaBaseMenorTroncoPiramide + areaLateralTroncoPiramide;
        double volumenTroncoPiramide = (alturaTroncoPiramide / 3) * (areaBaseMayorTroncoPiramide + areaBaseMenorTroncoPiramide + Math.sqrt(areaBaseMayorTroncoPiramide * areaBaseMenorTroncoPiramide));
        System.out.println("Área Lateral: " + areaLateralTroncoPiramide + " unidades cuadradas.");
        System.out.println("Área Total: " + areaTotalTroncoPiramide + " unidades cuadradas.");
        System.out.println("Volumen: " + volumenTroncoPiramide + " unidades cúbicas.");
    }
}
