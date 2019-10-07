package com.Anshul;

public class For_loop_and_usage_of_break_and_continue {

    public static void main(String[] args) {


//        for (int i = 0; i<100; i++) {
//            System.out.println(i);
//             i+=1;
//        }
//    }
//}

//For loop consists of 3 statements for(statement1; statement2; statement3)
// Statement 1: will be executed only once before the code block
// Statement 2: defines the condition for the code block to be executed
// Statement 3: will be executed every time if the code block gets executed.


//        int i = 0;
//        while (i < 10) {
//            if(i==0 || i==1) {
//                System.out.println(i);
//            }else System.out.println(i+=1);      // To print the odd numbers including 0
//            i++;

//*****************************************************************************************************
//
//        for (int i = 0; i < 10; i+=0) {
//            if (i==0 || i==1){
//                System.out.println(i);
//            }else System.out.println(i+=1);        // same like above program but with For loop
//            i++;
//        }
//    }
//         }

//*******************************************************************************************************************


//        int i=0;
//        do {
//            System.out.println(i++);
//        }while(i<10);

//        for (int i = 0; i < 10; i+=1) {
//             if(i>2) {
//                 continue;                               // Continue statement is most commonly used when we have to skip any iteration i.e. here 3 is skipped
//             }
//            System.out.println(i);


        for (int i = 0; i < 10; i++) {
            if (i == 2) {
                break;                                  // Break will stop the loop there only whereas continue is used where we have to skip one iteration
            }
            System.out.println(i);
        }

    }
}

