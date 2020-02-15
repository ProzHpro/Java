
import org.fusesource.jansi.AnsiConsole;
import java.util.*;
public class game
{
	public static final String CLS = "\u001b[2J\u001b[1;1H";
	public static final String RED = "\u001b[31;1m";
	public static final String GREEN = "\u001b[32;1m";
	public static final String YELLOW = "\u001b[33;1m";
	public static final String BLUE = "\u001b[34;1m";
	public static final String PURPLE = "\u001b[35;1m";
	public static final String CYAN = "\u001b[36;1m";
	public static final String WHITE = "\u001b[37;1m";
	public static final String NORMAL = "\u001b[0m"; // default gray color
	public static final String WHITEONBLUE = "\u001b[37;44m";
	public static final String BLUEONWHITE = "\u001b[34;47m";



	public static void main(String[] args)
	{
		System.out.println(" _________  __              _____  _____         _   __                                      __     ______                             _  _  _ ");
		System.out.println("|  _   _  |[  |            |_   _||_   _|       / |_[  |                                    |  ]  .' ___  |                           | || || | ");
		System.out.println("|_/ | | \\_| | |--.  .---.    | |    | | _ .--. `| |-'| |--.  .---.  _ .--..--.  .---.   .--.| |  / .'   \\_|  ,--.   _ .--..--.  .---. | || || |");
		System.out.println("    | |     | .-. |/ /__\\    | '    ' |[ `.-. | | |  | .-. |/ /__\\[ `.-. .-. |/ /__\\/ /'`\' |  | |   ____ `'_\\ : [ `.-. .-. |/ /__\\| || || |");
		System.out.println("   _| |_    | | | || \\__.,    \\ \\__/ /  | | | | | |, | | | || \\__., | | | | | || \\__.,| \\__/  |  \\ `.___]  |// | |, | | | | | || \\__.,|_||_||_|");
		System.out.println("  |_____|  [___]|__]'.__.'     `.__.'  [___||__]\\__/[___]|__]'.__.'[___||__||__]'.__.' '.__.;__]  `._____.' \\'-;__/[___||__||__]'.__.'(_)(_)(_)");

		 Scanner in = new Scanner(System.in);
		 System.out.println("Please enter your name : ");
		 String Name = in.nextLine();

		 System.out.println("\nWelcome to the unthemed game "+Name+"...");
		 System.out.println("This is your avatar.");

		 System.out.println("     /.-.`.         ");
		 System.out.println("    //o;o\\ \\		");
		 System.out.println("    \\_-_/)/		");
		 System.out.println("    _`) ( _\\		");
		 System.out.println(" .`) '-.-' ( `.		");
		 System.out.println("/ `/   .   \\`. \\		");
		 System.out.println("\\ \\  "+Name+"___/_` /		");
		 System.out.println(" '-)|)=@=(|(-'`\\		");
		 System.out.println("   |/\\   /\\|  )/		");
		 System.out.println("   /__\\_/__\\		");
		 System.out.println("  '---' '---'		");
		 System.out.println("   \\ /   \\ /		");
		 System.out.println("   ( )   ( )		");
		 System.out.println("   /_\\   /_\\		");
		 System.out.println("  '---' '---'		 ");
		 System.out.println("   \\ /   \\ /			");
		 System.out.println("   /_\\   /_			");



		 System.out.println("\nTRY TO REACH THE END WITHOUT DYING!!!");
		 System.out.println("\nGOOD LUCK!!!");

		 System.out.println("Press Enter to continue...");
		 new java.util.	Scanner(System.in).nextLine();
		 String Choice = "";
		 AnsiConsole.systemInstall();


         // creating the player will initialize the world
      	Player S = new Player(Name,'S');

		ArrayList<Enemy> Enemies = new ArrayList<Enemy>();

		//(type , Hp , Speed)

		Enemies.add(new Enemy(""));
		Enemies.add(new Enemy("Troll"));
		Enemies.add(new Enemy ("Zombie"));
		Enemies.add(new Enemy ("Horse"));
		Enemies.add(new Enemy (""));
		Enemies.add(new Enemy(""));
		Enemies.add(new Enemy (""));



		while (!Choice.equals("q") && S.Hp >= 0 &&  !(S.Xpos == 39 && S.Ypos == 19) && !(S.Xpos == 39 && S.Ypos == 2) && !(S.Xpos == 39 && S.Ypos == 10))
		{
			System.out.print(CLS);
			S.PrintWorld();


			System.out.println();
			System.out.println(GREEN+"Player Name : "+S.Name+NORMAL+PURPLE+"\t\t\t*INSTRUCTIONS : TO WIN THE GAME YOU MUST REACH THE END WHERE 'X' IS MARKED"+NORMAL);
			System.out.print(PURPLE+"\t\t\t\t TIP: TRY TO COLLECT ALL POWERUPS TO KILL THE ENEMIES. GOOD LUCK!!"+NORMAL);
			System.out.println(  GREEN+"\nPlayer Stats: \n"+CYAN + "Hp = "+S.Hp +NORMAL+CYAN+"\tAttack= "+S.Attack + NORMAL + NORMAL +GREEN+"\t \tPlayer Movements :-"+ NORMAL);
			System.out.println(  GREEN+"Enemy 1 Stats (T): \n"+CYAN + "Hp = "+Enemies.get(1).Hp +NORMAL+CYAN+"\tAttack= "+Enemies.get(1).Attack  + RED+"\t MOVE RIGHT (d) , MOVE LEFT (a) , MOVE DOWN (s), MOVE UP(w)"+NORMAL );
			System.out.println(  GREEN+"Enemy 2 Stats (Z): \n"+CYAN + "Hp = "+Enemies.get(2).Hp +NORMAL+CYAN+"\tAttack= "+Enemies.get(2).Attack  + GREEN + "\t*POWERUPS --> $  (Boost your Hp and increases your Attack.)"+ NORMAL );
			System.out.println(  GREEN+"Enemy 3 Stats (H): \n"+CYAN + "Hp = "+Enemies.get(3).Hp +NORMAL+CYAN+"\tAttack= "+Enemies.get(3).Attack + NORMAL);


			System.out.print(PURPLE+ "\n\t# S --> Player"+ NORMAL);
			System.out.print(YELLOW +"\n\t# T --> Enemy1"+NORMAL);
			System.out.print(PURPLE+"\n\t# Z --> Enemy2"+NORMAL);
			System.out.print(YELLOW +"\n\t# H --> Enemy3"+NORMAL);
			System.out.println();
			Choice = in.nextLine();

			if (Choice.equals("a"))
				S.MoveLeft();
			if (Choice.equals("d"))
				S.MoveRight();
			if (Choice.equals("w"))
				S.MoveUp();
			if (Choice.equals("s"))
				S.MoveDown();

			// Step through Enemy ArrayList and move towards the player
			for (int i=0; i<Enemies.size(); i++)
			{
				if (Math.abs(Enemies.get(i).Xpos - S.Xpos) <= Enemies.get(i).Range && Math.abs(Enemies.get(i).Ypos - S.Ypos) <= Enemies.get(i).Range)
				{

					if (Enemies.get(i).Xpos > S.Xpos)
						Enemies.get(i).MoveLeft();
					else
						Enemies.get(i).MoveRight();
					if (Enemies.get(i).Ypos > S.Ypos)
						Enemies.get(i).MoveUp();
					else
						Enemies.get(i).MoveDown();
				}
			}



			// Step through Enemy ArrayList and attack if adjacent to player
			for (int i=1; i<Enemies.size(); i++)
			{
				if ((Enemies.get(i).Ypos == S.Ypos && (Enemies.get(i).Xpos == S.Xpos+1)) || // player is to the left
					(Enemies.get(i).Ypos == S.Ypos && (Enemies.get(i).Xpos == S.Xpos-1)) ||  // player is to the right
					(Enemies.get(i).Xpos == S.Xpos && (Enemies.get(i).Ypos == S.Ypos+1)) ||  // player is above
					(Enemies.get(i).Xpos == S.Xpos && (Enemies.get(i).Ypos == S.Ypos-1)))    // player is below
					{
						Enemies.get(i).Hp -= S.Attack;    // Player attacks Enemy
						S.Hp -= Enemies.get(i).Attack;    // Enemy attacks Player

						if (Enemies.get(i).Hp <= 0)    // Enemy dies
						{
					  		S.World[Enemies.get(i).Xpos][Enemies.get(i).Ypos] = ' ';
				  			Enemies.remove(i);
						}
					}
			}


		}
		if((S.Xpos == 39 && S.Ypos == 19) || (S.Xpos == 39 && S.Ypos == 2) || (S.Xpos == 39 && S.Ypos == 10))
		{
			System.out.println(RED+"	 ____  ____   ___   _____  _____   ____      ____  _____  ____  _____  ____  _____ "+NORMAL);
			System.out.println(RED +"	|_  _||_  _|.'   `.|_   _||_   _| |_  _|    |_  _||_   _||_   \\|_   _||_   \\|_   _| "+NORMAL);
			System.out.println(RED+"	  \\ \\  / / /  .-.  \\ | |    | |     \\ \\  /\\  / /    | |    |   \\ | |    |   \\ | |  "+NORMAL);
			System.out.println(RED+"	   \\ \\/ /  | |   | | | '    ' |      \\ \\/  \\/ /     | |    | |\\ \\| |    | |\\ \\| |  "+NORMAL);
			System.out.println(RED+"	   _|  |_  \\  `-'  /  \\ \\__/ /        \\  /\\  /     _| |_  _| |_\\   |_  _| |_\\   |_ "+NORMAL);
			System.out.println(RED+"	  |______|  `.___.'    `.__.'          \\/  \\/     |_____||_____|\\____||_____|\\____|"+NORMAL);

		}
		else
		{

			System.out.println(GREEN+"	   _____       ___     ______   ________  _______                "+NORMAL);
			System.out.println(GREEN+"	  |_   _|    .'   `. .' ____ \\ |_   __  ||_   __ \\               "+NORMAL);
			System.out.println(GREEN+"	    | |     /  .-.  \\| (___ \\_|  | |_ \\_|  | |__) |              "+NORMAL);
			System.out.println(GREEN+"	    | |   _ | |   | | _.____`.   |  _| _   |  __ /               "+NORMAL);
			System.out.println(GREEN+"	   _| |__/ |\\  `-'  /| \\____) | _| |__/ | _| |  \\ \\_  _  _  _  _ "+NORMAL);
			System.out.println(GREEN+"	  |________| `.___.'  \\______.'|________||____| |___|(_)(_)(_)(_)"+NORMAL);



		}
	}



}

