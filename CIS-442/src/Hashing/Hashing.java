package Hashing;

public class Hashing {
    
    public static int hash(String key, int tableSize){
        int hashValue = 0;
        for (int i = 0; i < key.length(); i++)
            hashValue = 37 * hashValue + key.charAt(i);
        hashValue %= tableSize;
        if(hashValue < 0) hashValue += tableSize;
        return hashValue;
    }
    public static void addElements(String[] hashTable, String[] keys) {
        for (int i = 0; i < keys.length; i++)
            hashTable[hash(keys[i], hashTable.length)] = keys[i];
    }

    public static void viewHashTable(String[] hashTable) {
        for (int i = 0; i < hashTable.length; i++)
            if (hashTable[i] != null) System.out.println("index = " + i + " key = " + hashTable[i]);
    }

    public static int getIndex(String key, String[] hashTable) {
        return(hash(key, hashTable.length));
    }

    //Hsub(k) = Hsub(0) + 37ksub(1) + 37^2ksub(2)
    //Hsub(k) = ((ksub(2) * 37 + ksub(1)) * 37 + ksub(0)

    public static void main(String[] args) {
        String[] hashTable = new String[29];
        int index = hash("Corey", hashTable.length);
        //"Corey", "Jonathan", "Emily", "Zach", "Samuel", "Dennis", "Jake"
        System.out.println("index = " + index);

    }
}
