import java.util.Scanner;

public class Director {

    String name;

    public void report(Volunteer[] vol , Staff staff[], chatBox[] chat , Community[] community)
    {
        System.out.print("Enter code: ");
        Scanner s= new Scanner(System.in);
        int x=s.nextInt();
        System.out.println();
        if(x==1234)
        {
            System.out.print("Display Report (Y/N): ");
            char c=s.next().charAt(0);
            System.out.println();
            if(c=='Y')
            {
                System.out.println("Volunteers: ");
                System.out.println("Name          Phone          Email");
                for (int i =0 ;i< vol.length;i++)
                {
                    if(vol[i].register.name!=null)
                    {
                        System.out.printf(vol[i].register.name + "        " + vol[i].register.phone_no + "        " + vol[i].register.getEmail());
                        System.out.println();
                    }
                }
                System.out.println();
                System.out.println("Skill Offered:");
                for (int i =0 ;i< vol.length;i++)
                {
                    if(vol[i].offered.skill!=null)
                    System.out.println(vol[i].offered.skill);
                }
                System.out.println();
                System.out.println("Skill Needed:");
                for (int i =0 ;i< vol.length;i++)
                {
                    if (vol[i].needed.skill!=null)
                    System.out.println(vol[i].needed.skill);
                }
                System.out.println();
                System.out.println("Messages: ");
                for (int i=0;i< chat.length;i++)
                {
                    if(chat[i].message!=null)
                        System.out.println(chat[i].message);
                }
                System.out.println();
                System.out.println("Communities: ");
                for (int i=0;i<community.length;i++)
                if (community[i].Name!=null)
                {
                    System.out.println("Community Name: "+community[i].Name);
                    System.out.println("Activity Name: "+community[i].activity.name);
                    System.out.println("Description: "+community[i].activity.Description);
                    System.out.println("Date/Time: "+community[i].activity.Date);
                }
                System.out.println();
                System.out.println("Staff: ");
                System.out.println("Name          Phone          Email");
                for (int i=0;i<staff.length;i++)
                if(staff[i].register.name!=null)
                {
                    System.out.printf(staff[i].register.name+"        "+staff[i].register.phone_no+"        "+staff[i].register.getEmail());
                    System.out.println();
                }
                System.out.println("Total Match up= "+ staff[0].matchup.getTotalmatch());

            }//if end
            else
            {
                System.out.println("No Selected..!!");
                return;
            }
        }
        else System.out.println("Invalid Code..!!");
    }
}
