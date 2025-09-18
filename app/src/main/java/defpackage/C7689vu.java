package defpackage;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

/* renamed from: vu */
/* loaded from: classes2.dex */
public final class C7689vu implements InterfaceC7258td1 {
    public final /* synthetic */ int a;
    public final C5983my b;

    public /* synthetic */ C7689vu(C5983my c5983my, int i) {
        this.a = i;
        this.b = c5983my;
    }

    public static AbstractC6876rd1 b(C5983my c5983my, C2226aw c2226aw, C8023xe1 c8023xe1, InterfaceC3805fc0 interfaceC3805fc0) {
        AbstractC6876rd1 abstractC6876rd1A;
        Object objC = c5983my.b(new C8023xe1(interfaceC3805fc0.value())).c();
        boolean zNullSafe = interfaceC3805fc0.nullSafe();
        if (objC instanceof AbstractC6876rd1) {
            abstractC6876rd1A = (AbstractC6876rd1) objC;
        } else {
            if (!(objC instanceof InterfaceC7258td1)) {
                throw new IllegalArgumentException("Invalid attempt to bind an instance of " + objC.getClass().getName() + " as a @JsonAdapter for " + AbstractC1717Vu.q(c8023xe1.b) + ". @JsonAdapter value must be a TypeAdapter, TypeAdapterFactory, JsonSerializer or JsonDeserializer.");
            }
            abstractC6876rd1A = ((InterfaceC7258td1) objC).a(c2226aw, c8023xe1);
        }
        return (abstractC6876rd1A == null || !zNullSafe) ? abstractC6876rd1A : new D31(abstractC6876rd1A, 3);
    }

    @Override // defpackage.InterfaceC7258td1
    public final AbstractC6876rd1 a(C2226aw c2226aw, C8023xe1 c8023xe1) {
        Class cls;
        Type[] actualTypeArguments;
        cls = Object.class;
        C5983my c5983my = this.b;
        switch (this.a) {
            case 0:
                Class cls2 = c8023xe1.a;
                if (!Collection.class.isAssignableFrom(cls2)) {
                    return null;
                }
                Type type = c8023xe1.b;
                if (type instanceof WildcardType) {
                    type = ((WildcardType) type).getUpperBounds()[0];
                }
                FL1.b(Collection.class.isAssignableFrom(cls2));
                Type typeN = AbstractC1717Vu.n(type, cls2, AbstractC1717Vu.h(type, cls2, Collection.class), new HashMap());
                cls = typeN instanceof ParameterizedType ? ((ParameterizedType) typeN).getActualTypeArguments()[0] : Object.class;
                return new F8(c2226aw, cls, c2226aw.g(new C8023xe1(cls)), c5983my.b(c8023xe1));
            case 1:
                InterfaceC3805fc0 interfaceC3805fc0 = (InterfaceC3805fc0) c8023xe1.a.getAnnotation(InterfaceC3805fc0.class);
                if (interfaceC3805fc0 == null) {
                    return null;
                }
                return b(c5983my, c2226aw, c8023xe1, interfaceC3805fc0);
            default:
                Class cls3 = c8023xe1.a;
                if (!Map.class.isAssignableFrom(cls3)) {
                    return null;
                }
                Type type2 = c8023xe1.b;
                if (type2 == Properties.class) {
                    actualTypeArguments = new Type[]{String.class, String.class};
                } else {
                    if (type2 instanceof WildcardType) {
                        type2 = ((WildcardType) type2).getUpperBounds()[0];
                    }
                    FL1.b(Map.class.isAssignableFrom(cls3));
                    Type typeN2 = AbstractC1717Vu.n(type2, cls3, AbstractC1717Vu.h(type2, cls3, Map.class), new HashMap());
                    actualTypeArguments = typeN2 instanceof ParameterizedType ? ((ParameterizedType) typeN2).getActualTypeArguments() : new Type[]{cls, cls};
                }
                Type type3 = actualTypeArguments[0];
                return new C5951mn0(this, c2226aw, actualTypeArguments[0], (type3 == Boolean.TYPE || type3 == Boolean.class) ? AbstractC0187Cd1.c : c2226aw.g(new C8023xe1(type3)), actualTypeArguments[1], c2226aw.g(new C8023xe1(actualTypeArguments[1])), c5983my.b(c8023xe1));
        }
    }
}
