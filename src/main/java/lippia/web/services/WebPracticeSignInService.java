package lippia.web.services;

import com.crowdar.core.PropertyManager;
import com.crowdar.core.actions.ActionManager;
import lippia.web.constants.WebPracticeConstants;

import static com.crowdar.core.actions.WebActionManager.navigateTo;

public class WebPracticeSignInService extends ActionManager{

        public static void GotoSignIn(){
                  click(WebPracticeConstants.SIGNIN_LINK_XPATH);
        }

        public static void enterEmail(String text) {
            setInput(WebPracticeConstants.INPUT_EMAIL_ID, text);
        }
        public static void enterPassword(String text) {
            setInput(WebPracticeConstants.INPUT_PASSWORD_ID, text);
        }

        public static void clickSignInchButton() {
            click(WebPracticeConstants.LOGIN_BUTTON_ID);
        }
    }

