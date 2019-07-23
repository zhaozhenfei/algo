package com.fly.skiplist;

/**
 * 跳跃表的节点，包括key-value和上下左右4个指针
 * @param <T>
 */
public class SkipListNode<T> {
    //data
    public Integer key;
    public T value;

    //links
    public SkipListNode<T> up;
    public SkipListNode<T> down;
    public SkipListNode<T> left;
    public SkipListNode<T> right;

    //special
    public static final int HEAD_KEY = Integer.MIN_VALUE;   //负无穷
    public static final int TAIL_KEY = Integer.MAX_VALUE;   //正无穷

    //constructor
    public SkipListNode(int key, T value){
        this.key = key;
        this.value = value;
    }

    public int getKey(){
        return key;
    }
    public void setKey(int key){
        this.key = key;
    }
    public T getValue(){
        return value;
    }
    public void setValue(T value){
        this.value = value;
    }
    public boolean equals(Object o){
        if (this==o){
            return true;
        }
        if (o==null){
            return false;
        }
        if (!(o instanceof SkipListNode<?>)){
            return false;
        }
        SkipListNode<T> ent;
        try {
            ent = (SkipListNode<T>) o; //检测类型
        }catch (ClassCastException ex) {
            return false;
        }
        return (ent.getKey()==key) && (ent.getValue()==value);
    }
    @Override
    public String toString(){
        return "key-value:"+key+"-"+value;
    }
}
