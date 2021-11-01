package lippia.web.services;

import com.crowdar.core.actions.ActionManager;
import lippia.web.constants.WebPracticeConstants;
import com.crowdar.core.PropertyManager;
import com.crowdar.core.actions.ActionManager;
import static com.crowdar.core.actions.WebActionManager.navigateTo;


public class WebPracticeSortService extends ActionManager {

    public static void clickOptionLowerFirst() {
        ActionManager.waitClickable(WebPracticeConstants.SELECT_PRODUCT_SORT_XPATH) ;
        click(WebPracticeConstants.OPTION_LOWER_FIRST_XPATH);
    }
    public static void clickSelectProductSort() {
        ActionManager.waitClickable(WebPracticeConstants.SELECT_PRODUCT_SORT_XPATH) ;
        click(WebPracticeConstants.SELECT_PRODUCT_SORT_XPATH);

    }
}

