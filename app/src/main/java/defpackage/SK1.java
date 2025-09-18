package defpackage;

import io.appmetrica.analytics.coreutils.internal.system.ConstantDeviceInfo;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/* loaded from: classes.dex */
public final class SK1 extends AbstractC6843rS1 {
    private static final SK1 zzc;
    private static volatile KU1 zzd;
    private String zzaa;
    private long zzab;
    private int zzac;
    private String zzad;
    private String zzae;
    private boolean zzaf;
    private LS1 zzag;
    private String zzah;
    private int zzai;
    private int zzaj;
    private int zzak;
    private String zzal;
    private long zzam;
    private long zzan;
    private String zzao;
    private String zzap;
    private int zzaq;
    private String zzar;
    private TK1 zzas;
    private FS1 zzat;
    private long zzau;
    private long zzav;
    private String zzaw;
    private String zzax;
    private int zzay;
    private boolean zzaz;
    private String zzba;
    private boolean zzbb;
    private OK1 zzbc;
    private String zzbd;
    private LS1 zzbe;
    private String zzbf;
    private long zzbg;
    private boolean zzbh;
    private String zzbi;
    private boolean zzbj;
    private String zzbk;
    private int zzbl;
    private String zzbm;
    private EK1 zzbn;
    private int zzbo;
    private BK1 zzbp;
    private String zzbq;
    private C2117aL1 zzbr;
    private long zzbs;
    private int zze;
    private int zzf;
    private int zzg;
    private LS1 zzh;
    private LS1 zzi;
    private long zzj;
    private long zzk;
    private long zzl;
    private long zzm;
    private long zzn;
    private String zzo;
    private String zzp;
    private String zzq;
    private String zzr;
    private int zzs;
    private String zzt;
    private String zzu;
    private String zzv;
    private long zzw;
    private long zzx;
    private String zzy;
    private boolean zzz;

    static {
        SK1 sk1 = new SK1();
        zzc = sk1;
        AbstractC6843rS1.g(SK1.class, sk1);
    }

    public SK1() {
        C2147aV1 c2147aV1 = C2147aV1.e;
        this.zzh = c2147aV1;
        this.zzi = c2147aV1;
        this.zzo = "";
        this.zzp = "";
        this.zzq = "";
        this.zzr = "";
        this.zzt = "";
        this.zzu = "";
        this.zzv = "";
        this.zzy = "";
        this.zzaa = "";
        this.zzad = "";
        this.zzae = "";
        this.zzag = c2147aV1;
        this.zzah = "";
        this.zzal = "";
        this.zzao = "";
        this.zzap = "";
        this.zzar = "";
        this.zzat = C7607vS1.e;
        this.zzaw = "";
        this.zzax = "";
        this.zzba = "";
        this.zzbd = "";
        this.zzbe = c2147aV1;
        this.zzbf = "";
        this.zzbi = "";
        this.zzbk = "";
        this.zzbm = "";
        this.zzbq = "";
    }

    public static /* synthetic */ void A(SK1 sk1, C2498cL1 c2498cL1) {
        sk1.T0();
        sk1.zzi.add(c2498cL1);
    }

    public static /* synthetic */ void B(SK1 sk1, boolean z) {
        sk1.zzf |= 65536;
        sk1.zzbh = z;
    }

    public static /* synthetic */ void B1(SK1 sk1) {
        sk1.zze &= -17;
        sk1.zzm = 0L;
    }

    public static /* synthetic */ void C1(SK1 sk1, long j) {
        sk1.zze |= 4;
        sk1.zzk = j;
    }

    public static /* synthetic */ void D1(SK1 sk1, String str) {
        str.getClass();
        sk1.zze |= Integer.MIN_VALUE;
        sk1.zzao = str;
    }

    public static /* synthetic */ void F1(SK1 sk1) {
        sk1.zze &= -65537;
        sk1.zzy = zzc.zzy;
    }

