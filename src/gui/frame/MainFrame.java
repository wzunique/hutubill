package gui.frame;
 
import javax.swing.JFrame;
 
import gui.panel.MainPanel;
import util.GUIUtil;
 
@SuppressWarnings("unused")
public class MainFrame extends JFrame{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1828849459412345291L;
	public static MainFrame instance = new MainFrame();
     
    private MainFrame(){
        this.setSize(500,450);
        this.setTitle("һ����Ϳ��");
        this.setContentPane(MainPanel.instance);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
     
    public static void main(String[] args) {
        instance.setVisible(true);
    }
     
}