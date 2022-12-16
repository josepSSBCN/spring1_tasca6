package ClassPackage;

import InterfacePackage.Telefon;

public class Smartphone implements Telefon {
    @Override
    public void trucar() {
        System.out.println("S'està trucant des d'un Smaprtphone!");
    }

    public void ferFotos(){
        System.out.println("S'està fent una foto!!");
    }


}
