/**
  * Copyright 2018 bejson.com 
  */
package org.bianqi.wangyi.entity.followed;
import java.util.List;

/**
 * Auto-generated: 2018-02-17 16:29:20
 *
 * @author bejson.com (i@bejson.com)
 * @website http://www.bejson.com/java2pojo/
 */
public class FollowedBean {

    private int code;
    private boolean more;
    private List<Followeds> followeds;
    public void setCode(int code) {
         this.code = code;
     }
     public int getCode() {
         return code;
     }

    public void setMore(boolean more) {
         this.more = more;
     }
     public boolean getMore() {
         return more;
     }

    public void setFolloweds(List<Followeds> followeds) {
         this.followeds = followeds;
     }
     public List<Followeds> getFolloweds() {
         return followeds;
     }

}