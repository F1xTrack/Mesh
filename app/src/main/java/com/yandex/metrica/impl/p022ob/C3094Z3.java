package com.yandex.metrica.impl.p022ob;

import android.content.Context;
import android.os.Bundle;
import android.os.ResultReceiver;
import com.yandex.metrica.impl.p022ob.C3044X3;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: com.yandex.metrica.impl.ob.Z3 */
/* loaded from: classes2.dex */
public class C3094Z3 implements InterfaceC3354j4, InterfaceC2760Li, InterfaceC3406l4 {

    /* renamed from: a */
    private final Context f22914a;

    /* renamed from: b */
    private final C3172c4 f22915b;

    /* renamed from: c */
    private final C2610Fi f22916c;

    /* renamed from: d */
    private final C2934Si f22917d;

    /* renamed from: e */
    private final C3692w4 f22918e;

    /* renamed from: f */
    private final C3232ec f22919f;

    /* renamed from: g */
    private final C3329i5<AbstractC3303h5, C3094Z3> f22920g;

    /* renamed from: h */
    private final C2869Q2<C3094Z3> f22921h;

    /* renamed from: j */
    private final C3198d4 f22923j;

    /* renamed from: k */
    private C3418lg f22924k;

    /* renamed from: l */
    private final C2990V f22925l;

    /* renamed from: m */
    private final C3032Wg f22926m;

    /* renamed from: i */
    private List<C3247f1> f22922i = new ArrayList();

    /* renamed from: n */
    private final Object f22927n = new Object();

    /* renamed from: com.yandex.metrica.impl.ob.Z3$a */
    public class a implements InterfaceC2583Eg {

        /* renamed from: a */
        final /* synthetic */ ResultReceiver f22928a;

        public a(C3094Z3 c3094z3, ResultReceiver resultReceiver) {
            this.f22928a = resultReceiver;
        }

        @Override // com.yandex.metrica.impl.p022ob.InterfaceC2583Eg
        /* renamed from: a */
        public void mo14002a(C2608Fg c2608Fg) {
            ResultReceiver resultReceiver = this.f22928a;
            int i = ResultReceiverC2633Gg.f21315b;
            if (resultReceiver != null) {
                Bundle bundle = new Bundle();
                bundle.putByteArray("referrer", c2608Fg == null ? null : c2608Fg.m14134a());
                resultReceiver.send(1, bundle);
            }
        }
    }

    public C3094Z3(Context context, C2610Fi c2610Fi, C3172c4 c3172c4, C3044X3 c3044x3, C3692w4 c3692w4, C2982Ug c2982Ug, C3198d4 c3198d4, C3146b4 c3146b4, C3015W c3015w, C3232ec c3232ec, C3032Wg c3032Wg) {
        Context applicationContext = context.getApplicationContext();
        this.f22914a = applicationContext;
        this.f22915b = c3172c4;
        this.f22916c = c2610Fi;
        this.f22918e = c3692w4;
        this.f22923j = c3198d4;
        this.f22920g = c3146b4.m15678a(this);
        C2934Si c2934SiM14139a = c2610Fi.m14139a(applicationContext, c3172c4, c3044x3.f22748a);
        this.f22917d = c2934SiM14139a;
        this.f22919f = c3232ec;
        c3232ec.m15840a(applicationContext, c2934SiM14139a.m15135c());
        this.f22925l = c3015w.m15381a(c2934SiM14139a, c3232ec, applicationContext);
        this.f22921h = c3146b4.m15677a(this, c2934SiM14139a);
        this.f22926m = c3032Wg;
        c2610Fi.m14140a(c3172c4, this);
    }

    /* renamed from: a */
    public void m15530a(C3044X3.a aVar) {
        this.f22918e.m17117a(aVar);
    }

    /* renamed from: b */
    public synchronized void m15535b(C2646H4 c2646h4) {
        this.f22923j.m15739b(c2646h4);
    }

    /* renamed from: a */
    public synchronized void m15529a(C2646H4 c2646h4) {
        this.f22923j.m15738a(c2646h4);
        c2646h4.mo14218a(this.f22925l.m15291a(C3762ym.m17274a(this.f22917d.m15135c().m14897w())));
    }

    /* renamed from: b */
    public Context m15534b() {
        return this.f22914a;
    }

