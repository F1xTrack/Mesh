package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.billinginterface.internal.config.BillingConfig;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import io.appmetrica.analytics.networktasks.internal.RetryPolicyConfig;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/* renamed from: io.appmetrica.analytics.impl.hl, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4607hl implements ProtobufConverter {
    public final Qd a = new Qd();
    public final C4474ca b = new C4474ca();
    public final Jl c = new Jl();
    public final C4779p2 d = new C4779p2();
    public final C4947w3 e = new C4947w3();
    public final C4731n2 f = new C4731n2();
    public final C4950w6 g = new C4950w6();
    public final Fl h = new Fl();
    public final Tc i = new Tc();
    public final C5025z9 j = new C5025z9();

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C5013yl fromModel(C4678kl c4678kl) {
        C5013yl c5013yl = new C5013yl();
        c5013yl.s = c4678kl.u;
        c5013yl.t = c4678kl.v;
        String str = c4678kl.a;
        if (str != null) {
            c5013yl.a = str;
        }
        List list = c4678kl.f;
        if (list != null) {
            c5013yl.f = (String[]) list.toArray(new String[list.size()]);
        }
        List list2 = c4678kl.g;
        if (list2 != null) {
            c5013yl.g = (String[]) list2.toArray(new String[list2.size()]);
        }
        List list3 = c4678kl.b;
        if (list3 != null) {
            c5013yl.c = (String[]) list3.toArray(new String[list3.size()]);
        }
        List list4 = c4678kl.h;
        if (list4 != null) {
            c5013yl.o = (String[]) list4.toArray(new String[list4.size()]);
        }
        Map<String, ? extends List<String>> map = c4678kl.i;
        if (map != null) {
            c5013yl.h = this.g.fromModel(map);
        }
        Pd pd = c4678kl.s;
        if (pd != null) {
            c5013yl.v = this.a.fromModel(pd);
        }
        String str2 = c4678kl.j;
        if (str2 != null) {
            c5013yl.j = str2;
        }
        String str3 = c4678kl.c;
        if (str3 != null) {
            c5013yl.d = str3;
        }
        String str4 = c4678kl.d;
        if (str4 != null) {
            c5013yl.e = str4;
        }
        String str5 = c4678kl.e;
        if (str5 != null) {
            c5013yl.r = str5;
        }
        c5013yl.i = this.b.fromModel(c4678kl.m);
        String str6 = c4678kl.k;
        if (str6 != null) {
            c5013yl.k = str6;
        }
        String str7 = c4678kl.l;
        if (str7 != null) {
            c5013yl.l = str7;
        }
        c5013yl.m = c4678kl.p;
        c5013yl.b = c4678kl.n;
        c5013yl.q = c4678kl.o;
        RetryPolicyConfig retryPolicyConfig = c4678kl.t;
        c5013yl.w = retryPolicyConfig.maxIntervalSeconds;
        c5013yl.x = retryPolicyConfig.exponentialMultiplier;
        String str8 = c4678kl.q;
        if (str8 != null) {
            c5013yl.n = str8;
        }
        Il il = c4678kl.r;
        if (il != null) {
            this.c.getClass();
            C4989xl c4989xl = new C4989xl();
            c4989xl.a = il.a;
            c5013yl.p = c4989xl;
        }
        c5013yl.u = c4678kl.w;
        BillingConfig billingConfig = c4678kl.x;
        if (billingConfig != null) {
            c5013yl.z = this.d.fromModel(billingConfig);
        }
        C4899u3 c4899u3 = c4678kl.y;
        if (c4899u3 != null) {
            this.e.getClass();
            C4822ql c4822ql = new C4822ql();
            c4822ql.a = c4899u3.a;
            c5013yl.y = c4822ql;
        }
        C4707m2 c4707m2 = c4678kl.z;
        if (c4707m2 != null) {
            c5013yl.A = this.f.fromModel(c4707m2);
        }
        c5013yl.B = this.h.fromModel(c4678kl.A);
        c5013yl.C = this.i.fromModel(c4678kl.B);
        c5013yl.D = this.j.fromModel(c4678kl.C);
        return c5013yl;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C4678kl toModel(C5013yl c5013yl) {
        C4654jl c4654jl = new C4654jl(this.b.toModel(c5013yl.i));
        c4654jl.a = c5013yl.a;
        c4654jl.j = c5013yl.j;
        c4654jl.c = c5013yl.d;
        c4654jl.b = Arrays.asList(c5013yl.c);
        c4654jl.g = Arrays.asList(c5013yl.g);
        c4654jl.f = Arrays.asList(c5013yl.f);
        c4654jl.d = c5013yl.e;
        c4654jl.e = c5013yl.r;
        c4654jl.h = Arrays.asList(c5013yl.o);
        c4654jl.k = c5013yl.k;
        c4654jl.l = c5013yl.l;
        c4654jl.q = c5013yl.m;
        c4654jl.o = c5013yl.b;
        c4654jl.p = c5013yl.q;
        c4654jl.t = c5013yl.s;
        c4654jl.u = c5013yl.t;
        c4654jl.r = c5013yl.n;
        c4654jl.v = c5013yl.u;
        c4654jl.w = new RetryPolicyConfig(c5013yl.w, c5013yl.x);
        c4654jl.i = this.g.toModel(c5013yl.h);
        C4941vl c4941vl = c5013yl.v;
        if (c4941vl != null) {
            this.a.getClass();
            c4654jl.n = new Pd(c4941vl.a, c4941vl.b);
        }
        C4989xl c4989xl = c5013yl.p;
        if (c4989xl != null) {
            this.c.getClass();
            c4654jl.s = new Il(c4989xl.a);
        }
        C4798pl c4798pl = c5013yl.z;
        if (c4798pl != null) {
            this.d.getClass();
            c4654jl.x = new BillingConfig(c4798pl.a, c4798pl.b);
        }
        C4822ql c4822ql = c5013yl.y;
        if (c4822ql != null) {
            this.e.getClass();
            c4654jl.y = new C4899u3(c4822ql.a);
        }
        C4774ol c4774ol = c5013yl.A;
        if (c4774ol != null) {
            c4654jl.z = this.f.toModel(c4774ol);
        }
        C4965wl c4965wl = c5013yl.B;
        if (c4965wl != null) {
            this.h.getClass();
            c4654jl.A = new El(c4965wl.a);
        }
        c4654jl.B = this.i.toModel(c5013yl.C);
        C4869sl c4869sl = c5013yl.D;
        if (c4869sl != null) {
            this.j.getClass();
            c4654jl.C = new C5001y9(c4869sl.a);
        }
        return new C4678kl(c4654jl);
    }
}
