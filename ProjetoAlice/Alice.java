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
    
    public Alice(){}

    public Alice(String corCabelo, int posX, int posY) {
        this.corCabelo = corCabelo;
        this.posX = posX;
        this.posY = posY;
    }
    
    
    
    boolean move(){
        System.out.println("Alice: move()");
        return true;
    }
    
     boolean move(int dist){
        System.out.println("Alice: move() " + dist + " unidades");
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
