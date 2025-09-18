package p000;

/* renamed from: Tw */
/* loaded from: classes.dex */
public final class C1254Tw extends OT1 {

    /* renamed from: a */
    public static C1254Tw f11598a;

    /* renamed from: d */
    public static synchronized C1254Tw m7826d() {
        try {
            if (f11598a == null) {
                f11598a = new C1254Tw();
            }
        } catch (Throwable th) {
            throw th;
        }
        return f11598a;
    }

    @Override // p000.OT1
    /* renamed from: b */
    public final String mo6075b() {
        return "com.google.firebase.perf.ExperimentTTID";
    }

    @Override // p000.OT1
    /* renamed from: c */
    public final String mo6076c() {
        return "experiment_app_start_ttid";
    }
}
