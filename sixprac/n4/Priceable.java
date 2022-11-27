package sixprac.n4;

public interface Priceable {
    default int getPrice(){
        return -1;
    }
}
