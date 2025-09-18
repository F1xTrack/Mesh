package p000;

/* renamed from: nL1 */
/* loaded from: classes.dex */
public final class C10382nL1 extends EE1 {
    private static final C10382nL1 zzb;
    private int zzd;
    private int zze = 0;
    private Object zzf;
    private int zzg;
    private C8715aM1 zzh;

    static {
        C10382nL1 c10382nL1 = new C10382nL1();
        zzb = c10382nL1;
        EE1.m2094i(C10382nL1.class, c10382nL1);
    }

    /* renamed from: n */
    public static C10382nL1 m23126n(byte[] bArr, BD1 bd1) {
        return (C10382nL1) EE1.m2092f(zzb, bArr, bd1);
    }

    /* renamed from: o */
    public static /* synthetic */ void m23127o(C10382nL1 c10382nL1, C8715aM1 c8715aM1) {
        c10382nL1.zzh = c8715aM1;
        c10382nL1.zzd |= 2;
    }

    /* renamed from: p */
    public static /* synthetic */ void m23128p(C10382nL1 c10382nL1, C11537wN1 c11537wN1) {
        c10382nL1.zzf = c11537wN1;
        c10382nL1.zze = 4;
    }

    /* renamed from: q */
    public static /* synthetic */ void m23129q(C10382nL1 c10382nL1, int i) {
        c10382nL1.zzg = i - 1;
        c10382nL1.zzd |= 1;
    }

    /* renamed from: r */
    public static C9742iL1 m23130r() {
        return (C9742iL1) zzb.m2095d();
    }

    @Override // p000.EE1
    /* renamed from: m */
    public final Object mo1649m(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new NH1(zzb, "\u0001\u0003\u0001\u0001\u0001\u0004\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002ဉ\u0001\u0004<\u0000", new Object[]{"zzf", "zze", "zzd", "zzg", C11150tL1.f43023b, "zzh", C11537wN1.class});
        }
        if (i2 == 3) {
            return new C10382nL1();
        }
        if (i2 == 4) {
            return new C9742iL1(zzb);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
