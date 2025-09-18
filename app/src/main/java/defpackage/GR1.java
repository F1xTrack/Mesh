package defpackage;

/* loaded from: classes.dex */
public final class GR1 extends AbstractC8331zG1 {
    private static final GR1 zzd;
    private byte zze;

    static {
        GR1 gr1 = new GR1();
        zzd = gr1;
        QG1.h(GR1.class, gr1);
    }

    public GR1() {
        this.zzb = SF1.c;
        this.zze = (byte) 2;
    }

    public static GR1 o() {
        return zzd;
    }

    @Override // defpackage.QG1
    public final Object m(int i, QG1 qg1) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.zze);
        }
        if (i2 == 2) {
            return new C8340zJ1(zzd, "\u0003\u0000", null);
        }
        if (i2 == 3) {
            return new GR1();
        }
        if (i2 == 4) {
            return new DR1(0, zzd);
        }
        if (i2 == 5) {
            return zzd;
        }
        this.zze = qg1 == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
