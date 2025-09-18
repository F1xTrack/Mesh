package defpackage;

/* renamed from: Ss, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1477Ss {
    public static final C1477Ss a = new C1477Ss();

    public final void a(XY xy) {
        xy.m();
        try {
            xy.w("DELETE FROM workspec WHERE state IN (2, 3, 5) AND (last_enqueue_time + minimum_retention_duration) < " + (System.currentTimeMillis() - AbstractC8433zo1.a) + " AND (SELECT COUNT(*)=0 FROM dependency WHERE     prerequisite_id=id AND     work_spec_id NOT IN         (SELECT id FROM workspec WHERE state IN (2, 3, 5)))");
            xy.U();
        } finally {
            xy.p();
        }
    }
}
