package Generic_01;
/*
泛型类
 */
public class Generic <T> {
    private T t;
    public void setT(T t){
        this.t=t;
    }
    public T getT(){
        return t;
    }

}
