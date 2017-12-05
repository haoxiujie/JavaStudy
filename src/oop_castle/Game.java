package oop_castle;
//设计原则(目标)(要考虑的东西)：
//1.消除代码复制
//2.封装
//3.可扩展性
//4.框架加数据
//5.类型系统
import java.util.Scanner;

public class Game {
    private Room currentRoom;//当前房间
        
    public Game() 
    {
        createRooms();//进入房间函数
    }

    private void createRooms()
    {
        Room outside, lobby, pub, study, bedroom;
      //当前的房间有城堡外，大堂，小酒吧，书房，卧室
        //	制造房间
        outside = new Room("城堡外");
        lobby = new Room("大堂");
        pub = new Room("小酒吧");
        study = new Room("书房");
        bedroom = new Room("卧室");
        
        //	初始化房间的出口
        outside.setExits(null, lobby, study, pub);
        lobby.setExits(null, null, null, outside);
        pub.setExits(null, outside, null, null);
        study.setExits(outside, bedroom, null, null);
        bedroom.setExits(null, null, null, study);
        //描述各个房间的出口信息，分别是Room类的北，东，南，西方向
        currentRoom = outside;  //	从城堡门外开始
    }

    private void printWelcome() {
        System.out.println();
        System.out.println("欢迎来到城堡！");
        System.out.println("这是一个超级无聊的游戏。");
        System.out.println("如果需要帮助，请输入 'help' 。");
        System.out.println();
        showPrompt();//->消除了代码复制
    }

    // 以下为用户命令

    private void printHelp() 
    {
        System.out.print("迷路了吗？你可以做的命令有：go bye help");
        System.out.println("如：\tgo east");
    }

    private void goRoom(String direction) 
    {//函数：去房间，传来的值是方向
        Room nextRoom = currentRoom.getExit(direction);//先将准备进入的房间名初始化
        //如果输入的内容和方向一致，则进入房间或被赋值null

        if (nextRoom == null) {
            System.out.println("那里没有门！");
        }
        else {
            currentRoom = nextRoom;
            showPrompt();//->消除了代码复制
            //如果有则进入，输出当前房间的四周状态-，此处存在代码复制-
        }
    }
	
    public void showPrompt() {
    	System.out.println("你在" + currentRoom);
        System.out.print("出口有: ");
        System.out.print(currentRoom.getExitDesc());
        //如果输入的方向有房间，则输出方向
        System.out.println();
    }
    
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Game game = new Game();
		game.printWelcome();
		//开始游戏
        while ( true ) {
        		String line = in.nextLine();
        		//获取一整行字符
        		String[] words = line.split(" ");
//↑String.split->将一个字符串按“”中的内容分割为子字符串，然后将结果作为字符串数组返回。
        		if ( words[0].equals("help") ) {
        			game.printHelp();
        		} else if (words[0].equals("go") ) {
        			game.goRoom(words[1]);
        		} else if ( words[0].equals("bye") ) {
        			break;
        		}
        }
        
        System.out.println("感谢您的光临。再见！");
        in.close();
	}

}
