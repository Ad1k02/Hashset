/*
int r = (int) (Math.random() * (10 - 1)) + 1;
1 часть
Дано 1. List который на старте заполняется двадцатью рандомными числами от 1 до 9
2. Set в который нужно перенести числа из первого листа
3. List в который должны попасть дубликаты не попавшие в Set
вывести в консоль все коллекции и количество не попавших цифр

2 часть
Создать репозиторий в github
подключить репозиторий в свой проект
запушить код в репозиторий на github
*/

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        List<Integer> dublicat = new ArrayList<>();
        for(int i=0; i<=19;i++){
            list.add((int)(Math.random() * (10 - 1)) + 1);
        }
        System.out.println("Все числа = " + list);
        Set<Integer> set = new HashSet<>(list);
        System.out.println("Set  = " + set);


        for (int i = 0; i < list.size(); i++) {
            int chislo = list.get(i);
            if (list.indexOf(chislo) != i) {
                if (!dublicat.contains(chislo)) {
                    dublicat.add(chislo);
                }
            }
        }
        System.out.println("List = " + dublicat);
        System.out.println("Количество не попавших цифр(дубликаты) = " + dublicat.size());
    }
}
