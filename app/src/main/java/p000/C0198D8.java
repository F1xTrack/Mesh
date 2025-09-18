package p000;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.sql.Time;
import java.sql.Timestamp;
import java.util.Date;

/* renamed from: D8 */
/* loaded from: classes2.dex */
public final class C0198D8 implements InterfaceC11186td1 {

    /* renamed from: a */
    public final /* synthetic */ int f1859a;

    public /* synthetic */ C0198D8(int i) {
        this.f1859a = i;
    }

    @Override // p000.InterfaceC11186td1
    /* renamed from: a */
    public final AbstractC10930rd1 mo1562a(C1753aw c1753aw, C11698xe1 c11698xe1) {
        switch (this.f1859a) {
            case 0:
                Type type = c11698xe1.f45726b;
                boolean z = type instanceof GenericArrayType;
                if (!z && (!(type instanceof Class) || !((Class) type).isArray())) {
                    return null;
                }
                Type genericComponentType = z ? ((GenericArrayType) type).getGenericComponentType() : ((Class) type).getComponentType();
                return new C0324F8(c1753aw, c1753aw.m10388g(new C11698xe1(genericComponentType)), AbstractC1378Vu.m8624i(genericComponentType));
            case 1:
                if (c11698xe1.f45725a == Date.class) {
                    return new B31(2);
                }
                return null;
            case 2:
                if (c11698xe1.f45725a == java.sql.Date.class) {
                    return new B31(0);
                }
                return null;
            case 3:
                if (c11698xe1.f45725a == Time.class) {
                    return new B31(1);
                }
                return null;
            case 4:
                if (c11698xe1.f45725a != Timestamp.class) {
                    return null;
                }
                c1753aw.getClass();
                return new D31(c1753aw.m10388g(new C11698xe1(Date.class)), 0);
            default:
                Class superclass = c11698xe1.f45725a;
                if (!Enum.class.isAssignableFrom(superclass) || superclass == Enum.class) {
                    return null;
                }
                if (!superclass.isEnum()) {
                    superclass = superclass.getSuperclass();
                }
                return new C11442vd1(superclass);
        }
    }
}
