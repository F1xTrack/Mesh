package defpackage;

import android.os.Looper;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: rg, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC6883rg {
    public final ArrayList a = new ArrayList(1);
    public final HashSet b = new HashSet(1);
    public final VY c = new VY(new CopyOnWriteArrayList(), 0, (C0456Fp0) null);
    public final OL d = new OL(new CopyOnWriteArrayList(), 0, null);
    public Looper e;
    public AbstractC0178Ca1 f;
    public NB0 g;

    public final VY a(C0456Fp0 c0456Fp0) {
        return new VY((CopyOnWriteArrayList) this.c.d, 0, c0456Fp0);
    }

    public abstract InterfaceC8435zp0 b(C0456Fp0 c0456Fp0, C5272jE c5272jE, long j);

    public final void c(InterfaceC0534Gp0 interfaceC0534Gp0) {
        HashSet hashSet = this.b;
        boolean zIsEmpty = hashSet.isEmpty();
        hashSet.remove(interfaceC0534Gp0);
        if (zIsEmpty || !hashSet.isEmpty()) {
            return;
        }
        d();
    }

    public final void e(InterfaceC0534Gp0 interfaceC0534Gp0) {
        this.e.getClass();
        HashSet hashSet = this.b;
        boolean zIsEmpty = hashSet.isEmpty();
        hashSet.add(interfaceC0534Gp0);
        if (zIsEmpty) {
            f();
        }
    }

    public AbstractC0178Ca1 g() {
        return null;
    }

    public abstract C6721qp0 h();

    public boolean i() {
        return true;
    }

    public abstract void j();

    public final void k(InterfaceC0534Gp0 interfaceC0534Gp0, InterfaceC4188hc1 interfaceC4188hc1, NB0 nb0) {
        Looper looperMyLooper = Looper.myLooper();
        Looper looper = this.e;
        YN1.c(looper == null || looper == looperMyLooper);
        this.g = nb0;
        AbstractC0178Ca1 abstractC0178Ca1 = this.f;
        this.a.add(interfaceC0534Gp0);
        if (this.e == null) {
            this.e = looperMyLooper;
            this.b.add(interfaceC0534Gp0);
            l(interfaceC4188hc1);
        } else if (abstractC0178Ca1 != null) {
            e(interfaceC0534Gp0);
            interfaceC0534Gp0.a(this, abstractC0178Ca1);
        }
    }

    public abstract void l(InterfaceC4188hc1 interfaceC4188hc1);

    public final void n(AbstractC0178Ca1 abstractC0178Ca1) {
        this.f = abstractC0178Ca1;
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((InterfaceC0534Gp0) it.next()).a(this, abstractC0178Ca1);
        }
    }

    public abstract void o(InterfaceC8435zp0 interfaceC8435zp0);

    public final void p(InterfaceC0534Gp0 interfaceC0534Gp0) {
        ArrayList arrayList = this.a;
        arrayList.remove(interfaceC0534Gp0);
        if (!arrayList.isEmpty()) {
            c(interfaceC0534Gp0);
            return;
        }
        this.e = null;
        this.f = null;
        this.g = null;
        this.b.clear();
        q();
    }

    public abstract void q();

    public final void r(PL pl) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.d.c;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            NL nl = (NL) it.next();
            if (nl.b == pl) {
                copyOnWriteArrayList.remove(nl);
            }
        }
    }

    public final void s(InterfaceC0846Kp0 interfaceC0846Kp0) {
        CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) this.c.d;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            C0768Jp0 c0768Jp0 = (C0768Jp0) it.next();
            if (c0768Jp0.b == interfaceC0846Kp0) {
                copyOnWriteArrayList.remove(c0768Jp0);
            }
        }
    }

    public void t(C6721qp0 c6721qp0) {
    }

    public void d() {
    }

    public void f() {
    }
}
