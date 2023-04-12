import java.util.Scanner;
public class Volunteer {
    Register register = new Register();
    Login login = new Login();
    skillNeeded needed= new skillNeeded();
    skillOffered offered = new skillOffered();

    public void setRegister() {
        String name;
        String password;
        String email;
        String phone;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Name: ");
        name = input.nextLine();
        System.out.print("Enter Email: ");
        email = input.nextLine();
        System.out.print("Enter Password: ");
        password = input.nextLine();
        System.out.print("Enter Phone: ");
        phone = input.nextLine();
        register.setEmail(email);
        register.setName(name);
        register.setPhone_no(phone);
        register.setPassword(password);
        login.setEmail(email);
        login.setName(name);
        login.setPhone_no(phone);
        login.setPassword(password);
    }
    public void choice_need() {
        System.out.println();

        System.out.println("Select what you want to do:");
        System.out.println(" 1: Add Skill");
        System.out.println(" 2: Remove skill");
        System.out.print("Your Choice=");
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        System.out.println();
        if (x == 1) {
                {
                    needed.addskill();
                }
        }

        else if (x == 2)
        {
                if (needed.skill != null)
                {
                      needed.removeskill();
                }
        }
         else
            System.out.println("Invalid");
    }

    public void choice_offer() {
        System.out.println("Select what you want to do:");
        System.out.println(" 1: Add Skill");
        System.out.println(" 2: Remove skill");
        System.out.print("Your Choice=");
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        System.out.println();
        if (x == 1)
        {

                    offered.addskill();

        }
        else if (x == 2)
        {

                if (offered.skill != null)
                {
                    offered.removeskill();
                }
        }
        else
            System.out.println("Invalid");
    }

    public void choice() {
        System.out.println("Select what you want to do:");
        System.out.println(" 1: Skills you can OFFER to other member");
        System.out.println(" 2: Skills you NEED from other member");
        System.out.println(" 3: View your Data");
        System.out.println(" 4: Log out");
        System.out.print("Your Choice=");
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        System.out.println();
        while (x != 4) {
            if (x == 1)
                choice_offer();
            else if (x == 2)
                choice_need();
            else if (x == 4)
                return;
            else if (x==3)
            {
                System.out.println("Name="+register.getName());
                System.out.println("Email="+register.getEmail());
                System.out.println("Password="+register.getPassword());
                System.out.println("Phone No.="+register.getPhone_no());
                System.out.println("Skill Offered="+offered.skill);
                System.out.println("Skill Needed="+needed.skill);
                System.out.println();
            }
            else
                System.out.println("Invalid..!!");

            System.out.println("Select what you want to do:");
            System.out.println(" 1: Skills you can OFFER to other member");
            System.out.println(" 2: Skills you NEED from other member");
            System.out.println(" 3: View your Data");
            System.out.println(" 4: Log out");
            System.out.print("Your Choice=");
            x = input.nextInt();
            System.out.println();
        }

    }
}