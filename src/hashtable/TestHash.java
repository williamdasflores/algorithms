package hashtable;

public class TestHash {

    public static void main(String ...args) {
        HashTable myHash = new HashTable(10);
        myHash.set("grapes", 1000);
        myHash.set("apple", 10);
        myHash.set("pineapple", 15);
        System.out.println(myHash.get("apple"));
        System.out.println(myHash.get("grapes"));
        System.out.println(myHash.get("pineapple"));
    }
}
