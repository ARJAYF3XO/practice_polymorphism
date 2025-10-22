/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package polymorphism;

/**
 *
 * @author Rosalie
 */
public class daughter extends Parent{
    
  
    
    public daughter(String Chromozonex , String ChoromozoneY)
    {
        System.out.println("daughter said : babae man ako");
    }
    public daughter(String Chromozonex)
    {
        this.gender="girl";
        this.age=0;
        this.name="";
            
    }
    @Override
    public void shout()
    {
        System.out.println("daughter said : motherfucker");
    }
    @Override
    public void genitals()
    {
        System.out.println("daughter said kippy");
        
    }
    
}
