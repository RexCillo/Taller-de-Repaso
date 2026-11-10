import java.util.Scanner;

public class Taller {

    public static void puntoUno() {
        String textoUno = "Hello";
        String textoDos = "World";

        String resultado = textoUno + " " + textoDos;
        System.out.println(resultado);
    }

    public static void puntoDos() {
        String palabraUno = "Hello ";
        String nombre = "Elphin";

        System.out.print(palabraUno);
        System.out.println(nombre);
    }

    public static void puntoTres() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese un número para calcular su cuadrado:");
        int numero = scanner.nextInt();
        int cuadrado = numero * numero;

        System.out.println("El cuadrado de [" + numero + "] es [" + cuadrado + "].");
    }

    public static void puntoCuatro() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el primer valor a sumar:");
        int primerValor = scanner.nextInt();
        System.out.println("Ingrese el segundo valor a sumar:");
        int segundoValor = scanner.nextInt();
        int suma = primerValor + segundoValor;
        System.out.println("La suma de [" + primerValor + "] y [" + segundoValor + "] es igual a [" + suma + "].");
    }

    public static void puntoCinco() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el primer valor a operar:");
        double valorUno = scanner.nextDouble();
        System.out.println("Ingrese el segundo valor a operar:");
        double valorDos = scanner.nextDouble();

        double suma = valorUno + valorDos;
        double resta = valorUno - valorDos;
        double producto = valorUno * valorDos;
        double division = valorUno / valorDos;
        double residuo = valorUno % valorDos;

        System.out.println("La suma de [" + valorUno + "] y [" + valorDos + "] es igual a [" + suma + "].");
        System.out.println("La resta de [" + valorUno + "] y [" + valorDos + "] es igual a [" + resta + "].");
        System.out.println("El producto de [" + valorUno + "] y [" + valorDos + "] es igual a [" + producto + "].");
        System.out.println("La división de [" + valorUno + "] entre [" + valorDos + "] es igual a [" + division + "].");
        System.out.println("El residuo de dicha división es de [" + residuo + "].");
    }

    public static void puntoSeis() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite un valor decimal:");
        double numeroDecimal = scanner.nextDouble();

        int parteEntera = (int) numeroDecimal;
        double parteDecimal = numeroDecimal - parteEntera;

        System.out.println("La parte entera del número escrito es [" + parteEntera + "].");
        System.out.printf("La parte decimal del número escrito es [%.2f]\n", parteDecimal);
    }

    public static double calcularPromedio(double n1, double n2, double n3, double n4, double n5) {
        return (n1 * 0.15) + (n2 * 0.20) + (n3 * 0.15) + (n4 * 0.30) + (n5 * 0.20);
    }

    public static void puntoSiete() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("--- CÁLCULO DE PROMEDIO ACADÉMICO ---");
        System.out.println("Ingrese la primera nota:");
        double nota1 = scanner.nextDouble();
        System.out.println("Ingrese la segunda nota:");
        double nota2 = scanner.nextDouble();
        System.out.println("Ingrese la tercera nota:");
        double nota3 = scanner.nextDouble();
        System.out.println("Ingrese la cuarta nota:");
        double nota4 = scanner.nextDouble();
        System.out.println("Ingrese la quinta nota:");
        double nota5 = scanner.nextDouble();

        double resultadoPromedio = calcularPromedio(nota1, nota2, nota3, nota4, nota5);
        System.out.printf("Su promedio final es de [%.2f]\n", resultadoPromedio);
    }

    public static double calcularIVA(double precioBase) {
        double iva = precioBase * 0.19;
        return precioBase + iva;
    }

    public static void puntoOcho() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el precio de su producto:");
        double precioBase = scanner.nextDouble();
        double precioConIva = calcularIVA(precioBase);
        System.out.println("El precio neto es de [$" + precioBase + "].");
        System.out.println("El valor del IVA es de [$" + (precioBase * 0.19) + "].");
        System.out.println("El precio total a pagar es de [$" + precioConIva + "].");
    }

    public static void puntoNueve() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite el radio del círculo (cm):");
        double radio = scanner.nextDouble();

        double areaCirculo = 3.1416 * (radio * radio);
        double perimetroCirculo = 2 * 3.1416 * radio;

        System.out.println("El área del círculo con un radio de [" + radio + " cm] es de [" + areaCirculo + " cm^2].");
        System.out.println("El perímetro del círculo con un radio de [" + radio + " cm] es de [" + perimetroCirculo + " cm].");
    }

    public static void puntoDiez() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("¿Cuánto miden los lados de su hexágono en [cm]?");
        double lado = scanner.nextDouble();
        double perimetroHexagono = lado * 6;
        System.out.println("¿Cuánto mide la apotema de su hexágono en [cm]?");
        double apotemaHexagono = scanner.nextDouble();

        double areaHexagono = (perimetroHexagono * apotemaHexagono) / 2;
        System.out.println("Con un perímetro de [" + perimetroHexagono + " cm] y una apotema de [" + apotemaHexagono + " cm], el área de su hexágono es de [" + areaHexagono + " cm^2].");
    }

    public static void puntoOnce() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("¿Cuántos valores desea ingresar en total?");
        double cantidadValores = scanner.nextDouble();

        while (cantidadValores == 0) {
            System.out.println("El número de valores debe ser mayor a cero.");
            System.out.println("¿Cuántos valores desea ingresar en total?");
            cantidadValores = scanner.nextDouble();
        }

        double acumuladorValores = 0;

        for (int i = 1; i <= cantidadValores; i++) {
            System.out.println("Ingrese el valor " + i + ":");
            double valorActual = scanner.nextDouble();
            acumuladorValores += valorActual;
        }

        double promedioValores = acumuladorValores / cantidadValores;
        System.out.println("El promedio de los valores ingresados es de [" + promedioValores + "].");
    }

    public static void puntoDoce() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite la primera coordenada X:");
        double x1 = scanner.nextDouble();
        System.out.println("Digite la primera coordenada Y:");
        double y1 = scanner.nextDouble();
        System.out.println("Digite la segunda coordenada X:");
        double x2 = scanner.nextDouble();
        System.out.println("Digite la segunda coordenada Y:");
        double y2 = scanner.nextDouble();

        double distanciaX = Math.abs(x1 - x2);
        double distanciaY = Math.abs(y1 - y2);

        System.out.println("La distancia entre los puntos (" + x1 + ", " + y1 + ") y (" + x2 + ", " + y2 + ") es de (" + distanciaX + ", " + distanciaY + ").");
    }

    public static void puntoTrece() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite el número deseado:");
        int numeroBase = scanner.nextInt();

        String numeroStr = String.valueOf(numeroBase);
        String numeroDobleStr = numeroStr + numeroStr;
        String numeroTripleStr = numeroStr + numeroStr + numeroStr;

        System.out.println("Los valores generados son [" + numeroStr + "], [" + numeroDobleStr + "] y [" + numeroTripleStr + "].");
        int numeroDobleInt = Integer.parseInt(numeroDobleStr);
        int numeroTripleInt = Integer.parseInt(numeroTripleStr);
        int sumaAcumulada = numeroBase + numeroDobleInt + numeroTripleInt;
        System.out.println("La suma de los valores generados es de [" + sumaAcumulada + "].");
    }

    public static void puntoCatorce() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la cantidad total de segundos a convertir:");
        int segundosTotales = scanner.nextInt();

        int horas = segundosTotales / 3600;
        int minutos = (segundosTotales % 3600) / 60;
        int segundos = (segundosTotales % 3600) % 60;

        System.out.println("La hora equivalente es: [" + horas + ":" + minutos + ":" + segundos + "].");
    }

    public static void puntoQuince() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese un valor para determinar si es par o impar:");
        double valor = scanner.nextDouble();

        if (valor % 2 == 0) {
            System.out.println("El valor [" + valor + "] es par.");
        } else {
            System.out.println("El valor [" + valor + "] es impar.");
        }
    }

    public static void puntoDieciseis() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese cualquier valor numérico:");
        double numero = scanner.nextDouble();

        if (numero >= 0) {
            System.out.println("El valor [" + numero + "] es positivo.");
        } else {
            System.out.println("El valor [" + numero + "] es negativo.");
        }
    }

    public static void puntoDiecisiete() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el precio del producto:");
        double precio = scanner.nextDouble();
        double ivaPrecio = precio * 0.19;

        if (precio > 150000) {
            System.out.println("El producto aplica para un descuento del 5%.");
            double descuento = precio * 0.05;
            double precioConDescuento = precio - descuento;
            double precioFinal = calcularIVA(precioConDescuento);

            System.out.println("Precio original: [$" + precio + "].");
            System.out.println("Precio con descuento: [$" + precioConDescuento + "].");
            System.out.println("IVA aplicado: [$" + ivaPrecio + "].");
            System.out.println("Precio final con IVA: [$" + precioFinal + "].");
        } else {
            System.out.println("El producto no aplica para descuento.");
            double precioFinal = calcularIVA(precio);

            System.out.println("Precio original: [$" + precio + "].");
            System.out.println("IVA aplicado: [$" + ivaPrecio + "].");
            System.out.println("Precio final con IVA: [$" + precioFinal + "].");
        }
    }

    public static void puntoDieciocho() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite la primera nota:");
        double nota1 = scanner.nextDouble();
        System.out.println("Digite la segunda nota:");
        double nota2 = scanner.nextDouble();
        System.out.println("Digite la tercera nota:");
        double nota3 = scanner.nextDouble();
        System.out.println("Digite la cuarta nota:");
        double nota4 = scanner.nextDouble();
        System.out.println("Digite la quinta nota:");
        double nota5 = scanner.nextDouble();

        double promedioFinal = calcularPromedio(nota1, nota2, nota3, nota4, nota5);

        if (promedioFinal < 2.0) {
            System.out.printf("Su promedio fue de [%.2f], menor a 2.0. No podrá realizar la habilitación.\n", promedioFinal);
        } else if (promedioFinal < 3.0) {
            System.out.printf("Su promedio fue de [%.2f], menor a 3.0. Ha reprobado la asignatura.\n", promedioFinal);
        } else if (promedioFinal >= 3.0 && promedioFinal < 4.5) {
            System.out.printf("Su promedio fue de [%.2f]. Ha aprobado la asignatura.\n", promedioFinal);
        } else {
            System.out.printf("Su promedio fue de [%.2f]. ¡Excelente desempeño académico!\n", promedioFinal);
        }
    }

    public static void calcularCuadratica(double a, double b, double c) {
        if (a == 0) {
            System.out.println("El coeficiente 'a' debe ser diferente de cero.");
            return;
        }

        double discriminante = (b * b) - (4 * a * c);

        if (discriminante > 0) {
            double solucionUno = (-b + Math.sqrt(discriminante)) / (2 * a);
            double solucionDos = (-b - Math.sqrt(discriminante)) / (2 * a);

            System.out.println("La ecuación tiene dos soluciones reales:");
            System.out.println("Solución 1: [" + solucionUno + "].");
            System.out.println("Solución 2: [" + solucionDos + "].");
        } else if (discriminante == 0) {
            double solucionUnica = (-b / (2 * a));

            System.out.println("La ecuación tiene una única solución:");
            System.out.println("Solución: [" + solucionUnica + "].");
        } else {
            System.out.println("La ecuación no posee soluciones dentro de los números reales.");
        }
    }

    public static void puntoDiecinueve() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite el valor de a:");
        double coeficienteA = scanner.nextDouble();
        System.out.println("Digite el valor de b:");
        double coeficienteB = scanner.nextDouble();
        System.out.println("Digite el valor de c:");
        double coeficienteC = scanner.nextDouble();

        System.out.println("Resolviendo la ecuación cuadrática [" + coeficienteA + "x^2 + (" + coeficienteB + ")x + " + coeficienteC + "].");
        calcularCuadratica(coeficienteA, coeficienteB, coeficienteC);
    }

    public static void puntoVeinte() {
        Scanner scanner = new Scanner(System.in);

        String usuarioSistema = "carlos";
        int contrasenaSistema = 1234;

        System.out.println("Ingrese el nombre de usuario:");
        String usuarioIngresado = scanner.next();

        System.out.println("Ingrese la contraseña:");
        int contrasenaIngresada = scanner.nextInt();

        if (usuarioIngresado.equals(usuarioSistema) && contrasenaIngresada == contrasenaSistema) {
            System.out.println("Autenticación exitosa. ¡Bienvenido al sistema!");
        } else {
            System.out.println("Acceso denegado. Credenciales incorrectas.");
        }
    }

    public static void puntoVeintiuno() {
        Scanner scanner = new Scanner(System.in);

        String[] nombresNumeros = {
                "CERO", "UNO", "DOS", "TRES", "CUATRO", "CINCO", "SEIS", "SIETE", "OCHO", "NUEVE", "DIEZ"
        };
        System.out.println("Escriba un número entero entre el 0 y el 10:");
        int numeroIngresado = scanner.nextInt();

        if (numeroIngresado >= 0 && numeroIngresado <= 10) {
            System.out.println("[" + numeroIngresado + "] ---> [" + nombresNumeros[numeroIngresado] + "].");
        } else {
            System.out.println("Error: Debe ingresar un número en el rango de 0 a 10.");
        }
    }

    public static void puntoVeintidos() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un número entero para conocer su cantidad de dígitos:");
        int numero = scanner.nextInt();

        if (numero > 100000) {
            System.out.println("Solo se permiten valores inferiores o iguales a 100,000.");
        } else {
            String numeroStr = String.valueOf(numero);
            int cantidadDigitos = numeroStr.length();

            System.out.println("El número [" + numero + "] tiene [" + cantidadDigitos + "] dígitos.");
        }
    }

    public static void puntoVeintitres() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el primer valor:");
        int valor1 = scanner.nextInt();
        System.out.println("Ingrese el segundo valor:");
        int valor2 = scanner.nextInt();
        System.out.println("Ingrese el tercer valor:");
        int valor3 = scanner.nextInt();

        if (valor1 < valor2 && valor2 < valor3) {
            System.out.println("[" + valor1 + "], [" + valor2 + "], [" + valor3 + "] ---> Los valores se encuentran en orden ascendente.");
        } else if (valor1 > valor2 && valor2 > valor3) {
            System.out.println("[" + valor1 + "], [" + valor2 + "], [" + valor3 + "] ---> Los valores se encuentran en orden descendente.");
        } else {
            System.out.println("[" + valor1 + "], [" + valor2 + "], [" + valor3 + "] ---> Los valores no siguen un patrón estrictamente ascendente ni descendente.");
        }
    }

    public static void puntoVeinticuatro() {
        Scanner scanner = new Scanner(System.in);

        String[] diasSemana = {
                " ", "LUNES", "MARTES", "MIÉRCOLES", "JUEVES", "VIERNES", "SÁBADO", "DOMINGO"
        };

        System.out.println("Ingrese un valor numérico entre 1 y 7:");
        int diaIngresado = scanner.nextInt();

        if (diaIngresado < 1 || diaIngresado > 7) {
            System.out.println("Error: El número debe estar comprendido entre 1 y 7.");
        } else {
            System.out.println("El número [" + diaIngresado + "] corresponde al día [" + diasSemana[diaIngresado] + "].");
        }
    }

    public static String invertirTexto(String textoOriginal) {
        StringBuilder sb = new StringBuilder(textoOriginal);
        return sb.reverse().toString();
    }

    public static void puntoVeinticinco() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese un texto:");
        String texto = scanner.nextLine();

        String textoInvertido = invertirTexto(texto);
        System.out.println("Texto original: " + texto);
        System.out.println("Texto invertido: " + textoInvertido);
    }

    public static void puntoVeintiseis() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese un texto en minúsculas:");
        String textoMinusculas = scanner.nextLine();

        String[] palabras = textoMinusculas.split(" ");
        StringBuilder resultado = new StringBuilder();

        for (int i = 0; i < palabras.length; i++) {
            String palabra = palabras[i];

            if (!palabra.isEmpty()) {
                String inicialMayuscula = palabra.substring(0, 1).toUpperCase();
                String restoPalabra = palabra.substring(1);
                resultado.append(inicialMayuscula).append(restoPalabra).append(" ");
            }
        }
        System.out.println("Texto original: [" + textoMinusculas + "].");
        System.out.println("Texto con iniciales en mayúscula: [" + resultado.toString().trim() + "].");
    }

    public static void puntoVeintisiete() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese una oración:");
        String oracion = scanner.nextLine();

        String[] palabrasOracion = oracion.trim().split(" ");

        if (palabrasOracion.length >= 2) {
            String penultimaPalabra = palabrasOracion[palabrasOracion.length - 2];
            System.out.println("La penúltima palabra de la oración es [" + penultimaPalabra + "].");
        } else {
            System.out.println("El texto ingresado es demasiado corto para extraer la penúltima palabra.");
        }
    }

    public static void puntoVeintiocho() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el primer texto:");
        String textoUno = scanner.nextLine();
        System.out.println("Ingrese el segundo texto:");
        String textoDos = scanner.nextLine();

        if (textoDos.contains(textoUno)) {
            System.out.println("El segundo texto contiene al primer texto.");
        } else {
            System.out.println("El segundo texto no contiene al primer texto.");
        }
    }

    public static boolean esPalindromo(String palabra) {
        String palabraLimpia = palabra.trim().toLowerCase();
        String palabraInvertida = new StringBuilder(palabraLimpia).reverse().toString();
        return palabraLimpia.equals(palabraInvertida);
    }

    public static void puntoVeintinueve() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese una palabra para verificar si es palíndromo:");
        String palabra = scanner.next();
        boolean resultadoPalindromo = esPalindromo(palabra);

        System.out.println("¿La palabra [" + palabra + "] es palíndromo?");
        System.out.println("Resultado: [" + resultadoPalindromo + "].");
    }

    public static double areaPoligonoRegular(int lados, double largo, double apotema) {
        double perimetro = lados * largo;
        double area = (perimetro * apotema) / 2;
        return area;
    }

    public static void puntoTreinta() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("¿Cuántos lados tiene su polígono?");
        int lados = scanner.nextInt();
        System.out.println("¿Cuánto mide cada lado de su polígono en [cm]?");
        double longitudLado = scanner.nextDouble();
        System.out.println("¿Cuánto mide la apotema de su polígono en [cm]?");
        double apotema = scanner.nextDouble();

        double areaPoligono = areaPoligonoRegular(lados, longitudLado, apotema);
        System.out.printf("El área de su polígono regular es de [%.2f cm^2].\n", areaPoligono);
    }

    public static void puntoTreintayuno() {
        System.out.println("Números naturales del 1 al 10:");
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
    }

    public static void puntoTreintaydos() {
        System.out.println("Números impares menores a 10:");
        for (int i = 1; i < 10; i += 2) {
            System.out.println(i);
        }
    }

    public static void puntoTreintaytres() {
        System.out.println("Números pares del 1 al 10:");
        for (int i = 2; i <= 10; i += 2) {
            System.out.println(i);
        }
    }

    public static void puntoTreintaycuatro() {
        Scanner scanner = new Scanner(System.in);
        int numeroPositivo;

        do {
            System.out.println("Ingrese un número positivo:");
            numeroPositivo = scanner.nextInt();

            if (numeroPositivo <= 0) {
                System.out.println("Valor no permitido. Debe ingresar únicamente números positivos.");
            }
        } while (numeroPositivo <= 0);

        System.out.println("Validación exitosa. El valor ingresado fue [" + numeroPositivo + "].");
    }

    public static void puntoTreintaycinco() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite un valor entero decimal:");
        int numeroDecimal = scanner.nextInt();
        int original = numeroDecimal;

        if (numeroDecimal == 0) {
            System.out.println("El número decimal 0 en binario es: [0].");
            return;
        }

        StringBuilder binario = new StringBuilder();

        while (numeroDecimal > 0) {
            int residuo = numeroDecimal % 2;
            binario.append(residuo);
            numeroDecimal = numeroDecimal / 2;
        }

        binario.reverse();
        System.out.println("El número decimal [" + original + "] en binario es: [" + binario.toString() + "].");
    }

    public static void puntoTreintayseis() {
        Scanner scanner = new Scanner(System.in);

        int decimal = 0;
        int potencia = 0;

        System.out.println("Ingrese un valor binario:");
        String binarioStr = scanner.next();

        for (int i = binarioStr.length() - 1; i >= 0; i--) {
            char caracter = binarioStr.charAt(i);

            if (caracter == '1') {
                decimal += (int) Math.pow(2, potencia);
            }
            potencia++;
        }
        System.out.println("El valor binario [" + binarioStr + "] en decimal es: [" + decimal + "].");
    }

    public static void puntoTreintaysiete() {
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void puntoTreintayocho() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la altura de la pirámide:");
        int altura = scanner.nextInt();

        for (int i = 1; i <= altura; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("@");
            }
            System.out.println();
        }
    }

    public static void puntoTreintaynueve() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la altura del triángulo invertido:");
        int altura = scanner.nextInt();

        for (int i = altura; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void Goku() {
        Scanner scanner = new Scanner(System.in);
        int contadorBultos = 0;
        double pesoBulto = 0;
        double pesoAcumulado = 0;
        double ingresos = 0;
        int opcion = 0;
        double pesoMaximo = 0;
        double pesoMinimo = Double.MAX_VALUE;

        do {
            System.out.println("   MENÚ DE GESTIÓN   ");
            System.out.println("---------------------");
            System.out.println("[1] -> Registrar bulto");
            System.out.println("[2] -> Consultar total de bultos registrados");
            System.out.println("[3] -> Consultar pesaje total acumulado");
            System.out.println("[4] -> Consultar ingresos totales");
            System.out.println("[0] -> Salir del sistema");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Ingrese el peso del bulto (kg):");
                    pesoBulto = scanner.nextDouble();

                    if (pesoBulto + pesoAcumulado > 18000) {
                        System.out.println("Alerta: Se superaría el límite máximo de carga permitida (18,000 kg). Registro denegado.");
                        break;
                    }

                    if (pesoBulto > pesoMaximo) {
                        pesoMaximo = pesoBulto;
                    }

                    if (pesoBulto < pesoMinimo) {
                        pesoMinimo = pesoBulto;
                    }

                    if (pesoBulto >= 0 && pesoBulto <= 25) {
                        System.out.println("Bulto registrado sin costo adicional.");
                        contadorBultos++;
                        pesoAcumulado += pesoBulto;
                    } else if (pesoBulto >= 26 && pesoBulto <= 300) {
                        System.out.println("Bulto registrado con tarifa de [$1,500] COP.");
                        contadorBultos++;
                        pesoAcumulado += pesoBulto;
                        ingresos += 1500;
                    } else if (pesoBulto >= 301 && pesoBulto <= 500) {
                        System.out.println("Bulto registrado con tarifa de [$2,500] COP.");
                        contadorBultos++;
                        pesoAcumulado += pesoBulto;
                        ingresos += 2500;
                    } else if (pesoBulto > 500) {
                        System.out.println("Error: El peso excede el límite permitido por bulto (500 kg).");
                    }
                    break;

                case 2:
                    System.out.println("\nTotal de bultos registrados: [" + contadorBultos + "].");
                    break;

                case 3:
                    System.out.println("\nPesaje total acumulado: [" + pesoAcumulado + " kg].");
                    break;

                case 4:
                    System.out.println("\nIngresos totales acumulados: [$" + ingresos + "] COP.");
                    break;

                case 0:
                    System.out.println("\nFinalizando el programa...");
                    break;

                default:
                    System.out.println("\nOpción inválida. Intente nuevamente.");
                    break;
            }

        } while (opcion != 0);

        if (contadorBultos > 0) {
            double promedioPeso = pesoAcumulado / contadorBultos;
            double dolares = ingresos / 3000;

            System.out.println(" REPORTE DE RESULTADOS ");
            System.out.println("-----------------------");
            System.out.println("Total de bultos registrados: [" + contadorBultos + "].");
            System.out.println("Mayor peso registrado: [" + pesoMaximo + " kg].");
            System.out.println("Menor peso registrado: [" + pesoMinimo + " kg].");
            System.out.println("Peso promedio de los bultos: [" + promedioPeso + " kg].");
            System.out.println("Ingresos totales en COP: [$" + ingresos + "].");
            System.out.printf("Ingresos totales en USD: [$%.2f].\n", dolares);
        } else {
            System.out.println("\nNo se registraron bultos durante la ejecución del programa.");
        }
    }
}