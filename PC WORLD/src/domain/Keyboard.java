package domain;

public class Keyboard extends EnterDevice{
    private final int idKeyboard;
    private static int keyboardsCounter;

    public Keyboard (String enterType, String label){
        super(enterType, label);
        this.idKeyboard = ++keyboardsCounter;
    }

    @Override
    public String toString() {
        return "Keyboard id = " + idKeyboard + ": " + super.toString();
    }

}
