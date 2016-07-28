/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tr.kasim.obs.panel;

import java.util.List;
import tr.kasim.obs.app.Application;
import tr.kasim.obs.config.Config;
import tr.kasim.obs.model.Department;
import tr.kasim.obs.model.Lecture;
import tr.kasim.obs.util.GeneralUtil;

/**
 *
 * @author selman
 */
public class AskLectureScreen extends Screen{

    
     
    public AskLectureScreen(Application application) {
        super(application);
    }
    
         @Override
    public void showMainScreen() {
        System.out.println("Welcome to Asking Lecture Screen");
        System.out.print("Enter name of searced lecture: ");
        String name = GeneralUtil.readConsole();
        
        System.out.print("Enter code of searced lecture: ");
        String code = GeneralUtil.readConsole();
        
       Lecture lecture = new Lecture();
       lecture.setName(name);
       lecture.setCode(code);
       
    
       
    
    
    } 
    
     @Override
    public void showFailScreen() {

    }

}
