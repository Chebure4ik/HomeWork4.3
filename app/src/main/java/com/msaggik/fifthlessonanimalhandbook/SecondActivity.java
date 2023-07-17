package com.msaggik.fifthlessonanimalhandbook;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class SecondActivity extends AppCompatActivity {

    // создание коллекции контейнера для данных класса Animal
    List<Plant> plants = new ArrayList<Plant>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        // инициализируем контейнер
        setInitialData();

        // создадим объект RecyclerView и привяжем к нему соответствующий id
        RecyclerView recyclerView = findViewById(R.id.list_plant);

        // создадим адаптер и загрузим в него контейнер с данными
        PlantAdapter adapter = new PlantAdapter(this, plants);

        // на recyclerView подадим адаптер
        recyclerView.setAdapter(adapter);
    }

    // метод setInitialData() устанавливает начальный набор данных (а именно изображения из папки res/drawables)
    private void setInitialData() {
        // добавление в контейнер plants объектов сущности Plant
        plants.add( new Plant("Кактус", "Есть очень много разновидностей, но большинство имеет длинные корни и колючки",
                R.drawable.cactus, "Численность средняя"));
        plants.add( new Plant("Акация", "Очень устойчивое к жаре и сухости дерево",
                R.drawable.acacia, "Численность средняя"));
        plants.add( new Plant("Полынь", "Растет не только в пустынях и может вырастать до 1,5 метров в высоту",
                R.drawable.sagebrush, "Численность очень большая"));
        plants.add( new Plant("Агава", "Внешне похоже на алое, но размер и цвет листьев отличается",
                R.drawable.agave, "Численность средняя"));
        plants.add( new Plant("Юкка", "",
                R.drawable.ukka, "Численность большая"));
    }
}