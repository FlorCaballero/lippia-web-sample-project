package lippia.web.services;

import com.crowdar.core.actions.ActionManager;
import lippia.web.constants.WebPracticeConstants;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;


public class WebPracticeResultService extends ActionManager {
//exercise 1 y 2 paso por parámetro STATSEXERCISE el Locator a evaluar
    private static WebElement stats(String StatsExercise) {
        System.out.println("<<<<<<Espera hasta que cargue el elemento>>>>>" +StatsExercise);
        ActionManager.getFluentWait();
        return getElement(StatsExercise);
    }
//exercise 2

    public static Boolean isDisplayedElement(String StatsExercise) {
        ActionManager.getFluentWait();
        return stats(StatsExercise).isDisplayed() ;
}
    public static void verifyResults(String StatsExercise){
        Assert.assertTrue(isDisplayedElement(StatsExercise),"<<<<El elemento es mostrado>>>>>");
    }

    //exercise 3



    private static boolean IsSortListByPrice() {

//Se considera atributo precio (aplicada la oferta) ,en la página ordena lower first por el atributo Old_price
        boolean NotOrderByLowerFirst = false;

        List<WebElement> allElements = getElements(WebPracticeConstants.LIST_OF_SORT_PRODUCT_XPATH );
        double precio_anterior=0;
        for (WebElement element: allElements) {
            double precio =Double.parseDouble(element.getText().substring(1,6));

            if (precio_anterior < precio) {
                precio_anterior=precio;
            } else
            {
                NotOrderByLowerFirst = true;
                precio_anterior=precio;
            }

            System.out.println(element.getText().substring(1,6));

            System.out.println("------------------------------------");
        }

         if (NotOrderByLowerFirst){
             System.out.println("-----La lista esta no esta ordenada ---");
        }

        return NotOrderByLowerFirst ;
    }
    public static void verifySortResults(){

        Assert.assertTrue(IsSortListByPrice(),"<<<<La lista no esta ordenada >>>>>");

    }
}
