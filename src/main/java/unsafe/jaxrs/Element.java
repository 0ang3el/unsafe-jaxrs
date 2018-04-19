package unsafe.jaxrs;

import java.util.ArrayList;
import com.fasterxml.jackson.annotation.*;

public abstract class Element {

    @JsonTypeInfo(use=JsonTypeInfo.Id.CLASS, include=JsonTypeInfo.As.PROPERTY, property="@class")
    public Object something1;

    @JsonTypeInfo(use=JsonTypeInfo.Id.CLASS, include=JsonTypeInfo.As.WRAPPER_OBJECT, property="@class")
    public ArrayList<Object> something2;
}
