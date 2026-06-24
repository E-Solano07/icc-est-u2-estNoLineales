package collections.sets;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

import models.Contacto;

public class Sets {

    public Sets() {
    }

    public Set<String> HashSet() {
        Set<String> hashSet = new HashSet<>();
        hashSet.add("A");
        hashSet.add("B");
        hashSet.add("C");
        hashSet.add("A");
        hashSet.add("D");
        hashSet.add("E");
        hashSet.add("F");
        hashSet.add("1Gggggeegeg");
        hashSet.add("2G2ggggeegeg");
        hashSet.add("3Gggggeegeg");
        hashSet.add("4Ggggggeegeg");
        hashSet.add("5Ggggggeegeg");
        hashSet.add("5Ggggggeegeg");
        hashSet.add("6Ggggggeegeg");
        hashSet.add("G7gggggeegeg");
        return hashSet;
    }

    public Set<String> construirLinkedHashSet() {
        Set<String> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add("A");
        linkedHashSet.add("B");
        linkedHashSet.add("C");
        linkedHashSet.add("D");
        linkedHashSet.add("A");
        return linkedHashSet;
    }

    public Set<String> construirTreeSet() {
        Set<String> tSet = new TreeSet<>();
        tSet.add("A");
        tSet.add("B");
        tSet.add("C");
        tSet.add("A");
        tSet.add("D");
        tSet.add("E");
        tSet.add("F");
        tSet.add("1Gggggeegeg");
        tSet.add("2G2ggggeegeg");
        tSet.add("3Gggggeegeg");
        tSet.add("4Ggggggeegeg");
        tSet.add("5Ggggggeegeg");
        tSet.add("5Ggggggeegeg");
        tSet.add("6Ggggggeegeg");
        tSet.add("G7gggggeegeg");
        return tSet;
    }

    public Set<Contacto> construirTreeSetConComparador() {
        //Set<Contacto> tCSet = new TreeSet<>((c1, c2) -> {return c1.getNombre().compareTo(c2.getNombre());});
       
        Set<Contacto> tCSet = new TreeSet<>();
        tCSet.add(new Contacto("Juan", "Perez", "123456789"));
        tCSet.add(new Contacto("Ana", "Gomez", "9876554321"));
        tCSet.add(new Contacto("Pedro", "Lopez", "456789123"));
        tCSet.add(new Contacto("Maria", "Rodriguez", "789123456"));
        tCSet.add(new Contacto("Juan", "Perez", "123456789"));
        tCSet.add(new Contacto("Juan", "Lopez", "123456789"));
        return tCSet;
    }

    public Set<Contacto> construirHashSet() {
        Set<Contacto> hCSet = new TreeSet<>();
        Contacto c1 = new Contacto("Juan", "Perez", "123456789");
        Contacto c2 = new Contacto("Ana", "Gomez", "9876554321");
        Contacto c3 = new Contacto("Pedro", "Lopez", "456789123");
        Contacto c4 = new Contacto("Maria", "Rodriguez", "789123456");
        Contacto c5 = new Contacto("Juan", "Perez", "123456789");
        Contacto c6 = new Contacto("Juan", "Lopez", "123456789");
        System.out.println("Contacto c1: " + c1.hashCode());
        System.out.println("Contacto c5: " + c5.hashCode());
        hCSet.add(c1);
        hCSet.add(c2);
        hCSet.add(c3);
        hCSet.add(c4);
        hCSet.add(c5);
        hCSet.add(c6);
        return hCSet;
    }
}
