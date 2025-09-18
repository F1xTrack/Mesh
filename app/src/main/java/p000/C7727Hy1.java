package p000;

/* renamed from: Hy1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7727Hy1 extends QG1 implements KI1 {
    private static final C7727Hy1 zzb;
    private int zzd;
    private C10602p32 zzj;
    private GR1 zzk;
    private byte zzl = 2;
    private String zze = "";
    private String zzf = "";
    private InterfaceC10374nH1 zzg = UG1.f11711d;
    private String zzh = "";
    private String zzi = "";

    static {
        C7727Hy1 c7727Hy1 = new C7727Hy1();
        zzb = c7727Hy1;
        QG1.m6620h(C7727Hy1.class, c7727Hy1);
        GR1 gr1M3064o = GR1.m3064o();
        EnumC10002kN1 enumC10002kN1 = EnumC10002kN1.f36470b;
        if (gr1M3064o == null) {
            throw new IllegalArgumentException("Null containingTypeDefaultInstance");
        }
    }

    @Override // p000.QG1
    /* renamed from: m */
    public final Object mo180m(int i, QG1 qg1) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.zzl);
        }
        if (i2 == 2) {
            return new C11910zJ1(zzb, "\u0001\u0007\u0000\u0001\u0001Ǵ\u0007\u0000\u0001\u0002\u0001ᔈ\u0000\u0002ဈ\u0001\u0003ࠞ\u0005ဈ\u0002\u0006ဈ\u0003\u000fᐉ\u0005Ǵဉ\u0004", new Object[]{"zzd", "zze", "zzf", "zzg", C7415By1.f1110b, "zzh", "zzi", "zzk", "zzj"});
        }
        if (i2 == 3) {
            return new C7727Hy1();
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
