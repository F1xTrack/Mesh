package expo.modules.kotlin.jni;

import java.util.ArrayList;
import java.util.Arrays;
import kotlin.Metadata;
import p000.AbstractC0576J8;
import p000.EnumC1635Zz;
import p000.J20;
import p000.O90;

@Metadata(m22266d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001:\u0001\u000bJ\u000f\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00060\u0005H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\f"}, m22267d2 = {"Lexpo/modules/kotlin/jni/ExpectedType;", "", "", "getCombinedTypes", "()I", "", "Lexpo/modules/kotlin/jni/SingleType;", "getPossibleTypes", "()[Lexpo/modules/kotlin/jni/SingleType;", "getFirstType", "()Lexpo/modules/kotlin/jni/SingleType;", "R02", "expo-modules-core_release"}, m22268k = 1, m22269mv = {1, 9, 0}, m22271xi = 48)
/* loaded from: classes2.dex */
public final class ExpectedType {

    /* renamed from: a */
    public final SingleType[] f26953a;

    /* renamed from: b */
    public final int f26954b;

    public ExpectedType(SingleType... singleTypeArr) {
        O90.m5968f(singleTypeArr, "innerPossibleTypes");
        this.f26953a = singleTypeArr;
        int cppType = 0;
        for (SingleType singleType : singleTypeArr) {
            cppType |= singleType.getCppType();
        }
        this.f26954b = cppType;
    }

    /* renamed from: a */
    public final ExpectedType m18090a(ExpectedType expectedType) {
        O90.m5968f(expectedType, "other");
        J20 j20 = new J20(2);
        j20.m4138e(this.f26953a);
        j20.m4138e(expectedType.f26953a);
        ArrayList arrayList = j20.f5287a;
        return new ExpectedType((SingleType[]) arrayList.toArray(new SingleType[arrayList.size()]));
    }

    /* renamed from: getCombinedTypes, reason: from getter */
    public final int getF26954b() {
        return this.f26954b;
    }

    public final SingleType getFirstType() {
        return (SingleType) AbstractC0576J8.m4187n(this.f26953a);
    }

    /* renamed from: getPossibleTypes, reason: from getter */
    public final SingleType[] getF26953a() {
        return this.f26953a;
    }

    public ExpectedType(EnumC1635Zz... enumC1635ZzArr) {
        ArrayList arrayList = new ArrayList(enumC1635ZzArr.length);
        for (EnumC1635Zz enumC1635Zz : enumC1635ZzArr) {
            arrayList.add(new SingleType(enumC1635Zz, null));
        }
        SingleType[] singleTypeArr = (SingleType[]) arrayList.toArray(new SingleType[0]);
        this((SingleType[]) Arrays.copyOf(singleTypeArr, singleTypeArr.length));
    }
}
