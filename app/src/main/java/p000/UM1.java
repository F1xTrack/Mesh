package p000;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Pair;
import android.util.SparseArray;
import com.google.android.gms.common.internal.Preconditions;

/* loaded from: classes.dex */
public final class UM1 extends SQ1 {

    /* renamed from: B */
    public static final Pair f11741B = new Pair("", 0L);

    /* renamed from: A */
    public final T71 f11742A;

    /* renamed from: d */
    public SharedPreferences f11743d;

    /* renamed from: e */
    public final Object f11744e;

    /* renamed from: f */
    public SharedPreferences f11745f;

    /* renamed from: g */
    public C6816sK f11746g;

    /* renamed from: h */
    public final C9708i41 f11747h;

    /* renamed from: i */
    public final C1338VG f11748i;

    /* renamed from: j */
    public String f11749j;

    /* renamed from: k */
    public boolean f11750k;

    /* renamed from: l */
    public long f11751l;

    /* renamed from: m */
    public final C9708i41 f11752m;

    /* renamed from: n */
    public final C9234eN1 f11753n;

    /* renamed from: o */
    public final C1338VG f11754o;

    /* renamed from: p */
    public final T71 f11755p;

    /* renamed from: q */
    public final C9234eN1 f11756q;

    /* renamed from: r */
    public final C9708i41 f11757r;

    /* renamed from: s */
    public final C9708i41 f11758s;

    /* renamed from: t */
    public boolean f11759t;

    /* renamed from: u */
    public final C9234eN1 f11760u;

    /* renamed from: v */
    public final C9234eN1 f11761v;

    /* renamed from: w */
    public final C9708i41 f11762w;

    /* renamed from: x */
    public final C1338VG f11763x;

    /* renamed from: y */
    public final C1338VG f11764y;

    /* renamed from: z */
    public final C9708i41 f11765z;

    public UM1(C9110dP1 c9110dP1) {
        super(c9110dP1);
        this.f11744e = new Object();
        this.f11752m = new C9708i41(this, "session_timeout", 1800000L);
        this.f11753n = new C9234eN1(this, "start_new_session", true);
        this.f11757r = new C9708i41(this, "last_pause_time", 0L);
        this.f11758s = new C9708i41(this, "session_id", 0L);
        this.f11754o = new C1338VG(this, "non_personalized_ads");
        this.f11755p = new T71(this, "last_received_uri_timestamps_by_source");
        this.f11756q = new C9234eN1(this, "allow_remote_dynamite", false);
        this.f11747h = new C9708i41(this, "first_open_time", 0L);
        Preconditions.checkNotEmpty("app_install_time");
        this.f11748i = new C1338VG(this, "app_instance_id");
        this.f11760u = new C9234eN1(this, "app_backgrounded", false);
        this.f11761v = new C9234eN1(this, "deep_link_retrieval_complete", false);
        this.f11762w = new C9708i41(this, "deep_link_retrieval_attempts", 0L);
        this.f11763x = new C1338VG(this, "firebase_feature_rollouts");
        this.f11764y = new C1338VG(this, "deferred_attribution_cache");
        this.f11765z = new C9708i41(this, "deferred_attribution_cache_timestamp", 0L);
        this.f11742A = new T71(this, "default_event_parameters");
    }

    /* renamed from: A1 */
    public final void m7991A1(boolean z) {
        mo7681v1();
        OL1 ol1Mo6070n = mo6070n();
        ol1Mo6070n.f8386o.m24554c(Boolean.valueOf(z), "App measurement setting deferred collection");
        SharedPreferences.Editor editorEdit = m7993C1().edit();
        editorEdit.putBoolean("deferred_analytics_collection", z);
        editorEdit.apply();
    }

    /* renamed from: B1 */
    public final SharedPreferences m7992B1() {
        mo7681v1();
        m7367w1();
        if (this.f11745f == null) {
            synchronized (this.f11744e) {
                try {
                    if (this.f11745f == null) {
                        String str = ((C9110dP1) this.f11615b).f26031a.getPackageName() + "_preferences";
                        mo6070n().f8386o.m24554c(str, "Default prefs file");
                        this.f11745f = ((C9110dP1) this.f11615b).f26031a.getSharedPreferences(str, 0);
                    }
                } finally {
                }
            }
        }
        return this.f11745f;
    }

    /* renamed from: C1 */
    public final SharedPreferences m7993C1() {
        mo7681v1();
        m7367w1();
        Preconditions.checkNotNull(this.f11743d);
        return this.f11743d;
    }

    /* renamed from: D1 */
    public final SparseArray m7994D1() {
        Bundle bundleM7569U = this.f11755p.m7569U();
        int[] intArray = bundleM7569U.getIntArray("uriSources");
        long[] longArray = bundleM7569U.getLongArray("uriTimestamps");
        if (intArray == null || longArray == null) {
            return new SparseArray();
        }
        if (intArray.length != longArray.length) {
            mo6070n().f8378g.m24555d("Trigger URI source and timestamp array lengths do not match");
            return new SparseArray();
        }
        SparseArray sparseArray = new SparseArray();
        for (int i = 0; i < intArray.length; i++) {
            sparseArray.put(intArray[i], Long.valueOf(longArray[i]));
        }
        return sparseArray;
    }

    /* renamed from: E1 */
    public final XQ1 m7995E1() {
        mo7681v1();
        return XQ1.m9043d(m7993C1().getInt("consent_source", 100), m7993C1().getString("consent_settings", "G1"));
    }

    @Override // p000.SQ1
    /* renamed from: y1 */
    public final boolean mo6035y1() {
        return true;
    }

    /* renamed from: z1 */
    public final boolean m7996z1(long j) {
        return j - this.f11752m.m18962g() > this.f11757r.m18962g();
    }
}
