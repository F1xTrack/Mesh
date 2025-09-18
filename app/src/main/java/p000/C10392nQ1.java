package p000;

/* renamed from: nQ1 */
/* loaded from: classes.dex */
public final class C10392nQ1 extends QG1 implements KI1 {
    private static final C10392nQ1 zzb;
    private int zzd;
    private InterfaceC11270uH1 zzf;
    private int zzg;
    private Z12 zzh;
    private BY1 zzi;
    private GR1 zzj;
    private int zzk;
    private InterfaceC11270uH1 zzl;
    private byte zzm = 2;
    private int zze = 17;

    static {
        C10392nQ1 c10392nQ1 = new C10392nQ1();
        zzb = c10392nQ1;
        QG1.m6620h(C10392nQ1.class, c10392nQ1);
    }

    public C10392nQ1() {
        C9994kJ1 c9994kJ1 = C9994kJ1.f36425d;
        this.zzf = c9994kJ1;
        this.zzl = c9994kJ1;
    }

    @Override // p000.QG1
    /* renamed from: m */
    public final Object mo180m(int i, QG1 qg1) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.zzm);
        }
        if (i2 == 2) {
            return new C11910zJ1(zzb, "\u0001\b\u0000\u0001\u0001\u000f\b\u0000\u0002\u0004\u0001᠌\u0000\u0003Л\u0004င\u0001\u0005ᐉ\u0002\u0006ᐉ\u0003\u0007င\u0005\b\u001b\u000fᐉ\u0004", new Object[]{"zzd", "zze", C7415By1.f1121m, "zzf", C7727Hy1.class, "zzg", "zzh", "zzi", "zzk", "zzl", C8921bz1.class, "zzj"});
        }
        if (i2 == 3) {
            return new C10392nQ1();
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
