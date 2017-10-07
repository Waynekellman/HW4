package com.company;


import java.util.Random;
import java.util.Scanner;
class Questions {
    private static int[] noReRun = new int[8];
    private static int questionNumber = 1;
    private static String questions(){
        Random rnd = new Random();
        int questNum = rnd.nextInt(8) + 1;
        int x = 0;
        while (x < 8) {
            for (int i : noReRun) {
                if (i == questNum) {
                    questNum = rnd.nextInt(8) + 1;
                    x = 0;
                    break;
                } else x++;
            }
        }
        switch (questNum) {
            case 1:
                System.out.println("Question number: " + questionNumber);
                System.out.println("Fill in the blank.");
                System.out.println("Fields and methods of a class describe the _______ of an object.");
                System.out.println("a. Mood");
                System.out.println("b. Behavior");
                System.out.println("c. Initialization");
                System.out.println("d. Quantity");
                noReRun[questionNumber - 1] = 1;
                questionNumber++;
                return "b";
            // b is the answer
            case 2:
                System.out.println("Question number: " + questionNumber);
                System.out.println("Where does <T> go to make a class generic?");
                System.out.println("a. public class <T> Generic{}");
                System.out.println("b. <T> public class Generic{}");
                System.out.println("c. public <T> class Generic{}");
                System.out.println("d. public class Generic<T>{}");
                noReRun[questionNumber - 1] = 2;
                questionNumber++;
                // d is the answer
                return "d";
            case 3:
                System.out.println("Question number: " + questionNumber);
                System.out.println("What is the proper format of an if statment?");
                System.out.println("a. If (x = 0) System.out.print(\"Zero\");");
                System.out.println("b. If {x = 0} System.out.print(\"Zero\");");
                System.out.println("c. If (x == 0) System.out.print(\"Zero\");");
                System.out.println("b. If x = 0 : System.out.print(\"Zero\");");
                noReRun[questionNumber - 1] = 3;
                questionNumber++;
                // c is the answer
                return "c";
            case 4:
                System.out.println("Question number: " + questionNumber);
                System.out.println("What do you put in a while statement that is always true to get out of it.");
                System.out.println("a. end;");
                System.out.println("b. discontinue;");
                System.out.println("c. continue;");
                System.out.println("d. break;");
                noReRun[questionNumber - 1] = 4;
                questionNumber++;
                //d is the answer
                return "d";
            case 5:
                System.out.println("A data structure is a specialized format designed to ____ and ____ data providing");
                System.out.println("a means of managing large amount of data efficiently.");
                System.out.println("a. Store and organize");
                System.out.println("b. construct and initialise");
                System.out.println("c. use and Quantify");
                System.out.println("d. view and save");
                noReRun[questionNumber - 1] = 5;
                questionNumber++;
                //a. is the answer
                return "a";
            case 6:
                System.out.println("Usage of efficient data structure is not key to designing efficient algorithms.");
                System.out.println("a. True");
                System.out.println("b. false");
                System.out.println("c. not enough information");
                System.out.println("d. Truthy");
                noReRun[questionNumber - 1] = 6;
                questionNumber++;
                //b. is the answer
                return "b";
            case 7:
                System.out.println("A ___ is a code block which is referred to by name and can be invoked");
                System.out.println("at any point in a program simply by calling or utilizing the ___ name.");
                System.out.println("a. Import");
                System.out.println("b. String");
                System.out.println("c. Method");
                System.out.println("d. Byte");
                noReRun[questionNumber - 1] = 7;
                questionNumber++;
                //c. is the answer
                return "c";
            case 8:
                System.out.println("public string static void main (String[] args {");
                System.out.println("From left to right what word or words represents a method.");
                System.out.println("a. public string");
                System.out.println("b. static");
                System.out.println("c. void");
                System.out.println("d. main");
                noReRun[questionNumber - 1] = 8;
                questionNumber++;
                //d. is th answer
                return "d";
        }
        return "";
    }
    void startQuiz(){
        Scanner userInput = new Scanner(System.in);
        int correct = 0;
        int wrong = 0;
        System.out.println("Welcome to the Java Quiz!");
        System.out.println();
        for (int i = 0; i < 8; i++) {
            String correctAnswer = questions();
            String answer = userInput.nextLine();
            if (correctAnswer.equals(answer.toLowerCase())) {
                System.out.println("Correct");
                correct++;
                System.out.println("");
            } else {
                System.out.println("Sorry incorrect. The correct answer is " + correctAnswer);
                wrong++;
                System.out.println("");
            }
        }
        System.out.println("You got " + correct + " answers correct");
        System.out.println("and " + wrong + " answers wrong.");
    }
}