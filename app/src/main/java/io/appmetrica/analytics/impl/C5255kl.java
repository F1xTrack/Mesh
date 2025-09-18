package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.billinginterface.internal.config.BillingConfig;
import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import io.appmetrica.analytics.networktasks.internal.RetryPolicyConfig;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* renamed from: io.appmetrica.analytics.impl.kl */
/* loaded from: classes2.dex */
public final class C5255kl {

    /* renamed from: A */
    public final C4478El f32083A;

    /* renamed from: B */
    public final Map f32084B;

    /* renamed from: C */
    public final C5593y9 f32085C;

    /* renamed from: a */
    public final String f32086a;

    /* renamed from: b */
    public final List f32087b;

    /* renamed from: c */
    public final String f32088c;

    /* renamed from: d */
    public final String f32089d;

    /* renamed from: e */
    public final String f32090e;

    /* renamed from: f */
    public final List f32091f;

    /* renamed from: g */
    public final List f32092g;

    /* renamed from: h */
    public final List f32093h;

    /* renamed from: i */
    public final Map f32094i;

    /* renamed from: j */
    public final String f32095j;

    /* renamed from: k */
    public final String f32096k;

    /* renamed from: l */
    public final String f32097l;

    /* renamed from: m */
    public final C5613z4 f32098m;

    /* renamed from: n */
    public final long f32099n;

    /* renamed from: o */
    public final boolean f32100o;

    /* renamed from: p */
    public final boolean f32101p;

    /* renamed from: q */
    public final String f32102q;

    /* renamed from: r */
    public final C4574Il f32103r;

    /* renamed from: s */
    public final C4734Pd f32104s;

    /* renamed from: t */
    public final RetryPolicyConfig f32105t;

    /* renamed from: u */
    public final long f32106u;

    /* renamed from: v */
    public final long f32107v;

    /* renamed from: w */
    public final boolean f32108w;

    /* renamed from: x */
    public final BillingConfig f32109x;

    /* renamed from: y */
    public final C5487u3 f32110y;

    /* renamed from: z */
    public final C5286m2 f32111z;

    public C5255kl(C5230jl c5230jl) {
        this.f32086a = c5230jl.f31996a;
        List list = c5230jl.f31997b;
        this.f32087b = list == null ? null : CollectionUtils.unmodifiableListCopy(list);
        this.f32088c = c5230jl.f31998c;
        this.f32089d = c5230jl.f31999d;
        this.f32090e = c5230jl.f32000e;
        List list2 = c5230jl.f32001f;
        this.f32091f = list2 == null ? null : CollectionUtils.unmodifiableListCopy(list2);
        List list3 = c5230jl.f32002g;
        this.f32092g = list3 == null ? null : CollectionUtils.unmodifiableListCopy(list3);
        List list4 = c5230jl.f32003h;
        this.f32093h = list4 == null ? null : CollectionUtils.unmodifiableListCopy(list4);
        Map map = c5230jl.f32004i;
        this.f32094i = map != null ? CollectionUtils.unmodifiableMapCopy(map) : null;
        this.f32095j = c5230jl.f32005j;
        this.f32096k = c5230jl.f32006k;
        this.f32098m = c5230jl.f32008m;
        this.f32104s = c5230jl.f32009n;
        this.f32099n = c5230jl.f32010o;
        this.f32100o = c5230jl.f32011p;
        this.f32097l = c5230jl.f32007l;
        this.f32101p = c5230jl.f32012q;
        this.f32102q = c5230jl.f32013r;
        this.f32103r = c5230jl.f32014s;
        this.f32106u = c5230jl.f32015t;
        this.f32107v = c5230jl.f32016u;
        this.f32108w = c5230jl.f32017v;
        RetryPolicyConfig retryPolicyConfig = c5230jl.f32018w;
        if (retryPolicyConfig == null) {
            C5605yl c5605yl = new C5605yl();
            this.f32105t = new RetryPolicyConfig(c5605yl.f32893w, c5605yl.f32894x);
        } else {
            this.f32105t = retryPolicyConfig;
        }
        this.f32109x = c5230jl.f32019x;
        this.f32110y = c5230jl.f32020y;
        this.f32111z = c5230jl.f32021z;
        this.f32083A = c5230jl.f31993A == null ? new C4478El(AbstractC4512G7.f30163a.f32781a) : c5230jl.f31993A;
        this.f32084B = c5230jl.f31994B == null ? Collections.emptyMap() : c5230jl.f31994B;
        this.f32085C = c5230jl.f31995C;
    }

    /* renamed from: a */
    public final C5230jl m20660a(C5613z4 c5613z4) {
        C5230jl c5230jl = new C5230jl(c5613z4);
        c5230jl.f31996a = this.f32086a;
        c5230jl.f32001f = this.f32091f;
        c5230jl.f32002g = this.f32092g;
        c5230jl.f32005j = this.f32095j;
        c5230jl.f31997b = this.f32087b;
        c5230jl.f31998c = this.f32088c;
        c5230jl.f31999d = this.f32089d;
        c5230jl.f32000e = this.f32090e;
        c5230jl.f32003h = this.f32093h;
        c5230jl.f32004i = this.f32094i;
        c5230jl.f32006k = this.f32096k;
        c5230jl.f32007l = this.f32097l;
        c5230jl.f32012q = this.f32101p;
        c5230jl.f32010o = this.f32099n;
        c5230jl.f32011p = this.f32100o;
        c5230jl.f32013r = this.f32102q;
        c5230jl.f32009n = this.f32104s;
        c5230jl.f32015t = this.f32106u;
        c5230jl.f32016u = this.f32107v;
        c5230jl.f32014s = this.f32103r;
        c5230jl.f32017v = this.f32108w;
        c5230jl.f32018w = this.f32105t;
        c5230jl.f32020y = this.f32110y;
        c5230jl.f32019x = this.f32109x;
        c5230jl.f32021z = this.f32111z;
        c5230jl.f31993A = this.f32083A;
        c5230jl.f31994B = this.f32084B;
        c5230jl.f31995C = this.f32085C;
        return c5230jl;
    }

    public final String toString() {
        return "StartupStateModel{uuid='" + this.f32086a + "', reportUrls=" + this.f32087b + ", getAdUrl='" + this.f32088c + "', reportAdUrl='" + this.f32089d + "', certificateUrl='" + this.f32090e + "', hostUrlsFromStartup=" + this.f32091f + ", hostUrlsFromClient=" + this.f32092g + ", diagnosticUrls=" + this.f32093h + ", customSdkHosts=" + this.f32094i + ", encodedClidsFromResponse='" + this.f32095j + "', lastClientClidsForStartupRequest='" + this.f32096k + "', lastChosenForRequestClids='" + this.f32097l + "', collectingFlags=" + this.f32098m + ", obtainTime=" + this.f32099n + ", hadFirstStartup=" + this.f32100o + ", startupDidNotOverrideClids=" + this.f32101p + ", countryInit='" + this.f32102q + "', statSending=" + this.f32103r + ", permissionsCollectingConfig=" + this.f32104s + ", retryPolicyConfig=" + this.f32105t + ", obtainServerTime=" + this.f32106u + ", firstStartupServerTime=" + this.f32107v + ", outdated=" + this.f32108w + ", autoInappCollectingConfig=" + this.f32109x + ", cacheControl=" + this.f32110y + ", attributionConfig=" + this.f32111z + ", startupUpdateConfig=" + this.f32083A + ", modulesRemoteConfigs=" + this.f32084B + ", externalAttributionConfig=" + this.f32085C + '}';
    }
}
