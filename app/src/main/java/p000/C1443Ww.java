package p000;

import java.util.Collections;
import java.util.Map;

/* renamed from: Ww */
/* loaded from: classes.dex */
public final class C1443Ww extends OT1 {

    /* renamed from: a */
    public static C1443Ww f13457a;

    /* renamed from: b */
    public static final Map f13458b;

    static {
        C1380Vw c1380Vw = new C1380Vw();
        c1380Vw.put(461L, "FIREPERF_AUTOPUSH");
        c1380Vw.put(462L, "FIREPERF");
        c1380Vw.put(675L, "FIREPERF_INTERNAL_LOW");
        c1380Vw.put(676L, "FIREPERF_INTERNAL_HIGH");
        f13458b = Collections.unmodifiableMap(c1380Vw);
    }

    @Override // p000.OT1
    /* renamed from: b */
    public final String mo6075b() {
        return "com.google.firebase.perf.LogSourceName";
    }
}
