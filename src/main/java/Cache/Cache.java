package Cache;

public class Cache<t1, t2> {

    private final int size;
    private CachePolicy<t1, t2> cachePolicy;

    public Cache(CachePolicyType type) throws Exception {
        this.size = 10;
        setPolicy(type);
    }

    public Cache(CachePolicyType type, int size) throws Exception {
        this.size = size;
        setPolicy(type);
    }

    public void setPolicy(CachePolicyType type) throws Exception {
        switch (type){
            case LRU:  this.cachePolicy = new LRU<t1, t2>(size); break;
            default: throw new Exception("No cache policy specified");
        }
    }

    public t2 get(t1 key){
        return this.cachePolicy.get(key);
    }

    public void put(t1 key, t2 value){
        this.cachePolicy.put(key, value);
    }

}
