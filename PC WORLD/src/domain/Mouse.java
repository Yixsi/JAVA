package domain;

public class Mouse extends EnterDevice{
    private final int idMouse;
    private static int mouseCounter;

    public Mouse (String enterType, String label){
        super(enterType, label);
        this.idMouse = ++Mouse. mouseCounter;
    }

    @Override
    public String toString() {
        return "Mouse id = " + idMouse + ": " + super.toString();
    }

}
