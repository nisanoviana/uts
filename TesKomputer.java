/**
 * Created by nicun on 5/12/2015.
 */
public class TesKomputer
{
    public static void main(String[] args)
    {
        Notebook04 asus = new Notebook04(3500, 4000, 80000, 7000);
        asus.CetakSpesifikasi();
        asus.Overclock(3000);
        asus.Overclock(3200);
    }
}

