package domain;

public class EnterDevice {
    private String enterType;
    private String label;
    
    public EnterDevice(String enterType, String label) {
        this.enterType = enterType;
        this.label = label;
    }

    public String getEnterType() {
        return enterType;
    }

    public void setEnterType(String enterType) {
        this.enterType = enterType;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    @Override
    public String toString() {
        return "enterType = " + enterType + ", label = " + label;
    }

}
