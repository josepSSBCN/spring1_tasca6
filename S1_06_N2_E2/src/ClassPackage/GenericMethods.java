package ClassPackage;

import java.util.List;

public class GenericMethods {
    //region METHODS

    /**
     * Method with 3 arguments of generic types
     */
    public static <K, V, U> void print(K k, V v, U u){
        System.out.println(k);
        System.out.println(v);
        System.out.println(u);
    }

    /**
     * Method with 2 arguments generics and 1 not
     */
    public static <K, V> void print2G1No(K k, V v, String stringIn){
        System.out.println(k);
        System.out.println(v);
        System.out.println(stringIn);
    }

    /**
     * Method with an argument generic limited to type List
     */
    public static <T extends List> void print3(T blackList){
        System.out.println(blackList);
    }

    //endregion METHODS


}
