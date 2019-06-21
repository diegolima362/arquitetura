
import homepage.TelaHome;
import javax.swing.UIManager;

/**
 *
 * @author diego
 */
public class Main {

    public static void main(String args[]) {
        try {

            javax.swing.UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());

            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {

                if ("GTK+".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }

        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        TelaHome telaPrincipal = new TelaHome();

        java.awt.EventQueue.invokeLater(() -> {

            telaPrincipal.programa();
        });
    }

}
