package dataOps;
import java.util.Arrays;
import java.util.Comparator;
import java.util.NoSuchElementException;
import java.util.Random;

public class EnumOps<T extends Enum<T>>
{
	private static final Random random = new Random();
	
    public static <T> T RandomEnum(Class<T> token) {
    	T[] values = token.getEnumConstants();
        return values[random.nextInt(values.length)];
    }
    
    public static <T> T minLengthValues(Class<T> token) {
    	T[] values = token.getEnumConstants();
    	return Arrays.stream(values)
    			.min(Comparator.comparing(x->x.toString().length()))
    			.orElseThrow(NoSuchElementException::new);
    }
    
    public static <T> T maxLengthValues(Class<T> token) {
    	T[] values = token.getEnumConstants();
    	return Arrays.stream(values)
    			.max(Comparator.comparing(x->x.toString().length()))
    			.orElseThrow(NoSuchElementException::new);
    }
}

