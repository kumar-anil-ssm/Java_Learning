
public class MyGenericClass<T> {
	
	T obj;
	MyGenericClass(T obj){
		this.obj=obj;
		
	}
	
	public void displayObjectDetails() {
		System.out.println("Type of object is: "+ obj.getClass().getName());
	}
	
	//To retrieve object back
	public T getObject() {
		return obj;
	}

	

}
