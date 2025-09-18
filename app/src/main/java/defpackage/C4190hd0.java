package defpackage;

import java.lang.reflect.Constructor;

/* renamed from: hd0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4190hd0 extends Q22 {
    public final Constructor a;

    public C4190hd0(Constructor constructor) {
        O90.f(constructor, "constructor");
        this.a = constructor;
    }

    @Override // defpackage.Q22
    public final String a() {
        Class<?>[] parameterTypes = this.a.getParameterTypes();
        O90.e(parameterTypes, "getParameterTypes(...)");
        return J8.w(parameterTypes, "", "<init>(", ")V", C3808fd0.g, 24);
    }
}
