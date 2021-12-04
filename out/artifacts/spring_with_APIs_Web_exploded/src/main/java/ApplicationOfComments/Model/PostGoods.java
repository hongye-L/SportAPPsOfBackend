package ApplicationOfComments.Model;

import java.io.Serializable;

/**
 * (PostGoods)实体类
 *
 * @author 竑也
 * @since 2021 -12-03 12:14:18
 */
public class PostGoods implements Serializable {
    private static final long serialVersionUID = -72300930340663454L;
    
    private Integer user_id;
    
    private Integer post_id;
    
    private Boolean goods;

    /**
     * Instantiates a new Post goods.
     *
     * @param user_id the user id
     * @param post_id the post id
     * @param goods   the goods
     */
    public PostGoods(Integer user_id, Integer post_id, boolean goods){
        this.user_id=user_id;
        this.post_id=post_id;
        this.goods=goods;
    }

    /**
     * Instantiates a new Post goods.
     */
    public PostGoods(){}

    /**
     * Gets user id.
     *
     * @return the user id
     */
    public Integer getUser_id() {
        return user_id;
    }

    /**
     * Sets user id.
     *
     * @param user_id the user id
     */
    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
    }

    /**
     * Gets post id.
     *
     * @return the post id
     */
    public Integer getPost_id() {
        return post_id;
    }

    /**
     * Sets post id.
     *
     * @param post_id the post id
     */
    public void setPost_id(Integer post_id) {
        this.post_id = post_id;
    }

    /**
     * Gets goods.
     *
     * @return the goods
     */
    public Boolean getGoods() {
        return goods;
    }

    /**
     * Sets goods.
     *
     * @param goods the goods
     */
    public void setGoods(Boolean goods) {
        this.goods = goods;
    }

}