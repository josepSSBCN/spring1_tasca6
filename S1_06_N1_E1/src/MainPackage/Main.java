package MainPackage;

import ClassPackage.NoGenericMethods;

public class Main {
    public static void main(String[] args) {
        String myString1 = "String number 1", myString2 = "String number 2", myString3 = "String number 3";
        NoGenericMethods myNoGenericMe;

        myNoGenericMe = new NoGenericMethods(myString1, myString2, myString3);
        myNoGenericMe.print();

        myNoGenericMe = new NoGenericMethods(myString3, myString1, myString2);
        myNoGenericMe.print();

        myNoGenericMe = new NoGenericMethods(myString2, myString3, myString1);
        myNoGenericMe.print();


    }
}