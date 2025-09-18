package p000;

import java.util.Objects;

/* renamed from: Zo1 */
/* loaded from: classes.dex */
public final class RunnableC8643Zo1 implements Runnable {

    /* renamed from: a */
    public final C8773ap1 f15137a;

    /* renamed from: b */
    public final C7551Eo1 f15138b;

    public RunnableC8643Zo1(C8773ap1 c8773ap1, C7551Eo1 c7551Eo1) {
        this.f15137a = c8773ap1;
        this.f15138b = c7551Eo1;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f15137a.f16611d) {
            try {
                if (((RunnableC8643Zo1) this.f15137a.f16609b.remove(this.f15138b)) != null) {
                    InterfaceC8591Yo1 interfaceC8591Yo1 = (InterfaceC8591Yo1) this.f15137a.f16610c.remove(this.f15138b);
                    if (interfaceC8591Yo1 != null) {
                        C7551Eo1 c7551Eo1 = this.f15138b;
                        C7065wH c7065wH = (C7065wH) interfaceC8591Yo1;
                        C1210TE c1210teM7634G = C1210TE.m7634G();
                        Objects.toString(c7551Eo1);
                        c1210teM7634G.getClass();
                        c7065wH.f44752h.execute(new RunnableC7002vH(c7065wH, 0));
                    }
                } else {
                    C1210TE c1210teM7634G2 = C1210TE.m7634G();
                    this.f15138b.toString();
                    c1210teM7634G2.getClass();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
