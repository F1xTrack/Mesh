package defpackage;

/* renamed from: qX1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6668qX1 implements InterfaceC2344bX1 {
    public static final WO1 a;

    static {
        VG vg = new VG(AbstractC7022sO1.a("com.google.android.gms.measurement"), "", "", true, true);
        vg.s("measurement.set_default_event_parameters_with_backfill.client.dev", false);
        vg.s("measurement.defensively_copy_bundles_validate_default_params", true);
        vg.s("measurement.set_default_event_parameters_with_backfill.service", true);
        a = vg.s("measurement.set_default_event_parameters.fix_deferred_analytics_collection", false);
        vg.q(0L, "measurement.id.set_default_event_parameters.fix_deferred_analytics_collection");
        vg.s("measurement.set_default_event_parameters.fix_subsequent_launches", true);
    }
}
