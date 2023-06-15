package HW_OOP.HW33.src.familyTrees.comparators;

import java.util.Comparator;

import HW_OOP.HW33.src.familyTrees.human.Human;

public class ByDateBirth implements Comparator<Human> {
  @Override
  public int compare(Human o1, Human o2) {
    return o1.getYearOfBirth().compareTo(o2.getYearOfBirth());
  }
}