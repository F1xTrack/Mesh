package defpackage;

/* renamed from: nQ1 */
/* loaded from: classes.dex */
public final class C6074nQ1 extends QG1 implements KI1 {
    private static final C6074nQ1 zzb;
    private int zzd;
    private InterfaceC7383uH1 zzf;
    private int zzg;
    private Z12 zzh;
    private BY1 zzi;
    private GR1 zzj;
    private int zzk;
    private InterfaceC7383uH1 zzl;
    private byte zzm = 2;
    private int zze = 17;

    static {
        C6074nQ1 c6074nQ1 = new C6074nQ1();
        zzb = c6074nQ1;
        QG1.h(C6074nQ1.class, c6074nQ1);
    }

    public C6074nQ1() {
        C5480kJ1 c5480kJ1 = C5480kJ1.d;
        this.zzf = c5480kJ1;
        this.zzl = c5480kJ1;
    }

    @Override // defpackage.QG1
    public final Object m(int i, QG1 qg1) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.zzm);
        }
        if (i2 == 2) {
            return new C8340zJ1(zzb, "\u0001\b\u0000\u0001\u0001\u000f\b\u0000\u0002\u0004\u0001᠌\u0000\u0003Л\u0004င\u0001\u0005ᐉ\u0002\u0006ᐉ\u0003\u0007င\u0005\b\u001b\u000fᐉ\u0004", new Object[]{"zzd", "zze", C0172By1.m, "zzf", C0640Hy1.class, "zzg", "zzh", "zzi", "zzk", "zzl", C2427bz1.class, "zzj"});
        }
        if (i2 == 3) {
            return new C6074nQ1();
        }
        if (i2 == 4) {
            return new DR1(14, zzb);
        }
        if (i2 == 5) {
            return zzb;
        }
        this.zzm = qg1 == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
