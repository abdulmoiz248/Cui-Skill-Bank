import java.util.Objects;
import java.util.Scanner;
public class Login extends Register{
   static   String login_email;
   static String login_password;

    public String getLogin_email() {
        return login_email;
    }

    public String getLogin_password() {
        return login_password;
    }

    public void setLogin_email(String login_email) {
        this.login_email = login_email;
    }

    public void setLogin_password(String login_password) {
        this.login_password = login_password;
    }
    public void setLogin(Volunteer vol[]) {
        Scanner input = new Scanner(System.in);
        int x=0;
        for(int i=0;i< vol.length;i++)
        {

            System.out.print("Enter Email: ");
            this.login_email = input.nextLine();
            System.out.print("Enter Password: ");
             this.login_password = input.nextLine();
        for(int j=0;j<vol.length;j++)
        {
            x = vol[j].login.check();
            if (x == 1) {
                vol[j].choice();
                return;
            }
        }
            if(x==2) System.out.println("Invalid Email or Password..!!");
        }
    }
    public void setLoginstaff(Staff staff[]) {
        Scanner input = new Scanner(System.in);
        int x=0;
        for(int i=0;i< staff.length;i++)
        {
            System.out.print("Enter Email: ");
            login_email = input.nextLine();
            System.out.print("Enter Password: ");
            login_password= input.nextLine();
            for(int j=0;j<staff.length;j++) {
                x = staff[j].login.check();
                if (x == 1) {
                    staff[j].choice();
                    return;
                }
            }if(x==2) System.out.println("Invalid Email or Password..!!");
        }
    }

    public int check()
    {
        if(login_email.equals(getEmail())){
            if (login_password.equals(getPassword())) {
                System.out.println("Successfully Logged In..!!");
                return 1;
            }
        }
        return 2;
    }
}


