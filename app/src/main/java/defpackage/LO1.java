package defpackage;

/* loaded from: classes.dex */
public final class LO1 extends QG1 implements KI1 {
    private static final LO1 zzb;
    private int zzd;
    private C2299bI1 zzj;
    private DN1 zzl;
    private String zze = "";
    private JE1 zzf = JE1.b;
    private int zzg = 10;
    private float zzh = 0.5f;
    private float zzi = 0.05f;
    private int zzk = 1;
    private int zzm = 320;
    private int zzn = 4;
    private int zzo = 2;

    static {
        LO1 lo1 = new LO1();
        zzb = lo1;
        QG1.h(LO1.class, lo1);
    }

    public static LM1 n() {
        return (LM1) zzb.d();
    }

    public static /* synthetic */ void o(LO1 lo1, C2299bI1 c2299bI1) {
        lo1.zzj = c2299bI1;
        lo1.zzd |= 32;
    }

    public static /* synthetic */ void p(LO1 lo1, JE1 je1) {
        je1.getClass();
        lo1.zzd |= 2;
        lo1.zzf = je1;
    }

    @Override // defpackage.QG1
    public final Object m(int i, QG1 qg1) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new C8340zJ1(zzb, "\u0004\u000b\u0000\u0001\u0001\f\u000b\u0000\u0000\u0000\u0001ဈ\u0000\u0002ည\u0001\u0003ဋ\u0002\u0004ခ\u0003\u0005ခ\u0004\u0006ဉ\u0005\bင\u0006\tဉ\u0007\nင\b\u000bင\t\fင\n", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm", "zzn", "zzo"});
        }
        if (i2 == 3) {
            return new LO1();
        }
        if (i2 == 4) {
            return new LM1(zzb);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
