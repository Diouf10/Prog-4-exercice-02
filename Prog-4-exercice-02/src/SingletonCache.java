public class SingletonCache {
    private static SingletonCache instance;

    private SingletonCache() {
    }

    public static SingletonCache getInstance() {
        if (instance == null) {
            instance = new SingletonCache();
        }
        return instance;
    }
}
