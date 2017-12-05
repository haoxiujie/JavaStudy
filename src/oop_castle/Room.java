package oop_castle;

public class Room {
    private String description;//当前房间描述
    private Room northExit;//北边出口
    private Room southExit;//南边出口
    private Room eastExit;//东边出口
    private Room westExit;//西边出口
    
    public Room(String description) 
    {
        this.description = description;//构造函数，当前房间
    }

    public void setExits(Room north, Room east, Room south, Room west) 
    {//↑获取出口信息
        if(north != null)//如果北边不是null，则有北边出口，并赋值北边房间名字
            northExit = north;
        if(east != null)//如果东边不是null，则有东边出口，并赋值东边房间名字
            eastExit = east;
        if(south != null)//如果南边不是null，则有南边出口，并赋值南边房间名字
            southExit = south;
        if(west != null)//如果西边不是null，则有西边出口，并赋值西边房间名字
            westExit = west;
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
    	if ( northExit != null)
    		sb.append("north ");
    	if ( eastExit != null)
    		sb.append("east ");
    	if ( westExit != null)
    		sb.append("west ");
    	if ( southExit != null)
    		sb.append("south ");
    	return sb.toString();
    }
    
    public Room getExit( String direction) {
    	//根据d返回什么东西
    	Room ret = null;
    	if(direction.equals("north")) {
            ret = northExit;
        }
        if(direction.equals("east")) {
            ret = eastExit;
        }
        if(direction.equals("south")) {
            ret = southExit;
        }
        if(direction.equals("west")) {
            ret = westExit;
        }
    	return ret;
    }
    
}
