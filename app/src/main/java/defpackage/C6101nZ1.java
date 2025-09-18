package defpackage;

/* renamed from: nZ1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6101nZ1 implements InterfaceC6674qZ1 {
    public static final WO1 a;
    public static final WO1 b;
    public static final WO1 c;
    public static final WO1 d;
    public static final WO1 e;
    public static final WO1 f;
    public static final WO1 g;

    static {
        VG vg = new VG(AbstractC7022sO1.a("com.google.android.gms.measurement"), "", "", true, true);
        a = vg.s("measurement.sgtm.client.scion_upload_action.dev", false);
        b = vg.s("measurement.sgtm.client.upload_on_backgrounded.dev", false);
        c = vg.s("measurement.sgtm.google_signal.enable", false);
        d = vg.s("measurement.sgtm.no_proxy.client.dev", false);
        e = vg.s("measurement.sgtm.no_proxy.service", false);
        vg.s("measurement.sgtm.preview_mode_enabled", true);
        vg.s("measurement.sgtm.rollout_percentage_fix", true);
        vg.s("measurement.sgtm.service", true);
        f = vg.s("measurement.sgtm.service.batching_on_backgrounded", false);
        g = vg.s("measurement.sgtm.upload_queue", false);
        vg.q(0L, "measurement.id.sgtm");
    }
}
