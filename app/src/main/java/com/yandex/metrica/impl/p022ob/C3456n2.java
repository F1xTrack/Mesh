package com.yandex.metrica.impl.p022ob;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.os.ResultReceiver;
import android.util.Base64;
import android.util.Pair;
import com.yandex.metrica.CounterConfiguration;
import com.yandex.metrica.IMetricaService;
import com.yandex.metrica.impl.p022ob.C3482o2;
import java.io.UnsupportedEncodingException;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Future;
import org.json.JSONObject;
import p000.InterfaceC11478vv1;

/* renamed from: com.yandex.metrica.impl.ob.n2 */
/* loaded from: classes2.dex */
public class C3456n2 implements InterfaceC3091Z0 {

    /* renamed from: a */
    private final Context f24276a;

    /* renamed from: b */
    private C3715x1 f24277b;

    /* renamed from: c */
    private C3585s1 f24278c;

    /* renamed from: d */
    private final C3142b0 f24279d;

    /* renamed from: e */
    private InterfaceC2735Ki f24280e;

    /* renamed from: f */
    private final C3721x7 f24281f;

    /* renamed from: g */
    private final C3201d7 f24282g;

    /* renamed from: h */
    private final C3482o2 f24283h = new C3482o2(this);

    /* renamed from: com.yandex.metrica.impl.ob.n2$a */
    public class a implements C3482o2.e {

        /* renamed from: a */
        final /* synthetic */ Map f24284a;

        /* renamed from: b */
        final /* synthetic */ C3378k2 f24285b;

        public a(Map map, C3378k2 c3378k2) {
            this.f24284a = map;
            this.f24285b = c3378k2;
        }

