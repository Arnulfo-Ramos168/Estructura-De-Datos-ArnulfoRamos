package edu.arnulfo.ramos.tarea3.ui;

import edu.arnulfo.ramos.tarea3.process.ExpConverter;
import java.util.Scanner;

public class CLI {
    public static void showMenu(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introducir una expresión infija: ");
        String infixExp = scanner.nextLine();
        String postfixExp = ExpConverter.infixToPostfix(infixExp);
        System.out.println("Expresión postfija: " + postfixExp);
        System.out.println("Evaluación : " + ExpConverter.evaluate(postfixExp));
        scanner.close();
    }
}
