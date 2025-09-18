package p000;

import java.lang.reflect.Member;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

/* renamed from: Zl */
/* loaded from: classes2.dex */
public abstract class AbstractC1621Zl implements InterfaceC0615Jl {

    /* renamed from: a */
    public final Member f15104a;

    /* renamed from: b */
    public final Type f15105b;

    /* renamed from: c */
    public final Class f15106c;

    /* renamed from: d */
    public final List f15107d;

    public AbstractC1621Zl(Member member, Type type, Class cls, Type[] typeArr) {
        List listM4173D;
        this.f15104a = member;
        this.f15105b = type;
        this.f15106c = cls;
        if (cls != null) {
            J20 j20 = new J20(2);
            j20.m4134a(cls);
            j20.m4138e(typeArr);
            ArrayList arrayList = j20.f5287a;
            listM4173D = AbstractC7230yu.m26275f(arrayList.toArray(new Type[arrayList.size()]));
        } else {
            listM4173D = AbstractC0576J8.m4173D(typeArr);
        }
        this.f15107d = listM4173D;
    }

    @Override // p000.InterfaceC0615Jl
    /* renamed from: a */
    public final List mo3319a() {
        return this.f15107d;
    }

    @Override // p000.InterfaceC0615Jl
    /* renamed from: b */
    public final Member mo3320b() {
        return this.f15104a;
    }

    /* renamed from: c */
    public void mo6129c(Object[] objArr) {
        BQ1.m716a(this, objArr);
    }

    /* renamed from: d */
    public final void m9585d(Object obj) {
        if (obj == null || !this.f15104a.getDeclaringClass().isInstance(obj)) {
            throw new IllegalArgumentException("An object member requires the object instance passed as the first argument.");
        }
    }

    @Override // p000.InterfaceC0615Jl
    public final Type getReturnType() {
        return this.f15105b;
    }
}
