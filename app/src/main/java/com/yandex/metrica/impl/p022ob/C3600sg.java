package com.yandex.metrica.impl.p022ob;

import android.content.Context;
import com.yandex.metrica.C3797p;
import com.yandex.metrica.IIdentifierCallback;
import com.yandex.metrica.impl.interact.CellularNetworkInfo;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Future;
import org.json.JSONObject;

/* renamed from: com.yandex.metrica.impl.ob.sg */
/* loaded from: classes2.dex */
public class C3600sg {

    /* renamed from: a */
    private final C3626tg f24681a;

    /* renamed from: b */
    private final InterfaceExecutorC3607sn f24682b;

    /* renamed from: c */
    private final C3444mg f24683c;

    /* renamed from: d */
    private final InterfaceC3660uo<Context> f24684d;

    /* renamed from: e */
    private final InterfaceC3660uo<String> f24685e;

    /* renamed from: f */
    private final C2864Pm f24686f;

    /* renamed from: com.yandex.metrica.impl.ob.sg$a */
    public class a extends AbstractRunnableC2739Km {

        /* renamed from: a */
        final /* synthetic */ Context f24687a;

        /* renamed from: b */
        final /* synthetic */ IIdentifierCallback f24688b;

        /* renamed from: c */
        final /* synthetic */ List f24689c;

        public a(Context context, IIdentifierCallback iIdentifierCallback, List list) {
            this.f24687a = context;
            this.f24688b = iIdentifierCallback;
            this.f24689c = list;
        }

