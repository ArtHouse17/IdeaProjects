package sixprac.n3;

public class Men implements Nameable {
    private String name;

    Men(String name){
        this.name=name;
    }

    @Override
    public String getName() {
        return name;
    }
}
