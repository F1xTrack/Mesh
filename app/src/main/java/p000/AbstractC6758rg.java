package p000;

import android.os.Looper;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: rg */
/* loaded from: classes.dex */
public abstract class AbstractC6758rg {

    /* renamed from: a */
    public final ArrayList f41797a = new ArrayList(1);

    /* renamed from: b */
    public final HashSet f41798b = new HashSet(1);

    /* renamed from: c */
    public final C1356VY f41799c = new C1356VY(new CopyOnWriteArrayList(), 0, (C7604Fp0) null);

    /* renamed from: d */
    public final C0903OL f41800d = new C0903OL(new CopyOnWriteArrayList(), 0, null);

    /* renamed from: e */
    public Looper f41801e;

    /* renamed from: f */
    public AbstractC7419Ca1 f41802f;

    /* renamed from: g */
    public NB0 f41803g;

    /* renamed from: a */
    public final C1356VY m24438a(C7604Fp0 c7604Fp0) {
        return new C1356VY((CopyOnWriteArrayList) this.f41799c.f12613d, 0, c7604Fp0);
    }

    /* renamed from: b */
    public abstract InterfaceC11973zp0 mo3162b(C7604Fp0 c7604Fp0, C6224jE c6224jE, long j);

    /* renamed from: c */
    public final void m24439c(InterfaceC7656Gp0 interfaceC7656Gp0) {
        HashSet hashSet = this.f41798b;
        boolean zIsEmpty = hashSet.isEmpty();
        hashSet.remove(interfaceC7656Gp0);
        if (zIsEmpty || !hashSet.isEmpty()) {
            return;
        }
        mo8633d();
    }

    /* renamed from: e */
    public final void m24440e(InterfaceC7656Gp0 interfaceC7656Gp0) {
        this.f41801e.getClass();
        HashSet hashSet = this.f41798b;
        boolean zIsEmpty = hashSet.isEmpty();
        hashSet.add(interfaceC7656Gp0);
        if (zIsEmpty) {
            mo8634f();
        }
    }

    /* renamed from: g */
    public AbstractC7419Ca1 mo21932g() {
        return null;
    }

    /* renamed from: h */
    public abstract C10825qp0 mo6202h();

    /* renamed from: i */
    public boolean mo21933i() {
        return true;
    }

    /* renamed from: j */
    public abstract void mo3163j();

    /* renamed from: k */
    public final void m24441k(InterfaceC7656Gp0 interfaceC7656Gp0, InterfaceC9648hc1 interfaceC9648hc1, NB0 nb0) {
        Looper looperMyLooper = Looper.myLooper();
        Looper looper = this.f41801e;
        YN1.m9278c(looper == null || looper == looperMyLooper);
        this.f41803g = nb0;
        AbstractC7419Ca1 abstractC7419Ca1 = this.f41802f;
        this.f41797a.add(interfaceC7656Gp0);
        if (this.f41801e == null) {
            this.f41801e = looperMyLooper;
            this.f41798b.add(interfaceC7656Gp0);
            mo6203l(interfaceC9648hc1);
        } else if (abstractC7419Ca1 != null) {
            m24440e(interfaceC7656Gp0);
            interfaceC7656Gp0.mo3172a(this, abstractC7419Ca1);
        }
    }

    /* renamed from: l */
    public abstract void mo6203l(InterfaceC9648hc1 interfaceC9648hc1);

    /* renamed from: n */
    public final void m24442n(AbstractC7419Ca1 abstractC7419Ca1) {
        this.f41802f = abstractC7419Ca1;
        Iterator it = this.f41797a.iterator();
        while (it.hasNext()) {
            ((InterfaceC7656Gp0) it.next()).mo3172a(this, abstractC7419Ca1);
        }
    }

    /* renamed from: o */
    public abstract void mo3164o(InterfaceC11973zp0 interfaceC11973zp0);

    /* renamed from: p */
    public final void m24443p(InterfaceC7656Gp0 interfaceC7656Gp0) {
        ArrayList arrayList = this.f41797a;
        arrayList.remove(interfaceC7656Gp0);
        if (!arrayList.isEmpty()) {
            m24439c(interfaceC7656Gp0);
            return;
        }
        this.f41801e = null;
        this.f41802f = null;
        this.f41803g = null;
        this.f41798b.clear();
        mo3165q();
    }

    /* renamed from: q */
    public abstract void mo3165q();

    /* renamed from: r */
    public final void m24444r(InterfaceC0966PL interfaceC0966PL) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.f41800d.f8366c;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            C0840NL c0840nl = (C0840NL) it.next();
            if (c0840nl.f7730b == interfaceC0966PL) {
                copyOnWriteArrayList.remove(c0840nl);
            }
        }
    }

    /* renamed from: s */
    public final void m24445s(InterfaceC7864Kp0 interfaceC7864Kp0) {
        CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) this.f41799c.f12613d;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            C7812Jp0 c7812Jp0 = (C7812Jp0) it.next();
            if (c7812Jp0.f5714b == interfaceC7864Kp0) {
                copyOnWriteArrayList.remove(c7812Jp0);
            }
        }
    }

    /* renamed from: t */
    public void mo3166t(C10825qp0 c10825qp0) {
    }

    /* renamed from: d */
    public void mo8633d() {
    }

    /* renamed from: f */
    public void mo8634f() {
    }
}
