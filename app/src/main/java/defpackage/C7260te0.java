package defpackage;

import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* renamed from: te0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C7260te0 extends AbstractC1589Ud0 implements InterfaceC7435uZ, InterfaceC6878re0, NZ {
    public static final /* synthetic */ InterfaceC5927mf0[] m;
    public final AbstractC6497pe0 g;
    public final String h;
    public final Object i;
    public final AP0 j;
    public final Object k;
    public final Object l;

    static {
        IP0 ip0 = BP0.a;
        m = new InterfaceC5927mf0[]{ip0.f(new GE0(ip0.b(C7260te0.class), "descriptor", "getDescriptor()Lorg/jetbrains/kotlin/descriptors/FunctionDescriptor;"))};
    }

    public C7260te0(AbstractC6497pe0 abstractC6497pe0, String str, String str2, AZ az, Object obj) {
        this.g = abstractC6497pe0;
        this.h = str2;
        this.i = obj;
        this.j = AbstractC7978xP1.a(az, new C7726w5(this, 14, str));
        EnumC4205hi0 enumC4205hi0 = EnumC4205hi0.b;
        this.k = LB.c(enumC4205hi0, new C7069se0(this, 0));
        this.l = LB.c(enumC4205hi0, new C7069se0(this, 1));
    }

    public static final AbstractC2002Zl t(C7260te0 c7260te0, Constructor constructor, AZ az, boolean z) {
        Class<?> cls = null;
        if (!z) {
            c7260te0.getClass();
            C6729qs c6729qs = az instanceof C6729qs ? (C6729qs) az : null;
            if (c6729qs != null) {
                C6729qs c6729qs2 = c6729qs;
                if (!AbstractC7765wI.e(c6729qs2.getVisibility())) {
                    InterfaceC7492us interfaceC7492usZ = c6729qs.z();
                    O90.e(interfaceC7492usZ, "getConstructedClass(...)");
                    if (!AbstractC7355u80.e(interfaceC7492usZ) && !AbstractC7002sI.q(c6729qs.z())) {
                        List listF0 = c6729qs2.f0();
                        O90.e(listF0, "getValueParameters(...)");
                        List list = listF0;
                        if (!(list instanceof Collection) || !list.isEmpty()) {
                            Iterator it = list.iterator();
                            while (it.hasNext()) {
                                AbstractC0663Ig0 type = ((C1758Wh1) it.next()).getType();
                                O90.e(type, "getType(...)");
                                if (AbstractC5428k22.a(type)) {
                                    if (c7260te0.s()) {
                                        return new C0833Kl(constructor, AbstractC7520v02.b(c7260te0.i, c7260te0.p()), 0);
                                    }
                                    O90.f(constructor, "constructor");
                                    Class declaringClass = constructor.getDeclaringClass();
                                    O90.e(declaringClass, "getDeclaringClass(...)");
                                    Type[] genericParameterTypes = constructor.getGenericParameterTypes();
                                    O90.e(genericParameterTypes, "getGenericParameterTypes(...)");
                                    return new C0911Ll(constructor, declaringClass, null, (Type[]) (genericParameterTypes.length <= 1 ? new Type[0] : J8.j(genericParameterTypes, 0, genericParameterTypes.length - 1)), 0);
                                }
                            }
                        }
                    }
                }
            }
        }
        if (c7260te0.s()) {
            return new C0833Kl(constructor, AbstractC7520v02.b(c7260te0.i, c7260te0.p()), 1);
        }
        O90.f(constructor, "constructor");
        Class declaringClass2 = constructor.getDeclaringClass();
        O90.e(declaringClass2, "getDeclaringClass(...)");
        Class declaringClass3 = constructor.getDeclaringClass();
        Class<?> declaringClass4 = declaringClass3.getDeclaringClass();
        if (declaringClass4 != null && !Modifier.isStatic(declaringClass3.getModifiers())) {
            cls = declaringClass4;
        }
        Type[] genericParameterTypes2 = constructor.getGenericParameterTypes();
        O90.e(genericParameterTypes2, "getGenericParameterTypes(...)");
        return new C0911Ll(constructor, declaringClass2, cls, genericParameterTypes2, 1);
    }

    @Override // defpackage.InterfaceC6481pZ
    public final Object b(Object obj, Object obj2, Object obj3) {
        return call(obj, obj2, obj3);
    }

    public final boolean equals(Object obj) {
        C7260te0 c7260te0B = AbstractC0433Fh1.b(obj);
        return c7260te0B != null && O90.a(this.g, c7260te0B.g) && getName().equals(c7260te0B.getName()) && O90.a(this.h, c7260te0B.h) && O90.a(this.i, c7260te0B.i);
    }

    @Override // defpackage.InterfaceC7435uZ
    public final int getArity() {
        return EQ1.b(m());
    }

    @Override // defpackage.InterfaceC1277Qd0
    public final String getName() {
        String strB = ((DD) p()).getName().b();
        O90.e(strB, "asString(...)");
        return strB;
    }

    public final int hashCode() {
        return this.h.hashCode() + ((getName().hashCode() + (this.g.hashCode() * 31)) * 31);
    }

    @Override // defpackage.InterfaceC5908mZ
    public final Object invoke() {
        return call(new Object[0]);
    }

    @Override // defpackage.InterfaceC6878re0
    public final boolean isExternal() {
        return p().isExternal();
    }

    @Override // defpackage.InterfaceC6878re0
    public final boolean isInfix() {
        return p().isInfix();
    }

    @Override // defpackage.InterfaceC6878re0
    public final boolean isInline() {
        return p().isInline();
    }

    @Override // defpackage.InterfaceC6878re0
    public final boolean isOperator() {
        return p().isOperator();
    }

    @Override // defpackage.InterfaceC1277Qd0, defpackage.InterfaceC6878re0
    public final boolean isSuspend() {
        return p().isSuspend();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // defpackage.AbstractC1589Ud0
    public final InterfaceC0755Jl m() {
        return (InterfaceC0755Jl) this.k.getValue();
    }

    @Override // defpackage.AbstractC1589Ud0
    public final AbstractC6497pe0 n() {
        return this.g;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // defpackage.AbstractC1589Ud0
    public final InterfaceC0755Jl o() {
        return (InterfaceC0755Jl) this.l.getValue();
    }

    @Override // defpackage.AbstractC1589Ud0
    public final boolean s() {
        return !O90.a(this.i, AbstractC8422zl.NO_RECEIVER);
    }

    public final String toString() {
        C5857mI c5857mI = QP0.a;
        return QP0.b(p());
    }

    @Override // defpackage.AbstractC1589Ud0
    /* renamed from: u, reason: merged with bridge method [inline-methods] */
    public final AZ p() {
        InterfaceC5927mf0 interfaceC5927mf0 = m[0];
        Object objInvoke = this.j.invoke();
        O90.e(objInvoke, "getValue(...)");
        return (AZ) objInvoke;
    }

    @Override // defpackage.InterfaceC6099nZ
    public final Object invoke(Object obj) {
        return call(obj);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return call(obj, obj2);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    public C7260te0(AbstractC6497pe0 abstractC6497pe0, AZ az) {
        O90.f(abstractC6497pe0, "container");
        O90.f(az, "descriptor");
        String strB = ((DD) az).getName().b();
        O90.e(strB, "asString(...)");
        this(abstractC6497pe0, strB, AbstractC6276oU0.c(az).a(), az, AbstractC8422zl.NO_RECEIVER);
    }
}
