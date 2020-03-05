package ru.job4j.oop;

public class Jukebox {
    public void music(int position){
        if (position == 1){
            System.out.println("Пусть бегут неуклюже" + System.lineSeparator() +
                    "Пешеходы по лужам," + System.lineSeparator() +
                    "А вода по асфальту рекой." + System.lineSeparator() +
                    "И не ясно прохожим" + System.lineSeparator() +
                    "В этот день непогожий" + System.lineSeparator() +
                    "Почему я весёлый такой." + System.lineSeparator() +
                    "" + System.lineSeparator() +
                    "Ах я играю на гармошке" + System.lineSeparator() +
                    "У прохожих на виду," + System.lineSeparator() +
                    "К сожаленью, день рожденья" + System.lineSeparator() +
                    "Только раз в году." + System.lineSeparator() +
                    "" + System.lineSeparator() +
                    "Прилетит вдруг волшебник" + System.lineSeparator() +
                    "В голубом вертолёте" + System.lineSeparator() +
                    "И бесплатно покажет кино." + System.lineSeparator() +
                    "С днём рожденья поздравит" + System.lineSeparator() +
                    "И, наверно, оставит" + System.lineSeparator() +
                    "Мне в подарок пятьсот эскимо." + System.lineSeparator() +
                    "" + System.lineSeparator() +
                    "Ах я играю на гармошке" + System.lineSeparator() +
                    "У прохожих на виду," + System.lineSeparator() +
                    "К сожаленью, день рожденья" + System.lineSeparator() +
                    "Только раз в году." + System.lineSeparator() +
                    "\n" + System.lineSeparator() +
                    "К сожаленью, день рожденья" + System.lineSeparator() +
                    "Только раз в году.");
        } else if (position == 2){
            System.out.println("Спят усталые игрушки, книжки спят." + System.lineSeparator() +
                    "Одеяла и подушки ждут ребят." + System.lineSeparator() +
                    "Даже сказка спать ложится," + System.lineSeparator() +
                    "Чтобы ночью нам присниться." + System.lineSeparator() +
                    "Ты ей пожелай:" + System.lineSeparator() +
                    "Баю-бай." + System.lineSeparator() +
                    "\n" +
                    "Обязательно по дому в этот час" + System.lineSeparator() +
                    "Тихо-тихо ходит дрема возле нас." + System.lineSeparator() +
                    "За окошком всё темнее," + System.lineSeparator() +
                    "Утро ночи мудренее." + System.lineSeparator() +
                    "Глазки закрывай," + System.lineSeparator() +
                    "Баю-бай." + System.lineSeparator() +
                    "" + System.lineSeparator() +
                    "В сказке можно покататься на луне." + System.lineSeparator() +
                    "И по радуге промчаться на коне." + System.lineSeparator() +
                    "Со слоненком подружиться" + System.lineSeparator() +
                    "И поймать перо Жар-птицы." + System.lineSeparator() +
                    "Глазки закрывай," + System.lineSeparator() +
                    "Баю-бай." + System.lineSeparator() +
                    "" + System.lineSeparator() +
                    "Баю-бай, должны все люди ночью спать." + System.lineSeparator() +
                    "Баю-баю, завтра будет день опять." + System.lineSeparator() +
                    "За день мы устали очень," + System.lineSeparator() +
                    "Скажем всем: \"Спокойной ночи!" + System.lineSeparator() +
                    "Глазки закрывай," + System.lineSeparator() +
                    "Баю-бай.");
        } else {
            System.out.println("Песня не найдена");
        }
    }

    public static void main(String[] args) {
        Jukebox boxOne = new Jukebox();
        boxOne.music(1);
        boxOne.music(2);
        boxOne.music(0);
    }
}
