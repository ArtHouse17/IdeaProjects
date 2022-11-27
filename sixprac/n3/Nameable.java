package sixprac.n3;

public interface Nameable {
    default String getName(){
        return "Этот метод выводит имя объекта";
    }
}
