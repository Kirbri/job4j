package ru.job4j.collection;

import java.util.HashMap;

public class UsageMap {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("kanna1997@mail.ru", "Kornilova Anna Alekseevna");
        for (String key : map.keySet()) {
            String value = map.get(key);
            System.out.println("Ключ = " + key + ", значение = " + value);
        }
    }
}
