package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.billinginterface.internal.config.BillingConfig;
import io.appmetrica.analytics.networktasks.internal.RetryPolicyConfig;
import java.util.List;
import java.util.Map;

/* renamed from: io.appmetrica.analytics.impl.gl */
/* loaded from: classes2.dex */
public final class C5155gl {

    /* renamed from: A */
    public final C4478El f31779A;

    /* renamed from: B */
    public final Map f31780B;

    /* renamed from: C */
    public final C5593y9 f31781C;

    /* renamed from: a */
    public final String f31782a;

    /* renamed from: b */
    public final String f31783b;

    /* renamed from: c */
    public final C5255kl f31784c;

    /* renamed from: d */
    public final String f31785d;

    /* renamed from: e */
    public final List f31786e;

    /* renamed from: f */
    public final List f31787f;

    /* renamed from: g */
    public final List f31788g;

    /* renamed from: h */
    public final Map f31789h;

    /* renamed from: i */
    public final String f31790i;

    /* renamed from: j */
    public final String f31791j;

    /* renamed from: k */
    public final String f31792k;

    /* renamed from: l */
    public final String f31793l;

    /* renamed from: m */
    public final String f31794m;

    /* renamed from: n */
    public final C5613z4 f31795n;

    /* renamed from: o */
    public final long f31796o;

    /* renamed from: p */
    public final boolean f31797p;

    /* renamed from: q */
    public final boolean f31798q;

    /* renamed from: r */
    public final String f31799r;

    /* renamed from: s */
    public final C4734Pd f31800s;

    /* renamed from: t */
    public final RetryPolicyConfig f31801t;

    /* renamed from: u */
    public final long f31802u;

    /* renamed from: v */
    public final long f31803v;

    /* renamed from: w */
    public final boolean f31804w;

    /* renamed from: x */
    public final BillingConfig f31805x;

    /* renamed from: y */
    public final C5487u3 f31806y;

    /* renamed from: z */
    public final C5286m2 f31807z;

    public C5155gl(String str, String str2, C5255kl c5255kl) {
        this.f31782a = str;
        this.f31783b = str2;
        this.f31784c = c5255kl;
        this.f31785d = c5255kl.f32086a;
        this.f31786e = c5255kl.f32087b;
        this.f31787f = c5255kl.f32091f;
        this.f31788g = c5255kl.f32092g;
        this.f31789h = c5255kl.f32094i;
        this.f31790i = c5255kl.f32088c;
        this.f31791j = c5255kl.f32089d;
        this.f31792k = c5255kl.f32095j;
        this.f31793l = c5255kl.f32096k;
        this.f31794m = c5255kl.f32097l;
        this.f31795n = c5255kl.f32098m;
        this.f31796o = c5255kl.f32099n;
        this.f31797p = c5255kl.f32100o;
        this.f31798q = c5255kl.f32101p;
        this.f31799r = c5255kl.f32102q;
        this.f31800s = c5255kl.f32104s;
        this.f31801t = c5255kl.f32105t;
        this.f31802u = c5255kl.f32106u;
        this.f31803v = c5255kl.f32107v;
        this.f31804w = c5255kl.f32108w;
        this.f31805x = c5255kl.f32109x;
        this.f31806y = c5255kl.f32110y;
        this.f31807z = c5255kl.f32111z;
        this.f31779A = c5255kl.f32083A;
        this.f31780B = c5255kl.f32084B;
        this.f31781C = c5255kl.f32085C;
    }

    /* renamed from: a */
    public final String m20465a() {
        return this.f31782a;
    }

    /* renamed from: b */
    public final String m20466b() {
        return this.f31783b;
    }

    /* renamed from: c */
    public final long m20467c() {
        return this.f31803v;
    }

    /* renamed from: d */
    public final long m20468d() {
        return this.f31802u;
    }

    /* renamed from: e */
    public final String m20469e() {
        return this.f31785d;
    }

    public final String toString() {
        return "StartupState(deviceId=" + this.f31782a + ", deviceIdHash=" + this.f31783b + ", startupStateModel=" + this.f31784c + ')';
    }
}
