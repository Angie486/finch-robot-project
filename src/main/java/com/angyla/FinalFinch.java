package com.angyla;

import com.birdbrain.Finch;

public class FinalFinch {
    
    public static void main(String[] args) {
   // this created a new Finch object called bird
        Finch bird = new Finch();
/*
 * This made the Finch's lights go off using
 * pattern arrays and then displaying it on
 * to the actual lights. It spells "Angyla"
 */
           int patternArray[] = {0,0,1,0,0,0,1,0,1,0,0,1,1,1,0,0,1,0,1,0,0,1,0,1,0};
           bird.setDisplay(patternArray);
           bird.pause(1);
           int patternArray1[] = {1,0,0,0,1,1,1,0,0,1,1,0,1,0,1,1,0,0,1,1,1,0,0,0,1};
           bird.setDisplay(patternArray1);
bird.pause(1);
int patternArray2[] = {0,1,1,1,1,1,0,0,0,0,1,0,1,1,1,1,0,0,0,1,0,1,1,1,1};
           bird.setDisplay(patternArray2);
bird.pause(1);
int patternArray3[] = {1,0,0,0,1,0,1,0,1,0,0,0,1,0,0,0,1,0,0,0,1,0,0,0,0};
           bird.setDisplay(patternArray3);
bird.pause(1);
int patternArray4[] = {1,0,0,0,0,1,0,0,0,0,1,0,0,0,0,1,0,0,0,0,1,1,1,1,1};
           bird.setDisplay(patternArray4);
bird.pause(1);
int patternArray5[] = {0,0,1,0,0,0,1,0,1,0,0,1,1,1,0,0,1,0,1,0,0,1,0,1,0};
bird.setDisplay(patternArray5);
bird.pause(1);

/*
 * This made the Finch dance, specifically 
 * doing the moonwalk, turning to the other side, 
 * doing the moonwalk again, and then spinning
 * around in circles a few times
 */
bird.setMove("B",5,100);
bird.pause(0.2);
bird.setMove("B",5,100);
bird.pause(0.2);
bird.setMove("B",5,100);
bird.pause(0.2);
bird.setMove("B",5,100);
bird.pause(0.2);
bird.setTurn("R",180,50);
bird.pause(0.2);
bird.setMove("B",5,100);
bird.pause(0.2);
bird.setMove("B",5,100);
bird.pause(0.2);
bird.setMove("B",5,100);
bird.pause(0.2);
bird.setTurn("R",360,50);
bird.setTurn("R",360,50);
bird.setTurn("R",360,50);


/*
* This was used to stop the Finch  
* and disconnect it from the code
*/
bird.stopAll();
bird.disconnect();

    }
}
