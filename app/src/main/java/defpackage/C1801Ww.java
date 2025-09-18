package defpackage;

import java.util.Collections;
import java.util.Map;

/* renamed from: Ww, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1801Ww extends OT1 {
    public static C1801Ww a;
    public static final Map b;

    static {
        C1723Vw c1723Vw = new C1723Vw();
        c1723Vw.put(461L, "FIREPERF_AUTOPUSH");
        c1723Vw.put(462L, "FIREPERF");
        c1723Vw.put(675L, "FIREPERF_INTERNAL_LOW");
        c1723Vw.put(676L, "FIREPERF_INTERNAL_HIGH");
        b = Collections.unmodifiableMap(c1723Vw);
    }

    @Override // defpackage.OT1
    public final String b() {
        return "com.google.firebase.perf.LogSourceName";
    }
}
