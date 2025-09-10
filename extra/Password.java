import java.util.regex.*;
public class Password {
    private String passwd;

    public Password(String pass) {
        this.passwd = pass;
    }

    
    public boolean  verifyPassword() {
        Pattern pat = Pattern.compile("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{8,}$");
        Matcher match = pat.matcher(this.passwd);
        return match.matches();
    }

    public static void main(String[] args) {
        Password p1 = new Password("");
        if (p1.verifyPassword()) {
            System.out.println("Valid password");
        } else {
            System.out.println("Invalid password");
        }
    }
}
