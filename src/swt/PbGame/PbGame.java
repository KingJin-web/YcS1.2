package swt.PbGame;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import java.util.Arrays;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Label;

import Util.io.IOHelper;

public class PbGame extends PushBoxBase {
//	private char[][] map =new char[20][20];
//	private int level = 1;
//
//	public PbGame() {
//		//第一次创建游戏时，加载地图
//		loadMap();
//	}
//	/**
//	 * 加载地图
//	 */
//	public void loadMap() {
//		String path = "maps/" + level + ".map";
//		InputStream in = PbGame.class.getResourceAsStream(path);
//
//		InputStreamReader isr = new InputStreamReader(in);
//		BufferedReader br = new BufferedReader(isr);
//		try {
//			for (int i = 0; i < map.length; i++) {
//				String line = br.readLine();
//				map[i] = line.toCharArray();
//				System.out.println(Arrays.toString(map[i]));
//			}
//		} catch (IOException e) {
//			throw new RuntimeException(e);
//		}finally {
//			IOHelper.close(in,isr,br);
//		}
//
//
//
//	}
//
//
//	public static void main(String[] args) {
//		PbGame pbGame = new PbGame();
//		pbGame.loadMap();
//	}
//
//
//	public char[][] getMap() {
//		// TODO Auto-generated method stub
//		return map;
//	}
//
//	private int[] findMan() {
//		for (int y = 0; y < map.length; y++) {
//			for (int x = 0; x < map.length; x++) {
//
//				if (map[y][x] == '5') {
//
//					return new int[] {x,y};
//				}
//			}
//
//		}
//		return null;
//	}
//
//	public void moveTop() {
//		int[] xy = findMan();
//
//		int x = xy[0];
//		int y = xy[1];
//
//		map[y-1][x] = '5';
//		map[y][x] = '2';
//
//	}
//	public void moveDown() {
//		int[] xy = findMan();
//
//		int x = xy[0];
//		int y = xy[1];
//
//		map[y+1][x] = '5';
//		map[y][x] = '2';
//
//	}
//
//	public void moveLeft() {
//		int[] xy = findMan();
//
//		int x = xy[0];
//		int y = xy[1];
//
//		map[y][x - 1] = '5';
//		map[y][x] = '2';
//
//	}
//
//	public void moveRight() {
//		int[] xy = findMan();
//
//		int x = xy[0];
//		int y = xy[1];
//
//		map[y][x+1] = '5';
//		map[y][x] = '2';
//
//	}
//

    private static final long serialVersionUID = 1L;

    /**
     * 向上移动
     */
    public void moveTop() {
        move(0, -1, '8');
    }

    /**
     * 向下移动
     */
    public void moveDown() {
        move(0, 1, '5');
    }

    /**
     * 向左移动
     */
    public void moveLeft() {
        move(-1, 0, '6');
    }

    /**
     * 向右移动
     */
    public void moveRight() {
        move(1, 0, '7');
    }

    /**
     * 下一关
     */
    public void next() {
        level++;
        loadMap();
    }

    /**
     * 重新开始
     */
    public void restart() {
        loadMap();
    }

    @Override
    public void save() {

    }

}
