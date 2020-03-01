package comands;

public abstract class abstractCommand implements executable{
    private String name;
    private String description;

    public String toString(){
        return name + " - " + description;
    }


}
