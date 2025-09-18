package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: t4, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC7151t4 {
    public static final CopyOnWriteArraySet a = new CopyOnWriteArraySet();
    public static final Map b;

    static {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Package r2 = C6363ox0.class.getPackage();
        String name = r2 != null ? r2.getName() : null;
        if (name != null) {
            linkedHashMap.put(name, "OkHttp");
        }
        linkedHashMap.put(C6363ox0.class.getName(), "okhttp.OkHttpClient");
        linkedHashMap.put(Z30.class.getName(), "okhttp.Http2");
        linkedHashMap.put(C2272b91.class.getName(), "okhttp.TaskRunner");
        linkedHashMap.put("okhttp3.mockwebserver.MockWebServer", "okhttp.MockWebServer");
        b = AbstractC7096sn0.o(linkedHashMap);
    }
}
