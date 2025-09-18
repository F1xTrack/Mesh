package p000;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.sql.Time;
import java.sql.Timestamp;
import java.util.Date;

/* renamed from: E8 */
/* loaded from: classes.dex */
public final class C0261E8 implements InterfaceC11314ud1 {

    /* renamed from: a */
    public final /* synthetic */ int f2502a;

    public /* synthetic */ C0261E8(int i) {
        this.f2502a = i;
    }

    @Override // p000.InterfaceC11314ud1
    /* renamed from: a */
    public final AbstractC11058sd1 mo2052a(C9189e20 c9189e20, C11825ye1 c11825ye1) {
        switch (this.f2502a) {
            case 0:
                Type type = c11825ye1.f46374b;
                boolean z = type instanceof GenericArrayType;
                if (!z && (!(type instanceof Class) || !((Class) type).isArray())) {
                    return null;
                }
                Type genericComponentType = z ? ((GenericArrayType) type).getGenericComponentType() : ((Class) type).getComponentType();
                return new C0387G8(c9189e20, c9189e20.m17821b(new C11825ye1(genericComponentType)), AbstractC6800s4.m24608g(genericComponentType));
            case 1:
                if (c11825ye1.f46373a == Date.class) {
                    return new C6538oD();
                }
                return null;
            case 2:
                if (c11825ye1.f46373a == Object.class) {
                    return new C8788ax0(c9189e20);
                }
                return null;
            case 3:
                if (c11825ye1.f46373a == java.sql.Date.class) {
                    return new C31(0);
                }
                return null;
            case 4:
                if (c11825ye1.f46373a == Time.class) {
                    return new C31(1);
                }
                return null;
            case 5:
                if (c11825ye1.f46373a != Timestamp.class) {
                    return null;
                }
                c9189e20.getClass();
                return new E31(c9189e20.m17821b(new C11825ye1(Date.class)), 0);
            default:
                Class superclass = c11825ye1.f46373a;
                if (!Enum.class.isAssignableFrom(superclass) || superclass == Enum.class) {
                    return null;
                }
                if (!superclass.isEnum()) {
                    superclass = superclass.getSuperclass();
                }
                return new C11569wd1(superclass);
        }
    }
}
