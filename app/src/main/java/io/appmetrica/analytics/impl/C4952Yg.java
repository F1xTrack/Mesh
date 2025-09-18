package io.appmetrica.analytics.impl;

import android.os.Bundle;
import io.appmetrica.analytics.internal.CounterConfiguration;
import org.json.JSONObject;

/* renamed from: io.appmetrica.analytics.impl.Yg */
/* loaded from: classes2.dex */
public class C4952Yg extends C4939Y3 {

    /* renamed from: c */
    protected C4365A8 f31116c;

    /* renamed from: d */
    protected C4639Le f31117d;

    /* renamed from: e */
    public boolean f31118e;

    /* renamed from: f */
    public String f31119f;

    public C4952Yg(C4782Re c4782Re, CounterConfiguration counterConfiguration) {
        this(c4782Re, counterConfiguration, null);
    }

    /* renamed from: a */
    public final void m20037a(C5454sk c5454sk) {
        this.f31116c = new C4365A8(c5454sk);
    }

    /* renamed from: c */
    public final Bundle m20038c() {
        Bundle bundle = new Bundle();
        this.f31090b.toBundle(bundle);
        C4782Re c4782Re = this.f31089a;
        synchronized (c4782Re) {
            bundle.putParcelable("PROCESS_CFG_OBJ", c4782Re);
        }
        return bundle;
    }

    /* renamed from: d */
    public final String m20039d() {
        C4365A8 c4365a8 = this.f31116c;
        if (c4365a8.f29848a.isEmpty()) {
            return null;
        }
        return new JSONObject(c4365a8.f29848a).toString();
    }

    /* renamed from: e */
    public final synchronized String m20040e() {
        return this.f31119f;
    }

    /* renamed from: f */
    public boolean mo19831f() {
        return this.f31118e;
    }

    public C4952Yg(C4782Re c4782Re, CounterConfiguration counterConfiguration, String str) {
        super(c4782Re, counterConfiguration);
        this.f31118e = true;
        this.f31119f = str;
    }
}
