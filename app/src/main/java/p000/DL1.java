package p000;

/* loaded from: classes.dex */
public final class DL1 extends EE1 {
    private static final DL1 zzb;
    private int zzd;
    private int zze = 0;
    private Object zzf;
    private int zzg;

    static {
        DL1 dl1 = new DL1();
        zzb = dl1;
        EE1.m2094i(DL1.class, dl1);
    }

    /* renamed from: n */
    public static /* synthetic */ void m1646n(DL1 dl1, C11537wN1 c11537wN1) {
        dl1.zzf = c11537wN1;
        dl1.zze = 2;
    }

    /* renamed from: o */
    public static /* synthetic */ void m1647o(DL1 dl1, int i) {
        dl1.zzg = i - 1;
        dl1.zzd |= 1;
    }

    /* renamed from: p */
    public static AL1 m1648p() {
        return (AL1) zzb.m2095d();
    }

    @Override // p000.EE1
    /* renamed from: m */
    public final Object mo1649m(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new NH1(zzb, "\u0001\u0002\u0001\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002<\u0000", new Object[]{"zzf", "zze", "zzd", "zzg", C11150tL1.f43023b, C11537wN1.class});
        }
        if (i2 == 3) {
            return new DL1();
        }
        if (i2 == 4) {
            return new AL1(zzb);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
