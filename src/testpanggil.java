
import com.oi.WordQuestionGenerator;
import java.io.FileNotFoundException;
import javax.swing.UIManager;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class testpanggil {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        // TODO code application logic here
        WordQuestionGenerator wqs = new WordQuestionGenerator();
        
        wqs.getFile();
        
    }
    
}
