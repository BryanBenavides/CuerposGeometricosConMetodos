package com.mycompany.cuerposgeometricosconmetodos;

import java.util.Scanner;

public class CuerposGeometricosConMetodos {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int intentos = 0;
        int opc;

        do {
        System.out.println("¿Qué figura geométrica desea calcular?");
        System.out.println("1) Prisma: ");
        System.out.println("2) Cilindro: ");
        System.out.println("3) Pirámide: ");
        System.out.println("4) Cono: ");
        System.out.println("5) Esfera: ");
        System.out.println("6) Zona Esférica: ");
        System.out.println("7) Casquete Esférico: ");
        System.out.println("8) Huso Esférico y Cuña Esférica: ");
        System.out.println("9) Ortoedro");
        System.out.println("10) Tetraedro");
        System.out.println("11) Hexaedro");
        System.out.println("12) Octaedro");
        System.out.println("13) Dodecaedro");
        System.out.println("14) Icosaedro");
        System.out.println("15) Tronco de Cono");
        System.out.println("16) Tronco de Pirámide");
        System.out.println("17) Salir");
        opc = lector.nextInt();

        switch (opc) {
            case 1:
                calcularPrisma();
                break;
            case 2:
                calcularCilindro();
                break;
            case 3:
                calcularPiramide();
                break;
            case 4:
                calcularCono();
                break;
            case 5:
                calcularEsfera();
                break;
            case 6:
                calcularZonaEsferica();
                break;
            case 7:
                calcularCasqueteEsferico();
                break;
            case 8:
                calcularHusoCuñaEsferica();
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
                calculoIcosaedro();
                break;
            case 15:
                calculoTroncoCono();
                break;
            case 16:
                calculoTroncoPiramide();
                break;
            case 17:
                System.out.println("Saliendo del sistema");
                break;
            default:
                    System.out.println("Por favor, ingrese una opción válida.");
                    intentos++;
            }
        } while (intentos < 3 && opc != 17);

