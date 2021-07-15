package domain;

public class Monitor {
    private final int idMonitor;
    private String label;
    private double size;
    private static int monitorsCounter;

    private Monitor(){
        this.idMonitor = ++Monitor.monitorsCounter;
    }

    public Monitor(String label, double size) {
        this();
        this.label = label;
        this.size = size;
    }

    public int getIdMonitor() {
        return this.idMonitor;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public int getMonitorsCounter() {
        return monitorsCounter;
    }

    @Override
    public String toString() {
        return "Monitor id = " + idMonitor + ": label = " + label + ", size = " + size;
    }

}
