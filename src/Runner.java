import java.util.ArrayList;
import java.util.Collections;

public class Runner
{
    public static void main(String[] args)
    {
        ArrayList<Chargeable> charge = new ArrayList<>();
        Phone p1 = new Phone(50, 200, 17);
        Phone p2 = new Phone(20, 160, 43);
        Phone p3 = new Phone(34, 50, 3);

        SolarFan s1 = new SolarFan(80, 100, 60);
        SolarFan s2 = new SolarFan(60, 98, 21);
        SolarFan s3 = new SolarFan(30, 375, 3);

        Computer c1 = new Computer(90, 12, 8);
        Computer c2 = new Computer(14, 46, 16);
        Computer c3 = new Computer(1, 155, 32);

        charge.add(p1);
        charge.add(p2);
        charge.add(p3);
        charge.add(s1);
        charge.add(s2);
        charge.add(s3);
        charge.add(c1);
        charge.add(c2);
        charge.add(c3);
        Collections.sort(charge);

        for(int i = 0; i < charge.size(); i++)
        {
            System.out.println(charge.get(i).getTimePerFullCharge());
        }

    }
}
