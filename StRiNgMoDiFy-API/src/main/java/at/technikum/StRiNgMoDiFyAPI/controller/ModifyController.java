package at.technikum.StRiNgMoDiFyAPI.controller;

import at.technikum.StRiNgMoDiFyAPI.service.ModifyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ModifyController {
    private final ModifyService modifyService;

    @Autowired
    public ModifyController(ModifyService modifyService) {
        this.modifyService = modifyService;
    }

    @GetMapping("/api/modify")
    public String modifyString(@RequestParam("string") String inputString) {
        return modifyService.modifyString(inputString);
    }

    @GetMapping("/api/modify/length")
    public int getLastModifiedLength() {
        return modifyService.getLastModifiedLength();
    }

}
