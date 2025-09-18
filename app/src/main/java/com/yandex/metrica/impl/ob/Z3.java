package com.yandex.metrica.impl.ob;

import android.content.Context;
import android.os.Bundle;
import android.os.ResultReceiver;
import com.yandex.metrica.impl.ob.X3;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public class Z3 implements InterfaceC2843j4, Li, InterfaceC2893l4 {
    private final Context a;
    private final C2669c4 b;
    private final Fi c;
    private final Si d;
    private final C3172w4 e;
    private final C2727ec f;
    private final C2820i5<AbstractC2795h5, Z3> g;
    private final Q2<Z3> h;
    private final C2694d4 j;
    private C2905lg k;
    private final V l;
    private final Wg m;
    private List<C2741f1> i = new ArrayList();
    private final Object n = new Object();

    public class a implements Eg {
        final /* synthetic */ ResultReceiver a;

        public a(Z3 z3, ResultReceiver resultReceiver) {
            this.a = resultReceiver;
        }

        @Override // com.yandex.metrica.impl.ob.Eg
        public void a(Fg fg) {
            ResultReceiver resultReceiver = this.a;
            int i = Gg.b;
            if (resultReceiver != null) {
                Bundle bundle = new Bundle();
                bundle.putByteArray("referrer", fg == null ? null : fg.a());
                resultReceiver.send(1, bundle);
            }
        }
    }

    public Z3(Context context, Fi fi, C2669c4 c2669c4, X3 x3, C3172w4 c3172w4, Ug ug, C2694d4 c2694d4, C2644b4 c2644b4, W w, C2727ec c2727ec, Wg wg) {
        Context applicationContext = context.getApplicationContext();
        this.a = applicationContext;
        this.b = c2669c4;
        this.c = fi;
        this.e = c3172w4;
        this.j = c2694d4;
        this.g = c2644b4.a(this);
        Si siA = fi.a(applicationContext, c2669c4, x3.a);
        this.d = siA;
        this.f = c2727ec;
        c2727ec.a(applicationContext, siA.c());
        this.l = w.a(siA, c2727ec, applicationContext);
        this.h = c2644b4.a(this, siA);
        this.m = wg;
        fi.a(c2669c4, this);
    }

    public void a(X3.a aVar) {
        this.e.a(aVar);
    }

    public synchronized void b(H4 h4) {
        this.j.b(h4);
    }

    public synchronized void a(H4 h4) {
        this.j.a(h4);
        h4.a(this.l.a(C3240ym.a(this.d.c().w())));
    }

    public Context b() {
        return this.a;
    }

    public void a(C2864k0 c2864k0, H4 h4) {
        this.g.a(c2864k0, h4);
    }

    public X3.a a() {
        return this.e.a();
    }

    @Override // com.yandex.metrica.impl.ob.Li
    public void a(Qi qi) {
        this.f.a(qi);
        synchronized (this.n) {
            try {
                Iterator<E4> it = this.j.a().iterator();
                while (it.hasNext()) {
                    ((T) it.next()).a(this.l.a(C3240ym.a(qi.w())));
                }
                ArrayList arrayList = new ArrayList();
                for (C2741f1 c2741f1 : this.i) {
                    if (c2741f1.a(qi)) {
                        a(c2741f1.c(), c2741f1.a());
                    } else {
                        arrayList.add(c2741f1);
                    }
                }
                this.i = new ArrayList(arrayList);
                if (!arrayList.isEmpty()) {
                    this.h.d();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (this.k == null) {
            this.k = P0.i().n();
        }
        this.k.a(qi);
    }

    @Override // com.yandex.metrica.impl.ob.Li
    public void a(Hi hi, Qi qi) {
        synchronized (this.n) {
            try {
                for (C2741f1 c2741f1 : this.i) {
                    ResultReceiver resultReceiverC = c2741f1.c();
                    U uA = this.l.a(c2741f1.a());
                    int i = ResultReceiverC2939n0.b;
                    if (resultReceiverC != null) {
                        Bundle bundle = new Bundle();
                        hi.a(bundle);
                        uA.c(bundle);
                        resultReceiverC.send(2, bundle);
                    }
                }
                this.i.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void a(C2741f1 c2741f1) {
        ResultReceiver resultReceiverC;
        Map<String, String> mapA;
        List<String> listB;
        HashMap map = new HashMap();
        if (c2741f1 != null) {
            listB = c2741f1.b();
            resultReceiverC = c2741f1.c();
            mapA = c2741f1.a();
        } else {
            resultReceiverC = null;
            mapA = map;
            listB = null;
        }
        boolean zA = this.d.a(listB, mapA);
        if (!zA) {
            a(resultReceiverC, mapA);
        }
        if (!this.d.d()) {
            if (zA) {
                a(resultReceiverC, mapA);
                return;
            }
            return;
        }
        synchronized (this.n) {
            if (zA && c2741f1 != null) {
                try {
                    this.i.add(c2741f1);
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        this.h.d();
    }

    public void a(ResultReceiver resultReceiver) {
        this.m.a(new a(this, resultReceiver));
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC2893l4
    public void a(X3 x3) {
        this.d.a(x3.a);
        this.e.a(x3.b);
    }

    private void a(ResultReceiver resultReceiver, Map<String, String> map) {
        U uA = this.l.a(map);
        int i = ResultReceiverC2939n0.b;
        if (resultReceiver != null) {
            Bundle bundle = new Bundle();
            uA.c(bundle);
            resultReceiver.send(1, bundle);
        }
    }
}
