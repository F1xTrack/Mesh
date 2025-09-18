package com.yandex.metrica.impl.ob;

import com.yandex.metrica.impl.ob.N6;

/* loaded from: classes2.dex */
public class L6 {
    private final InterfaceExecutorC3086sn a;
    private final H6 b;

    public class a implements Runnable {
        final /* synthetic */ b a;

        public a(L6 l6, b bVar) {
            this.a = bVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                N6.a aVar = (N6.a) this.a;
                N6.this.c.a();
                N6 n6 = N6.this;
                O6 o6 = aVar.a;
                n6.getClass();
                if (o6 != null) {
                    o6.a();
                }
            } catch (Throwable unused) {
            }
        }
    }

    public interface b {
    }

    public L6(InterfaceExecutorC3086sn interfaceExecutorC3086sn, H6 h6) {
        this.a = interfaceExecutorC3086sn;
        this.b = h6;
    }

    public void a(long j, b bVar) {
        ((C3061rn) this.a).a(new a(this, bVar), j);
    }

    public void a(long j, boolean z) {
        this.b.a(j, z);
    }

    public void a() {
        this.b.a();
    }
}
