package utenti;

enum Role {
    ADMIN, DEFAULT
}

public class user {
    private String username, pswd;
    Role role;

    public user(String username, String pswd) {
        this.username = username;
        this.pswd = pswd;
        this.role = Role.DEFAULT;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPswd() {
        return pswd;
    }

    public void setPswd(String pswd) {
        this.pswd = pswd;
    }
}

class Amministratore extends user {
    private String pswd_gen;

    public Amministratore(String username, String pswd, String pswd_gen) {
        super(username, pswd);
        this.pswd_gen = pswd_gen;
        this.role = Role.ADMIN;
    }

    public String getPswd_gen() {
        return pswd_gen;
    }

    public void setPswd_gen(String pswd_gen) {
        this.pswd_gen = pswd_gen;
    }
}