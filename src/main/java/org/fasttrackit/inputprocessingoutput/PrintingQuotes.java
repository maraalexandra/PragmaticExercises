package org.fasttrackit.inputprocessingoutput;

import java.util.Scanner;

public class PrintingQuotes {




 public static void main( String[] args ) {
   String quote = "These aren't  the droids you're looking for";

   System.out.println("What is the quote?" + quote + "\n"+ " Who said it? ");
   Scanner scanner = new Scanner(System.in);
   String userInput = scanner.nextLine();

  System.out.println(userInput + " says, " + quote);





 }



}
