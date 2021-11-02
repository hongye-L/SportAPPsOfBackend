package ApplicaionOfVideos.Util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.data.redis.connection.RedisConnection;
import org.springframework.data.redis.core.RedisCallback;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Component;

@Component
public class RedisUtil {
    @Autowired
    private StringRedisTemplate stringRedisTemplate;
    @Autowired
    private RedisTemplate<?,?> redisTemplate;
    /*
     * 设置key和对象的value
     *
     * @param key key
     * @param value value
     */
    public void set(final String key,Object value,final long I){
        final byte[] bytes= SerializeUtil.serialize(value);
        redisTemplate.execute(new RedisCallback<Object>() {
            @Override
            public Object doInRedis(RedisConnection redisConnection)throws DataAccessException{
                redisConnection.setEx(redisTemplate.getStringSerializer().serialize(key),I,bytes);
                return null;
            }
        });
    }
    /*
     * 根据key来取值
     *
     * @param key key
     * @param elementType 数据类型
     * @param <T> 泛型
     * @return 获取的对象
     */
    public <T> T get(final String key,Class<T> elements){
        return redisTemplate.execute(new RedisCallback<T>() {
            @Override
            public T doInRedis(RedisConnection redisConnection)throws  DataAccessException{
                byte[] bytes =redisTemplate.getStringSerializer().serialize(key);
                if (redisConnection.exists(bytes)){
                    byte[] value=redisConnection.get(bytes);
                    T values=(T) SerializeUtil.deserialize(value);
                    return values;
                }
                return null;
            }
        });
    }
    /*
     * 根据key删除该值
     *
     * @param key key
     */
    public void delete(final String key){
        final byte[] bytes=redisTemplate.getStringSerializer().serialize(key);
        redisTemplate.execute(new RedisCallback<Object>(){
            @Override
            public Object doInRedis(RedisConnection redisConnection)throws DataAccessException{
                redisConnection.del(bytes);
                return null;
            }
        });
    }
}
