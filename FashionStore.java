/*
Developed By: Dattaprasad Mundada TYIT student from WCE Sangli
*/

asdwef=https://kjnrgergkjn
whjbef: https://edrgrh.brgh.com
rfgetg

import java.io.*;
import java.util.*;
class FashionStore{
    static InputStreamReader isr;
    static BufferedReader br;
    static{
        try{
            isr=new InputStreamReader(System.in);
            br=new BufferedReader(isr);
        }catch(Exception e){}
    }
    private Map <Object, Object> m = new HashMap <Object, Object>();
    private LinkedList clothing=new LinkedList();
    private LinkedList productsSold =new LinkedList();
    private LinkedList accessories=new LinkedList();
    private LinkedList stationary=new LinkedList();
    private int clothsCost,accessories_Cost, cloths_Count,accessories_Count,stationary_Cost,stationary_Count;
    public FashionStore(){
        clothsCost =accessories_Cost= cloths_Count =accessories_Count=0;
        m.put("T-shirt","500");	m.put("Shirt","900"); m.put("Jeans","1500");
        m.put("Jackets","1500"); m.put("Sweater","1500"); m.put("Bracelet","250");
        m.put("Scarf","350"); m.put("Cap","120");m.put("Ear-rings","210");m.put("Watch","2150");
        m.put("Notebook","50"); m.put("Book", "100");
        clothing.add("T-shirt"); clothing.add("Shirt"); clothing.add("Jeans");
        clothing.add("Jackets"); clothing.add("Sweater");accessories.add("Bracelet");
        accessories.add("Scarf");accessories.add("Cap");accessories.add("Ear-rings");
        accessories.add("Watch");stationary.add("Notebook");stationary.add("Book");
    }
    public boolean itemAddInStationary(String s,int cost){
        m.put(s,""+cost);
        stationary.add(""+s);
        return true;
    }
    public boolean itemAddInClothing(String s,int cost){
        m.put(s,""+cost);
        clothing.add(""+s);
        return true;
    }
    public boolean itemAddInAccessories(String s,int cost){
        m.put(s,""+cost);
        accessories.add(""+s);
        return true;
    }
    public void setInput() throws IOException{
        int num_Item=Integer.parseInt(br.readLine());
        for(int walker=0;walker<num_Item;walker++){
            String []s=br.readLine().split(" ");
            walker = inputs(walker, s);
        }
    }

    public int inputs(int walker, String[] s) {
       String s1=" "+m.get("1500");
        if(s1!=null){
            System.out.println(s1);
        }else{
            System.out.println("" + "NOT FOUND IN HASHMAP");
        }
        if(clothing.contains(s[0])){
            for (int j=0;j<Integer.parseInt(s[1]);j++ ) {
                productsSold.add(Integer.parseInt("" + m.get(s[0])));
            }
            cloths_Count = cloths_Count +Integer.parseInt(s[1]);
        }
        else{
            if(accessories.contains(s[0])){
                accessories_Cost=accessories_Cost+Integer.parseInt(""+m.get(s[0]))*Integer.parseInt(s[1]);
                accessories_Count=accessories_Count+Integer.parseInt(s[1]);
            }
            else{
                if(stationary.contains(s[0])){
                    stationary_Cost=stationary_Cost+Integer.parseInt(""+m.get(s[0]))*Integer.parseInt(s[1]);
                    stationary_Count+=Integer.parseInt(s[1]);
                }
                else {
                    System.out.println("No Item Found.Try Again");
                    walker--;
                }
            }
        }
        return walker;
    }

    public String getOutput(){
        accessories_Cost=accessories_Cost- (accessories_Cost/10);
        stationary_Cost=(stationary_Cost*19)/20;
        int []cloths_sold=new int[cloths_Count];
        for (int walker=0;walker< cloths_Count;walker++ ) {
            cloths_sold[walker]=Integer.parseInt("" + productsSold.pop());
        }
        Arrays.sort(cloths_sold);
        if(cloths_Count %4==0){
            for (int walker=0;walker< cloths_Count;walker++ ) {
                clothsCost +=cloths_sold[walker];
            }
            clothsCost =(clothsCost *3)/4;
        }
        else {
            if (cloths_Count %4==1) {
                int walker=1;
                for (;walker< cloths_Count;walker++ ) {
                    clothsCost +=cloths_sold[walker];
                }
                clothsCost =(clothsCost *3)/4;
                clothsCost +=cloths_sold[0];
            }
            else{
                if(cloths_Count %4==2){
                    int walker=2;
                    for (;walker< cloths_Count;walker++ ) {
                        clothsCost +=cloths_sold[walker];
                    }
                    clothsCost =(clothsCost *3)/4;
                    clothsCost +=((cloths_sold[0]+cloths_sold[1])*9)/10;
                }
                else{
                    int walker=3;
                    for (;walker< cloths_Count;walker++ ) {
                        clothsCost +=cloths_sold[walker];
                    }
                    clothsCost =(clothsCost *3)/4;
                    clothsCost +=((cloths_sold[0]+cloths_sold[1]+cloths_sold[2])*8)/10;
                }
            }
        }
        return "Pay Rs."+(clothsCost +accessories_Cost+stationary_Cost)+"\n Thank You";

    }
    public static void main(String[] args)throws Exception{
        FashionStore fs=new FashionStore();
     /*   if(fs.itemAddInStationary(br.readLine(),Integer.parseInt(br.readLine())))
            System.out.println("Item Successfully Added");*/
        fs.setInput();
        System.out.print(fs.getOutput());
    }
}
