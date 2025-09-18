package defpackage;

/* renamed from: fI1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3746fI1 extends QG1 implements KI1 {
    private static final C3746fI1 zzb;
    private int zzd;
    private InterfaceC7383uH1 zzf;
    private InterfaceC7383uH1 zzg;
    private InterfaceC7383uH1 zzh;
    private GR1 zzi;
    private C3746fI1 zzj;
    private C6387p32 zzk;
    private byte zzl = 2;
    private String zze = "";

    static {
        C3746fI1 c3746fI1 = new C3746fI1();
        zzb = c3746fI1;
        QG1.h(C3746fI1.class, c3746fI1);
        GR1 gr1O = GR1.o();
        EnumC5492kN1 enumC5492kN1 = EnumC5492kN1.b;
        if (gr1O == null) {
            throw new IllegalArgumentException("Null containingTypeDefaultInstance");
        }
    }

    public C3746fI1() {
        C5480kJ1 c5480kJ1 = C5480kJ1.d;
        this.zzf = c5480kJ1;
        this.zzg = c5480kJ1;
        this.zzh = c5480kJ1;
    }

    @Override // defpackage.QG1
    public final Object m(int i, QG1 qg1) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.zzl);
        }
        if (i2 == 2) {
            return new C8340zJ1(zzb, "\u0001\u0007\u0000\u0001\u0002Ǵ\u0007\u0000\u0003\u0004\u0002Л\u0005Л\u0006\u001b\bᐉ\u0001\nဈ\u0000\u000bᐉ\u0002Ǵဉ\u0003", new Object[]{"zzd", "zzf", C6074nQ1.class, "zzh", C6074nQ1.class, "zzg", OU1.class, "zzi", "zze", "zzj", "zzk"});
        }
        if (i2 == 3) {
            return new C3746fI1();
        }
        if (i2 == 4) {
            return new DR1(12, zzb);
        }
        if (i2 == 5) {
            return zzb;
        }
        this.zzl = qg1 == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