    public static /* synthetic */ void G1(SK1 sk1, long j) {
        sk1.zzf |= 32768;
        sk1.zzbg = j;
    }

    public static /* synthetic */ void H1(SK1 sk1, String str) {
        str.getClass();
        sk1.zzf |= 16384;
        sk1.zzbf = str;
    }

    public static /* synthetic */ void J1(SK1 sk1) {
        sk1.zzf &= -8193;
        sk1.zzbd = zzc.zzbd;
    }

    public static void K0(SK1 sk1) {
        sk1.zzag = C2147aV1.e;
    }

    public static /* synthetic */ void K1(SK1 sk1, long j) {
        sk1.zze |= 2;
        sk1.zzj = j;
    }

    public static /* synthetic */ void L0(SK1 sk1, int i) {
        sk1.zzf |= 1048576;
        sk1.zzbl = i;
    }

    public static /* synthetic */ void L1(SK1 sk1, String str) {
        str.getClass();
        sk1.zze |= 16777216;
        sk1.zzah = str;
    }

    public static /* synthetic */ void M0(SK1 sk1, long j) {
        sk1.zze |= 536870912;
        sk1.zzam = j;
    }

    public static /* synthetic */ void N0(SK1 sk1, String str) {
        str.getClass();
        sk1.zze |= 262144;
        sk1.zzaa = str;
    }

    public static /* synthetic */ void N1(SK1 sk1) {
        sk1.zze &= -268435457;
        sk1.zzal = zzc.zzal;
    }

    public static void O0(SK1 sk1, ArrayList arrayList) {
        List list = sk1.zzat;
        if (!((RP1) list).a) {
            sk1.zzat = ((C7607vS1) list).a(list.size() << 1);
        }
        IP1.b(arrayList, sk1.zzat);
    }

    public static /* synthetic */ void O1(SK1 sk1, String str) {
        str.getClass();
        sk1.zze |= 4194304;
        sk1.zzae = str;
    }

    public static /* synthetic */ void P0(SK1 sk1, boolean z) {
        sk1.zze |= 131072;
        sk1.zzz = z;
    }

    public static /* synthetic */ void P1(SK1 sk1) {
        sk1.zze |= 32768;
        sk1.zzx = 114010L;
    }

    public static /* synthetic */ void R1(SK1 sk1) {
        sk1.zze &= -3;
        sk1.zzj = 0L;
    }

    public static /* synthetic */ void S1(SK1 sk1, String str) {
        sk1.zze |= 2097152;
        sk1.zzad = str;
    }

    public static /* synthetic */ void U1(SK1 sk1, String str) {
        str.getClass();
        sk1.zze |= 128;
        sk1.zzp = str;
    }

    public static /* synthetic */ void V0(SK1 sk1) {
        sk1.zze &= -257;
        sk1.zzq = zzc.zzq;
    }

    public static /* synthetic */ void W0(SK1 sk1, int i) {
        sk1.zze |= 33554432;
        sk1.zzai = i;
    }

    public static /* synthetic */ void W1(SK1 sk1) {
        sk1.zze |= 64;
        sk1.zzo = ConstantDeviceInfo.APP_PLATFORM;
    }

    public static /* synthetic */ void X0(SK1 sk1, long j) {
        sk1.zze |= 524288;
        sk1.zzab = j;
    }

    public static /* synthetic */ void Y0(SK1 sk1, String str) {
        str.getClass();
        sk1.zze |= 2048;
        sk1.zzt = str;
    }

    public static /* synthetic */ void Y1(SK1 sk1, String str) {
        str.getClass();
        sk1.zze |= 65536;
        sk1.zzy = str;
    }

    public static void Z0(SK1 sk1, Set set) {
        LS1 ls1 = sk1.zzbe;
        if (!((RP1) ls1).a) {
            sk1.zzbe = ls1.a(ls1.size() << 1);
        }
        IP1.b(set, sk1.zzbe);
    }

