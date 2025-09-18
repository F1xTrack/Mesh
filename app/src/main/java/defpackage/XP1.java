package defpackage;

/* loaded from: classes.dex */
public final class XP1 extends QG1 implements KI1 {
    private static final XP1 zzb;
    private int zzd;
    private boolean zzf;
    private int zzg;
    private boolean zzj;
    private int zzm;
    private int zzn;
    private boolean zzo;
    private int zze = -1;
    private JE1 zzh = JE1.b;
    private String zzi = "";
    private boolean zzk = true;
    private boolean zzl = true;

    static {
        XP1 xp1 = new XP1();
        zzb = xp1;
        QG1.h(XP1.class, xp1);
    }

    @Override // defpackage.QG1
    public final Object m(int i, QG1 qg1) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            C0172By1 c0172By1 = C0172By1.w;
            return new C8340zJ1(zzb, "\u0001\u000b\u0000\u0001\u0001\u000b\u000b\u0000\u0000\u0000\u0001င\u0000\u0002ဇ\u0001\u0003᠌\u0002\u0004ည\u0003\u0005ဈ\u0004\u0006ဇ\u0005\u0007ဇ\u0006\bဇ\u0007\t᠌\b\n᠌\t\u000bဇ\n", new Object[]{"zzd", "zze", "zzf", "zzg", C0172By1.v, "zzh", "zzi", "zzj", "zzk", "zzl", "zzm", c0172By1, "zzn", c0172By1, "zzo"});
        }
        if (i2 == 3) {
            return new XP1();
        }
        if (i2 == 4) {
            return new DR1(27, zzb);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
