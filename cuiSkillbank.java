import java.util.Scanner;

public class cuiSkillbank {

    public static void main(String[] args) {

        int membercount=0;
        int staffcount=0;
        chatBox chat[]=new chatBox[100];
        Volunteer vol[]=new Volunteer[100];
        Community community[]=new Community[10];
        Login login=new Login();
        Director director=new Director();
        for (int i=0;i<community.length;i++)
            community[i]=new Community();
        for(int i=0;i< vol.length;i++)
        {
            vol[i]=new Volunteer();
        }
        Staff staff[]=new Staff[10];
        for(int i=0;i< staff.length;i++)
        {
            staff[i]=new Staff();
            staff[i].setvol(vol);
            staff[i].settingchat(chat);
        }

        for (int i=0;i<chat.length;i++)
        {
          chat[i]=new chatBox();
        }

        System.out.println("                               Welcome to Cui Skill Bank");
        System.out.print("Enter Passcode#");
        Scanner input=new Scanner(System.in);
        int pass=input.nextInt();

        if(pass==1234)
        {
            int ext;
         do {
             System.out.println();
             System.out.println("Select what you are: ");
             System.out.println("  1: Director");
             System.out.println("  2: Staff Member");
             System.out.println("  3: Volunteer");
             System.out.println("  4: Open Chat Box");
             System.out.println("  5: Community");
             System.out.println("  6: Log out");
             System.out.print("Your Extension#");
             ext = input.nextInt();
             System.out.println();
             if (ext == 6)
             {
                 System.out.println("Successfully logged out..!!");
                 return;
             } else if (ext==3)
             {
                 System.out.println("Select what you want to do: ");
                 System.out.println("   1: Register");
                 System.out.println("   2: Login in");
                 System.out.println("   3: Cancel");
                 System.out.print("Your Extension#");
                 int ext_2= input.nextInt();
                 System.out.println();
                 if (ext_2==3) continue;
                 else if(ext_2==1)
                 {

                     System.out.println("Membership Number#"+(membercount+1));
                     membercount++;
                     System.out.println();
                     for (int i=0;i< vol.length;i++)
                         if(vol[i].login.name==null)
                         {
                             vol[i].setRegister();
                             break;
                         }
                 } else if (ext_2==2)
                 {
                     login.setLogin(vol);
                 }

             } else if (ext==2)
             {
                 System.out.println("Select what you want to do: ");
                 System.out.println("   1: Register");
                 System.out.println("   2: Login in");
                 System.out.println("   3: Cancel");
                 System.out.print("Your Extension#");

                 int ext_3= input.nextInt();
                 System.out.println();
                 if (ext_3==3) continue;
                 else if(ext_3==1)
                 {
                     System.out.println("Staff Membership Number#"+(staffcount+1));
                     staffcount++;
                     System.out.println();
                     staff[staffcount].setRegister();
                 } else if (ext_3==2)
                 {
               login.setLoginstaff(staff);
                 }

             } else if (ext==1)
             {
                 director.report(vol,staff,chat,community);
             }
             else if (ext==4)
             {
                 Scanner in=new Scanner(System.in);
                 System.out.print("Type Your Message: ");
               for(int i=0;i<chat.length;i++)
                   if(chat[i].message==null) {
                       chat[i].message = in.nextLine();
                       break;
                   }
                 System.out.println();
                 System.out.println("Message sent..Our Staff will Shortly reply..!!");
             }
             else if (ext==5)
             {
                  for(int i=0;i<community.length;i++)
                  {
                      if(community[i].Name==null)
                      {
                      community[i].setActivity();
                      break;
                      }
                      }
             }

         }while (ext!=6);
        }
        else System.out.println("Invalid Passcode..!!");
    }//Main end
}//Class end
