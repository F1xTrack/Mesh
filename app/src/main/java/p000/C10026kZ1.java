package p000;

/* renamed from: kZ1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10026kZ1 implements InterfaceC9130dZ1 {

    /* renamed from: a */
    public static final WO1 f36543a;

    static {
        C1338VG c1338vg = new C1338VG(AbstractC11028sO1.m24733a("com.google.android.gms.measurement"), "", "", true, true);
        c1338vg.m8353s("measurement.client.sessions.background_sessions_enabled", true);
        f36543a = c1338vg.m8353s("measurement.client.sessions.enable_fix_background_engagement", false);
        c1338vg.m8353s("measurement.client.sessions.immediate_start_enabled_foreground", true);
        c1338vg.m8353s("measurement.client.sessions.enable_pause_engagement_in_background", true);
        c1338vg.m8353s("measurement.client.sessions.remove_expired_session_properties_enabled", true);
        c1338vg.m8353s("measurement.client.sessions.session_id_enabled", true);
        c1338vg.m8351q(0L, "measurement.id.client.sessions.enable_fix_background_engagement");
    }
}
