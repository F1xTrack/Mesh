package p000;

/* renamed from: UE */
/* loaded from: classes.dex */
public final class C1273UE extends AbstractC7292zt {
    public final void finalize() throws Throwable {
        try {
            synchronized (this) {
                if (this.f47073a) {
                    super.finalize();
                    return;
                }
                Object objM24574d = this.f47074b.m24574d();
                AbstractC3929dS.m17684q("DefaultCloseableReference", "Finalized without closing: %x %x (type = %s)", Integer.valueOf(System.identityHashCode(this)), Integer.valueOf(System.identityHashCode(this.f47074b)), objM24574d == null ? null : objM24574d.getClass().getName());
                InterfaceC7229yt interfaceC7229yt = this.f47075c;
                if (interfaceC7229yt != null) {
                    interfaceC7229yt.mo2903q(this.f47074b, this.f47076d);
                }
                close();
                super.finalize();
            }
        } catch (Throwable th) {
            super.finalize();
            throw th;
        }
    }

    @Override // p000.AbstractC7292zt
    /* renamed from: m */
    public final AbstractC7292zt clone() {
        ML1.m5338e(m26570A());
        return new C1273UE(this.f47074b, this.f47075c, this.f47076d != null ? new Throwable() : null);
    }
}
