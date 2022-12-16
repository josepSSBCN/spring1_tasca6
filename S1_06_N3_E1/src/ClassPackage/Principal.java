package ClassPackage;


public class Principal{

    public static void main(String[] args) {
        // DEFINITION VARIABLES
        Smartphone mySmartphone = new Smartphone();
        Generica myGenerica= new Generica();

        // ACTIONS
        myGenerica.methodTelefon(mySmartphone);
        myGenerica.methodSmartpnone(mySmartphone);

    }

}