// SuperClass called Gameobject where other classes inherits from.
class GameObject
{

	public static final String CLS = "\u001b[2J\u001b[1;1H";
	public static final String RED = "\u001b[31;1m";
	public static final String GREEN = "\u001b[32;1m";
	public static final String YELLOW = "\u001b[33;1m";
	public static final String BLUE = "\u001b[34;1m";
	public static final String PURPLE = "\u001b[35;1m";
	public static final String CYAN = "\u001b[36;1m";
	public static final String WHITE = "\u001b[37;1m";
	public static final String NORMAL = "\u001b[0m"; // default gray color
	public static final String WHITEONBLUE = "\u001b[37;44m";
	public static final String BLUEONWHITE = "\u001b[34;47m";

	static char World[][] = new char [41] [22];
	int Xpos , Ypos ;
	int Range;
	char Avatar;

	void PrintWorld()
	{
		for(int y=1 ; y <= 20 ; y++)
		{
			for(int x = 1 ; x <= 40; x++)
			{
				if (World[x][y] == 'S')
					System.out.print(PURPLE + 'S'+ NORMAL);
				else if(World[x][y]=='~')
					System.out.print(BLUE + 'o' +NORMAL);
				else if(World[x][y]=='T')
					System.out.print(CYAN+ 'T' +NORMAL);
				else if(World[x][y]=='Z')
					System.out.print(CYAN + 'Z' +NORMAL);
				else if(World[x][y]=='@')
					System.out.print(RED + 'o' +NORMAL);
				else if(World[x][y]=='$')
					System.out.print(YELLOW + '$' +NORMAL);
				else if(World[x][y]=='X')
					System.out.print(GREEN + 'X' +NORMAL);
				else if(World[x][y]=='H')
					System.out.print(CYAN + 'H' +NORMAL);
				else if(World[x][y]=='#')
					System.out.print(GREEN + '#' +NORMAL);
					else


				System.out.print(World[x][y]);

				//optionally put a space
				if (x < 40)
				System.out.print(" ");

			}
			System.out.println();
		}
	}


