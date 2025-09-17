package utenti;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<user> users = new ArrayList<>();

        user myuser = new user("io","123");
        user myuser1 = new Amministratore("jose","123","68958965");

        users.add(myuser);
        users.add(myuser1);

        for (user user : users){
            boolean isAdmin = false;

            if(user.role == Role.ADMIN){
                isAdmin = true;
            }
            
            System.out.println(isAdmin);
        }

    }
}
