package com.company.Game;

public abstract class GameObject {
    public abstract void draw();


    public static void main (String[] args){

        GameObject play = new Player();
        GameObject menu = new Menu();
//        play.draw();
//        menu.draw();
        GameObject[] gameObject = new GameObject[2];
        gameObject[0] = play;
        gameObject[1] = menu;
        for (GameObject obj : gameObject){
            obj.draw();

        }


    }
}
