package p000;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: t4 */
/* loaded from: classes2.dex */
public abstract class AbstractC6863t4 {

    /* renamed from: a */
    public static final CopyOnWriteArraySet f42822a = new CopyOnWriteArraySet();

    /* renamed from: b */
    public static final Map f42823b;

    static {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Package r2 = C10585ox0.class.getPackage();
        String name = r2 != null ? r2.getName() : null;
        if (name != null) {
            linkedHashMap.put(name, "OkHttp");
        }
        linkedHashMap.put(C10585ox0.class.getName(), "okhttp.OkHttpClient");
        linkedHashMap.put(Z30.class.getName(), "okhttp.Http2");
        linkedHashMap.put(C8817b91.class.getName(), "okhttp.TaskRunner");
        linkedHashMap.put("okhttp3.mockwebserver.MockWebServer", "okhttp.MockWebServer");
        f42823b = AbstractC11077sn0.m24787o(linkedHashMap);
    }
}
