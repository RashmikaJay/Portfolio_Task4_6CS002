package SimplePackage;
import java.lang.reflect.Field;

public class Reflection6 {
	
	public static void main(String[] args) throws Exception {
		Simple s = new Simple();
		Field [] fields = s.getClass().getDeclaredFields();
		System.out.printf("There are %d fields\n", fields.length);
		for(Field f : fields) {
			System.out.printf("field name=%s type=%s accessible=%s\n", f.getName(), f.getType(), f.isAccessible());
		}
	}

}
