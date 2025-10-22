/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package polymorphism;

/**
 *
 * @author Rosalie
 */
public class Polymorphism {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String chromozonex = "X";
        String chromozoney = "Y";
       
        Parent daddy= new Parent();
        Parent mommy= new Parent();
        
        mommy.shout();
        daddy.shout();
        daddy.genitals();
        mommy.genitals();
        
        daughter daughter1 = new daughter(chromozonex);
        daughter daughter2 = new daughter(chromozonex , chromozoney);
        
        son son1 = new son(chromozonex);
        son son2 = new son(chromozonex, chromozoney);
        
        
        
        daughter1.shout();
        son1.shout();
        son1.genitals();
        daughter1.genitals();
        
        
        
    }
    
}
