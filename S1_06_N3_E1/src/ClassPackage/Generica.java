package ClassPackage;

import InterfacePackage.Telefon;

public class Generica {

    public <T extends Telefon> void methodTelefon(T t) {
        t.trucar();
    }

    public <T extends Smartphone> void methodSmartpnone(T t) {
        t.ferFotos();
    }

}
