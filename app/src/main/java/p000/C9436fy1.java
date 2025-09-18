package p000;

/* renamed from: fy1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9436fy1 extends QG1 implements KI1 {
    private static final C9436fy1 zzb;
    private InterfaceC11270uH1 zzd = C9994kJ1.f36425d;

    static {
        C9436fy1 c9436fy1 = new C9436fy1();
        zzb = c9436fy1;
        QG1.m6620h(C9436fy1.class, c9436fy1);
    }

    @Override // p000.QG1
    /* renamed from: m */
    public final Object mo180m(int i, QG1 qg1) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new C11910zJ1(zzb, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzd", C9308ey1.class});
        }
        if (i2 == 3) {
            return new C9436fy1();
        }
        if (i2 == 4) {
            return new DR1(1, zzb);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
