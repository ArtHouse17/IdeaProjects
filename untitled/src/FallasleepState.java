public class FallasleepState extends StudentState {


    public FallasleepState(Lift lift) {
        super(lift);
    }

    @Override
    public void get5() {
        System.out.println("Получить 5");
        this.mStudent.setState(mStudent.getOpenningState());

        this.mStudent.get5();
    }

    @Override
    public void happy() {

    }

    @Override
    public void getgift() {

        this.mStudent.setState(mStudent.getRunningState());

        this.mStudent.getgift();
    }

    @Override
    public void fallasleep() {

        System.out.println("Получить подарок и выспаться");
    }


}