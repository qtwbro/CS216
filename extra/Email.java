import java.util.regex.*;
public class Email {
    public String email;

    public boolean verifyEmail() {
        Pattern pat = Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE);
        Matcher match = pat.matcher(this.email);
        return match.matches();
    }
    
    public static void main(String[] args) {
        Email e1 = new Email();
        e1.email = "whatever@gmail.com";
        if (e1.verifyEmail()) {
            System.out.println("" + e1.email + "is a valid email");
        }

    }
}
