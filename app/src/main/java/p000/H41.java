package p000;

import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public abstract class H41 implements Runnable {

    /* renamed from: a */
    public final AtomicInteger f4045a;

    /* renamed from: b */
    public final AbstractC1237Tf f4046b;

    /* renamed from: c */
    public final E90 f4047c;

    /* renamed from: d */
    public final RD0 f4048d;

    /* renamed from: e */
    public final String f4049e;

    public H41(AbstractC1237Tf abstractC1237Tf, E90 e90, RD0 rd0, String str) {
        O90.m5968f(abstractC1237Tf, "consumer");
        O90.m5968f(e90, "producerListener");
        O90.m5968f(rd0, "producerContext");
        O90.m5968f(str, "producerName");
        this.f4045a = new AtomicInteger(0);
        this.f4046b = abstractC1237Tf;
        this.f4047c = e90;
        this.f4048d = rd0;
        this.f4049e = str;
        e90.mo752j(rd0, str);
    }

    /* renamed from: a */
    public final void m3259a() {
        if (this.f4045a.compareAndSet(0, 2)) {
            mo1865e();
        }
    }

    /* renamed from: b */
    public abstract void mo845b(Object obj);

    /* renamed from: c */
    public Map mo846c(Object obj) {
        return null;
    }

    /* renamed from: d */
    public abstract Object mo847d();

    /* renamed from: e */
    public void mo1865e() {
        E90 e90 = this.f4047c;
        RD0 rd0 = this.f4048d;
        String str = this.f4049e;
        e90.mo751i(rd0, str);
        e90.mo753k(rd0, str);
        this.f4046b.m7717c();
    }

    /* renamed from: f */
    public void mo848f(Exception exc) {
        E90 e90 = this.f4047c;
        RD0 rd0 = this.f4048d;
        String str = this.f4049e;
        e90.mo751i(rd0, str);
        e90.mo747e(rd0, str, exc, null);
        this.f4046b.m7718e(exc);
    }

    /* renamed from: g */
    public void mo849g(Object obj) {
        E90 e90 = this.f4047c;
        RD0 rd0 = this.f4048d;
        String str = this.f4049e;
        e90.mo743a(rd0, str, e90.mo751i(rd0, str) ? mo846c(obj) : null);
        this.f4046b.m7719g(1, obj);
    }

    @Override // java.lang.Runnable
    public final void run() {
        AtomicInteger atomicInteger = this.f4045a;
        if (atomicInteger.compareAndSet(0, 1)) {
            try {
                Object objMo847d = mo847d();
                atomicInteger.set(3);
                try {
                    mo849g(objMo847d);
                } finally {
                    mo845b(objMo847d);
                }
            } catch (Exception e) {
                atomicInteger.set(4);
                mo848f(e);
            }
        }
    }
}
