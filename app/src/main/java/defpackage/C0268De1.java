package defpackage;

import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: De1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0268De1 implements TypeVariable, Type {
    public final InterfaceC8025xf0 a;

    public C0268De1(InterfaceC8025xf0 interfaceC8025xf0) {
        O90.f(interfaceC8025xf0, "typeParameter");
        this.a = interfaceC8025xf0;
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
        C8215yf0 c8215yf0 = (C8215yf0) this.a;
        c8215yf0.getClass();
        InterfaceC5927mf0 interfaceC5927mf0 = C8215yf0.d[0];
        Object objInvoke = c8215yf0.b.invoke();
        O90.e(objInvoke, "getValue(...)");
        List list = (List) objInvoke;
        ArrayList arrayList = new ArrayList(AbstractC8449zu.k(list));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(AbstractC1437Se1.b((InterfaceC7454uf0) it.next(), true));
        }
        return (Type[]) arrayList.toArray(new Type[0]);
    }

    @Override // java.lang.reflect.TypeVariable
    public final GenericDeclaration getGenericDeclaration() {
        throw new C1420Rz(AbstractC8235ym.v("An operation is not implemented: ", "getGenericDeclaration() is not yet supported for type variables created from KType: " + this.a), 3);
    }

    @Override // java.lang.reflect.TypeVariable
    public final String getName() {
        return ((C8215yf0) this.a).b();
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
