package at.technikum.StRiNgMoDiFyAPI.service;

import org.springframework.stereotype.Service;

@Service
public class ModifyService {
    private String lastModifiedString;
    private int lastModifiedLength;

    public String modifyString(String inputString) {
        StringBuilder modifiedString = new StringBuilder();
        boolean capitalizeNext = true;

        for (char c : inputString.toCharArray()) {
            if (Character.isLetter(c)) {
                if (capitalizeNext) {
                    modifiedString.append(Character.toUpperCase(c));
                } else {
                    modifiedString.append(Character.toLowerCase(c));
                }
                capitalizeNext = !capitalizeNext;
            } else {
                modifiedString.append(c);
            }
        }

        lastModifiedString = modifiedString.toString();
        lastModifiedLength = lastModifiedString.length();

        return lastModifiedString;
    }

    public int getLastModifiedLength() {
        return lastModifiedLength;
    }
}
