import java.util.Stack;

public class Implementasi_Tumpukan {
    public static void main(String[] args) {
        Stack kotor = new Stack();
        Stack bersih = new Stack();

        for (int i = 0; i <= 5; i++) {
            kotor.push("piring" + i);
        }

        System.out.println("SEBELUM DICUCI" + "\nJumlah piring kotor : " + kotor.size() + "\nJumlah piring bersih : " + bersih.size() + "\nTumpukan piring kotor :");

        for (int i = 0; i <= 5; i++) {
            System.out.println(kotor.peek());
            bersih.push(kotor.pop());
        }

        System.out.println("\nSETELAH DICUCI" + "\nJumlah piring kotor : " + kotor.size() + "\nJumlah piring bersih : " + bersih.size() + "\nTumpukan piring bersih :");

        for(int i = 4; i >= 0; i--){
            System.out.println(bersih.elementAt(i));
        }
    }
}
