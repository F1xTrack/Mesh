package p000;

/* renamed from: Ss */
/* loaded from: classes.dex */
public final class C1187Ss {

    /* renamed from: a */
    public static final C1187Ss f11015a = new C1187Ss();

    /* renamed from: a */
    public final void m7455a(C1482XY c1482xy) {
        c1482xy.m9077m();
        try {
            c1482xy.m9081w("DELETE FROM workspec WHERE state IN (2, 3, 5) AND (last_enqueue_time + minimum_retention_duration) < " + (System.currentTimeMillis() - AbstractC11972zo1.f47012a) + " AND (SELECT COUNT(*)=0 FROM dependency WHERE     prerequisite_id=id AND     work_spec_id NOT IN         (SELECT id FROM workspec WHERE state IN (2, 3, 5)))");
            c1482xy.m9076U();
        } finally {
            c1482xy.m9080p();
        }
    }
}
