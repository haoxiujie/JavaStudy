package oop_castle;

import java.util.HashMap;

public class Room {
    private String description;//当前房间描述
    private HashMap<String, Room> exits = new HashMap<String, Room>();
        
    public Room(String description) {
        this.description = description;//构造函数，当前房间
    }

    public void setExit(String dir, Room room) {
    	exits.put(description, room);
    }
    
    @Override
    public String toString()//重写toString，返回当前房间描述
    {
        return description;
    }
    
    public String getExitDesc() {
    	//返回一个用来描述现在有旁边什么房间的字符串
    	StringBuffer sb = new StringBuffer();
    	//StringBuffer减少系统开销
    	for ( String dir :exits.keySet() ) {
    		sb.append(dir);
    		sb.append(' ');
    	}
    	return sb.toString();
    }
    
    public Room getExit( String direction) {
    	//根据d返回什么东西
    	return exits.get(description);
    }
    
}
