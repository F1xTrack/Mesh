package defpackage;

/* loaded from: classes.dex */
public final class BY1 extends QG1 implements KI1 {
    private static final BY1 zzb;
    private int zzd;
    private GR1 zzj;
    private byte zzk = 2;
    private InterfaceC6047nH1 zze = UG1.d;
    private InterfaceC5283jH1 zzf = ZF1.d;
    private boolean zzg = true;
    private String zzh = "";
    private String zzi = "";

    static {
        BY1 by1 = new BY1();
        zzb = by1;
        QG1.h(BY1.class, by1);
    }

    @Override // defpackage.QG1
    public final Object m(int i, QG1 qg1) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.zzk);
        }
        if (i2 == 2) {
            return new C8340zJ1(zzb, "\u0001\u0006\u0000\u0001\u0001\u000f\u0006\u0000\u0002\u0001\u0001\u0016\u0002\u0013\u0003ဇ\u0000\u0004ဈ\u0001\u0005ဈ\u0002\u000fᐉ\u0003", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj"});
        }
        if (i2 == 3) {
            return new BY1();
        }
        if (i2 == 4) {
            return new C6837rQ1(zzb);
        }
        if (i2 == 5) {
            return zzb;
        }
        this.zzk = qg1 == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
