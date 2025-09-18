package defpackage;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.Collection;

/* renamed from: iP0 */
/* loaded from: classes2.dex */
public final class C4339iP0 extends AbstractC7215tP0 implements InterfaceC7823wb0 {
    public final Type a;
    public final AbstractC5497kP0 b;

    public C4339iP0(Type type) {
        AbstractC5497kP0 c3957gP0;
        O90.f(type, "reflectType");
        this.a = type;
        if (type instanceof Class) {
            c3957gP0 = new C3957gP0((Class) type);
        } else if (type instanceof TypeVariable) {
            c3957gP0 = new C7406uP0((TypeVariable) type);
        } else {
            if (!(type instanceof ParameterizedType)) {
                throw new IllegalStateException("Not a classifier type (" + type.getClass() + "): " + type);
            }
            Type rawType = ((ParameterizedType) type).getRawType();
            O90.d(rawType, "null cannot be cast to non-null type java.lang.Class<*>");
            c3957gP0 = new C3957gP0((Class) rawType);
        }
        this.b = c3957gP0;
    }

    @Override // defpackage.AbstractC7215tP0, defpackage.InterfaceC1502Ta0
    public final WO0 a(KX kx) {
        O90.f(kx, "fqName");
        return null;
    }

    @Override // defpackage.AbstractC7215tP0
    public final Type b() {
        return this.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0039  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.ArrayList c() {
        /*
            r6 = this;
            java.lang.reflect.Type r0 = r6.a
            java.util.List r0 = defpackage.VO0.c(r0)
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.ArrayList r1 = new java.util.ArrayList
            int r2 = defpackage.AbstractC8449zu.k(r0)
            r1.<init>(r2)
            java.util.Iterator r0 = r0.iterator()
        L15:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L66
            java.lang.Object r2 = r0.next()
            java.lang.reflect.Type r2 = (java.lang.reflect.Type) r2
            java.lang.String r3 = "type"
            defpackage.O90.f(r2, r3)
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C4339iP0.c():java.util.ArrayList");
    }

    public final boolean d() {
        Type type = this.a;
        if (!(type instanceof Class)) {
            return false;
        }
        TypeVariable[] typeParameters = ((Class) type).getTypeParameters();
        O90.e(typeParameters, "getTypeParameters(...)");
        return !(typeParameters.length == 0);
    }

    @Override // defpackage.InterfaceC1502Ta0
    public final Collection getAnnotations() {
        return MN.a;
    }
}
