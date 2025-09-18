package p000;

/* renamed from: kD1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9982kD1 extends QG1 implements KI1 {
    private static final C9982kD1 zzb;
    private int zzd;
    private int zze;
    private C9352fI1 zzg;
    private byte zzh = 2;
    private InterfaceC11270uH1 zzf = C9994kJ1.f36425d;

    static {
        C9982kD1 c9982kD1 = new C9982kD1();
        zzb = c9982kD1;
        QG1.m6620h(C9982kD1.class, c9982kD1);
    }

    @Override // p000.QG1
    /* renamed from: m */
    public final Object mo180m(int i, QG1 qg1) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.zzh);
        }
        if (i2 == 2) {
            return new C11910zJ1(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0001\u0001᠌\u0000\u0002\u001a\u0003ᐉ\u0001", new Object[]{"zzd", "zze", C7415By1.f1113e, "zzf", "zzg"});
        }
        if (i2 == 3) {
            return new C9982kD1();
        }
        if (i2 == 4) {
            return new DR1(9, zzb);
        }
        if (i2 == 5) {
            return zzb;
        }
        this.zzh = qg1 == null ? (byte) 0 : (byte) 1;
        return null;
    }

    /* renamed from: n */
    public final InterfaceC11270uH1 m22171n() {
        return this.zzf;
    }

    /* renamed from: o */
    public final int m22172o() {
        int i;
        int i2 = this.zze;
        if (i2 != 0) {
            i = 2;
            if (i2 != 1) {
                i = i2 != 2 ? 0 : 3;
            }
        } else {
            i = 1;
        }
        if (i == 0) {
            return 1;
        }
        return i;
    }
}
