import java.util.Scanner;
public class Programa {
    public static void main(String[] args) {
        float milla, metro;
        final int M= 1852;
        Scanner sc = new Scanner(System.in);
        System.out.println("escribe el valor de tu milla");
        milla= sc.nextFloat();
        metro = milla*M;
        System.out.println("metro="+ metro+ "metros");
        // double milla;
        // final int VALOR= 1852;
        // double metros= milla*VALOR;
        // System.out.println(millas+"millas = "+ metros +"metros");
    }
}
