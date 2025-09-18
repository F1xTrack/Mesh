package p000;

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
        QG1.m6620h(U32.class, u32);
    }

    /* renamed from: p */
    public static U32 m7869p() {
        return zzb;
    }

    @Override // p000.QG1
    /* renamed from: m */
    public final Object mo180m(int i, QG1 qg1) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.zzg);
        }
        if (i2 == 2) {
            return new C11910zJ1(zzb, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0002\u0001ᔀ\u0000\u0002ᔀ\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i2 == 3) {
            return new U32();
        }
        if (i2 == 4) {
            return new C10904rQ1(zzb);
        }
        if (i2 == 5) {
            return zzb;
        }
        this.zzg = qg1 == null ? (byte) 0 : (byte) 1;
        return null;
    }

    /* renamed from: n */
    public final double m7870n() {
        return this.zze;
    }

    /* renamed from: o */
    public final double m7871o() {
        return this.zzf;
    }
}
