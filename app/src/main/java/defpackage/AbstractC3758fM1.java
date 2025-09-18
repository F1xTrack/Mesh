package defpackage;

/* renamed from: fM1 */
/* loaded from: classes.dex */
public abstract class AbstractC3758fM1 {
    public static void a(int i, int i2, int i3) {
        if (i < 0 || i2 > i3) {
            StringBuilder sbM = AbstractC1705Vq.m("fromIndex: ", ", toIndex: ", i, i2, ", size: ");
            sbM.append(i3);
            throw new IndexOutOfBoundsException(sbM.toString());
        }
        if (i > i2) {
            throw new IllegalArgumentException(AbstractC8235ym.f(i, "fromIndex: ", i2, " > toIndex: "));
        }
    }

    public static KC0 b(String str, C3513e41 c3513e41) {
        C3808fd0 c3808fd0 = C3808fd0.v;
        GK gk = GK.a;
        QF qf = QF.c;
        C6205o61 c6205o61A = GT1.a();
        qf.getClass();
        C1339Qy c1339QyA = AbstractC7625vY1.a(AbstractC7803wU1.c(qf, c6205o61A));
        O90.f(str, "name");
        return new KC0(str, c3513e41, c3808fd0, c1339QyA);
    }
}
