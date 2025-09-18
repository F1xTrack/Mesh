package p000;

/* renamed from: dy1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9180dy1 extends QG1 implements KI1 {
    private static final C9180dy1 zzb;
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
        C9180dy1 c9180dy1 = new C9180dy1();
        zzb = c9180dy1;
        QG1.m6620h(C9180dy1.class, c9180dy1);
    }

    public C9180dy1() {
        GE1 ge1 = JE1.f5402b;
        this.zzf = ge1;
        this.zzg = "";
        this.zzh = ge1;
        this.zzi = 0.25f;
        this.zzj = 0.25f;
        this.zzk = 0.5f;
        this.zzl = 0.85f;
        this.zzm = 1;
    }

    /* renamed from: n */
    public static C8609Yx1 m17804n() {
        return (C8609Yx1) zzb.m6623d();
    }

    /* renamed from: o */
    public static /* synthetic */ void m17805o(C9180dy1 c9180dy1, JE1 je1) {
        je1.getClass();
        c9180dy1.zzd |= 2;
        c9180dy1.zzf = je1;
    }

    /* renamed from: p */
    public static /* synthetic */ void m17806p(C9180dy1 c9180dy1, JE1 je1) {
        je1.getClass();
        c9180dy1.zzd |= 8;
        c9180dy1.zzh = je1;
    }

    @Override // p000.QG1
    /* renamed from: m */
    public final Object mo180m(int i, QG1 qg1) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new C11910zJ1(zzb, "\u0004\t\u0000\u0001\u0001\t\t\u0000\u0000\u0000\u0001ဈ\u0000\u0002ည\u0001\u0003ဈ\u0002\u0004ည\u0003\u0005ခ\u0004\u0006ခ\u0005\u0007ခ\u0006\bခ\u0007\tင\b", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm"});
        }
        if (i2 == 3) {
            return new C9180dy1();
        }
        if (i2 == 4) {
            return new C8609Yx1(zzb);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
