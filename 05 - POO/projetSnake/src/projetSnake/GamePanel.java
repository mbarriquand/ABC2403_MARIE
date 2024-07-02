package projetSnake;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.Random;

public class GamePanel extends JPanel implements ActionListener {

	static final int SCREEN_WIDTH = 600;
	static final int SCREEN_HEIGHT = 600;
	static final int UNIT_SIZE = 25;
	static final int GAME_UNITS = (SCREEN_WIDTH * SCREEN_HEIGHT) / UNIT_SIZE;
	static final int DELAY = 85;
	final int x[] = new int[GAME_UNITS];
	final int y[] = new int[GAME_UNITS];
	int bodyParts = 6;
	int applesEaten = 0;
	int appleX;
	int appleY;
	char direction = 'R';
	boolean running = false;
	Timer timer;
	Random random;
	private int mostApplesEaten;
	private int highestScore;
	
	
	GamePanel (){
		random = new Random();
		this.setPreferredSize(new Dimension(SCREEN_WIDTH,SCREEN_HEIGHT));
		this.setBackground(Color.black);
		this.setFocusable(true);
		this.addKeyListener(new MyKeyAdapter());
		startGame();
		
	}
	
	public void startGame() {
		newApple();
		running = true;
		timer = new Timer(DELAY, this);
		timer.start();
		
	}
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		draw(g);
	}
	
	public void draw(Graphics g) {
		
				
		if(running) {
		for(int i = 0; i < SCREEN_HEIGHT/UNIT_SIZE; i++) {
			
			/* grid (optional			
			g.drawLine(i*UNIT_SIZE, 0, i*UNIT_SIZE, SCREEN_HEIGHT);
			g.drawLine(0, i*UNIT_SIZE, SCREEN_WIDTH, i*UNIT_SIZE); */
		}
		
		// apples
		g.setColor(Color.red);
		g.fillOval(appleX, appleY, UNIT_SIZE, UNIT_SIZE);
		
		// snake
		for(int i = 0; i < bodyParts; i++) {
			if(i == 0) {
				g.setColor(Color.green);
				g.fillRect(x[i], y[i], UNIT_SIZE, UNIT_SIZE);
			}
			else {
				g.setColor(new Color(45,180,0));
				g.fillRect(x[i], y[i], UNIT_SIZE, UNIT_SIZE);
			}
		}
				// score
		g.setColor(Color.green);
		g.setFont(new Font("Courier New", Font.BOLD, 20));
		FontMetrics metrics = getFontMetrics(g.getFont());
		g.drawString("SCORE:" + applesEaten, (SCREEN_WIDTH - metrics.stringWidth("SCORE:" + applesEaten))/2, g.getFont().getSize());
		
		}
		
		else {
			gameOver(g);
		}
	}
	
	public void newApple() {
		
		appleX = random.nextInt((int)(SCREEN_WIDTH/UNIT_SIZE))*UNIT_SIZE;
		appleY = random.nextInt((int)(SCREEN_HEIGHT/UNIT_SIZE))*UNIT_SIZE;
	}
	
	public void move() {
		
		for(int i = bodyParts; i>0; i--) {
			x[i] = x[i-1];
			y[i] = y[i-1];
		}
		
		switch(direction) {
		case 'U' :
			y[0] = y[0] - UNIT_SIZE;
			break;
		case 'D' :
			y[0] = y[0] + UNIT_SIZE;
			break;
		case 'L' :
			x[0] = x[0] - UNIT_SIZE;
			break;
		case 'R' :
			x[0] = x[0] + UNIT_SIZE;
			break;
		}
	}
	
	public void checkApple() {
		
		if((x[0] == appleX) && (y[0] == appleY)) {
			bodyParts ++;
			applesEaten ++;
			newApple();
		}
	}
		
	
	
	public void checkCollisions() {
		  
		  // checks if head collides with body
		  for(int i = bodyParts; i>0;i--) {
		    if((x[0] == x[i]) && (y[0] == y[i])) {
		      running = false; 
		    }
		  }
		  
		  // check if head touches borders
		  if(x[0] < 0 || x[0] >= SCREEN_WIDTH || y[0] < 0 || y[0] >= SCREEN_HEIGHT) {
		    running = false;
		  }
		  
		  if(!running) {
		    timer.stop();
		  }
		}

	public void gameOver (Graphics g) {
		
		//Game Over text
		
		g.setColor(Color.green);
	    g.setFont(new Font("Courier New", Font.BOLD, 20));
	    FontMetrics score = getFontMetrics(g.getFont());
	    g.drawString("score: " + applesEaten,(SCREEN_WIDTH - score.stringWidth("score: " + applesEaten))/2,g.getFont().getSize());

	   
		g.setColor(Color.green);
        g.setFont(new Font("Courier New", Font.PLAIN, 40));
        FontMetrics gameOver = getFontMetrics(g.getFont());
        g.drawString("Game over",(SCREEN_WIDTH - gameOver.stringWidth("Game Over"))/2,SCREEN_HEIGHT/2);
        
        // HIGHEST SCORE = NEEDS FIXING
        
      /*  int [] highestScoreArray = new int[2];  
        int currentScore = applesEaten;
        int bestScore = 0;
        if (currentScore > bestScore) {
        	bestScore = currentScore;
                }
        
        highestScoreArray [0] = currentScore;
        highestScoreArray [1] = bestScore;
        
        if (applesEaten > mostApplesEaten) {
            mostApplesEaten = applesEaten;
            highestScoreArray[1] = mostApplesEaten;
            
        }
		                	
        g.setColor(Color.green);
        g.setFont(new Font("Courier New", Font.BOLD, 25));
        FontMetrics highestScore = getFontMetrics(g.getFont());
        g.drawString("Highest Score :" + highestScoreArray[1], (SCREEN_WIDTH - gameOver.stringWidth("Highest Score"))/2, SCREEN_HEIGHT/2 + 50);
       
       */
       
        g.setFont(new Font("Courier New", Font.PLAIN, 20));
        FontMetrics reStart = getFontMetrics(g.getFont());
        g.drawString("Press 'R' to play again",(SCREEN_WIDTH - reStart.stringWidth("Press 'R' to play again"))/2,SCREEN_HEIGHT/2 + 70);
    }
	
	public void restartGame() {
        setVisible(false);
        new GameFrame();
    }
	
	public void dispose() {
        JFrame parent = (JFrame) this.getTopLevelAncestor();
        parent.dispose();
    }
	
	@Override
	public void actionPerformed(ActionEvent e) {
	
		if(running) {
			move();
			checkApple();
			checkCollisions();
		}
		repaint();
		
	}
	
	public class MyKeyAdapter extends KeyAdapter{
		@Override
		public void keyPressed(KeyEvent e) {
			
			switch(e.getKeyCode()) {
			
			case KeyEvent.VK_LEFT:
				if(direction != 'R') {
					direction = 'L';
				}
					break;
				
				
			case KeyEvent.VK_RIGHT:
				if(direction != 'L') {
					direction = 'R';
				}
					break;
				
			
			case KeyEvent.VK_UP:
				if(direction != 'D') {
					direction = 'U';
				}
					break;
				
			
			case KeyEvent.VK_DOWN:
				if(direction != 'U') {
					direction = 'D';
				}
					break;
			case KeyEvent.VK_R:
                restartGame();
                System.out.println("restart");
                break;		
				
			}
			
		}
	}
}

