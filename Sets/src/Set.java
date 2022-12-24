import java.util.ArrayList;
import java.util.List;

public class Set<T> {
    List<T> set;
    public Set(){
        set=new ArrayList<>();
    }
    public boolean add(T element){
        if(!set.contains(element)){
            set.add(element);
            return true;
        }
        return false;
    }
    public boolean has(T element){
        return set.contains(element);
    }
    public int size(){
        return set.size();
    }
    public boolean remove(T element){
        if(set.contains(element)){
            set.remove(element);
            return true;
        }
        return false;
    }
    public void union(Set<T> otherSet){
        List<T> unionSet=new ArrayList<>();
        for(T ele:set){
            unionSet.add(ele);
        }
        for(T ele:otherSet.values()){
            if(!set.contains(ele)){
                unionSet.add(ele);
            }
        }
        System.out.println("Union Set:- "+unionSet);
    }
    public List<T> values(){
        return set;
    }
    public void intersection(Set<T> otherSet){
        List<T> intersectionSet=new ArrayList<>();
        for(T ele:set){
            if(otherSet.has(ele)){
                intersectionSet.add(ele);
            }
        }
        System.out.println("Interesection of Two Sets:- "+intersectionSet);
    }
    public void difference(Set<T> otherSet){
        List<T> differenceSet=new ArrayList<>();
        for(T ele:set){
            if(!otherSet.has(ele)){
                differenceSet.add(ele);
            }
        }
        System.out.println("Difference between Two Sets:- "+differenceSet);
    }
    public static void main(String[] args) {
        //For Integer Sets:-
        Set<Integer> set1=new Set<>();
        Set<Integer> set2=new Set<>();
        set1.add(10);
        set1.add(50);
        set2.add(10);
        set2.add(20);
        set2.add(30);
        set2.add(40);
        System.out.println(set1.values());
        System.out.println(set2.values());
        set1.union(set2);
        set1.intersection(set2);
        System.out.println(set1.size());
        System.out.println(set2.size());
        set1.difference(set2);

        //For Character Sets:-
        Set<Character> set3=new Set<>();
        Set<Character> set4=new Set<>();
        set3.add('a');
        set3.add('b');
        set3.add('c');
        set4.add('b');
        set4.add('c');
        set4.add('e');
        System.out.println(set3.values());
        System.out.println(set4.values());
        set3.union(set4);
        set3.intersection(set4);
        set3.difference(set4);
        set3.remove('b');
        set4.remove('c');
        System.out.println(set3.values());
        System.out.println(set4.values());
    }
}
