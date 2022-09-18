package switchDemo;

public class main {
    public static void main(String[] args) {
        char grade = 'B';

        switch (grade) {
            case 'A':
                System.out.println("Mükemmel bir not ile geçtiniz Tebrikler");
                break;
            case 'B':
                System.out.println("İyi bir not ile geçtiniz Tebrikler");
                break;
            case 'C':
                System.out.println("İyi geçtiniz Tebrikler");
                break;
            case 'D':
                System.out.println("Tebrikler geçtiniz");
                break;
            case 'F':
                System.out.println("Maalesef Kaldınız");
                break;
            default:
                System.out.println("Geçersiz bir harf notu girdiniz!");


        }
    }
}
