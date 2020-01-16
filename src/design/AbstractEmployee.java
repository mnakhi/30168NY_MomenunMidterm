package design;

public abstract class AbstractEmployee implements Employee{
    private int vacationTaken;

    public AbstractEmployee(int vacationTaken) {
        this.vacationTaken = vacationTaken;
    }

    public int getVacationTaken() {
        return vacationTaken;
    }

    public void setVacationTaken(int vacationTaken) {
        this.vacationTaken = vacationTaken;
    }

    public AbstractEmployee(){}

    public abstract int vacationRemaining(int vacationTaken);
    public abstract void gettingPromoted(double performanceStar);
}
