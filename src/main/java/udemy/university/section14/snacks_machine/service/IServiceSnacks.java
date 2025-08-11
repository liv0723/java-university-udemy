package udemy.university.section14.snacks_machine.service;

import udemy.university.section14.snacks_machine.entity.Snack;

import java.util.List;

public interface IServiceSnacks {
    void addSnack(Snack snack);
    List<Snack> getSnacks();
    void showSnacks();

}
