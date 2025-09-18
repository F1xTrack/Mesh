package defpackage;

import java.lang.reflect.Member;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

/* renamed from: Zl */
/* loaded from: classes2.dex */
public abstract class AbstractC2002Zl implements InterfaceC0755Jl {
    public final Member a;
    public final Type b;
    public final Class c;
    public final List d;

    public AbstractC2002Zl(Member member, Type type, Class cls, Type[] typeArr) {
        List listD;
        this.a = member;
        this.b = type;
        this.c = cls;
        if (cls != null) {
            J20 j20 = new J20(2);
            j20.a(cls);
            j20.e(typeArr);
            ArrayList arrayList = j20.a;
            listD = AbstractC8259yu.f(arrayList.toArray(new Type[arrayList.size()]));
        } else {
            listD = J8.D(typeArr);
        }
        this.d = listD;
    }

    @Override // defpackage.InterfaceC0755Jl
    public final List a() {
        return this.d;
    }

    @Override // defpackage.InterfaceC0755Jl
    public final Member b() {
        return this.a;
    }

    public void c(Object[] objArr) {
        BQ1.a(this, objArr);
    }

    public final void d(Object obj) {
        if (obj == null || !this.a.getDeclaringClass().isInstance(obj)) {
            throw new IllegalArgumentException("An object member requires the object instance passed as the first argument.");
        }
    }

    @Override // defpackage.InterfaceC0755Jl
    public final Type getReturnType() {
        return this.b;
    }
}
