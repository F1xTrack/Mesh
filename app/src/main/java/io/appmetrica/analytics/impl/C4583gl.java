package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.billinginterface.internal.config.BillingConfig;
import io.appmetrica.analytics.networktasks.internal.RetryPolicyConfig;
import java.util.List;
import java.util.Map;

/* renamed from: io.appmetrica.analytics.impl.gl, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4583gl {
    public final El A;
    public final Map B;
    public final C5001y9 C;
    public final String a;
    public final String b;
    public final C4678kl c;
    public final String d;
    public final List e;
    public final List f;
    public final List g;
    public final Map h;
    public final String i;
    public final String j;
    public final String k;
    public final String l;
    public final String m;
    public final C5020z4 n;
    public final long o;
    public final boolean p;
    public final boolean q;
    public final String r;
    public final Pd s;
    public final RetryPolicyConfig t;
    public final long u;
    public final long v;
    public final boolean w;
    public final BillingConfig x;
    public final C4899u3 y;
    public final C4707m2 z;

    public C4583gl(String str, String str2, C4678kl c4678kl) {
        this.a = str;
        this.b = str2;
        this.c = c4678kl;
        this.d = c4678kl.a;
        this.e = c4678kl.b;
        this.f = c4678kl.f;
        this.g = c4678kl.g;
        this.h = c4678kl.i;
        this.i = c4678kl.c;
        this.j = c4678kl.d;
        this.k = c4678kl.j;
        this.l = c4678kl.k;
        this.m = c4678kl.l;
        this.n = c4678kl.m;
        this.o = c4678kl.n;
        this.p = c4678kl.o;
        this.q = c4678kl.p;
        this.r = c4678kl.q;
        this.s = c4678kl.s;
        this.t = c4678kl.t;
        this.u = c4678kl.u;
        this.v = c4678kl.v;
        this.w = c4678kl.w;
        this.x = c4678kl.x;
        this.y = c4678kl.y;
        this.z = c4678kl.z;
        this.A = c4678kl.A;
        this.B = c4678kl.B;
        this.C = c4678kl.C;
    }

    public final String a() {
        return this.a;
    }

    public final String b() {
        return this.b;
    }

    public final long c() {
        return this.v;
    }

    public final long d() {
        return this.u;
    }

    public final String e() {
        return this.d;
    }

    public final String toString() {
        return "StartupState(deviceId=" + this.a + ", deviceIdHash=" + this.b + ", startupStateModel=" + this.c + ')';
    }
}
