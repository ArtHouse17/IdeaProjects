public class Get5State extends StudentState {


    public Get5State(Lift lift) {
        super(lift);
    }


    @Override
    public void get5() {

        System.out.println("Получить хорошую оценку");
    }

    @Override
    public void happy() {
        System.out.println("Быть счастливым за хорошую оценку");
        mStudent.setState(mStudent.getCloseingState());

        mStudent.happy();
    }

    @Override
    public void getgift() {

    }

    @Override
    public void fallasleep() {

    }
}