package defpackage;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.sql.Time;
import java.sql.Timestamp;
import java.util.Date;

/* loaded from: classes.dex */
public final class E8 implements InterfaceC7449ud1 {
    public final /* synthetic */ int a;

    public /* synthetic */ E8(int i) {
        this.a = i;
    }

    @Override // defpackage.InterfaceC7449ud1
    public final AbstractC7067sd1 a(C3504e20 c3504e20, C8213ye1 c8213ye1) {
        switch (this.a) {
            case 0:
                Type type = c8213ye1.b;
                boolean z = type instanceof GenericArrayType;
                if (!z && (!(type instanceof Class) || !((Class) type).isArray())) {
                    return null;
                }
                Type genericComponentType = z ? ((GenericArrayType) type).getGenericComponentType() : ((Class) type).getComponentType();
                return new G8(c3504e20, c3504e20.b(new C8213ye1(genericComponentType)), AbstractC6960s4.g(genericComponentType));
            case 1:
                if (c8213ye1.a == Date.class) {
                    return new C6224oD();
                }
                return null;
            case 2:
                if (c8213ye1.a == Object.class) {
                    return new C2230ax0(c3504e20);
                }
                return null;
            case 3:
                if (c8213ye1.a == java.sql.Date.class) {
                    return new C31(0);
                }
                return null;
            case 4:
                if (c8213ye1.a == Time.class) {
                    return new C31(1);
                }
                return null;
            case 5:
                if (c8213ye1.a != Timestamp.class) {
                    return null;
                }
                c3504e20.getClass();
                return new E31(c3504e20.b(new C8213ye1(Date.class)), 0);
            default:
                Class superclass = c8213ye1.a;
                if (!Enum.class.isAssignableFrom(superclass) || superclass == Enum.class) {
                    return null;
                }
                if (!superclass.isEnum()) {
                    superclass = superclass.getSuperclass();
                }
                return new C7830wd1(superclass);
        }
    }
}
