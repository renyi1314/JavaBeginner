public class SingleTone1 {
    private static SingleTone1 instance = null;
    public static SingleTone1 getInstance (){
        if(instance ==null){
            instance = new SingleTone1();
        }
        return instance;
    }


}