	void MoveRight()
	{
		if(World[Xpos+1] [Ypos] == ' ')
		{
			World[Xpos][Ypos] = ' ';
			Xpos++;
			World[Xpos][Ypos] = Avatar;
		}
	}

	void MoveLeft()
	{
		if(World[Xpos-1] [Ypos] == ' ')
		{
			World[Xpos][Ypos] = ' ';
			Xpos--;
			World[Xpos][Ypos] = Avatar;
		}
	}


	void MoveUp()
	{
		if(World[Xpos] [Ypos-1] == ' ')
		{
			World[Xpos][Ypos] = ' ';
			Ypos--;
			World[Xpos][Ypos] = Avatar;
		}
	}


	void MoveDown()
	{
		if(World[Xpos] [Ypos+1] == ' ')
		{
			World[Xpos][Ypos] = ' ';
			Ypos++;
			World[Xpos][Ypos] = Avatar;
		}
	}


}

class Enemy extends GameObject
{
	String Race;
	char Avatar1;
	int Hp , Attack , Armor , Speed;

	Enemy(String NewRace)
	{
		Race = NewRace;
		Xpos = (int) (Math.random()*34) + 3;
		Ypos = (int) (Math.random()*14) + 3;

		if (Race.equals("Troll"))
		{
			Avatar = 'T';  Hp = 300;  Attack = 10;  Range= 5;

		}
		else if (Race.equals("Zombie"))
		{
			Avatar = 'Z';  Hp = 450;  Attack = 15;   Range = 5;

		}
		else if (Race.equals("Horse"))
		{
			Avatar = 'H';  Hp = 600;
		  Attack = 10;   Range = 5;
		}


		World[Xpos][Ypos] = (Avatar);

	}

}

