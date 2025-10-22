/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package polymorphism;

/**
 *
 * @author Rosalie
 */
public class Parent extends human{ 
    
    protected String gender;
    protected int age;
    public String name;
    
   @Override
    public void genitals()
    {
        System.out.println("tite o kippy ");
        
    }
    public Parent() 
    {
        this.gender="gay";
        this.age=0;
        this.name="";
    }
    public Parent(String Chromozonex , String ChoromozoneY)
    {
        this.gender="male";
        this.age=0;
        this.name="";
            
    }
    public Parent(String Chromozonex)
    {
        this.gender="Woman";
        this.age=0;
        this.name="";
            
    }
    public void shout()
    {
        System.out.println("PUTANGINA MO KANG BATA KA");
    }
    
}
