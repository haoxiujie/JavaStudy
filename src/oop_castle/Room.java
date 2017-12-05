package oop_castle;

public class Room {
    public String description;//当前房间描述
    public Room northExit;//北边出口
    public Room southExit;//南边出口
    public Room eastExit;//东边出口
    public Room westExit;//西边出口

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
}
