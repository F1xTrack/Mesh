package defpackage;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.List;
import kotlin.Lazy;

/* renamed from: cq0 */
/* loaded from: classes2.dex */
public final class C3275cq0 extends AbstractC1676Vg0 implements InterfaceC5908mZ {
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3275cq0(C7835wf0 c7835wf0, int i, Lazy lazy) {
        super(0);
        this.e = 2;
        this.f = c7835wf0;
        this.h = i;
        this.g = lazy;
    }

    /* JADX WARN: Type inference failed for: r0v26, types: [java.lang.Object, kotlin.Lazy] */
    @Override // defpackage.InterfaceC5908mZ
    public final Object invoke() {
        switch (this.e) {
            case 0:
                C4038gq0 c4038gq0 = (C4038gq0) this.f;
                AbstractC0447Fm0 abstractC0447Fm0A = c4038gq0.a((CD) c4038gq0.a.e);
                List listB0 = abstractC0447Fm0A != null ? AbstractC8069xu.b0(((C7955xI) c4038gq0.a.c).e.h(abstractC0447Fm0A, (AbstractC7709w00) this.g, this.h)) : null;
                return listB0 == null ? MN.a : listB0;
            case 1:
                C4038gq0 c4038gq02 = (C4038gq0) this.f;
                AbstractC0447Fm0 abstractC0447Fm0A2 = c4038gq02.a((CD) c4038gq02.a.e);
                List listA = abstractC0447Fm0A2 != null ? ((C7955xI) c4038gq02.a.c).e.a(abstractC0447Fm0A2, (AbstractC7709w00) this.g, this.h) : null;
                return listA == null ? MN.a : listA;
            default:
                C7835wf0 c7835wf0 = (C7835wf0) this.f;
                AP0 ap0 = c7835wf0.b;
                Type type = ap0 != null ? (Type) ap0.invoke() : null;
                if (type instanceof Class) {
                    Class cls = (Class) type;
                    Class componentType = cls.isArray() ? cls.getComponentType() : Object.class;
                    O90.c(componentType);
                    return componentType;
                }
                boolean z = type instanceof GenericArrayType;
                int i = this.h;
                if (z) {
                    if (i == 0) {
                        Type genericComponentType = ((GenericArrayType) type).getGenericComponentType();
                        O90.c(genericComponentType);
                        return genericComponentType;
                    }
                    throw new C1420Rz("Array type has been queried for a non-0th argument: " + c7835wf0, 1);
                }
                if (!(type instanceof ParameterizedType)) {
                    throw new C1420Rz("Non-generic type has been queried for arguments: " + c7835wf0, 1);
                }
                Type type2 = (Type) ((List) this.g.getValue()).get(i);
                if (type2 instanceof WildcardType) {
                    WildcardType wildcardType = (WildcardType) type2;
                    Type[] lowerBounds = wildcardType.getLowerBounds();
                    O90.e(lowerBounds, "getLowerBounds(...)");
                    Type type3 = (Type) J8.o(lowerBounds);
                    if (type3 == null) {
                        Type[] upperBounds = wildcardType.getUpperBounds();
                        O90.e(upperBounds, "getUpperBounds(...)");
                        type2 = (Type) J8.n(upperBounds);
                    } else {
                        type2 = type3;
                    }
                }
                O90.c(type2);
                return type2;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C3275cq0(C4038gq0 c4038gq0, AbstractC7709w00 abstractC7709w00, int i, int i2) {
        super(0);
        this.e = i2;
        this.f = c4038gq0;
        this.g = abstractC7709w00;
        this.h = i;
    }
}
