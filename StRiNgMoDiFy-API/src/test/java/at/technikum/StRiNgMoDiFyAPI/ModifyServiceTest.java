package at.technikum.StRiNgMoDiFyAPI;

import at.technikum.StRiNgMoDiFyAPI.service.ModifyService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ModifyServiceTest {
    private ModifyService modifyService;

    @BeforeEach
    public void setup() {
        modifyService = new ModifyService();
    }

    @Test
    public void testModifyString() {
        String inputString = "hello";
        String expectedOutput = "hElLo";

        String modifiedString = modifyService.modifyString(inputString);

        Assertions.assertEquals(expectedOutput, modifiedString);
    }

    @Test
    public void testGetLastModifiedLength() {
        String inputString = "hello";
        modifyService.modifyString(inputString);
        int expectedLength = 5;

        int lastModifiedLength = modifyService.getLastModifiedLength();

        Assertions.assertEquals(expectedLength, lastModifiedLength);
    }
}
