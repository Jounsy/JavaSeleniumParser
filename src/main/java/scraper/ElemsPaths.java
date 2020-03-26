package scraper;

public class ElemsPaths {
    public static final String SORT_DROPDOWN = "//div[@data-input='.sortInput]";
    public static final String SORT_DROPDOWN_POPULARITY = SORT_DROPDOWN + "//div[@data-value='popularity']";
    public static final String SORT_POPULARITY_ALTERNATIVE =
            "//div[@id='BODYCON']//li[@data-sortorder='popularity']";

    public static final String BREAKFAST_CHECKBOX = "//input[@id='checkbox_2']";
    public static final String SWIMMINGPOOL_CHECKBOX = "//input[@id='checkbox_3']";
    public static final String BREAKFAST_CHECKBOX_ALTERNATIVE =
            "//div[@data-tracker='Breakfast included']//input";
    public static final String SWIMMINGPOOL_CHECKBOX_ALTERNATIVE =
            "//div[@data-tracker='Pool']//input";

    public static final String RATING_MORE_4 =
            "//div[@class='ui_poi_review_rating']//span[contains(@class,'bubble_40')]";
    public static final String RATING_MORE_4_ALTERNATIVE =
            "//div[@class='ui_radio item']//span[contains(@class, 'bubble_40')]";

    public static final String HOTEL_CARD = "//div[contains(@class, 'ui_section listItem')]";
    public static final String HOTEL_NAME = "//div[@class='listing_title']//a";
    public static final String HOTEL_RATING = "//div[@class='info-col']//span[contains(@class, 'bubble_')]";
    public static final String HOTEL_PRICE = "//div[@data-sizegroup='mini-meta-price']";
    public static final String HOTEL_REVIEWS = "//a[@class='review_count']";
}
