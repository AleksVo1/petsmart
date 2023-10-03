package ca.petsmart.settings;

import org.apache.commons.lang3.RandomStringUtils;

public class RandomUserGenerator {

    public String generateRandomEmail() {
        String domain = "mailinator.com";
        String username = RandomStringUtils.randomAlphanumeric(5);
        String email = username + "@" + domain;
        return email;
    }

}
