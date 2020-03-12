package tracker;

import java.util.Arrays;
import java.util.Random;

public class Tracker {
    /**
     * Массив для хранения заявок.
     */
    private final Item[] items = new Item[100];

    /**
     * Указатель ячейки для новой заявки.
     */
    private int position = 0;

    /**
     * Метод добавления заявки в хранилище
     * @param item новая заявка
     */
    public Item add(Item item) {
        item.setId(generateId());
        items[position++] = item;
        return item;
    }
    /**
     * Метод получение списка всех заявок
     */
    public Item[] findAll(){
        Item[] items = new Item[position];
        for (int i = 0; i < items.length-1; i++) {
            if (items[i] != null){
                items = Arrays.copyOf(this.items, position);
            }
        }
        return items;
    }

    /**
     * Метод получения списка по имени
     */
    public Item[] findByName(String key){
        Item[] items = new Item[position];
        for (int i = 0; i < items.length-1; i++) {
            if (items[i].getName() == key){
                items = Arrays.copyOf(this.items, position);
            }
        }
        return items;
    }

    /**
     * Метод получения заявки по id
     */
    public Item findById(String id) {
        // Находим индекс
        int index = indexOf(id);
        // Если индекс найден возвращаем item, иначе null
        return index != -1 ? items[index] : null;
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
        for (int index = 0; index < position; index++) {
            if (items[index].getId().equals(id)) {
                rsl = index;
                break;
            }
        }
        return rsl;
    }

    public boolean replace(String id, Item item) {
        int rsl = indexOf(id);
        boolean flag = false;
        if (rsl != -1){
            this.items[rsl].setName(item.getName());
            flag = true;
        }
        return flag;
    }

    public boolean delete(String id) {
        int index = indexOf(id);
        boolean flag = false;
        if (index != -1){
            System.arraycopy(items, index + 1, items, index, position - index);
            items[position - 1] = null;
            position--;
            flag = true;
        }
        return flag;
    }
}
