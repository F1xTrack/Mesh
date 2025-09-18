package p000;

import java.util.Arrays;
import java.util.List;

/* renamed from: gd0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C9521gd0 extends Q22 {

    /* renamed from: a */
    public final List f27889a;

    public C9521gd0(Class cls) throws SecurityException {
        O90.m5968f(cls, "jClass");
        Object[] declaredMethods = cls.getDeclaredMethods();
        O90.m5967e(declaredMethods, "getDeclaredMethods(...)");
        C8774aq0 c8774aq0 = new C8774aq0(13);
        if (declaredMethods.length != 0) {
            declaredMethods = Arrays.copyOf(declaredMethods, declaredMethods.length);
            O90.m5967e(declaredMethods, "copyOf(...)");
            AbstractC0576J8.m4199z(declaredMethods, c8774aq0);
        }
        this.f27889a = AbstractC0576J8.m4176c(declaredMethods);
    }

    @Override // p000.Q22
    /* renamed from: a */
    public final String mo6561a() {
        return AbstractC7167xu.m25962H(this.f27889a, "", "<init>(", ")V", C9393fd0.f27280f, 24);
    }
}
