package p000;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: hn */
/* loaded from: classes.dex */
public final class C4201hn implements SR0 {

    /* renamed from: b */
    public C4141gq f28580b;

    /* renamed from: c */
    public List f28581c;

    /* renamed from: e */
    public volatile C11812yY0 f28583e;

    /* renamed from: a */
    public final Object f28579a = new Object();

    /* renamed from: d */
    public volatile boolean f28582d = false;

    public C4201hn(C4141gq c4141gq, ArrayList arrayList) {
        int i = c4141gq.f28048i;
        AbstractC9104dM1.m17545d("CaptureSession state must be OPENED. Current state:".concat(AbstractC7222ym.m26221A(i)), i == 5);
        this.f28580b = c4141gq;
        this.f28581c = Collections.unmodifiableList(new ArrayList(arrayList));
    }

    /* renamed from: a */
    public final C9641hZ0 m18875a(int i) {
        synchronized (this.f28579a) {
            try {
                List<C9641hZ0> list = this.f28581c;
                if (list == null) {
                    return null;
                }
                for (C9641hZ0 c9641hZ0 : list) {
                    if (c9641hZ0.f28460p == i) {
                        return c9641hZ0;
                    }
                }
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: b */
    public final boolean m18876b(RR0 rr0) {
        if (rr0.getTargetOutputConfigIds().isEmpty()) {
            AbstractC7806Jm0.m4412f("Camera2RequestProcessor");
            return false;
        }
        Iterator it = rr0.getTargetOutputConfigIds().iterator();
        while (it.hasNext()) {
            if (m18875a(((Integer) it.next()).intValue()) == null) {
                AbstractC7806Jm0.m4412f("Camera2RequestProcessor");
                return false;
            }
        }
        return true;
    }

    /* renamed from: c */
    public final int m18877c(RR0 rr0, QR0 qr0) {
        synchronized (this.f28579a) {
            try {
                if (!this.f28582d && m18876b(rr0) && this.f28580b != null) {
                    C11303uY0 c11303uY0 = new C11303uY0();
                    c11303uY0.f43134b.f15113a = rr0.getTemplateId();
                    InterfaceC6854sw parameters = rr0.getParameters();
                    C1622Zm c1622Zm = c11303uY0.f43134b;
                    c1622Zm.getClass();
                    c1622Zm.f15117e = C7612Ft0.m2813c(parameters);
                    c11303uY0.m25203a(new C1310Up(new C4138gn(this, rr0, qr0, true)));
                    if (this.f28583e != null) {
                        Iterator it = this.f28583e.f46304g.f12782e.iterator();
                        while (it.hasNext()) {
                            c11303uY0.m25203a((AbstractC6511nn) it.next());
                        }
                        C10996s81 c10996s81 = this.f28583e.f46304g.f12784g;
                        for (String str : c10996s81.f42279a.keySet()) {
                            ((C7872Kt0) c11303uY0.f43134b.f15119g).f42279a.put(str, c10996s81.f42279a.get(str));
                        }
                    }
                    Iterator it2 = rr0.getTargetOutputConfigIds().iterator();
                    while (it2.hasNext()) {
                        c11303uY0.m25205c(m18875a(((Integer) it2.next()).intValue()), C0149CM.f1329d, -1);
                    }
                    return this.f28580b.m18660o(c11303uY0.m25206d());
                }
                return -1;
            } finally {
            }
        }
    }

    /* renamed from: d */
    public final void m18878d() {
        C4141gq c4141gq;
        synchronized (this.f28579a) {
            try {
                if (!this.f28582d && (c4141gq = this.f28580b) != null) {
                    c4141gq.m18661p();
                }
            } finally {
            }
        }
    }

    /* renamed from: e */
    public final int m18879e(List list, QR0 qr0) {
        synchronized (this.f28579a) {
            try {
                if (!this.f28582d) {
                    Iterator it = list.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (!m18876b((RR0) it.next())) {
                            }
                        } else if (this.f28580b != null) {
                            ArrayList arrayList = new ArrayList();
                            Iterator it2 = list.iterator();
                            boolean z = true;
                            while (it2.hasNext()) {
                                RR0 rr0 = (RR0) it2.next();
                                C1622Zm c1622Zm = new C1622Zm();
                                c1622Zm.f15113a = rr0.getTemplateId();
                                c1622Zm.f15117e = C7612Ft0.m2813c(rr0.getParameters());
                                c1622Zm.m9589b(new C1310Up(new C4138gn(this, rr0, qr0, z)));
                                Iterator it3 = rr0.getTargetOutputConfigIds().iterator();
                                while (it3.hasNext()) {
                                    c1622Zm.m9591d(m18875a(((Integer) it3.next()).intValue()));
                                }
                                arrayList.add(c1622Zm.m9592e());
                                z = false;
                            }
                            return this.f28580b.m18659n(arrayList);
                        }
                    }
                }
                return -1;
            } finally {
            }
        }
    }
}