    /* renamed from: a */
    public void m15533a(C3376k0 c3376k0, C2646H4 c2646h4) {
        this.f22920g.m16082a(c3376k0, c2646h4);
    }

    /* renamed from: a */
    public C3044X3.a m15527a() {
        return this.f22918e.m17116a();
    }

    @Override // com.yandex.metrica.impl.p022ob.InterfaceC2760Li
    /* renamed from: a */
    public void mo14544a(C2885Qi c2885Qi) {
        this.f22919f.m15841a(c2885Qi);
        synchronized (this.f22927n) {
            try {
                Iterator<InterfaceC2571E4> it = this.f22923j.m15737a().iterator();
                while (it.hasNext()) {
                    ((InterfaceC2940T) it.next()).mo14218a(this.f22925l.m15291a(C3762ym.m17274a(c2885Qi.m14897w())));
                }
                ArrayList arrayList = new ArrayList();
                for (C3247f1 c3247f1 : this.f22922i) {
                    if (c3247f1.m15868a(c2885Qi)) {
                        m15526a(c3247f1.m15870c(), c3247f1.m15867a());
                    } else {
                        arrayList.add(c3247f1);
                    }
                }
                this.f22922i = new ArrayList(arrayList);
                if (!arrayList.isEmpty()) {
                    this.f22921h.m14809d();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (this.f22924k == null) {
            this.f22924k = C2842P0.m14728i().m14743n();
        }
        this.f22924k.m16400a(c2885Qi);
    }

    @Override // com.yandex.metrica.impl.p022ob.InterfaceC2760Li
    /* renamed from: a */
    public void mo14543a(EnumC2660Hi enumC2660Hi, C2885Qi c2885Qi) {
        synchronized (this.f22927n) {
            try {
                for (C3247f1 c3247f1 : this.f22922i) {
                    ResultReceiver resultReceiverM15870c = c3247f1.m15870c();
                    C2965U c2965uM15291a = this.f22925l.m15291a(c3247f1.m15867a());
                    int i = ResultReceiverC3454n0.f24272b;
                    if (resultReceiverM15870c != null) {
                        Bundle bundle = new Bundle();
                        enumC2660Hi.m14265a(bundle);
                        c2965uM15291a.m15212c(bundle);
                        resultReceiverM15870c.send(2, bundle);
                    }
                }
                this.f22922i.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: a */
    public void m15532a(C3247f1 c3247f1) {
        ResultReceiver resultReceiverM15870c;
        Map<String, String> mapM15867a;
        List<String> listM15869b;
        HashMap map = new HashMap();
        if (c3247f1 != null) {
            listM15869b = c3247f1.m15869b();
            resultReceiverM15870c = c3247f1.m15870c();
            mapM15867a = c3247f1.m15867a();
        } else {
            resultReceiverM15870c = null;
            mapM15867a = map;
            listM15869b = null;
        }
        boolean zM15133a = this.f22917d.m15133a(listM15869b, mapM15867a);
        if (!zM15133a) {
            m15526a(resultReceiverM15870c, mapM15867a);
        }
        if (!this.f22917d.m15136d()) {
            if (zM15133a) {
                m15526a(resultReceiverM15870c, mapM15867a);
                return;
            }
            return;
        }
        synchronized (this.f22927n) {
            if (zM15133a && c3247f1 != null) {
                try {
                    this.f22922i.add(c3247f1);
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        this.f22921h.m14809d();
    }

    /* renamed from: a */
    public void m15528a(ResultReceiver resultReceiver) {
        this.f22926m.m15392a(new a(this, resultReceiver));
    }

    @Override // com.yandex.metrica.impl.p022ob.InterfaceC3406l4
    /* renamed from: a */
    public void mo15531a(C3044X3 c3044x3) {
        this.f22917d.m15131a(c3044x3.f22748a);
        this.f22918e.m17117a(c3044x3.f22749b);
    }

    /* renamed from: a */
    private void m15526a(ResultReceiver resultReceiver, Map<String, String> map) {
        C2965U c2965uM15291a = this.f22925l.m15291a(map);
        int i = ResultReceiverC3454n0.f24272b;
        if (resultReceiver != null) {
            Bundle bundle = new Bundle();
            c2965uM15291a.m15212c(bundle);
            resultReceiver.send(1, bundle);
        }
    }
}
