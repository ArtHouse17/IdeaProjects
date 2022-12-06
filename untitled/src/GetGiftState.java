public class GetGiftState extends StudentState {


    public GetGiftState(Lift lift) {
        super(lift);
    }


    @Override
    public void get5() {

    }

    @Override
    public void happy() {

    }

    @Override
    public void getgift() {

        System.out.println("Получаем подарок за хорошую учебу");
    }

    @Override
    public void fallasleep() {

        this.mStudent.setState(mStudent.getStoppingState());

        this.mStudent.fallasleep();
    }

}