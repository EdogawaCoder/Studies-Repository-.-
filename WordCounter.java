package sessao10;

import java.util.Scanner;

public class WordCounter {

        public static void main(String[] args) {

    //このプログラムは入力された文章の文字を数えます
    //このぷろがむはにゅうろくされたぶんしょのもじすをかぞえます。
    // This program counts the number of letters on the phrase.
    //Este programa conta o número de palavras da frase inserida.

        callStart();

        continueCall();

        }

        public static void callStart(){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Insert any phrase here. It will be counted.");

        String phraseInserted = scanner.nextLine();

        int amountLetters = phraseInserted.length();

        System.out.println("The phrase ''" +phraseInserted+"'' has the amount of " +amountLetters+ " letters.");

        continueCall();
        }

        public static void continueCall(){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Do you want print another phrase? (1) Yes, (2) No.");

        int printAgain = scanner.nextInt();

        if (printAgain == 1){

            callStart();

        } else if (printAgain == 2){

            System.out.println("Program ended.");
            System.exit(0);

        } else {

            System.out.println("Invalid input. Try again.");
            continueCall();


        }
        }

    }




