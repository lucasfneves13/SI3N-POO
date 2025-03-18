/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package atores;

/**
 *
 * @author alunolab11
 */
public class Alice {
    float tamanho;
    String corCabelo;
    int posX, posY, posZ = 0;
    
    
    boolean move(){
        System.out.println("Alice: move()");
        return true;
    }
    
    void turn(){
        System.out.println("");
    }
    
    void say(String text){
        System.out.println("Alice: say()");
        System.out.println(text);
    }
}