        @Override // com.yandex.metrica.impl.p022ob.C3482o2.e
        /* renamed from: a */
        public C3376k0 mo16474a(C3376k0 c3376k0) {
            C3456n2 c3456n2 = C3456n2.this;
            C3376k0 c3376k0Mo15103f = c3376k0.mo15103f(C3762ym.m17305g(this.f24284a));
            C3378k2 c3378k2 = this.f24285b;
            c3456n2.getClass();
            if (C2692J0.m14407f(c3376k0Mo15103f.f23831e)) {
                c3376k0Mo15103f.m16232c(c3378k2.f23900c.m14214a());
            }
            return c3376k0Mo15103f;
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.n2$b */
    public class b implements C3482o2.e {

        /* renamed from: a */
        final /* synthetic */ C3132ag f24287a;

        public b(C3456n2 c3456n2, C3132ag c3132ag) {
            this.f24287a = c3132ag;
        }

        @Override // com.yandex.metrica.impl.p022ob.C3482o2.e
        /* renamed from: a */
        public C3376k0 mo16474a(C3376k0 c3376k0) {
            return c3376k0.mo15103f(new String(Base64.encode(AbstractC3219e.m15809a(this.f24287a), 0)));
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.n2$c */
    public class c implements C3482o2.e {

        /* renamed from: a */
        final /* synthetic */ String f24288a;

        public c(C3456n2 c3456n2, String str) {
            this.f24288a = str;
        }

        @Override // com.yandex.metrica.impl.p022ob.C3482o2.e
        /* renamed from: a */
        public C3376k0 mo16474a(C3376k0 c3376k0) {
            return c3376k0.mo15103f(this.f24288a);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.n2$d */
    public class d implements C3482o2.e {

        /* renamed from: a */
        final /* synthetic */ C3534q2 f24289a;

        public d(C3456n2 c3456n2, C3534q2 c3534q2) {
            this.f24289a = c3534q2;
        }

        @Override // com.yandex.metrica.impl.p022ob.C3482o2.e
        /* renamed from: a */
        public C3376k0 mo16474a(C3376k0 c3376k0) {
            Pair<byte[], Integer> pairM16599a = this.f24289a.m16599a();
            C3376k0 c3376k0Mo15103f = c3376k0.mo15103f(new String(Base64.encode((byte[]) pairM16599a.first, 0)));
            c3376k0Mo15103f.f23834h = ((Integer) pairM16599a.second).intValue();
            return c3376k0Mo15103f;
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.n2$e */
    public class e implements C3482o2.e {

        /* renamed from: a */
        final /* synthetic */ C3621tb f24290a;

        public e(C3456n2 c3456n2, C3621tb c3621tb) {
            this.f24290a = c3621tb;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.yandex.metrica.impl.p022ob.C3482o2.e
        /* renamed from: a */
        public C3376k0 mo16474a(C3376k0 c3376k0) {
            C3376k0 c3376k0Mo15103f = c3376k0.mo15103f(C2991V0.m15293a(AbstractC3219e.m15809a((AbstractC3219e) this.f24290a.f24816a)));
            c3376k0Mo15103f.f23834h = this.f24290a.f24817b.mo14051a();
            return c3376k0Mo15103f;
        }
    }

    public C3456n2(C2969U3 c2969u3, Context context, C3715x1 c3715x1, C3721x7 c3721x7, C3201d7 c3201d7) {
        this.f24277b = c3715x1;
        this.f24276a = context;
        this.f24279d = new C3142b0(c2969u3);
        this.f24281f = c3721x7;
        this.f24282g = c3201d7;
    }

    /* renamed from: a */
    public void m16454a(C3585s1 c3585s1) {
        this.f24278c = c3585s1;
    }

    /* renamed from: b */
    public void m16464b(C3378k2 c3378k2) {
        C2856Pe c2856Pe = c3378k2.f23901d;
        String strM16256e = c3378k2.m16256e();
        C2689Im c2689ImM16441a = m16441a(c3378k2);
        List<Integer> list = C2692J0.f21482i;
        JSONObject jSONObject = new JSONObject();
        if (c2856Pe != null) {
            c2856Pe.m14786a(jSONObject);
        }
        m16451a(new C2915S(jSONObject.toString(), "", EnumC3377k1.EVENT_TYPE_ACTIVATION.m16250b(), 0, c2689ImM16441a).mo15101d(strM16256e), c3378k2);
    }

    /* renamed from: c */
    public void m16469c(C3378k2 c3378k2) {
        C3376k0 c3376k0 = new C3376k0();
        c3376k0.f23831e = EnumC3377k1.EVENT_TYPE_APP_ENVIRONMENT_CLEARED.m16250b();
        m16442a(new C3482o2.f(c3376k0, c3378k2));
    }

    /* renamed from: d */
    public void m16470d() {
        this.f24277b.m17169g();
    }

    /* renamed from: e */
    public void m16471e() {
        this.f24277b.m17168f();
    }

    /* renamed from: f */
    public void m16472f() {
        this.f24277b.m17162a();
    }

    /* renamed from: g */
    public void m16473g() {
        this.f24277b.m17165c();
    }

    /* renamed from: a */
    public void m16449a(InterfaceC2735Ki interfaceC2735Ki) {
        this.f24280e = interfaceC2735Ki;
        this.f24279d.m16251a(interfaceC2735Ki);
    }

    /* renamed from: a */
    public void m16455a(Boolean bool, Boolean bool2, Boolean bool3) {
        if (C2968U2.m15244a(bool)) {
            this.f24279d.m15168b().m13778k(bool.booleanValue());
        }
        if (C2968U2.m15244a(bool2)) {
            this.f24279d.m15168b().m13781n(bool2.booleanValue());
        }
        if (C2968U2.m15244a(bool3)) {
            CounterConfiguration counterConfigurationM15168b = this.f24279d.m15168b();
            bool3.booleanValue();
            synchronized (counterConfigurationM15168b) {
                counterConfigurationM15168b.f20731a.put("CFG_LOCATION_ALLOWED_BY_BRIDGE", bool3);
            }
        }
        C3376k0 c3376k0 = new C3376k0();
        c3376k0.f23831e = EnumC3377k1.EVENT_TYPE_UPDATE_PRE_ACTIVATION_CONFIG.m16250b();
        m16451a(c3376k0, this.f24279d);
    }

    /* renamed from: c */
    public C3715x1 m16468c() {
        return this.f24277b;
    }

    /* renamed from: b */
    public Future<Void> m16462b(C2969U3 c2969u3) {
        return this.f24283h.queueResumeUserSession(c2969u3);
    }

    /* renamed from: b */
    public void m16466b(String str) {
        this.f24279d.m15167a().m15260b(str);
    }

    /* renamed from: b */
    public void m16465b(C3513p7 c3513p7, C3378k2 c3378k2) {
        this.f24277b.m17168f();
        m16442a(this.f24282g.m15743a(c3513p7, c3378k2));
    }

    /* renamed from: a */
    public void m16457a(String str, C3378k2 c3378k2) {
        try {
            m16451a(C2692J0.m14403c(C2991V0.m15293a(AbstractC3219e.m15809a(this.f24281f.mo13847b(new C2749L7(str == null ? new byte[0] : str.getBytes("UTF-8"), new C2724K7(EnumC2824O7.USER, null))))), m16441a(c3378k2)), c3378k2);
        } catch (UnsupportedEncodingException unused) {
        }
    }

    /* renamed from: b */
    public void m16467b(String str, C3378k2 c3378k2) {
        m16442a(new C3482o2.f(C2915S.m15091a(str, m16441a(c3378k2)), c3378k2).m16518a(new c(this, str)));
    }

    /* renamed from: a */
    public Future<Void> m16445a(C3376k0 c3376k0, C3378k2 c3378k2, Map<String, Object> map) {
        EnumC3377k1 enumC3377k1 = EnumC3377k1.EVENT_TYPE_UNDEFINED;
        this.f24277b.m17168f();
        C3482o2.f fVar = new C3482o2.f(c3376k0, c3378k2);
        if (!C2968U2.m15250b(map)) {
            fVar.m16518a(new a(map, c3378k2));
        }
        return m16442a(fVar);
    }

    /* renamed from: b */
    public InterfaceC11478vv1 m16463b() {
        return this.f24283h;
    }

    /* renamed from: a */
    public Future<Void> m16444a(C2969U3 c2969u3) {
        return this.f24283h.queuePauseUserSession(c2969u3);
    }

    /* renamed from: a */
    public void m16460a(List<String> list, ResultReceiver resultReceiver, Map<String, String> map) {
        Bundle bundle = new Bundle();
        bundle.putParcelable("com.yandex.metrica.impl.IdentifiersData", new C3247f1(list, map, resultReceiver));
        EnumC3377k1 enumC3377k1 = EnumC3377k1.EVENT_TYPE_STARTUP;
        int i = AbstractC3788zm.f25452e;
        C2689Im c2689ImM14369g = C2689Im.m14369g();
        List<Integer> list2 = C2692J0.f21482i;
        m16451a(new C2915S("", "", enumC3377k1.m16250b(), 0, c2689ImM14369g).m16231c(bundle), this.f24279d);
    }

    /* renamed from: a */
    public void m16451a(C3376k0 c3376k0, C3378k2 c3378k2) {
        if (C2692J0.m14407f(c3376k0.f23831e)) {
            c3376k0.m16232c(c3378k2.f23900c.m14214a());
        }
        m16445a(c3376k0, c3378k2, (Map<String, Object>) null);
    }

    /* renamed from: a */
    public void m16448a(ResultReceiverC2633Gg resultReceiverC2633Gg) {
        Bundle bundle = new Bundle();
        bundle.putParcelable("com.yandex.metrica.impl.referrer.common.ReferrerResultReceiver", resultReceiverC2633Gg);
        int i = AbstractC3788zm.f25452e;
        C2689Im c2689ImM14369g = C2689Im.m14369g();
        List<Integer> list = C2692J0.f21482i;
        m16451a(new C2915S("", "", EnumC3377k1.EVENT_TYPE_REQUEST_REFERRER.m16250b(), 0, c2689ImM14369g).m16231c(bundle), this.f24279d);
    }

    /* renamed from: a */
    public void m16459a(List<String> list) {
        this.f24279d.m15167a().m15256a(list);
    }

    /* renamed from: a */
    public void m16461a(Map<String, String> map) {
        this.f24279d.m15167a().m15257a(map);
    }

    /* renamed from: a */
    public void m16456a(String str) {
        this.f24279d.m15167a().m15255a(str);
    }

    /* renamed from: a */
    public void m16452a(C3513p7 c3513p7, C3378k2 c3378k2) {
        this.f24277b.m17168f();
        C3482o2.f fVarM15743a = this.f24282g.m15743a(c3513p7, c3378k2);
        fVarM15743a.m16517a().m16251a(this.f24280e);
        this.f24283h.sendCrash(fVarM15743a);
    }

    /* renamed from: a */
    public void m16458a(String str, String str2, C3378k2 c3378k2) {
        C3376k0 c3376k0 = new C3376k0();
        c3376k0.f23831e = EnumC3377k1.EVENT_TYPE_APP_ENVIRONMENT_UPDATED.m16250b();
        m16442a(new C3482o2.f(c3376k0.m16227a(str, str2), c3378k2));
    }

    /* renamed from: a */
    public void m16450a(C3132ag c3132ag, C3378k2 c3378k2) {
        C3376k0 c3376k0 = new C3376k0();
        c3376k0.f23831e = EnumC3377k1.EVENT_TYPE_SEND_USER_PROFILE.m16250b();
        m16442a(new C3482o2.f(c3376k0, c3378k2).m16518a(new b(this, c3132ag)));
    }

    /* renamed from: a */
    public void m16453a(C3534q2 c3534q2, C3378k2 c3378k2) {
        C2915S c2915s = new C2915S(m16441a(c3378k2));
        c2915s.f23831e = EnumC3377k1.EVENT_TYPE_SEND_REVENUE_EVENT.m16250b();
        m16442a(new C3482o2.f(c2915s, c3378k2).m16518a(new d(this, c3534q2)));
    }

    /* renamed from: a */
    public void m16447a(InterfaceC2603Fb interfaceC2603Fb, C3378k2 c3378k2) {
        for (C3621tb<C2906Rf, InterfaceC2615Fn> c3621tb : interfaceC2603Fb.toProto()) {
            C2915S c2915s = new C2915S(m16441a(c3378k2));
            c2915s.f23831e = EnumC3377k1.EVENT_TYPE_SEND_ECOMMERCE_EVENT.m16250b();
            m16442a(new C3482o2.f(c2915s, c3378k2).m16518a(new e(this, c3621tb)));
        }
    }

    /* renamed from: a */
    public void m16446a(IMetricaService iMetricaService, C3376k0 c3376k0, C3378k2 c3378k2) throws RemoteException {
        iMetricaService.reportData(c3376k0.m16228b(c3378k2.m16254c()));
        C3585s1 c3585s1 = this.f24278c;
        if (c3585s1 == null || c3585s1.f21461b.mo15660f()) {
            this.f24277b.m17169g();
        }
    }

    /* renamed from: a */
    private Future<Void> m16442a(C3482o2.f fVar) {
        fVar.m16517a().m16251a(this.f24280e);
        return this.f24283h.queueReport(fVar);
    }

    /* renamed from: a */
    public Context m16443a() {
        return this.f24276a;
    }

    /* renamed from: a */
    private C2689Im m16441a(C3378k2 c3378k2) {
        return AbstractC3788zm.m17346b(c3378k2.m15168b().m13768a());
    }
}
