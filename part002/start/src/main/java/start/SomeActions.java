package ru.dimcher.part002.start;

import ru.dimcher.part002.models.*;

/**
 * This class is a basic template
 */
public abstract class SomeActions extends Item {
     public abstract Item add(Item item);
     public abstract Item findById(String id);
     public abstract void editById(Item item,String name,String description);
     public abstract void deleteById(Item item);
     public abstract Item addComments(Item item);
     public abstract Item[] findBy();




}
