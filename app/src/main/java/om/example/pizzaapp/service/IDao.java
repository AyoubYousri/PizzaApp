package om.example.pizzaapp.service;

import java.util.List;

public interface IDao<T> {
    void create(T o);
    List<T> findAll();
}