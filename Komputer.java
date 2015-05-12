/**
 * Created by nicun on 5/12/2015.
 */
public class Komputer {
    public int Prosesor;
    public int Memori;
    public int Storage;


    public Komputer() {
        Prosesor = 500;
        System.out.println("Kecepatan Prosesor Komputer : " + Prosesor);

    }
}
        class Notebook04 extends Komputer {
            public int Baterai;

            public Notebook04 (int a, int n, int i, int s) {
                Prosesor = a;
                Memori = n;
                Storage = i;
                Baterai = s;
            }
            public void CetakSpesifikasi(){
            System.out.println("Kecepatan Prosesor Notebook :" +Prosesor);
            System.out.println("Kapasitas Memori :" +Memori);
            System.out.println("Kapasitas Storage :" +Storage);
            System.out.println("Kapasitas Baterai :" +Baterai);

    }
        public void Overclock (int a){
        Prosesor=a;
        System.out.println("Notebook04 dioverclock dengan kecepatan prosesor  :" +Prosesor);
    }
    }


