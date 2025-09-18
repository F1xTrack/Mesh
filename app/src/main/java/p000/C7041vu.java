package p000;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

/* renamed from: vu */
/* loaded from: classes2.dex */
public final class C7041vu implements InterfaceC11186td1 {

    /* renamed from: a */
    public final /* synthetic */ int f44595a;

    /* renamed from: b */
    public final C6459my f44596b;

    public /* synthetic */ C7041vu(C6459my c6459my, int i) {
        this.f44595a = i;
        this.f44596b = c6459my;
    }

    /* renamed from: b */
    public static AbstractC10930rd1 m25525b(C6459my c6459my, C1753aw c1753aw, C11698xe1 c11698xe1, InterfaceC9391fc0 interfaceC9391fc0) {
        AbstractC10930rd1 abstractC10930rd1Mo1562a;
        Object objMo386c = c6459my.m23027b(new C11698xe1(interfaceC9391fc0.value())).mo386c();
        boolean zNullSafe = interfaceC9391fc0.nullSafe();
        if (objMo386c instanceof AbstractC10930rd1) {
            abstractC10930rd1Mo1562a = (AbstractC10930rd1) objMo386c;
        } else {
            if (!(objMo386c instanceof InterfaceC11186td1)) {
                throw new IllegalArgumentException("Invalid attempt to bind an instance of " + objMo386c.getClass().getName() + " as a @JsonAdapter for " + AbstractC1378Vu.m8632q(c11698xe1.f45726b) + ". @JsonAdapter value must be a TypeAdapter, TypeAdapterFactory, JsonSerializer or JsonDeserializer.");
            }
            abstractC10930rd1Mo1562a = ((InterfaceC11186td1) objMo386c).mo1562a(c1753aw, c11698xe1);
        }
        return (abstractC10930rd1Mo1562a == null || !zNullSafe) ? abstractC10930rd1Mo1562a : new D31(abstractC10930rd1Mo1562a, 3);
    }

    @Override // p000.InterfaceC11186td1
    /* renamed from: a */
    public final AbstractC10930rd1 mo1562a(C1753aw c1753aw, C11698xe1 c11698xe1) {
        Class cls;
        Type[] actualTypeArguments;
        cls = Object.class;
        C6459my c6459my = this.f44596b;
        switch (this.f44595a) {
            case 0:
                Class cls2 = c11698xe1.f45725a;
                if (!Collection.class.isAssignableFrom(cls2)) {
                    return null;
                }
                Type type = c11698xe1.f45726b;
                if (type instanceof WildcardType) {
                    type = ((WildcardType) type).getUpperBounds()[0];
                }
                FL1.m2583b(Collection.class.isAssignableFrom(cls2));
                Type typeM8629n = AbstractC1378Vu.m8629n(type, cls2, AbstractC1378Vu.m8623h(type, cls2, Collection.class), new HashMap());
                cls = typeM8629n instanceof ParameterizedType ? ((ParameterizedType) typeM8629n).getActualTypeArguments()[0] : Object.class;
                return new C0324F8(c1753aw, cls, c1753aw.m10388g(new C11698xe1(cls)), c6459my.m23027b(c11698xe1));
            case 1:
                InterfaceC9391fc0 interfaceC9391fc0 = (InterfaceC9391fc0) c11698xe1.f45725a.getAnnotation(InterfaceC9391fc0.class);
                if (interfaceC9391fc0 == null) {
                    return null;
                }
                return m25525b(c6459my, c1753aw, c11698xe1, interfaceC9391fc0);
            default:
                Class cls3 = c11698xe1.f45725a;
                if (!Map.class.isAssignableFrom(cls3)) {
                    return null;
                }
                Type type2 = c11698xe1.f45726b;
                if (type2 == Properties.class) {
                    actualTypeArguments = new Type[]{String.class, String.class};
                } else {
                    if (type2 instanceof WildcardType) {
                        type2 = ((WildcardType) type2).getUpperBounds()[0];
                    }
                    FL1.m2583b(Map.class.isAssignableFrom(cls3));
                    Type typeM8629n2 = AbstractC1378Vu.m8629n(type2, cls3, AbstractC1378Vu.m8623h(type2, cls3, Map.class), new HashMap());
                    actualTypeArguments = typeM8629n2 instanceof ParameterizedType ? ((ParameterizedType) typeM8629n2).getActualTypeArguments() : new Type[]{cls, cls};
                }
                Type type3 = actualTypeArguments[0];
                return new C10309mn0(this, c1753aw, actualTypeArguments[0], (type3 == Boolean.TYPE || type3 == Boolean.class) ? AbstractC7425Cd1.f1507c : c1753aw.m10388g(new C11698xe1(type3)), actualTypeArguments[1], c1753aw.m10388g(new C11698xe1(actualTypeArguments[1])), c6459my.m23027b(c11698xe1));
        }
    }
}
