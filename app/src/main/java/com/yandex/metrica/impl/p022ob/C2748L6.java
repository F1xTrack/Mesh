package com.yandex.metrica.impl.p022ob;

import com.yandex.metrica.impl.p022ob.C2798N6;

/* renamed from: com.yandex.metrica.impl.ob.L6 */
/* loaded from: classes2.dex */
public class C2748L6 {

    /* renamed from: a */
    private final InterfaceExecutorC3607sn f21617a;

    /* renamed from: b */
    private final InterfaceC2648H6 f21618b;

    /* renamed from: com.yandex.metrica.impl.ob.L6$a */
    public class a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ b f21619a;

        public a(C2748L6 c2748l6, b bVar) {
            this.f21619a = bVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                C2798N6.a aVar = (C2798N6.a) this.f21619a;
                C2798N6.this.f21765c.m14602a();
                C2798N6 c2798n6 = C2798N6.this;
                InterfaceC2823O6 interfaceC2823O6 = aVar.f21768a;
                c2798n6.getClass();
                if (interfaceC2823O6 != null) {
                    interfaceC2823O6.mo14694a();
                }
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.L6$b */
    public interface b {
    }

    public C2748L6(InterfaceExecutorC3607sn interfaceExecutorC3607sn, InterfaceC2648H6 interfaceC2648H6) {
        this.f21617a = interfaceExecutorC3607sn;
        this.f21618b = interfaceC2648H6;
    }

    /* renamed from: a */
    public void m14508a(long j, b bVar) {
        ((C3581rn) this.f21617a).m16704a(new a(this, bVar), j);
    }

    /* renamed from: a */
    public void m14509a(long j, boolean z) {
        this.f21618b.mo13983a(j, z);
    }

    /* renamed from: a */
    public void m14507a() {
        this.f21618b.mo13982a();
    }
}
