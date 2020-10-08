


public class Building {

  String nameOfBuilding;
  int numOfFloor;
  int numOfRoomsperFloor;
  String colour;
   
    public Building(String name, int numoffloor, int numofroomsperfloor, String color){
        nameOfBuilding= name;
        numOfFloor= numoffloor;
        numOfRoomsperFloor= numofroomsperfloor;
        colour= color;  
    }
    
    
    public void setNameOfBulding(String name) {
        nameOfBuilding= name;
    }

    public void setNumberOfFloor(int numoffloor) {
       numOfFloor= numoffloor;
    }

    public void setNumberOfRoomsPerFloor(int numofroomsperfloor) {
        numOfRoomsperFloor= numofroomsperfloor;
    }

    public void setColor(String color) {
        colour= color; 
    }

    public String getNameOfBulding() {
        return nameOfBuilding;
    }

    public int getNumberOfFloor() {
        return numOfFloor;
    }

    public int getNumberOfRoomsPerFloor() {
        return numOfRoomsperFloor;
    }

    public String getColor() {
        return colour;
    }
    
    public static void main(String[]args){
       Building[]building = new Building[5];
        building[0] =new Building("Bulding1",8,18,"White");
        building[1] =new Building("Bulding2",3,9,"Brown");
        building[2] =new Building("Bulding3",5,10,"Yellow");
        building[3] =new Building("Bulding4",10,20,"Pink");
        building[4] =new Building("Bulding5",6,14,"Black");
        
        System.out.println("Start of report");
        for(int count =0;  count < building.length ; count ++){
            System.out.println(building[count].getNameOfBulding() + " is a " + building[count].getColor() +
                    " building and has " +(building[count].getNumberOfFloor() * building[count].getNumberOfRoomsPerFloor()) + " rooms " );
        }
        System.out.println("End of report");
        
    }

}
