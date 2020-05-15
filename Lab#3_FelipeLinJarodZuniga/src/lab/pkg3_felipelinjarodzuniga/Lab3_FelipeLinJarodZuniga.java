
package lab.pkg3_felipelinjarodzuniga;

import java.util.Scanner;


public class Lab3_FelipeLinJarodZuniga {

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
        Scanner sc=new Scanner (System.in);
        String master="Sudo", contra="54321";
        System.out.println(ANSI_PURPLE_BACKGROUND+ANSI_WHITE+"Adminstrador: '"+master+"' Contraseña: '"+contra+"'");
       System.out.println(ANSI_CYAN_BACKGROUND + ANSI_PURPLE + "Bienvenido a nuestro sistema centro comercial");
        System.out.println("");
        System.out.println(ANSI_GREEN_BACKGROUND+ANSI_BLACK+"------------------------*Menu*------------------------");
        System.out.println(ANSI_BLUE+"1. Log in");
        System.out.println(ANSI_BLUE+"2. Sing in");
        System.out.println(ANSI_BLUE+"3. exit");
        System.out.println(ANSI_GREEN_BACKGROUND+ANSI_BLACK+"------------------------------------------------------");
        System.out.println(ANSI_RED_BACKGROUND+"Ingrese la opcion deseada");
        int op=sc.nextInt();
        switch (op){
            case 1:
                break;
            case 2:
                break;
            case 3:
                System.out.println("Gracias por elegirnos");
        }
       
    }
    
}
