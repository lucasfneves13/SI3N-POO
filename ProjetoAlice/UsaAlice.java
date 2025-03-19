package atores;

import java.util.Random;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author alunolab11
 */
public class UsaAlice {
    
    public static void main(String[] args) {
        
        Alice a01 = new Alice();
        a01.corCabelo = "Roxo";
        a01.posX = 0;
        a01.posZ = 10;
        
        Alice a02 = new Alice("Rosa", 10, 20);
        
        a01.move();
        a01.turn();
        
        a02.move(50);
        
        if(a01.posZ > 0)
            a01.say("BUUUUUUUUUUUU");
        else
            a01.say("OIIIIIIIIIIII");
        
        Random rd = new Random();
        if(rd.nextInt(10) > 6)
            a01.say("BUUUUUUUUUUUU");
        else
            a01.say("OIIIIIIIIIIII");
        
    }
}