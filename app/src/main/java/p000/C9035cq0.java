package p000;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.List;
import kotlin.Lazy;

/* renamed from: cq0 */
/* loaded from: classes2.dex */
public final class C9035cq0 extends AbstractC8418Vg0 implements InterfaceC6434mZ {

    /* renamed from: e */
    public final /* synthetic */ int f25674e;

    /* renamed from: f */
    public final /* synthetic */ Object f25675f;

    /* renamed from: g */
    public final /* synthetic */ Object f25676g;

    /* renamed from: h */
    public final /* synthetic */ int f25677h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9035cq0(C11572wf0 c11572wf0, int i, Lazy lazy) {
        super(0);
        this.f25674e = 2;
        this.f25675f = c11572wf0;
        this.f25677h = i;
        this.f25676g = lazy;
    }

    /* JADX WARN: Type inference failed for: r0v26, types: [java.lang.Object, kotlin.Lazy] */
    @Override // p000.InterfaceC6434mZ
    public final Object invoke() {
        switch (this.f25674e) {
            case 0:
                C9547gq0 c9547gq0 = (C9547gq0) this.f25675f;
                AbstractC7598Fm0 abstractC7598Fm0M18662a = c9547gq0.m18662a((InterfaceC0140CD) c9547gq0.f28057a.f12664e);
                List listM25982b0 = abstractC7598Fm0M18662a != null ? AbstractC7167xu.m25982b0(((C7129xI) c9547gq0.f28057a.f12662c).f45522e.mo46h(abstractC7598Fm0M18662a, (AbstractC11487w00) this.f25676g, this.f25677h)) : null;
                return listM25982b0 == null ? C0779MN.f7117a : listM25982b0;
            case 1:
                C9547gq0 c9547gq02 = (C9547gq0) this.f25675f;
                AbstractC7598Fm0 abstractC7598Fm0M18662a2 = c9547gq02.m18662a((InterfaceC0140CD) c9547gq02.f28057a.f12664e);
                List listMo41a = abstractC7598Fm0M18662a2 != null ? ((C7129xI) c9547gq02.f28057a.f12662c).f45522e.mo41a(abstractC7598Fm0M18662a2, (AbstractC11487w00) this.f25676g, this.f25677h) : null;
                return listMo41a == null ? C0779MN.f7117a : listMo41a;
            default:
                C11572wf0 c11572wf0 = (C11572wf0) this.f25675f;
                AP0 ap0 = c11572wf0.f45017b;
                Type type = ap0 != null ? (Type) ap0.invoke() : null;
                if (type instanceof Class) {
                    Class cls = (Class) type;
                    Class componentType = cls.isArray() ? cls.getComponentType() : Object.class;
                    O90.m5965c(componentType);
                    return componentType;
                }
                boolean z = type instanceof GenericArrayType;
                int i = this.f25677h;
                if (z) {
                    if (i == 0) {
                        Type genericComponentType = ((GenericArrayType) type).getGenericComponentType();
                        O90.m5965c(genericComponentType);
                        return genericComponentType;
                    }
                    throw new C1131Rz("Array type has been queried for a non-0th argument: " + c11572wf0, 1);
                }
                if (!(type instanceof ParameterizedType)) {
                    throw new C1131Rz("Non-generic type has been queried for arguments: " + c11572wf0, 1);
                }
                Type type2 = (Type) ((List) this.f25676g.getValue()).get(i);
                if (type2 instanceof WildcardType) {
                    WildcardType wildcardType = (WildcardType) type2;
                    Type[] lowerBounds = wildcardType.getLowerBounds();
                    O90.m5967e(lowerBounds, "getLowerBounds(...)");
                    Type type3 = (Type) AbstractC0576J8.m4188o(lowerBounds);
                    if (type3 == null) {
                        Type[] upperBounds = wildcardType.getUpperBounds();
                        O90.m5967e(upperBounds, "getUpperBounds(...)");
                        type2 = (Type) AbstractC0576J8.m4187n(upperBounds);
                    } else {
                        type2 = type3;
                    }
                }
                O90.m5965c(type2);
                return type2;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C9035cq0(C9547gq0 c9547gq0, AbstractC11487w00 abstractC11487w00, int i, int i2) {
        super(0);
        this.f25674e = i2;
        this.f25675f = c9547gq0;
        this.f25676g = abstractC11487w00;
        this.f25677h = i;
    }
}
