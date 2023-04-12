import java.util.Objects;

public class Matchup {

    static int totalmatch=0;

    public static int getTotalmatch() {
        return totalmatch;
    }

    public static void setTotalmatch(int totalmatch) {
        Matchup.totalmatch = totalmatch;
    }

    staffForm sf[]=new staffForm[100];

    public Volunteer[] getVol() {
        return vol;
    }

    public void setVol(Volunteer[] vol) {
        this.vol = vol;
    }

    public Matchup() {
    }

     Volunteer vol[]=new Volunteer[100];

    public Matchup(Volunteer vol[])
    {
for(int i=0;i< vol.length;i++) {
    vol[i] = new Volunteer();

}
        for(int i=0;i< vol.length;i++)
        this.vol[i] = vol[i];
    }
    public void matching()
    {

        for(int i=0;i<sf.length;i++)
        {
            sf[i]=new staffForm();
        }
        for(int i=0;i< vol.length;i++)
            for (int j=0;j< vol.length;j++)
            {

             if(vol[i].offered.skill!=null )
                 if(vol[j].needed.skill!=null)
                     if(Objects.equals(vol[i].offered.skill,vol[j].needed.skill))
                {

                  sf[i].setEmailoffer(vol[i].register.getEmail());
                  sf[i].setNameoffer(vol[i].register.getName());
                  sf[i].setPhoneoffer(vol[i].register.getPhone_no());
                  sf[j].setEmailoffer(vol[j].register.getEmail());
                  sf[j].setNameoffer(vol[j].register.getName());
                  sf[j].setPhoneoffer(vol[j].register.getPhone_no());
                  totalmatch++;
                }
            }
        String a="Name";
        String b="Email";
        String c="Phone Number";
        System.out.printf("%s %10s %15s",a,b,c);
        System.out.println();
       for (int i=0;i<sf.length;i++)
       {
           if(sf[i].nameoffer!=null)
           {
               System.out.printf("%s %12s %20s",sf[i].getNameoffer(),sf[i].getEmailoffer(),sf[i].getPhoneoffer());
               System.out.println();
           }
       }
        System.out.println();

    }
}
