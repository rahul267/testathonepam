package Utilities;

        import java.util.HashMap;
        import java.util.Map;


public class ContextVariable {

    private static ContextVariable contextVariable= new ContextVariable();
    private static final Map<String,Object> contextData = new HashMap<>();

    public Object getContextData(String variable) {
        return contextData.getOrDefault(variable,"DataNotAvailable");
    }

    public void saveContextData(String variable, Object value) {
        contextData.put(variable,value);
    }


    private ContextVariable(){

    }

    public static ContextVariable getInstance(){
        return contextVariable;
    }
}
