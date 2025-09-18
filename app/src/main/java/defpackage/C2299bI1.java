package defpackage;

/* renamed from: bI1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2299bI1 extends QG1 implements KI1 {
    private static final C2299bI1 zzb;
    private InterfaceC7383uH1 zzd = C5480kJ1.d;

    static {
        C2299bI1 c2299bI1 = new C2299bI1();
        zzb = c2299bI1;
        QG1.h(C2299bI1.class, c2299bI1);
    }

    public static C3740fG1 n() {
        return (C3740fG1) zzb.d();
    }

    public static void o(C2299bI1 c2299bI1, DC1 dc1) {
        InterfaceC7383uH1 interfaceC7383uH1 = c2299bI1.zzd;
        if (!((LD1) interfaceC7383uH1).a) {
            int size = interfaceC7383uH1.size();
            c2299bI1.zzd = interfaceC7383uH1.c(size == 0 ? 10 : size + size);
        }
        c2299bI1.zzd.add(dc1);
    }

    @Override // defpackage.QG1
    public final Object m(int i, QG1 qg1) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new C8340zJ1(zzb, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzd", DC1.class});
        }
        if (i2 == 3) {
            return new C2299bI1();
        }
        if (i2 == 4) {
            return new C3740fG1(zzb);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
