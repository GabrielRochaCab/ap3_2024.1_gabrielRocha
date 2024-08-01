package unidade1.gabarito_aula2;

public class TiposPrimitivos {

    public static void main(String[] args) {
        System.out.println();
        System.out.println("mostrarTiposPrimitivos()");
        System.out.println();
        mostrarTiposPrimitivos();

        System.out.println();
        System.out.println("iguaisOuDiferentes()");
        System.out.println();
        iguaisOuDiferentes();
    }

    public static void mostrarTiposPrimitivos() {
        byte varByte = 100;
        short varShort = 10000;
        int varInt = 1234;
        Integer varInteger = 1235;
        long varLong = 90000000000L;
        float varFloat = 10.5f;
        double varDouble = 20.99;
        boolean varBoolean = true;
        char varChar = 'A';


        String varString = "Olá, Javali!";

        System.out.println("umByte: " + varByte);
        System.out.println("umShort: " + varShort);
        System.out.println("umInt: " + varInt);
        System.out.println("umInteger: " + varInteger);
        System.out.println("umLong: " + varLong);
        System.out.println("umFloat: " + varFloat);
        System.out.println("umDouble: " + varDouble);
        System.out.println("umBoolean: " + varBoolean);
        System.out.println("umChar: " + varChar);
        System.out.println("umaString: " + varString);
        System.out.println("umInt + umInteger = " + (varInt + varInteger));
    }


    public static void iguaisOuDiferentes() {
     
        int a = 10;
        int b = 20;
        System.out.println("Comparando tipos primitivos:");
        System.out.println("a=" + a);
        System.out.println("b=" + b);
        System.out.println("a é igual a b? " + (a == b));

        // Comparação de objetos do tipo String
        System.out.println();
        System.out.println("Comparando objetos:");
        String str1 = "Olá";
        String str2 = "Olá";
        String str3 = new String("Olá");

        System.out.println("str1=" + str1);
        System.out.println("str2=" + str2);
        System.out.println("str3=" + str3);

        System.out.println("str1 == str2? " + (str1 == str2));
        System.out.println("str1 == str3? " + (str1 == str3));
        System.out.println("str1.equals(str3)? " + (str1.equals(str3)));

    }
}
