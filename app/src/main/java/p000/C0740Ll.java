package p000;

import java.lang.reflect.Constructor;
import java.lang.reflect.Member;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;

/* renamed from: Ll */
/* loaded from: classes2.dex */
public final class C0740Ll extends AbstractC1621Zl {

    /* renamed from: e */
    public final /* synthetic */ int f6827e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0740Ll(Member member, Type type, Class cls, Type[] typeArr, int i) {
        super(member, type, cls, typeArr);
        this.f6827e = i;
    }

    @Override // p000.InterfaceC0615Jl
    public final Object call(Object[] objArr) {
        switch (this.f6827e) {
            case 0:
                O90.m5968f(objArr, "args");
                BQ1.m716a(this, objArr);
                Constructor constructor = (Constructor) this.f15104a;
                J20 j20 = new J20(2);
                j20.m4138e(objArr);
                j20.m4134a(null);
                ArrayList arrayList = j20.f5287a;
                return constructor.newInstance(arrayList.toArray(new Object[arrayList.size()]));
            default:
                O90.m5968f(objArr, "args");
                BQ1.m716a(this, objArr);
                return ((Constructor) this.f15104a).newInstance(Arrays.copyOf(objArr, objArr.length));
        }
    }
}
