
public enum CarModel {
	suzuki("suzuki", 5, CarColor.black),
	toyota("toyota", 4, CarColor.white),
	nissan("nissan", 7, CarColor.red),
	honda("honda", 4, CarColor.silver);
	
	private final String ModelName;
	private final int numberOfSeats;
	private CarColor _color;
	
	CarModel(String modelName, int numberOfSeats, CarColor color) {
        this.ModelName = modelName;
        this.numberOfSeats = numberOfSeats;
        this._color = color;
    }
	
	 public String getModelName() {
        return this.ModelName;
     }

	 public int getNumberOfSeats() {
	    return numberOfSeats;
	 }

	 public CarColor getColor() {
	    return _color;
	 }
}


