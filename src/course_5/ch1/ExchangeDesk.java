package course_5.ch1;

import java.lang.reflect.InvocationTargetException;

public class ExchangeDesk {

    public <F extends Currency,T extends Currency> T convert(F from, Class<T> toClass, float rate) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        T result = null;

        float currentValue = from.getValue();
        result = toClass.getDeclaredConstructor().newInstance();
        result.setValue(currentValue * rate);

        return result;
    }
}
