package p000;

/* renamed from: fI1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9352fI1 extends QG1 implements KI1 {
    private static final C9352fI1 zzb;
    private int zzd;
    private InterfaceC11270uH1 zzf;
    private InterfaceC11270uH1 zzg;
    private InterfaceC11270uH1 zzh;
    private GR1 zzi;
    private C9352fI1 zzj;
    private C10602p32 zzk;
    private byte zzl = 2;
    private String zze = "";

    static {
        C9352fI1 c9352fI1 = new C9352fI1();
        zzb = c9352fI1;
        QG1.m6620h(C9352fI1.class, c9352fI1);
        GR1 gr1M3064o = GR1.m3064o();
        EnumC10002kN1 enumC10002kN1 = EnumC10002kN1.f36470b;
        if (gr1M3064o == null) {
            throw new IllegalArgumentException("Null containingTypeDefaultInstance");
        }
    }

    public C9352fI1() {
        C9994kJ1 c9994kJ1 = C9994kJ1.f36425d;
        this.zzf = c9994kJ1;
        this.zzg = c9994kJ1;
        this.zzh = c9994kJ1;
    }

    @Override // p000.QG1
    /* renamed from: m */
    public final Object mo180m(int i, QG1 qg1) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.zzl);
        }
        if (i2 == 2) {
            return new C11910zJ1(zzb, "\u0001\u0007\u0000\u0001\u0002Ǵ\u0007\u0000\u0003\u0004\u0002Л\u0005Л\u0006\u001b\bᐉ\u0001\nဈ\u0000\u000bᐉ\u0002Ǵဉ\u0003", new Object[]{"zzd", "zzf", C10392nQ1.class, "zzh", C10392nQ1.class, "zzg", OU1.class, "zzi", "zze", "zzj", "zzk"});
        }
        if (i2 == 3) {
            return new C9352fI1();
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
