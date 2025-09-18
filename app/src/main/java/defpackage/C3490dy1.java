package defpackage;

/* renamed from: dy1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3490dy1 extends QG1 implements KI1 {
    private static final C3490dy1 zzb;
    private int zzd;
    private String zze = "";
    private JE1 zzf;
    private String zzg;
    private JE1 zzh;
    private float zzi;
    private float zzj;
    private float zzk;
    private float zzl;
    private int zzm;

    static {
        C3490dy1 c3490dy1 = new C3490dy1();
        zzb = c3490dy1;
        QG1.h(C3490dy1.class, c3490dy1);
    }

    public C3490dy1() {
        GE1 ge1 = JE1.b;
        this.zzf = ge1;
        this.zzg = "";
        this.zzh = ge1;
        this.zzi = 0.25f;
        this.zzj = 0.25f;
        this.zzk = 0.5f;
        this.zzl = 0.85f;
        this.zzm = 1;
    }

    public static C1962Yx1 n() {
        return (C1962Yx1) zzb.d();
    }

    public static /* synthetic */ void o(C3490dy1 c3490dy1, JE1 je1) {
        je1.getClass();
        c3490dy1.zzd |= 2;
        c3490dy1.zzf = je1;
    }

    public static /* synthetic */ void p(C3490dy1 c3490dy1, JE1 je1) {
        je1.getClass();
        c3490dy1.zzd |= 8;
        c3490dy1.zzh = je1;
    }

    @Override // defpackage.QG1
    public final Object m(int i, QG1 qg1) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new C8340zJ1(zzb, "\u0004\t\u0000\u0001\u0001\t\t\u0000\u0000\u0000\u0001ဈ\u0000\u0002ည\u0001\u0003ဈ\u0002\u0004ည\u0003\u0005ခ\u0004\u0006ခ\u0005\u0007ခ\u0006\bခ\u0007\tင\b", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm"});
        }
        if (i2 == 3) {
            return new C3490dy1();
        }
        if (i2 == 4) {
            return new C1962Yx1(zzb);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
