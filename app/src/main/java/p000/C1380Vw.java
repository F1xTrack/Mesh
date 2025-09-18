package p000;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: Vw */
/* loaded from: classes.dex */
public final class C1380Vw extends HashMap {
    /* renamed from: a */
    public static Map m8640a(String str, String str2) {
        HashMap map = new HashMap(1);
        map.put(str, str2);
        return Collections.unmodifiableMap(map);
    }

    /* renamed from: b */
    public static Map m8641b(String str, String str2, String str3, String str4) {
        HashMap map = new HashMap(2);
        map.put(str, str2);
        map.put(str3, str4);
        return Collections.unmodifiableMap(map);
    }
}
