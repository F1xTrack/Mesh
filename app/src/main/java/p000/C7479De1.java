package p000;

import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: De1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C7479De1 implements TypeVariable, Type {

    /* renamed from: a */
    public final InterfaceC11699xf0 f2129a;

    public C7479De1(InterfaceC11699xf0 interfaceC11699xf0) {
        O90.m5968f(interfaceC11699xf0, "typeParameter");
        this.f2129a = interfaceC11699xf0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof TypeVariable) || !getName().equals(((TypeVariable) obj).getName())) {
            return false;
        }
        getGenericDeclaration();
        throw null;
    }

    @Override // java.lang.reflect.TypeVariable
    public final Type[] getBounds() {
        C11826yf0 c11826yf0 = (C11826yf0) this.f2129a;
        c11826yf0.getClass();
        InterfaceC10293mf0 interfaceC10293mf0 = C11826yf0.f46379d[0];
        Object objInvoke = c11826yf0.f46381b.invoke();
        O90.m5967e(objInvoke, "getValue(...)");
        List list = (List) objInvoke;
        ArrayList arrayList = new ArrayList(AbstractC7293zu.m26586k(list));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(AbstractC8259Se1.m7403b((InterfaceC11317uf0) it.next(), true));
        }
        return (Type[]) arrayList.toArray(new Type[0]);
    }

    @Override // java.lang.reflect.TypeVariable
    public final GenericDeclaration getGenericDeclaration() {
        throw new C1131Rz(AbstractC7222ym.m26245v("An operation is not implemented: ", "getGenericDeclaration() is not yet supported for type variables created from KType: " + this.f2129a), 3);
    }

    @Override // java.lang.reflect.TypeVariable
    public final String getName() {
        return ((C11826yf0) this.f2129a).m26211b();
    }

    @Override // java.lang.reflect.Type
    public final String getTypeName() {
        return getName();
    }

    public final int hashCode() {
        getName();
        getGenericDeclaration();
        throw null;
    }

    public final String toString() {
        return getName();
    }
}