    public static /* synthetic */ void a1(SK1 sk1) {
        sk1.zze |= 8388608;
        sk1.zzaf = false;
    }

    public static /* synthetic */ void a2(SK1 sk1, String str) {
        str.getClass();
        sk1.zzf |= 8192;
        sk1.zzbd = str;
    }

    public static /* synthetic */ void c1(SK1 sk1) {
        sk1.zze &= Integer.MAX_VALUE;
        sk1.zzao = zzc.zzao;
    }

    public static /* synthetic */ void c2(SK1 sk1, String str) {
        str.getClass();
        sk1.zze |= 512;
        sk1.zzr = str;
    }

    public static /* synthetic */ void d0(SK1 sk1) {
        sk1.zze &= -262145;
        sk1.zzaa = zzc.zzaa;
    }

    public static /* synthetic */ void d1(SK1 sk1, int i) {
        sk1.zze |= 1048576;
        sk1.zzac = i;
    }

    public static /* synthetic */ void e0(SK1 sk1, int i) {
        sk1.T0();
        sk1.zzi.remove(i);
    }

    public static /* synthetic */ void e1(SK1 sk1, long j) {
        sk1.zzf |= 16;
        sk1.zzau = j;
    }

    public static /* synthetic */ void f0(SK1 sk1, long j) {
        sk1.zzf |= 32;
        sk1.zzav = j;
    }

    public static /* synthetic */ void f1(SK1 sk1, String str) {
        str.getClass();
        sk1.zze |= 8192;
        sk1.zzv = str;
    }

    public static /* synthetic */ void g0(SK1 sk1, String str) {
        str.getClass();
        sk1.zze |= 4096;
        sk1.zzu = str;
    }

    public static /* synthetic */ void h0(SK1 sk1, ArrayList arrayList) {
        sk1.S0();
        IP1.b(arrayList, sk1.zzh);
    }

    public static void h1(SK1 sk1) {
        sk1.zzh = C2147aV1.e;
    }

    public static RK1 h2() {
        return (RK1) zzc.i();
    }

    public static /* synthetic */ void i0(SK1 sk1, boolean z) {
        sk1.zzf |= 262144;
        sk1.zzbj = z;
    }

    public static /* synthetic */ void i1(SK1 sk1, int i) {
        sk1.zzf |= 8388608;
        sk1.zzbo = i;
    }

    public static /* synthetic */ void j1(SK1 sk1, long j) {
        sk1.zze |= 8;
        sk1.zzl = j;
    }

    public static /* synthetic */ void k1(SK1 sk1, String str) {
        str.getClass();
        sk1.zzf |= 131072;
        sk1.zzbi = str;
    }

    public static /* synthetic */ void m1(SK1 sk1) {
        sk1.zze &= -2097153;
        sk1.zzad = zzc.zzad;
    }

    public static /* synthetic */ void n1(SK1 sk1, long j) {
        sk1.zze |= 16384;
        sk1.zzw = j;
    }

    public static /* synthetic */ void o1(SK1 sk1, String str) {
        str.getClass();
        sk1.zzf |= 128;
        sk1.zzax = str;
    }

    public static RK1 p(SK1 sk1) {
        AbstractC6271oS1 abstractC6271oS1I = zzc.i();
        abstractC6271oS1I.a(sk1);
        return (RK1) abstractC6271oS1I;
    }

    public static /* synthetic */ void p1(SK1 sk1) {
        sk1.zze |= 1;
        sk1.zzg = 1;
    }

    public static /* synthetic */ void q(SK1 sk1, int i) {
        sk1.S0();
        sk1.zzh.remove(i);
    }

    public static /* synthetic */ void r(SK1 sk1, int i, KK1 kk1) {
        sk1.S0();
        sk1.zzh.set(i, kk1);
    }

