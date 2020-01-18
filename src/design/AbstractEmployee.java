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
    public void checkAnnualTraining(boolean trainingTaken){
        if(trainingTaken == true){
            System.out.println(employeeName()+" completed the yearly training requirement");
        }else{
            System.out.println(employeeName()+" must complete the yearly training");
        }
    }

}
