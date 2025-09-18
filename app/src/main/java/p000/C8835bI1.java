package p000;

/* renamed from: bI1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8835bI1 extends QG1 implements KI1 {
    private static final C8835bI1 zzb;
    private InterfaceC11270uH1 zzd = C9994kJ1.f36425d;

    static {
        C8835bI1 c8835bI1 = new C8835bI1();
        zzb = c8835bI1;
        QG1.m6620h(C8835bI1.class, c8835bI1);
    }

    /* renamed from: n */
    public static C9348fG1 m10444n() {
        return (C9348fG1) zzb.m6623d();
    }

    /* renamed from: o */
    public static void m10445o(C8835bI1 c8835bI1, DC1 dc1) {
        InterfaceC11270uH1 interfaceC11270uH1 = c8835bI1.zzd;
        if (!((LD1) interfaceC11270uH1).f6553a) {
            int size = interfaceC11270uH1.size();
            c8835bI1.zzd = interfaceC11270uH1.mo7949c(size == 0 ? 10 : size + size);
        }
        c8835bI1.zzd.add(dc1);
    }

    @Override // p000.QG1
    /* renamed from: m */
    public final Object mo180m(int i, QG1 qg1) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new C11910zJ1(zzb, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzd", DC1.class});
        }
        if (i2 == 3) {
            return new C8835bI1();
        }
        if (i2 == 4) {
            return new C9348fG1(zzb);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
