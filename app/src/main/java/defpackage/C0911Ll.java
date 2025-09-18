package defpackage;

import java.lang.reflect.Constructor;
import java.lang.reflect.Member;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;

/* renamed from: Ll, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0911Ll extends AbstractC2002Zl {
    public final /* synthetic */ int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0911Ll(Member member, Type type, Class cls, Type[] typeArr, int i) {
        super(member, type, cls, typeArr);
        this.e = i;
    }

    @Override // defpackage.InterfaceC0755Jl
    public final Object call(Object[] objArr) {
        switch (this.e) {
            case 0:
                O90.f(objArr, "args");
                BQ1.a(this, objArr);
                Constructor constructor = (Constructor) this.a;
                J20 j20 = new J20(2);
                j20.e(objArr);
                j20.a(null);
                ArrayList arrayList = j20.a;
                return constructor.newInstance(arrayList.toArray(new Object[arrayList.size()]));
            default:
                O90.f(objArr, "args");
                BQ1.a(this, objArr);
                return ((Constructor) this.a).newInstance(Arrays.copyOf(objArr, objArr.length));
        }
    }
}
