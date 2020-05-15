package lab.pkg3_felipelinjarodzuniga;

import java.util.ArrayList;
import java.util.Scanner;

public class Lab3_FelipeLinJarodZuniga {
//Meter color a letra

    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";
    //Colores de fondo
    public static final String ANSI_BLACK_BACKGROUND = "\u001B[40m";
    public static final String ANSI_RED_BACKGROUND = "\u001B[41m";
    public static final String ANSI_GREEN_BACKGROUND = "\u001B[42m";
    public static final String ANSI_YELLOW_BACKGROUND = "\u001B[43m";
    public static final String ANSI_BLUE_BACKGROUND = "\u001B[44m";
    public static final String ANSI_PURPLE_BACKGROUND = "\u001B[45m";
    public static final String ANSI_CYAN_BACKGROUND = "\u001B[46m";
    public static final String ANSI_WHITE_BACKGROUND = "\u001B[47m";

    public static void main(String[] args) {
        ArrayList<Productos> ropa = new ArrayList();
        ArrayList<Productos> comida = new ArrayList();
        ArrayList<Productos> Juguetes = new ArrayList();
        ArrayList<Locales> tienda = new ArrayList();
        ArrayList<Locales> bar = new ArrayList();
        ArrayList<Locales> quiosco = new ArrayList();
        ArrayList<Personas> Empleado = new ArrayList();
        Scanner sc = new Scanner(System.in);
        String master = "SUDO", contra = "54321";
        ArrayList user = new ArrayList();
        ArrayList pas = new ArrayList();
        System.out.println(ANSI_PURPLE_BACKGROUND + ANSI_WHITE + "Adminstrador: '" + master + "' Contraseña: '" + contra + "'");
        System.out.println(ANSI_CYAN_BACKGROUND + ANSI_PURPLE + "Bienvenido a nuestro sistema centro comercial");
        System.out.println("");
        int p = 0;
        while (p == 0) {
            System.out.println(ANSI_GREEN_BACKGROUND + ANSI_BLACK + "------------------------*Menu*------------------------");
            System.out.println(ANSI_BLUE + "1. Log in");
            System.out.println(ANSI_BLUE + "2. Sign in");
            System.out.println(ANSI_BLUE + "3. exit");
            System.out.println(ANSI_GREEN_BACKGROUND + ANSI_BLACK + "------------------------------------------------------");
            System.out.println("Ingrese la opcion deseada");
            int op = sc.nextInt();
            switch (op) {
                case 1:
                    int c = 0;
                    while (c == 0) {
                        System.out.println(ANSI_CYAN + ANSI_WHITE_BACKGROUND + "Ingrese su usuario");
                        String us = sc.next();
                        System.out.println(ANSI_CYAN + ANSI_WHITE_BACKGROUND + "Ingresse su contraseña");
                        String cn = sc.next();
                        if (us.equals(master) && cn.equals(contra)) {
                            System.out.println(ANSI_GREEN + "Bienvenido Administrador" + master);
                            System.out.println(ANSI_GREEN + "1. Crear " + ANSI_GREEN + "\n2. Modificar " + ANSI_GREEN + "\n3. Eliminar: " + ANSI_GREEN + "\n4. Exit" + ANSI_GREEN);
                            int submenuadmi = sc.nextInt();
                            while (submenuadmi != 4) {
                                switch (submenuadmi) {
                                    case 1: {
                                        System.out.println(ANSI_GREEN + "1. Crear Locales" + ANSI_GREEN + "\n2. Crear Productos " + ANSI_GREEN + "\n3. Crear Empleados: " + ANSI_GREEN);
                                        int crear = sc.nextInt();
                                        switch (crear) {
                                            case 1: {
                                                System.out.println(ANSI_GREEN + "1. Crear Tienda" + ANSI_GREEN + "\n2. Crear Quisco" + ANSI_GREEN + "\n3. Crear Bares: " + ANSI_GREEN);
                                                int locales = sc.nextInt();
                                                switch (locales) {
                                                    case 1: {

                                                        break;
                                                    }
                                                    default:
                                                        System.out.println("No existe otra opcion!");
                                                }
                                                break;
                                            }
                                            case 3: {

                                                System.out.println("Ingrese su ID: ");
                                                sc.nextLine();
                                                String id = sc.nextLine();
                                                System.out.println("Ingrese su usuario: ");
                                                String username = sc.nextLine();
                                                System.out.println("Ingrese su contraseña: ");
                                                String contra1 = sc.nextLine();
                                                System.out.println("Ingrese su correo electronico: ");
                                                String correo = sc.nextLine();
                                                System.out.println("Ingrese su nombre completo: ");
                                                String nombreC = sc.nextLine();
                                                System.out.println("Ingrese su fecha de nacimiento(DD/MM/YYYY): ");
                                                String fecha = sc.nextLine();
                                                System.out.println("Ingrese su horario de trabajo: ");
                                                String horario = sc.nextLine();

                                                Empleado.add(new Empleados(horario, 0, id, username, contra1, correo, nombreC, fecha));

                                                break;
                                            }
                                            case 2: {
                                                System.out.println(ANSI_GREEN + "1. Crear Ropa" + ANSI_GREEN + "\n2. Crear Juguetes" + ANSI_GREEN + "\n3. Crear Comida: " + ANSI_GREEN);
                                                int menucomida = sc.nextInt();

                                                switch (menucomida) {
                                                    case 1: {
                                                        System.out.println("El nombre de la ropa: ");
                                                        sc.nextLine();
                                                        String nom1 = sc.nextLine();
                                                        System.out.println("La descripcion de la ropa: ");
                                                        String descrip1 = sc.nextLine();
                                                        System.out.println("El precio de la ropa");
                                                        int precio1 = sc.nextInt();
                                                        System.out.println("Ingrese el genero de la ropa");
                                                        sc.nextLine();
                                                        String genero = sc.nextLine();
                                                        System.out.println("Ingrese la talla de la ropa");
                                                        String talla = sc.nextLine();

                                                        ropa.add(new Ropa(genero, talla, descrip1, nom1, precio1));
                                                        break;
                                                    }
                                                    case 2: {
                                                        System.out.println("El nombre del juguete: ");
                                                        sc.nextLine();
                                                        String nom2 = sc.nextLine();
                                                        System.out.println("La descripcion del producto: ");
                                                        String descrip2 = sc.nextLine();
                                                        System.out.println("La descripcion del Juguete: ");
                                                        String descrip22 = sc.nextLine();
                                                        System.out.println("El precio del juguete");
                                                        int precio2 = sc.nextInt();

                                                        Juguetes.add(new Juguetes(descrip22, descrip2, nom2, precio2));
                                                        break;
                                                    }
                                                    case 3: {
                                                        System.out.println("El nombre de la comida: ");
                                                        sc.nextLine();
                                                        String nom3 = sc.nextLine();
                                                        System.out.println("La descripcion de la comida: ");
                                                        String descrip3 = sc.nextLine();
                                                        System.out.println("El precio de la comida: ");
                                                        int precio3 = sc.nextInt();
                                                        System.out.println("Ingrese 1. Comida 2. Bebida");
                                                        sc.nextLine();
                                                        String tipo = sc.nextLine();
                                                        System.out.println("Fecha de caducidad");
                                                        String fecha_venci = sc.nextLine();

                                                        comida.add(new Comida(tipo, fecha_venci, descrip3, nom3, precio3));

                                                        break;
                                                    }
                                                    default:
                                                        System.out.println("No existe esa opcion!");
                                                        break;
                                                }

                                                break;
                                            }
                                            default:
                                                System.out.println("No existe esa opcion!");
                                        }
                                        break;
                                    }
                                    case 4: {
                                        System.exit(0);
                                        break;
                                    }
                                    default:
                                        System.out.println("No existe esa opcion");
                                }
                                System.out.println(ANSI_GREEN + "Bienvenido Administrador" + master);
                                System.out.println(ANSI_GREEN + "1. Crear " + ANSI_GREEN + "\n2. Modificar " + ANSI_GREEN + "\n3. Eliminar: " + ANSI_GREEN + "\n4. Exit" + ANSI_GREEN);
                                submenuadmi = sc.nextInt();
                            }
                            c = 1;
                        } else if (user.size() >= 0) {
                            for (int i = 0; i <= user.size(); i++) {
                                if (user.get(i).equals(us)) {
                                    if (pas.get(i).equals(cn)) {
                                        System.out.println(ANSI_GREEN + "Bienvenido gran clente  " + us);
                                        c = 1;
                                        break;
                                    } else {
                                        System.out.println(ANSI_RED + "Contraseña Incorrecta");
                                        c = 0;
                                    }
                                } else {
                                    System.out.println(ANSI_RED + "Usuario no existe");
                                    c = 0;
                                }
                            }

                        } else {
                            System.out.println(ANSI_RED + "Aun no se ha creado ningun usuario");
                            c = 1;
                        }
                    }
                    break;
                case 2:
                    System.out.println("Ingrese su nombre de usuario");
                    String nuvusu = sc.next();
                    System.out.println("Ingrese su cntraseña");
                    String nupas = sc.next();
                    System.out.print("Procesando../");
                    System.out.print("../");
                    System.out.print("../");
                    System.out.print("../");
                    System.out.println("");
                    user.add(nuvusu);
                    pas.add(nupas);
                    System.out.println("");
                    System.out.println(ANSI_GREEN + "Agregado correctamente");
                    System.out.println("");
                    break;
                case 3:
                    System.out.println(ANSI_RED + "Gracias por elegirnos");
                    p = 1;
                    break;
                default:
                    System.out.println(ANSI_RED + "Error");
            }
        }

    }

}
