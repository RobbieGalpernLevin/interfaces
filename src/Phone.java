public class Phone implements Chargeable
{
   private int chargePercent;
   // In minutes
   private int timePerFullCharge;
   private int numApps;

   public Phone(int c, int t, int a)
   {
       chargePercent = c;
       timePerFullCharge = t;
       numApps = a;
   }

   public int getChargePercent()
   {
       return chargePercent;
   }

    public void setChargePercent(int num)
    {
        chargePercent = num;
    }

    public int getTimePerFullCharge()
    {
        return timePerFullCharge;
    }

    public int compareTo(Object other)
    {
        Chargeable casted = (Chargeable) other;
        if(timePerFullCharge > casted.getTimePerFullCharge())
        {
            return 1;
        }
        else if(timePerFullCharge == casted.getTimePerFullCharge())
        {
            if(chargePercent > casted.getChargePercent())
            {
                return 1;
            }
            else if(chargePercent < casted.getChargePercent())
            {
                return -1;
            }
            return 0;
        }
        return -1;
    }

}
