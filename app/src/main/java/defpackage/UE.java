package defpackage;

/* loaded from: classes.dex */
public final class UE extends AbstractC8446zt {
    public final void finalize() throws Throwable {
        try {
            synchronized (this) {
                if (this.a) {
                    super.finalize();
                    return;
                }
                Object objD = this.b.d();
                AbstractC3393dS.q("DefaultCloseableReference", "Finalized without closing: %x %x (type = %s)", Integer.valueOf(System.identityHashCode(this)), Integer.valueOf(System.identityHashCode(this.b)), objD == null ? null : objD.getClass().getName());
                InterfaceC8256yt interfaceC8256yt = this.c;
                if (interfaceC8256yt != null) {
                    interfaceC8256yt.q(this.b, this.d);
                }
                close();
                super.finalize();
            }
        } catch (Throwable th) {
            super.finalize();
            throw th;
        }
    }

    @Override // defpackage.AbstractC8446zt
    /* renamed from: m */
    public final AbstractC8446zt clone() {
        ML1.e(A());
        return new UE(this.b, this.c, this.d != null ? new Throwable() : null);
    }
}
