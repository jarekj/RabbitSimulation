import java.util.ArrayList;
import java.util.List;

public class Simulation {

    public ArrayList<Rabbit> maleRabbitList;
    public ArrayList<Rabbit> femaleRabbitList;

    public Simulation() {
        maleRabbitList = new ArrayList<Rabbit>();
        femaleRabbitList = new ArrayList<Rabbit>();
    }

    public int simulate(int maleCount, int femaleCount, long limit) {
        for (int i = 0; i < maleCount; i++) {
            maleRabbitList.add(new Rabbit());
        }
        for (int i = 0; i < femaleCount; i++) {
            femaleRabbitList.add(new Rabbit());
        }

        int months = 0;

        while (femaleRabbitList.size() + maleRabbitList.size() <= limit) {
            int femaleNumber = femaleRabbitList.size();
            for (int i = 0; i < femaleNumber; i++) {
                femaleRabbitList.get(i).agePlusOne();
                if (femaleRabbitList.get(i).getMonthsOld() >= 4) {
                    newPopulation();
                }
                if (femaleRabbitList.get(i).getMonthsOld() >= 96) {
                    femaleRabbitList.remove(i);
                }
            }
            int maleNumber = maleRabbitList.size();
            for (int i = 0; i < maleCount; i++) {
                maleRabbitList.get(i).agePlusOne();
                if (maleRabbitList.get(i).getMonthsOld() >= 96) {
                    maleRabbitList.remove(i);
                }
            }

            months++;
        }
        return months;
    }

    public void newPopulation() {
        for (int i = 0; i < 5; i++) {
            maleRabbitList.add(new Rabbit());
        }
        for (int i = 0; i < 14; i++) {
            femaleRabbitList.add(new Rabbit());
        }
    }

}


