package defpackage;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.sql.Time;
import java.sql.Timestamp;
import java.util.Date;

/* loaded from: classes2.dex */
public final class D8 implements InterfaceC7258td1 {
    public final /* synthetic */ int a;

    public /* synthetic */ D8(int i) {
        this.a = i;
    }

    @Override // defpackage.InterfaceC7258td1
    public final AbstractC6876rd1 a(C2226aw c2226aw, C8023xe1 c8023xe1) {
        switch (this.a) {
            case 0:
                Type type = c8023xe1.b;
                boolean z = type instanceof GenericArrayType;
                if (!z && (!(type instanceof Class) || !((Class) type).isArray())) {
                    return null;
                }
                Type genericComponentType = z ? ((GenericArrayType) type).getGenericComponentType() : ((Class) type).getComponentType();
                return new F8(c2226aw, c2226aw.g(new C8023xe1(genericComponentType)), AbstractC1717Vu.i(genericComponentType));
            case 1:
                if (c8023xe1.a == Date.class) {
                    return new B31(2);
                }
                return null;
            case 2:
                if (c8023xe1.a == java.sql.Date.class) {
                    return new B31(0);
                }
                return null;
            case 3:
                if (c8023xe1.a == Time.class) {
                    return new B31(1);
                }
                return null;
            case 4:
                if (c8023xe1.a != Timestamp.class) {
                    return null;
                }
                c2226aw.getClass();
                return new D31(c2226aw.g(new C8023xe1(Date.class)), 0);
            default:
                Class superclass = c8023xe1.a;
                if (!Enum.class.isAssignableFrom(superclass) || superclass == Enum.class) {
                    return null;
                }
                if (!superclass.isEnum()) {
                    superclass = superclass.getSuperclass();
                }
                return new C7640vd1(superclass);
        }
    }
}
