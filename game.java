import java.util.*;
class game 
{
  public static void main(String s[])
  {
    	Scanner sc=new Scanner(System.in);
	System.out.println("\t\t\t\tWELCOME TO KBL\n");
	System.out.println("\t\t\tLoading...\n");
	try
	{
	Thread.sleep(5000);
	}
	catch(InterruptedException ie)
	{
	}
	while(true)
	{
 	System.out.println("\tReady to play KBL. Press 1\n\n\tExit. Press 2\n\n\tAbout KBL. Press 3\n\nChoose your option and press ENTER:\n");
    	int c=sc.nextInt();
    	if (c==1)
    	{
      		cls();
  		try
		{
                                 Runtime.getRuntime().exec("clear");
		}
		catch(Exception e)
		{}
      		System.out.println("\t\t\t\tTHE GAME IS STARTED\n");
		try
		{
		Thread.sleep(3000);
		}
		catch(InterruptedException ie)
		{
		}
      		System.out.println("\t\t\tWhat James Watt invented ?\n");
      		System.out.println("\t\t\t1. Diving bell\t\t2. Stream boat\n");
      		System.out.println("\t\t\t3. Hot air balloon\t4. Rotary stream engine");
      		System.out.println("Give your answer and press ENTER:");
		int a=sc.nextInt();
      		if (a==4)
      		{
      			System.out.println("Correct answer.\tYou won Rs 1000/-"); 
      			cls();
			try
			{
				Thread.sleep(5000);
			}
			catch(InterruptedException ie)
			{
			}
      			System.out.println("\t\t\tWhich of these place is a major producer of apples ?\n");
      			System.out.println("\t\t\t1. Manali\t\t2. Leh\n");
      			System.out.println("\t\t\t3. Ooty\t\t\t4. Kodaikanal");
      			System.out.println("Give your answer and press ENTER:");
      			int b=sc.nextInt();
      			if (b==1)
      			{
      				System.out.println("Correct answer.\tYou won Rs 5,000/-"); 
      				cls();
				try
				{
					Thread.sleep(5000);
				}
				catch(InterruptedException ie)
				{
				}
      				System.out.println("\t\t\tWhich of  the following musical instruments is not \n\t\t\tof foreign origin ?\n");
      				System.out.println("\t\t\t1. Sitar\t\t2. Flute\n");
      				System.out.println("\t\t\t3. Violin\t\t4. Tabla");
      				System.out.println("Give your answer and press ENTER:");
      				int d=sc.nextInt();
      				if (d==2)
                				{
      					System.out.println("Correct answer.\tYou won Rs 10,000/-");
					cls();
					try
					{
						Thread.sleep(5000);
					}
					catch(InterruptedException ie)
					{
					}
					System.out.println("\t\t\tThe full name of which of these IPL teams contains \n\t\t\tthe word 'India' ?\n");
      					System.out.println("\t\t\t1. Knight Riders\t\t2. Daredevils\n");
      					System.out.println("\t\t\t3. Warriors\t\t\t4. Royal Challengers");
      					System.out.println("Give your answer and press ENTER:");	
					int e=sc.nextInt();
      					if (e==3)
                					{
						System.out.println("Correct answer.\tYou won Rs 20,000/-");
						cls();
						try
						{
							Thread.sleep(5000);
						}
						catch(InterruptedException ie)
						{
						}
						System.out.println("\t\t\tWhich planet is closest to the Earth ?\n");
      						System.out.println("\t\t\t1. Mars\t\t\t2. Mercury\n");
      						System.out.println("\t\t\t3. Venus\t\t4. Sun");
   	   					System.out.println("Give your answer and press ENTER:");	
						int f=sc.nextInt();
      						if (f==3)
                						{
							System.out.println("Correct answer.\tYou won Rs 50,000/-");	
							cls();
							try
							{
								Thread.sleep(5000);
							}
							catch(InterruptedException ie)
							{
							}
							System.out.println("\t\t\tWho was the first batsman to have achieved 300 \n\t\t\truns in an innings in Tests ?\n");
 	     						System.out.println("\t\t\t1. Sachin Tendulkar\t\t2. Sourav Ganguly\n");
      							System.out.println("\t\t\t3. Bishen Sing Bedi\t\t4. Virender Sehwag");
   	   						System.out.println("Give your answer and press ENTER:");	
							int g=sc.nextInt();		
							if(g==4)
							{
								System.out.println("Correct answer.\tYou won Rs 75,000/-");	
								cls();
								try
								{
									Thread.sleep(5000);
								}
								catch(InterruptedException ie)
								{
								}
								System.out.println("\t\t\tWhat is the world's smallest (in sq mi.) country ?\n");
	 	     						System.out.println("\t\t\t1. Vatican City\t\t2. Monaco\n");
      								System.out.println("\t\t\t3. Liechtenstein\t4. England");
   	   							System.out.println("Give your answer and press ENTER:");	
								int h=sc.nextInt();
								if(h==1)
								{
									System.out.println("Correct answer.\tYou won Rs 75,000/-");	
									cls();
									try
									{
										Thread.sleep(5000);
									}
									catch(InterruptedException ie)
									{
									}
									System.out.println("Do you want to play last question for Rs 1,00,000/-\n\t\tPress 1 for yes or 0 for no");
									int z=sc.nextInt();
									if(z==1)
									{
										cls();
										try
										{
											Thread.sleep(5000);
										}
										catch(InterruptedException ie)
										{
										}
										System.out.println("\t\t\tWhat is part of a database that holds only one type of information ?\n");
	 		     							System.out.println("\t\t\t1. Report\t\t2. Field\n");
      										System.out.println("\t\t\t3. Record\t\t4. File");
   	   									System.out.println("Give your answer and press ENTER:");	
										int j=sc.nextInt();
										if(j==2)
										{
											cls();
											try
											{
												Thread.sleep(5000);
											}
											catch(InterruptedException ie)
											{
											}
											System.out.println("\t\t\tCorrect answer.\n\t\t\tYou won Rs 1,00,000/-\n\t\t\tCongratulation from KBL!\n");	
											break;
										}
										else
										{
											System.out.println("\nWrong answer.\tYou won Rs 50,000/-\n");					
										}
									}
									else
									{
										System.out.println("\t\t\tYou won Rs 75,000/-\n\t\t\tCongratulation from KBL!\n");	
										break;
									}		
								}
								else
								{
									System.out.println("\nWrong answer.\tYou won Rs 50,000/-.\tCongratulation\n");
								}
							}
							else
							{
								System.out.println("\nWrong answer.\tYou won Rs 50,000/-\n");
							}
						}
						else
						{
							System.out.println("\nWrong answer.\tYou won Rs 20,000/-\n");
						}
					}
					else
					{
						System.out.println("\nWrong answer.\tYou won Rs 10,000/-\n");
					}	
    				}
      				else
      				{
       					System.out.println("\nWrong answer.\tYou won Rs 5,000/-\n");
      				}
      			}
      			else
      			{
       				System.out.println("\nWrong answer\n");
       				System.out.println("\t\t\tYOU WON Rs 1,000/-\n");
      			}
      		}
      		else
      		{
       			System.out.println("\nWrong answer\n");
       			System.out.println("\t\t\tYOU LOSE. SORRY\n");
      		}
	}
    	if(c==2)
    	{	
		System.out.println("\t\t\t\tEXIT from KBL");
		break;
         	}
	if(c==3)
	{
		cls();
		System.out.println("\t\tKBL ---  KAUN BANENGA LAKHPATI\n\nPlay KBL very carefully and sincerely to win Rs 1,00,000/- and be a LAKHPATI.\n\n\t\t\tFoUnDeR\n\n\t\t    SOURAV PRAMANICK\n\n\t\t       Co-FoUnDeRs\n\n\tAbhinaba Biswas---Anindya Mazumder---Arpita Layek\n\n\tDipankar Ghosh---Prithwiman Mazumder---Sayan Paul\n\n");	
	}
	}
   } 	
   static void cls()
   {
     	for(int i=0;i<44;i++)
     	System.out.println();
   }
}