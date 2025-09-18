package p000;

/* renamed from: fM1 */
/* loaded from: classes.dex */
public abstract class AbstractC9360fM1 {
    /* renamed from: a */
    public static void m18221a(int i, int i2, int i3) {
        if (i < 0 || i2 > i3) {
            StringBuilder sbM8594m = AbstractC1374Vq.m8594m("fromIndex: ", ", toIndex: ", i, i2, ", size: ");
            sbM8594m.append(i3);
            throw new IndexOutOfBoundsException(sbM8594m.toString());
        }
        if (i > i2) {
            throw new IllegalArgumentException(AbstractC7222ym.m26229f(i, "fromIndex: ", i2, " > toIndex: "));
        }
    }

    /* renamed from: b */
    public static KC0 m18222b(String str, C9196e41 c9196e41) {
        C9393fd0 c9393fd0 = C9393fd0.f27296v;
        C0399GK c0399gk = C0399GK.f3694a;
        ExecutorC1023QF executorC1023QF = ExecutorC1023QF.f9548c;
        C10480o61 c10480o61M3069a = GT1.m3069a();
        executorC1023QF.getClass();
        C1068Qy c1068QyM25444a = AbstractC11432vY1.m25444a(AbstractC11551wU1.m25639c(executorC1023QF, c10480o61M3069a));
        O90.m5968f(str, "name");
        return new KC0(str, c9196e41, c9393fd0, c1068QyM25444a);
    }
}
