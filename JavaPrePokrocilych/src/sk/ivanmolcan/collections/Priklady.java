package sk.ivanmolcan.collections;

import sk.ivanmolcan.Osoba;

import java.io.*;
import java.util.*;

public class Priklady {

    public static int uloha1(String str){
//        List<String> list = Arrays.asList(arrayList);
        int cnt = 0;
        int f = 0;
        List<String> list = new ArrayList<>();
        list.add("Peter");
        list.add("Jozef");
        list.add("Fero");

        list.add(0,"Ivan");
        list.remove(2);
        list.add(2, "Matus");

        for(String s : list){
            System.out.print(s + ", ");
            if(!s.equals(str)){
                f ++;
            }
        }
        System.out.println();

        Iterator i = list.iterator();
        while(i.hasNext()){
            if(i.next().equals(str)){
                System.out.println(list.get(cnt));
                System.out.println(cnt);
            }
            cnt++;
        }

        if(f == list.size()){
            list.add(str);
        }

        System.out.println("Nove");
        for(String s : list){
            System.out.print(s + ", ");
        }

        return 0;
    }

    public static void uloha2(){
        List<String> list1 = new ArrayList<>();
        list1.add("Peter");
        list1.add("Jozef");
        list1.add("Fero");

        List<String> list2 = new ArrayList<>();
        list2.add("Jozefina");
        list2.add("Zuzka");
        list2.add("Lucia");

        Collections.sort(list1);
        list1.addAll(list2);
        Collections.swap(list1, 2, 5);
        System.out.println(list1.isEmpty());

        System.out.println(list1);
        System.out.println();

        for(String i : list1){
            System.out.print(list1.indexOf(i) + ", ");
        }
    }

    public static void uloha3(Integer in, String name){
        Map<Integer, Osoba> map = new HashMap<>();
        map.put(1, new Osoba("Peter", "Beno", 25));
        map.put(2, new Osoba("Karol", "Slepec", 18));
        map.put(3, new Osoba("Tomas", "Vlak", 22));
        List<Osoba> list = new ArrayList<>();

        for(Integer i : map.keySet()){
            list.add(map.get(i));
        }

//        for(Map.Entry e : map.entrySet()){
//            System.out.printf(e.getKey() + ": " + e.getValue());
//            System.out.println();
//        }

        for(Osoba o : list){
            System.out.println(o);
        }

        if(map.containsKey(in)){
            if(map.get(in).getFirstName().equals(name)){
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        } else {
            System.out.println("Wrong key");
        }
    }

    public static void readingToColl(){
        File file =new File("D:\\Doc\\Programovanie\\Java\\Projects\\JavaPrePokrocilych\\resources\\kontakty\\zoznamKontaktov.txt");
        int cnt =0;
        List<String> lines = new ArrayList<>();

        try(BufferedReader br = new BufferedReader(new FileReader(file))){
            String line;
            while(br.ready()){
                line = br.readLine();
                lines.add(cnt, line);
                cnt++;
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (IOException e) {
            System.out.println("Problem reading file: " + file.getName());
        }
        for(String s : lines){
            System.out.println(s);
        }

    }

    public static void main(String[] args) {

//        uloha1("Patrik");
//        uloha2();
//        uloha3(3, "Karol");
        readingToColl();

    }
}
