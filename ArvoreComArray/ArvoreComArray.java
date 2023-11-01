package ArvoreComArray;

public class ArvoreComArray {
    private int h;
    private Integer array[];

    public ArvoreComArray(int h){
        this.h = h;
        this.array = new Integer[getMaxQtd()];
    }
    private int getMaxQtd(){
        int tmp = (int) (Math.pow(2,this.h+1) -1);
        return tmp ;
    }
}
