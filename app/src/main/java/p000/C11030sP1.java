package p000;

/* renamed from: sP1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11030sP1 extends QG1 implements KI1 {
    private static final C11030sP1 zzb;
    private int zzd;
    private int zze;
    private TO1 zzh;
    private int zzj;
    private int zzk;
    private int zzn;
    private InterfaceC11270uH1 zzf = C9994kJ1.f36425d;
    private int zzg = -1;
    private String zzi = "";
    private InterfaceC10374nH1 zzl = UG1.f11711d;
    private String zzm = "";

    static {
        C11030sP1 c11030sP1 = new C11030sP1();
        zzb = c11030sP1;
        QG1.m6620h(C11030sP1.class, c11030sP1);
    }

    @Override // p000.QG1
    /* renamed from: m */
    public final Object mo180m(int i, QG1 qg1) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new C11910zJ1(zzb, "\u0001\n\u0000\u0001\u0001\n\n\u0000\u0002\u0000\u0001᠌\u0000\u0002\u001b\u0003င\u0001\u0004ဉ\u0002\u0005ဈ\u0003\u0006᠌\u0004\u0007᠌\u0005\b'\tဈ\u0006\n᠌\u0007", new Object[]{"zzd", "zze", C7415By1.f1122n, "zzf", C8849bP1.class, "zzg", "zzh", "zzi", "zzj", C7415By1.f1123o, "zzk", C7415By1.f1124p, "zzl", "zzm", "zzn", C7415By1.f1125q});
        }
        if (i2 == 3) {
            return new C11030sP1();
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
