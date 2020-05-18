package tracker;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Tracker {
    /**
     * Массив для хранения заявок.
     */
    private final List<Item> items = new ArrayList<Item>(100);

    /**
     * Метод добавления заявки в хранилище
     * @param item новая заявка
     */
    public Item add(Item item) {
        item.setId(generateId());
        items.add(item);
        return item;
    }
    /**
     * Метод получение списка всех заявок
     */
    public List<Item> findAll() {
        return items;
    }

    /**
     * Метод получения списка по имени
     */
    public List<Item> findByName(String key) {
        List<Item> newItems = new ArrayList<Item>();
        int size = 0;
        for (Item item : items) {
            if (item.equals(key)) {
                newItems.add(item);
            }
        }
        return newItems;
    }

    /**
     * Метод получения заявки по id
     */
    public Item findById(String id) {
        // Находим индекс
        int index = indexOf(id);
        // Если индекс найден возвращаем item, иначе null
        return index != -1 ? items.get(index) : null;
    }

    /**
     * Метод генерирует уникальный ключ для заявки.
     * Так как у заявки нет уникальности полей, имени и описание. Для идентификации нам нужен уникальный ключ.
     * @return Уникальный ключ.
     */
    private String generateId() {
        Random rm = new Random();
        return String.valueOf(rm.nextLong() + System.currentTimeMillis());
    }

    private int indexOf(String id) {
        int rsl = -1;
        int index = 0;
        for (Item item : items) {
            index++;
            if (item.getId().equals(id)) {
                rsl = index;
                break;
            }
        }
        return rsl;
    }

    public boolean replace(String id, Item item) {
        int rsl = indexOf(id);
        boolean flag = false;
        if (rsl != -1) {
            this.items.get(rsl).setName(item.getName());
            flag = true;
        }
        return flag;
    }

    public boolean delete(String id) {
        int index = indexOf(id);
        boolean flag = false;
        if (index != -1) {
            items.remove(index);
            flag = true;
        }
        return flag;
    }
}
