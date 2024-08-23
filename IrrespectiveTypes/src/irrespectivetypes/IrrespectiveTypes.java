/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package irrespectivetypes;

/**
 *
 * @author Student
 */
public class IrrespectiveTypes<Type> {
private Type value;
  
    public void setvalue(Type value){
    this.value=value;
}

    public Type getValue() {
        return value;
    }



    public static void main(String[] args) {
        // TODO code application logic here
        IrrespectiveTypes<String> stringlist= new IrrespectiveTypes<String>();
        IrrespectiveTypes  floatlist= new IrrespectiveTypes();
        
        //integer.add(4);
        
        stringlist.setvalue("hello");
        
    
        NewInterface<Integer> myInterface = new NewInterface<Integer>() {
            @Override
            public Integer add(Integer value1, Integer value2) {
                return value1+value2;
                
        }
            
        };
        System.out.println(myInterface.add(4,2));
       
                } 
}

    

