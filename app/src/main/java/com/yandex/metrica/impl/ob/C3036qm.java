package com.yandex.metrica.impl.ob;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.yandex.metrica.impl.ob.qm, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C3036qm<T> {
    private T a;
    private final InterfaceExecutorC3086sn b;
    private final List<Y1<T>> c = new ArrayList();

    /* renamed from: com.yandex.metrica.impl.ob.qm$a */
    public class a implements Runnable {
        final /* synthetic */ Y1 a;

        public a(Y1 y1) {
            this.a = y1;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.lang.Runnable
        public void run() {
            synchronized (C3036qm.this) {
                try {
                    Object obj = C3036qm.this.a;
                    if (obj == null) {
                        C3036qm.this.c.add(this.a);
                    } else {
                        this.a.b(obj);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public C3036qm(InterfaceExecutorC3086sn interfaceExecutorC3086sn) {
        this.b = interfaceExecutorC3086sn;
    }

    public void a(Y1<T> y1) {
        ((C3061rn) this.b).execute(new a(y1));
    }

    public synchronized void a(T t) {
        try {
            this.a = t;
            Iterator<Y1<T>> it = this.c.iterator();
            while (it.hasNext()) {
                it.next().b(t);
            }
            this.c.clear();
        } catch (Throwable th) {
            throw th;
        }
    }
}
