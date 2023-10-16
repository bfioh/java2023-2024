package ru.mikov.MyFirstTestAppSpringBoot.hello;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


@RestController
public class HelloController {

    private List<String> anyWeb = new ArrayList<>();
    private Map<String, String> anyMap = new HashMap<>();

    @GetMapping("/hello")
    public String hello(@RequestParam(value = "name",
            defaultValue = "World") String name) {
        return String.format("Hello %s!", name);

    }

    /*метод updateArrayList(String s), который обрабатывает GET апрос на url “/update-array” принимает аргумент
    и записывает его в ArrayList<String >, реализуйте логику - если это первый вызов метода,
    то создается пустой ArrayList, если он не пустой, то туда записывается значение.*/
    @GetMapping("/update-array/{value}")
    public String updateArrayList(@PathVariable("value") String value) {
        String outMessage;
        if (anyWeb.isEmpty()) {
            anyWeb.add(value);
            outMessage = "пустой Array List создан и ваши данные записаны";
        } else {
            anyWeb.add(value);
            outMessage = value + ": добавлен в Array List";
        }
        return outMessage;
    }

    /*метод showArrayList(), который обрабатывает GET апрос на url “/show-array” и возвращает все элементы
    хранящиеся в ArrayList <String >*/
    @GetMapping("/show-array")
    public List<String> showArrayList() {
        return anyWeb;

    }

    /*GET-метод updateHashMap(String s), который по url “/update-map” принимает аргумент и записывает
     его в HashMap<String, String>, реализуйте логику - если это первый вызов метода,
     то создается пустой HashMap, если он не пустой, то туда записывается значение*/
    @GetMapping("/update-map/{key}/{value}")
    public Map<String, String> updateHashMap(@PathVariable("key") String key,
                                             @PathVariable("value") String value) {
        if (anyMap.isEmpty()) {
            anyMap.put(key, value);
        } else {
            anyMap.put(key, value);
        }
        return anyMap;
    }

    /*GET метод showHashMap (), который по url “/show-map” возвращается все элементы
    хранящиеся в HashMap<String, String>, созданном */
    @GetMapping("/show-map")
    public Map<String, String> showHashMap() {

        return anyMap;
    }

    /*метод showAllLenght (), который обрабатывает GET апрос на url “/show-all-lenght” и возвращает текст,
    в котором указано количество элементов в ArrayList и HashMap*/
    @GetMapping("/show-all-length")
    public String showAllLength() {
        int arrayListLength = anyWeb.size();
        int hashMapLength = anyMap.size();
        return "Количество элементов в ArrayList: " + arrayListLength + "<br><hr>" +
                "Количество элементов в HashMap: " + hashMapLength;
    }
}