package p000;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes2.dex */
public final class P51 {

    /* renamed from: a */
    public static final ConcurrentHashMap f8851a = new ConcurrentHashMap();

    /* renamed from: b */
    public static final C1753aw[] f8852b = new C1753aw[4];

    /* renamed from: a */
    public static ArrayList m6226a(C1753aw c1753aw) {
        ArrayList arrayList = new ArrayList((ArrayList) c1753aw.f16682b);
        ((ArrayList) c1753aw.f16682b).clear();
        ((HashMap) c1753aw.f16684d).clear();
        ((HashMap) c1753aw.f16685e).clear();
        int i = 0;
        ((StringBuilder) c1753aw.f16686f).setLength(0);
        c1753aw.f16687g = null;
        c1753aw.f16683c = false;
        synchronized (f8852b) {
            while (true) {
                if (i >= 4) {
                    break;
                }
                try {
                    C1753aw[] c1753awArr = f8852b;
                    if (c1753awArr[i] == null) {
                        c1753awArr[i] = c1753aw;
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

    /* renamed from: b */
    public static C1753aw m6227b() {
        synchronized (f8852b) {
            for (int i = 0; i < 4; i++) {
                try {
                    C1753aw[] c1753awArr = f8852b;
                    C1753aw c1753aw = c1753awArr[i];
                    if (c1753aw != null) {
                        c1753awArr[i] = null;
                        return c1753aw;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return new C1753aw(8);
        }
    }
}
