package p000;

import java.util.Iterator;

/* renamed from: Zp */
/* loaded from: classes.dex */
public final class C1625Zp extends AbstractC6511nn {

    /* renamed from: a */
    public final /* synthetic */ int f15139a;

    /* renamed from: b */
    public final /* synthetic */ Object f15140b;

    public /* synthetic */ C1625Zp(int i, Object obj) {
        this.f15139a = i;
        this.f15140b = obj;
    }

    @Override // p000.AbstractC6511nn
    /* renamed from: b */
    public void mo5817b(int i, InterfaceC7034vn interfaceC7034vn) {
        switch (this.f15139a) {
            case 1:
                C7764Ir0 c7764Ir0 = (C7764Ir0) this.f15140b;
                synchronized (c7764Ir0.f5172a) {
                    try {
                        if (c7764Ir0.f5176e) {
                            return;
                        }
                        c7764Ir0.f5180i.put(interfaceC7034vn.getTimestamp(), new C7097wn(interfaceC7034vn));
                        c7764Ir0.m4045i();
                        return;
                    } finally {
                    }
                }
            case 2:
                Iterator it = ((C7909Ll1) this.f15140b).f6835a.iterator();
                while (it.hasNext()) {
                    C11812yY0 c11812yY0 = ((AbstractC9402fh1) it.next()).f27344m;
                    Iterator it2 = c11812yY0.f46304g.f12782e.iterator();
                    while (it2.hasNext()) {
                        ((AbstractC6511nn) it2.next()).mo5817b(i, new C0848NT(interfaceC7034vn, c11812yY0.f46304g.f12784g, -1L));
                    }
                }
                return;
            default:
                return;
        }
    }

    @Override // p000.AbstractC6511nn
    /* renamed from: d */
    public void mo9610d(int i, int i2) {
        switch (this.f15139a) {
            case 0:
                QR1.m6710h().execute(new RunnableC6246ja(this, i2, 3));
                break;
        }
    }

    @Override // p000.AbstractC6511nn
    /* renamed from: e */
    public void mo9611e(int i) {
        switch (this.f15139a) {
            case 0:
                QR1.m6710h().execute(new RunnableC0383G4(18, this));
                break;
        }
    }
}
