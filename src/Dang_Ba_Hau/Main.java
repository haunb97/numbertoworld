package Dang_Ba_Hau;

import javax.xml.bind.SchemaOutputResolver;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap vao so can doc");
        int number = sc.nextInt();
        if(number < 10 && number >= 0){
        switch(number) {
            case 0:
                System.out.println("zero");
                break;
            case 1:
                System.out.println("one");
                break;
            case 2:
                System.out.println("two");
                break;
            case 3:
                System.out.println("three");
                break;
            case 4:
                System.out.println("four");
                break;
            case 5:
                System.out.println("five");
                break;
            case 6:
                System.out.println("six");
                break;
            case 7:
                System.out.println("seven");
                break;
            case 8:
                System.out.println("eight");
                break;
            case 9:
                System.out.println("nine");
                break;
        }

        }
        else if(number < 20 && number >= 10){
            switch (number -10){
                case 0:
                    System.out.println("ten");
                    break;
                case 1:
                    System.out.println("eleven");
                    break;
                case 2:
                    System.out.println("two");
                    break;
                case 3:
                    System.out.println("twelve");
                    break;
                case 4:
                    System.out.println("thirteen");
                    break;
                case 5:
                    System.out.println("fourteen");
                    break;
                case 6:
                    System.out.println("fifteen");
                    break;
                case 7:
                    System.out.println("sixteeen");
                    break;
                case 8:
                    System.out.println("seventeen");
                    break;
                case 9:
                    System.out.println("eighteen");
                    break;
            }

        }
        else if(number >= 20 && number < 100){
            hangchuc(Math.round(number/10));
            donvi(number - Math.round(number/10)*10);

        }
        else if(number >= 100 && number < 1000){
            hangtram(Math.round(number/100));
            if(number%100 != 0){System.out.printf(" and ");}
            hangchuc(Math.round((number - Math.round(number/100)*100)/10));
            donvi(number-Math.round(number/100)*100-Math.round((number-Math.round(number/100)*100)/10)*10);
        }
        else{
            System.out.println("out of ability");
        }
    }
    private static void hangtram(int number) {
    switch(number){
        case 1:
            System.out.printf("one hundred");
            break;
        case 2:
            System.out.printf("two hundred");
            break;
        case 3:
            System.out.printf("three hundred");
            break;

        case 4:
            System.out.printf("four hundred");
            break;
        case 5:
            System.out.println("five hundred");
            break;
        case 6:
            System.out.printf("six hundred");
            break;
        case 7:
            System.out.println("seven hundred");
            break;
        case 8:
            System.out.println("eight hundred");
            break;
        case 9:
            System.out.println("nine hundred");
            break;
    }
    }
    private static void hangchuc(int number){

        switch (number) {
            case 2:
                System.out.printf("twenty");
                break;
            case 3:
                System.out.printf("thirty");
                break;

            case 4:
                System.out.printf("fourty");
                break;
            case 5:
                System.out.println("fifty");
                break;
            case 6:
                System.out.printf("sixty");
                break;
            case 7:
                System.out.println("seventy");
                break;
            case 8:
                System.out.println("eighty");
                break;
            case 9:
                System.out.println("ninety");
                break;
        }
    }
    private static void donvi(int number){
        switch (number){
            case 1:
                System.out.println("one");
                break;
            case 2:
                System.out.println("two");
                break;
            case 3:
                System.out.println("three");
                break;
            case 4:
                System.out.println("four");
                break;
            case 5:
                System.out.println("five");
                break;
            case 6:
                System.out.println("six");
                break;
            case 7:
                System.out.println("seven");
                break;
            case 8:
                System.out.println("eight");
                break;
            case 9:
                System.out.println("nine");
                break;
        }
    }
}
