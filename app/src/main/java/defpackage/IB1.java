package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

/* loaded from: classes.dex */
public abstract class IB1 {
    public static final GJ1 A;
    public static final GJ1 A0;
    public static final GJ1 B;
    public static final GJ1 B0;
    public static final GJ1 C;
    public static final GJ1 C0;
    public static final GJ1 D;
    public static final GJ1 D0;
    public static final GJ1 E;
    public static final GJ1 E0;
    public static final GJ1 F;
    public static final GJ1 F0;
    public static final GJ1 G;
    public static final GJ1 G0;
    public static final GJ1 H;
    public static final GJ1 H0;
    public static final GJ1 I;
    public static final GJ1 I0;
    public static final GJ1 J;
    public static final GJ1 J0;
    public static final GJ1 K;
    public static final GJ1 K0;
    public static final GJ1 L;
    public static final GJ1 L0;
    public static final GJ1 M;
    public static final GJ1 M0;
    public static final GJ1 N;
    public static final GJ1 N0;
    public static final GJ1 O;
    public static final GJ1 O0;
    public static final GJ1 P;
    public static final GJ1 P0;
    public static final GJ1 Q;
    public static final GJ1 Q0;
    public static final GJ1 R;
    public static final GJ1 R0;
    public static final GJ1 S;
    public static final GJ1 S0;
    public static final GJ1 T;
    public static final GJ1 T0;
    public static final GJ1 U;
    public static final GJ1 U0;
    public static final GJ1 V;
    public static final GJ1 V0;
    public static final GJ1 W;
    public static final GJ1 W0;
    public static final GJ1 X;
    public static final GJ1 X0;
    public static final GJ1 Y;
    public static final GJ1 Y0;
    public static final GJ1 Z;
    public static final GJ1 Z0;
    public static final List a = Collections.synchronizedList(new ArrayList());
    public static final GJ1 a0;
    public static final GJ1 a1;
    public static final GJ1 b;
    public static final GJ1 b0;
    public static final GJ1 b1;
    public static final GJ1 c;
    public static final GJ1 c0;
    public static final GJ1 c1;
    public static final GJ1 d;
    public static final GJ1 d0;
    public static final GJ1 d1;
    public static final GJ1 e;
    public static final GJ1 e0;
    public static final GJ1 e1;
    public static final GJ1 f;
    public static final GJ1 f0;
    public static final GJ1 f1;
    public static final GJ1 g;
    public static final GJ1 g0;
    public static final GJ1 h;
    public static final GJ1 h0;
    public static final GJ1 i;
    public static final GJ1 i0;
    public static final GJ1 j;
    public static final GJ1 j0;
    public static final GJ1 k;
    public static final GJ1 k0;
    public static final GJ1 l;
    public static final GJ1 l0;
    public static final GJ1 m;
    public static final GJ1 m0;
    public static final GJ1 n;
    public static final GJ1 n0;
    public static final GJ1 o;
    public static final GJ1 o0;
    public static final GJ1 p;
    public static final GJ1 p0;
    public static final GJ1 q;
    public static final GJ1 q0;
    public static final GJ1 r;
    public static final GJ1 r0;
    public static final GJ1 s;
    public static final GJ1 s0;
    public static final GJ1 t;
    public static final GJ1 t0;
    public static final GJ1 u;
    public static final GJ1 u0;
    public static final GJ1 v;
    public static final GJ1 v0;
    public static final GJ1 w;
    public static final GJ1 w0;
    public static final GJ1 x;
    public static final GJ1 x0;
    public static final GJ1 y;
    public static final GJ1 y0;
    public static final GJ1 z;
    public static final GJ1 z0;

