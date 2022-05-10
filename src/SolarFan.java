public class SolarFan implements Chargeable
{
    private int chargePercent;
    // In minutes
    private int timePerFullCharge;
    //in (SPS) Spins Per Second
    private int spinSpeed;


    public SolarFan(int c, int t, int s)
    {
        chargePercent = c;
        timePerFullCharge = t;
        spinSpeed = s;
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
