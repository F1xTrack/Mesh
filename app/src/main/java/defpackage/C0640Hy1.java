package defpackage;

/* renamed from: Hy1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0640Hy1 extends QG1 implements KI1 {
    private static final C0640Hy1 zzb;
    private int zzd;
    private C6387p32 zzj;
    private GR1 zzk;
    private byte zzl = 2;
    private String zze = "";
    private String zzf = "";
    private InterfaceC6047nH1 zzg = UG1.d;
    private String zzh = "";
    private String zzi = "";

    static {
        C0640Hy1 c0640Hy1 = new C0640Hy1();
        zzb = c0640Hy1;
        QG1.h(C0640Hy1.class, c0640Hy1);
        GR1 gr1O = GR1.o();
        EnumC5492kN1 enumC5492kN1 = EnumC5492kN1.b;
        if (gr1O == null) {
            throw new IllegalArgumentException("Null containingTypeDefaultInstance");
        }
    }

    @Override // defpackage.QG1
    public final Object m(int i, QG1 qg1) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.zzl);
        }
        if (i2 == 2) {
            return new C8340zJ1(zzb, "\u0001\u0007\u0000\u0001\u0001Ǵ\u0007\u0000\u0001\u0002\u0001ᔈ\u0000\u0002ဈ\u0001\u0003ࠞ\u0005ဈ\u0002\u0006ဈ\u0003\u000fᐉ\u0005Ǵဉ\u0004", new Object[]{"zzd", "zze", "zzf", "zzg", C0172By1.b, "zzh", "zzi", "zzk", "zzj"});
        }
        if (i2 == 3) {
            return new C0640Hy1();
        }
        if (i2 == 4) {
            return new DR1(4, zzb);
        }
        if (i2 == 5) {
            return zzb;
        }
        this.zzl = qg1 == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