    public static /* synthetic */ void r1(SK1 sk1) {
        sk1.zze &= -131073;
        sk1.zzz = false;
    }

    public static /* synthetic */ void s(SK1 sk1, int i, C2498cL1 c2498cL1) {
        sk1.T0();
        sk1.zzi.set(i, c2498cL1);
    }

    public static /* synthetic */ void s1(SK1 sk1, int i) {
        sk1.zzf |= 2;
        sk1.zzaq = i;
    }

    public static /* synthetic */ void t(SK1 sk1, long j) {
        sk1.zzf |= 134217728;
        sk1.zzbs = j;
    }

    public static /* synthetic */ void t1(SK1 sk1, long j) {
        sk1.zze |= 32;
        sk1.zzn = j;
    }

    public static /* synthetic */ void u(SK1 sk1, String str) {
        str.getClass();
        sk1.zzf |= 4;
        sk1.zzar = str;
    }

    public static /* synthetic */ void u1(SK1 sk1, String str) {
        str.getClass();
        sk1.zzf |= 524288;
        sk1.zzbk = str;
    }

    public static void v(SK1 sk1, ArrayList arrayList) {
        LS1 ls1 = sk1.zzag;
        if (!((RP1) ls1).a) {
            sk1.zzag = ls1.a(ls1.size() << 1);
        }
        IP1.b(arrayList, sk1.zzag);
    }

    public static /* synthetic */ void w(SK1 sk1, BK1 bk1) {
        sk1.zzbp = bk1;
        sk1.zzf |= 16777216;
    }

    public static /* synthetic */ void w1(SK1 sk1) {
        sk1.zze &= -33;
        sk1.zzn = 0L;
    }

    public static /* synthetic */ void x(SK1 sk1, EK1 ek1) {
        sk1.zzbn = ek1;
        sk1.zzf |= 4194304;
    }

    public static /* synthetic */ void x1(SK1 sk1, int i) {
        sk1.zze |= 1024;
        sk1.zzs = i;
    }

    public static /* synthetic */ void y(SK1 sk1, KK1 kk1) {
        sk1.S0();
        sk1.zzh.add(kk1);
    }

    public static /* synthetic */ void y1(SK1 sk1, long j) {
        sk1.zze |= 16;
        sk1.zzm = j;
    }

    public static /* synthetic */ void z(SK1 sk1, C2117aL1 c2117aL1) {
        c2117aL1.getClass();
        sk1.zzbr = c2117aL1;
        sk1.zzf |= 67108864;
    }

    public static /* synthetic */ void z1(SK1 sk1, String str) {
        str.getClass();
        sk1.zze |= 256;
        sk1.zzq = str;
    }

    public final boolean A0() {
        return (this.zze & 16) != 0;
    }

    public final long A1() {
        return this.zzbs;
    }

    public final boolean B0() {
        return (this.zze & 1) != 0;
    }

    public final String C() {
        return this.zzar;
    }

    public final boolean C0() {
        return (this.zzf & 2) != 0;
    }

    public final String D() {
        return this.zzu;
    }

    public final boolean D0() {
        return (this.zze & 8388608) != 0;
    }

    public final String E() {
        return this.zzaa;
    }

    public final boolean E0() {
        return (this.zzf & 8192) != 0;
    }

    public final long E1() {
        return this.zzam;
    }

    public final String F() {
        return this.zzt;
    }

    public final boolean F0() {
        return (this.zzf & 67108864) != 0;
    }

    public final String G() {
        return this.zzv;
    }

    public final boolean G0() {
        return (this.zze & 4) != 0;
    }

    public final String H() {
        return this.zzbi;
    }

    public final boolean H0() {
        return (this.zzf & 32768) != 0;
    }

    public final String I() {
        return this.zzax;
    }

    public final boolean I0() {
        return (this.zze & 1024) != 0;
    }

    public final long I1() {
        return this.zzab;
    }

