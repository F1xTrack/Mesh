package defpackage;

import com.my.tracker.obfuscated.d;
import java.util.List;

/* renamed from: Qp0 */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC1313Qp0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ RunnableC1313Qp0(d dVar, Exception exc, List list) {
        this.a = 20;
        this.b = dVar;
        this.d = exc;
        this.c = list;
    }

    private final void a() {
        C1198Pd c1198PdD;
        C2226aw c2226aw = (C2226aw) this.b;
        C0365El c0365El = (C0365El) this.c;
        C1198Pd c1198Pd = (C1198Pd) this.d;
        if (c2226aw.c) {
            ((InterfaceC1470Sp1) c2226aw.g).o(c1198Pd.a, c0365El);
            ((C6329om) c2226aw.b).m();
            return;
        }
        synchronized (((C1626Up1) c2226aw.e)) {
            ((C1626Up1) c2226aw.e).d(1.0f);
            c1198PdD = C1198Pd.d((C1626Up1) c2226aw.e);
        }
        c2226aw.n(c1198PdD);
        c0365El.d(new C1774Wn("Camera is not active."));
    }

    /* JADX WARN: Code restructure failed: missing block: B:286:0x0331, code lost:
    
        if (r12.n() == false) goto L293;
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.RunnableC1313Qp0.run():void");
    }

    public /* synthetic */ RunnableC1313Qp0(Object obj, Object obj2, Object obj3, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }
}
