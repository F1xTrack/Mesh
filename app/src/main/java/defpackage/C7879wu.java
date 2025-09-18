package defpackage;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

/* renamed from: wu */
/* loaded from: classes.dex */
public final class C7879wu implements InterfaceC7449ud1 {
    public final /* synthetic */ int a;
    public final ES1 b;

    public /* synthetic */ C7879wu(ES1 es1, int i) {
        this.a = i;
        this.b = es1;
    }

    public static AbstractC7067sd1 b(ES1 es1, C3504e20 c3504e20, C8213ye1 c8213ye1, InterfaceC3996gc0 interfaceC3996gc0) {
        AbstractC7067sd1 abstractC7067sd1A;
        Object objC = es1.s(new C8213ye1(interfaceC3996gc0.value())).c();
        boolean zNullSafe = interfaceC3996gc0.nullSafe();
        if (objC instanceof AbstractC7067sd1) {
            abstractC7067sd1A = (AbstractC7067sd1) objC;
        } else {
            if (!(objC instanceof InterfaceC7449ud1)) {
                throw new IllegalArgumentException("Invalid attempt to bind an instance of " + objC.getClass().getName() + " as a @JsonAdapter for " + AbstractC6960s4.i(c8213ye1.b) + ". @JsonAdapter value must be a TypeAdapter, TypeAdapterFactory, JsonSerializer or JsonDeserializer.");
            }
            abstractC7067sd1A = ((InterfaceC7449ud1) objC).a(c3504e20, c8213ye1);
        }
        return (abstractC7067sd1A == null || !zNullSafe) ? abstractC7067sd1A : new E31(abstractC7067sd1A, 3);
    }

    @Override // defpackage.InterfaceC7449ud1
    public final AbstractC7067sd1 a(C3504e20 c3504e20, C8213ye1 c8213ye1) throws NoSuchMethodException, SecurityException {
        Class cls;
        Type[] actualTypeArguments;
        cls = Object.class;
        ES1 es1 = this.b;
        switch (this.a) {
            case 0:
                Class cls2 = c8213ye1.a;
                if (!Collection.class.isAssignableFrom(cls2)) {
                    return null;
                }
                Type type = c8213ye1.b;
                if (type instanceof WildcardType) {
                    type = ((WildcardType) type).getUpperBounds()[0];
                }
                IL1.b(Collection.class.isAssignableFrom(cls2));
                Type typeH = AbstractC6960s4.h(type, cls2, AbstractC6960s4.f(type, cls2, Collection.class), new HashMap());
                cls = typeH instanceof ParameterizedType ? ((ParameterizedType) typeH).getActualTypeArguments()[0] : Object.class;
                AbstractC7067sd1 abstractC7067sd1B = c3504e20.b(new C8213ye1(cls));
                es1.s(c8213ye1);
                return new G8(c3504e20, abstractC7067sd1B, cls);
            case 1:
                InterfaceC3996gc0 interfaceC3996gc0 = (InterfaceC3996gc0) c8213ye1.a.getAnnotation(InterfaceC3996gc0.class);
                if (interfaceC3996gc0 == null) {
                    return null;
                }
                return b(es1, c3504e20, c8213ye1, interfaceC3996gc0);
            default:
                Class cls3 = c8213ye1.a;
                if (!Map.class.isAssignableFrom(cls3)) {
                    return null;
                }
                Type type2 = c8213ye1.b;
                if (type2 == Properties.class) {
                    actualTypeArguments = new Type[]{String.class, String.class};
                } else {
                    if (type2 instanceof WildcardType) {
                        type2 = ((WildcardType) type2).getUpperBounds()[0];
                    }
                    IL1.b(Map.class.isAssignableFrom(cls3));
                    Type typeH2 = AbstractC6960s4.h(type2, cls3, AbstractC6960s4.f(type2, cls3, Map.class), new HashMap());
                    actualTypeArguments = typeH2 instanceof ParameterizedType ? ((ParameterizedType) typeH2).getActualTypeArguments() : new Type[]{cls, cls};
                }
                Type type3 = actualTypeArguments[0];
                AbstractC7067sd1 abstractC7067sd1B2 = (type3 == Boolean.TYPE || type3 == Boolean.class) ? AbstractC0265Dd1.c : c3504e20.b(new C8213ye1(type3));
                AbstractC7067sd1 abstractC7067sd1B3 = c3504e20.b(new C8213ye1(actualTypeArguments[1]));
                es1.s(c8213ye1);
                return new C6142nn0(this, c3504e20, actualTypeArguments[0], abstractC7067sd1B2, actualTypeArguments[1], abstractC7067sd1B3);
        }
    }
}
