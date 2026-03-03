
package examplestorage;


public class ExampleStorage {
 static final double PI = 3.14;
    
    public static void main(String[] args) {
        
        //print const value
        //PI
        
        
        
        
        //Primitive type
        //variable
        int age,age1,age2,age3 = 8;
        
        //Data structure - Array
        int[] AgeArray = {9, 10, 11};
        
        System.out.println(AgeArray[0]);
        
        //Reference type
        ExampleStorage object1;
        
        
        object1 = new ExampleStorage();
        
        int num1 = 7;
        //These statements do the same thing;
        num1 = num1 + 1;
        num1 = num1++;
        
        //Comparison operator
        if(8 == 8 || 9 > 20 && 9==9){
            System.out.println("Value of eight is equals to eight!!!");
        }
        
        System.out.print("Hi there!" + "\nMy name is John\tMy name is Sally");
    }
    
}
