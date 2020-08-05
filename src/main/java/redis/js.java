package redis;

import com.alibaba.fastjson.JSON;
import org.junit.jupiter.api.Test;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

public class js {
    @Test
    public void test1() {

        //获得连接对象
        Jedis jedis = new Jedis("192.168.126.129", 6379);

        //获得之前redis中存储的数据
        String name = jedis.get("name");
        System.out.println(name);

        //存储数据
        jedis.set("password", "123");
        System.out.println(jedis.get("password"));

        //关闭
        jedis.close();

    }


//    @Test
//    public void test2() {
//
//        // 创建池子的配置对象
//        JedisPoolConfig poolConfig = new JedisPoolConfig();
//
//        poolConfig.setMaxIdle(30);// 最大闲置个数
//        poolConfig.setMinIdle(10);// 最小闲置个数
//        poolConfig.setMaxTotal(50);// 最大连接数
//
//        // 1、创建一个redis的连接池
//        JedisPool pool = new JedisPool(poolConfig, "192.168.153.132", 6379);
//
//        // 2、从池子中获取redis的连接资源
//        Jedis jedisPoolResource= pool.getResource();
//
//        // 3、创建User类进行存储
//        User user = new User(1001, "李四", "123");
//        //将对象转换成json存储
//        jedisPoolResource.set("user", JSON.toJSONString(user));
//        String db_user = jedisPoolResource.get("user");
//        //返回json数据
//        System.out.println(db_user);
//
//        // 4、关闭资源
//        jedis.close();
//        pool.close();
//    }
}


