package ca.ualberta.cs.lonelytwitter;

public abstract class Animal {
    protected String type;
    protected String food;
    public void setType(String type){
        this.type = type;
    }
    public String getType(){
        return this.type;
    }

    public void setFood(String food){
        this.food = food;
    }
    public String getFood(){
        return this.food;
    }

    public abstract void swim();
}
