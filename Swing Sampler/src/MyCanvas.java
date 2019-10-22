
import java.awt.*;
import java.util.Scanner;

import javax.swing.*;
//COMMENT CMOMENT COMMENT CMOMENT

public class MyCanvas extends Canvas
	{
		private static final long	serialVersionUID	= 1L;
		private static Scanner		heightC;
		private static Scanner		widthC;
		private static Scanner		colorC;
		static int					height;
		static int					width;
		static int					color;
		
		public static void main(String[] args)
			{
				MyCanvas canvas = new MyCanvas();
				JFrame frame = new JFrame();
				frame.setSize(750, 750);
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				frame.getContentPane().add(canvas).setBackground(Color.white);
				frame.setLocationRelativeTo(null); // Sets JPanel to center of screen
				frame.setResizable(true);
				frame.setVisible(true);
			}
			
		public void paint(Graphics graphics)
			{
//				System.out.println("How wide do you want your rectangle to be?");
//				widthC = new Scanner(System.in);
//				width = widthC.nextInt();
//				System.out.println("How tall do you want your rectagle to be?");
//				heightC = new Scanner(System.in);
//				height = heightC.nextInt();
//				System.out.println("Do you want it to be red or blue? 0 for red and 1 for blue.");
//				colorC = new Scanner(System.in);
//				color = colorC.nextInt();
//				if (color == 1)
//					{
//						graphics.setColor(Color.blue);
//					}
//				else if (color == 0)
//					{
//						graphics.setColor(Color.red);
//					}
//				else
//					{
//						System.out.println("It's going to be a fresh start Morty");
//						System.exit(0);
//					}
//				graphics.fillRect(375 - (width / 2), 375 - (height / 2), width, height);
//				int j = 0;
//				int k = 0;
			
//				for (int i = 0; i < 256; i++)
//					{
//						for (int b = 0; b < 256; b++)
//							{
//								for (int m = 0; m < 256; m++)
//									{
//										
//										graphics.setColor(new Color(i, b, m));
//										
//										graphics.fillRect(375,375, 100, 100);
//										
//									}
//							}
//					}
				int x = 0;
				int y = 20;
//				graphics.setColor(new Color(128, 128, 128));
				while (true)
					{
						for (x = 0; x <= 730; x++)
							{
								graphics.setColor(new Color(128, 128, 128));
								graphics.fillRect(x, y, 20, 20);
								delay();
								graphics.setColor(Color.white);
								graphics.fillRect(x - 20, y - 20, 20, 20);
								y++;
							}
						for (x = 730; x >= 0; x-=2)
							{
								graphics.setColor(new Color(128, 128, 128));
								graphics.fillRect(x, y, 20, 20);
								delay();
								graphics.setColor(Color.white);
								graphics.fillRect(x + 20, y + 10, 20, 20);
								y--;
							}
						for (x = 0; x <= 190; x++)
							{
								graphics.setColor(new Color(128, 128, 128));
								
								graphics.fillRect(x, y, 20, 20);
								delay();
								graphics.setColor(Color.white);
								graphics.fillRect(x - 20, y + 40, 20, 20);
								y-=2;
							}
						for (x = 200; x <= 730; x++)
							{
								graphics.setColor(new Color(128, 128, 128));
								graphics.fillRect(x, y, 20, 20);
								delay();
								graphics.setColor(Color.white);
								graphics.fillRect(x - 20, y - 20, 20, 20);
								y++;
							}
//						for (x = 0; x <= 730; x++)
//							{
//								graphics.setColor(new Color(128, 128, 128));
//								
//								graphics.fillRect(x, y, 20, 20);
//								delay();
//								graphics.setColor(Color.white);
//								graphics.fillRect(x - 20, y - 20, 20, 20);
//								y++;
//							}
//						for (x = 730; x >= 0; x--)
//							{
//								graphics.setColor(new Color(128, 128, 128));
//								
//								graphics.fillRect(x, y, 20, 20);
//								delay();
//								graphics.setColor(Color.white);
//								graphics.fillRect(x + 20, y + 20, 20, 20);
//								y--;
//							}
							
					}
//				
//				for (int z = 0; z < 8; z++)
//					{
//						x = 20;
//						if (z % 2 == 1)
//							{
//								for (int e = 0; e < 8; e++)
//									{
//										if (e % 2 == 1)
//											{
//												graphics.setColor(new Color(175, 175, 50));
//											}
//										else
//											{
//												graphics.setColor(new Color(75, 75, 150));
//											}
//										graphics.fillRect(x, y, 40, 40);
//										x += 40;
//									}
//							}
//						else
//							{
//								for (int e = 1; e < 9; e++)
//									{
//										if (e % 2 == 1)
//											{
//												graphics.setColor(new Color(175, 175, 50));
//											}
//										else
//											{
//												graphics.setColor(new Color(75, 75, 150));
//											}
//										graphics.fillRect(x, y, 40, 40);
//										x += 40;
//									}
//							}
//						y += 40;
//						
//					}
			}
			
		public void delay()
			{
				try
					{
						Thread.sleep(10);
					} catch (InterruptedException e)
					{
						e.printStackTrace();
					}
			}
	}
