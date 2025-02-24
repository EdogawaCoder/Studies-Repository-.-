package sessao11;


public class Loops {

    /**
     * @param args
     */
    public static void main(String[] args){

        // // 1 - for

        // // loops that will go for 1 until 5.

        // // Initialization variable -> i,h,n;
        // // Condition -> Determines where and how many times the loop will occur.
        // // Increment -> How the variable will reach in the condition.

        // for(int i = 1; i <= 5; i++){

        //     //Repeat
        //     System.out.println("Counter: "+i);

        // }

        // // Arrays and strings starts in the 0 position;
        // // To show every character in a String;

        // String Word = "Java";

        // for( int i=0; i < Word.length(); i++){

        //     System.out.println("Character: " + Word.charAt(i));
        // }

        // //Regressive counter.

        // for(int i = 10; i > 0; i--){

        //     System.out.println("Regressive countage: " + i);
        // }

        // // 2 - While

        // int i = 0;

        // while (i <= 5) {

        //     System.out.println("While counter: " + i);

        //     i++;

        // }

        // int value = 0;

        // while(value !=7){

        //     // (int) is a typing cast.

        //     value = (int)(Math.random()*100);

        //     System.out.println("Valor aleatório: " + value);

        // }

        // // Infinite Loop. Take care! Ctrl + C.
        // // while (true) {

        // //     System.out.println("Infinite!");

        // // }

        // // Another Infinite Loop.
        // // for(int k=0; k <= 5; k--) {

        // //     System.out.println(k);
        // // }

        // 4 - Do while

        // int j = 10;

        // do {

        //     System.out.println(" The value of j is: " + j);
        //     j --;
        // } while (j > 0);

        // int numero = 0;

        // do {

        //     numero = (int)(Math.random()*10);

        //         System.out.println("aleatory value of j is: " + numero);

        // } while (numero != 1);

        //5 - Break em Loop

        // break can be used on any structure of looping.

        for(int x = 0; x <=10; x++){
            System.out.println("The value o x is: " +x);

            if(x==5){
                System.out.println("Breaking the loop.");
                break;
            }
        }

        // 6 - Continue loop

        for( int x=10; x > 0; x--){

            if(x % 2 == 0){

                System.out.println("O número é par.");
                continue;
            }

            System.out.println(" O número do contador é:" + x);
        }

        // 7 - neested Loops

        for( int m=1; m <= 3; m++ ){


            System.out.println("Externo!");

            for(int n=1; n <=3; n++){

                System.out.println(m + "x" + n + "= " + (m*n));

            }
        }


        // Padrão de estrelas

        for(int o = 1;  o <= 5; o++){

            for(int p = 1; p <= o; p++){

                System.out.print("*");
            }

                System.out.println();
        }


        
    }





}

