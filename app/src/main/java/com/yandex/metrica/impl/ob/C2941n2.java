package com.yandex.metrica.impl.ob;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.os.ResultReceiver;
import android.util.Base64;
import android.util.Pair;
import com.yandex.metrica.CounterConfiguration;
import com.yandex.metrica.IMetricaService;
import com.yandex.metrica.impl.ob.C2966o2;
import defpackage.InterfaceC7694vv1;
import java.io.UnsupportedEncodingException;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Future;
import org.json.JSONObject;

/* renamed from: com.yandex.metrica.impl.ob.n2 */
/* loaded from: classes2.dex */
public class C2941n2 implements Z0 {
    private final Context a;
    private C3194x1 b;
    private C3064s1 c;
    private final C2640b0 d;
    private Ki e;
    private final C3200x7 f;
    private final C2697d7 g;
    private final C2966o2 h = new C2966o2(this);

    /* renamed from: com.yandex.metrica.impl.ob.n2$a */
    public class a implements C2966o2.e {
        final /* synthetic */ Map a;
        final /* synthetic */ C2866k2 b;

        public a(Map map, C2866k2 c2866k2) {
            this.a = map;
            this.b = c2866k2;
        }

        @Override // com.yandex.metrica.impl.ob.C2966o2.e
        public C2864k0 a(C2864k0 c2864k0) {
            C2941n2 c2941n2 = C2941n2.this;
            C2864k0 c2864k0F = c2864k0.f(C3240ym.g(this.a));
            C2866k2 c2866k2 = this.b;
            c2941n2.getClass();
            if (J0.f(c2864k0F.e)) {
                c2864k0F.c(c2866k2.c.a());
            }
            return c2864k0F;
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.n2$b */
    public class b implements C2966o2.e {
        final /* synthetic */ C2631ag a;

        public b(C2941n2 c2941n2, C2631ag c2631ag) {
            this.a = c2631ag;
        }

        @Override // com.yandex.metrica.impl.ob.C2966o2.e
        public C2864k0 a(C2864k0 c2864k0) {
            return c2864k0.f(new String(Base64.encode(AbstractC2714e.a(this.a), 0)));
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.n2$c */
    public class c implements C2966o2.e {
        final /* synthetic */ String a;

        public c(C2941n2 c2941n2, String str) {
            this.a = str;
        }

        @Override // com.yandex.metrica.impl.ob.C2966o2.e
        public C2864k0 a(C2864k0 c2864k0) {
            return c2864k0.f(this.a);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.n2$d */
    public class d implements C2966o2.e {
        final /* synthetic */ C3016q2 a;

        public d(C2941n2 c2941n2, C3016q2 c3016q2) {
            this.a = c3016q2;
        }

        @Override // com.yandex.metrica.impl.ob.C2966o2.e
        public C2864k0 a(C2864k0 c2864k0) {
            Pair<byte[], Integer> pairA = this.a.a();
            C2864k0 c2864k0F = c2864k0.f(new String(Base64.encode((byte[]) pairA.first, 0)));
            c2864k0F.h = ((Integer) pairA.second).intValue();
            return c2864k0F;
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.n2$e */
    public class e implements C2966o2.e {
        final /* synthetic */ C3099tb a;

        public e(C2941n2 c2941n2, C3099tb c3099tb) {
            this.a = c3099tb;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.yandex.metrica.impl.ob.C2966o2.e
        public C2864k0 a(C2864k0 c2864k0) {
            C2864k0 c2864k0F = c2864k0.f(V0.a(AbstractC2714e.a((AbstractC2714e) this.a.a)));
            c2864k0F.h = this.a.b.a();
            return c2864k0F;
        }
    }

    public C2941n2(U3 u3, Context context, C3194x1 c3194x1, C3200x7 c3200x7, C2697d7 c2697d7) {
        this.b = c3194x1;
        this.a = context;
        this.d = new C2640b0(u3);
        this.f = c3200x7;
        this.g = c2697d7;
    }

    public void a(C3064s1 c3064s1) {
        this.c = c3064s1;
    }

    public void b(C2866k2 c2866k2) {
        Pe pe = c2866k2.d;
        String strE = c2866k2.e();
        Im imA = a(c2866k2);
        List<Integer> list = J0.i;
        JSONObject jSONObject = new JSONObject();
        if (pe != null) {
            pe.a(jSONObject);
        }
        a(new S(jSONObject.toString(), "", EnumC2865k1.EVENT_TYPE_ACTIVATION.b(), 0, imA).d(strE), c2866k2);
    }

    public void c(C2866k2 c2866k2) {
        C2864k0 c2864k0 = new C2864k0();
        c2864k0.e = EnumC2865k1.EVENT_TYPE_APP_ENVIRONMENT_CLEARED.b();
        a(new C2966o2.f(c2864k0, c2866k2));
    }

    public void d() {
        this.b.g();
    }

    public void e() {
        this.b.f();
    }

    public void f() {
        this.b.a();
    }

    public void g() {
        this.b.c();
    }

    public void a(Ki ki) {
        this.e = ki;
        this.d.a(ki);
    }

    public void a(Boolean bool, Boolean bool2, Boolean bool3) {
        if (U2.a(bool)) {
            this.d.b().k(bool.booleanValue());
        }
        if (U2.a(bool2)) {
            this.d.b().n(bool2.booleanValue());
        }
        if (U2.a(bool3)) {
            CounterConfiguration counterConfigurationB = this.d.b();
            bool3.booleanValue();
            synchronized (counterConfigurationB) {
                counterConfigurationB.a.put("CFG_LOCATION_ALLOWED_BY_BRIDGE", bool3);
            }
        }
        C2864k0 c2864k0 = new C2864k0();
        c2864k0.e = EnumC2865k1.EVENT_TYPE_UPDATE_PRE_ACTIVATION_CONFIG.b();
        a(c2864k0, this.d);
    }

    public C3194x1 c() {
        return this.b;
    }

    public Future<Void> b(U3 u3) {
        return this.h.queueResumeUserSession(u3);
    }

    public void b(String str) {
        this.d.a().b(str);
    }

    public void b(C2996p7 c2996p7, C2866k2 c2866k2) {
        this.b.f();
        a(this.g.a(c2996p7, c2866k2));
    }

    public void a(String str, C2866k2 c2866k2) {
        try {
            a(J0.c(V0.a(AbstractC2714e.a(this.f.b(new L7(str == null ? new byte[0] : str.getBytes("UTF-8"), new K7(O7.USER, null))))), a(c2866k2)), c2866k2);
        } catch (UnsupportedEncodingException unused) {
        }
    }

    public void b(String str, C2866k2 c2866k2) {
        a(new C2966o2.f(S.a(str, a(c2866k2)), c2866k2).a(new c(this, str)));
    }

    public Future<Void> a(C2864k0 c2864k0, C2866k2 c2866k2, Map<String, Object> map) {
        EnumC2865k1 enumC2865k1 = EnumC2865k1.EVENT_TYPE_UNDEFINED;
        this.b.f();
        C2966o2.f fVar = new C2966o2.f(c2864k0, c2866k2);
        if (!U2.b(map)) {
            fVar.a(new a(map, c2866k2));
        }
        return a(fVar);
    }

    public InterfaceC7694vv1 b() {
        return this.h;
    }

    public Future<Void> a(U3 u3) {
        return this.h.queuePauseUserSession(u3);
    }

    public void a(List<String> list, ResultReceiver resultReceiver, Map<String, String> map) {
        Bundle bundle = new Bundle();
        bundle.putParcelable("com.yandex.metrica.impl.IdentifiersData", new C2741f1(list, map, resultReceiver));
        EnumC2865k1 enumC2865k1 = EnumC2865k1.EVENT_TYPE_STARTUP;
        int i = AbstractC3265zm.e;
        Im imG = Im.g();
        List<Integer> list2 = J0.i;
        a(new S("", "", enumC2865k1.b(), 0, imG).c(bundle), this.d);
    }

    public void a(C2864k0 c2864k0, C2866k2 c2866k2) {
        if (J0.f(c2864k0.e)) {
            c2864k0.c(c2866k2.c.a());
        }
        a(c2864k0, c2866k2, (Map<String, Object>) null);
    }

    public void a(Gg gg) {
        Bundle bundle = new Bundle();
        bundle.putParcelable("com.yandex.metrica.impl.referrer.common.ReferrerResultReceiver", gg);
        int i = AbstractC3265zm.e;
        Im imG = Im.g();
        List<Integer> list = J0.i;
        a(new S("", "", EnumC2865k1.EVENT_TYPE_REQUEST_REFERRER.b(), 0, imG).c(bundle), this.d);
    }

    public void a(List<String> list) {
        this.d.a().a(list);
    }

    public void a(Map<String, String> map) {
        this.d.a().a(map);
    }

    public void a(String str) {
        this.d.a().a(str);
    }

    public void a(C2996p7 c2996p7, C2866k2 c2866k2) {
        this.b.f();
        C2966o2.f fVarA = this.g.a(c2996p7, c2866k2);
        fVarA.a().a(this.e);
        this.h.sendCrash(fVarA);
    }

    public void a(String str, String str2, C2866k2 c2866k2) {
        C2864k0 c2864k0 = new C2864k0();
        c2864k0.e = EnumC2865k1.EVENT_TYPE_APP_ENVIRONMENT_UPDATED.b();
        a(new C2966o2.f(c2864k0.a(str, str2), c2866k2));
    }

    public void a(C2631ag c2631ag, C2866k2 c2866k2) {
        C2864k0 c2864k0 = new C2864k0();
        c2864k0.e = EnumC2865k1.EVENT_TYPE_SEND_USER_PROFILE.b();
        a(new C2966o2.f(c2864k0, c2866k2).a(new b(this, c2631ag)));
    }

    public void a(C3016q2 c3016q2, C2866k2 c2866k2) {
        S s = new S(a(c2866k2));
        s.e = EnumC2865k1.EVENT_TYPE_SEND_REVENUE_EVENT.b();
        a(new C2966o2.f(s, c2866k2).a(new d(this, c3016q2)));
    }

    public void a(Fb fb, C2866k2 c2866k2) {
        for (C3099tb<Rf, Fn> c3099tb : fb.toProto()) {
            S s = new S(a(c2866k2));
            s.e = EnumC2865k1.EVENT_TYPE_SEND_ECOMMERCE_EVENT.b();
            a(new C2966o2.f(s, c2866k2).a(new e(this, c3099tb)));
        }
    }

    public void a(IMetricaService iMetricaService, C2864k0 c2864k0, C2866k2 c2866k2) throws RemoteException {
        iMetricaService.reportData(c2864k0.b(c2866k2.c()));
        C3064s1 c3064s1 = this.c;
        if (c3064s1 == null || c3064s1.b.f()) {
            this.b.g();
        }
    }

    private Future<Void> a(C2966o2.f fVar) {
        fVar.a().a(this.e);
        return this.h.queueReport(fVar);
    }

    public Context a() {
        return this.a;
    }

    private Im a(C2866k2 c2866k2) {
        return AbstractC3265zm.b(c2866k2.b().a());
    }
}
