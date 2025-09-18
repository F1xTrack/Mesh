package p000;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: Uj0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8372Uj0 {

    /* renamed from: a */
    public final M71 f11998a;

    /* renamed from: b */
    public final R71 f11999b;

    /* renamed from: c */
    public final InterfaceC8268Sj0 f12000c;

    /* renamed from: d */
    public final CopyOnWriteArraySet f12001d;

    /* renamed from: e */
    public final ArrayDeque f12002e;

    /* renamed from: f */
    public final ArrayDeque f12003f;

    /* renamed from: g */
    public final Object f12004g;

    /* renamed from: h */
    public boolean f12005h;

    /* renamed from: i */
    public final boolean f12006i;

    public C8372Uj0(Looper looper, M71 m71, InterfaceC8268Sj0 interfaceC8268Sj0) {
        this(new CopyOnWriteArraySet(), looper, m71, interfaceC8268Sj0, true);
    }

    /* renamed from: a */
    public final void m8129a(Object obj) {
        obj.getClass();
        synchronized (this.f12004g) {
            try {
                if (this.f12005h) {
                    return;
                }
                this.f12001d.add(new C8320Tj0(obj));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: b */
    public final void m8130b() {
        m8135g();
        ArrayDeque arrayDeque = this.f12003f;
        if (arrayDeque.isEmpty()) {
            return;
        }
        R71 r71 = this.f11999b;
        if (!r71.f10020a.hasMessages(1)) {
            r71.getClass();
            Q71 q71M6903b = R71.m6903b();
            q71M6903b.f9486a = r71.f10020a.obtainMessage(1);
            r71.getClass();
            Message message = q71M6903b.f9486a;
            message.getClass();
            r71.f10020a.sendMessageAtFrontOfQueue(message);
            q71M6903b.m6575a();
        }
        ArrayDeque arrayDeque2 = this.f12002e;
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

    /* renamed from: c */
    public final void m8131c(int i, InterfaceC8216Rj0 interfaceC8216Rj0) {
        m8135g();
        this.f12003f.add(new RunnableC6694qf(new CopyOnWriteArraySet(this.f12001d), i, interfaceC8216Rj0, 10));
    }

    /* renamed from: d */
    public final void m8132d() {
        m8135g();
        synchronized (this.f12004g) {
            this.f12005h = true;
        }
        Iterator it = this.f12001d.iterator();
        while (it.hasNext()) {
            C8320Tj0 c8320Tj0 = (C8320Tj0) it.next();
            InterfaceC8268Sj0 interfaceC8268Sj0 = this.f12000c;
            c8320Tj0.f11485d = true;
            if (c8320Tj0.f11484c) {
                c8320Tj0.f11484c = false;
                interfaceC8268Sj0.mo3137f(c8320Tj0.f11482a, c8320Tj0.f11483b.m6121g());
            }
        }
        this.f12001d.clear();
    }

    /* renamed from: e */
    public final void m8133e(Object obj) {
        m8135g();
        CopyOnWriteArraySet copyOnWriteArraySet = this.f12001d;
        Iterator it = copyOnWriteArraySet.iterator();
        while (it.hasNext()) {
            C8320Tj0 c8320Tj0 = (C8320Tj0) it.next();
            if (c8320Tj0.f11482a.equals(obj)) {
                c8320Tj0.f11485d = true;
                if (c8320Tj0.f11484c) {
                    c8320Tj0.f11484c = false;
                    C1353VV c1353vvM6121g = c8320Tj0.f11483b.m6121g();
                    this.f12000c.mo3137f(c8320Tj0.f11482a, c1353vvM6121g);
                }
                copyOnWriteArraySet.remove(c8320Tj0);
            }
        }
    }

    /* renamed from: f */
    public final void m8134f(int i, InterfaceC8216Rj0 interfaceC8216Rj0) {
        m8131c(i, interfaceC8216Rj0);
        m8130b();
    }

    /* renamed from: g */
    public final void m8135g() {
        if (this.f12006i) {
            YN1.m9281f(Thread.currentThread() == this.f11999b.f10020a.getLooper().getThread());
        }
    }

    public C8372Uj0(CopyOnWriteArraySet copyOnWriteArraySet, Looper looper, M71 m71, InterfaceC8268Sj0 interfaceC8268Sj0, boolean z) {
        this.f11998a = m71;
        this.f12001d = copyOnWriteArraySet;
        this.f12000c = interfaceC8268Sj0;
        this.f12004g = new Object();
        this.f12002e = new ArrayDeque();
        this.f12003f = new ArrayDeque();
        this.f11999b = m71.m5274a(looper, new Handler.Callback() { // from class: Qj0
            @Override // android.os.Handler.Callback
            public final boolean handleMessage(Message message) {
                C8372Uj0 c8372Uj0 = this.f9755a;
                Iterator it = c8372Uj0.f12001d.iterator();
                while (it.hasNext()) {
                    C8320Tj0 c8320Tj0 = (C8320Tj0) it.next();
                    if (!c8320Tj0.f11485d && c8320Tj0.f11484c) {
                        C1353VV c1353vvM6121g = c8320Tj0.f11483b.m6121g();
                        c8320Tj0.f11483b = new C0926Oi(4);
                        c8320Tj0.f11484c = false;
                        c8372Uj0.f12000c.mo3137f(c8320Tj0.f11482a, c1353vvM6121g);
                    }
                    if (c8372Uj0.f11999b.f10020a.hasMessages(1)) {
                        break;
                    }
                }
                return true;
            }
        });
        this.f12006i = z;
    }
}
