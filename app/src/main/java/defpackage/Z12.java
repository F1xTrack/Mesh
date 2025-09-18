package defpackage;

/* loaded from: classes.dex */
public final class Z12 extends QG1 implements KI1 {
    private static final Z12 zzb;
    private int zzd;
    private long zze;
    private long zzf;
    private GR1 zzg;
    private byte zzh = 2;

    static {
        Z12 z12 = new Z12();
        zzb = z12;
        QG1.h(Z12.class, z12);
        GR1 gr1O = GR1.o();
        EnumC5492kN1 enumC5492kN1 = EnumC5492kN1.b;
        if (gr1O == null) {
            throw new IllegalArgumentException("Null containingTypeDefaultInstance");
        }
    }

    @Override // defpackage.QG1
    public final Object m(int i, QG1 qg1) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.zzh);
        }
        if (i2 == 2) {
            return new C8340zJ1(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0003\u0001ᔅ\u0000\u0002ᔅ\u0001\u0003ᐉ\u0002", new Object[]{"zzd", "zze", "zzf", "zzg"});
        }
        if (i2 == 3) {
            return new Z12();
        }
        if (i2 == 4) {
            return new C6837rQ1(zzb);
        }
        if (i2 == 5) {
            return zzb;
        }
        this.zzh = qg1 == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
