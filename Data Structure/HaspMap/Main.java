package DSA.HaspMap;

import javax.xml.stream.events.EndElement;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Main
{
    public static void main(String[] args)
    {

//        MapUsingHash map = new MapUsingHash();
//        map.put("Mango","Hi");
//        map.put("Apple","Hello");
//        map.put("Grapes","bye");

        HashMapFinal map = new HashMapFinal();
        map.put("Mango","Hi");
        map.put("Apple","Hello");
        map.put("Grapes","bye");

        System.out.println(map.get("Apple"));
        System.out.println(map.containsKey("Apple"));
        System.out.println(map);
//        HashMap<String , Integer> map = new HashMap<>();
//        map.put("Kk",96);
//        map.put("ok",97);
//        map.put("pk",98);
//        map.put("pk",933);
//
//        System.out.println(map);
//        System.out.println(map.get("Kk"));
//        System.out.println(map.getOrDefault("Kk",100));
//        System.out.println(map.containsKey("Kk"));
//
//        HashSet<Integer> set = new HashSet<>();
//
//        set.add(1);
//        set.add(1);
//        set.add(1);
//
//        System.out.println(set);
    }
}

class MapUsingHash
{
    private Entity[] entities;

    public MapUsingHash()
    {
        entities = new Entity[100];
    }

    private class Entity
    {
        String key;
        String value;

        public Entity(String key,String value)
        {
            this.key = key;
            this.value = value;
        }
    }

    public void put(String key,String value)
    {
        int hash = Math.abs(key.hashCode() % entities.length);
        entities[hash] = new Entity(key,value);
    }

    public String get(String key)
    {
        int hash = Math.abs(key.hashCode() % entities.length);
        if( entities[hash]!= null && entities[hash].key.equals(key) )
        {
            return entities[hash].value;
        }
        return null;
    }

    public void remove(String key)
    {
        int hash = Math.abs(key.hashCode() % entities.length);
        if( entities[hash]!= null && entities[hash].key.equals(key) )
        {
            entities[hash] = null;
        }
    }
}