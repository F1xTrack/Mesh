package p000;

/* renamed from: Sw */
/* loaded from: classes.dex */
public final class C1191Sw extends OT1 {

    /* renamed from: a */
    public static C1191Sw f11077a;

    /* renamed from: d */
    public static synchronized C1191Sw m7468d() {
        try {
            if (f11077a == null) {
                f11077a = new C1191Sw();
            }
        } catch (Throwable th) {
            throw th;
        }
        return f11077a;
    }

    @Override // p000.OT1
    /* renamed from: b */
    public final String mo6075b() {
        return "isEnabled";
    }

    @Override // p000.OT1
    /* renamed from: c */
    public final String mo6076c() {
        return "firebase_performance_collection_enabled";
    }
}
