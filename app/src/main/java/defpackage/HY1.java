package defpackage;

/* loaded from: classes.dex */
public final class HY1 implements InterfaceC7052sY1 {
    public static final WO1 a;
    public static final WO1 b;
    public static final WO1 c;
    public static final WO1 d;
    public static final WO1 e;
    public static final WO1 f;
    public static final WO1 g;
    public static final WO1 h;
    public static final WO1 i;
    public static final WO1 j;

    static {
        VG vg = new VG(AbstractC7022sO1.a("com.google.android.gms.measurement"), "", "", true, true);
        a = vg.s("measurement.rb.attribution.ad_campaign_info", true);
        vg.s("measurement.rb.attribution.client.bundle_on_backgrounded", true);
        vg.s("measurement.rb.attribution.service.bundle_on_backgrounded", true);
        b = vg.s("measurement.rb.attribution.client2", true);
        vg.s("measurement.rb.attribution.dma_fix", true);
        c = vg.s("measurement.rb.attribution.followup1.service", false);
        d = vg.s("measurement.rb.attribution.client.get_trigger_uris_async", false);
        e = vg.s("measurement.rb.attribution.service.trigger_uris_high_priority", true);
        vg.s("measurement.rb.attribution.index_out_of_bounds_fix", true);
        f = vg.s("measurement.rb.attribution.service.enable_max_trigger_uris_queried_at_once", true);
        g = vg.s("measurement.rb.attribution.retry_disposition", false);
        h = vg.s("measurement.rb.attribution.service", true);
        i = vg.s("measurement.rb.attribution.enable_trigger_redaction", true);
        j = vg.s("measurement.rb.attribution.uuid_generation", true);
        vg.q(0L, "measurement.id.rb.attribution.retry_disposition");
        vg.q(0L, "measurement.id.rb.attribution.client.get_trigger_uris_async");
        vg.s("measurement.rb.attribution.improved_retry", true);
    }
}
