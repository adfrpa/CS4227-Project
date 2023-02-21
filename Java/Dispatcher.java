import java.util.ArrayList;
import java.util.List;

public class Dispatcher {

    // Initialize a List of Interceptors
    private List<Interceptor> interceptors = new ArrayList<>();

    // Register an interceptor to the List of Interceptors
    public void registerInterceptor(Interceptor interceptor) {
        interceptors.add(interceptor);
    }

    // Dispatch ContextObject to all registered Interceptors
    public void dispatch(ContextObject context) {

        // Loop through each registered Interceptor
        for (Interceptor interceptor : interceptors) {

            // Call the intercept method of the Interceptor with the ContextObject
            interceptor.intercept(context);
        }
    }
}
