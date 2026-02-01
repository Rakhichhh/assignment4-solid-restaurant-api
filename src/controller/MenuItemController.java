package controller;

import model.MenuItem;
import service.MenuItemService;

public class MenuItemController {

    private final MenuItemService service;

    public MenuItemController(MenuItemService service) {
        this.service = service;
    }

    public void create(MenuItem item) {
        service.create(item);
    }

    public void printAll() {
        System.out.println("ALL:");
        for (MenuItem i : service.getAll()) {
            System.out.println(i.toDisplayString());
        }
    }

    public void printSorted() {
        System.out.println("\nSORTED:");
        for (MenuItem i : service.getAllSortedByPrice()) {
            System.out.println(i.toDisplayString());
        }
    }
}
