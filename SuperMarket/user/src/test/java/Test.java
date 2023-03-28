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
        //�������ķ�ʽ��doubleֵ�洢�ڱ����С�
        double stringValueDouble = redisTemplate.opsForValue().increment("doubleKey",5);

        System.out.println("ͨ��increment(K key, double delta)������������ʽ�洢doubleֵ:" + stringValueDouble);
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
