package defpackage;

/* renamed from: sP1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7025sP1 extends QG1 implements KI1 {
    private static final C7025sP1 zzb;
    private int zzd;
    private int zze;
    private TO1 zzh;
    private int zzj;
    private int zzk;
    private int zzn;
    private InterfaceC7383uH1 zzf = C5480kJ1.d;
    private int zzg = -1;
    private String zzi = "";
    private InterfaceC6047nH1 zzl = UG1.d;
    private String zzm = "";

    static {
        C7025sP1 c7025sP1 = new C7025sP1();
        zzb = c7025sP1;
        QG1.h(C7025sP1.class, c7025sP1);
    }

    @Override // defpackage.QG1
    public final Object m(int i, QG1 qg1) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new C8340zJ1(zzb, "\u0001\n\u0000\u0001\u0001\n\n\u0000\u0002\u0000\u0001᠌\u0000\u0002\u001b\u0003င\u0001\u0004ဉ\u0002\u0005ဈ\u0003\u0006᠌\u0004\u0007᠌\u0005\b'\tဈ\u0006\n᠌\u0007", new Object[]{"zzd", "zze", C0172By1.n, "zzf", C2320bP1.class, "zzg", "zzh", "zzi", "zzj", C0172By1.o, "zzk", C0172By1.p, "zzl", "zzm", "zzn", C0172By1.q});
        }
        if (i2 == 3) {
            return new C7025sP1();
        }
        if (i2 == 4) {
            return new DR1(24, zzb);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
