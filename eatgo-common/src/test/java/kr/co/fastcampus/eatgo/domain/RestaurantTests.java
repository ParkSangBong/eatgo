package kr.co.fastcampus.eatgo.domain;

import org.assertj.core.api.Assertions;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.jupiter.api.Assertions.*;

class RestaurantTests {

    @Test
    public void creation(){

        Restaurant restaurant = Restaurant.builder()
                .id(1004L)
                .name("Bob zip")
                .address("Seoul")
                .build();

        Assertions.assertThat(restaurant.getId()).isEqualTo(1004);
        Assertions.assertThat(restaurant.getName()).isEqualTo("Bob zip");
        Assertions.assertThat(restaurant.getAddress()).isEqualTo("Seoul");
    }

    @Test
    public void information(){

        Restaurant restaurant = Restaurant.builder()
                .id(1004L)
                .name("Bob zip")
                .address("Seoul")
                .build();

        Assertions.assertThat(restaurant.getInformation()).isEqualTo("Bob zip in Seoul");

    }

}