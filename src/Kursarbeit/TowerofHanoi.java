package Kursarbeit;

public class TowerofHanoi {
    static void towerOfHanoi(int Scheibe, char a, char c, char b)
    {
        if (Scheibe == 1)
        {
            System.out.println("Nehmen Sie Scheibe 1 von Stab  " +  a + " zu Stab " + c);
            return;
        }
        towerOfHanoi(Scheibe-1, a, b, c);
        System.out.println("Nehmen Sie Scheibe " + Scheibe + " von Stab " +  a + " zu Stab " + c);
        towerOfHanoi(Scheibe-1,b , c, a);
    }

    public static void main(String args[])
    {
        //Geben Sie die Nummer der Scheiben ein
        int Scheibe = 3;
        towerOfHanoi(Scheibe,'A','C', 'B');
    }

}