package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.billinginterface.internal.config.BillingConfig;
import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import io.appmetrica.analytics.networktasks.internal.RetryPolicyConfig;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* renamed from: io.appmetrica.analytics.impl.kl */
/* loaded from: classes2.dex */
public final class C4678kl {
    public final El A;
    public final Map B;
    public final C5001y9 C;
    public final String a;
    public final List b;
    public final String c;
    public final String d;
    public final String e;
    public final List f;
    public final List g;
    public final List h;
    public final Map i;
    public final String j;
    public final String k;
    public final String l;
    public final C5020z4 m;
    public final long n;
    public final boolean o;
    public final boolean p;
    public final String q;
    public final Il r;
    public final Pd s;
    public final RetryPolicyConfig t;
    public final long u;
    public final long v;
    public final boolean w;
    public final BillingConfig x;
    public final C4899u3 y;
    public final C4707m2 z;

    public C4678kl(C4654jl c4654jl) {
        this.a = c4654jl.a;
        List list = c4654jl.b;
        this.b = list == null ? null : CollectionUtils.unmodifiableListCopy(list);
        this.c = c4654jl.c;
        this.d = c4654jl.d;
        this.e = c4654jl.e;
        List list2 = c4654jl.f;
        this.f = list2 == null ? null : CollectionUtils.unmodifiableListCopy(list2);
        List list3 = c4654jl.g;
        this.g = list3 == null ? null : CollectionUtils.unmodifiableListCopy(list3);
        List list4 = c4654jl.h;
        this.h = list4 == null ? null : CollectionUtils.unmodifiableListCopy(list4);
        Map map = c4654jl.i;
        this.i = map != null ? CollectionUtils.unmodifiableMapCopy(map) : null;
        this.j = c4654jl.j;
        this.k = c4654jl.k;
        this.m = c4654jl.m;
        this.s = c4654jl.n;
        this.n = c4654jl.o;
        this.o = c4654jl.p;
        this.l = c4654jl.l;
        this.p = c4654jl.q;
        this.q = c4654jl.r;
        this.r = c4654jl.s;
        this.u = c4654jl.t;
        this.v = c4654jl.u;
        this.w = c4654jl.v;
        RetryPolicyConfig retryPolicyConfig = c4654jl.w;
        if (retryPolicyConfig == null) {
            C5013yl c5013yl = new C5013yl();
            this.t = new RetryPolicyConfig(c5013yl.w, c5013yl.x);
        } else {
            this.t = retryPolicyConfig;
        }
        this.x = c4654jl.x;
        this.y = c4654jl.y;
        this.z = c4654jl.z;
        this.A = c4654jl.A == null ? new El(G7.a.a) : c4654jl.A;
        this.B = c4654jl.B == null ? Collections.emptyMap() : c4654jl.B;
        this.C = c4654jl.C;
    }

    public final C4654jl a(C5020z4 c5020z4) {
        C4654jl c4654jl = new C4654jl(c5020z4);
        c4654jl.a = this.a;
        c4654jl.f = this.f;
        c4654jl.g = this.g;
        c4654jl.j = this.j;
        c4654jl.b = this.b;
        c4654jl.c = this.c;
        c4654jl.d = this.d;
        c4654jl.e = this.e;
        c4654jl.h = this.h;
        c4654jl.i = this.i;
        c4654jl.k = this.k;
        c4654jl.l = this.l;
        c4654jl.q = this.p;
        c4654jl.o = this.n;
        c4654jl.p = this.o;
        c4654jl.r = this.q;
        c4654jl.n = this.s;
        c4654jl.t = this.u;
        c4654jl.u = this.v;
        c4654jl.s = this.r;
        c4654jl.v = this.w;
        c4654jl.w = this.t;
        c4654jl.y = this.y;
        c4654jl.x = this.x;
        c4654jl.z = this.z;
        c4654jl.A = this.A;
        c4654jl.B = this.B;
        c4654jl.C = this.C;
        return c4654jl;
    }

    public final String toString() {
        return "StartupStateModel{uuid='" + this.a + "', reportUrls=" + this.b + ", getAdUrl='" + this.c + "', reportAdUrl='" + this.d + "', certificateUrl='" + this.e + "', hostUrlsFromStartup=" + this.f + ", hostUrlsFromClient=" + this.g + ", diagnosticUrls=" + this.h + ", customSdkHosts=" + this.i + ", encodedClidsFromResponse='" + this.j + "', lastClientClidsForStartupRequest='" + this.k + "', lastChosenForRequestClids='" + this.l + "', collectingFlags=" + this.m + ", obtainTime=" + this.n + ", hadFirstStartup=" + this.o + ", startupDidNotOverrideClids=" + this.p + ", countryInit='" + this.q + "', statSending=" + this.r + ", permissionsCollectingConfig=" + this.s + ", retryPolicyConfig=" + this.t + ", obtainServerTime=" + this.u + ", firstStartupServerTime=" + this.v + ", outdated=" + this.w + ", autoInappCollectingConfig=" + this.x + ", cacheControl=" + this.y + ", attributionConfig=" + this.z + ", startupUpdateConfig=" + this.A + ", modulesRemoteConfigs=" + this.B + ", externalAttributionConfig=" + this.C + '}';
    }
}
