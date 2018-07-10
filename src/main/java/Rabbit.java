import java.util.ArrayList;

public class Rabbit {

    int monthsOld;


    public Rabbit() {
        this.monthsOld = 0;
    }

    public int getMonthsOld() {
        return monthsOld;
    }

    public void setMonthsOld(int monthsOld) {
        this.monthsOld = monthsOld;
    }

    public void agePlusOne(){
        monthsOld++;
    }
}
