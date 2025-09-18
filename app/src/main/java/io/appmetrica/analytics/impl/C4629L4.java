package io.appmetrica.analytics.impl;

import android.content.Context;
import android.os.ResultReceiver;
import io.appmetrica.analytics.internal.CounterConfigurationReporterType;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* renamed from: io.appmetrica.analytics.impl.L4 */
/* loaded from: classes2.dex */
public final class C4629L4 implements InterfaceC4392Ba, InterfaceC4788Rk, InterfaceC4442Da {

    /* renamed from: a */
    public final Context f30418a;

    /* renamed from: b */
    public final C4964Z4 f30419b;

    /* renamed from: c */
    public final C4428Cl f30420c;

    /* renamed from: d */
    public final C4832Tg f30421d;

    /* renamed from: e */
    public final C4791S f30422e;

    /* renamed from: f */
    public final C4796S4 f30423f;

    /* renamed from: g */
    public final C5206im f30424g;

    /* renamed from: h */
    public ArrayList f30425h;

    /* renamed from: i */
    public final C4989a5 f30426i;

    /* renamed from: j */
    public final C4422Cf f30427j;

    /* renamed from: k */
    public final C5188i4 f30428k;

    /* renamed from: l */
    public final C4544Hf f30429l;

    /* renamed from: m */
    public final Object f30430m;