        lector.close();
    }

    public static void calcularPrisma() {
        Scanner lector = new Scanner(System.in);
        char calculo;
        double areaLateral = 0, areaTotal = 0, volumen = 0;
        int cantidadLados = 0, intentos;
        double longitudLados = 0, altura = 0;

        System.out.println("¿Qué parte de la figura desea calcular?");
        System.out.println("a) Área Lateral");
        System.out.println("b) Área Total");
        System.out.println("c) Volumen");
        calculo = lector.next().charAt(0);

        for (intentos = 0; intentos < 3; intentos++) {
            System.out.print("Cantidad de lados: ");
            cantidadLados = lector.nextInt();
            System.out.print("Altura: ");
            altura = lector.nextDouble();
            System.out.print("Longitud de los lados: ");
            longitudLados = lector.nextDouble();

            if (cantidadLados > 0 && altura > 0 && longitudLados > 0) {
                double perimetroBase = cantidadLados * longitudLados;
                areaLateral = perimetroBase * altura;
                double alfa = (Math.PI / 180) * (360 / cantidadLados);
                double apotema = longitudLados / (2 * Math.tan((alfa) / 2));
                double areaBase = (perimetroBase * apotema) / 2;
                areaTotal = areaLateral + 2 * areaBase;
                volumen = areaBase * altura;
                break;
            } else {
                System.out.println("No se permiten negativos ni cero.");
            }
        }

        if (calculo == 'a') {
            if (cantidadLados > 0 && altura > 0 && longitudLados > 0) {
                System.out.println("Área Lateral: " + areaLateral + " unidades cuadradas.");
            } else {
                System.out.println("Intentos gastados. Programa terminado.");
            }
        } else if (calculo == 'b') {
            if (cantidadLados > 0 && altura > 0 && longitudLados > 0) {
                System.out.println("Área Total: " + areaTotal + " unidades cuadradas.");
            } else {
                System.out.println("Intentos gastados. Programa terminado.");
            }
        } else if (calculo == 'c') {
            if (cantidadLados > 0 && altura > 0 && longitudLados > 0) {
                System.out.println("Volumen: " + volumen + " unidades cúbicas.");
            } else {
                System.out.println("Intentos gastados. Programa terminado.");
            }
        } else {
            System.out.println("Por favor ingrese una opción válida.");
        }
    }

    public static void calcularCilindro() {
        Scanner lector = new Scanner(System.in);
        char calculo;
        double areaLateral = 0, areaTotal = 0, volumen = 0;
        double altura = 0, radio = 0;
        int intentos;

        System.out.println("¿Qué parte de la figura desea calcular?");
        System.out.println("a) Área Lateral");
        System.out.println("b) Área Total");
        System.out.println("c) Volumen");
        calculo = lector.next().charAt(0);

        for (intentos = 0; intentos < 3; intentos++) {
            System.out.println("Altura: ");
            altura = lector.nextDouble();
            System.out.println("Radio: ");
            radio = lector.nextDouble();

            if (radio > 0 && altura > 0) {
                double perimetroBase = radio * (Math.PI * 2);
                areaLateral = altura * perimetroBase;
                double areaBase = (Math.PI) * Math.pow(radio, 2);
                areaTotal = areaLateral + 2 * areaBase;
                volumen = areaBase * altura;
                break;
            } else {
                System.out.println("No se permiten valores negativos ni cero.");
            }
        }

        if (calculo == 'a') {
            if (radio > 0 && altura > 0) {
                System.out.println("Área Lateral: " + areaLateral + " unidades cuadradas.");
            } else {
                System.out.println("Intentos gastados. Programa terminado.");
            }
        } else if (calculo == 'b') {
            if (radio > 0 && altura > 0) {
                System.out.println("Área Total: " + areaTotal + " unidades cuadradas.");
            } else {
                System.out.println("Intentos gastados. Programa terminado.");
            }
        } else if (calculo == 'c') {
            if (radio > 0 && altura > 0) {
                System.out.println("Volumen: " + volumen + " unidades cúbicas.");
            } else {
                System.out.println("Intentos gastados. Programa terminado.");
            }
        } else {
            System.out.println("Por favor ingrese una opción válida.");
        }
    }

    public static void calcularPiramide() {
        Scanner lector = new Scanner(System.in);
        char calculo;
        double areaLateral = 0, areaTotal = 0, volumen = 0;
        double apotema = 0, altura = 0;
        int intentos, lados = 0;

        System.out.println("¿Qué parte de la figura desea calcular?");
        System.out.println("a) Área Lateral");
        System.out.println("b) Área Total");
        System.out.println("c) Volumen");
        calculo = lector.next().charAt(0);

        for (intentos = 0; intentos < 3; intentos++) {
            System.out.print("Cantidad de lados: ");
            lados = lector.nextInt();
            System.out.print("Apotema de la base: ");
            apotema = lector.nextDouble();
            System.out.print("Altura de la pirámide: ");
            altura = lector.nextDouble();

            if (lados > 0 && apotema > 0 && altura > 0) {
                double perimetroBase = lados * 2 * apotema;
                areaLateral = (perimetroBase * altura) / 2;
                double areaBase = (lados * apotema * apotema) / 2;
                areaTotal = areaLateral + areaBase;
                volumen = (areaBase * altura) / 3;
                break;
            } else {
                System.out.println("No se permiten valores negativos ni cero.");
            }
        }

        if (calculo == 'a') {
            if (lados > 0 && apotema > 0 && altura > 0) {
                System.out.println("Área Lateral: " + areaLateral + " unidades cuadradas.");
            } else {
                System.out.println("Intentos gastados. Programa terminado.");
            }
        } else if (calculo == 'b') {
            if (lados > 0 && apotema > 0 && altura > 0) {
                System.out.println("Área Total: " + areaTotal + " unidades cuadradas.");
            } else {
                System.out.println("Intentos gastados. Programa terminado.");
            }
        } else if (calculo == 'c') {
            if (lados > 0 && apotema > 0 && altura > 0) {
                System.out.println("Volumen: " + volumen + " unidades cúbicas.");
            } else {
                System.out.println("Intentos gastados. Programa terminado.");
            }
        } else {
            System.out.println("Por favor ingrese una opción válida.");
        }
    }

    public static void calcularCono() {
        Scanner lector = new Scanner(System.in);
        char calculo;
        double areaLateral = 0, areaTotal = 0, volumen = 0;
        double radio = 0, altura = 0;
        int intentos;

        System.out.println("¿Qué parte de la figura desea calcular?");
        System.out.println("a) Área Lateral");
        System.out.println("b) Área Total");
        System.out.println("c) Volumen");
        calculo = lector.next().charAt(0);

        for (intentos = 0; intentos < 3; intentos++) {
            System.out.print("Radio: ");
            radio = lector.nextDouble();
            System.out.print("Altura: ");
            altura = lector.nextDouble();

            if (radio > 0 && altura > 0) {
                double generatriz = Math.sqrt((radio * radio) + (altura * altura));
                areaLateral = Math.PI * radio * generatriz;
                double areaBase = Math.PI * Math.pow(radio, 2);
                areaTotal = areaLateral + areaBase;
                volumen = (areaBase * altura) / 3;
                break;
            } else {
                System.out.println("No se permiten valores negativos ni cero.");
            }
        }

        if (calculo == 'a') {
            if (radio > 0 && altura > 0) {
                System.out.println("Área Lateral: " + areaLateral + " unidades cuadradas.");
            } else {
                System.out.println("Intentos gastados. Programa terminado.");
            }
        } else if (calculo == 'b') {
            if (radio > 0 && altura > 0) {
                System.out.println("Área Total: " + areaTotal + " unidades cuadradas.");
            } else {
                System.out.println("Intentos gastados. Programa terminado.");
            }
        } else if (calculo == 'c') {
            if (radio > 0 && altura > 0) {
                System.out.println("Volumen: " + volumen + " unidades cúbicas.");
            } else {
                System.out.println("Intentos gastados. Programa terminado.");
            }
        } else {
            System.out.println("Por favor ingrese una opción válida.");
        }
    }

    public static void calcularEsfera() {
        Scanner lector = new Scanner(System.in);
        char calculo;
        double area = 0, volumen = 0;
        double radio = 0;
        int intentos;

        System.out.println("¿Qué parte de la figura desea calcular?");
        System.out.println("a) Área Superficial");
        System.out.println("b) Volumen");
        calculo = lector.next().charAt(0);

        for (intentos = 0; intentos < 3; intentos++) {
            System.out.print("Radio: ");
            radio = lector.nextDouble();

            if (radio > 0) {
                area = 4 * Math.PI * Math.pow(radio, 2);
                volumen = (4.0 / 3.0) * Math.PI * Math.pow(radio, 3);
                break;
            } else {
                System.out.println("No se permiten valores negativos ni cero.");
            }
        }

        if (calculo == 'a') {
            if (radio > 0) {
                System.out.println("Área Superficial: " + area + " unidades cuadradas.");
            } else {
                System.out.println("Intentos gastados. Programa terminado.");
            }
        } else if (calculo == 'b') {
            if (radio > 0) {
                System.out.println("Volumen: " + volumen + " unidades cúbicas.");
            } else {
                System.out.println("Intentos gastados. Programa terminado.");
            }
        } else {
            System.out.println("Por favor ingrese una opción válida.");
        }
    }

    public static void calcularZonaEsferica() {
        Scanner lector = new Scanner(System.in);
        double porcionSuperficie = 0, porcionEsfera = 0;
        double radio = 0, angulo = 0, intentos;

        for (intentos = 0; intentos < 3; intentos++) {
            System.out.print("Radio de la esfera: ");
            radio = lector.nextDouble();
            System.out.print("Ángulo en grados: ");
            angulo = lector.nextDouble();

            if (radio > 0 && angulo >= 0 && angulo <= 360) {
                porcionSuperficie = (2 * Math.PI * radio * angulo) / 360;
                porcionEsfera = (4 * Math.PI * Math.pow(radio, 2) * angulo) / 360;
                break;
            } else {
                System.out.println("No se permiten valores negativos ni ángulos fuera del rango [0, 360].");
            }
        }

        if (radio > 0 && angulo >= 0 && angulo <= 360) {
            System.out.println("Área de la zona esférica: " + porcionSuperficie + " unidades cuadradas.");
            System.out.println("Área de la porción de la esfera: " + porcionEsfera + " unidades cuadradas.");
        } else {
            System.out.println("Intentos gastados. Programa terminado.");
        }
    }

    public static void calcularCasqueteEsferico() {
        Scanner lector = new Scanner(System.in);
        double areaSuperficie = 0, volumen = 0;
        double radio = 0, altura = 0, intentos;

        for (intentos = 0; intentos < 3; intentos++) {
            System.out.print("Radio de la esfera: ");
            radio = lector.nextDouble();
            System.out.print("Altura del casquete: ");
            altura = lector.nextDouble();

            if (radio > 0 && altura > 0) {
                double h = radio - altura;
                double l = Math.sqrt((2 * radio * altura) - (altura * altura));
                areaSuperficie = 2 * Math.PI * radio * l;
                volumen = (Math.PI * altura * altura * (3 * radio - altura)) / 3;
                break;
            } else {
                System.out.println("No se permiten valores negativos ni cero.");
            }
        }

        if (radio > 0 && altura > 0) {
            System.out.println("Área de la superficie del casquete esférico: " + areaSuperficie + " unidades cuadradas.");
            System.out.println("Volumen del casquete esférico: " + volumen + " unidades cúbicas.");
        } else {
            System.out.println("Intentos gastados. Programa terminado.");
        }
    }

    public static void calcularHusoCuñaEsferica() {
        Scanner lector = new Scanner(System.in);
        double areaSuperficie = 0, volumen = 0;
        double radio = 0, altura = 0, angulo = 0, intentos;

        for (intentos = 0; intentos < 3; intentos++) {
            System.out.print("Radio de la esfera: ");
            radio = lector.nextDouble();
            System.out.print("Altura del huso o cuña: ");
            altura = lector.nextDouble();
            System.out.print("Ángulo en grados: ");
            angulo = lector.nextDouble();

            if (radio > 0 && altura > 0 && angulo >= 0 && angulo <= 360) {
                double l = 2 * radio * Math.sin(Math.toRadians(angulo) / 2);
                double a = 2 * Math.PI * radio * (angulo / 360);
                areaSuperficie = Math.PI * radio * l + a * altura;
                volumen = (Math.PI * altura * altura * (3 * radio - altura)) / 3;
                break;
            } else {
                System.out.println("No se permiten valores negativos ni ángulos fuera del rango [0, 360].");
            }
        }

        if (radio > 0 && altura > 0 && angulo >= 0 && angulo <= 360) {
            System.out.println("Área de la superficie del huso o cuña esférica: " + areaSuperficie + " unidades cuadradas.");
            System.out.println("Volumen del huso o cuña esférica: " + volumen + " unidades cúbicas.");
        } else {
            System.out.println("Intentos gastados. Programa terminado.");
        }
    }
    
    public static void calcularOrtoedro(Scanner lector) {
        double longitud, profundidad, altura;
        longitud = obtenerDimension("longitud", lector);
        profundidad = obtenerDimension("profundidad", lector);
        altura = obtenerDimension("altura", lector);

        if (longitud <= 0 || profundidad <= 0 || altura <= 0) {
            System.out.println("No se permiten valores negativos o cero.");
            return;
        }

        double area = calcularAreaOrtoedro(longitud, profundidad, altura);
        double volumen = calcularVolumenOrtoedro(longitud, profundidad, altura);
        double diagonal = calcularDiagonalOrtoedro(longitud, profundidad, altura);

        System.out.println("Área: " + area);
        System.out.println("Volumen: " + volumen);
        System.out.println("Diagonal: " + diagonal);
    }

    public static double calcularAreaOrtoedro(double longitud, double profundidad, double altura) {
        return 2 * ((altura * longitud) + (altura * profundidad) + (longitud * profundidad));
    }

    public static double calcularVolumenOrtoedro(double longitud, double profundidad, double altura) {
        return altura * longitud * profundidad;
    }

    public static double calcularDiagonalOrtoedro(double longitud, double profundidad, double altura) {
        double cDiag = Math.pow(altura, 2) + Math.pow(longitud, 2) + Math.pow(profundidad, 2);
        return Math.sqrt(cDiag);
    }

    public static void calcularTetraedro(Scanner lector) {
        double arista = obtenerDimension("arista", lector);

        if (arista <= 0) {
            System.out.println("No se permiten valores negativos o cero.");
            return;
        }

        double area = calcularAreaTetraedro(arista);
        double volumen = calcularVolumenTetraedro(arista);
        double altura = calcularAlturaTetraedro(arista);

        System.out.println("Área: " + area);
        System.out.println("Volumen: " + volumen);
        System.out.println("Altura: " + altura);
    }

    public static double calcularAreaTetraedro(double arista) {
        return Math.pow(arista, 2) * Math.sqrt(3);
    }

    public static double calcularVolumenTetraedro(double arista) {
        return (Math.sqrt(2) / 12) * Math.pow(calcularAreaTetraedro(arista), 3);
    }

    public static double calcularAlturaTetraedro(double arista) {
        return arista * Math.sqrt(6) / 3;
    }

    public static void calcularHexaedro(Scanner lector) {
        double arista = obtenerDimension("arista", lector);

        if (arista <= 0) {
            System.out.println("No se permiten valores negativos o cero.");
            return;
        }

        double area = calcularAreaHexaedro(arista);
        double volumen = calcularVolumenHexaedro(arista);
        double diagonal = calcularDiagonalHexaedro(arista);

        System.out.println("Área: " + area);
        System.out.println("Volumen: " + volumen);
        System.out.println("Diagonal: " + diagonal);
    }

    public static double calcularAreaHexaedro(double arista) {
        return 6 * Math.pow(arista, 2);
    }

    public static double calcularVolumenHexaedro(double arista) {
        return Math.pow(arista, 3);
    }

    public static double calcularDiagonalHexaedro(double arista) {
        return arista * Math.sqrt(3);
    }

    public static void calcularOctaedro(Scanner lector) {
        double arista = obtenerDimension("arista", lector);

        if (arista <= 0) {
            System.out.println("No se permiten valores negativos o cero.");
            return;
        }

        double area = calcularAreaOctaedro(arista);
        double volumen = calcularVolumenOctaedro(arista);
        double diagonal = calcularDiagonalOctaedro(arista);

        System.out.println("Área: " + area);
        System.out.println("Volumen: " + volumen);
        System.out.println("Diagonal: " + diagonal);
    }

    public static double calcularAreaOctaedro(double arista) {
        return 2 * Math.pow(arista, 2) * Math.sqrt(3);
    }

    public static double calcularVolumenOctaedro(double arista) {
        return (Math.sqrt(2) / 3) * Math.pow(arista, 3);
    }

    public static double calcularDiagonalOctaedro(double arista) {
        return arista * Math.sqrt(2);
    }

    public static void calcularDodecaedro(Scanner lector) {
        double arista = obtenerDimension("arista", lector);
        double cantidadLados = obtenerDimension("cantidad de lados", lector);
        double lado = obtenerDimension("lado", lector);

        if (arista <= 0 || cantidadLados <= 0 || lado <= 0) {
            System.out.println("No se permiten valores negativos o cero.");
            return;
        }

        double areaPentagonal = calcularAreaPentagonalDodecaedro(arista, cantidadLados, lado);
        double area = calcularAreaDodecaedro(arista, cantidadLados);
        double volumen = calcularVolumenDodecaedro(arista);

        System.out.println("Área Pentagonal: " + areaPentagonal);
        System.out.println("Área: " + area);
        System.out.println("Volumen: " + volumen);
    }

    public static double calcularAreaPentagonalDodecaedro(double arista, double cantidadLados, double lado) {
        double angulo = 360 / (2 * cantidadLados);
        double apotema = lado / (2 * Math.tan(Math.toRadians(angulo)));
        return 5 / 2 * (arista * apotema);
    }

    public static double calcularAreaDodecaedro(double arista, double cantidadLados) {
        return 3 * Math.pow(arista, 2) * (Math.sqrt(25 + 10 * Math.sqrt(5)));
    }

    public static double calcularVolumenDodecaedro(double arista) {
        return 1 / 4 * (15 + 7 * Math.sqrt(5)) * Math.pow(arista, 3);
    }

    public static double obtenerDimension(String nombreDimension, Scanner lector) {
        System.out.println("Ingrese la " + nombreDimension + ": ");
        return lector.nextDouble();
    }
    
    public static void calculoIcosaedro() {
        Scanner lector = new Scanner(System.in);
        char calculo;

        double arista = 0;
        double area = 0;
        double volumen = 0;

        System.out.println("¿Qué parte del icosaedro desea calcular?");
        System.out.println("a) Área");
        System.out.println("b) Volumen");
        calculo = lector.next().charAt(0);

        switch (calculo) {
            case 'a':
                for (int intentos = 0; intentos < 3; intentos++) {
                    System.out.println("Arista: ");
                    arista = lector.nextDouble();

                    if (arista > 0) {
                        area = 5 * Math.pow(arista, 2) * Math.sqrt(3);
                        break;
                    } else {
                        System.out.println("No se permiten negativos ni cero");
                    }
                }

                if (arista > 0) {
                    System.out.println("Área: " + area);
                } else {
                    System.out.println("Intentos gastados. Programa terminado.");
                }
                break;

            case 'b':
                for (int intentos = 0; intentos < 3; intentos++) {
                    System.out.println("Arista: ");
                    arista = lector.nextDouble();

                    if (arista > 0) {
                        volumen = 5 / 12 * (3 + Math.sqrt(5)) * Math.pow(arista, 3);
                        break;
                    } else {
                        System.out.println("No se permiten negativos ni cero");
                    }
                }

                if (arista > 0) {
                    System.out.println("Volumen: " + volumen);
                } else {
                    System.out.println("Intentos gastados. Programa terminado.");
                }
                break;

            default:
                System.out.println("Ingrese una opción válida");
        }

        lector.close();
    }

    public static void calculoTroncoCono() {
        Scanner lector = new Scanner(System.in);
        char calculo;

        double radio = 0, altura = 0, radioMayor = 0, generatriz = 0;
        double areaLateral = 0, areaBaseMayor = 0, areaBaseMenor = 0, areaTotal = 0, volumen = 0, totalVol = 0;
        double Pixal, radiosCuadrados, radxrad;

        System.out.println("¿Qué parte del tronco de cono desea calcular?");
        System.out.println("a) Área Lateral");
        System.out.println("b) Área Total");
        System.out.println("c) Volumen");
        calculo = lector.next().charAt(0);

        switch (calculo) {
            case 'a':
                for (int intentos = 0; intentos < 3; intentos++) {
                    System.out.println("Radio: ");
                    radio = lector.nextDouble();
                    System.out.println("Altura: ");
                    altura = lector.nextDouble();
                    System.out.println("Radio Mayor: ");
                    radioMayor = lector.nextDouble();
                    System.out.println("Generatriz: ");
                    generatriz = lector.nextDouble();

                    if (radio > 0 && altura > 0 && radioMayor > 0 && generatriz > 0) {
                        areaLateral = (Math.PI * generatriz) * (radioMayor + radio);
                        break;
                    } else {
                        System.out.println("No se permiten negativos ni cero");
                    }
                }

                if (radio > 0 && altura > 0 && radioMayor > 0 && generatriz > 0) {
                    System.out.println("Área Lateral: " + areaLateral);
                } else {
                    System.out.println("Intentos gastados. Programa terminado.");
                }
                break;

            case 'b':
                for (int intentos = 0; intentos < 3; intentos++) {
                    System.out.println("Radio: ");
                    radio = lector.nextDouble();
                    System.out.println("Altura: ");
                    altura = lector.nextDouble();
                    System.out.println("Radio Mayor: ");
                    radioMayor = lector.nextDouble();
                    System.out.println("Generatriz: ");
                    generatriz = lector.nextDouble();

                    if (radio > 0 && altura > 0 && radioMayor > 0 && generatriz > 0) {
                        areaLateral = (Math.PI * generatriz) * (radioMayor + radio);
                        areaBaseMayor = Math.PI * Math.pow(radioMayor, 2);
                        areaBaseMenor = Math.PI * Math.pow(radio, 2);
                        areaTotal = areaLateral + areaBaseMayor + areaBaseMenor;
                        break;
                    } else {
                        System.out.println("No se permiten negativos ni cero");
                    }
                }

                if (radio > 0 && altura > 0 && radioMayor > 0 && generatriz > 0) {
                    System.out.println("Área Total: " + areaTotal);
                } else {
                    System.out.println("Intentos gastados. Programa terminado.");
                }
                break;

            case 'c':
                for (int intentos = 0; intentos < 3; intentos++) {
                    System.out.println("Radio: ");
                    radio = lector.nextDouble();
                    System.out.println("Altura: ");
                    altura = lector.nextDouble();
                    System.out.println("Radio Mayor: ");
                    radioMayor = lector.nextDouble();
                    System.out.println("Generatriz: ");
                    generatriz = lector.nextDouble();

                    if (radio > 0 && altura > 0 && radioMayor > 0 && generatriz > 0) {
                        areaLateral = (Math.PI * generatriz) * (radioMayor + radio);
                        areaBaseMayor = Math.PI * Math.pow(radioMayor, 2);
                        areaBaseMenor = Math.PI * Math.pow(radio, 2);
                        areaTotal = areaLateral + areaBaseMayor + areaBaseMenor;
                        Pixal = (Math.PI * altura);
                        radiosCuadrados = (Math.pow(radioMayor, 2) + Math.pow(radio, 2));
                        radxrad = radioMayor * radio;
                        volumen = Pixal * (radiosCuadrados + radxrad);
                        totalVol = volumen / 3;
                        break;
                    } else {
                        System.out.println("No se permiten negativos ni cero");
                    }
                }

                if (radio > 0 && altura > 0 && radioMayor > 0 && generatriz > 0) {
                    System.out.println("Volumen: " + volumen);
                    System.out.println("Total Volumen: " + totalVol);
                } else {
                    System.out.println("Intentos gastados. Programa terminado.");
                }
                break;

            default:
                System.out.println("Ingrese una opción válida");
        }
    }

    public static void calculoTroncoPiramide() {
        Scanner lector = new Scanner(System.in);
        char calculo;

        double lado1 = 0, lado2 = 0, apotema = 0, altura = 0;
        double perimetroBaseMayor, perimetroBaseMenor;
        double areaLateral = 0, areaBaseMayor = 0, areaBaseMenor = 0, areaTotal = 0, volumen = 0;

        System.out.println("¿Qué parte del tronco de pirámide desea calcular?");
        System.out.println("a) Área Lateral");
        System.out.println("b) Área Total");
        System.out.println("c) Volumen");
        calculo = lector.next().charAt(0);

        switch (calculo) {
            case 'a':
                for (int intentos = 0; intentos < 3; intentos++) {
                    System.out.println("Lado 1: ");
                    lado1 = lector.nextDouble();
                    System.out.println("Lado 2: ");
                    lado2 = lector.nextDouble();
                    System.out.println("Apotema: ");
                    apotema = lector.nextDouble();
                    System.out.println("Altura: ");
                    altura = lector.nextDouble();

                    if (lado1 > 0 && altura > 0 && lado2 > 0 && apotema > 0) {
                        perimetroBaseMayor = lado1 * 4;
                        perimetroBaseMenor = lado2 * 4;
                        areaLateral = (perimetroBaseMayor + perimetroBaseMenor) * apotema / 2;
                        break;
                    } else {
                        System.out.println("No se permiten negativos ni cero");
                    }
                }

                if (lado1 > 0 && altura > 0 && lado2 > 0 && apotema > 0) {
                    System.out.println("Área Lateral: " + areaLateral);
                } else {
                    System.out.println("Intentos gastados. Programa terminado.");
                }
                break;

            case 'b':
                for (int intentos = 0; intentos < 3; intentos++) {
                    System.out.println("Lado 1: ");
                    lado1 = lector.nextDouble();
                    System.out.println("Lado 2: ");
                    lado2 = lector.nextDouble();
                    System.out.println("Apotema: ");
                    apotema = lector.nextDouble();
                    System.out.println("Altura: ");
                    altura = lector.nextDouble();

                    if (lado1 > 0 && altura > 0 && lado2 > 0 && apotema > 0) {
                        perimetroBaseMayor = lado1 * 4;
                        perimetroBaseMenor = lado2 * 4;
                        areaLateral = (perimetroBaseMayor + perimetroBaseMenor) * apotema / 2;
                        areaBaseMayor = lado1 * lado1;
                        areaBaseMenor = lado2 * lado2;
                        areaTotal = areaLateral + areaBaseMayor + areaBaseMenor;
                        break;
                    } else {
                        System.out.println("No se permiten negativos ni cero");
                    }
                }

                if (lado1 > 0 && altura > 0 && lado2 > 0 && apotema > 0) {
                    System.out.println("Área Total: " + areaTotal);
                } else {
                    System.out.println("Intentos gastados. Programa terminado.");
                }
                break;

            case 'c':
                for (int intentos = 0; intentos < 3; intentos++) {
                    System.out.println("Lado 1: ");
                    lado1 = lector.nextDouble();
                    System.out.println("Lado 2: ");
                    lado2 = lector.nextDouble();
                    System.out.println("Apotema: ");
                    apotema = lector.nextDouble();
                    System.out.println("Altura: ");
                    altura = lector.nextDouble();

                    if (lado1 > 0 && altura > 0 && lado2 > 0 && apotema > 0) {
                        perimetroBaseMayor = lado1 * 4;
                        perimetroBaseMenor = lado2 * 4;
                        areaLateral = (perimetroBaseMayor + perimetroBaseMenor) * apotema / 2;
                        areaBaseMayor = lado1 * lado1;
                        areaBaseMenor = lado2 * lado2;
                        areaTotal = areaLateral + areaBaseMayor + areaBaseMenor;
                        volumen = (areaBaseMayor + areaBaseMenor) + (lado1 * lado2) * altura / 3;
                        break;
                    } else {
                        System.out.println("No se permiten negativos ni cero");
                    }
                }

                if (lado1 > 0 && altura > 0 && lado2 > 0 && apotema > 0) {
                    System.out.println("Volumen: " + volumen);
                } else {
                    System.out.println("Intentos gastados. Programa terminado.");
                }
                break;

            default:
                System.out.println("Ingrese una opción válida");
        }
    }
}
