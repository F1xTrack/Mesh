package defpackage;

/* renamed from: kD1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5462kD1 extends QG1 implements KI1 {
    private static final C5462kD1 zzb;
    private int zzd;
    private int zze;
    private C3746fI1 zzg;
    private byte zzh = 2;
    private InterfaceC7383uH1 zzf = C5480kJ1.d;

    static {
        C5462kD1 c5462kD1 = new C5462kD1();
        zzb = c5462kD1;
        QG1.h(C5462kD1.class, c5462kD1);
    }

    @Override // defpackage.QG1
    public final Object m(int i, QG1 qg1) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.zzh);
        }
        if (i2 == 2) {
            return new C8340zJ1(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0001\u0001᠌\u0000\u0002\u001a\u0003ᐉ\u0001", new Object[]{"zzd", "zze", C0172By1.e, "zzf", "zzg"});
        }
        if (i2 == 3) {
            return new C5462kD1();
        }
        if (i2 == 4) {
            return new DR1(9, zzb);
        }
        if (i2 == 5) {
            return zzb;
        }
        this.zzh = qg1 == null ? (byte) 0 : (byte) 1;
        return null;
    }

    public final InterfaceC7383uH1 n() {
        return this.zzf;
    }

    public final int o() {
        int i;
        int i2 = this.zze;
        if (i2 != 0) {
            i = 2;
            if (i2 != 1) {
                i = i2 != 2 ? 0 : 3;
            }
        } else {
            i = 1;
        }
        if (i == 0) {
            return 1;
        }
        return i;
    }
}
