/**
  * Copyright 2018 bejson.com 
  */
package org.bianqi.wangyi.entity.followers;
import java.util.List;

/**
 * Auto-generated: 2018-02-17 19:26:52
 *
 * @author bejson.com (i@bejson.com)
 * @website http://www.bejson.com/java2pojo/
 */
public class FollowersBean {

    private List<Follow> follow;
    private int touchCount;
    private boolean more;
    private int code;
    public void setFollow(List<Follow> follow) {
         this.follow = follow;
     }
     public List<Follow> getFollow() {
         return follow;
     }

    public void setTouchCount(int touchCount) {
         this.touchCount = touchCount;
     }
     public int getTouchCount() {
         return touchCount;
     }

    public void setMore(boolean more) {
         this.more = more;
     }
     public boolean getMore() {
         return more;
     }

    public void setCode(int code) {
         this.code = code;
     }
     public int getCode() {
         return code;
     }

}