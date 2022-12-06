public class Lift {

    private StudentState openningState;
    private StudentState closingState;
    private StudentState runningState;
    private StudentState stoppingState;

    private StudentState mCurState;



    public Lift() {
        openningState = new Get5State(this);
        closingState = new HappyState(this);
        runningState = new GetGiftState(this);
        stoppingState = new FallasleepState(this);
    }


    public void get5() {
        mCurState.get5();
    }


    public void happy() {
        mCurState.happy();
    }


    public void getgift() {
        mCurState.getgift();
    }


    public void fallasleep() {
        mCurState.fallasleep();
    }


    public void setState(StudentState state) {
        this.mCurState = state;
    }



    public StudentState getOpenningState() {
        return openningState;
    }

    public StudentState getCloseingState() {
        return closingState;
    }

    public StudentState getRunningState() {
        return runningState;
    }

    public StudentState getStoppingState() {
        return stoppingState;
    }

    public static void main(String[] args) {
        Lift lift = new Lift();
        lift.setState(new HappyState(lift));
        lift.get5();
        lift.happy();
        lift.getgift();
        lift.fallasleep();
    }
}