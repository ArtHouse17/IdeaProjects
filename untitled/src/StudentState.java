public abstract class StudentState {


    protected Lift mStudent;


    public StudentState(Lift lift) {
        this.mStudent = lift;
    }


    public abstract void get5();


    public abstract void happy();


    public abstract void getgift();


    public abstract void fallasleep();
}