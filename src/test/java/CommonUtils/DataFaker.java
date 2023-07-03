package CommonUtils;

import net.datafaker.Faker;
import org.apache.commons.lang3.RandomStringUtils;


import java.util.Date;
import java.util.concurrent.TimeUnit;

import static org.apache.commons.lang3.RandomUtils.nextLong;

public class DataFaker {
    public static Faker faker = new Faker();

    // facker functions list:-
//        1. getRandomNumber
//        2. getRandomAlphabet
//        3. getRandomNumber
//        4. getRandoMobileNumber
//        5. getRandomEmailAdderess
//        6. getRandomDate
    public static String getRandomNumber(int count){
        return faker.number().digits(count);
    }

    public static String getRandomAlphabet(int size){
        return RandomStringUtils.randomAlphabetic(size);
    }

    public static String getRandomNumber(int min, int max){
        return String.valueOf(faker.number().numberBetween(min, max));
    }

    public static String getRandoMobileNumber(){
         return faker.number().numberBetween(6, 9) + faker.number().digits(9);
    }
    public static String getRandomEmailAdderess(){
        return faker.internet().emailAddress();
    }

    public static String getRandomDate(){
        return faker.date().birthday().toString().substring(0,10);
    }
}
