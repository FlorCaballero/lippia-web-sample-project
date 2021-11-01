package lippia.web.constants;

public class WebPracticeConstants {

//excersise 1
    public static final String INPUT_SEARCH_XPATH = "xpath://*[@id=\"search_query_top\"]";
    public static final String SEARCH_BUTTON_NAME = "name:submit_search";
    public static final String STATS1_XPATH = "xpath://a[@title='Blouse'][normalize-space()='Blouse']";

//excersise 2

    public static final String SIGNIN_LINK_XPATH = "xpath://*[@class=\"login\" and @title='Log in to your customer account']";

    public static final String INPUT_EMAIL_ID = "id:email";
    public static final String INPUT_PASSWORD_ID = "id:passwd";

    public static final String LOGIN_BUTTON_ID = "id:SubmitLogin";
    public static final String STATS2_XPATH = "xpath://span[normalize-space()='florencia caballero']";


    //excersise 3

    public static final String SELECT_PRODUCT_SORT_XPATH = "xpath://*[@id=\"uniform-selectProductSort\"]";
    public static final String OPTION_LOWER_FIRST_XPATH = "xpath://*[@id=\"selectProductSort\"]/option[2]";
    public static final String LIST_OF_SORT_PRODUCT_XPATH = "xpath://*[@id='center_column']/ul/li/div/div[2]/div[1]/span[@itemprop='price']";



}
