package HW_OOP.HW3.src.familyTrees.human.iterators;

import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

import HW_OOP.HW3.src.familyTrees.human.Human;

public class HumanIterator implements Iterator<Human> {

  private int index;
  private List<Human> humanList;

  public HumanIterator(List<Human> humanList) {
    this.humanList = humanList;
  }

  @Override

  public boolean hasNext() {
    return index < humanList.size();
  }

  @Override
  public Human next() {
    return humanList.get(index++);
  }
}