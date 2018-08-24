package model;

import java.security.SecureRandom;

/**
 *
 * @author Lonely
 */
public class RadomString {
    static final String AB = "0123456789";
    static SecureRandom rnd = new SecureRandom();

    public static String randomString(int len) {
        StringBuilder sb = new StringBuilder(len);
        for (int i = 0; i < len; i++) {
            sb.append(AB.charAt(rnd.nextInt(AB.length())));
        }
        return sb.toString();
    }
}
