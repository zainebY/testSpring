package com.example.testzainebyaich.services.Impl;

import com.example.testzainebyaich.entities.Client;
import com.example.testzainebyaich.entities.Menu;
import com.example.testzainebyaich.services.MenuService;
import lombok.AllArgsConstructor;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.List;

@Primary
@AllArgsConstructor
@Service("MenuImpl")
public class MenuImpl implements MenuService {

    @Override
    public List<Menu> getAllMenu() {
        return null;
    }

    @Override
    public Client addMenu(Menu e) {
        return null;
    }

    @Override
    public void removeMenu(Long id) {

    }

    @Override
    public Client modifyMenu(Menu e, Long id) {
        return null;
    }
}
