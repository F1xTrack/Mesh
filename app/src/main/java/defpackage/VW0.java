package defpackage;

/* loaded from: classes2.dex */
public final class VW0 extends WW0 {
    public VW0() {
        super("TEXT", 0);
    }

    @Override // defpackage.WW0
    public final int a(RW0 rw0) {
        O90.f(rw0, "capitalize");
        int iOrdinal = rw0.ordinal();
        if (iOrdinal == 0) {
            return 1;
        }
        if (iOrdinal == 1) {
            return 8192;
        }
        if (iOrdinal == 2) {
            return 16384;
        }
        if (iOrdinal == 3) {
            return 4096;
        }
        throw new C7074sg();
    }
}
