package day09_IfStatements;

import java.util.Scanner;

public class ChooseLanguage {

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("for English press 1, for Spanish press 2, for Turkish press 3, for Russian press 4 and for French press 5");
        int selection= scanner.nextInt();
        if (selection==1){System.out.println("Hello, thank for your call");}
        else if (selection==2){System.out.println("Hola, gracias para llamar");}
        else if (selection==3){System.out.println("Merhaba, aradiginiz icin tesekkurler");}
        else if (selection==4){System.out.println("Privet, spasibo za vash zvonok");}
        else if (selection==5){System.out.println("Merci ,pour votre appel");}

    }

}
/*
Create a class called ChooseLanguage, Given an integer variable named
selection that has a number between 1~5, Write a program that can
select the language based on the number that's given in selection and
prints the following message:
for 1: Hello, thank for your call
for 2: Hola, gracias para llamar
for 3: Merhaba, aradiginiz icin tesekkurler
for 4: Privet, spasibo za vash zvonok
for 5: Merci ,pour votre appel
 */


