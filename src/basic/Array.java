package basic;

import java.lang.module.ResolvedModule;

public class Array {
    public static void main(String[] args) {
        String[] names = {"Snowva", "Nusrat", "Derham"};
        System.out.println(names[0]);
        System.out.println(names[1]);
        System.out.println(names.length); //to know the length of the values in a variable//
        for(int value = 0;value<names.length; value++){
            System.out.println(names[value]);
        }
        int [] remote = new int[3];
        remote [0] = 35;
        remote [1] = 21;
        remote [2] = 27;
        System.out.println(remote [0]);
        System.out.println(remote.length);
        int[] remote2 = remote.clone();//storing the remote variable's data into remote2
        for(int newValue = 0; newValue<remote2.length; newValue++){
            System.out.println(remote2[newValue]);
        }


    }
}
/* Array is used to store multiple value inside a single variable
* Arrays are fixed in length. We can enter only the fixed amount that we put in (nothing more or less)
* Array can hold same type of data, (eg: we can't mix data types)
* the default value of array is zero.
* Array is index based; index value = 0.
* System.out.println(names.getClass().getName()); - to get the class of the variable.
* */