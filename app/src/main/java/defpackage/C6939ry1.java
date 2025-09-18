package defpackage;

/* renamed from: ry1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6939ry1 extends QG1 implements KI1 {
    private static final C6939ry1 zzb;
    private int zzd;
    private int zze;
    private int zzf;
    private byte zzg = 2;

    static {
        C6939ry1 c6939ry1 = new C6939ry1();
        zzb = c6939ry1;
        QG1.h(C6939ry1.class, c6939ry1);
    }

    public static C6558py1 p() {
        return (C6558py1) zzb.d();
    }

    public static /* synthetic */ void q(C6939ry1 c6939ry1, int i) {
        c6939ry1.zzd |= 1;
        c6939ry1.zze = i;
    }

    public static /* synthetic */ void r(C6939ry1 c6939ry1, int i) {
        c6939ry1.zzd |= 2;
        c6939ry1.zzf = i;
    }

    @Override // defpackage.QG1
    public final Object m(int i, QG1 qg1) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.zzg);
        }
        if (i2 == 2) {
            return new C8340zJ1(zzb, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0002\u0001ᔄ\u0000\u0002ᔄ\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i2 == 3) {
            return new C6939ry1();
        }
        if (i2 == 4) {
            return new C6558py1(zzb);
        }
        if (i2 == 5) {
            return zzb;
        }
        this.zzg = qg1 == null ? (byte) 0 : (byte) 1;
        return null;
    }

    public final int n() {
        return this.zze;
    }

    public final int o() {
        return this.zzf;
    }
}
