package defpackage;

/* renamed from: aM1 */
/* loaded from: classes.dex */
public final class C2120aM1 extends EE1 {
    private static final C2120aM1 zzb;
    private int zzd;
    private int zze;
    private int zzg;
    private String zzf = "";
    private String zzh = "";

    static {
        C2120aM1 c2120aM1 = new C2120aM1();
        zzb = c2120aM1;
        EE1.i(C2120aM1.class, c2120aM1);
    }

    public static /* synthetic */ void n(C2120aM1 c2120aM1, int i) {
        c2120aM1.zzd |= 1;
        c2120aM1.zze = i;
    }

    public static /* synthetic */ void o(C2120aM1 c2120aM1, String str) {
        str.getClass();
        c2120aM1.zzd |= 2;
        c2120aM1.zzf = str;
    }

    public static /* synthetic */ void p(C2120aM1 c2120aM1, String str) {
        c2120aM1.zzd |= 8;
        c2120aM1.zzh = str;
    }

    public static /* synthetic */ void q(C2120aM1 c2120aM1, int i) {
        c2120aM1.zzg = i - 1;
        c2120aM1.zzd |= 4;
    }

    public static KL1 r() {
        return (KL1) zzb.d();
    }

    @Override // defpackage.EE1
    public final Object m(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new NH1(zzb, "\u0001\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0000\u0000\u0001င\u0000\u0002ဈ\u0001\u0004᠌\u0002\u0005ဈ\u0003", new Object[]{"zzd", "zze", "zzf", "zzg", C7204tL1.c, "zzh"});
        }
        if (i2 == 3) {
            return new C2120aM1();
        }
        if (i2 == 4) {
            return new KL1(zzb);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
