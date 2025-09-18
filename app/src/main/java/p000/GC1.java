package p000;

/* loaded from: classes.dex */
public final class GC1 extends QG1 implements KI1 {
    private static final GC1 zzb;
    private byte zzA = 2;
    private int zzd;
    private int zze;
    private JE1 zzf;
    private String zzg;
    private C9436fy1 zzh;
    private int zzi;
    private C11686xY1 zzj;
    private B22 zzk;
    private C11771yD1 zzl;
    private C7883Ky1 zzm;
    private C7417Bz1 zzn;
    private C9310ez1 zzo;
    private U32 zzp;
    private ZV1 zzq;
    private C9569h02 zzr;
    private C10136lQ1 zzs;
    private InterfaceC11270uH1 zzt;
    private InterfaceC10374nH1 zzu;
    private String zzv;
    private InterfaceC11270uH1 zzw;
    private boolean zzx;
    private double zzy;
    private JE1 zzz;

    static {
        GC1 gc1 = new GC1();
        zzb = gc1;
        QG1.m6620h(GC1.class, gc1);
    }

    public GC1() {
        GE1 ge1 = JE1.f5402b;
        this.zzf = ge1;
        this.zzg = "";
        C9994kJ1 c9994kJ1 = C9994kJ1.f36425d;
        this.zzt = c9994kJ1;
        this.zzu = UG1.f11711d;
        this.zzv = "";
        this.zzw = c9994kJ1;
        this.zzx = true;
        this.zzz = ge1;
    }

    /* renamed from: B */
    public static void m2971B(GC1 gc1, int i, C10972ry1 c10972ry1) {
        InterfaceC11270uH1 interfaceC11270uH1 = gc1.zzt;
        if (!((LD1) interfaceC11270uH1).f6553a) {
            int size = interfaceC11270uH1.size();
            gc1.zzt = interfaceC11270uH1.mo7949c(size == 0 ? 10 : size + size);
        }
        gc1.zzt.set(i, c10972ry1);
    }

    /* renamed from: A */
    public final InterfaceC11270uH1 m2972A() {
        return this.zzt;
    }

    /* renamed from: C */
    public final boolean m2973C() {
        return (this.zzd & 4096) != 0;
    }

    /* renamed from: D */
    public final boolean m2974D() {
        return (this.zzd & 32) != 0;
    }

    /* renamed from: E */
    public final boolean m2975E() {
        return (this.zzd & 8192) != 0;
    }

    /* renamed from: F */
    public final boolean m2976F() {
        return (this.zzd & 64) != 0;
    }

    /* renamed from: G */
    public final boolean m2977G() {
        return (this.zzd & 2048) != 0;
    }

    /* renamed from: H */
    public final boolean m2978H() {
        return (this.zzd & 128) != 0;
    }

    /* renamed from: I */
    public final boolean m2979I() {
        return (this.zzd & 256) != 0;
    }

    /* renamed from: J */
    public final boolean m2980J() {
        return (this.zzd & 1024) != 0;
    }

    /* renamed from: K */
    public final boolean m2981K() {
        return (this.zzd & 512) != 0;
    }

    /* renamed from: L */
    public final int m2982L() {
        int iM22138b = AbstractC9959k22.m22138b(this.zze);
        if (iM22138b == 0) {
            return 1;
        }
        return iM22138b;
    }

    @Override // p000.QG1
    /* renamed from: m */
    public final Object mo180m(int i, QG1 qg1) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.zzA);
        }
        if (i2 == 2) {
            return new C11910zJ1(zzb, "\u0004\u0016\u0000\u0001\u0001\u0017\u0016\u0000\u0003\u000b\u0001ᴌ\u0000\u0002ᔊ\u0001\u0003ᔈ\u0002\u0004ᴌ\u0004\u0005ᐉ\u0005\u0006ဉ\u0006\u0007ဉ\u0007\bᐉ\b\tᐉ\t\nᐉ\n\u000bЛ\fဈ\u000f\rЛ\u000eည\u0012\u000fᐉ\u000b\u0010ဉ\f\u0011ဉ\r\u0012\u0016\u0013ဉ\u000e\u0014ဇ\u0010\u0015က\u0011\u0017ဉ\u0003", new Object[]{"zzd", "zze", C7415By1.f1115g, "zzf", "zzg", "zzi", C7415By1.f1116h, "zzj", "zzk", "zzl", "zzm", "zzn", "zzo", "zzt", C10972ry1.class, "zzv", "zzw", C10972ry1.class, "zzz", "zzp", "zzq", "zzr", "zzu", "zzs", "zzx", "zzy", "zzh"});
        }
        if (i2 == 3) {
            return new GC1();
        }
        if (i2 == 4) {
            return new KA1(zzb);
        }
        if (i2 == 5) {
            return zzb;
        }
        this.zzA = qg1 == null ? (byte) 0 : (byte) 1;
        return null;
    }

    /* renamed from: n */
    public final int m2983n() {
        int iM23596c = AbstractC10599p22.m23596c(this.zzi);
        if (iM23596c == 0) {
            return 1;
        }
        return iM23596c;
    }

    /* renamed from: o */
    public final int m2984o() {
        return this.zzt.size();
    }

    /* renamed from: p */
    public final C11771yD1 m2985p() {
        C11771yD1 c11771yD1 = this.zzl;
        return c11771yD1 == null ? C11771yD1.m26102n() : c11771yD1;
    }

    /* renamed from: q */
    public final ZV1 m2986q() {
        ZV1 zv1 = this.zzq;
        return zv1 == null ? ZV1.m9540p() : zv1;
    }

    /* renamed from: r */
    public final C11686xY1 m2987r() {
        C11686xY1 c11686xY1 = this.zzj;
        return c11686xY1 == null ? C11686xY1.m25913o() : c11686xY1;
    }

    /* renamed from: s */
    public final C9569h02 m2988s() {
        C9569h02 c9569h02 = this.zzr;
        return c9569h02 == null ? C9569h02.m18681n() : c9569h02;
    }

    /* renamed from: t */
    public final B22 m2989t() {
        B22 b22 = this.zzk;
        return b22 == null ? B22.m470n() : b22;
    }

    /* renamed from: u */
    public final U32 m2990u() {
        U32 u32 = this.zzp;
        return u32 == null ? U32.m7869p() : u32;
    }

    /* renamed from: v */
    public final C7883Ky1 m2991v() {
        C7883Ky1 c7883Ky1 = this.zzm;
        return c7883Ky1 == null ? C7883Ky1.m4795n() : c7883Ky1;
    }

    /* renamed from: w */
    public final C9310ez1 m2992w() {
        C9310ez1 c9310ez1 = this.zzo;
        return c9310ez1 == null ? C9310ez1.m18111n() : c9310ez1;
    }

    /* renamed from: x */
    public final C7417Bz1 m2993x() {
        C7417Bz1 c7417Bz1 = this.zzn;
        return c7417Bz1 == null ? C7417Bz1.m941n() : c7417Bz1;
    }

    /* renamed from: y */
    public final JE1 m2994y() {
        return this.zzf;
    }

    /* renamed from: z */
    public final String m2995z() {
        return this.zzg;
    }
}
