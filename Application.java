/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tr.kasim.obs.app;

import tr.kasim.obs.config.Config;
import tr.kasim.obs.model.User;
import tr.kasim.obs.panel.AskLectureScreen;
import tr.kasim.obs.panel.AskStudentScreen;
import tr.kasim.obs.panel.LoginScreen;
import tr.kasim.obs.panel.MainScreen;
import tr.kasim.obs.panel.NewLectureScreen;
import tr.kasim.obs.panel.NewStudentScreen;

/**
 *
 * @author selman
 */
public class Application {

    LoginScreen loginScreen;
    MainScreen mainScreen;
    NewLectureScreen newLectureScreen;
    NewStudentScreen newStudentScreen;
    AskLectureScreen askLectureScreen;
    AskStudentScreen askStudentScreen;
  

    public static void main(String[] args) {
        Application application = new Application();
        application.init();
    }

    private void init() {
        loginScreen = new LoginScreen(this);
        mainScreen = new MainScreen(this);
        newLectureScreen = new NewLectureScreen(this);
        newStudentScreen = new NewStudentScreen(this);
        askLectureScreen = new AskLectureScreen(this);
        askStudentScreen = new AskStudentScreen(this);
      
        
        loginScreen.showMainScreen();
    }

    public void login(User user) {
        User allowedUser = Config.getUserByUserName(user.getUsername());
        User allowedPassword = Config.getUserByPassword(user.getPassword());
       
        
            if (allowedUser == null) {
            loginScreen.showFailScreen();
            System.exit(0);
        }
           else if(allowedPassword == null){
            loginScreen.showFailScreen();
            System.exit(0);
        
        }
           else {
            mainScreen.setUser(allowedUser);
            mainScreen.showWelcome();

        }
    }

    public void gotoMenu(Integer menuCode) {
        if (menuCode == null || menuCode < 0 || menuCode > 6) {
            mainScreen.showFailScreen();
            return;
        }
        switch (menuCode) {
            case 0: {
                mainScreen.showMainScreen();
                break;
            }
            case 1: {
                newLectureScreen.showMainScreen();
                break;
            }
            case 2: {
                askLectureScreen.showMainScreen();
                break;
            }
            case 3: {
                newStudentScreen.showMainScreen();
                break;
            }
            case 4: {
                askStudentScreen.showMainScreen();
                break;
            }
            case 5: {
                break;
            }
            case 6: {
                break;
            }
            default: {
                mainScreen.showFailScreen();
                return;
            }
        }

    
    }
}
