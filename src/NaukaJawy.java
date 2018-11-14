/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package naukajawy;

/**
 *
 * @author maciejgolianek
 */
//zad1.
public class NaukaJawy {
int x = 5;
double temperature = 75.6;
char grade = 'A';
String name = "Adam";
// zad2.
double register = 10.0;
    register = register + 5;
    register = register - 2.5;
    register = register + 10;
    register = register - 3;
System.out.println(register);
//zad3
int bankBalance = 500;
bankBalance = bankBalance + 250;
bankBalance = bankBalance - 100;
System.out.println(bankBalance);
//zad4
System.out.println(2.0 * (5/2)); //=4.0
// zad5
int day = 8;
String month = July;
//zad6
String firstName = "Maciej";
String lastName = "Golianek";
String fullName = firstName + " " + lastName;
int lettersInName = lastName.length(lastName) + firstName.length (firstName);
System.out.println("Hello, my name is " + fullName + ".");
Syste.out.println("There are " + lettersInName + "letters in my name.");
//zad 7
public class celcius{;
double farenhait = 13.0;
double celcius = (farenhait - 32) * 5 /9;
System.out.println(celcius)

        }


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}

public double calculateTip(double cost) {
    double tip = cost * 0,15;
    return tip;
}

public double fahrenheitToCelcius