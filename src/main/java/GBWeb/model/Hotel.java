package GBWeb.model;

import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

@Setter
@Getter
@Slf4j
public class Hotel {

    private String name;
    private String url;
    private int price;
    private float rating;
    private int reviewsNum;
}
