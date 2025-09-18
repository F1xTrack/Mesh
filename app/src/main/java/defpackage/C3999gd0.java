package defpackage;

import java.util.Arrays;
import java.util.List;

/* renamed from: gd0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3999gd0 extends Q22 {
    public final List a;

    public C3999gd0(Class cls) throws SecurityException {
        O90.f(cls, "jClass");
        Object[] declaredMethods = cls.getDeclaredMethods();
        O90.e(declaredMethods, "getDeclaredMethods(...)");
        C2209aq0 c2209aq0 = new C2209aq0(13);
        if (declaredMethods.length != 0) {
            declaredMethods = Arrays.copyOf(declaredMethods, declaredMethods.length);
            O90.e(declaredMethods, "copyOf(...)");
            J8.z(declaredMethods, c2209aq0);
        }
        this.a = J8.c(declaredMethods);
    }

    @Override // defpackage.Q22
    public final String a() {
        return AbstractC8069xu.H(this.a, "", "<init>(", ")V", C3808fd0.f, 24);
    }
}
