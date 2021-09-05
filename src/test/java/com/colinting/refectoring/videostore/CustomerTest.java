package com.colinting.refectoring.videostore;

import com.colinting.refactoring.videostore.Customer;
import com.colinting.refactoring.videostore.Movie;
import com.colinting.refactoring.videostore.Rental;
import org.junit.Test;

import static org.junit.Assert.*;

public class CustomerTest {

    @Test
    public void statementTest() {
        int firstMovieDaysRentedFor = 10;
        Movie firstRentalMovie = new Movie(
                "Star Wars: Episode VIII - The Last Jedi", Movie.NEW_RELEASE);
        Rental firstRental = new Rental(firstRentalMovie, firstMovieDaysRentedFor);

        int secondMovieDaysRentedFor = 2;
        Movie secondRentalMovie = new Movie("Star Wars: Episode IV - A New Hope", Movie.REGULAR);
        Rental secondRental = new Rental(secondRentalMovie, secondMovieDaysRentedFor);

        int thirdMovieDaysRentedFor = 1;
        Movie thirdRentalMovie = new Movie("The Star Wars Holiday Special", Movie.CHILDRENS);
        Rental thirdRental = new Rental(thirdRentalMovie, thirdMovieDaysRentedFor);

        Customer customer = new Customer("Jane Doe");
        customer.addRental(firstRental);
        customer.addRental(secondRental);
        customer.addRental(thirdRental);

        String expectedStatement =
                "com.colinting.refactoring.videostore.Rental Record for Jane Doe\n" +
                        "\tStar Wars: Episode VIII - The Last Jedi\t30.0\n" +
                        "\tStar Wars: Episode IV - A New Hope\t2.0\n" +
                        "\tThe Star Wars Holiday Special\t1.5\n" +
                        "Amount owed is 33.5\n" +
                        "You earned 4 frequent renter points";

        assertEquals(expectedStatement, customer.statement());

    }
}