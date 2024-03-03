public class Dataconnection {

    private static volatile Dataconnection dc;
    private Dataconnection(){

    }
    public static Dataconnection getDataconnection(){
        if(dc == null){
            synchronized(Dataconnection.class){
                if(dc == null)
                    dc = new Dataconnection();
            }
        }
        return dc;
    }
    public void getdata(){
        System.out.println("abc");
    }
}