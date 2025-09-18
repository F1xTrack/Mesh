package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes2.dex */
public final class P51 {
    public static final ConcurrentHashMap a = new ConcurrentHashMap();
    public static final C2226aw[] b = new C2226aw[4];

    public static ArrayList a(C2226aw c2226aw) {
        ArrayList arrayList = new ArrayList((ArrayList) c2226aw.b);
        ((ArrayList) c2226aw.b).clear();
        ((HashMap) c2226aw.d).clear();
        ((HashMap) c2226aw.e).clear();
        int i = 0;
        ((StringBuilder) c2226aw.f).setLength(0);
        c2226aw.g = null;
        c2226aw.c = false;
        synchronized (b) {
            while (true) {
                if (i >= 4) {
                    break;
                }
                try {
                    C2226aw[] c2226awArr = b;
                    if (c2226awArr[i] == null) {
                        c2226awArr[i] = c2226aw;
                        break;
                    }
                    i++;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return arrayList;
    }

    public static C2226aw b() {
        synchronized (b) {
            for (int i = 0; i < 4; i++) {
                try {
                    C2226aw[] c2226awArr = b;
                    C2226aw c2226aw = c2226awArr[i];
                    if (c2226aw != null) {
                        c2226awArr[i] = null;
                        return c2226aw;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return new C2226aw(8);
        }
    }
}
