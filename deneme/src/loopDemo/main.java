package loopDemo;

public class main {
    public static void main(String[] args) {
        for (int i=0;i<10;i+=2){
            System.out.println(i);
        }
        System.out.println("For Döngüsü bitti");

        int i=0;
        //While
        while (i<10){
            System.out.println(i);
            i+=2;
        }
        System.out.println("While Döngüsü Bitti");

        //Do-While
        int j=100;
        do{

                System.out.println(j);
                j+=2;
        }while (j<10);
        System.out.println("Do-While Döngüsü Bitti");

    }
}
