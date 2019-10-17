
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
				System.out.println("How wide do you want your rectangle to be?");
				widthC = new Scanner(System.in);
				width = widthC.nextInt();
				System.out.println("How tall do you want your rectagle to be?");
				heightC = new Scanner(System.in);
				height = heightC.nextInt();
				System.out.println("Do you want it to be red or blue? 0 for red and 1 for blue.");
				colorC = new Scanner(System.in);
				color = colorC.nextInt();
				if (color == 1)
					{
						graphics.setColor(Color.blue);
					}
				else if (color == 0)
					{
						graphics.setColor(Color.red);
					}
				else
					{
						System.out.println("It's going to be a fresh start Morty");
						System.exit(0);
					}
				graphics.fillRect(375 - (width / 2), 375 - (height / 2), width, height);
			}
			
		public void delay()
			{
				try
					{
						Thread.sleep(50);
					} catch (InterruptedException e)
					{
						e.printStackTrace();
					}
			}
	}
