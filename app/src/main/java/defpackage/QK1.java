package defpackage;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class QK1 extends AbstractC6843rS1 {
    private static final QK1 zzc;
    private static volatile KU1 zzd;
    private int zze;
    private LS1 zzf = C2147aV1.e;
    private String zzg = "";
    private String zzh = "";
    private int zzi;

    static {
        QK1 qk1 = new QK1();
        zzc = qk1;
        AbstractC6843rS1.g(QK1.class, qk1);
    }

    public static PK1 n(QK1 qk1) {
        AbstractC6271oS1 abstractC6271oS1I = zzc.i();
        abstractC6271oS1I.a(qk1);
        return (PK1) abstractC6271oS1I;
    }

    public static /* synthetic */ void p(QK1 qk1, int i, SK1 sk1) {
        qk1.B();
        qk1.zzf.set(i, sk1);
    }

    public static /* synthetic */ void q(QK1 qk1, String str) {
        str.getClass();
        qk1.zze |= 1;
        qk1.zzg = str;
    }

    public static /* synthetic */ void r(QK1 qk1, ArrayList arrayList) {
        qk1.B();
        IP1.b(arrayList, qk1.zzf);
    }

    public static /* synthetic */ void s(QK1 qk1, SK1 sk1) {
        qk1.B();
        qk1.zzf.add(sk1);
    }

    public static void t(QK1 qk1) {
        qk1.zzf = C2147aV1.e;
    }

    public static /* synthetic */ void u(QK1 qk1, String str) {
        str.getClass();
        qk1.zze |= 2;
        qk1.zzh = str;
    }

    public static PK1 v() {
        return (PK1) zzc.i();
    }

    public final boolean A() {
        return (this.zze & 2) != 0;
    }

    public final void B() {
        LS1 ls1 = this.zzf;
        if (((RP1) ls1).a) {
            return;
        }
        this.zzf = ls1.a(ls1.size() << 1);
    }

    @Override // defpackage.AbstractC6843rS1
    public final Object d(int i) {
        int i2 = 3;
        switch (AbstractC7395uL1.a[i - 1]) {
            case 1:
                return new QK1();
            case 2:
                return new PK1(zzc);
            case 3:
                return new YU1(zzc, "\u0004\u0004\u0000\u0001\u0001\t\u0004\u0000\u0001\u0000\u0001\u001b\u0007ဈ\u0000\bဈ\u0001\t᠌\u0002", new Object[]{"zze", "zzf", SK1.class, "zzg", "zzh", "zzi", KJ1.g});
            case 4:
                return zzc;
            case 5:
                KU1 c5856mH1 = zzd;
                if (c5856mH1 == null) {
                    synchronized (QK1.class) {
                        try {
                            c5856mH1 = zzd;
                            if (c5856mH1 == null) {
                                c5856mH1 = new C5856mH1(i2);
                                zzd = c5856mH1;
                            }
                        } finally {
                        }
                    }
                }
                return c5856mH1;
            case 6:
                return (byte) 1;
            default:
                throw null;
        }
    }

    public final int m() {
        return this.zzf.size();
    }

    public final SK1 o(int i) {
        return (SK1) this.zzf.get(i);
    }

    public final String w() {
        return this.zzg;
    }

    public final String x() {
        return this.zzh;
    }

    public final List y() {
        return this.zzf;
    }

    public final boolean z() {
        return (this.zze & 1) != 0;
    }
}
