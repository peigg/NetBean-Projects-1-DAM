/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.juegojava;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 *
 * @author Pablo
 */
public class JuegoJava extends JFrame implements KeyListener {   
    private int x = 0, y = 0;
     private Rectangle[] obstacles = new Rectangle[] {
        new Rectangle(800, 800, 100, 100),
        new Rectangle(300, 300, 100, 100),
        new Rectangle(500, 500, 100, 100)
    };
    
    public JuegoJava() {
        setSize(1920, 1080);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        addKeyListener(this);
    }
    
    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.fillRect(x, y, 50, 22);
        for (Rectangle obstacle : obstacles) {
            g.fillRect(obstacle.x, obstacle.y, obstacle.width, obstacle.height);
        }
    }
    
    public void moveCharacter(int x, int y) {
        int screenWidth = getWidth();
        int screenHeight = getHeight();
        
        Rectangle newCharacter = new Rectangle(x, y, 50, 22);
        
        for (Rectangle obstacle : obstacles) {
            if (newCharacter.intersects(obstacle)) {
                return;
            }
        }
        
        this.x = Math.min(screenWidth - 50, Math.max(0, x));
        this.y = Math.min(screenHeight - 22, Math.max(0, y));
        repaint();
    }
    
     @Override
    public void keyPressed(KeyEvent e) {
        int key = e.getKeyCode();
        if (key == KeyEvent.VK_W) {
            moveCharacter(x, y - 5);
        } else if (key == KeyEvent.VK_A) {
            moveCharacter(x - 5, y);
        } else if (key == KeyEvent.VK_S) {
            moveCharacter(x, y + 5);
        } else if (key == KeyEvent.VK_D) {
            moveCharacter(x + 5, y);
        }else if (key == KeyEvent.VK_SPACE) {
            System.exit(0);
        }
    }
    
    
    @Override
    public void keyReleased(KeyEvent e) {
        // Not implemented
    }
    
    @Override
    public void keyTyped(KeyEvent e) {
        // Not implemented
    }
    
    public static void main(String[] args) {
        JuegoJava game = new JuegoJava();
        game.moveCharacter(100, 100);
    }
}
