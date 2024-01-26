package com.example.testzainebyaich.services;

import com.example.testzainebyaich.entities.Client;
import com.example.testzainebyaich.entities.Menu;

import java.util.List;

public interface MenuService {
    List<Menu> getAllMenu();
    Client addMenu(Menu e);
    void removeMenu(Long id);
    Client modifyMenu (Menu e, Long id);

}
