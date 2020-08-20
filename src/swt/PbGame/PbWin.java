package swt.PbGame;

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import swing2swt.layout.BorderLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.KeyEvent;
import org.eclipse.swt.events.KeyListener;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.layout.RowLayout;
import org.eclipse.swt.widgets.Label;
import org.eclipse.wb.swt.SWTResourceManager;

/**
 * @author 12613
 */
public class PbWin {

    protected Shell shell;

    private Label[][] cells = new Label[20][20];
    private PbGame pGame = new PbGame();

    /**
     * Launch the application.
     *
     * @param args
     */
    public static void main(String[] args) {
        try {
            PbWin window = new PbWin();
            window.open();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * Open the window.
     */
    public void open() {
        Display display = Display.getDefault();
        createContents();
        shell.open();
        shell.layout();
        while (!shell.isDisposed()) {
            if (!display.readAndDispatch()) {
                display.sleep();
            }
        }
    }

    /**
     * Create contents of the window.
     */
    protected void createContents() {
        shell = new Shell();
        shell.setImage(SWTResourceManager.getImage(PbWin.class, "/javax/swing/plaf/basic/icons/JavaCup16.png"));
        shell.setSize(750, 660);
        shell.setText("SWT Application");
        shell.setLayout(new BorderLayout(0, 0));

        Composite compMap = new Composite(shell, SWT.NONE);
        compMap.setLayoutData(BorderLayout.CENTER);
        RowLayout rl_compMap = new RowLayout(SWT.HORIZONTAL);
        rl_compMap.spacing = 0;
        rl_compMap.justify = true;
        compMap.setLayout(rl_compMap);

//		for (int y = 0; y < cells.length; y++) {
//			for (int x = 0; x < cells.length; x++) {
//				Label label = new Label(compMap, SWT.NONE);
//				label.setImage(SWTResourceManager.getImage(PbWin.class, "imgs/5.GIF"));
//				cells[y][x] = label;
//			}
//		}
        compMap.addKeyListener(new KeyListener() {

            @Override
            public void keyPressed(KeyEvent arg0) {
                if (arg0.keyCode==16777217) {
                    pGame.moveTop();
                }else if (arg0.keyCode==16777218) {
                    pGame.moveDown();
                }else if (arg0.keyCode==16777219) {
                    pGame.moveLeft();
                }else if (arg0.keyCode==16777220) {
                    pGame.moveRight();
                }
                // TODO Auto-generated method stub
                refresh();
            }

            @Override
            public void keyReleased(KeyEvent arg0) {
                // TODO Auto-generated method stub

            }

        });


        for (int y = 0; y < cells.length; y++) {
            for (int x = 0; x < cells.length; x++) {
                cells[y][x] = new Label(compMap, SWT.NONE);
            }

        }

        Composite compCtrl = new Composite(shell, SWT.NONE);
        compCtrl.setLayoutData(BorderLayout.EAST);
        RowLayout r1_compCtrl = new RowLayout(SWT.VERTICAL);
        r1_compCtrl.spacing = 10;
        r1_compCtrl.marginBottom = 10;
        r1_compCtrl.marginTop = 10;
        r1_compCtrl.marginRight = 10;
        r1_compCtrl.marginLeft = 10;
        compCtrl.setLayout(r1_compCtrl);

        Button btnNewButton = new Button(compCtrl, SWT.NONE);
        btnNewButton.setText("New Button");

        Button btnNewButton_1 = new Button(compCtrl, SWT.NONE);
        btnNewButton_1.setText("New Button");

        Button btnNewButton_2 = new Button(compCtrl, SWT.NONE);
        btnNewButton_2.setText("New Button");

        refresh();

    }
    public void refresh() {
        for (int y = 0; y < cells.length; y++) {
            for (int x = 0; x < cells[y].length; x++) {
                char c = pGame.getMap()[y][x];
                System.out.println(c);
                String path = "imgs/" + c + ".GIF";
                //String path = "imgs/5.GIF";
                //label.setImage(SWTResourceManager.getImage(PbWin.class, "imgs/5.GIF"));
                cells[y][x].setImage(SWTResourceManager.getImage(PbWin.class, path));


            }
        }

    }
}
