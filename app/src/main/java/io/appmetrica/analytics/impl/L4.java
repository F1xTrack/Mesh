package io.appmetrica.analytics.impl;

import android.content.Context;
import android.os.ResultReceiver;
import io.appmetrica.analytics.internal.CounterConfigurationReporterType;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public final class L4 implements Ba, Rk, Da {
    public final Context a;
    public final Z4 b;
    public final Cl c;
    public final Tg d;
    public final S e;
    public final S4 f;
    public final C4631im g;
    public ArrayList h;
    public final C4419a5 i;
    public final Cf j;
    public final C4614i4 k;
    public final Hf l;
    public final Object m;

    public L4(Context context, Ik ik, Z4 z4, D4 d4, Cf cf) {
        this(context, ik, z4, d4, new Tg(d4.b), cf, new C4419a5(), new N4(), new S(new Q(), new N(), new L(), C4667ka.h().u().a(), "ServicePublic"), new Hf());
    }

    @Override // io.appmetrica.analytics.impl.Ba
    public final void a(C4 c4) {
        Tg tg = this.d;
        tg.a = tg.a.mergeFrom(c4);
    }

    public final synchronized void b(I4 i4) {
        this.i.a.remove(i4);
    }

    @Override // io.appmetrica.analytics.impl.Ba
    public final CounterConfigurationReporterType c() {
        return CounterConfigurationReporterType.COMMUTATION;
    }

    public final C4 d() {
        return this.d.a;
    }

    public final Cf e() {
        return this.j;
    }

    @Override // io.appmetrica.analytics.impl.Ba
    public final Context getContext() {
        return this.a;
    }

    public L4(Context context, Ik ik, Z4 z4, D4 d4, Tg tg, Cf cf, C4419a5 c4419a5, N4 n4, S s, Hf hf) {
        this.h = new ArrayList();
        this.m = new Object();
        Context applicationContext = context.getApplicationContext();
        this.a = applicationContext;
        this.b = z4;
        this.d = tg;
        this.i = c4419a5;
        this.f = N4.a(this);
        Cl clA = ik.a(applicationContext, z4, d4.a);
        this.c = clA;
        this.e = s;
        s.a(applicationContext, clA.e());
        this.k = AbstractC4637j4.a(clA, s, applicationContext);
        this.g = n4.a(this, clA);
        this.j = cf;
        this.l = hf;
        ik.a(z4, this);
    }

    public final synchronized void a(I4 i4) {
        this.i.a.add(i4);
        B6.a(i4.c, this.k.a(Hl.a(this.c.e().l)));
    }

    @Override // io.appmetrica.analytics.impl.Ba
    public final Z4 b() {
        return this.b;
    }

    public final void a(T5 t5, I4 i4) {
        S4 s4 = this.f;
        s4.getClass();
        s4.a(t5, new R4(i4));
    }

    @Override // io.appmetrica.analytics.impl.Rk
    public final void a(C4583gl c4583gl) {
        this.e.c = c4583gl;
        synchronized (this.m) {
            try {
                Iterator it = this.i.a.iterator();
                while (it.hasNext()) {
                    I4 i4 = (I4) it.next();
                    B6.a(i4.c, this.k.a(Hl.a(c4583gl.l)));
                }
                ArrayList arrayList = new ArrayList();
                Iterator it2 = this.h.iterator();
                while (it2.hasNext()) {
                    Ua ua = (Ua) it2.next();
                    if (AbstractC4510dl.a(c4583gl, ua.b, ua.c, new Sa())) {
                        B6.a(ua.a, this.k.a(ua.c));
                    } else {
                        arrayList.add(ua);
                    }
                }
                this.h = new ArrayList(arrayList);
                if (!arrayList.isEmpty()) {
                    this.g.b();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // io.appmetrica.analytics.impl.Rk
    public final void a(Kk kk, C4583gl c4583gl) {
        synchronized (this.m) {
            try {
                Iterator it = this.h.iterator();
                while (it.hasNext()) {
                    Ua ua = (Ua) it.next();
                    B6.a(ua.a, kk, this.k.a(ua.c));
                }
                this.h.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void a(Ua ua) {
        ResultReceiver resultReceiver;
        HashMap map;
        List<String> list;
        HashMap map2 = new HashMap();
        if (ua != null) {
            list = ua.b;
            resultReceiver = ua.a;
            map = ua.c;
        } else {
            resultReceiver = null;
            map = map2;
            list = null;
        }
        boolean zA = this.c.a(list, map);
        if (!zA) {
            B6.a(resultReceiver, this.k.a(map));
        }
        if (!this.c.g()) {
            if (zA) {
                B6.a(resultReceiver, this.k.a(map));
                return;
            }
            return;
        }
        synchronized (this.m) {
            if (zA && ua != null) {
                try {
                    this.h.add(ua);
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        this.g.b();
    }

    public final void a(ResultReceiver resultReceiver) {
        this.l.a(new K4(resultReceiver));
    }

    public final C4614i4 a() {
        return this.k;
    }

    @Override // io.appmetrica.analytics.impl.Da
    public final void a(D4 d4) {
        this.c.a(d4.a);
        a(d4.b);
    }
}
