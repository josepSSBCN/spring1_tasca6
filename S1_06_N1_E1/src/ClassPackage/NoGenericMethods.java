package ClassPackage;

public class NoGenericMethods {
    //region ATTRIBUTES
    private String attr1;
    private String attr2;
    private String attr3;

    //endregion ATTRIBUTES


    //region CONSTRUCTOR
    public NoGenericMethods(String attr1, String attr2, String attr3) {
        this.attr1 = attr1;
        this.attr2 = attr2;
        this.attr3 = attr3;
    }

    //endregion CONSTRUCTOR


    //region METHOD
    public void print(){
        System.out.println(String.format("Primer atribut rebut:     %s\r\nSegon atribut rebut:      %s\r\n" +
                "Tercer atribut rebut:      %s",this.attr1, this.attr2, this.attr3));
    }

    //endregion METHOD


    //region GETTERS & SETTERS

    public String getAttr1() {
        return attr1;
    }

    public void setAttr1(String attr1) {
        this.attr1 = attr1;
    }

    public String getAttr2() {
        return attr2;
    }

    public void setAttr2(String attr2) {
        this.attr2 = attr2;
    }

    public String getAttr3() {
        return attr3;
    }

    public void setAttr3(String attr3) {
        this.attr3 = attr3;
    }

    //endregion GETTERS & SETTERS


}
