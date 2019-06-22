import shop.ISell;

import java.util.ArrayList;

public class MusicStore {

    private ArrayList<ISell> inventory;

    public MusicStore(){
        this.inventory = new ArrayList<>();
    }


    public ArrayList<ISell> getInventory() {
        return inventory;
    }

    public void setInventory(ArrayList<ISell> inventory) {
        this.inventory = inventory;
    }

    public void addToInventory(ISell inventory){
        this.inventory.add(inventory);
    }

    public int inventoryCount(){
        return this.inventory.size();
    }

    public void removeFromInventory(ISell inventory){
        this.inventory.remove(inventory);
    }

}
