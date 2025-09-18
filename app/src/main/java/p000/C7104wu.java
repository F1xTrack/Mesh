package p000;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

/* renamed from: wu */
/* loaded from: classes.dex */
public final class C7104wu implements InterfaceC11314ud1 {

    /* renamed from: a */
    public final /* synthetic */ int f45158a;

    /* renamed from: b */
    public final ES1 f45159b;

    public /* synthetic */ C7104wu(ES1 es1, int i) {
        this.f45158a = i;
        this.f45159b = es1;
    }

    /* renamed from: b */
    public static AbstractC11058sd1 m25724b(ES1 es1, C9189e20 c9189e20, C11825ye1 c11825ye1, InterfaceC9519gc0 interfaceC9519gc0) {
        AbstractC11058sd1 abstractC11058sd1Mo2052a;
        Object objMo913c = es1.m2298s(new C11825ye1(interfaceC9519gc0.value())).mo913c();
        boolean zNullSafe = interfaceC9519gc0.nullSafe();
        if (objMo913c instanceof AbstractC11058sd1) {
            abstractC11058sd1Mo2052a = (AbstractC11058sd1) objMo913c;
        } else {
            if (!(objMo913c instanceof InterfaceC11314ud1)) {
                throw new IllegalArgumentException("Invalid attempt to bind an instance of " + objMo913c.getClass().getName() + " as a @JsonAdapter for " + AbstractC6800s4.m24610i(c11825ye1.f46374b) + ". @JsonAdapter value must be a TypeAdapter, TypeAdapterFactory, JsonSerializer or JsonDeserializer.");
            }
            abstractC11058sd1Mo2052a = ((InterfaceC11314ud1) objMo913c).mo2052a(c9189e20, c11825ye1);
        }
        return (abstractC11058sd1Mo2052a == null || !zNullSafe) ? abstractC11058sd1Mo2052a : new E31(abstractC11058sd1Mo2052a, 3);
    }

    @Override // p000.InterfaceC11314ud1
    /* renamed from: a */
    public final AbstractC11058sd1 mo2052a(C9189e20 c9189e20, C11825ye1 c11825ye1) throws NoSuchMethodException, SecurityException {
        Class cls;
        Type[] actualTypeArguments;
        cls = Object.class;
        ES1 es1 = this.f45159b;
        switch (this.f45158a) {
            case 0:
                Class cls2 = c11825ye1.f46373a;
                if (!Collection.class.isAssignableFrom(cls2)) {
                    return null;
                }
                Type type = c11825ye1.f46374b;
                if (type instanceof WildcardType) {
                    type = ((WildcardType) type).getUpperBounds()[0];
                }
                IL1.m3828b(Collection.class.isAssignableFrom(cls2));
                Type typeM24609h = AbstractC6800s4.m24609h(type, cls2, AbstractC6800s4.m24607f(type, cls2, Collection.class), new HashMap());
                cls = typeM24609h instanceof ParameterizedType ? ((ParameterizedType) typeM24609h).getActualTypeArguments()[0] : Object.class;
                AbstractC11058sd1 abstractC11058sd1M17821b = c9189e20.m17821b(new C11825ye1(cls));
                es1.m2298s(c11825ye1);
                return new C0387G8(c9189e20, abstractC11058sd1M17821b, cls);
            case 1:
                InterfaceC9519gc0 interfaceC9519gc0 = (InterfaceC9519gc0) c11825ye1.f46373a.getAnnotation(InterfaceC9519gc0.class);
                if (interfaceC9519gc0 == null) {
                    return null;
                }
                return m25724b(es1, c9189e20, c11825ye1, interfaceC9519gc0);
            default:
                Class cls3 = c11825ye1.f46373a;
                if (!Map.class.isAssignableFrom(cls3)) {
                    return null;
                }
                Type type2 = c11825ye1.f46374b;
                if (type2 == Properties.class) {
                    actualTypeArguments = new Type[]{String.class, String.class};
                } else {
                    if (type2 instanceof WildcardType) {
                        type2 = ((WildcardType) type2).getUpperBounds()[0];
                    }
                    IL1.m3828b(Map.class.isAssignableFrom(cls3));
                    Type typeM24609h2 = AbstractC6800s4.m24609h(type2, cls3, AbstractC6800s4.m24607f(type2, cls3, Map.class), new HashMap());
                    actualTypeArguments = typeM24609h2 instanceof ParameterizedType ? ((ParameterizedType) typeM24609h2).getActualTypeArguments() : new Type[]{cls, cls};
                }
                Type type3 = actualTypeArguments[0];
                AbstractC11058sd1 abstractC11058sd1M17821b2 = (type3 == Boolean.TYPE || type3 == Boolean.class) ? AbstractC7477Dd1.f2095c : c9189e20.m17821b(new C11825ye1(type3));
                AbstractC11058sd1 abstractC11058sd1M17821b3 = c9189e20.m17821b(new C11825ye1(actualTypeArguments[1]));
                es1.m2298s(c11825ye1);
                return new C10437nn0(this, c9189e20, actualTypeArguments[0], abstractC11058sd1M17821b2, actualTypeArguments[1], abstractC11058sd1M17821b3);
        }
    }
}
