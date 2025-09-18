package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.billinginterface.internal.config.BillingConfig;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import io.appmetrica.analytics.networktasks.internal.RetryPolicyConfig;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/* renamed from: io.appmetrica.analytics.impl.hl */
/* loaded from: classes2.dex */
public final class C5180hl implements ProtobufConverter {

    /* renamed from: a */
    public final C4758Qd f31865a = new C4758Qd();

    /* renamed from: b */
    public final C5044ca f31866b = new C5044ca();

    /* renamed from: c */
    public final C4598Jl f31867c = new C4598Jl();

    /* renamed from: d */
    public final C5361p2 f31868d = new C5361p2();

    /* renamed from: e */
    public final C5537w3 f31869e = new C5537w3();

    /* renamed from: f */
    public final C5311n2 f31870f = new C5311n2();

    /* renamed from: g */
    public final C5540w6 f31871g = new C5540w6();

    /* renamed from: h */
    public final C4502Fl f31872h = new C4502Fl();

    /* renamed from: i */
    public final C4828Tc f31873i = new C4828Tc();

    /* renamed from: j */
    public final C5618z9 f31874j = new C5618z9();

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C5605yl fromModel(C5255kl c5255kl) {
        C5605yl c5605yl = new C5605yl();
        c5605yl.f32889s = c5255kl.f32106u;
        c5605yl.f32890t = c5255kl.f32107v;
        String str = c5255kl.f32086a;
        if (str != null) {
            c5605yl.f32871a = str;
        }
        List list = c5255kl.f32091f;
        if (list != null) {
            c5605yl.f32876f = (String[]) list.toArray(new String[list.size()]);
        }
        List list2 = c5255kl.f32092g;
        if (list2 != null) {
            c5605yl.f32877g = (String[]) list2.toArray(new String[list2.size()]);
        }
        List list3 = c5255kl.f32087b;
        if (list3 != null) {
            c5605yl.f32873c = (String[]) list3.toArray(new String[list3.size()]);
        }
        List list4 = c5255kl.f32093h;
        if (list4 != null) {
            c5605yl.f32885o = (String[]) list4.toArray(new String[list4.size()]);
        }
        Map<String, ? extends List<String>> map = c5255kl.f32094i;
        if (map != null) {
            c5605yl.f32878h = this.f31871g.fromModel(map);
        }
        C4734Pd c4734Pd = c5255kl.f32104s;
        if (c4734Pd != null) {
            c5605yl.f32892v = this.f31865a.fromModel(c4734Pd);
        }
        String str2 = c5255kl.f32095j;
        if (str2 != null) {
            c5605yl.f32880j = str2;
        }
        String str3 = c5255kl.f32088c;
        if (str3 != null) {
            c5605yl.f32874d = str3;
        }
        String str4 = c5255kl.f32089d;
        if (str4 != null) {
            c5605yl.f32875e = str4;
        }
        String str5 = c5255kl.f32090e;
        if (str5 != null) {
            c5605yl.f32888r = str5;
        }
        c5605yl.f32879i = this.f31866b.fromModel(c5255kl.f32098m);
        String str6 = c5255kl.f32096k;
        if (str6 != null) {
            c5605yl.f32881k = str6;
        }
        String str7 = c5255kl.f32097l;
        if (str7 != null) {
            c5605yl.f32882l = str7;
        }
        c5605yl.f32883m = c5255kl.f32101p;
        c5605yl.f32872b = c5255kl.f32099n;
        c5605yl.f32887q = c5255kl.f32100o;
        RetryPolicyConfig retryPolicyConfig = c5255kl.f32105t;
        c5605yl.f32893w = retryPolicyConfig.maxIntervalSeconds;
        c5605yl.f32894x = retryPolicyConfig.exponentialMultiplier;
        String str8 = c5255kl.f32102q;
        if (str8 != null) {
            c5605yl.f32884n = str8;
        }
        C4574Il c4574Il = c5255kl.f32103r;
        if (c4574Il != null) {
            this.f31867c.getClass();
            C5580xl c5580xl = new C5580xl();
            c5580xl.f32832a = c4574Il.f30322a;
            c5605yl.f32886p = c5580xl;
        }
        c5605yl.f32891u = c5255kl.f32108w;
        BillingConfig billingConfig = c5255kl.f32109x;
        if (billingConfig != null) {
            c5605yl.f32896z = this.f31868d.fromModel(billingConfig);
        }
        C5487u3 c5487u3 = c5255kl.f32110y;
        if (c5487u3 != null) {
            this.f31869e.getClass();
            C5405ql c5405ql = new C5405ql();
            c5405ql.f32471a = c5487u3.f32671a;
            c5605yl.f32895y = c5405ql;
        }
        C5286m2 c5286m2 = c5255kl.f32111z;
        if (c5286m2 != null) {
            c5605yl.f32867A = this.f31870f.fromModel(c5286m2);
        }
        c5605yl.f32868B = this.f31872h.fromModel(c5255kl.f32083A);
        c5605yl.f32869C = this.f31873i.fromModel(c5255kl.f32084B);
        c5605yl.f32870D = this.f31874j.fromModel(c5255kl.f32085C);
        return c5605yl;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C5255kl toModel(C5605yl c5605yl) {
        C5230jl c5230jl = new C5230jl(this.f31866b.toModel(c5605yl.f32879i));
        c5230jl.f31996a = c5605yl.f32871a;
        c5230jl.f32005j = c5605yl.f32880j;
        c5230jl.f31998c = c5605yl.f32874d;
        c5230jl.f31997b = Arrays.asList(c5605yl.f32873c);
        c5230jl.f32002g = Arrays.asList(c5605yl.f32877g);
        c5230jl.f32001f = Arrays.asList(c5605yl.f32876f);
        c5230jl.f31999d = c5605yl.f32875e;
        c5230jl.f32000e = c5605yl.f32888r;
        c5230jl.f32003h = Arrays.asList(c5605yl.f32885o);
        c5230jl.f32006k = c5605yl.f32881k;
        c5230jl.f32007l = c5605yl.f32882l;
        c5230jl.f32012q = c5605yl.f32883m;
        c5230jl.f32010o = c5605yl.f32872b;
        c5230jl.f32011p = c5605yl.f32887q;
        c5230jl.f32015t = c5605yl.f32889s;
        c5230jl.f32016u = c5605yl.f32890t;
        c5230jl.f32013r = c5605yl.f32884n;
        c5230jl.f32017v = c5605yl.f32891u;
        c5230jl.f32018w = new RetryPolicyConfig(c5605yl.f32893w, c5605yl.f32894x);
        c5230jl.f32004i = this.f31871g.toModel(c5605yl.f32878h);
        C5530vl c5530vl = c5605yl.f32892v;
        if (c5530vl != null) {
            this.f31865a.getClass();
            c5230jl.f32009n = new C4734Pd(c5530vl.f32743a, c5530vl.f32744b);
        }
        C5580xl c5580xl = c5605yl.f32886p;
        if (c5580xl != null) {
            this.f31867c.getClass();
            c5230jl.f32014s = new C4574Il(c5580xl.f32832a);
        }
        C5380pl c5380pl = c5605yl.f32896z;
        if (c5380pl != null) {
            this.f31868d.getClass();
            c5230jl.f32019x = new BillingConfig(c5380pl.f32406a, c5380pl.f32407b);
        }
        C5405ql c5405ql = c5605yl.f32895y;
        if (c5405ql != null) {
            this.f31869e.getClass();
            c5230jl.f32020y = new C5487u3(c5405ql.f32471a);
        }
        C5355ol c5355ol = c5605yl.f32867A;
        if (c5355ol != null) {
            c5230jl.f32021z = this.f31870f.toModel(c5355ol);
        }
        C5555wl c5555wl = c5605yl.f32868B;
        if (c5555wl != null) {
            this.f31872h.getClass();
            c5230jl.f31993A = new C4478El(c5555wl.f32781a);
        }
        c5230jl.f31994B = this.f31873i.toModel(c5605yl.f32869C);
        C5455sl c5455sl = c5605yl.f32870D;
        if (c5455sl != null) {
            this.f31874j.getClass();
            c5230jl.f31995C = new C5593y9(c5455sl.f32579a);
        }
        return new C5255kl(c5230jl);
    }
}
