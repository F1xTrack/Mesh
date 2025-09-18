package p000;

/* loaded from: classes.dex */
public final class GP1 extends QG1 implements KI1 {
    private static final GP1 zzb;
    private int zzd;
    private boolean zze;
    private int zzf;
    private int zzh;
    private int zzi;
    private int zzj;
    private int zzk;
    private boolean zzg = true;
    private String zzl = "";
    private String zzm = "";

    static {
        GP1 gp1 = new GP1();
        zzb = gp1;
        QG1.m6620h(GP1.class, gp1);
    }

    @Override // p000.QG1
    /* renamed from: m */
    public final Object mo180m(int i, QG1 qg1) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            C7415By1 c7415By1 = C7415By1.f1128t;
            return new C11910zJ1(zzb, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0000\u0000\u0001ဇ\u0000\u0002᠌\u0001\u0003ဇ\u0002\u0004᠌\u0003\u0005᠌\u0004\u0006᠌\u0005\u0007᠌\u0006\bဈ\u0007\tဈ\b", new Object[]{"zzd", "zze", "zzf", C7415By1.f1129u, "zzg", "zzh", C7415By1.f1127s, "zzi", c7415By1, "zzj", c7415By1, "zzk", c7415By1, "zzl", "zzm"});
        }
        if (i2 == 3) {
            return new GP1();
        }
        if (i2 == 4) {
            return new DR1(26, zzb);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
