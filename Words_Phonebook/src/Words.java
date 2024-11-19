import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Words {
    public static void main(String[] args) {
        // Создаем список с набором слов, где могут быть повторяющиеся слова
        List<String> words = Arrays.asList(
                "apple", "banana", "orange", "apple", "banana", "pear", "grape", "apple",
                "pear", "kiwi", "grape", "banana", "melon", "kiwi", "apple", "grape", "pear"
        );

        // Используем Map для подсчета частоты каждого слова
        Map<String, Integer> wordCount = new HashMap<>();

        // Проходим по каждому слову в списке и увеличиваем счетчик в Map
        for (String word : words) {
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }

        // Выводим уникальные слова и их частоту
        System.out.println("Список уникальных слов и их частота:");
        for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue() + " раз(раза)");
        }
    }
}
