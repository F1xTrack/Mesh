package defpackage;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: Vw, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1723Vw extends HashMap {
    public static Map a(String str, String str2) {
        HashMap map = new HashMap(1);
        map.put(str, str2);
        return Collections.unmodifiableMap(map);
    }

    public static Map b(String str, String str2, String str3, String str4) {
        HashMap map = new HashMap(2);
        map.put(str, str2);
        map.put(str3, str4);
        return Collections.unmodifiableMap(map);
    }
}
