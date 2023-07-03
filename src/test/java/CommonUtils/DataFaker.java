package CommonUtils;

import net.datafaker.Faker;
import org.apache.commons.lang3.RandomStringUtils;
import org.jetbrains.annotations.NotNull;

public class DataFaker {
    public static Faker faker = new Faker();
    public static String getRandomNumber(int count){
        return faker.number().digits(count);
    }

    public static @NotNull String getRandomAlphabate(int size){
        return RandomStringUtils.randomAlphabetic(size);
    }

    public static String getRandomNumber(int min, int max){
        return String.valueOf(faker.number().numberBetween(min, max));
    }

    public static String getRandoMobileNumber(){
         return faker.number().numberBetween(6, 9) + faker.number().digits(9);
    }
}
