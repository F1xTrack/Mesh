package defpackage;

/* loaded from: classes.dex */
public final class JZ1 extends QG1 implements KI1 {
    private static final JZ1 zzb;
    private InterfaceC7383uH1 zzd;
    private InterfaceC7383uH1 zze;

    static {
        JZ1 jz1 = new JZ1();
        zzb = jz1;
        QG1.h(JZ1.class, jz1);
    }

    public JZ1() {
        C5480kJ1 c5480kJ1 = C5480kJ1.d;
        this.zzd = c5480kJ1;
        this.zze = c5480kJ1;
    }

    @Override // defpackage.QG1
    public final Object m(int i, QG1 qg1) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new C8340zJ1(zzb, "\u0004\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0002\u0000\u0001\u001b\u0002\u001b", new Object[]{"zzd", XV1.class, "zze", XV1.class});
        }
        if (i2 == 3) {
            return new JZ1();
        }
        if (i2 == 4) {
            return new C6837rQ1(zzb);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
