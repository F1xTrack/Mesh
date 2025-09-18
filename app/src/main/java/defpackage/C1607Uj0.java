package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: Uj0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1607Uj0 {
    public final M71 a;
    public final R71 b;
    public final InterfaceC1451Sj0 c;
    public final CopyOnWriteArraySet d;
    public final ArrayDeque e;
    public final ArrayDeque f;
    public final Object g;
    public boolean h;
    public final boolean i;

    public C1607Uj0(Looper looper, M71 m71, InterfaceC1451Sj0 interfaceC1451Sj0) {
        this(new CopyOnWriteArraySet(), looper, m71, interfaceC1451Sj0, true);
    }

    public final void a(Object obj) {
        obj.getClass();
        synchronized (this.g) {
            try {
                if (this.h) {
                    return;
                }
                this.d.add(new C1529Tj0(obj));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b() {
        g();
        ArrayDeque arrayDeque = this.f;
        if (arrayDeque.isEmpty()) {
            return;
        }
        R71 r71 = this.b;
        if (!r71.a.hasMessages(1)) {
            r71.getClass();
            Q71 q71B = R71.b();
            q71B.a = r71.a.obtainMessage(1);
            r71.getClass();
            Message message = q71B.a;
            message.getClass();
            r71.a.sendMessageAtFrontOfQueue(message);
            q71B.a();
        }
        ArrayDeque arrayDeque2 = this.e;
        boolean zIsEmpty = arrayDeque2.isEmpty();
        arrayDeque2.addAll(arrayDeque);
        arrayDeque.clear();
        if (zIsEmpty) {
            while (!arrayDeque2.isEmpty()) {
                ((Runnable) arrayDeque2.peekFirst()).run();
                arrayDeque2.removeFirst();
            }
        }
    }

    public final void c(int i, InterfaceC1373Rj0 interfaceC1373Rj0) {
        g();
        this.f.add(new RunnableC6690qf(new CopyOnWriteArraySet(this.d), i, interfaceC1373Rj0, 10));
    }

    public final void d() {
        g();
        synchronized (this.g) {
            this.h = true;
        }
        Iterator it = this.d.iterator();
        while (it.hasNext()) {
            C1529Tj0 c1529Tj0 = (C1529Tj0) it.next();
            InterfaceC1451Sj0 interfaceC1451Sj0 = this.c;
            c1529Tj0.d = true;
            if (c1529Tj0.c) {
                c1529Tj0.c = false;
                interfaceC1451Sj0.f(c1529Tj0.a, c1529Tj0.b.g());
            }
        }
        this.d.clear();
    }

    public final void e(Object obj) {
        g();
        CopyOnWriteArraySet copyOnWriteArraySet = this.d;
        Iterator it = copyOnWriteArraySet.iterator();
        while (it.hasNext()) {
            C1529Tj0 c1529Tj0 = (C1529Tj0) it.next();
            if (c1529Tj0.a.equals(obj)) {
                c1529Tj0.d = true;
                if (c1529Tj0.c) {
                    c1529Tj0.c = false;
                    VV vvG = c1529Tj0.b.g();
                    this.c.f(c1529Tj0.a, vvG);
                }
                copyOnWriteArraySet.remove(c1529Tj0);
            }
        }
    }

    public final void f(int i, InterfaceC1373Rj0 interfaceC1373Rj0) {
        c(i, interfaceC1373Rj0);
        b();
    }

    public final void g() {
        if (this.i) {
            YN1.f(Thread.currentThread() == this.b.a.getLooper().getThread());
        }
    }

    public C1607Uj0(CopyOnWriteArraySet copyOnWriteArraySet, Looper looper, M71 m71, InterfaceC1451Sj0 interfaceC1451Sj0, boolean z) {
        this.a = m71;
        this.d = copyOnWriteArraySet;
        this.c = interfaceC1451Sj0;
        this.g = new Object();
        this.e = new ArrayDeque();
        this.f = new ArrayDeque();
        this.b = m71.a(looper, new Handler.Callback() { // from class: Qj0
            @Override // android.os.Handler.Callback
            public final boolean handleMessage(Message message) {
                C1607Uj0 c1607Uj0 = this.a;
                Iterator it = c1607Uj0.d.iterator();
                while (it.hasNext()) {
                    C1529Tj0 c1529Tj0 = (C1529Tj0) it.next();
                    if (!c1529Tj0.d && c1529Tj0.c) {
                        VV vvG = c1529Tj0.b.g();
                        c1529Tj0.b = new C1135Oi(4);
                        c1529Tj0.c = false;
                        c1607Uj0.c.f(c1529Tj0.a, vvG);
                    }
                    if (c1607Uj0.b.a.hasMessages(1)) {
                        break;
                    }
                }
                return true;
            }
        });
        this.i = z;
    }
}
