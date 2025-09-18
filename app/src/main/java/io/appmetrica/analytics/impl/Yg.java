package io.appmetrica.analytics.impl;

import android.os.Bundle;
import io.appmetrica.analytics.internal.CounterConfiguration;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class Yg extends Y3 {
    protected A8 c;
    protected Le d;
    public boolean e;
    public String f;

    public Yg(Re re, CounterConfiguration counterConfiguration) {
        this(re, counterConfiguration, null);
    }

    public final void a(C4868sk c4868sk) {
        this.c = new A8(c4868sk);
    }

    public final Bundle c() {
        Bundle bundle = new Bundle();
        this.b.toBundle(bundle);
        Re re = this.a;
        synchronized (re) {
            bundle.putParcelable("PROCESS_CFG_OBJ", re);
        }
        return bundle;
    }

    public final String d() {
        A8 a8 = this.c;
        if (a8.a.isEmpty()) {
            return null;
        }
        return new JSONObject(a8.a).toString();
    }

    public final synchronized String e() {
        return this.f;
    }

    public boolean f() {
        return this.e;
    }

    public Yg(Re re, CounterConfiguration counterConfiguration, String str) {
        super(re, counterConfiguration);
        this.e = true;
        this.f = str;
    }
}
