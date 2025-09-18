package defpackage;

import expo.modules.kotlin.jni.ExpectedType;
import expo.modules.kotlin.jni.SingleType;

/* loaded from: classes.dex */
public abstract class R02 {
    public static ExpectedType a(EnumC2044Zz enumC2044Zz) {
        O90.f(enumC2044Zz, "parameterType");
        return new ExpectedType(new SingleType(EnumC2044Zz.o, new ExpectedType[]{new ExpectedType(enumC2044Zz)}));
    }

    public static final int b(int i) {
        return i % 2 == 0 ? 2 : 1;
    }

    public static final int c(int i, int i2) {
        int i3 = i2 == -1 ? 1 : 2;
        if (i3 == 1 && i % 10 != 1 && i % 2 == 0) {
            return 2;
        }
        return i3;
    }
}
