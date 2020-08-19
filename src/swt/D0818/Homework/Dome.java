package Homework.tow;

import org.eclipse.swt.widgets.Display;


import org.eclipse.swt.widgets.Shell;

import org.eclipse.swt.widgets.Label;


import org.eclipse.swt.SWT;
import org.eclipse.wb.SWTResourceManager;
//import org.eclipse.wb.swt.SWTResourceManager;
import org.eclipse.swt.widgets.Text;


import org.eclipse.swt.events.SelectionAdapter;

import org.eclipse.swt.widgets.Button;

public class Dome {

    protected Shell shell;
    private Text txtEclipseIdeFor;

    /**
     * Launch the application.
     * @param args
     */
    public static void main(String[] args) {
        try {
            Dome window = new Dome();
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
        shell.setImage(SWTResourceManager.getImage(Dome.class, "/javax/swing/plaf/basic/icons/JavaCup16.png"));
        shell.setSize(867, 339);
        shell.setText("SWT Application");
        shell.setLayout(null);

        Label label = new Label(shell, SWT.NONE);
        label.setBounds(0, 0, 109, 171);
        label.setImage(SWTResourceManager.getImage("H:\\java\\work\\AA\\\u4F5C\u4E1A\u56FE\u7247\\imgs\\eclipse\\left.png"));

        txtEclipseIdeFor = new Text(shell, SWT.BORDER|SWT.V_SCROLL|SWT.H_SCROLL|SWT.WRAP|SWT.MULTI);
        txtEclipseIdeFor.setText("Eclipse IDE for Java Developers\n" +
                "\n" +
                "Version: 2020-03 (4.15.0)\n" +
                "Build id: 20200313-1211\n" +
                "(c) Copyright Eclipse contributors and others 2000, 2020.  All rights reserved. Eclipse and the Eclipse logo are trademarks of the Eclipse Foundation, Inc., https://www.eclipse.org/. The Eclipse logo cannot be altered without Eclipse's permission. Eclipse logos are provided for use under the Eclipse logo and trademark guidelines, https://www.eclipse.org/logotm/. Oracle and Java are trademarks or registered trademarks of Oracle and/or its affiliates. Other names may be trademarks of their respective owners.\n" +
                "\n" +
                "This product includes software developed by other open source projects including the Apache Software Foundation, https://www.apache.org/."
        );
        txtEclipseIdeFor.addSelectionListener(new SelectionAdapter() {
//			@Override
//			public void widgetSelected(SelectionEvent e) {
//				InputStream is = getClass().getResourceAsStream("G:\\java\\work\\AA\\作业图片\\imgs\\eclipse\\版权信息.txt");
//				InputStreamReader isr = new InputStreamReader(is);
//				BufferedReader br = new BufferedReader(isr);
//				String line = null;
//
//				try {
//					while( (line = br.readLine()) != null){
//						txtEclipseIdeFor.setText(txtEclipseIdeFor.getText() + line + "\r\n") ;
//					}
//					is.close();
//
//				}catch(IOException e1) {
//					e1.printStackTrace();
//				}
//			}
        });

        txtEclipseIdeFor.setBounds(112, 0, 727, 171);

        Label label_1 = new Label(shell, SWT.NONE);
        label_1.setImage(SWTResourceManager.getImage("H:\\java\\work\\AA\\\u4F5C\u4E1A\u56FE\u7247\\imgs\\eclipse\\1.png"));
        label_1.setBounds(0, 177, 44, 56);

        Label label_2 = new Label(shell, SWT.NONE);
        label_2.setImage(SWTResourceManager.getImage("H:\\java\\work\\AA\\作业图片\\imgs\\eclipse\\2.png"));
        label_2.setBounds(43, 177, 44, 56);

        Label label_3 = new Label(shell, SWT.NONE);
        label_3.setImage(SWTResourceManager.getImage("H:\\java\\work\\AA\\作业图片\\imgs\\eclipse\\3.png"));
        label_3.setBounds(87, 177, 44, 56);

        Label label_4 = new Label(shell, SWT.NONE);
        label_4.setImage(SWTResourceManager.getImage("H:\\java\\work\\AA\\作业图片\\imgs\\eclipse\\4.png"));
        label_4.setBounds(132, 177, 44, 56);

        Label label_5 = new Label(shell, SWT.NONE);
        label_5.setImage(SWTResourceManager.getImage("H:\\java\\work\\AA\\作业图片\\imgs\\eclipse\\5.png"));
        label_5.setBounds(177, 177, 44, 56);

        Label label_6 = new Label(shell, SWT.NONE);
        label_6.setImage(SWTResourceManager.getImage("H:\\java\\work\\AA\\作业图片\\imgs\\eclipse\\6.png"));
        label_6.setBounds(223, 177, 44, 56);

        Label label_7 = new Label(shell, SWT.NONE);
        label_7.setImage(SWTResourceManager.getImage("H:\\java\\work\\AA\\作业图片\\imgs\\eclipse\\7.png"));
        label_7.setBounds(270, 177, 44, 56);

        Label label_8 = new Label(shell, SWT.NONE);
        label_8.setImage(SWTResourceManager.getImage("H:\\java\\work\\AA\\作业图片\\imgs\\eclipse\\8.png"));
        label_8.setBounds(314, 177, 44, 56);

        Label label_9 = new Label(shell, SWT.NONE);
        label_9.setImage(SWTResourceManager.getImage("H:\\java\\work\\AA\\作业图片\\imgs\\eclipse\\9.png"));
        label_9.setBounds(357, 177, 44, 56);

        Label label_10 = new Label(shell, SWT.NONE);
        label_10.setImage(SWTResourceManager.getImage("H:\\java\\work\\AA\\作业图片\\imgs\\eclipse\\10.png"));
        label_10.setBounds(398, 177, 44, 56);

        Label label_11 = new Label(shell, SWT.NONE);
        label_11.setImage(SWTResourceManager.getImage("H:\\java\\work\\AA\\作业图片\\imgs\\eclipse\\11.png"));
        label_11.setBounds(441, 177, 44, 56);

        Label label_12 = new Label(shell, SWT.NONE);
        label_12.setImage(SWTResourceManager.getImage("H:\\java\\work\\AA\\作业图片\\imgs\\eclipse\\12.png"));
        label_12.setBounds(484, 177, 44, 56);

        Label label_13 = new Label(shell, SWT.NONE);
        label_13.setImage(SWTResourceManager.getImage("H:\\java\\work\\AA\\作业图片\\imgs\\eclipse\\13.png"));
        label_13.setBounds(528, 177, 44, 56);

        Label label_14 = new Label(shell, SWT.NONE);
        label_14.setImage(SWTResourceManager.getImage("H:\\java\\work\\AA\\作业图片\\imgs\\eclipse\\14.png"));
        label_14.setBounds(572, 177, 44, 56);

        Label label_15 = new Label(shell, SWT.NONE);
        label_15.setImage(SWTResourceManager.getImage("H:\\java\\work\\AA\\作业图片\\imgs\\eclipse\\15.png"));
        label_15.setBounds(615, 177, 44, 56);

        Label label_16 = new Label(shell, SWT.NONE);
        label_16.setImage(SWTResourceManager.getImage("H:\\java\\work\\AA\\作业图片\\imgs\\eclipse\\help.png"));
        label_16.setBounds(56, 239, 31, 30);

        Button btnNewButton = new Button(shell, SWT.NONE);
        btnNewButton.setBounds(97, 239, 184, 30);
        btnNewButton.setText("Information Details");

        Button btnClose = new Button(shell, SWT.NONE);
        btnClose.setBounds(683, 239, 98, 30);
        btnClose.setText("Close");

        Label label_17 = new Label(shell, SWT.NONE);
        label_17.setImage(SWTResourceManager.getImage("H:\\java\\work\\AA\\作业图片\\imgs\\eclipse\\17.png"));
        label_17.setBounds(659, 177, 44, 56);

        Label label_18 = new Label(shell, SWT.NONE);
        label_18.setImage(SWTResourceManager.getImage("H:\\java\\work\\AA\\作业图片\\imgs\\eclipse\\18.png"));
        label_18.setBounds(705, 177, 44, 56);

        Label label_19 = new Label(shell, SWT.NONE);
        label_19.setImage(SWTResourceManager.getImage("H:\\java\\work\\AA\\作业图片\\imgs\\eclipse\\16.png"));
        label_19.setBounds(750, 177, 76, 56);

    }
}
