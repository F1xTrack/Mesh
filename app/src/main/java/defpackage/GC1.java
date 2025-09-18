package defpackage;

/* loaded from: classes.dex */
public final class GC1 extends QG1 implements KI1 {
    private static final GC1 zzb;
    private byte zzA = 2;
    private int zzd;
    private int zze;
    private JE1 zzf;
    private String zzg;
    private C3872fy1 zzh;
    private int zzi;
    private C8005xY1 zzj;
    private B22 zzk;
    private C8132yD1 zzl;
    private C0874Ky1 zzm;
    private C0175Bz1 zzn;
    private C3684ez1 zzo;
    private U32 zzp;
    private ZV1 zzq;
    private C4071h02 zzr;
    private C5692lQ1 zzs;
    private InterfaceC7383uH1 zzt;
    private InterfaceC6047nH1 zzu;
    private String zzv;
    private InterfaceC7383uH1 zzw;
    private boolean zzx;
    private double zzy;
    private JE1 zzz;

    static {
        GC1 gc1 = new GC1();
        zzb = gc1;
        QG1.h(GC1.class, gc1);
    }

    public GC1() {
        GE1 ge1 = JE1.b;
        this.zzf = ge1;
        this.zzg = "";
        C5480kJ1 c5480kJ1 = C5480kJ1.d;
        this.zzt = c5480kJ1;
        this.zzu = UG1.d;
        this.zzv = "";
        this.zzw = c5480kJ1;
        this.zzx = true;
        this.zzz = ge1;
    }

    public static void B(GC1 gc1, int i, C6939ry1 c6939ry1) {
        InterfaceC7383uH1 interfaceC7383uH1 = gc1.zzt;
        if (!((LD1) interfaceC7383uH1).a) {
            int size = interfaceC7383uH1.size();
            gc1.zzt = interfaceC7383uH1.c(size == 0 ? 10 : size + size);
        }
        gc1.zzt.set(i, c6939ry1);
    }

    public final InterfaceC7383uH1 A() {
        return this.zzt;
    }

    public final boolean C() {
        return (this.zzd & 4096) != 0;
    }

    public final boolean D() {
        return (this.zzd & 32) != 0;
    }

    public final boolean E() {
        return (this.zzd & 8192) != 0;
    }

    public final boolean F() {
        return (this.zzd & 64) != 0;
    }

    public final boolean G() {
        return (this.zzd & 2048) != 0;
    }

    public final boolean H() {
        return (this.zzd & 128) != 0;
    }

    public final boolean I() {
        return (this.zzd & 256) != 0;
    }

    public final boolean J() {
        return (this.zzd & 1024) != 0;
    }

    public final boolean K() {
        return (this.zzd & 512) != 0;
    }

    public final int L() {
        int iB = AbstractC5428k22.b(this.zze);
        if (iB == 0) {
            return 1;
        }
        return iB;
    }

    @Override // defpackage.QG1
    public final Object m(int i, QG1 qg1) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.zzA);
        }
        if (i2 == 2) {
            return new C8340zJ1(zzb, "\u0004\u0016\u0000\u0001\u0001\u0017\u0016\u0000\u0003\u000b\u0001ᴌ\u0000\u0002ᔊ\u0001\u0003ᔈ\u0002\u0004ᴌ\u0004\u0005ᐉ\u0005\u0006ဉ\u0006\u0007ဉ\u0007\bᐉ\b\tᐉ\t\nᐉ\n\u000bЛ\fဈ\u000f\rЛ\u000eည\u0012\u000fᐉ\u000b\u0010ဉ\f\u0011ဉ\r\u0012\u0016\u0013ဉ\u000e\u0014ဇ\u0010\u0015က\u0011\u0017ဉ\u0003", new Object[]{"zzd", "zze", C0172By1.g, "zzf", "zzg", "zzi", C0172By1.h, "zzj", "zzk", "zzl", "zzm", "zzn", "zzo", "zzt", C6939ry1.class, "zzv", "zzw", C6939ry1.class, "zzz", "zzp", "zzq", "zzr", "zzu", "zzs", "zzx", "zzy", "zzh"});
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

    public final int n() {
        int iC = AbstractC6383p22.c(this.zzi);
        if (iC == 0) {
            return 1;
        }
        return iC;
    }

    public final int o() {
        return this.zzt.size();
    }

    public final C8132yD1 p() {
        C8132yD1 c8132yD1 = this.zzl;
        return c8132yD1 == null ? C8132yD1.n() : c8132yD1;
    }

    public final ZV1 q() {
        ZV1 zv1 = this.zzq;
        return zv1 == null ? ZV1.p() : zv1;
    }

    public final C8005xY1 r() {
        C8005xY1 c8005xY1 = this.zzj;
        return c8005xY1 == null ? C8005xY1.o() : c8005xY1;
    }

    public final C4071h02 s() {
        C4071h02 c4071h02 = this.zzr;
        return c4071h02 == null ? C4071h02.n() : c4071h02;
    }

    public final B22 t() {
        B22 b22 = this.zzk;
        return b22 == null ? B22.n() : b22;
    }

    public final U32 u() {
        U32 u32 = this.zzp;
        return u32 == null ? U32.p() : u32;
    }

    public final C0874Ky1 v() {
        C0874Ky1 c0874Ky1 = this.zzm;
        return c0874Ky1 == null ? C0874Ky1.n() : c0874Ky1;
    }

    public final C3684ez1 w() {
        C3684ez1 c3684ez1 = this.zzo;
        return c3684ez1 == null ? C3684ez1.n() : c3684ez1;
    }

    public final C0175Bz1 x() {
        C0175Bz1 c0175Bz1 = this.zzn;
        return c0175Bz1 == null ? C0175Bz1.n() : c0175Bz1;
    }

    public final JE1 y() {
        return this.zzf;
    }

    public final String z() {
        return this.zzg;
    }
}
