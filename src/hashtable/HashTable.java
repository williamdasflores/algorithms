package hashtable;

public class HashTable {

    private Data[] data;

    public HashTable(int size) {
        this.data = new Data[size];
    }

    private int hash(String key) {
        int hash = 0;
        for (int i = 0; i < key.length(); i++) {
            hash = (hash + key.charAt(i) * i) % data.length;
        }
        return hash;
    }

   public void set(String key, int quantity) {
        int address = hash(key);
        if (data[address] == null) {
            data[address] = new Data(key, quantity);
        }
   }

   public Data get(String key) {
        int address = hash(key);
        Data currentData = data[address];
        if (currentData != null) {
            return data[address];
        }

        return null;
   }
}
