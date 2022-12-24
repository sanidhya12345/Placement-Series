import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class InventoryList {
    List<String> lst=new ArrayList<>();
    public void add(String name){
        if(!lst.contains(name))
           lst.add(name);
    }
    public void remove(String name){
        if(lst.contains(name))
            lst.remove(name);
    }
    public void getList(){
        if(lst.size()==0){
            System.out.print(lst.get(0));
        }
        else{
            for(int i=0;i<lst.size();i++){
                if(i!=lst.size()-1){
                    System.out.print(lst.get(i)+",");
                }
                else{
                    System.out.print(lst.get(i));
                }
            }
        }
    }
    public static void main(String[] args) {
        InventoryList obj=new InventoryList();
        Scanner sc=new Scanner(System.in).useDelimiter("\n");
        int n=sc.nextInt();
        String [] arr=new String[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.next();
        }
        for(String i:arr){
            if(i.charAt(0)=='a'){
                String s=i.split(" ")[1];
                obj.add(s);
            }
            else if(i.charAt(0)=='r'){
                String s=i.split(" ")[1];
                obj.remove(s);
            }
            else{
                obj.getList();
                System.out.println();
            }
        }
    }
}
