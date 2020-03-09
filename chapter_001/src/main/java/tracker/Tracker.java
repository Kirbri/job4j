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
    public Item findById(String id){
        Item flag = null;
        for (int i = 0; i < this.items.length-1; i++) {
            if (this.items[i].getId() == id){
                flag = this.items[i];
                break;
            }
        }
        return flag;
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
}
