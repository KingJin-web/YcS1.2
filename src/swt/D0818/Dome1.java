package swt.D0818;

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;

public class Dome1 {

    protected Shell shell;
    private Text text;
    private Text text_1;

    /**
     * Launch the application.
     * @param args
     */
    public static void main(String[] args) {
        try {
            Dome1 window = new Dome1();
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
        shell.setSize(537, 308);
        shell.setText("登录");

        Label label = new Label(shell, SWT.NONE);
        label.setBounds(82, 44, 76, 20);
        label.setText("用户名");

        Label label_1 = new Label(shell, SWT.NONE);
        label_1.setBounds(82, 106, 76, 20);
        label_1.setText("密码");

        Button btnNewButton = new Button(shell, SWT.NONE);
        btnNewButton.addSelectionListener(new SelectionAdapter() {
            @Override
            public void widgetSelected(SelectionEvent e) {
            }
        });
        btnNewButton.setBounds(159, 166, 98, 30);
        btnNewButton.setText("登录");

        Button btnNewButton_1 = new Button(shell, SWT.NONE);
        btnNewButton_1.setBounds(284, 166, 98, 30);
        btnNewButton_1.setText("取消");

        text = new Text(shell, SWT.BORDER);
        text.setBounds(184, 44, 164, 26);

        text_1 = new Text(shell, SWT.BORDER);
        text_1.setBounds(184, 110, 164, 26);

    }
}
