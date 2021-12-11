package proyecto_edd2_ana_noel_jorge;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JProgressBar;

/**
 *
 * @author alejandro
 */
public class ProgressBarController implements Runnable{

    private JProgressBar bar;
    private ArchivoDeRegistro secuencial;
    private int progress = 0;
    private boolean vive;

    public ProgressBarController(JProgressBar bar, ArchivoDeRegistro secuencial) {
        this.bar = bar;
        this.secuencial = secuencial;
        bar.setMaximum(secuencial.getNoRegistros());
    }
    
    @Override
    public void run() {
        vive = true;
        while (vive) {
            
            bar.setValue(progress);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(ProgressBarController.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
    }
    
    public void stop() {
        vive = false;
    }
    
    public void setProgress(int progreso) {
        this.progress = progreso;
    }

    public JProgressBar getBar() {
        return bar;
    }

    public ArchivoDeRegistro getSecuencial() {
        return secuencial;
    }
    
}
