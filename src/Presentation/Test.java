package Presentation;

import ma.projet.bean.Profile;
import ma.projet.bean.User;
import ma.projet.impl.ProfilesImpl;
import ma.projet.impl.UtilisateurImpl;

public class Test {
    public static void main(String[] args) {
        ProfilesImpl p = new ProfilesImpl();
        UtilisateurImpl u = new UtilisateurImpl();

        Profile cp = new Profile("CP", "chef de projet");
        Profile mn = new Profile("MN", "manager");
        Profile dp = new Profile("DP", "directeur de projet");
        Profile drh = new Profile("DRH", "directeur des RH");
        Profile dg = new Profile("DG", "directeur général");

        p.create(cp);
        p.create(mn);
        p.create(dp);
        p.create(drh);
        p.create(dg);

        u.create(new User("Amina", "Ayouchi", "amina@gmail.com", "0612345678", 10000, "amina", null, "Ser1", cp));
        u.create(new User("Soad", "Bourafiq", "soad@gmail.com", "0612345679", 12000, "soad", null, "Ser2", mn));
        u.create(new User("Amal", "Amrani", "amal@gmail.com", "0612345680", 11000, "amal", null, "Ser3", dp));
        u.create(new User("Ilhame", "Ayouchi", "ilhame@gmail.com", "0612345681", 13000, "ilhame", null, "Ser4", drh));
        u.create(new User("Mohammed", "Daouidi", "mohammed@gmail.com", "0612345682", 14000, "mohammed", null, "Ser5", dg));
        u.create(new User("Yassir", "Omar", "yassir@gmai.com", "0612345683", 15000, "yassir", null, "Ser6", mn));

        System.out.println("Liste des Managers:\n");
        for (User user : u.getAll()) {
            if (user.getProfile().getCode().equals("MN")) {
                System.out.println(user);
            }
        }
    }
}
