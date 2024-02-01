class RandomizedSet {
    HashMap<Integer,Integer> hash=new HashMap<>();
    int[] ars=new int[200010];
    int dix=0;
    public RandomizedSet() {
    }

    public boolean insert(int val) {
        if(hash.containsKey(val)){
            return false;
        }
        hash.put(val,dix);
        ars[dix++]=val;
        return true;
    }

    public boolean remove(int val) {
        if(!hash.containsKey(val)){
            return false;
        }
        int temp=ars[--dix];
        ars[hash.get(val)]=temp;
        hash.put(temp,hash.get(val));
        hash.remove(val);
        return true;
    }

    public int getRandom() {
        return ars[ThreadLocalRandom.current().nextInt(dix)];
    }
}