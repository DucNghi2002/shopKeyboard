package com.shopkeyboard.Keyboard;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/Keyboard_List")
public class KeyBoardController {
    @Autowired
    private KeyBoardService service;

    @GetMapping
    public String list(Model model){
        List<KeyBoard> keyBoards = service.getKeyBoards();
        model.addAttribute("keyboards", keyBoards);
        return "keyboard/keyboard_list";
    }
}
