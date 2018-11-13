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