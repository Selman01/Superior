
package tr.kasim.obs.panel;

import tr.kasim.obs.app.Application;

/**
 *
 * @author selman
 */
public abstract class Screen {

    Application application;

    public Screen(Application application) {
        this.application = application;
    }

    public Application getApplication() {
        return application;
    }

    public void showMainScreen();

    public  void showFailScreen();

}
