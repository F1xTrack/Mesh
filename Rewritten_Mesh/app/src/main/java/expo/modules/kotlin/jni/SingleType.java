package expo.modules.kotlin.jni;

import kotlin.Metadata;
import p000.EnumC1635Zz;
import p000.O90;

@Metadata(m22266d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0011\u0010\b\u001a\u0004\u0018\u00010\u0005H\u0007¢\u0006\u0004\b\b\u0010\u0007¨\u0006\t"}, m22267d2 = {"Lexpo/modules/kotlin/jni/SingleType;", "", "", "getCppType", "()I", "Lexpo/modules/kotlin/jni/ExpectedType;", "getFirstParameterType", "()Lexpo/modules/kotlin/jni/ExpectedType;", "getSecondParameterType", "expo-modules-core_release"}, m22268k = 1, m22269mv = {1, 9, 0}, m22271xi = 48)
/* loaded from: classes2.dex */
public final class SingleType {

    /* renamed from: a */
    public final EnumC1635Zz f26962a;

    /* renamed from: b */
    public final ExpectedType[] f26963b;

    public SingleType(EnumC1635Zz enumC1635Zz, ExpectedType[] expectedTypeArr) {
        O90.m5968f(enumC1635Zz, "expectedCppType");
        this.f26962a = enumC1635Zz;
        this.f26963b = expectedTypeArr;
    }

    public final int getCppType() {
        return this.f26962a.f15266b;
    }

    public final ExpectedType getFirstParameterType() {
        ExpectedType[] expectedTypeArr = this.f26963b;
        if (expectedTypeArr != null) {
            return expectedTypeArr[0];
        }
        return null;
    }

    public final ExpectedType getSecondParameterType() {
        ExpectedType[] expectedTypeArr = this.f26963b;
        if (expectedTypeArr != null) {
            return expectedTypeArr[1];
        }
        return null;
    }
}
