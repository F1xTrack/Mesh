package defpackage;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Pair;
import android.util.SparseArray;
import com.google.android.gms.common.internal.Preconditions;

/* loaded from: classes.dex */
public final class UM1 extends SQ1 {
    public static final Pair B = new Pair("", 0L);
    public final T71 A;
    public SharedPreferences d;
    public final Object e;
    public SharedPreferences f;
    public C7008sK g;
    public final C4277i41 h;
    public final VG i;
    public String j;
    public boolean k;
    public long l;
    public final C4277i41 m;
    public final C3570eN1 n;
    public final VG o;
    public final T71 p;
    public final C3570eN1 q;
    public final C4277i41 r;
    public final C4277i41 s;
    public boolean t;
    public final C3570eN1 u;
    public final C3570eN1 v;
    public final C4277i41 w;
    public final VG x;
    public final VG y;
    public final C4277i41 z;

    public UM1(C3386dP1 c3386dP1) {
        super(c3386dP1);
        this.e = new Object();
        this.m = new C4277i41(this, "session_timeout", 1800000L);
        this.n = new C3570eN1(this, "start_new_session", true);
        this.r = new C4277i41(this, "last_pause_time", 0L);
        this.s = new C4277i41(this, "session_id", 0L);
        this.o = new VG(this, "non_personalized_ads");
        this.p = new T71(this, "last_received_uri_timestamps_by_source");
        this.q = new C3570eN1(this, "allow_remote_dynamite", false);
        this.h = new C4277i41(this, "first_open_time", 0L);
        Preconditions.checkNotEmpty("app_install_time");
        this.i = new VG(this, "app_instance_id");
        this.u = new C3570eN1(this, "app_backgrounded", false);
        this.v = new C3570eN1(this, "deep_link_retrieval_complete", false);
        this.w = new C4277i41(this, "deep_link_retrieval_attempts", 0L);
        this.x = new VG(this, "firebase_feature_rollouts");
        this.y = new VG(this, "deferred_attribution_cache");
        this.z = new C4277i41(this, "deferred_attribution_cache_timestamp", 0L);
        this.A = new T71(this, "default_event_parameters");
    }

    public final void A1(boolean z) {
        v1();
        OL1 ol1N = n();
        ol1N.o.c(Boolean.valueOf(z), "App measurement setting deferred collection");
        SharedPreferences.Editor editorEdit = C1().edit();
        editorEdit.putBoolean("deferred_analytics_collection", z);
        editorEdit.apply();
    }

    public final SharedPreferences B1() {
        v1();
        w1();
        if (this.f == null) {
            synchronized (this.e) {
                try {
                    if (this.f == null) {
                        String str = ((C3386dP1) this.b).a.getPackageName() + "_preferences";
                        n().o.c(str, "Default prefs file");
                        this.f = ((C3386dP1) this.b).a.getSharedPreferences(str, 0);
                    }
                } finally {
                }
            }
        }
        return this.f;
    }

    public final SharedPreferences C1() {
        v1();
        w1();
        Preconditions.checkNotNull(this.d);
        return this.d;
    }

    public final SparseArray D1() {
        Bundle bundleU = this.p.U();
        int[] intArray = bundleU.getIntArray("uriSources");
        long[] longArray = bundleU.getLongArray("uriTimestamps");
        if (intArray == null || longArray == null) {
            return new SparseArray();
        }
        if (intArray.length != longArray.length) {
            n().g.d("Trigger URI source and timestamp array lengths do not match");
            return new SparseArray();
        }
        SparseArray sparseArray = new SparseArray();
        for (int i = 0; i < intArray.length; i++) {
            sparseArray.put(intArray[i], Long.valueOf(longArray[i]));
        }
        return sparseArray;
    }

    public final XQ1 E1() {
        v1();
        return XQ1.d(C1().getInt("consent_source", 100), C1().getString("consent_settings", "G1"));
    }

    @Override // defpackage.SQ1
    public final boolean y1() {
        return true;
    }

    public final boolean z1(long j) {
        return j - this.m.g() > this.r.g();
    }
}
