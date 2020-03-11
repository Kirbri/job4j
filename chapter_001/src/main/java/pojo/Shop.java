package pojo;

import tracker.Predator;

public class Shop {
    public Product[] delete(Product[] products, int index){
        for (index = 0; index < products.length - 1; index++) {
            products[index] = products[index + 1];
        }
        products[products.length - 1] = null;
        return products;
    }

    public static void main(String[] args) {
        
//        Product products[] = new Product[5];
//        products[0] = new Product("Milk", 10);
//        products[1] = new Product("Bread", 4);
//        products[2] = new Product("Egg", 19);
//
//        for (int i = 0; i < products.length; i++) {
//            Product product = products[i];
//            //проверяем, что объект не равен null. тк у нас массив не заполнен целиком.
//            if (product != null) {
//                System.out.println(product.getName());
//            }
//        }
//
//        System.out.println();
//        System.out.println("Удаляем значение из ячейки с индексом 1");
//        //удаляем значение из ячейки с индексом 1
//        products[1] = null;
//
//        for (int i = 0; i < products.length; i++) {
//            Product product = products[i];
//            //проверяем, что объект не равен null. тк у нас массив не заполнен целиком.
//            if (product != null) {
//                System.out.println(product.getName());
//            } else {
//                System.out.println("null");
//            }
//        }
//
//        System.out.println();
//        System.out.println("Записываем  в ячейку с индексом 1 значение ячейки с индексом 2 и удаляем значение из ячейки с индексом 2");
//        //записываем в ячейку с индексом 1 значение ячейки с индексом 2.
//        products[1] = products[2];
//        //удаляем значение из ячейки с индексом 2.
//        products[2] = null;
//        for (int i = 0; i < products.length; i++) {
//            Product product = products[i];
//            //проверяем, что объект не равен null. так как  у нас массив не заполнен целиком.
//            if (product != null) {
//                System.out.println(product.getName());
//            } else {
//                System.out.println("null");
//            }
//        }

        //демонстрация работы примера
        Product products2[] = new Product[5];
        products2[1] = new Product("Milk", 10);
        products2[2] = new Product("Bread", 4);
        products2[3] = new Product("Egg", 19);
        Shop shop = new Shop();
        products2 = shop.delete(products2, 4);

        for (int i = 0; i < products2.length; i++) {
            if (products2[i] != null) {
                System.out.println(products2[i].getName());
            } else {
                System.out.println("null");
            }
        }

    }

}
