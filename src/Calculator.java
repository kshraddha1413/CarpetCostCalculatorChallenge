
public class Calculator {
	Floor floor;
    Carpet carpet;
	public Calculator(Floor floor, Carpet carpet) {
		
		this.floor = floor;
		this.carpet = carpet;
	}
	public double getTotalCost() {
		double cost =floor.getArea()*carpet.cost;
		return cost;
	}
    

}
