package defpackage;

/* loaded from: classes.dex */
public final class HX1 implements KX1 {
    public static final WO1 a;
    public static final WO1 b;
    public static final WO1 c;

    static {
        VG vg = new VG(AbstractC7022sO1.a("com.google.android.gms.measurement"), "", "", true, true);
        vg.s("measurement.service.audience.fix_skip_audience_with_failed_filters", true);
        a = vg.s("measurement.audience.refresh_event_count_filters_timestamp", false);
        b = vg.s("measurement.audience.use_bundle_end_timestamp_for_non_sequence_property_filters", false);
        c = vg.s("measurement.audience.use_bundle_timestamp_for_event_count_filters", false);
    }
}
