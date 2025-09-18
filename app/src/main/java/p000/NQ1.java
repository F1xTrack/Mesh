package p000;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.WritableArray;
import java.net.SocketTimeoutException;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public abstract class NQ1 {
    /* renamed from: a */
    public static AbstractC6511nn m5673a(AbstractC6511nn... abstractC6511nnArr) {
        List listAsList = Arrays.asList(abstractC6511nnArr);
        return listAsList.isEmpty() ? new C6639pn() : listAsList.size() == 1 ? (AbstractC6511nn) listAsList.get(0) : new C6574on(listAsList);
    }

    /* renamed from: b */
    public static void m5674b(ReactApplicationContext reactApplicationContext, int i, String str, Throwable th) {
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

    /* renamed from: c */
    public static void m5675c(ReactApplicationContext reactApplicationContext, int i) {
        WritableArray writableArrayCreateArray = Arguments.createArray();
        writableArrayCreateArray.pushInt(i);
        writableArrayCreateArray.pushNull();
        if (reactApplicationContext != null) {
            reactApplicationContext.emitDeviceEvent("didCompleteNetworkResponse", writableArrayCreateArray);
        }
    }
}
