package source;

public class Coordinates {
    private Integer x; //Значение поля должно быть больше -138, Поле не может быть null
    private double y;

    public Coordinates(Integer x, double y){
        this.x = x;
        this.y = y;
    }

    public String toDigitalString(){return x.toString() + Double.toString(y);}

    @Override
    public String toString() {
        return x + " градусов по широте, " + y + " градусов по долготе";
    }
}