    public C4629L4(Context context, C4573Ik c4573Ik, C4964Z4 c4964z4, C4436D4 c4436d4, C4422Cf c4422Cf) {
        this(context, c4573Ik, c4964z4, c4436d4, new C4832Tg(c4436d4.f29994b), c4422Cf, new C4989a5(), new C4677N4(), new C4791S(new C4744Q(), new C4672N(), new C4624L(), C5244ka.m20614h().m20636u().m21138a(), "ServicePublic"), new C4544Hf());
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC4392Ba
    /* renamed from: a */
    public final void mo19228a(C4411C4 c4411c4) {
        C4832Tg c4832Tg = this.f30421d;
        c4832Tg.f30787a = c4832Tg.f30787a.mergeFrom(c4411c4);
    }

    /* renamed from: b */
    public final synchronized void m19575b(C4557I4 c4557i4) {
        this.f30426i.f31241a.remove(c4557i4);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC4392Ba
    /* renamed from: c */
    public final CounterConfigurationReporterType mo19230c() {
        return CounterConfigurationReporterType.COMMUTATION;
    }

    /* renamed from: d */
    public final C4411C4 m19576d() {
        return this.f30421d.f30787a;
    }

    /* renamed from: e */
    public final C4422Cf m19577e() {
        return this.f30427j;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC4392Ba
    public final Context getContext() {
        return this.f30418a;
    }

    public C4629L4(Context context, C4573Ik c4573Ik, C4964Z4 c4964z4, C4436D4 c4436d4, C4832Tg c4832Tg, C4422Cf c4422Cf, C4989a5 c4989a5, C4677N4 c4677n4, C4791S c4791s, C4544Hf c4544Hf) {
        this.f30425h = new ArrayList();
        this.f30430m = new Object();
        Context applicationContext = context.getApplicationContext();
        this.f30418a = applicationContext;
        this.f30419b = c4964z4;
        this.f30421d = c4832Tg;
        this.f30426i = c4989a5;
        this.f30423f = C4677N4.m19652a(this);
        C4428Cl c4428ClM19517a = c4573Ik.m19517a(applicationContext, c4964z4, c4436d4.f29993a);
        this.f30420c = c4428ClM19517a;
        this.f30422e = c4791s;
        c4791s.mo19793a(applicationContext, c4428ClM19517a.m19299e());
        this.f30428k = AbstractC5213j4.m20586a(c4428ClM19517a, c4791s, applicationContext);
        this.f30424g = c4677n4.m19653a(this, c4428ClM19517a);
        this.f30427j = c4422Cf;
        this.f30429l = c4544Hf;
        c4573Ik.m19518a(c4964z4, this);
    }

    /* renamed from: a */
    public final synchronized void m19570a(C4557I4 c4557i4) {
        this.f30426i.f31241a.add(c4557i4);
        ResultReceiverC4388B6.m19226a(c4557i4.f30271c, this.f30428k.m20564a(AbstractC4550Hl.m19476a(this.f30420c.m19299e().f31793l)));
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC4392Ba
    /* renamed from: b */
    public final C4964Z4 mo19229b() {
        return this.f30419b;
    }

    /* renamed from: a */
    public final void m19572a(C4821T5 c4821t5, C4557I4 c4557i4) {
        C4796S4 c4796s4 = this.f30423f;
        c4796s4.getClass();
        c4796s4.m19645a(c4821t5, new C4772R4(c4557i4));
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC4788Rk
    /* renamed from: a */
    public final void mo19574a(C5155gl c5155gl) {
        this.f30422e.f30708c = c5155gl;
        synchronized (this.f30430m) {
            try {
                Iterator it = this.f30426i.f31241a.iterator();
                while (it.hasNext()) {
                    C4557I4 c4557i4 = (C4557I4) it.next();
                    ResultReceiverC4388B6.m19226a(c4557i4.f30271c, this.f30428k.m20564a(AbstractC4550Hl.m19476a(c5155gl.f31793l)));
                }
                ArrayList arrayList = new ArrayList();
                Iterator it2 = this.f30425h.iterator();
                while (it2.hasNext()) {
                    C4850Ua c4850Ua = (C4850Ua) it2.next();
                    if (AbstractC5080dl.m20291a(c5155gl, c4850Ua.f30806b, c4850Ua.f30807c, new C4802Sa())) {
                        ResultReceiverC4388B6.m19226a(c4850Ua.f30805a, this.f30428k.m20564a(c4850Ua.f30807c));
                    } else {
                        arrayList.add(c4850Ua);
                    }
                }
                this.f30425h = new ArrayList(arrayList);
                if (!arrayList.isEmpty()) {
                    this.f30424g.m20582b();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC4788Rk
    /* renamed from: a */
    public final void mo19571a(EnumC4621Kk enumC4621Kk, C5155gl c5155gl) {
        synchronized (this.f30430m) {
            try {
                Iterator it = this.f30425h.iterator();
                while (it.hasNext()) {
                    C4850Ua c4850Ua = (C4850Ua) it.next();
                    ResultReceiverC4388B6.m19225a(c4850Ua.f30805a, enumC4621Kk, this.f30428k.m20564a(c4850Ua.f30807c));
                }
                this.f30425h.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: a */
    public final void m19573a(C4850Ua c4850Ua) {
        ResultReceiver resultReceiver;
        HashMap map;
        List<String> list;
        HashMap map2 = new HashMap();
        if (c4850Ua != null) {
            list = c4850Ua.f30806b;
            resultReceiver = c4850Ua.f30805a;
            map = c4850Ua.f30807c;
        } else {
            resultReceiver = null;
            map = map2;
            list = null;
        }
        boolean zM19294a = this.f30420c.m19294a(list, map);
        if (!zM19294a) {
            ResultReceiverC4388B6.m19226a(resultReceiver, this.f30428k.m20564a(map));
        }
        if (!this.f30420c.m19301g()) {
            if (zM19294a) {
                ResultReceiverC4388B6.m19226a(resultReceiver, this.f30428k.m20564a(map));
                return;
            }
            return;
        }
        synchronized (this.f30430m) {
            if (zM19294a && c4850Ua != null) {
                try {
                    this.f30425h.add(c4850Ua);
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        this.f30424g.m20582b();
    }

    /* renamed from: a */
    public final void m19569a(ResultReceiver resultReceiver) {
        this.f30429l.m19474a(new C4605K4(resultReceiver));
    }

    /* renamed from: a */
    public final C5188i4 m19568a() {
        return this.f30428k;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC4442Da
    /* renamed from: a */
    public final void mo19322a(C4436D4 c4436d4) {
        this.f30420c.m19291a(c4436d4.f29993a);
        mo19228a(c4436d4.f29994b);
    }
}
