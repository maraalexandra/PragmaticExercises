package org.fasttrackit;

import org.fasttrackit.inputprocessingoutput.HelloWorld;
import org.fasttrackit.inputprocessingoutput.MadLib;
import org.fasttrackit.inputprocessingoutput.PrintingQuotes;

import java.sql.SQLOutput;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Saying Hello" );

        String name = "Mara";

        System.out.println("What is your name?" + name);
        System.out.println("Hello " +  name + " nice to meet you");


        System.out.println("What is the input string? " + name + "\n" + name + " has " + name.length() + " characters");


        System.out.println("What is the quote?" + PrintingQuotes.quote + "\n"+ " Who said it? " + PrintingQuotes.authorName + "\n" + PrintingQuotes.authorName + " says " +  PrintingQuotes.quote  );

        System.out.println("Enter noun: ${MadLib.noun} " + "\n" + "Enter verb: ${verb}" + "\n" + "Enter an adjective: ${adjective}" + "\n" + "Enter an adverb: ${adverb}" + "\n" + "Do you ${verb} your ${adjective} ${noun} ${verb}? That's hilarious!");







    }


}
