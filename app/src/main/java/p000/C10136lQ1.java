package p000;

/* renamed from: lQ1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10136lQ1 extends QG1 implements KI1 {
    private static final C10136lQ1 zzb;
    private int zzd;
    private String zze = "";
    private InterfaceC11270uH1 zzf = C9994kJ1.f36425d;

    static {
        C10136lQ1 c10136lQ1 = new C10136lQ1();
        zzb = c10136lQ1;
        QG1.m6620h(C10136lQ1.class, c10136lQ1);
    }

    @Override // p000.QG1
    /* renamed from: m */
    public final Object mo180m(int i, QG1 qg1) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new C11910zJ1(zzb, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b", new Object[]{"zzd", "zze", "zzf", C11114t32.class});
        }
        if (i2 == 3) {
            return new C10136lQ1();
        }
        if (i2 == 4) {
            return new DR1(22, zzb);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
