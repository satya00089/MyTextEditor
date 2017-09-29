package mytexteditor;

import javax.swing.JFrame;

public class MyTextEditor {
    public static void main(String[] args) {
        // TODO code application logic here+
        MyTextEditorGUI obj=new MyTextEditorGUI();
        obj.setBounds(0,0,700,700);
        obj.setTitle("My Notepad");
        obj.setVisible(true);
        
        obj.setResizable(false);
        obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}
