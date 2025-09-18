package defpackage;

/* renamed from: nL1 */
/* loaded from: classes.dex */
public final class C6059nL1 extends EE1 {
    private static final C6059nL1 zzb;
    private int zzd;
    private int zze = 0;
    private Object zzf;
    private int zzg;
    private C2120aM1 zzh;

    static {
        C6059nL1 c6059nL1 = new C6059nL1();
        zzb = c6059nL1;
        EE1.i(C6059nL1.class, c6059nL1);
    }

    public static C6059nL1 n(byte[] bArr, BD1 bd1) {
        return (C6059nL1) EE1.f(zzb, bArr, bd1);
    }

    public static /* synthetic */ void o(C6059nL1 c6059nL1, C2120aM1 c2120aM1) {
        c6059nL1.zzh = c2120aM1;
        c6059nL1.zzd |= 2;
    }

    public static /* synthetic */ void p(C6059nL1 c6059nL1, C7782wN1 c7782wN1) {
        c6059nL1.zzf = c7782wN1;
        c6059nL1.zze = 4;
    }

    public static /* synthetic */ void q(C6059nL1 c6059nL1, int i) {
        c6059nL1.zzg = i - 1;
        c6059nL1.zzd |= 1;
    }

    public static C4328iL1 r() {
        return (C4328iL1) zzb.d();
    }

    @Override // defpackage.EE1
    public final Object m(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new NH1(zzb, "\u0001\u0003\u0001\u0001\u0001\u0004\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002ဉ\u0001\u0004<\u0000", new Object[]{"zzf", "zze", "zzd", "zzg", C7204tL1.b, "zzh", C7782wN1.class});
        }
        if (i2 == 3) {
            return new C6059nL1();
        }
        if (i2 == 4) {
            return new C4328iL1(zzb);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
