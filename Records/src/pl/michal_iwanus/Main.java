package pl.michal_iwanus;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        /*
        Program will generate a table with records.
        Verse and columns will be introduced by user and it will be as long as the user wishes
         */

        Scanner scanner = new Scanner(System.in);

        int numberOfVerse; //How many verse user wants to create
        int numberOfColumns; //How many columns' user wants to create
        boolean ifDone = false; // Check if program will be done;

        //Enter a value of numberOfVerse
        System.out.println("How many verse you want to have?");
        numberOfVerse = scanner.nextInt();

        //Enter a value of numberOfColumns
        System.out.println("How many columns you want to have?");
        numberOfColumns = scanner.nextInt();

        int numberOfColumnsHelper = numberOfColumns - 1; //Helper for table
        int numberOfVerseHelper = numberOfVerse - 1;     //Helper for table

        //Creating a table with value of user
        String [][] table = new String[numberOfVerse][numberOfColumns];

        //Inserting values into a table
        for (int i = 0; i <= numberOfVerseHelper; i++)
        {
            for (int j = 0; j <= numberOfColumnsHelper; j++)
            {
                table[i][j] = scanner.next();
            }
            if (i == numberOfVerseHelper) ifDone = true; //Check if program done
        }

        //Showing a results of records
        if (ifDone)
        {
            for (int i = 0; i<= numberOfVerseHelper; i++)
            {
                System.out.print(i + 1 + ". ");
                for (int j = 0; j <= numberOfColumnsHelper; j++)
                {
                    System.out.print(table[i][j] + " ");
                }

                System.out.println();
            }
        }
        else //If program will not generate any record
        {
            System.out.println("Cannot show results of records");
        }
    }
}

    /*
    --------------------------------------
    00  01  02  03
    10  11  12  13
    20  21  22  23
    30  31  32  33

    System.out.print(i + 1 + ". " + table[i][1] + " ");
    System.out.println(table[i][0]);

    table[i][0] = scanner.next();
    table[i][1] = scanner.next();

    if (i == numberOfVerseHelper) ifDone = true;
         */
