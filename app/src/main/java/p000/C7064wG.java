package p000;

/* renamed from: wG */
/* loaded from: classes2.dex */
public final class C7064wG extends BV0 {

    /* renamed from: d */
    public static final C7064wG f44739d = new C7064wG(AbstractC9078d91.f25847e, AbstractC9078d91.f25843a, AbstractC9078d91.f25845c, AbstractC9078d91.f25846d);

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new UnsupportedOperationException("Dispatchers.Default cannot be closed");
    }

    @Override // p000.AbstractC0377Fz
    /* renamed from: o */
    public final AbstractC0377Fz mo2869o(int i, String str) {
        AbstractC1665aS.m9744b(1);
        return 1 >= AbstractC9078d91.f25845c ? str != null ? new C8496Wt0(this, str) : this : super.mo2869o(1, str);
    }

    @Override // p000.AbstractC0377Fz
    public final String toString() {
        return "Dispatchers.Default";
    }
}