    static {
        Collections.synchronizedSet(new HashSet());
        b = a("measurement.ad_id_cache_time", 10000L, new C5396jt0(26), false);
        c = a("measurement.app_uninstalled_additional_ad_id_cache_time", 3600000L, new OL0(27), false);
        d = a("measurement.monitoring.sample_period_millis", 86400000L, new C0084Av0(28), false);
        e = a("measurement.config.cache_time", 86400000L, new S20(29), false);
        f = a("measurement.config.url_scheme", "https", new NV1(29), false);
        final int i2 = 0;
        g = a("measurement.config.url_authority", "app-measurement.com", new InterfaceC6053nJ1() { // from class: XG1
            @Override // defpackage.InterfaceC6053nJ1
            public Object zza() {
                switch (i2) {
                    case 0:
                        PW1.b.get();
                        return (String) UW1.f.a();
                    case 1:
                        C7815wY1.b.get();
                        Boolean bool = (Boolean) JY1.a.a();
                        bool.getClass();
                        return bool;
                    default:
                        C4179hZ1.b.get();
                        Boolean bool2 = (Boolean) C6101nZ1.c.a();
                        bool2.getClass();
                        return bool2;
                }
            }
        }, false);
        h = a("measurement.upload.max_bundles", 100, new C7761wG1(1), false);
        i = a("measurement.upload.max_batch_size", 65536, new C7189tG1(2), false);
        j = a("measurement.upload.max_bundle_size", 65536, new C2483cG1(3), false);
        k = a("measurement.upload.max_events_per_bundle", 1000, new TE(27), false);
        l = a("measurement.upload.max_events_per_day", 100000, new C6518pl0(27), false);
        m = a("measurement.upload.max_error_events_per_day", 1000, new S20(27), false);
        n = a("measurement.upload.max_public_events_per_day", 50000, new C5396jt0(27), false);
        o = a("measurement.upload.max_conversions_per_day", 10000, new C1538Tm0(27), false);
        p = a("measurement.upload.max_realtime_events_per_day", 10, new C0162Bv0(27), false);
        q = a("measurement.store.max_stored_events_per_app", 100000, new C0084Av0(27), false);
        r = a("measurement.upload.url", "https://app-measurement.com/a", new C0318Dv0(27), false);
        s = a("measurement.sgtm.google_signal.url", "https://app-measurement.com/s/d", new C0240Cv0(27), false);
        t = a("measurement.sgtm.service_upload_apps_list", "de.zalando.mobile", new C0396Ev0(27), false);
        u = a("measurement.sgtm.upload.retry_interval", 1800000L, new OJ1(27), false);
        v = a("measurement.sgtm.upload.retry_max_wait", 21600000L, new C5806m12(27), false);
        w = a("measurement.sgtm.upload.max_queued_batches", 5000, new NV1(27), false);
        x = a("measurement.sgtm.upload.batches_retrieval_limit", 10, new C7304tt(28), false);
        y = a("measurement.sgtm.upload.min_delay_after_startup", 5000L, new C7532v32(27), false);
        z = a("measurement.sgtm.upload.min_delay_after_broadcast", 1000L, new C3759fN(28), false);
        A = a("measurement.sgtm.upload.min_delay_after_background", 600000L, new TE(28), false);
        B = a("measurement.upload.backoff_period", 43200000L, new C6518pl0(28), false);
        C = a("measurement.upload.window_interval", 3600000L, new C5396jt0(28), false);
        D = a("measurement.upload.interval", 3600000L, new C1538Tm0(28), false);
        E = a("measurement.upload.realtime_upload_interval", 10000L, new C0162Bv0(28), false);
        F = a("measurement.upload.debug_upload_interval", 1000L, new C0474Fv0(28), false);
        G = a("measurement.upload.minimum_delay", 500L, new C0396Ev0(28), false);
        H = a("measurement.alarm_manager.minimum_interval", 60000L, new OJ1(28), false);
        I = a("measurement.upload.stale_data_deletion_interval", 86400000L, new OL0(28), false);
        J = a("measurement.upload.refresh_blacklisted_config_interval", 604800000L, new C5806m12(28), false);
        K = a("measurement.upload.initial_upload_delay_time", 15000L, new NV1(28), false);
        L = a("measurement.upload.retry_time", 1800000L, new C7532v32(28), false);
        M = a("measurement.upload.retry_count", 6, new C3759fN(29), false);
        N = a("measurement.upload.max_queue_time", 518400000L, new TE(29), false);
        O = a("measurement.upload.google_signal_max_queue_time", 300000L, new C6518pl0(29), false);
        P = a("measurement.lifetimevalue.max_currency_tracked", 4, new C5396jt0(29), false);
        Q = a("measurement.audience.filter_result_max_count", 200, new C1538Tm0(29), false);
        R = a("measurement.upload.max_public_user_properties", 100, null, false);
        S = a("measurement.upload.max_event_name_cardinality", 2000, null, false);
        T = a("measurement.upload.max_public_event_params", 100, null, false);
        U = a("measurement.service_client.idle_disconnect_millis", 5000L, new C0162Bv0(29), false);
        Boolean bool = Boolean.FALSE;
        V = a("measurement.test.boolean_flag", bool, new C0084Av0(29), false);
        W = a("measurement.test.string_flag", "---", new C0318Dv0(29), false);
        X = a("measurement.test.long_flag", -1L, new C0474Fv0(29), false);
        a("measurement.test.cached_long_flag", -1L, new C0396Ev0(29), true);
        Y = a("measurement.test.int_flag", -2, new OJ1(29), false);
        Z = a("measurement.test.double_flag", Double.valueOf(-3.0d), new OL0(29), false);
        a0 = a("measurement.experiment.max_ids", 50, new C5806m12(29), false);
        b0 = a("measurement.upload.max_item_scoped_custom_parameters", 27, new C2483cG1(0), false);
        c0 = a("measurement.upload.max_event_parameter_value_length", 500, new C7532v32(29), true);
        d0 = a("measurement.max_bundles_per_iteration", 100, new C7189tG1(0), false);
        e0 = a("measurement.sdk.attribution.cache.ttl", 604800000L, new C6235oG1(0), false);
        f0 = a("measurement.redaction.app_instance_id.ttl", 7200000L, new C7761wG1(0), false);
        g0 = a("measurement.rb.attribution.client.min_ad_services_version", 7, new KG1(0), false);
        h0 = a("measurement.dma_consent.max_daily_dcu_realtime_events", 1, new GG1(0), false);
        i0 = a("measurement.rb.attribution.uri_scheme", "https", new SG1(0), false);
        j0 = a("measurement.rb.attribution.uri_authority", "google-analytics.com", new OG1(0), false);
        k0 = a("measurement.rb.attribution.uri_path", "privacy-sandbox/register-app-conversion", new C2296bH1(0), false);
        l0 = a("measurement.session.engagement_interval", 3600000L, new C4125hH1(0), false);
        m0 = a("measurement.rb.attribution.app_allowlist", "com.labpixies.flood,com.sofascore.results,games.spearmint.triplecrush,com.block.juggle,io.supercent.linkedcubic,com.cdtg.gunsound,com.corestudios.storemanagementidle,com.cdgames.fidget3d,io.supercent.burgeridle,io.supercent.pizzaidle,jp.ne.ibis.ibispaintx.app,com.dencreak.dlcalculator,com.ebay.kleinanzeigen,de.wetteronline.wetterapp,com.game.shape.shift,com.champion.cubes,bubbleshooter.orig,com.wolt.android,com.master.hotelmaster,com.games.bus.arrival,com.playstrom.dop2,com.huuuge.casino.slots,com.ig.spider.fighting,com.jura.coloring.page,com.rikkogame.ragdoll2,com.ludo.king,com.sigma.prank.sound.haircut,com.crazy.block.robo.monster.cliffs.craft,com.fugo.wow,com.maps.locator.gps.gpstracker.phone,com.gamovation.tileclub,com.pronetis.ironball2,com.meesho.supply,pdf.pdfreader.viewer.editor.free,com.dino.race.master,com.ig.moto.racing,ai.photo.enhancer.photoclear,com.duolingo,com.candle.magic_piano,com.free.vpn.super.hotspot.open,sg.bigo.live,com.cdg.tictactoe,com.zhiliaoapp.musically.go,com.wildspike.wormszone,com.mast.status.video.edit,com.vyroai.photoeditorone,com.pujiagames.deeeersimulator,com.superbinogo.jungleboyadventure,com.trustedapp.pdfreaderpdfviewer,com.artimind.aiart.artgenerator.artavatar,de.cellular.ottohybrid,com.zeptolab.cats.google,in.crossy.daily_crossword", new C3552eH1(0), false);
        n0 = a("measurement.rb.attribution.user_properties", "_npa,npa|_fot,fot", new C6620qH1(0), false);
        o0 = a("measurement.rb.attribution.event_params", "value|currency", new C2483cG1(1), false);
        p0 = a("measurement.rb.attribution.query_parameters_to_remove", "", new C7192tH1(), false);
        q0 = a("measurement.rb.attribution.max_queue_time", 864000000L, new C4122hG1(1), false);
        r0 = a("measurement.rb.attribution.max_retry_delay_seconds", 16, new C3931gG1(1), false);
        s0 = a("measurement.rb.attribution.client.min_time_after_boot_seconds", 0, new C7189tG1(1), false);
        a("measurement.rb.attribution.max_trigger_uris_queried_at_once", 0, new C6235oG1(1), false);
        t0 = a("measurement.rb.max_trigger_registrations_per_day", 1000, new BG1(1), false);
        Boolean bool2 = Boolean.TRUE;
        u0 = a("measurement.config.bundle_for_all_apps_on_backgrounded", bool2, new KG1(1), false);
        v0 = a("measurement.config.notify_trigger_uris_on_backgrounded", bool2, new GG1(1), false);
        w0 = a("measurement.rb.attribution.notify_app_delay_millis", 0, new OG1(1), false);
        x0 = a("measurement.quality.checksum", bool, null, false);
        y0 = a("measurement.audience.use_bundle_end_timestamp_for_non_sequence_property_filters", bool, new C6620qH1(1), false);
        z0 = a("measurement.audience.refresh_event_count_filters_timestamp", bool, new C5856mH1(1), false);
        A0 = a("measurement.audience.use_bundle_timestamp_for_event_count_filters", bool, new C3931gG1(2), true);
        B0 = a("measurement.sdk.collection.last_deep_link_referrer_campaign2", bool, new C2483cG1(2), false);
        C0 = a("measurement.integration.disable_firebase_instance_id", bool, new C6235oG1(2), false);
        D0 = a("measurement.collection.service.update_with_analytics_fix", bool, new C4122hG1(2), false);
        E0 = a("measurement.service.storage_consent_support_version", 203600, new BG1(2), false);
        F0 = a("measurement.service.store_null_safelist", bool2, new KG1(2), false);
        G0 = a("measurement.service.store_safelist", bool2, new SG1(2), false);
        H0 = a("measurement.session_stitching_token_enabled", bool, new OG1(2), false);
        I0 = a("measurement.sgtm.upload_queue", bool, new C2296bH1(2), false);
        final int i3 = 2;
        J0 = a("measurement.sgtm.google_signal.enable", bool, new InterfaceC6053nJ1() { // from class: XG1
            @Override // defpackage.InterfaceC6053nJ1
            public Object zza() {
                switch (i3) {
                    case 0:
                        PW1.b.get();
                        return (String) UW1.f.a();
                    case 1:
                        C7815wY1.b.get();
                        Boolean bool3 = (Boolean) JY1.a.a();
                        bool3.getClass();
                        return bool3;
                    default:
                        C4179hZ1.b.get();
                        Boolean bool22 = (Boolean) C6101nZ1.c.a();
                        bool22.getClass();
                        return bool22;
                }
            }
        }, false);
        K0 = a("measurement.sgtm.no_proxy.service", bool, new C4125hH1(2), false);
        L0 = a("measurement.sgtm.service.batching_on_backgrounded", bool, new C3552eH1(2), false);
        M0 = a("measurement.sgtm.no_proxy.client.dev", bool, new C6620qH1(2), true);
        N0 = a("measurement.sgtm.client.upload_on_backgrounded.dev", bool, new C5856mH1(2), true);
        O0 = a("measurement.sgtm.client.scion_upload_action.dev", bool, new C3931gG1(3), true);
        P0 = a("measurement.gmscore_client_telemetry", bool, new C0162Bv0(26), false);
        Q0 = a("measurement.rb.attribution.service", bool2, new C0084Av0(26), true);
        R0 = a("measurement.rb.attribution.client2", bool2, new C0318Dv0(26), true);
        S0 = a("measurement.rb.attribution.uuid_generation", bool2, new C0240Cv0(26), false);
        T0 = a("measurement.rb.attribution.enable_trigger_redaction", bool2, new C0474Fv0(26), false);
        Boolean bool3 = Boolean.FALSE;
        a("measurement.rb.attribution.followup1.service", bool3, new C0396Ev0(26), false);
        U0 = a("measurement.rb.attribution.retry_disposition", bool3, new OJ1(26), false);
        V0 = a("measurement.rb.attribution.ad_campaign_info", bool2, new OL0(26), false);
        W0 = a("measurement.client.sessions.enable_fix_background_engagement", bool3, new C5806m12(26), false);
        X0 = a("measurement.fix_engagement_on_reset_analytics_data", bool2, new NV1(26), false);
        Y0 = a("measurement.set_default_event_parameters_propagate_clear.service.dev", bool3, new C0474Fv0(27), false);
        Z0 = a("measurement.set_default_event_parameters_propagate_clear.client.dev", bool3, new S20(28), false);
        a1 = a("measurement.set_default_event_parameters.fix_deferred_analytics_collection", bool3, new C7304tt(29), false);
        b1 = a("measurement.chimera.parameter.service", bool2, new C0240Cv0(29), false);
        c1 = a("measurement.service.ad_impression.convert_value_to_double", bool2, new BG1(0), false);
        a("measurement.rb.attribution.service.enable_max_trigger_uris_queried_at_once", bool2, new C5856mH1(0), false);
        final int i4 = 1;
        a("measurement.remove_conflicting_first_party_apis.dev", bool3, new InterfaceC6053nJ1() { // from class: XG1
            @Override // defpackage.InterfaceC6053nJ1
            public Object zza() {
                switch (i4) {
                    case 0:
                        PW1.b.get();
                        return (String) UW1.f.a();
                    case 1:
                        C7815wY1.b.get();
                        Boolean bool32 = (Boolean) JY1.a.a();
                        bool32.getClass();
                        return bool32;
                    default:
                        C4179hZ1.b.get();
                        Boolean bool22 = (Boolean) C6101nZ1.c.a();
                        bool22.getClass();
                        return bool22;
                }
            }
        }, false);
        d1 = a("measurement.rb.attribution.service.trigger_uris_high_priority", bool2, new GG1(2), false);
        e1 = a("measurement.rb.attribution.client.get_trigger_uris_async", bool3, new C1538Tm0(26), false);
        f1 = a("measurement.backfill_session_ids.service", bool3, new C3759fN(27), false);
    }

    public static GJ1 a(String str, Object obj, InterfaceC6053nJ1 interfaceC6053nJ1, boolean z2) {
        GJ1 gj1 = new GJ1(str, obj, interfaceC6053nJ1);
        if (z2) {
            a.add(gj1);
        }
        return gj1;
    }
}
