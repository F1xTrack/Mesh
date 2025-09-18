package com.yandex.metrica.impl.ob;

import android.content.Context;
import com.yandex.metrica.impl.ob.X3;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.yandex.metrica.impl.ob.r4, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C3042r4 implements Li, InterfaceC2893l4 {
    private final Context a;
    private final C2669c4 b;
    private final I4<InterfaceC2918m4> c;
    private final Si d;
    private final C3172w4 e;
    private InterfaceC2918m4 f;
    private InterfaceC2868k4 g;
    private List<Li> h = new ArrayList();
    private final C2694d4 i;

    public C3042r4(Context context, C2669c4 c2669c4, X3 x3, C3172w4 c3172w4, I4<InterfaceC2918m4> i4, C2694d4 c2694d4, Fi fi) {
        this.a = context;
        this.b = c2669c4;
        this.e = c3172w4;
        this.c = i4;
        this.i = c2694d4;
        this.d = fi.a(context, c2669c4, x3.a);
        fi.a(c2669c4, this);
    }

    public void a(C2864k0 c2864k0, X3 x3) {
        InterfaceC2918m4 interfaceC2918m4A;
        ((T4) a()).b();
        if (J0.a(c2864k0.n())) {
            interfaceC2918m4A = a();
        } else {
            if (this.f == null) {
                synchronized (this) {
                    InterfaceC2918m4 interfaceC2918m4A2 = this.c.a(this.a, this.b, this.e.a(), this.d);
                    this.f = interfaceC2918m4A2;
                    this.h.add(interfaceC2918m4A2);
                }
            }
            interfaceC2918m4A = this.f;
        }
        if (!J0.b(c2864k0.n())) {
            X3.a aVar = x3.b;
            synchronized (this) {
                try {
                    this.e.a(aVar);
                    InterfaceC2868k4 interfaceC2868k4 = this.g;
                    if (interfaceC2868k4 != null) {
                        ((T4) interfaceC2868k4).a(aVar);
                    }
                    InterfaceC2918m4 interfaceC2918m4 = this.f;
                    if (interfaceC2918m4 != null) {
                        interfaceC2918m4.a(aVar);
                    }
                } finally {
                }
            }
        }
        interfaceC2918m4A.a(c2864k0);
    }

    public synchronized void b(E4 e4) {
        this.i.b(e4);
    }

    public synchronized void a(E4 e4) {
        this.i.a(e4);
    }

    private InterfaceC2868k4 a() {
        if (this.g == null) {
            synchronized (this) {
                InterfaceC2868k4 interfaceC2868k4B = this.c.b(this.a, this.b, this.e.a(), this.d);
                this.g = interfaceC2868k4B;
                this.h.add(interfaceC2868k4B);
            }
        }
        return this.g;
    }

    @Override // com.yandex.metrica.impl.ob.Li
    public synchronized void a(Qi qi) {
        Iterator<Li> it = this.h.iterator();
        while (it.hasNext()) {
            it.next().a(qi);
        }
    }

    @Override // com.yandex.metrica.impl.ob.Li
    public synchronized void a(Hi hi, Qi qi) {
        Iterator<Li> it = this.h.iterator();
        while (it.hasNext()) {
            it.next().a(hi, qi);
        }
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC2893l4
    public void a(X3 x3) {
        this.d.a(x3.a);
        X3.a aVar = x3.b;
        synchronized (this) {
            try {
                this.e.a(aVar);
                InterfaceC2868k4 interfaceC2868k4 = this.g;
                if (interfaceC2868k4 != null) {
                    ((T4) interfaceC2868k4).a(aVar);
                }
                InterfaceC2918m4 interfaceC2918m4 = this.f;
                if (interfaceC2918m4 != null) {
                    interfaceC2918m4.a(aVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
