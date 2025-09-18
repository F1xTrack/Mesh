package defpackage;

/* renamed from: mY1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5907mY1 implements InterfaceC2347bY1 {
    public static final WO1 a;

    static {
        VG vg = new VG(AbstractC7022sO1.a("com.google.android.gms.measurement"), "", "", true, true);
        vg.s("measurement.sdk.collection.enable_extend_user_property_size", true);
        vg.s("measurement.sdk.collection.last_deep_link_referrer2", true);
        a = vg.s("measurement.sdk.collection.last_deep_link_referrer_campaign2", false);
        vg.q(0L, "measurement.id.sdk.collection.last_deep_link_referrer2");
    }
}
