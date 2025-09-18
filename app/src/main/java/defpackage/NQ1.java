package defpackage;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.WritableArray;
import java.net.SocketTimeoutException;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public abstract class NQ1 {
    public static AbstractC6141nn a(AbstractC6141nn... abstractC6141nnArr) {
        List listAsList = Arrays.asList(abstractC6141nnArr);
        return listAsList.isEmpty() ? new C6523pn() : listAsList.size() == 1 ? (AbstractC6141nn) listAsList.get(0) : new C6332on(listAsList);
    }

    public static void b(ReactApplicationContext reactApplicationContext, int i, String str, Throwable th) {
        WritableArray writableArrayCreateArray = Arguments.createArray();
        writableArrayCreateArray.pushInt(i);
        writableArrayCreateArray.pushString(str);
        if (th != null && th.getClass() == SocketTimeoutException.class) {
            writableArrayCreateArray.pushBoolean(true);
        }
        if (reactApplicationContext != null) {
            reactApplicationContext.emitDeviceEvent("didCompleteNetworkResponse", writableArrayCreateArray);
        }
    }

    public static void c(ReactApplicationContext reactApplicationContext, int i) {
        WritableArray writableArrayCreateArray = Arguments.createArray();
        writableArrayCreateArray.pushInt(i);
        writableArrayCreateArray.pushNull();
        if (reactApplicationContext != null) {
            reactApplicationContext.emitDeviceEvent("didCompleteNetworkResponse", writableArrayCreateArray);
        }
    }
}
