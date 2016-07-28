package tr.kasim.obs.panel;

import tr.kasim.obs.app.Application;
import tr.kasim.obs.config.Config;
import tr.kasim.obs.util.GeneralUtil;

/**
 *
 * @author selman
 */
public class AskStudentScreen extends Screen {
    
    public AskStudentScreen(Application application) {
        super(application);
    }

    
   @Override
    public void showMainScreen() {
        System.out.println("Number of created student is : " + Config.getStudents().size());
        

        System.out.print("Enter Student Number: ");
        String ögNo= GeneralUtil.readConsole();
        

        if(Config.getStudents().contains(ögNo)){
            System.out.println(ögNo+ " is found. ");
        }
        else
            System.out.println("Student doesn't found.");
        
