/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package polymorphism;

/**
 *
 * @author Rosalie
 */
public class son extends Parent{
    
    public son(String Chromozonex , String ChoromozoneY)
    {
        this.gender="boy";
        this.age=0;
        this.name="";
            
    }
    
    public son(String Chromozonex)
    {
        System.out.println("son said : lalaki ako");    
    }
    @Override
    public void shout()
    {
        System.out.println("son said : son of a bitch");
    }
    @Override
    public void genitals()
    {
        System.out.println("son said burat");
        
    }
}
