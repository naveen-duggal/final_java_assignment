package in.ineuron.com;

//Abstract class can have abstract and non-abstract methods.
public abstract class CarImpl implements Car {

	@Override
	public void model() {
		System.out.println("Car have a model number...");
	}

	@Override
	public void engine() {
		System.out.println("car have a engine");
	
	}
}	
