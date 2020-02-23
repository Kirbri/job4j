package ru.job4j.array;

public class FindLoop {
    public int indexOf(int[] data, int el) {
        int rst = -1; // если элемента нет в массиве, то возвращаем -1.
        for (int index= 0; index<data.length;index++) {
            if (data[index] == el) {
                rst = index;
                break;
            }
        }
        return rst;
    }

    public static int indexOf(int[] data, int el, int start, int finish) {
        //data - массив чисел, el - элемент, который нужно найти, start - индекс с которого начинаем поиск, finish - индекс которым заканчиваем поиск
        int rst = -1; // если элемента нет в массиве, то возвращаем -1.
        for (int i = start; i <=finish ; i++) {
            if (data[i]==el){
                rst=i;
                break;
            }
        }
        return rst;
    }
}