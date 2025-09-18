package defpackage;

import java.util.Iterator;

/* renamed from: Zp */
/* loaded from: classes.dex */
public final class C2014Zp extends AbstractC6141nn {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ C2014Zp(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.AbstractC6141nn
    public void b(int i, InterfaceC7668vn interfaceC7668vn) {
        switch (this.a) {
            case 1:
                C0696Ir0 c0696Ir0 = (C0696Ir0) this.b;
                synchronized (c0696Ir0.a) {
                    try {
                        if (c0696Ir0.e) {
                            return;
                        }
                        c0696Ir0.i.put(interfaceC7668vn.getTimestamp(), new C7858wn(interfaceC7668vn));
                        c0696Ir0.i();
                        return;
                    } finally {
                    }
                }
            case 2:
                Iterator it = ((C0913Ll1) this.b).a.iterator();
                while (it.hasNext()) {
                    C8194yY0 c8194yY0 = ((AbstractC3821fh1) it.next()).m;
                    Iterator it2 = c8194yY0.g.e.iterator();
                    while (it2.hasNext()) {
                        ((AbstractC6141nn) it2.next()).b(i, new NT(interfaceC7668vn, c8194yY0.g.g, -1L));
                    }
                }
                return;
            default:
                return;
        }
    }

    @Override // defpackage.AbstractC6141nn
    public void d(int i, int i2) {
        switch (this.a) {
            case 0:
                QR1.h().execute(new RunnableC5338ja(this, i2, 3));
                break;
        }
    }

    @Override // defpackage.AbstractC6141nn
    public void e(int i) {
        switch (this.a) {
            case 0:
                QR1.h().execute(new G4(18, this));
                break;
        }
    }
}
