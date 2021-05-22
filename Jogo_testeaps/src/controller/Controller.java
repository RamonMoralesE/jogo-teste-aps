
package controller;

import interfaces.IStrategy;
import java.awt.event.KeyEvent;
import model.Player;

public enum Controller implements IStrategy {
    PLAYER_2 {
        public void keyPressed(Player player, KeyEvent key){
            int codigo = key.getKeyCode();
            if (!player.isMorto()) {
                switch(codigo){
                    case KeyEvent.VK_G:
                        player.atira();
                        break;
                    case KeyEvent.VK_W:
                        player.setDy(-1);
                        break;
                    case KeyEvent.VK_S:
                        player.setDy(1);
                        break;
                    case KeyEvent.VK_A:
                        player.setDx(-1);
                        break;
                    case KeyEvent.VK_D:
                        player.setDx(1);
                        break;
                }
            }
        }
        
        public void keyReleased(Player player, KeyEvent key){
            int codigo = key.getKeyCode();
            if (!player.isMorto()) {
                switch(codigo){
                    case KeyEvent.VK_W:
                        player.setDy(0);
                        break;
                    case KeyEvent.VK_S:
                        player.setDy(0);
                        break;
                    case KeyEvent.VK_A:
                        player.setDx(0);
                        break;
                    case KeyEvent.VK_D:
                        player.setDx(0);
                        break;
                }
            }
        }
    },
    PLAYER_1 {
        public void keyPressed(Player player, KeyEvent key){
            int codigo = key.getKeyCode();
            if (!player.isMorto()) {
                switch(codigo){
                    case KeyEvent.VK_SPACE:
                        player.atira(); 
                        break;
                    case KeyEvent.VK_UP:
                        player.setDy(-1);
                        break;
                    case KeyEvent.VK_DOWN:
                        player.setDy(1);
                        break;
                    case KeyEvent.VK_LEFT:
                        player.setDx(-1);
                        break;
                    case KeyEvent.VK_RIGHT:
                        player.setDx(1);
                        break;
                }
            }
        }
        
        public void keyReleased(Player player, KeyEvent key){
            int codigo = key.getKeyCode();
            if (!player.isMorto()) {
                switch(codigo){
                    case KeyEvent.VK_UP:
                        player.setDy(0);
                        break;
                    case KeyEvent.VK_DOWN:
                        player.setDy(0);
                        break;
                    case KeyEvent.VK_LEFT:
                        player.setDx(0);
                        break;
                    case KeyEvent.VK_RIGHT:
                        player.setDx(0);
                        break;
                }
            }
        }
    }
}
