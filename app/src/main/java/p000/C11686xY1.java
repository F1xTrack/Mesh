package p000;

/* renamed from: xY1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11686xY1 extends QG1 implements KI1 {
    private static final C11686xY1 zzb;
    private int zzd;
    private C10622pD1 zze;
    private InterfaceC11270uH1 zzh;
    private InterfaceC11270uH1 zzi;
    private InterfaceC11270uH1 zzj;
    private InterfaceC11270uH1 zzk;
    private String zzl;
    private byte zzm = 2;
    private String zzf = "";
    private String zzg = "";

    static {
        C11686xY1 c11686xY1 = new C11686xY1();
        zzb = c11686xY1;
        QG1.m6620h(C11686xY1.class, c11686xY1);
    }

    public C11686xY1() {
        C9994kJ1 c9994kJ1 = C9994kJ1.f36425d;
        this.zzh = c9994kJ1;
        this.zzi = c9994kJ1;
        this.zzj = c9994kJ1;
        this.zzk = c9994kJ1;
        this.zzl = "";
    }

    /* renamed from: o */
    public static C11686xY1 m25913o() {
        return zzb;
    }

    @Override // p000.QG1
    /* renamed from: m */
    public final Object mo180m(int i, QG1 qg1) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.zzm);
        }
        if (i2 == 2) {
            return new C11910zJ1(zzb, "\u0004\b\u0000\u0001\u0001\b\b\u0000\u0004\u0001\u0001ဉ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004\u001b\u0005\u001b\u0006\u001a\u0007Л\bဈ\u0003", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", C11771yD1.class, "zzi", B22.class, "zzj", "zzk", C9982kD1.class, "zzl"});
        }
        if (i2 == 3) {
            return new C11686xY1();
        }
        if (i2 == 4) {
            return new C10904rQ1(zzb);
        }
        if (i2 == 5) {
            return zzb;
        }
        this.zzm = qg1 == null ? (byte) 0 : (byte) 1;
        return null;
    }

    /* renamed from: n */
    public final C10622pD1 m25914n() {
        C10622pD1 c10622pD1 = this.zze;
        return c10622pD1 == null ? C10622pD1.m23643n() : c10622pD1;
    }

    /* renamed from: p */
    public final String m25915p() {
        return this.zzf;
    }

    /* renamed from: q */
    public final String m25916q() {
        return this.zzg;
    }

    /* renamed from: r */
    public final InterfaceC11270uH1 m25917r() {
        return this.zzk;
    }

    /* renamed from: s */
    public final InterfaceC11270uH1 m25918s() {
        return this.zzi;
    }

    /* renamed from: t */
    public final InterfaceC11270uH1 m25919t() {
        return this.zzh;
    }

    /* renamed from: u */
    public final InterfaceC11270uH1 m25920u() {
        return this.zzj;
    }
}
