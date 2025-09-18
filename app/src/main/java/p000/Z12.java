package p000;

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
        QG1.m6620h(Z12.class, z12);
        GR1 gr1M3064o = GR1.m3064o();
        EnumC10002kN1 enumC10002kN1 = EnumC10002kN1.f36470b;
        if (gr1M3064o == null) {
            throw new IllegalArgumentException("Null containingTypeDefaultInstance");
        }
    }

    @Override // p000.QG1
    /* renamed from: m */
    public final Object mo180m(int i, QG1 qg1) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.zzh);
        }
        if (i2 == 2) {
            return new C11910zJ1(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0003\u0001ᔅ\u0000\u0002ᔅ\u0001\u0003ᐉ\u0002", new Object[]{"zzd", "zze", "zzf", "zzg"});
        }
        if (i2 == 3) {
            return new Z12();
        }
        if (i2 == 4) {
            return new C10904rQ1(zzb);
        }
        if (i2 == 5) {
            return zzb;
        }
        this.zzh = qg1 == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
