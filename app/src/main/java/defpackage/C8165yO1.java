package defpackage;

/* renamed from: yO1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8165yO1 extends QG1 implements KI1 {
    private static final C8165yO1 zzb;
    private int zzd;
    private int zze;
    private int zzf;
    private int zzg;
    private int zzh = 2;

    static {
        C8165yO1 c8165yO1 = new C8165yO1();
        zzb = c8165yO1;
        QG1.h(C8165yO1.class, c8165yO1);
    }

    @Override // defpackage.QG1
    public final Object m(int i, QG1 qg1) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new C8340zJ1(zzb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001᠌\u0000\u0002င\u0001\u0003င\u0002\u0004င\u0003", new Object[]{"zzd", "zze", C0172By1.j, "zzf", "zzg", "zzh"});
        }
        if (i2 == 3) {
            return new C8165yO1();
        }
        if (i2 == 4) {
            return new DR1(20, zzb);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
