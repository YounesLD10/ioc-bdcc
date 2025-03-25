package presentation;

import dao.DaoImp;
import metier.MetierImpl;

public class presvers1 {
    public static void main(String[] args) {
        DaoImp d = new DaoImp();
        MetierImpl metier = new MetierImpl(d);
        System.out.println(metier.calcul());
    }
}
