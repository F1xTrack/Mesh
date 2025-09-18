package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: hn */
/* loaded from: classes.dex */
public final class C4219hn implements SR0 {
    public C4037gq b;
    public List c;
    public volatile C8194yY0 e;
    public final Object a = new Object();
    public volatile boolean d = false;

    public C4219hn(C4037gq c4037gq, ArrayList arrayList) {
        int i = c4037gq.i;
        AbstractC3377dM1.d("CaptureSession state must be OPENED. Current state:".concat(AbstractC8235ym.A(i)), i == 5);
        this.b = c4037gq;
        this.c = Collections.unmodifiableList(new ArrayList(arrayList));
    }

    public final C4178hZ0 a(int i) {
        synchronized (this.a) {
            try {
                List<C4178hZ0> list = this.c;
                if (list == null) {
                    return null;
                }
                for (C4178hZ0 c4178hZ0 : list) {
                    if (c4178hZ0.p == i) {
                        return c4178hZ0;
                    }
                }
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean b(RR0 rr0) {
        if (rr0.getTargetOutputConfigIds().isEmpty()) {
            AbstractC0759Jm0.f("Camera2RequestProcessor");
            return false;
        }
        Iterator it = rr0.getTargetOutputConfigIds().iterator();
        while (it.hasNext()) {
            if (a(((Integer) it.next()).intValue()) == null) {
                AbstractC0759Jm0.f("Camera2RequestProcessor");
                return false;
            }
        }
        return true;
    }

    public final int c(RR0 rr0, QR0 qr0) {
        synchronized (this.a) {
            try {
                if (!this.d && b(rr0) && this.b != null) {
                    C7433uY0 c7433uY0 = new C7433uY0();
                    c7433uY0.b.a = rr0.getTemplateId();
                    InterfaceC7122sw parameters = rr0.getParameters();
                    C2005Zm c2005Zm = c7433uY0.b;
                    c2005Zm.getClass();
                    c2005Zm.e = C0468Ft0.c(parameters);
                    c7433uY0.a(new C1624Up(new C4028gn(this, rr0, qr0, true)));
                    if (this.e != null) {
                        Iterator it = this.e.g.e.iterator();
                        while (it.hasNext()) {
                            c7433uY0.a((AbstractC6141nn) it.next());
                        }
                        C6974s81 c6974s81 = this.e.g.g;
                        for (String str : c6974s81.a.keySet()) {
                            ((C0858Kt0) c7433uY0.b.g).a.put(str, c6974s81.a.get(str));
                        }
                    }
                    Iterator it2 = rr0.getTargetOutputConfigIds().iterator();
                    while (it2.hasNext()) {
                        c7433uY0.c(a(((Integer) it2.next()).intValue()), CM.d, -1);
                    }
                    return this.b.o(c7433uY0.d());
                }
                return -1;
            } finally {
            }
        }
    }

    public final void d() {
        C4037gq c4037gq;
        synchronized (this.a) {
            try {
                if (!this.d && (c4037gq = this.b) != null) {
                    c4037gq.p();
                }
            } finally {
            }
        }
    }

    public final int e(List list, QR0 qr0) {
        synchronized (this.a) {
            try {
                if (!this.d) {
                    Iterator it = list.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (!b((RR0) it.next())) {
                            }
                        } else if (this.b != null) {
                            ArrayList arrayList = new ArrayList();
                            Iterator it2 = list.iterator();
                            boolean z = true;
                            while (it2.hasNext()) {
                                RR0 rr0 = (RR0) it2.next();
                                C2005Zm c2005Zm = new C2005Zm();
                                c2005Zm.a = rr0.getTemplateId();
                                c2005Zm.e = C0468Ft0.c(rr0.getParameters());
                                c2005Zm.b(new C1624Up(new C4028gn(this, rr0, qr0, z)));
                                Iterator it3 = rr0.getTargetOutputConfigIds().iterator();
                                while (it3.hasNext()) {
                                    c2005Zm.d(a(((Integer) it3.next()).intValue()));
                                }
                                arrayList.add(c2005Zm.e());
                                z = false;
                            }
                            return this.b.n(arrayList);
                        }
                    }
                }
                return -1;
            } finally {
            }
        }
    }
}