        @Override // com.yandex.metrica.impl.p022ob.AbstractRunnableC2739Km
        /* renamed from: a */
        public void mo14494a() throws Exception {
            C3626tg c3626tg = C3600sg.this.f24681a;
            Context context = this.f24687a;
            c3626tg.getClass();
            C3405l3.m16349a(context).m16368a(this.f24688b, this.f24689c);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.sg$b */
    public class b extends AbstractCallableC2714Jm<String> {
        public b() {
        }

        @Override // com.yandex.metrica.impl.p022ob.AbstractCallableC2714Jm
        /* renamed from: a */
        public String mo14447a() throws Exception {
            C3600sg.this.f24681a.getClass();
            C3405l3 c3405l3M16363k = C3405l3.m16363k();
            if (c3405l3M16363k == null) {
                return null;
            }
            return c3405l3M16363k.m16376e().mo15839a();
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.sg$c */
    public class c extends AbstractCallableC2714Jm<Boolean> {
        public c() {
        }

        @Override // com.yandex.metrica.impl.p022ob.AbstractCallableC2714Jm
        /* renamed from: a */
        public Boolean mo14447a() throws Exception {
            C3600sg.this.f24681a.getClass();
            C3405l3 c3405l3M16363k = C3405l3.m16363k();
            if (c3405l3M16363k == null) {
                return null;
            }
            return c3405l3M16363k.m16376e().mo15842b();
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.sg$d */
    public class d extends AbstractRunnableC2739Km {

        /* renamed from: a */
        final /* synthetic */ int f24693a;

        /* renamed from: b */
        final /* synthetic */ String f24694b;

        /* renamed from: c */
        final /* synthetic */ String f24695c;

        /* renamed from: d */
        final /* synthetic */ Map f24696d;

        public d(int i, String str, String str2, Map map) {
            this.f24693a = i;
            this.f24694b = str;
            this.f24695c = str2;
            this.f24696d = map;
        }

        @Override // com.yandex.metrica.impl.p022ob.AbstractRunnableC2739Km
        /* renamed from: a */
        public void mo14494a() throws Exception {
            C3600sg.m16734b(C3600sg.this).mo14374a(this.f24693a, this.f24694b, this.f24695c, this.f24696d);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.sg$e */
    public class e extends AbstractRunnableC2739Km {
        public e() {
        }

        @Override // com.yandex.metrica.impl.p022ob.AbstractRunnableC2739Km
        /* renamed from: a */
        public void mo14494a() throws Exception {
            C3600sg.m16734b(C3600sg.this).sendEventsBuffer();
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.sg$f */
    public class f extends AbstractRunnableC2739Km {

        /* renamed from: a */
        final /* synthetic */ boolean f24699a;

        public f(boolean z) {
            this.f24699a = z;
        }

        @Override // com.yandex.metrica.impl.p022ob.AbstractRunnableC2739Km
        /* renamed from: a */
        public void mo14494a() throws Exception {
            C3626tg c3626tg = C3600sg.this.f24681a;
            boolean z = this.f24699a;
            c3626tg.getClass();
            C3405l3.m16355b(z);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.sg$g */
    public class g extends AbstractRunnableC2739Km {

        /* renamed from: a */
        final /* synthetic */ C3797p.Ucc f24701a;

        /* renamed from: b */
        final /* synthetic */ boolean f24702b;

        /* renamed from: com.yandex.metrica.impl.ob.sg$g$a */
        public class a implements InterfaceC2838Ol {
            public a() {
            }

            @Override // com.yandex.metrica.impl.p022ob.InterfaceC2838Ol
            public void onError(String str) {
                g.this.f24701a.onError(str);
            }

            @Override // com.yandex.metrica.impl.p022ob.InterfaceC2838Ol
            public void onResult(JSONObject jSONObject) {
                g.this.f24701a.onResult(jSONObject);
            }
        }

        public g(C3797p.Ucc ucc, boolean z) {
            this.f24701a = ucc;
            this.f24702b = z;
        }

        @Override // com.yandex.metrica.impl.p022ob.AbstractRunnableC2739Km
        /* renamed from: a */
        public void mo14494a() throws Exception {
            C3600sg.m16734b(C3600sg.this).mo14484a(new a(), this.f24702b);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.sg$h */
    public class h extends AbstractRunnableC2739Km {

        /* renamed from: a */
        final /* synthetic */ Context f24705a;

        /* renamed from: b */
        final /* synthetic */ Map f24706b;

        public h(Context context, Map map) {
            this.f24705a = context;
            this.f24706b = map;
        }

        @Override // com.yandex.metrica.impl.p022ob.AbstractRunnableC2739Km
        /* renamed from: a */
        public void mo14494a() throws Exception {
            C3626tg c3626tg = C3600sg.this.f24681a;
            Context context = this.f24705a;
            c3626tg.getClass();
            C3405l3.m16349a(context).m16369a(this.f24706b);
        }
    }

    public C3600sg(InterfaceExecutorC3607sn interfaceExecutorC3607sn, C3626tg c3626tg) {
        this(interfaceExecutorC3607sn, c3626tg, new C3444mg(c3626tg), new C3582ro(new C3556qo("Context")), new C3582ro(new C3556qo("Event name")), new C2864Pm());
    }

    /* renamed from: b */
    public Future<String> m16743b() {
        return ((C3581rn) this.f24682b).m16702a(new b());
    }

    /* renamed from: c */
    public Future<Boolean> m16745c() {
        return ((C3581rn) this.f24682b).m16702a(new c());
    }

    /* renamed from: d */
    public String m16746d(Context context) {
        this.f24684d.mo14391a(context);
        this.f24681a.getClass();
        return C3405l3.m16349a(context).m16365a();
    }

    public C3600sg(InterfaceExecutorC3607sn interfaceExecutorC3607sn, C3626tg c3626tg, C3444mg c3444mg, InterfaceC3660uo<Context> interfaceC3660uo, InterfaceC3660uo<String> interfaceC3660uo2, C2864Pm c2864Pm) {
        this.f24681a = c3626tg;
        this.f24682b = interfaceExecutorC3607sn;
        this.f24683c = c3444mg;
        this.f24684d = interfaceC3660uo;
        this.f24685e = interfaceC3660uo2;
        this.f24686f = c2864Pm;
    }

    /* renamed from: a */
    public void m16737a(Context context, IIdentifierCallback iIdentifierCallback, List<String> list) {
        this.f24684d.mo14391a(context);
        ((C3581rn) this.f24682b).execute(new a(context, iIdentifierCallback, list));
    }

    /* renamed from: b */
    public String m16742b(Context context) {
        this.f24684d.mo14391a(context);
        this.f24681a.getClass();
        return C3405l3.m16349a(context).m16373c();
    }

    /* renamed from: c */
    public String m16744c(Context context) {
        this.f24684d.mo14391a(context);
        return context.getPackageName();
    }

    /* renamed from: a */
    public boolean m16741a() {
        this.f24681a.getClass();
        return C3405l3.m16360h();
    }

    /* renamed from: d */
    public void m16747d() {
        this.f24683c.mo14391a(null);
        ((C3581rn) this.f24682b).execute(new e());
    }

    /* renamed from: b */
    public static InterfaceC2966U0 m16734b(C3600sg c3600sg) {
        c3600sg.f24681a.getClass();
        return C3405l3.m16363k().m16375d().m16807b();
    }

    /* renamed from: a */
    public String m16735a(Context context) {
        this.f24684d.mo14391a(context);
        return this.f24686f.m14801a(context) ? new CellularNetworkInfo(context).getCelluralInfo() : "";
    }

    /* renamed from: a */
    public void m16736a(int i, String str, String str2, Map<String, String> map) {
        this.f24683c.mo14391a(null);
        this.f24685e.mo14391a(str);
        ((C3581rn) this.f24682b).execute(new d(i, str, str2, map));
    }

    /* renamed from: a */
    public void m16739a(Context context, boolean z) {
        this.f24684d.mo14391a(context);
        ((C3581rn) this.f24682b).execute(new f(z));
    }

    /* renamed from: a */
    public void m16740a(C3797p.Ucc ucc, boolean z) {
        this.f24681a.getClass();
        if (!C3405l3.m16361i()) {
            ucc.onError("Main API key is not activated");
            return;
        }
        ((C3581rn) this.f24682b).execute(new g(ucc, z));
    }

    /* renamed from: a */
    public void m16738a(Context context, Map<String, Object> map) {
        this.f24684d.mo14391a(context);
        ((C3581rn) this.f24682b).execute(new h(context, map));
    }
}
