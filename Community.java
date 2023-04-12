import java.util.Scanner;

public class Community {
    String Name;
    Activity activity=new Activity();

    public void setActivity() {
        System.out.print("Enter Community Name: ");
        Scanner s=new Scanner(System.in);
        this.Name=s.nextLine();
        System.out.print("Enter Activity Name: ");
        activity.name=s.nextLine();
        System.out.print("Enter Activity Description: ");
        activity.Description=s.nextLine();
        System.out.print("Enter Date/Time: ");
        activity.Date=s.nextLine();
    }
}
