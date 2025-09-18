package defpackage;

/* renamed from: Hf, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0581Hf extends QG1 implements KI1 {
    private static final C0581Hf zzb;
    private int zzd;
    private LO1 zze;
    private C3490dy1 zzf;
    private JZ1 zzg;

    static {
        C0581Hf c0581Hf = new C0581Hf();
        zzb = c0581Hf;
        QG1.h(C0581Hf.class, c0581Hf);
    }

    public static XR1 n() {
        return (XR1) zzb.d();
    }

    public static /* synthetic */ void o(C0581Hf c0581Hf, LO1 lo1) {
        c0581Hf.zze = lo1;
        c0581Hf.zzd |= 1;
    }

    public static /* synthetic */ void p(C0581Hf c0581Hf, C3490dy1 c3490dy1) {
        c0581Hf.zzf = c3490dy1;
        c0581Hf.zzd |= 2;
    }

    @Override // defpackage.QG1
    public final Object m(int i, QG1 qg1) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new C8340zJ1(zzb, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002", new Object[]{"zzd", "zze", "zzf", "zzg"});
        }
        if (i2 == 3) {
            return new C0581Hf();
        }
        if (i2 == 4) {
            return new XR1(zzb);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
