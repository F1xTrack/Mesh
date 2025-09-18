package p000;

import com.p018my.tracker.obfuscated.C2304d;
import java.util.List;

/* renamed from: Qp0 */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC8176Qp0 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f9803a;

    /* renamed from: b */
    public final /* synthetic */ Object f9804b;

    /* renamed from: c */
    public final /* synthetic */ Object f9805c;

    /* renamed from: d */
    public final /* synthetic */ Object f9806d;

    public /* synthetic */ RunnableC8176Qp0(C2304d c2304d, Exception exc, List list) {
        this.f9803a = 20;
        this.f9804b = c2304d;
        this.f9806d = exc;
        this.f9805c = list;
    }

    /* renamed from: a */
    private final void m6793a() {
        C0984Pd c0984PdM6387d;
        C1753aw c1753aw = (C1753aw) this.f9804b;
        C0300El c0300El = (C0300El) this.f9805c;
        C0984Pd c0984Pd = (C0984Pd) this.f9806d;
        if (c1753aw.f16683c) {
            ((InterfaceC8281Sp1) c1753aw.f16687g).mo485o(c0984Pd.f9200a, c0300El);
            ((C6573om) c1753aw.f16682b).m23552m();
            return;
        }
        synchronized (((C8385Up1) c1753aw.f16685e)) {
            ((C8385Up1) c1753aw.f16685e).m8186d(1.0f);
            c0984PdM6387d = C0984Pd.m6387d((C8385Up1) c1753aw.f16685e);
        }
        c1753aw.m10395n(c0984PdM6387d);
        c0300El.m2377d(new C1434Wn("Camera is not active."));
    }

    /* JADX WARN: Code restructure failed: missing block: B:286:0x0331, code lost:
    
        if (r12.m18501n() == false) goto L293;
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void run() {
        /*
            Method dump skipped, instructions count: 1212
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.RunnableC8176Qp0.run():void");
    }

    public /* synthetic */ RunnableC8176Qp0(Object obj, Object obj2, Object obj3, int i) {
        this.f9803a = i;
        this.f9804b = obj;
        this.f9805c = obj2;
        this.f9806d = obj3;
    }
}
