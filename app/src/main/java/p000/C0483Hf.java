package p000;

/* renamed from: Hf */
/* loaded from: classes.dex */
public final class C0483Hf extends QG1 implements KI1 {
    private static final C0483Hf zzb;
    private int zzd;
    private LO1 zze;
    private C9180dy1 zzf;
    private JZ1 zzg;

    static {
        C0483Hf c0483Hf = new C0483Hf();
        zzb = c0483Hf;
        QG1.m6620h(C0483Hf.class, c0483Hf);
    }

    /* renamed from: n */
    public static XR1 m3536n() {
        return (XR1) zzb.m6623d();
    }

    /* renamed from: o */
    public static /* synthetic */ void m3537o(C0483Hf c0483Hf, LO1 lo1) {
        c0483Hf.zze = lo1;
        c0483Hf.zzd |= 1;
    }

    /* renamed from: p */
    public static /* synthetic */ void m3538p(C0483Hf c0483Hf, C9180dy1 c9180dy1) {
        c0483Hf.zzf = c9180dy1;
        c0483Hf.zzd |= 2;
    }

    @Override // p000.QG1
    /* renamed from: m */
    public final Object mo180m(int i, QG1 qg1) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new C11910zJ1(zzb, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002", new Object[]{"zzd", "zze", "zzf", "zzg"});
        }
        if (i2 == 3) {
            return new C0483Hf();
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
