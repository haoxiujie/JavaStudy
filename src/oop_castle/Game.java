package oop_castle;
import java.util.Scanner;
import java.util.HashMap;
//设计原则(目标)(要考虑的东西)：
//1.消除代码复制
//2.封装
//3.可扩展性
//4.框架加数据
//5.类型系统

public class Game {
    private Room currentRoom;//当前房间
    private HashMap<String, Handler> handlers = new HashMap<String, Handler>();
        
    public Game() 
    {
    	handlers.put("go", new HandlerGo(this));
    	handlers.put("bye", new HandlerBye(this));
    	handlers.put("help", new HandlerHelp(this));
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
        outside.setExit("east", lobby);
        outside.setExit("south", study);
        outside.setExit("west", pub);
        lobby.setExit("west", outside);
        pub.setExit("east", outside);
        study.setExit("north", outside);
        study.setExit("east",bedroom);
        bedroom.setExit("west", study);
        bedroom.setExit("up", pub);
        pub.setExit("down", lobby);
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
    public void goRoom(String direction) 
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
    
    public void play() {
    	Scanner in = new Scanner(System.in);
    	while ( true ) {
    		String line = in.nextLine();
    		//获取一整行字符
    		String[] words = line.split(" ");
    		//将获取的整行字符按每词一个单位(空格)分离成words[]
    		Handler handler = handlers.get(words[0]);
    		//hanler = 第一个单词 如go help bye 对应的value
    		String value = "";
    		//创建一个空的字符串在下面用来赋值第二个单词，如方向
    		if ( words.length>1 )
    			value = words[1];
    		if (handler != null ) {
    		//如果第一个单词不为空
    			handler.doCmd(value);
    			//将第一个单词进行.doCmd(第二个单词)
    			if(handler.isBye()) {
    			//如果第一个单词是bye,则bye的值是HandlerBye对象
    			//则handler是HandlerBye对象，进入子类    				
    				break;
    			}
    		}
//↑String.split->将一个字符串按“”中的内容分割为子字符串，然后将结果作为字符串数组返回。
//    		if ( words[0].equals("help") ) {
//    			printHelp();
//    		} else if (words[0].equals("go") ) {
//    			goRoom(words[1]);
//    		} else if ( words[0].equals("bye") ) {
//    			break;
//    		}
    	}
    	in.close();
    }
    
	public static void main(String[] args) {
		Game game = new Game();
		game.printWelcome();
		//开始游戏
        game.play();
        
        System.out.println("感谢您的光临。再见！");
	}

}
