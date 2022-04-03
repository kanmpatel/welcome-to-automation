package automationtest;

public class Variable_Q2 {
    //Declare two global variables with the name "id" and "name" with int and string type.
    int id;
    String name;
    //Create a parameterized Constructor That assigns the value of the above two variables.


    public Variable_Q2(int id, String name) {
        this.id = id;
        this.name = name;
    }
    //Create a method with no return type no parameter with name "display" and
    // write a SOUT statement to print the value of the above variables.
    public void display(){
        System.out.println(id + " - "+ name);
    }

    //Create the main method

    public static void main(String[] args) {
        //Create the Object with name obj1 and pass the value '101', 'YourName'
        Variable_Q2 obj1 = new Variable_Q2(101,"Megha");
        //Call the 'display method into the main method with obj1.
        obj1.display();
        //Create the second Object with name obj2 and pass the value '102', 'Prime'
        Variable_Q2 obj2 = new Variable_Q2(102,"Prime");
        //Call the 'display method into the main method with obj2.
        obj2.display();

    }


}
