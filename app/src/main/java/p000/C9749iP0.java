package p000;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.Collection;

/* renamed from: iP0 */
/* loaded from: classes2.dex */
public final class C9749iP0 extends AbstractC11157tP0 implements InterfaceC11564wb0 {

    /* renamed from: a */
    public final Type f29121a;

    /* renamed from: b */
    public final AbstractC10005kP0 f29122b;

    public C9749iP0(Type type) {
        AbstractC10005kP0 c9493gP0;
        O90.m5968f(type, "reflectType");
        this.f29121a = type;
        if (type instanceof Class) {
            c9493gP0 = new C9493gP0((Class) type);
        } else if (type instanceof TypeVariable) {
            c9493gP0 = new C11285uP0((TypeVariable) type);
        } else {
            if (!(type instanceof ParameterizedType)) {
                throw new IllegalStateException("Not a classifier type (" + type.getClass() + "): " + type);
            }
            Type rawType = ((ParameterizedType) type).getRawType();
            O90.m5966d(rawType, "null cannot be cast to non-null type java.lang.Class<*>");
            c9493gP0 = new C9493gP0((Class) rawType);
        }
        this.f29122b = c9493gP0;
    }

    @Override // p000.AbstractC11157tP0, p000.InterfaceC8302Ta0
    /* renamed from: a */
    public final WO0 mo7705a(C0664KX c0664kx) {
        O90.m5968f(c0664kx, "fqName");
        return null;
    }

    @Override // p000.AbstractC11157tP0
    /* renamed from: b */
    public final Type mo9728b() {
        return this.f29121a;
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0039  */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.ArrayList m19028c() {
        /*
            r6 = this;
            java.lang.reflect.Type r0 = r6.f29121a
            java.util.List r0 = p000.VO0.m8435c(r0)
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.ArrayList r1 = new java.util.ArrayList
            int r2 = p000.AbstractC7293zu.m26586k(r0)
            r1.<init>(r2)
            java.util.Iterator r0 = r0.iterator()
        L15:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L66
            java.lang.Object r2 = r0.next()
            java.lang.reflect.Type r2 = (java.lang.reflect.Type) r2
            java.lang.String r3 = "type"
            p000.O90.m5968f(r2, r3)
            boolean r3 = r2 instanceof java.lang.Class
            if (r3 == 0) goto L39
            r4 = r2
            java.lang.Class r4 = (java.lang.Class) r4
            boolean r5 = r4.isPrimitive()
            if (r5 == 0) goto L39
            rP0 r2 = new rP0
            r2.<init>(r4)
            goto L62
        L39:
            boolean r4 = r2 instanceof java.lang.reflect.GenericArrayType
            if (r4 != 0) goto L5c
            if (r3 == 0) goto L49
            r3 = r2
            java.lang.Class r3 = (java.lang.Class) r3
            boolean r3 = r3.isArray()
            if (r3 == 0) goto L49
            goto L5c
        L49:
            boolean r3 = r2 instanceof java.lang.reflect.WildcardType
            if (r3 == 0) goto L56
            wP0 r3 = new wP0
            java.lang.reflect.WildcardType r2 = (java.lang.reflect.WildcardType) r2
            r3.<init>(r2)
        L54:
            r2 = r3
            goto L62
        L56:
            iP0 r3 = new iP0
            r3.<init>(r2)
            goto L54
        L5c:
            aP0 r3 = new aP0
            r3.<init>(r2)
            goto L54
        L62:
            r1.add(r2)
            goto L15
        L66:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C9749iP0.m19028c():java.util.ArrayList");
    }

    /* renamed from: d */
    public final boolean m19029d() {
        Type type = this.f29121a;
        if (!(type instanceof Class)) {
            return false;
        }
        TypeVariable[] typeParameters = ((Class) type).getTypeParameters();
        O90.m5967e(typeParameters, "getTypeParameters(...)");
        return !(typeParameters.length == 0);
    }

    @Override // p000.InterfaceC8302Ta0
    public final Collection getAnnotations() {
        return C0779MN.f7117a;
    }
}
