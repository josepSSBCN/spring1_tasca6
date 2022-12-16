package ClassPackage;

public class GenericMethods {
    //region METHODS
    public static <K, V, U> void print(K k, V v, U u){
        System.out.println(k);
        System.out.println(v);
        System.out.println(u);
    }

    //endregion METHODS


}
