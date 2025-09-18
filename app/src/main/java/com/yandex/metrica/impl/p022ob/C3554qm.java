package com.yandex.metrica.impl.p022ob;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.yandex.metrica.impl.ob.qm */
/* loaded from: classes2.dex */
public class C3554qm<T> {

    /* renamed from: a */
    private T f24558a;

    /* renamed from: b */
    private final InterfaceExecutorC3607sn f24559b;

    /* renamed from: c */
    private final List<InterfaceC3067Y1<T>> f24560c = new ArrayList();

    /* renamed from: com.yandex.metrica.impl.ob.qm$a */
    public class a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ InterfaceC3067Y1 f24561a;

        public a(InterfaceC3067Y1 interfaceC3067Y1) {
            this.f24561a = interfaceC3067Y1;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.lang.Runnable
        public void run() {
            synchronized (C3554qm.this) {
                try {
                    Object obj = C3554qm.this.f24558a;
                    if (obj == null) {
                        C3554qm.this.f24560c.add(this.f24561a);
                    } else {
                        this.f24561a.mo13945b(obj);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public C3554qm(InterfaceExecutorC3607sn interfaceExecutorC3607sn) {
        this.f24559b = interfaceExecutorC3607sn;
    }

    /* renamed from: a */
    public void m16635a(InterfaceC3067Y1<T> interfaceC3067Y1) {
        ((C3581rn) this.f24559b).execute(new a(interfaceC3067Y1));
    }

    /* renamed from: a */
    public synchronized void m16636a(T t) {
        try {
            this.f24558a = t;
            Iterator<InterfaceC3067Y1<T>> it = this.f24560c.iterator();
            while (it.hasNext()) {
                it.next().mo13945b(t);
            }
            this.f24560c.clear();
        } catch (Throwable th) {
            throw th;
        }
    }
}
