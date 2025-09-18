package p000;

/* loaded from: classes.dex */
public final class OU1 extends QG1 implements KI1 {
    private static final OU1 zzb;
    private int zzd;
    private InterfaceC11270uH1 zze = C9994kJ1.f36425d;
    private String zzf = "";

    static {
        OU1 ou1 = new OU1();
        zzb = ou1;
        QG1.m6620h(OU1.class, ou1);
    }

    @Override // p000.QG1
    /* renamed from: m */
    public final Object mo180m(int i, QG1 qg1) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new C11910zJ1(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001a\u0002ဈ\u0000", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i2 == 3) {
            return new OU1();
        }
        if (i2 == 4) {
            return new C10904rQ1(zzb);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
