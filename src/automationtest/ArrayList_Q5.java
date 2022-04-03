package automationtest;

import java.util.ArrayList;

public class ArrayList_Q5 {
    public static void main(String[] args) {
        //Declare the string type ArrayList and
       // add the values "Scrum", "Java", "Jira", "Selenium", "Cucumber", "Postman", “Rest Assured”
        ArrayList<String> language = new ArrayList();
        language.add("Scrum");
        language.add("Java");
        language.add("Jira");
        language.add("Selenium");
        language.add("Cucumber");
        language.add("Postman");
        language.add("Rest Assured");

        //Print the list using a forEach loop.

        for(String name : language){
            System.out.println(name);
        }



    }

}
