package defpackage;

/* renamed from: Tw, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1567Tw extends OT1 {
    public static C1567Tw a;

    public static synchronized C1567Tw d() {
        try {
            if (a == null) {
                a = new C1567Tw();
            }
        } catch (Throwable th) {
            throw th;
        }
        return a;
    }

    @Override // defpackage.OT1
    public final String b() {
        return "com.google.firebase.perf.ExperimentTTID";
    }

    @Override // defpackage.OT1
    public final String c() {
        return "experiment_app_start_ttid";
    }
}
