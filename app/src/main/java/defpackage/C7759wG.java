package defpackage;

/* renamed from: wG, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C7759wG extends BV0 {
    public static final C7759wG d = new C7759wG(AbstractC3338d91.e, AbstractC3338d91.a, AbstractC3338d91.c, AbstractC3338d91.d);

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new UnsupportedOperationException("Dispatchers.Default cannot be closed");
    }

    @Override // defpackage.AbstractC0485Fz
    public final AbstractC0485Fz o(int i, String str) {
        AbstractC2136aS.b(1);
        return 1 >= AbstractC3338d91.c ? str != null ? new C1793Wt0(this, str) : this : super.o(1, str);
    }

    @Override // defpackage.AbstractC0485Fz
    public final String toString() {
        return "Dispatchers.Default";
    }
}
