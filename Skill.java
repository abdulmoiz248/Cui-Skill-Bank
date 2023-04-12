import java.util.Scanner;

public abstract class  Skill {
    String skill;
    String note;
    String Date_Time;

    public String getSkill() {
        return skill;
    }

    public void setSkill(String skill) {
        this.skill = skill;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public String getDate_Time() {
        return Date_Time;
    }

    public void setDate_Time(String date_Time) {
        Date_Time = date_Time;
    }


   public void removeskill()
   {
       Scanner input=new Scanner(System.in);
       System.out.print("Enter Skill: ");
       String skill=input.nextLine();
       if(skill.equals(this.skill))
       {
           this.skill=null;
           System.out.println("Skill Removed..!! ");
               this.note=null;
               this.Date_Time=null;
              return;
       }
       System.out.println("Skill not Found..!!");

      }
      public void addskill()
      {
          Scanner scanner=new Scanner(System.in);

          System.out.print("Enter Skill: ");
          String skill=scanner.nextLine();
          this.skill=skill;
          System.out.print("Enter Note: ");
          String note=scanner.nextLine();
          this.note=note;
          System.out.print("Enter Date/Time: ");
          String date=scanner.nextLine();
          this.Date_Time=date;

      }
}
