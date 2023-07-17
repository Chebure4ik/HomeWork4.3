package com.msaggik.fifthlessonanimalhandbook;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class PlantAdapter extends RecyclerView.Adapter<PlantAdapter.ViewHolder> {

    // поля адаптера
    private final LayoutInflater inflater; // поле для трансформации layout-файла во View-элемент
    private final List<Plant> plants; // поле коллекции контейнера для хранения данных (объектов класса Animal)

    // конструктор адаптера
    public PlantAdapter(Context context, List<Plant> plants) {
        this.inflater = LayoutInflater.from(context);
        this.plants = plants;
    }

    // метод onCreateViewHolder() возвращает объект ViewHolder(), который будет хранить данные по одному объекту Animal
    @Override
    public PlantAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.list_item, parent, false); // трансформация layout-файла во View-элемент
        return new ViewHolder(view);
    }

    // метод onBindViewHolder() выполняет привязку объекта ViewHolder к объекту Animal по определенной позиции
    @Override
    public void onBindViewHolder(PlantAdapter.ViewHolder holder, int position) {
        Plant plant = plants.get(position);
        holder.animalView.setImageResource(plant.getPlantResource());
        holder.nameView.setText(plant.getName());
        holder.plantDescriptionView.setText(plant.getPlantDescription());
        holder.populationSizeView.setText(plant.getPopulationSize());
    }

    // метод getItemCount() возвращает количество объектов в списке
    @Override
    public int getItemCount() {
        return plants.size();
    }

    // созданный статический класс ViewHolder
    public static class ViewHolder extends RecyclerView.ViewHolder {
        // неизменяемые поля представления
        final ImageView animalView;
        final TextView nameView, plantDescriptionView, populationSizeView;

        // конструктор класса ViewHolder с помощью которого мы связываем поля и представление list_item.xml
        ViewHolder(View view) {
            super(view);
            animalView = view.findViewById(R.id.animalResource);
            nameView = view.findViewById(R.id.name);
            plantDescriptionView = view.findViewById(R.id.animalDescription);
            populationSizeView = view.findViewById(R.id.populationSize);
        }
    }
}
