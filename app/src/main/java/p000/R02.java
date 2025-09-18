package p000;

import expo.modules.kotlin.jni.ExpectedType;
import expo.modules.kotlin.jni.SingleType;

/* loaded from: classes.dex */
public abstract class R02 {
    /* renamed from: a */
    public static ExpectedType m6873a(EnumC1635Zz enumC1635Zz) {
        O90.m5968f(enumC1635Zz, "parameterType");
        return new ExpectedType(new SingleType(EnumC1635Zz.f15257o, new ExpectedType[]{new ExpectedType(enumC1635Zz)}));
    }

    /* renamed from: b */
    public static final int m6874b(int i) {
        return i % 2 == 0 ? 2 : 1;
    }

    /* renamed from: c */
    public static final int m6875c(int i, int i2) {
        int i3 = i2 == -1 ? 1 : 2;
        if (i3 == 1 && i % 10 != 1 && i % 2 == 0) {
            return 2;
        }
        return i3;
    }
}
