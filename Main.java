package com.company;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scan = new Scanner(System.in);
        ArrayList<String> history = new ArrayList<>();
        Stack<String> undoHistory = new Stack<>();
        help();
        while(true) {


            String userInput = scan.nextLine();
            if (userInput.toLowerCase().equals("undo")) {
                history.add(undoHistory.pop());
            } else if (userInput.toLowerCase().equals("delete")) {
                undoHistory.push(history.remove(history.size() - 1));
            } else if (userInput.toLowerCase().equals("copy")) {
                history.add(history.get(history.size() - 1));
            } else if (userInput.toLowerCase().equals("quit")) {
                System.out.println("Shutting Down");
                break;
            } else if(userInput.toLowerCase().equals("help")) {
                help();
            }else if(userInput.toLowerCase().equals("print")) {
                for (String s: history) {
                    System.out.println(s);
                }
            }else {
                history.add(userInput);
            }

            if (history.size() > 10){
                history.remove(0);
            }

        }
    }
    public static void help(){
        System.out.println("Enter delete if you want to delete the last text you entered.");
        System.out.println("Enter copy if you want to copy the last input again.");
        System.out.println("Enter quit if you want to exit.");
        System.out.println("Enter undo if you want to undo the last delete");
        System.out.println("Enter help if you want to see this again");
        System.out.println("Enter print to check history");
    }
}
