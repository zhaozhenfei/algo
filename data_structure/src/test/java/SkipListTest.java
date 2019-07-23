import com.fly.skiplist.SkipList;
import com.fly.skiplist.java.SkipSet;
import org.junit.Test;


public class SkipListTest {
    @Test
    public void testSkipList(){
        SkipList<String> list = new SkipList<String>();
        System.out.println(list);
        list.put(2,"yan");
        list.put(1,"ll");
        list.put(3,"liang");
//        list.put(1,"li");  //测试同一个key值
        list.put(4,"李");
        list.put(6,"延");
        list.put(5,"亮");
        System.out.println(list);
        System.out.println(list.size());
    }

    @Test
    public void testSkipListJava(){
        SkipSet<Integer> ss = new SkipSet<Integer>();

        ss.insert(7);
        ss.insert(14);
        ss.insert(21);
        ss.insert(32);
        ss.insert(37);
        ss.insert(71);
        ss.insert(85);
        ss.insert(117);
        if (ss.contains(71)) {
            System.out.println("71 in list");
        }

        System.out.println(ss);

        ss.delete(7);
        System.out.println(ss);

        if (!ss.contains(7))
            System.out.println("7 has been deleted");

    }

}
