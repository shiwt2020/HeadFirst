package cn.esthe.singleton;

public class ImproveSingleton {
    private static volatile ImproveSingleton singleton;

    private ImproveSingleton (){}

    public static ImproveSingleton getInstance(){
        if(singleton==null){
            synchronized (Singleton.class){
                singleton=new ImproveSingleton();
            }
        }
        return singleton;
    }
}