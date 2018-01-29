/**
  * Copyright 2018 bejson.com 
  */
package org.bianqi.wangyi.entity.personal;
import java.util.List;

/**
 * Auto-generated: 2018-02-02 11:50:21
 *
 * @author bejson.com (i@bejson.com)
 * @website http://www.bejson.com/java2pojo/
 */
public class PersonalData {

    private boolean more;
    private List<Playlist> playlist;
    private int code;
    public void setMore(boolean more) {
         this.more = more;
     }
     public boolean getMore() {
         return more;
     }

    public void setPlaylist(List<Playlist> playlist) {
         this.playlist = playlist;
     }
     public List<Playlist> getPlaylist() {
         return playlist;
     }

    public void setCode(int code) {
         this.code = code;
     }
     public int getCode() {
         return code;
     }

}