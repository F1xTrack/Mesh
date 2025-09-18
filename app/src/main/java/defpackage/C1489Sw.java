package defpackage;

/* renamed from: Sw, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1489Sw extends OT1 {
    public static C1489Sw a;

    public static synchronized C1489Sw d() {
        try {
            if (a == null) {
                a = new C1489Sw();
            }
        } catch (Throwable th) {
            throw th;
        }
        return a;
    }

    @Override // defpackage.OT1
    public final String b() {
        return "isEnabled";
    }

    @Override // defpackage.OT1
    public final String c() {
        return "firebase_performance_collection_enabled";
    }
}
