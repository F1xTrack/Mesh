package defpackage;

import com.google.android.gms.common.internal.Preconditions;

/* renamed from: xT1 */
/* loaded from: classes.dex */
public final class RunnableC7990xT1 implements Runnable {
    public final /* synthetic */ int a;
    public /* synthetic */ Object b;
    public /* synthetic */ Object c;

    private final void a() {
        FY1 fy1 = (FY1) this.c;
        int i = ((C5802m02) this.b).a;
        synchronized (fy1) {
            C5802m02 c5802m02 = (C5802m02) fy1.e.get(i);
            if (c5802m02 != null) {
                fy1.e.remove(i);
                c5802m02.b(new C0254Da(14, "Timed out waiting for response", null));
                fy1.c();
            }
        }
    }

    private final void b() {
        synchronized (((ServiceConnectionC6855rW1) this.b)) {
            try {
                ((ServiceConnectionC6855rW1) this.b).a = false;
                if (!((ServiceConnectionC6855rW1) this.b).c.I1()) {
                    ((ServiceConnectionC6855rW1) this.b).c.n().n.d("Connected to remote service");
                    C2528cV1 c2528cV1 = ((ServiceConnectionC6855rW1) this.b).c;
                    MJ1 mj1 = (MJ1) this.c;
                    c2528cV1.v1();
                    Preconditions.checkNotNull(mj1);
                    c2528cV1.e = mj1;
                    c2528cV1.M1();
                    c2528cV1.L1();
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.RunnableC7990xT1.run():void");
    }

    public /* synthetic */ RunnableC7990xT1(Object obj, int i, Object obj2) {
        this.a = i;
        this.c = obj2;
        this.b = obj;
    }

    public /* synthetic */ RunnableC7990xT1(Object obj, Object obj2, boolean z, int i) {
        this.a = i;
        this.c = obj;
        this.b = obj2;
    }
}
