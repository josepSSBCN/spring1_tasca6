package MainPackage;

import ClassPackage.GenericMethods;
import ClassPackage.Persona;

public class Main {
    public static void main(String[] args) {
        Persona myPerson = new Persona("Gaius lulius", "Cesar", 66);
        Persona myPerson2 = new Persona("Amelia", "Earhart", 39);

        System.out.println("COMBINACIÓ 1: Person, char, String");
        GenericMethods.print2G1No(myPerson, 'd', "Sempre ha de ser un string");
        System.out.println("COMBINACIÓ 2: Person, Person, String");
        GenericMethods.print2G1No(myPerson, myPerson2, "Sempre ha de ser un string");
        System.out.println("COMBINACIÓ 3: int, int, String");
        GenericMethods.print2G1No(44, 1937, "Sempre ha de ser un string");

    }
}


