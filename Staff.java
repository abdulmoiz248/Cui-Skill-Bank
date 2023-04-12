import java.util.Scanner;

public class Staff {
    Register register = new Register();
    Login login = new Login();
    Volunteer vol[]=new Volunteer[100];
    Matchup matchup=new Matchup();
    chatBox chatbox[]=new chatBox[100];

public void settingchat(chatBox[] chat)
{
    this.chatbox=chat;
}

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

public void choice()
{
    System.out.println("Select what you want to do:");
    System.out.println(" 1: Match up");
    System.out.println(" 2: Open Chatbox");
    System.out.println(" 3: Log out");
    System.out.print("Your Choice=");
    Scanner input = new Scanner(System.in);
    int x = input.nextInt();
    while (x!=3)
    {
        if (x==1)
            setMatchup();
        else if (x==2)
            setChatbox();
        else if (x==3)
            break;
        System.out.println("Select what you want to do:");
        System.out.println(" 1: Match up");
        System.out.println(" 2: Open Chatbox");
        System.out.println(" 3: Log out");
        System.out.print("Your Choice=");
         x = input.nextInt();
    }
}

public  void setMatchup()
{
      matchup.setVol(vol);
      matchup.matching();
}
   public void setChatbox()
   {
       System.out.println("Messages: ");
       for (int i=0;i< chatbox.length;i++)
       {
           if(chatbox[i].message!=null)
               System.out.println(chatbox[i].message);
       }
   }
   public void setvol(Volunteer[] vol) {
       this.vol = vol;
   }
}
