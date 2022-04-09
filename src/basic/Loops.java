package basic;

public class Loops {
    public static void main(String[] args) {
       //for loop
        for (int glass = 1; glass<5; glass++) {
            System.out.println("Bangladesh "+glass); //every space counts inside the ("") where there is a message
        }
        //for each loop
        String car [] = {"Toyota", "Hyundai", "Mercedes", "Proton Saga"};
        for (String showroom : car ) { //here we need to store the variable into another variable
            System.out.println(showroom);
        }
        //while loop
        int banana = 10;
        while (banana < 15){
            System.out.println("It's very yucky " + banana);
            banana++; //we always need to put variable ++
        }
        //do while loop
        int flower = 6;
        do {
            System.out.println("do this while flower's value < 10 " + flower);
            flower++;
        } while (flower<10);

        //inner loop (for loop inside a for loop)
        for (int tv = 3; tv>15; tv++) {
     System.out.println("We have tv "+tv);
            for (int fridge = 2; fridge>12; fridge++){
                System.out.println("We have fridge "+fridge);
            }
        }





    }
}
/*There are 5 types of loops - For Loop, For Each Loop, While Loop, Do While Loop, Inner Loop.
* always write variable++ comdition under sout
* after the message write +variable to see how many times the message of the variable is printing
* String cannot be used in any loop types except for 'for each loop type'
*/