class Player extends GameObject
{
	int Hp=100;
	int Attack = 50;
	int Armor , Gold;
	String Name;

	Player(String NewName , char NewAvatar)
	{
		Name = NewName ; Avatar = NewAvatar;
		Xpos = 2 ; Ypos = 2;

		// set entire world to spaces
		for(int x = 1; x <= 40; x++)
		{
			for (int y = 1; y <= 20; y++)
			{
				World[x][y] = ' ';
			}
		}

		World[Xpos][Ypos] = Avatar;


		// line perimeter of world with trees @
		for (int x = 1; x <= 40; x++)
		{
    		World[x][1] = '@';
    		World[x][20] = '@';
		}

		for (int y = 1; y<=20; y++)
		{
     		World[1][y] = '@';
     		World[40][y] = '@';
		}


	World[(int) (Math.random()*35) + 3][(int)(Math.random()*14) + 3] = '$';
	World[(int) (Math.random()*35) + 3][(int)(Math.random()*14) + 3] = '$';

	int a = (int)(Math.random()*30)+1;
	int b = (int)(Math.random()*10)+8;
	World[a][b] = '~';
	World[a+1][b] = '~';
	World[a+2][b] = '~';
	World[a][b+1] = '~';
	World[a+1][b+1] = '~';
	World[a+2][b+1] = '~';
	World[a][b+2] = '~';
	World[a+1][b+2] = '~';
	World[a+2][b+2] = '~';
	World[39][19]= 'X';
	World[39][2] = 'X';
	World[39][10]= 'X';

}



	void MoveRight()
	{
		if (World[Xpos+1][Ypos] == ' ')
		{
			World[Xpos][Ypos] = ' ';
			Xpos++;

			World[Xpos][Ypos] = Avatar;
		}
		else if (World [Xpos + 1][Ypos] == '$')
		{
			World[Xpos][Ypos] = ' ';
			Xpos++;
			World[Xpos][Ypos] = Avatar;
			Hp += 20;
			Attack += 50;
		}
		else if (World [Xpos + 1][Ypos] == 'X')
		{
			World[Xpos][Ypos] = ' ';
			Xpos++;
			World[Xpos][Ypos] = Avatar;


		}
	}

	void MoveLeft()
	{
		if (World[Xpos-1][Ypos] == ' ')
		{
			World[Xpos][Ypos] = ' ';
			Xpos--;

			World[Xpos][Ypos] = Avatar;
		}
		else if (World [Xpos - 1][Ypos] == '$')
		{
			World[Xpos][Ypos] = ' ';
			Xpos--;
			World[Xpos][Ypos] = Avatar;
			Hp += 20;
			Attack += 50;
		}
	}


	void MoveUp()
	{
		if (World[Xpos][Ypos-1] == ' ')
		{
			World[Xpos][Ypos] = ' ';
			Ypos--;
			World[Xpos][Ypos] = Avatar;
		}
		else if (World [Xpos][Ypos-1] == '$')
		{
			World[Xpos][Ypos] = ' ';
			Ypos--;
			World[Xpos][Ypos] = Avatar;
			Hp += 20;
			Attack += 50;
		}
		else if (World [Xpos][Ypos-1] == 'X')
		{
			World[Xpos][Ypos] = ' ';
			Ypos--;
			World[Xpos][Ypos] = Avatar;

		}

	}


	void MoveDown()
	{
		if (World[Xpos][Ypos+1] == ' ')
		{
			World[Xpos][Ypos] = ' ';
			Ypos++;
			World[Xpos][Ypos] = Avatar;
		}
		else if (World [Xpos][Ypos+1] == '$')
		{
			World[Xpos][Ypos] = ' ';
			Ypos++;
			World[Xpos][Ypos] = Avatar;
			Hp += 20;
			Attack += 50;
		}
		else if (World [Xpos][Ypos+1] == 'X')
		{
			World[Xpos][Ypos] = ' ';
			Ypos++;
			World[Xpos][Ypos] = Avatar;
		}
	}

}















