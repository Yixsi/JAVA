package domain;

public class Order {
    private final int idOrder;
    private Computer computers[];
    private static int ordersCounter;
    private static int computersCounter;
    private static final int MAX_PC = 5;
    
    public Order() {
        this.idOrder = ++Order.ordersCounter;
        this.computers = new Computer[MAX_PC];
    }

    public void addComputer(Computer computer){
            if(computer.getIdComputer() <= MAX_PC){
                this.computers[computer.getIdComputer()-1] = computer;
            } else{
                System.out.println("Máximo de computadoras alcanzado");
            }
        }

    public void generateOrder(){
        System.out.println("-------- Orden " + idOrder + " ----------");
        for(Computer i: computers){
            if(i != null){
                System.out.println(i);
            }
        }
    }

    public int getComputersCounter() {
        return computersCounter;
    }

    public void setComputersCounter() {
        for(Computer i: computers){
            if(i != null){
                ++Order.computersCounter;
            }
        }
    } 
}


