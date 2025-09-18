package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.r5, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class RunnableC4829r5 implements Runnable {
    public final /* synthetic */ InterfaceC4933vd a;
    public final /* synthetic */ C4853s5 b;

    public RunnableC4829r5(C4853s5 c4853s5, InterfaceC4933vd interfaceC4933vd) {
        this.b = c4853s5;
        this.a = interfaceC4933vd;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.b) {
            try {
                C4853s5 c4853s5 = this.b;
                Object obj = c4853s5.a;
                if (obj == null) {
                    c4853s5.b.add(this.a);
                } else {
                    this.a.consume(obj);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
