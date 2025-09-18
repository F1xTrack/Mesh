package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.r5 */
/* loaded from: classes2.dex */
public final class RunnableC5414r5 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ InterfaceC5522vd f32498a;

    /* renamed from: b */
    public final /* synthetic */ C5439s5 f32499b;

    public RunnableC5414r5(C5439s5 c5439s5, InterfaceC5522vd interfaceC5522vd) {
        this.f32499b = c5439s5;
        this.f32498a = interfaceC5522vd;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f32499b) {
            try {
                C5439s5 c5439s5 = this.f32499b;
                Object obj = c5439s5.f32533a;
                if (obj == null) {
                    c5439s5.f32534b.add(this.f32498a);
                } else {
                    this.f32498a.consume(obj);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
