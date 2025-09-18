package p000;

/* loaded from: classes.dex */
public final class JZ1 extends QG1 implements KI1 {
    private static final JZ1 zzb;
    private InterfaceC11270uH1 zzd;
    private InterfaceC11270uH1 zze;

    static {
        JZ1 jz1 = new JZ1();
        zzb = jz1;
        QG1.m6620h(JZ1.class, jz1);
    }

    public JZ1() {
        C9994kJ1 c9994kJ1 = C9994kJ1.f36425d;
        this.zzd = c9994kJ1;
        this.zze = c9994kJ1;
    }

    @Override // p000.QG1
    /* renamed from: m */
    public final Object mo180m(int i, QG1 qg1) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new C11910zJ1(zzb, "\u0004\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0002\u0000\u0001\u001b\u0002\u001b", new Object[]{"zzd", XV1.class, "zze", XV1.class});
        }
        if (i2 == 3) {
            return new JZ1();
        }
        if (i2 == 4) {
            return new C10904rQ1(zzb);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
