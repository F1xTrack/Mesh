package p000;

/* renamed from: ry1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10972ry1 extends QG1 implements KI1 {
    private static final C10972ry1 zzb;
    private int zzd;
    private int zze;
    private int zzf;
    private byte zzg = 2;

    static {
        C10972ry1 c10972ry1 = new C10972ry1();
        zzb = c10972ry1;
        QG1.m6620h(C10972ry1.class, c10972ry1);
    }

    /* renamed from: p */
    public static C10716py1 m24559p() {
        return (C10716py1) zzb.m6623d();
    }

    /* renamed from: q */
    public static /* synthetic */ void m24560q(C10972ry1 c10972ry1, int i) {
        c10972ry1.zzd |= 1;
        c10972ry1.zze = i;
    }

    /* renamed from: r */
    public static /* synthetic */ void m24561r(C10972ry1 c10972ry1, int i) {
        c10972ry1.zzd |= 2;
        c10972ry1.zzf = i;
    }

    @Override // p000.QG1
    /* renamed from: m */
    public final Object mo180m(int i, QG1 qg1) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.zzg);
        }
        if (i2 == 2) {
            return new C11910zJ1(zzb, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0002\u0001ᔄ\u0000\u0002ᔄ\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i2 == 3) {
            return new C10972ry1();
        }
        if (i2 == 4) {
            return new C10716py1(zzb);
        }
        if (i2 == 5) {
            return zzb;
        }
        this.zzg = qg1 == null ? (byte) 0 : (byte) 1;
        return null;
    }

    /* renamed from: n */
    public final int m24562n() {
        return this.zze;
    }

    /* renamed from: o */
    public final int m24563o() {
        return this.zzf;
    }
}
