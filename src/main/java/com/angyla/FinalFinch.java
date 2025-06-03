package com.angyla;

import com.birdbrain.Finch;

public class FinalFinch {
    
    public static void main(String[] args) {
        Finch bird = new Finch();

   
            bird.playNote(60, 4);
            bird.pause(2);

            bird.playNote(60, 4);
            bird.pause(0.8);
            bird.playNote(57, 8);
            bird.pause(0.8);
            bird.playNote(60, 8);
            bird.pause(0.8);
            bird.playNote(57, 8);
           bird.pause(1);
        
           bird.setMove("F",10,50);


bird.stopAll();
bird.disconnect();

    }
}
