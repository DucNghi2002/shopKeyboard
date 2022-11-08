package com.shopkeyboard.Keyboard;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class KeyBoardService {
    @Autowired
    private KeyBoardRepository repository;

    public List<KeyBoard> getKeyBoards(){return repository.findAll();}


}
