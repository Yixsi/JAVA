package co.edu.utp.misiontic2022.c2;

public class Box {
    int width, height, depth;

    public Box(){

    }

    public Box(int width, int height, int depth){
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    public int volumeBox(){
        return width*height*depth;
    }
}
