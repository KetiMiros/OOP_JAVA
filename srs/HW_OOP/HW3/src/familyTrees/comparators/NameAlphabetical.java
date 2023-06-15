package HW_OOP.HW33.src.familyTrees.comparators;

import java.util.Comparator;

import HW_OOP.HW33.src.familyTrees.human.Human;

public class NameAlphabetical implements Comparator<Human> {
  public int compare(Human human1, Human human2) {
    return human1.getNAME().compareTo(human2.getNAME());
  }
}