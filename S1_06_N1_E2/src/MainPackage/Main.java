package MainPackage;

import ClassPackage.GenericMethods;
import ClassPackage.Persona;

public class Main {
    public static void main(String[] args) {
        Persona myPerson = new Persona("Gaius lulius", "Cesar", 66);

        System.out.println("COMBINACIÓ 1: String, int, float");
        GenericMethods.print("Això és una string", 456, 3.1415f);
        System.out.println("COMBINACIÓ 2: float, String, int");
        GenericMethods.print(3.1415f, "Això és una string", 456);
        System.out.println("COMBINACIÓ 3: classe Persona, char, Dobuble");
        GenericMethods.print(myPerson.toString(), 'd', 3.1415e4);

    }
}


