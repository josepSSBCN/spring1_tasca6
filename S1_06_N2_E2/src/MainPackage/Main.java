package MainPackage;

import ClassPackage.GenericMethods;
import ClassPackage.Persona;
import ClassPackage.SafeBox;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //region DEFINITION VARIABLES
        SafeBox fortKnox = new SafeBox(2200, 1250, 1400);
        SafeBox bundesbank = new SafeBox(1300, 800, 800);
        List<SafeBox> mySafeBoxList = new ArrayList<>();

        Persona myPerson = new Persona("Gaius lulius", "Cesar", 66);
        Persona myPerson2 = new Persona("Amelia", "Earhart", 39);
        List<Persona> myPersonList = new ArrayList<>();

        List myMixedList = new ArrayList();

        //endregion DEFINITION VARIABLES


        //region ACTIONS
        Collections.addAll(mySafeBoxList, fortKnox, bundesbank);
        Collections.addAll(myPersonList, myPerson, myPerson2);
        Collections.addAll(myMixedList, myPerson, fortKnox, myPerson2, bundesbank);

        System.out.println("LLISTA TIPUS 1: Person");
        GenericMethods.print3(myPersonList);

        System.out.println("LLISTA TIPUS 2: SafeBox");
        GenericMethods.print3(mySafeBoxList);

        System.out.println("LLISTA TIPUS 3: Mixed");
        GenericMethods.print3(myMixedList);

        // Si es prova de passar un argument que no sigui tipus list, dona error
        ////*GenericMethods.print3("Dona error");

        //endregion ACTIONS


        // OUT

    }
}