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
public void println (String x) {

    if(x == null) {
    x = "null";
    }
    try {
        ensureOpen ();
        texOut.write(x);
    } catch (IOException e) {
     trouble = true;
    }
}