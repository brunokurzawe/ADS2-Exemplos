public class Main {
    public static void main(String[] args) {
        boolean bo;
        char c;
        byte b;
        short s;
        int i;
        long l;
        float f;
        double d;

        c = 65;
        System.out.println("=============================");
        System.out.println("char");
        System.out.println("=============================");
        System.out.println("valor de c como char = " + c);
        System.out.printf("valor de c como numero = %d \n", (int) c);
        System.out.println("-----------------------------");

        b = 10;
        s = b;
        i = s;
        System.out.println("=============================");
        System.out.println("inteiros");
        System.out.println("=============================");
        System.out.println("i = s = b = " + i);

        i *= 100;
        System.out.println("novo valor de i = " + i);

        b = (byte)i;
        System.out.println("novo valor de b = "+b);

        l = i;
        System.out.println("valor de l = "+l);
        System.out.println("-----------------------------");
        System.out.println("=============================");
        System.out.println("ponto flutuante");
        System.out.println("=============================");
        d = 125.32;
        System.out.println("valor de d = " + d);
        d = 125.32d;
        System.out.println("valor de d = " + d);
        d = 125.32f;
        System.out.println("valor de d = " + d);

        f = (float)125.32;
        System.out.println("valor de f = " + d);
        f = 125.32f;
        System.out.println("valor de f = " + d);
        f = (float)125.32d;
        System.out.println("valor de f = " + d);
        System.out.println("-----------------------------");


        System.out.println("=============================");
        System.out.println("booleano");
        System.out.println("=============================");
        bo = true;
        System.out.println("valor de bo = " + bo);
        bo = (1 > 2);
        System.out.println("valor de bo = " + bo);
        bo = (f == d);
        System.out.println("valor de bo = " + bo);
        System.out.println("-----------------------------");

        System.out.println("=============================");
        System.out.println("brincando com os tipos");
        System.out.println("=============================");
        System.out.println("posso converter int para float?");
        System.out.println("i antes da conversao = " + i);
        System.out.println("f antes da conversao = " + f);
        f = i;
        System.out.println("i depois da conversao = " + i);
        System.out.println("f depois da conversao = " + f);
        System.out.println("--");

        f = (float)d;
        System.out.println("posso converter float para int?");
        System.out.println("i antes da conversao = " + i);
        System.out.println("f antes da conversao = " + f);
        i = (int)f;
        System.out.println("i depois da conversao = " + i);
        System.out.println("f depois da conversao = " + f);
        System.out.println("-----------------------------");
    }
}