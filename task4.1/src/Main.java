import java.util.*;
public class Main {
    public static Map<String, String> createMap()
    {
        Map<String, String> map = new HashMap<>();
        map.put("Иванов", "Иван");
        map.put("Малинкин", "Иван");
        map.put("Константинов", "Костя");
        map.put("Петрова", "Мария");
        map.put("Сидоров", "Василий");
        map.put("Никитина", "Екатерина");
        map.put("Пешков", "Петр");
        map.put("Морозова", "София");
        map.put("Гаврилов", "Ярослав");
        map.put("Великая", "София");
        return map;
    }

    public static void removeTheFirstNameDuplicates(Map<String, String> map)
    {
        Map<String, String> сop = new HashMap<>(map);
        for (Map.Entry<String, String> names : cop.entrySet())
        {
            String name = names.getValue();
            Map<String, String> comp = new HashMap<>(map);
            removeItemFromMapByValue(map, name);
            if (map.size() < comp.size()){
                map.remove(names.getKey());
            }
        }
    }
    public static void removeItemFromMapByValue(Map<String, String> map, String value)
    {
        Map<String, String> сop = new HashMap<>(map);
        int cnt = 0;
        for (Map.Entry<String, String> names:  cop.entrySet())
        {
            if (names.getValue().equals(value)) {
                if (cnt > 2) map.remove(names.getKey());
                cnt++;
            }
        }
    }

    public static void printMap(Map<String,String> map)
    {
        for (String key: map.keySet()){
            String value = map.get(key);
            System.out.println("Фамилия: " + key + ", Имя: " + value);
        }
    }
    public static void main(String[] args)
    {
        Map<String, String> map = createMap();
        removeTheFirstNameDuplicates(map);
        printMap(map);
    }

}
