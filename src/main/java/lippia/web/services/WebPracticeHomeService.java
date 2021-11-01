package lippia.web.services;

import com.crowdar.core.PropertyManager;
import com.crowdar.core.actions.ActionManager;
import lippia.web.constants.WebPracticeConstants;

import static com.crowdar.core.actions.WebActionManager.navigateTo;

public class WebPracticeHomeService extends ActionManager {

    public static void navegarWeb(){
        navigateTo(PropertyManager.getProperty("web.base.url"));
    }

    public static void enterSearchCriteria(String text) {
        setInput(WebPracticeConstants.INPUT_SEARCH_XPATH, text);
    }

    public static void clickSearchButton() {
        ActionManager.getFluentWait();
        click(WebPracticeConstants.SEARCH_BUTTON_NAME);
    }
}
