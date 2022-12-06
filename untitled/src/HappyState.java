public class HappyState extends StudentState {


    public HappyState(Lift lift) {
        super(lift);
    }


    @Override
    public void get5() {
        // Выполняем действие открытия двери
        // 1. Перейти в открытое состояние
        this.mStudent.setState(mStudent.getOpenningState());
        // 2. Открываем дверь
        this.mStudent.get5();
    }

    @Override
    public void happy() {
        System.out.println("Обрадоваться");
    }

    @Override
    public void getgift() {

        this.mStudent.setState(mStudent.getRunningState());

        this.mStudent.getgift();
    }

    @Override
    public void fallasleep() {

        this.mStudent.setState(mStudent.getStoppingState());

        this.mStudent.fallasleep();
    }

}