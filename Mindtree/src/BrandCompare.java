import java.util.Comparator;

public class BrandCompare implements Comparator{

	@Override
	public int compare(Object arg0, Object arg1) {
		// TODO Auto-generated method stub
		Cosmetic x= (Cosmetic)arg0;
		Cosmetic y=(Cosmetic)arg1;
		
		
		
		return x.getBrand().compareTo(y.getBrand());
	}

	
}
