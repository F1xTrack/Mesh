package defpackage;

/* loaded from: classes.dex */
public final class XY1 implements InterfaceC2159aZ1 {
    public static final WO1 a;

    static {
        VG vg = new VG(AbstractC7022sO1.a("com.google.android.gms.measurement"), "", "", true, true);
        vg.s("measurement.collection.enable_session_stitching_token.client.dev", true);
        vg.s("measurement.collection.enable_session_stitching_token.first_open_fix", true);
        a = vg.s("measurement.session_stitching_token_enabled", false);
        vg.s("measurement.link_sst_to_sid", true);
    }
}
