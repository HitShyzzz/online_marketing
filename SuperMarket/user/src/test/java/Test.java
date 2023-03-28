import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;

public class Test {
    @Autowired
    RedisTemplate redisTemplate=null;
    @org.junit.Test
    public void test01(){
        System.out.println(System.currentTimeMillis());
    }
    @org.junit.Test
    public void testOpsForValue(){
        //以增量的方式将double值存储在变量中。
        double stringValueDouble = redisTemplate.opsForValue().increment("doubleKey",5);

        System.out.println("通过increment(K key, double delta)方法以增量方式存储double值:" + stringValueDouble);
    }
    @org.junit.Test
    public void testString(){
        String s="abc";
        String s1="deff";
        s=s1;
        //s="def";
        System.out.println(s);
    }
}
