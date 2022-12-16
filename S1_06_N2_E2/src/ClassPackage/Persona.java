package ClassPackage;

public class Persona {
    //region ATTRIBUTES
    private String name;
    private String cognom;
    private int edat;

    //endregion ATTRIBUTES


    //region CONSTRUCTOR

    public Persona(String name, String cognom, int edat) {
        this.name = name;
        this.cognom = cognom;
        this.edat = edat;
    }


    //endregion CONSTRUCTOR


    //region GETTERS & SETTERS
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCognom() {
        return cognom;
    }

    public void setCognom(String cognom) {
        this.cognom = cognom;
    }

    public int getEdat() {
        return edat;
    }

    public void setEdat(int edat) {
        this.edat = edat;
    }

    //endregion GETTERS & SETTERS


    //region METHODS

    //endregion METHODS


}
