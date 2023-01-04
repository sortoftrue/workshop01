package workshop01;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class shoppingCart{

    public static void main(String[] args) {
        
        List<String> shoppingList = new LinkedList<>();
        String choice="";
        Scanner in = new Scanner(System.in);

        while(choice!="exit"){
            
            System.out.println("""
                    Welcome. Enter:
                    -list
                    -add item, item, item
                    -delete item, item, item
                    -exit""");

            choice = in.next().trim().toLowerCase();

            switch(choice){
                case "list":{
                    int itemNo = 1;

                    for(String item: shoppingList){
                        System.out.printf("%d. %s\n",itemNo,item);
                        itemNo++;
                    }
                    break;
                }
                case "add":{
                    String items = in.nextLine();
                    Scanner itemSplitter = new Scanner(items);
                    itemSplitter.useDelimiter(",");
                    
                    while(itemSplitter.hasNext()){
                        String item = itemSplitter.next().trim().toLowerCase();
                        
                        if(shoppingList.contains(item)){
                            System.out.printf("List already contains %s!\n",item);
                        } else{
                            shoppingList.add(item);
                            System.out.printf("%s was added!\n",item);
                        }
                    }

                    break;
                }
                
                case "delete":{
                    
                    int deleteChoice;

                    try{
                        deleteChoice = in.nextInt();
                    } catch (Exception e){
                        System.out.println("Please enter a number");
                        break;
                    }

                    if(deleteChoice <1 || deleteChoice > shoppingList.size()){
                        System.out.println("Choice is out of shopping list range.");
                    } else {
                        System.out.printf("%s deleted!\n",shoppingList.get(deleteChoice-1));
                        shoppingList.remove(deleteChoice-1);
                    }
                    
                    break;
                }

                case "exit":{
                    System.out.println("Bye");
                    break;
                }
                default:{
                    System.out.println("Enter a valid choice");
                    break;
                }
            }


        }

    }

}