    public final String J() {
        return this.zzbk;
    }

    public final int J0() {
        return this.zzac;
    }

    public final String K() {
        return this.zzq;
    }

    public final String L() {
        return this.zzao;
    }

    public final String M() {
        return this.zzah;
    }

    public final long M1() {
        return this.zzau;
    }

    public final String N() {
        return this.zzad;
    }

    public final String O() {
        return this.zzp;
    }

    public final String P() {
        return this.zzo;
    }

    public final String Q() {
        return this.zzy;
    }

    public final boolean Q0() {
        return (this.zze & 2) != 0;
    }

    public final long Q1() {
        return this.zzl;
    }

    public final String R() {
        return this.zzbd;
    }

    public final boolean R0() {
        return (this.zze & 32768) != 0;
    }

    public final String S() {
        return this.zzr;
    }

    public final void S0() {
        LS1 ls1 = this.zzh;
        if (((RP1) ls1).a) {
            return;
        }
        this.zzh = ls1.a(ls1.size() << 1);
    }

    public final LS1 T() {
        return this.zzag;
    }

    public final void T0() {
        LS1 ls1 = this.zzi;
        if (((RP1) ls1).a) {
            return;
        }
        this.zzi = ls1.a(ls1.size() << 1);
    }

    public final long T1() {
        return this.zzw;
    }

    public final LS1 U() {
        return this.zzh;
    }

    public final int U0() {
        return this.zzbo;
    }

    public final LS1 V() {
        return this.zzi;
    }

    public final long V1() {
        return this.zzn;
    }

    public final boolean W() {
        return this.zzbh;
    }

    public final boolean X() {
        return this.zzbj;
    }

    public final long X1() {
        return this.zzm;
    }

    public final boolean Y() {
        return this.zzz;
    }

    public final boolean Z() {
        return this.zzaf;
    }

    public final long Z1() {
        return this.zzk;
    }

    public final boolean a0() {
        return (this.zzf & 16777216) != 0;
    }

    public final int b0() {
        return this.zzai;
    }

    public final int b1() {
        return this.zzh.size();
    }

    public final long b2() {
        return this.zzbg;
    }

    public final C2498cL1 c0(int i) {
        return (C2498cL1) this.zzi.get(i);
    }

    @Override // defpackage.AbstractC6843rS1
    public final Object d(int i) {
        switch (AbstractC7395uL1.a[i - 1]) {
            case 1:
                return new SK1();
            case 2:
                return new RK1(zzc);
            case 3:
                return new YU1(zzc, "\u0004A\u0000\u0002\u0001RA\u0000\u0005\u0000\u0001င\u0000\u0002\u001b\u0003\u001b\u0004ဂ\u0001\u0005ဂ\u0002\u0006ဂ\u0003\u0007ဂ\u0005\bဈ\u0006\tဈ\u0007\nဈ\b\u000bဈ\t\fင\n\rဈ\u000b\u000eဈ\f\u0010ဈ\r\u0011ဂ\u000e\u0012ဂ\u000f\u0013ဈ\u0010\u0014ဇ\u0011\u0015ဈ\u0012\u0016ဂ\u0013\u0017င\u0014\u0018ဈ\u0015\u0019ဈ\u0016\u001aဂ\u0004\u001cဇ\u0017\u001d\u001b\u001eဈ\u0018\u001fင\u0019 င\u001a!င\u001b\"ဈ\u001c#ဂ\u001d$ဂ\u001e%ဈ\u001f&ဈ 'င!)ဈ\",ဉ#-\u001d.ဂ$/ဂ%2ဈ&4ဈ'5᠌(7ဇ)9ဈ*:ဇ+;ဉ,?ဈ-@\u001aAဈ.Cဂ/Dဇ0Gဈ1Hဇ2Iဈ3Jင4Kဈ5Lဉ6Mင7Oဉ8Pဈ9Qဉ:Rဂ;", new Object[]{"zze", "zzf", "zzg", "zzh", KK1.class, "zzi", C2498cL1.class, "zzj", "zzk", "zzl", "zzn", "zzo", "zzp", "zzq", "zzr", "zzs", "zzt", "zzu", "zzv", "zzw", "zzx", "zzy", "zzz", "zzaa", "zzab", "zzac", "zzad", "zzae", "zzm", "zzaf", "zzag", GK1.class, "zzah", "zzai", "zzaj", "zzak", "zzal", "zzam", "zzan", "zzao", "zzap", "zzaq", "zzar", "zzas", "zzat", "zzau", "zzav", "zzaw", "zzax", "zzay", KJ1.f, "zzaz", "zzba", "zzbb", "zzbc", "zzbd", "zzbe", "zzbf", "zzbg", "zzbh", "zzbi", "zzbj", "zzbk", "zzbl", "zzbm", "zzbn", "zzbo", "zzbp", "zzbq", "zzbr", "zzbs"});
            case 4:
                return zzc;
            case 5:
                KU1 c5856mH1 = zzd;
                if (c5856mH1 == null) {
                    synchronized (SK1.class) {
                        try {
                            c5856mH1 = zzd;
                            if (c5856mH1 == null) {
                                c5856mH1 = new C5856mH1(3);
                                zzd = c5856mH1;
                            }
                        } finally {
                        }
                    }
                }
                return c5856mH1;
            case 6:
                return (byte) 1;
            default:
                throw null;
        }
    }

