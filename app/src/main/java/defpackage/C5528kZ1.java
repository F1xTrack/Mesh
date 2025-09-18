package defpackage;

/* renamed from: kZ1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5528kZ1 implements InterfaceC3416dZ1 {
    public static final WO1 a;

    static {
        VG vg = new VG(AbstractC7022sO1.a("com.google.android.gms.measurement"), "", "", true, true);
        vg.s("measurement.client.sessions.background_sessions_enabled", true);
        a = vg.s("measurement.client.sessions.enable_fix_background_engagement", false);
        vg.s("measurement.client.sessions.immediate_start_enabled_foreground", true);
        vg.s("measurement.client.sessions.enable_pause_engagement_in_background", true);
        vg.s("measurement.client.sessions.remove_expired_session_properties_enabled", true);
        vg.s("measurement.client.sessions.session_id_enabled", true);
        vg.q(0L, "measurement.id.client.sessions.enable_fix_background_engagement");
    }
}
