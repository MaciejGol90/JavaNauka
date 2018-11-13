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

public int likePhoto (int currentLikes, String comment, boolean like) {
System.out.println("Feedback " + comment);
if (like) {
    currentLikes = currentlikes + 1;
}
System.out.println("Number of likes: " + currentLikes);
return currentLikes;
}

// Define a function with the name and parameters: makeChange(double itemCost, double dollarsProvided)
// Calculate and return the calculated change which should be the dollarsProvided minus the itemCost

// Remember to return a value you need 1) a return type and 2) a return statement
public double makeChange(double itemCost, double dollarsProvided) {
    double change = dollarsProvided - itemCost;
    return change;
}
