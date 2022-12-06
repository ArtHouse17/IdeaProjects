public class Lift {
    // Определяем все состояния лифта
    private StudentState openningState;
    private StudentState closingState;
    private StudentState runningState;
    private StudentState stoppingState;

    // Определяем текущий статус лифта
    private StudentState mCurState;


    /**
     * Метод строительства
     */
    public Lift() {
        openningState = new Get5State(this);
        closingState = new HappyState(this);
        runningState = new GetGiftState(this);
        stoppingState = new FallasleepState(this);
    }

    /**
     * Выполните действие открытия двери
     */
    public void get5() {
        mCurState.get5();
    }

    /**
     * Выполнить действие закрытия двери
     */
    public void happy() {
        mCurState.happy();
    }

    /**
     * Выполнять беговые действия
     */
    public void getgift() {
        mCurState.getgift();
    }

    /**
     * Выполните стоп-действие
     */
    public void fallasleep() {
        mCurState.fallasleep();
    }


    public void setState(StudentState state) {
        this.mCurState = state;
    }

    // ################## Получить полный статус лифта ###################

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