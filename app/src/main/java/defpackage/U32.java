package defpackage;

/* loaded from: classes.dex */
public final class U32 extends QG1 implements KI1 {
    private static final U32 zzb;
    private int zzd;
    private double zze;
    private double zzf;
    private byte zzg = 2;

    static {
        U32 u32 = new U32();
        zzb = u32;
        QG1.h(U32.class, u32);
    }

    public static U32 p() {
        return zzb;
    }

    @Override // defpackage.QG1
    public final Object m(int i, QG1 qg1) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.zzg);
        }
        if (i2 == 2) {
            return new C8340zJ1(zzb, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0002\u0001ᔀ\u0000\u0002ᔀ\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i2 == 3) {
            return new U32();
        }
        if (i2 == 4) {
            return new C6837rQ1(zzb);
        }
        if (i2 == 5) {
            return zzb;
        }
        this.zzg = qg1 == null ? (byte) 0 : (byte) 1;
        return null;
    }

    public final double n() {
        return this.zze;
    }

    public final double o() {
        return this.zzf;
    }
}
