package DSA.HaspMap;

import javax.xml.stream.events.EndElement;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class HashMapFinal<K,V>
{
    private int size = 0;
    private float lf = 0.5f;
    ArrayList<LinkedList<Entity>> list;

    public HashMapFinal()
    {
        list = new ArrayList<>();
        for (int i = 0; i < 10; i++)
        {
            list.add(new LinkedList<>());
        }
    }

    public void put(K key,V value)
    {
        int hash = Math.abs(key.hashCode() % list.size());
        LinkedList<Entity> entities = list.get(hash);

        for(Entity entity : entities)
        {
            if(entity.key.equals(key))
            {
                entity.value = (V) value;
                return;
            }
        }

        if((float)(size) / list.size() > lf)
        {
            reHash();
        }

        entities.add(new Entity((K) key,(V) value));
        size++;
    }

    public void reHash()
    {
        System.out.println("we are now rehashing...!");

        ArrayList<LinkedList<Entity>> old = list;
        list = new ArrayList<>();
        size=0;
        for(int i=0;i<old.size()*2;i++)
        {
            list.add(new LinkedList<>());
        }

        for(LinkedList<Entity> entries : old)
        {
            for(Entity entry : entries)
            {
                put((K) entry.key,(V) entry.value);
            }
        }
    }

    private class Entity
    {
        K key;
        V value;

        public Entity(K key,V value)
        {
            this.key = key;
            this.value = value;
        }
    }

    public V get(K key)
    {
        int hash = Math.abs(key.hashCode() % list.size());
        LinkedList<Entity> entities = list.get(hash);

        for(Entity entity : entities)
        {
            if(entity.key.equals(key))
            {
                return (V) entity.value;
            }
        }
        return null;
    }

    public void remove(K key)
    {
        int hash = Math.abs(key.hashCode() % list.size());
        LinkedList<Entity> entities = list.get(hash);

        Entity target = null;

        for (Entity entity : entities)
        {
            if(entity.key.equals(key))
            {
                target = entity;
                break;
            }
        }

        entities.remove(target);
        size--;
    }

    public boolean containsKey(K key)
    {
        return get(key) != null;
    }

    @Override
    public String toString()
    {
        StringBuilder builder = new StringBuilder();
        builder.append("{");
        for(LinkedList<Entity> entities : list)
        {
            for(Entity entity : entities)
            {
                builder.append(entity.key);
                builder.append(" = ");
                builder.append(entity.value);
                builder.append(" , ");
            }
        }
        builder.append("}");

        return builder.toString();
    }
}

