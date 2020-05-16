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
        int cant_bar = 0;
        int cant_tiendas = 0;
        int cant_quiosco = 0;
        ArrayList Facturacion = new ArrayList();
        ArrayList<Productos> ropa = new ArrayList();
        ArrayList<Productos> comida = new ArrayList();
        ArrayList<Productos> Juguetes = new ArrayList();
        ArrayList<Locales> tienda = new ArrayList();
        ArrayList<Locales> bar = new ArrayList();
        ArrayList<Locales> quiosco = new ArrayList();
        ArrayList<Personas> Empleado = new ArrayList();
        ArrayList<Personas> Clientes = new ArrayList();
        ArrayList co = new ArrayList();
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

                                                        System.out.println(ANSI_GREEN + "Ingrese el nombre de la tienda: ");
                                                        sc.nextLine();
                                                        String nombre = sc.nextLine();
                                                        for (Personas e : Empleado) {
                                                            System.out.println(ANSI_GREEN + "Posicion " + Empleado.indexOf(e) + ": " + e);
                                                        }
                                                        System.out.println(ANSI_GREEN + "Ingrese la posicion del empleado que quiere usted convertir a gerente");
                                                        int posicion1 = sc.nextInt();
                                                        tienda.add(new Tiendas(nombre, (Empleados) Empleado.get(posicion1)));
                                                        tienda.get(cant_tiendas).getListaE().remove(posicion1);

                                                        for (Personas e : Empleado) {
                                                            System.out.println(ANSI_GREEN + "Posicion " + Empleado.indexOf(e) + ": " + e);
                                                        }
                                                        System.out.println(ANSI_GREEN + "Cuantos empleados va agregar");
                                                        int veces1 = sc.nextInt();
                                                        while (veces1 < Empleado.size()) {
                                                            System.out.println(ANSI_GREEN + "No existe esa cantidad de empleados");
                                                            System.out.println(ANSI_GREEN + "Cuantos empleados va agregar");
                                                            veces1 = sc.nextInt();
                                                        }
                                                        for (int i = 0; i < veces1; i++) {
                                                            System.out.println(ANSI_GREEN + "Ingrese la posicion del empleado que va agregar");
                                                            int posicion_empleado = sc.nextInt();

                                                            tienda.get(cant_tiendas).getListaE().add(Empleado.get(posicion_empleado));
                                                            tienda.get(cant_tiendas).getListaE().remove(posicion_empleado);
                                                        }

                                                        System.out.println(ANSI_GREEN + "Que productos va a agregar 1. Ropa 2. Juguetes");
                                                        int opcion_crear_tienda = sc.nextInt();
                                                        switch (opcion_crear_tienda) {
                                                            case 1: {
                                                                for (Productos r : ropa) {
                                                                    System.out.println(ANSI_GREEN + "Posicion " + ropa.indexOf(r) + " :" + r);
                                                                }
                                                                System.out.println(ANSI_GREEN + "Cuantos productos va agregar");
                                                                int veces2 = sc.nextInt();
                                                                System.out.println(ANSI_GREEN + "tamano " + ropa.size());
                                                                while (veces2 < ropa.size()) {
                                                                    System.out.println(ANSI_GREEN + "No puede meter esa cantidad, no hay esa cantidad en el inventario");
                                                                    System.out.println(ANSI_GREEN + "Cuantos productos va agregar");
                                                                    veces2 = sc.nextInt();
                                                                }
                                                                for (int i = 0; i < veces2; i++) {
                                                                    System.out.println(ANSI_GREEN + "Ingrese la posicion del prodcuto que desea agregar");
                                                                    int posicion_ropa = sc.nextInt();

                                                                    tienda.get(cant_tiendas).getListaP().add(ropa.get(posicion_ropa));

                                                                }

                                                                break;
                                                            }

                                                            case 3: {
                                                                for (Productos r : Juguetes) {
                                                                    System.out.println(ANSI_GREEN + "Posicion " + Juguetes.indexOf(r) + " :" + r);
                                                                }
                                                                System.out.println(ANSI_GREEN + "Cuantos productos va agregar");
                                                                int veces2 = sc.nextInt();
                                                                while (veces2 < Juguetes.size()) {
                                                                    System.out.println(ANSI_GREEN + "No puede meter esa cantidad, no hay esa cantidad en el inventario");
                                                                    veces2 = sc.nextInt();
                                                                }
                                                                for (int i = 0; i < veces2; i++) {
                                                                    System.out.println(ANSI_GREEN + "Ingrese la posicion del prodcuto que desea agregar");
                                                                    int posicion_juguetes = sc.nextInt();

                                                                    tienda.get(cant_tiendas).getListaP().add(Juguetes.get(posicion_juguetes));

                                                                }

                                                                break;
                                                            }
                                                            default:
                                                                System.out.println(ANSI_GREEN + "No existe esa opcion");
                                                        }

                                                        cant_tiendas++;

                                                        break;
                                                    }
                                                    case 2: {

                                                        for (Locales l : tienda) {
                                                            System.out.println(ANSI_GREEN + "Posicion " + tienda.indexOf(l) + " : " + l);
                                                        }

                                                        System.out.println(ANSI_GREEN + "Ingrese la posicion de la tienda que quiere convertir en quiosco");
                                                        int posicion_quiosco = sc.nextInt();

                                                        for (Personas e : Empleado) {
                                                            System.out.println(ANSI_GREEN + "Posicion " + Empleado.indexOf(e) + ": " + e);
                                                        }

                                                        System.out.println(ANSI_GREEN + "Ingrese la posicion del empleado que quiere usted convertir a gerente");
                                                        int posicion1 = sc.nextInt();
                                                        quiosco.add(new Quiosco(tienda.get(posicion_quiosco).getNombre(), (Empleados) Empleado.get(posicion1)));
                                                        quiosco.get(cant_quiosco).getListaE().remove(posicion1);

                                                        for (Personas e : Empleado) {
                                                            System.out.println(ANSI_GREEN + "Posicion " + Empleado.indexOf(e) + ": " + e);
                                                        }
                                                        System.out.println(ANSI_GREEN + "Cuantos empleados va agregar");
                                                        int veces1 = sc.nextInt();
                                                        while (veces1 < Empleado.size()) {
                                                            System.out.println(ANSI_GREEN + "No existe esa cantidad de empleados");
                                                            System.out.println(ANSI_GREEN + "Cuantos empleados va agregar");
                                                            veces1 = sc.nextInt();
                                                        }
                                                        for (int i = 0; i < veces1; i++) {
                                                            System.out.println(ANSI_GREEN + "Ingrese la posicion del empleado que va agregar");
                                                            int posicion_empleado = sc.nextInt();

                                                            quiosco.get(cant_quiosco).getListaE().add(Empleado.get(posicion_empleado));
                                                            quiosco.get(cant_quiosco).getListaE().remove(posicion_empleado);
                                                        }

                                                        for (int i = 0; i < tienda.get(posicion_quiosco).getListaP().size(); i++) {
                                                            quiosco.get(cant_quiosco).getListaP().get(i).setPrecio(tienda.get(cant_quiosco).getListaP().get(i).getPrecio() / 0.50);

                                                        }

                                                        break;
                                                    }
                                                    case 3: {

                                                        System.out.println(ANSI_GREEN + "Ingrese el nombre de la tienda: ");
                                                        sc.nextLine();
                                                        String nombre = sc.nextLine();
                                                        for (Personas e : Empleado) {
                                                            System.out.println(ANSI_GREEN + "Posicion " + Empleado.indexOf(e) + ": " + e);
                                                        }
                                                        System.out.println(ANSI_GREEN + "Ingrese la posicion del empleado que quiere usted convertir a gerente");
                                                        int posicion1 = sc.nextInt();
                                                        bar.add(new Tiendas(nombre, (Empleados) Empleado.get(posicion1)));
                                                        bar.get(cant_bar).getListaE().remove(posicion1);

                                                        for (Personas e : Empleado) {
                                                            System.out.println(ANSI_GREEN + "Posicion " + Empleado.indexOf(e) + ": " + e);
                                                        }
                                                        System.out.println(ANSI_GREEN + "Cuantos empleados va agregar");
                                                        int veces1 = sc.nextInt();
                                                        while (veces1 < Empleado.size()) {
                                                            System.out.println(ANSI_GREEN + "No existe esa cantidad de empleados");
                                                            System.out.println(ANSI_GREEN + "Cuantos empleados va agregar");
                                                            veces1 = sc.nextInt();
                                                        }
                                                        for (int i = 0; i < veces1; i++) {
                                                            System.out.println(ANSI_GREEN + "Ingrese la posicion del empleado que va agregar");
                                                            int posicion_empleado = sc.nextInt();

                                                            bar.get(cant_bar).getListaE().add(Empleado.get(posicion_empleado));
                                                            bar.get(cant_bar).getListaE().remove(posicion_empleado);
                                                        }

                                                        for (Productos r : comida) {
                                                            System.out.println(ANSI_GREEN + "Posicion " + comida.indexOf(r) + " :" + r);
                                                        }
                                                        System.out.println(ANSI_GREEN + "Cuantos productos va agregar");
                                                        int veces2 = sc.nextInt();
                                                        while (veces2 < comida.size()) {
                                                            System.out.println(ANSI_GREEN + "No puede meter esa cantidad, no hay esa cantidad en el inventario");
                                                            veces2 = sc.nextInt();
                                                        }
                                                        for (int i = 0; i < veces2; i++) {
                                                            System.out.println(ANSI_GREEN + "Ingrese la posicion del prodcuto que desea agregar");
                                                            int posicion_comida = sc.nextInt();

                                                            bar.get(cant_bar).getListaP().add(comida.get(posicion_comida));

                                                        }

                                                        break;
                                                    }
                                                    default:
                                                        System.out.println(ANSI_GREEN + "No existe otra opcion!");
                                                }
                                                break;
                                            }
                                            case 3: {

                                                System.out.println(ANSI_GREEN + "Ingrese su ID: ");
                                                sc.nextLine();
                                                String id = sc.nextLine();
                                                System.out.println(ANSI_GREEN + "Ingrese su usuario: ");
                                                String username = sc.nextLine();
                                                System.out.println(ANSI_GREEN + "Ingrese su contraseña: ");
                                                String contra1 = sc.nextLine();
                                                System.out.println(ANSI_GREEN + "Ingrese su correo electronico: ");
                                                String correo = sc.nextLine();
                                                System.out.println(ANSI_GREEN + "Ingrese su nombre completo: ");
                                                String nombreC = sc.nextLine();
                                                System.out.println(ANSI_GREEN + "Ingrese su fecha de nacimiento(DD/MM/YYYY): ");
                                                String fecha = sc.nextLine();
                                                System.out.println(ANSI_GREEN + "Ingrese su horario de trabajo: ");
                                                String horario = sc.nextLine();

                                                Empleado.add(new Empleados(horario, 0, id, username, contra1, correo, nombreC, fecha));

                                                break;
                                            }
                                            case 2: {
                                                System.out.println(ANSI_GREEN + "1. Crear Ropa" + ANSI_GREEN + "\n2. Crear Juguetes" + ANSI_GREEN + "\n3. Crear Comida: " + ANSI_GREEN);
                                                int menucomida = sc.nextInt();

                                                switch (menucomida) {
                                                    case 1: {
                                                        System.out.println(ANSI_GREEN + "El nombre de la ropa: ");
                                                        sc.nextLine();
                                                        String nom1 = sc.nextLine();
                                                        System.out.println(ANSI_GREEN + "La descripcion de la ropa: ");
                                                        String descrip1 = sc.nextLine();
                                                        System.out.println(ANSI_GREEN + "El precio de la ropa");
                                                        int precio1 = sc.nextInt();
                                                        System.out.println(ANSI_GREEN + "Ingrese el genero de la ropa");
                                                        sc.nextLine();
                                                        String genero = sc.nextLine();
                                                        System.out.println(ANSI_GREEN + "Ingrese la talla de la ropa");
                                                        String talla = sc.nextLine();

                                                        ropa.add(new Ropa(genero, talla, descrip1, nom1, precio1));
                                                        break;
                                                    }
                                                    case 2: {
                                                        System.out.println(ANSI_GREEN + "El nombre del juguete: ");
                                                        sc.nextLine();
                                                        String nom2 = sc.nextLine();
                                                        System.out.println(ANSI_GREEN + "La descripcion del producto: ");
                                                        String descrip2 = sc.nextLine();
                                                        System.out.println(ANSI_GREEN + "La descripcion del Juguete: ");
                                                        String descrip22 = sc.nextLine();
                                                        System.out.println(ANSI_GREEN + "El precio del juguete");
                                                        int precio2 = sc.nextInt();

                                                        Juguetes.add(new Juguetes(descrip22, descrip2, nom2, precio2));
                                                        break;
                                                    }
                                                    case 3: {
                                                        System.out.println(ANSI_GREEN + "El nombre de la comida: ");
                                                        sc.nextLine();
                                                        String nom3 = sc.nextLine();
                                                        System.out.println(ANSI_GREEN + "La descripcion de la comida: ");
                                                        String descrip3 = sc.nextLine();
                                                        System.out.println(ANSI_GREEN + "El precio de la comida: ");
                                                        int precio3 = sc.nextInt();
                                                        System.out.println(ANSI_GREEN + "Ingrese 1. Comida 2. Bebida");
                                                        sc.nextLine();
                                                        String tipo = sc.nextLine();
                                                        System.out.println(ANSI_GREEN + "Fecha de caducidad");
                                                        String fecha_venci = sc.nextLine();

                                                        comida.add(new Comida(tipo, fecha_venci, descrip3, nom3, precio3));

                                                        break;
                                                    }
                                                    default:
                                                        System.out.println(ANSI_GREEN + "No existe esa opcion!");
                                                        break;
                                                }

                                                break;
                                            }
                                            default:
                                                System.out.println(ANSI_GREEN + "No existe esa opcion!");
                                        }
                                        break;
                                    }
                                    case 2: {
                                        // modificar
                                        System.out.println(ANSI_GREEN +"1. Modificar Locales \n2. Modificar Empleados \n3. Modificar Productos");
                                        int opcion_modificar = sc.nextInt();
                                        while (opcion_modificar != 4) {
                                            switch (opcion_modificar) {
                                                case 1: {
                                                    System.out.println(ANSI_GREEN +"1. Modificar Tiendas \n2. Modificar Quioscos \n3. Modificar Bares");
                                                    int opcion_modificar2 = sc.nextInt();
                                                    switch (opcion_modificar2) {
                                                        case 1: {

                                                            for (Locales locales : tienda) {
                                                                System.out.println(ANSI_GREEN +"Posicion " + tienda.indexOf(locales) + " :" + locales);
                                                            }

                                                            System.out.println(ANSI_GREEN +"Ingrese la posicion que quiere modificar: ");
                                                            int posicion = sc.nextInt();

                                                            System.out.println(ANSI_GREEN +"Ingrese el nuevo nombre: ");
                                                            String nombre = sc.nextLine();

                                                            tienda.get(posicion).setNombre(nombre);

                                                            break;
                                                        }
                                                        case 2: {

                                                            for (Locales locales : quiosco) {
                                                                System.out.println(ANSI_GREEN +"ANSI_GREEN +Posicion " + quiosco.indexOf(locales) + " :" + locales);
                                                            }

                                                            System.out.println(ANSI_GREEN +"Ingrese la posicion que quiere modificar: ");
                                                            int posicion = sc.nextInt();

                                                            System.out.println(ANSI_GREEN +"Ingrese el nuevo nombre: ");
                                                            String nombre = sc.nextLine();

                                                            quiosco.get(posicion).setNombre(nombre);

                                                            break;
                                                        }
                                                        case 3: {
                                                            for (Locales locales : bar) {
                                                                System.out.println(ANSI_GREEN +"Posicion " + bar.indexOf(locales) + " :" + locales);
                                                            }

                                                            System.out.println(ANSI_GREEN +"Ingrese la posicion que quiere modificar: ");
                                                            int posicion = sc.nextInt();

                                                            System.out.println(ANSI_GREEN +"Ingrese el nuevo nombre: ");
                                                            String nombre = sc.nextLine();

                                                            bar.get(posicion).setNombre(nombre);

                                                            break;
                                                        }
                                                        default:
                                                            System.out.println(ANSI_GREEN +"No existe esa opcion!");
                                                    }

                                                    break;
                                                }
                                                case 2: {
                                                    for (Personas pa : Empleado) {
                                                        System.out.println(ANSI_GREEN +"Posicion " + Empleado.indexOf(pa) + " :" + pa);
                                                    }

                                                    System.out.println(ANSI_GREEN +"Ingrese la posicion que quiere modificar: ");
                                                    int posicion = sc.nextInt();

                                                    System.out.println(ANSI_GREEN + "Ingrese su ID: ");
                                                    sc.nextLine();
                                                    String id = sc.nextLine();
                                                    System.out.println(ANSI_GREEN + "Ingrese su usuario: ");
                                                    String username = sc.nextLine();
                                                    System.out.println(ANSI_GREEN + "Ingrese su contraseña: ");
                                                    String contra1 = sc.nextLine();
                                                    System.out.println(ANSI_GREEN + "Ingrese su correo electronico: ");
                                                    String correo = sc.nextLine();
                                                    System.out.println(ANSI_GREEN + "Ingrese su nombre completo: ");
                                                    String nombreC = sc.nextLine();
                                                    System.out.println(ANSI_GREEN + "Ingrese su fecha de nacimiento(DD/MM/YYYY): ");
                                                    String fecha = sc.nextLine();
                                                    System.out.println(ANSI_GREEN + "Ingrese su horario de trabajo: ");
                                                    String horario = sc.nextLine();

                                                    Empleado.set(posicion, new Empleados(horario, 0, id, username, contra1, correo, nombreC, fecha));

                                                    break;
                                                }
                                                case 3: {
                                                    System.out.println(ANSI_GREEN +"1. Modificar Ropa \n2. Modificar Juguetes \n3. Modificar Comida");
                                                    int opcion_modificar2 = sc.nextInt();
                                                    switch (opcion_modificar2) {
                                                        case 1: {
                                                            for (Productos pa : ropa) {
                                                                System.out.println(ANSI_GREEN +"Posicion " + ropa.indexOf(pa) + " :" + pa);
                                                            }
                                                            System.out.println(ANSI_GREEN +"Ingrese la posicion que quiere modificar: ");
                                                            int posicion = sc.nextInt();

                                                            System.out.println(ANSI_GREEN + "El nombre de la ropa: ");
                                                            sc.nextLine();
                                                            String nom1 = sc.nextLine();
                                                            System.out.println(ANSI_GREEN + "La descripcion de la ropa: ");
                                                            String descrip1 = sc.nextLine();
                                                            System.out.println(ANSI_GREEN + "El precio de la ropa");
                                                            int precio1 = sc.nextInt();
                                                            System.out.println(ANSI_GREEN + "Ingrese el genero de la ropa");
                                                            sc.nextLine();
                                                            String genero = sc.nextLine();
                                                            System.out.println(ANSI_GREEN + "Ingrese la talla de la ropa");
                                                            String talla = sc.nextLine();

                                                            ropa.set(posicion, new Ropa(genero, talla, descrip1, nom1, precio1));

                                                            break;
                                                        }
                                                        case 2: {
                                                            for (Productos pa : Juguetes) {
                                                                System.out.println(ANSI_GREEN +"Posicion " + Juguetes.indexOf(pa) + " :" + pa);
                                                            }
                                                            System.out.println(ANSI_GREEN +"Ingrese la posicion que quiere modificar: ");
                                                            int posicion = sc.nextInt();

                                                            System.out.println(ANSI_GREEN + "El nombre del juguete: ");
                                                            sc.nextLine();
                                                            String nom2 = sc.nextLine();
                                                            System.out.println(ANSI_GREEN + "La descripcion del producto: ");
                                                            String descrip2 = sc.nextLine();
                                                            System.out.println(ANSI_GREEN + "La descripcion del Juguete: ");
                                                            String descrip22 = sc.nextLine();
                                                            System.out.println(ANSI_GREEN + "El precio del juguete");
                                                            int precio2 = sc.nextInt();

                                                            Juguetes.set(posicion, new Juguetes(descrip2, descrip22, nom2, precio2));

                                                            break;
                                                        }
                                                        case 3: {
                                                            for (Productos pa : comida) {
                                                                System.out.println(ANSI_GREEN +"Posicion " + comida.indexOf(pa) + " :" + pa);
                                                            }
                                                            System.out.println(ANSI_GREEN +"Ingrese la posicion que quiere modificar: ");
                                                            int posicion = sc.nextInt();

                                                            System.out.println(ANSI_GREEN + "El nombre de la comida: ");
                                                            sc.nextLine();
                                                            String nom3 = sc.nextLine();
                                                            System.out.println(ANSI_GREEN + "La descripcion de la comida: ");
                                                            String descrip3 = sc.nextLine();
                                                            System.out.println(ANSI_GREEN + "El precio de la comida: ");
                                                            int precio3 = sc.nextInt();
                                                            System.out.println(ANSI_GREEN + "Ingrese 1. Comida 2. Bebida");
                                                            sc.nextLine();
                                                            String tipo = sc.nextLine();
                                                            System.out.println(ANSI_GREEN + "Fecha de caducidad");
                                                            String fecha_venci = sc.nextLine();

                                                            comida.set(posicion, new Comida(tipo, fecha_venci, descrip3, nom3, precio3));

                                                            break;
                                                        }
                                                        default:
                                                            System.out.println(ANSI_GREEN +"No existe esa opcion!");
                                                    }

                                                    break;
                                                }

                                                default:
                                                    System.out.println(ANSI_GREEN +"No existe esa opcion!");
                                            }
                                        }

                                        break;
                                    }
                                    case 3: {
                                        System.out.println(ANSI_GREEN +"1. Eliminar Locales \n2.  Eliminar Empleados \n3.  Eliminar Productos");
                                        int opcion_modificar = sc.nextInt();
                                        while (opcion_modificar != 4) {
                                            switch (opcion_modificar) {
                                                case 1: {
                                                    System.out.println(ANSI_GREEN +"1.  Eliminar Tiendas \n2.  Eliminar Quioscos \n3.  Eliminar Bares");
                                                    int opcion_modificar2 = sc.nextInt();
                                                    switch (opcion_modificar2) {
                                                        case 1: {

                                                            for (Locales locales : tienda) {
                                                                System.out.println(ANSI_GREEN +"Posicion " + tienda.indexOf(locales) + " :" + locales);
                                                            }

                                                            System.out.println(ANSI_GREEN +"Ingrese la posicion que quiere  Eliminar: ");
                                                            int posicion = sc.nextInt();

                                                            

                                                            tienda.remove(posicion);

                                                            break;
                                                        }
                                                        case 2: {

                                                            for (Locales locales : quiosco) {
                                                                System.out.println(ANSI_GREEN +"Posicion " + quiosco.indexOf(locales) + " :" + locales);
                                                            }

                                                            System.out.println(ANSI_GREEN +"Ingrese la posicion que quiere  Eliminar: ");
                                                            int posicion = sc.nextInt();

                                                           

                                                            quiosco.remove(posicion);

                                                            break;
                                                        }
                                                        case 3: {
                                                            for (Locales locales : bar) {
                                                                System.out.println(ANSI_GREEN +"Posicion " + bar.indexOf(locales) + " :" + locales);
                                                            }

                                                            System.out.println(ANSI_GREEN +"Ingrese la posicion que quiere Eliminar: ");
                                                            int posicion = sc.nextInt();

                                                           

                                                            bar.remove(posicion);

                                                            break;
                                                        }
                                                        default:
                                                            System.out.println(ANSI_GREEN +"No existe esa opcion!");
                                                    }

                                                    break;
                                                }
                                                case 2: {
                                                    for (Personas pa : Empleado) {
                                                        System.out.println(ANSI_GREEN +"Posicion " + Empleado.indexOf(pa) + " :" + pa);
                                                    }

                                                    System.out.println(ANSI_GREEN +"Ingrese la posicion que quiere Eliminar: ");
                                                    int posicion = sc.nextInt();

                                                    Empleado.remove(posicion);

                                                    break;
                                                }
                                                case 3: {
                                                    System.out.println(ANSI_GREEN +"1. Eliminar Ropa \n2. Eliminar Juguetes \n3. Eliminar Comida");
                                                    int opcion_modificar2 = sc.nextInt();
                                                    switch (opcion_modificar2) {
                                                        case 1: {
                                                            for (Productos pa : ropa) {
                                                                System.out.println(ANSI_GREEN +"Posicion " + ropa.indexOf(pa) + " :" + pa);
                                                            }
                                                            System.out.println(ANSI_GREEN +"Ingrese la posicion que quiere Eliminar: ");
                                                            int posicion = sc.nextInt();

                                                           

                                                            ropa.remove(posicion);

                                                            break;
                                                        }
                                                        case 2: {
                                                            for (Productos pa : Juguetes) {
                                                                System.out.println(ANSI_GREEN +"Posicion " + Juguetes.indexOf(pa) + " :" + pa);
                                                            }
                                                            System.out.println(ANSI_GREEN +"Ingrese la posicion que quiere Eliminar: ");
                                                            int posicion = sc.nextInt();

                                                            

                                                            Juguetes.remove(posicion);

                                                            break;
                                                        }
                                                        case 3: {
                                                            for (Productos pa : comida) {
                                                                System.out.println(ANSI_GREEN +"Posicion " + comida.indexOf(pa) + " :" + pa);
                                                            }
                                                            System.out.println(ANSI_GREEN +"Ingrese la posicion que quiere Eliminar: ");
                                                            int posicion = sc.nextInt();

                                                           

                                                            comida.remove(posicion);

                                                            break;
                                                        }
                                                        default:
                                                            System.out.println(ANSI_GREEN +"No existe esa opcion!");
                                                    }

                                                    break;
                                                }

                                                default:
                                                    System.out.println(ANSI_GREEN +"No existe esa opcion!");
                                            }
                                        }

                                        break;
                                    }
                                    
                                    case 4: {
                                        System.exit(0);
                                        break;
                                    }
                                    default:
                                        System.out.println(ANSI_GREEN + "No existe esa opcion");
                                }
                                System.out.println(ANSI_GREEN + "Bienvenido Administrador" + master);
                                System.out.println(ANSI_GREEN + "1. Crear " + ANSI_GREEN + "\n2. Modificar " + ANSI_GREEN + "\n3. Eliminar: " + ANSI_GREEN + "\n4. Exit" + ANSI_GREEN);
                                submenuadmi = sc.nextInt();
                            }
                            c = 1;
                        } else if (Clientes.size() >= 0) {
                            int v = 0,l;
                            for (int i = 0; i < Clientes.size(); i++) {
                                l=i;
                                System.out.println(Clientes.get(i).getUsername());
                                if (us.equals(Clientes.get(i).getUsername())) {
                                    if (Clientes.get(i).getContra().equals(cn)) {
                                        System.out.println(ANSI_GREEN + "Bienvenido gran clente  " + us);
                                        c = 1;
                                        v = 1;
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
                            if (v == 1) {
                                int o = 0;
                                System.out.println(ANSI_GREEN + "1.Tienda \n" + ANSI_GREEN + "2. Bar \n" + ANSI_GREEN + "3.Quiosco");
                                System.out.println("");
                                System.out.println(ANSI_GREEN + "Ingrese el tipo de tienda a la que desea ingresar");
                                int t = sc.nextInt();
                                switch (t) {
                                    case 1:
                                        int s=0,j=0;
                                        String factura;
                                        double cd=0,td;
                                        for (int i = 0; i < tienda.size(); i++) {
                                            System.out.println(ANSI_GREEN + i + "" + tienda.get(i));
                                        }
                                        System.out.println(ANSI_GREEN + "A cual tienda desea entrar?");
                                        o = sc.nextInt();
                                        for (int i = 0; i < tienda.get(o).getListaP().size(); i++) {
                                            System.out.println(ANSI_GREEN + tienda.get(o).getListaP().get(i) + "---------" + tienda.get(o).getListaP().get(i).getPrecio());
                                        }
                                        System.out.println(ANSI_GREEN +"Que producto desea comprar");
                                        s=sc.nextInt();
                                        System.out.println(ANSI_GREEN +"Que cantidad desea comprar");
                                        j=sc.nextInt();
                                        cd=tienda.get(s).getListaP().get(s).getPrecio()*j;
                                        System.out.println(ANSI_GREEN +"Total es "+cd);
                                        
                                        break;
                                    case 2:
                                        for (int i = 0; i < bar.size(); i++) {
                                            System.out.println(ANSI_GREEN + i + "" + bar.get(i));
                                        }
                                        System.out.println(ANSI_GREEN + "A cual Bar desea entrar?");
                                        o = sc.nextInt();
                                        for (int i = 0; i < bar.get(o).getListaP().size(); i++) {
                                            System.out.println(ANSI_GREEN + bar.get(o).getListaP().get(i) + "--------" + bar.get(o).getListaP().get(i).getPrecio());
                                        }
                                        System.out.println(ANSI_GREEN +"Que producto desea comprar");
                                        s=sc.nextInt();
                                        System.out.println(ANSI_GREEN +"Que cantidad desea comprar");
                                        j=sc.nextInt();
                                        cd=bar.get(s).getListaP().get(s).getPrecio()*j;
                                        System.out.println(ANSI_GREEN +"Total es "+cd);
                                        break;
                                    case 3:
                                        for (int i = 0; i < quiosco.size(); i++) {
                                            System.out.println(i + "" + quiosco.get(i));
                                        }
                                        System.out.println(ANSI_GREEN + "A cual quiosco desea entrar?");
                                        o = sc.nextInt();
                                        for (int i = 0; i < quiosco.get(o).getListaP().size(); i++) {
                                            System.out.println(ANSI_GREEN + quiosco.get(o).getListaP().get(i) + "--------" + quiosco.get(o).getListaP().get(i).getPrecio());
                                        }
                                        System.out.println(ANSI_GREEN +"Que producto desea comprar");
                                        s=sc.nextInt();
                                        System.out.println(ANSI_GREEN +"Que cantidad desea comprar");
                                        j=sc.nextInt();
                                        cd=quiosco.get(s).getListaP().get(s).getPrecio()*j;
                                        System.out.println(ANSI_GREEN +"Total es "+cd);
                                        break;
                                    default:
                                        System.out.println(ANSI_GREEN + "Esa opcion no existe");
                                        break;
                                }

                            }

                        } else {
                            System.out.println(ANSI_RED + "Aun no se ha creado ningun usuario");
                            c = 1;
                        }
                    }
                    break;
                case 2:
                    System.out.println(ANSI_GREEN + "Ingrese su ID");
                    String id = sc.next();
                    System.out.println(ANSI_GREEN + "Ingrese su nombre de usuario");
                    String nuvusu = sc.next();
                    System.out.println(ANSI_GREEN + "Ingrese su contraseña");
                    String nupas = sc.next();

                    System.out.println(ANSI_GREEN + "Ingrese su correo");
                    String corr = sc.next();

                    System.out.println(ANSI_GREEN + "Ingrese su nombre");
                    String nom = sc.next();
                    System.out.println(ANSI_GREEN + "Ingrese su fecha de nacimento");
                    String nac = sc.next();
                    System.out.println(ANSI_GREEN + "Ingrese su efectivo");
                    int cash = sc.nextInt();
                    System.out.print(ANSI_GREEN + "Procesando../");
                    System.out.print(ANSI_GREEN + "../");
                    System.out.print(ANSI_GREEN + "../");
                    System.out.print(ANSI_GREEN + "../");
                    System.out.println("");

                    Clientes.add(new Clientes(cash, co, id, nuvusu, nupas, corr, nom, nac));
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
