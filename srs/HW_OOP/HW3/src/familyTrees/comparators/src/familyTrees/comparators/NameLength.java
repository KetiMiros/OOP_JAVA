package HW_OOP.HW3.src.familyTrees.comparators.src.familyTrees.comparators;

import java.util.Comparator;

import HW_OOP.HW3.src.familyTrees.human.Human;

public class NameLength implements Comparator<Human> {
  public int compare(Human human1, Human human2) {
    return human1.getNAME().length() - human2.getNAME().length();
  }
}