    public final long d2() {
        return this.zzj;
    }

    public final long e2() {
        return this.zzx;
    }

    public final BK1 f2() {
        BK1 bk1 = this.zzbp;
        return bk1 == null ? BK1.z() : bk1;
    }

    public final int g1() {
        return this.zzg;
    }

    public final EK1 g2() {
        EK1 ek1 = this.zzbn;
        return ek1 == null ? EK1.p() : ek1;
    }

    public final C2117aL1 i2() {
        C2117aL1 c2117aL1 = this.zzbr;
        return c2117aL1 == null ? C2117aL1.t() : c2117aL1;
    }

    public final boolean j0() {
        return (this.zze & 33554432) != 0;
    }

    public final boolean k0() {
        return (this.zzf & 4194304) != 0;
    }

    public final boolean l0() {
        return (this.zzf & 134217728) != 0;
    }

    public final int l1() {
        return this.zzaq;
    }

    public final String m() {
        return this.zzae;
    }

    public final boolean m0() {
        return (this.zze & 1048576) != 0;
    }

    public final int n() {
        return this.zzbl;
    }

    public final boolean n0() {
        return (this.zze & 536870912) != 0;
    }

    public final KK1 o(int i) {
        return (KK1) this.zzh.get(i);
    }

    public final boolean o0() {
        return (this.zzf & 131072) != 0;
    }

    public final boolean p0() {
        return (this.zzf & 128) != 0;
    }

    public final boolean q0() {
        return (this.zzf & 524288) != 0;
    }

    public final int q1() {
        return this.zzs;
    }

    public final boolean r0() {
        return (this.zzf & 8388608) != 0;
    }

    public final boolean s0() {
        return (this.zze & 524288) != 0;
    }

    public final boolean t0() {
        return (this.zze & Integer.MIN_VALUE) != 0;
    }

    public final boolean u0() {
        return (this.zzf & 16) != 0;
    }

    public final boolean v0() {
        return (this.zze & 8) != 0;
    }

    public final int v1() {
        return this.zzi.size();
    }

    public final boolean w0() {
        return (this.zze & 16384) != 0;
    }

    public final boolean x0() {
        return (this.zzf & 262144) != 0;
    }

    public final boolean y0() {
        return (this.zze & 131072) != 0;
    }

    public final boolean z0() {
        return (this.zze & 32) != 0;
    }
}
