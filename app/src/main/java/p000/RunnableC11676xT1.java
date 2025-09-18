package p000;

import com.google.android.gms.common.internal.Preconditions;

/* renamed from: xT1 */
/* loaded from: classes.dex */
public final class RunnableC11676xT1 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f45648a;

    /* renamed from: b */
    public /* synthetic */ Object f45649b;

    /* renamed from: c */
    public /* synthetic */ Object f45650c;

    /* renamed from: a */
    private final void m25896a() {
        FY1 fy1 = (FY1) this.f45650c;
        int i = ((C10209m02) this.f45649b).f37388a;
        synchronized (fy1) {
            C10209m02 c10209m02 = (C10209m02) fy1.f3306e.get(i);
            if (c10209m02 != null) {
                fy1.f3306e.remove(i);
                c10209m02.m22626b(new C0226Da(14, "Timed out waiting for response", null));
                fy1.m2670c();
            }
        }
    }

    /* renamed from: b */
    private final void m25897b() {
        synchronized (((ServiceConnectionC10916rW1) this.f45649b)) {
            try {
                ((ServiceConnectionC10916rW1) this.f45649b).f41717a = false;
                if (!((ServiceConnectionC10916rW1) this.f45649b).f41719c.m10747I1()) {
                    ((ServiceConnectionC10916rW1) this.f45649b).f41719c.mo6070n().f8385n.m24555d("Connected to remote service");
                    C8989cV1 c8989cV1 = ((ServiceConnectionC10916rW1) this.f45649b).f41719c;
                    MJ1 mj1 = (MJ1) this.f45650c;
                    c8989cV1.mo7681v1();
                    Preconditions.checkNotNull(mj1);
                    c8989cV1.f17574e = mj1;
                    c8989cV1.m10751M1();
                    c8989cV1.m10750L1();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:209:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x0224 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void run() throws java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 592
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.RunnableC11676xT1.run():void");
    }

    public /* synthetic */ RunnableC11676xT1(Object obj, int i, Object obj2) {
        this.f45648a = i;
        this.f45650c = obj2;
        this.f45649b = obj;
    }

    public /* synthetic */ RunnableC11676xT1(Object obj, Object obj2, boolean z, int i) {
        this.f45648a = i;
        this.f45650c = obj;
        this.f45649b = obj2;
    }
}
