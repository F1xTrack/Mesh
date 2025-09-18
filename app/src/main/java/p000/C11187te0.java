package p000;

import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* renamed from: te0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C11187te0 extends AbstractC8360Ud0 implements InterfaceC6957uZ, InterfaceC10931re0, InterfaceC0854NZ {

    /* renamed from: m */
    public static final /* synthetic */ InterfaceC10293mf0[] f43184m;

    /* renamed from: g */
    public final AbstractC10675pe0 f43185g;

    /* renamed from: h */
    public final String f43186h;

    /* renamed from: i */
    public final Object f43187i;

    /* renamed from: j */
    public final AP0 f43188j;

    /* renamed from: k */
    public final Object f43189k;

    /* renamed from: l */
    public final Object f43190l;

    static {
        IP0 ip0 = BP0.f799a;
        f43184m = new InterfaceC10293mf0[]{ip0.mo3850f(new GE0(ip0.mo3846b(C11187te0.class), "descriptor", "getDescriptor()Lorg/jetbrains/kotlin/descriptors/FunctionDescriptor;"))};
    }

    public C11187te0(AbstractC10675pe0 abstractC10675pe0, String str, String str2, InterfaceC0036AZ interfaceC0036AZ, Object obj) {
        this.f43185g = abstractC10675pe0;
        this.f43186h = str2;
        this.f43187i = obj;
        this.f43188j = AbstractC11668xP1.m25850a(interfaceC0036AZ, new C7053w5(this, 14, str));
        EnumC9659hi0 enumC9659hi0 = EnumC9659hi0.f28538b;
        this.f43189k = AbstractC0705LB.m4916c(enumC9659hi0, new C11059se0(this, 0));
        this.f43190l = AbstractC0705LB.m4916c(enumC9659hi0, new C11059se0(this, 1));
    }

    /* renamed from: t */
    public static final AbstractC1621Zl m24955t(C11187te0 c11187te0, Constructor constructor, InterfaceC0036AZ interfaceC0036AZ, boolean z) {
        Class<?> cls = null;
        if (!z) {
            c11187te0.getClass();
            C6707qs c6707qs = interfaceC0036AZ instanceof C6707qs ? (C6707qs) interfaceC0036AZ : null;
            if (c6707qs != null) {
                C6707qs c6707qs2 = c6707qs;
                if (!AbstractC7066wI.m25591e(c6707qs2.getVisibility())) {
                    InterfaceC6976us interfaceC6976usMo2719z = c6707qs.mo2719z();
                    O90.m5967e(interfaceC6976usMo2719z, "getConstructedClass(...)");
                    if (!AbstractC11251u80.m25120e(interfaceC6976usMo2719z) && !AbstractC6814sI.m24705q(c6707qs.mo2719z())) {
                        List listMo1221f0 = c6707qs2.mo1221f0();
                        O90.m5967e(listMo1221f0, "getValueParameters(...)");
                        List list = listMo1221f0;
                        if (!(list instanceof Collection) || !list.isEmpty()) {
                            Iterator it = list.iterator();
                            while (it.hasNext()) {
                                AbstractC7742Ig0 type = ((C8473Wh1) it.next()).getType();
                                O90.m5967e(type, "getType(...)");
                                if (AbstractC9959k22.m22137a(type)) {
                                    if (c11187te0.mo8097s()) {
                                        return new C0678Kl(constructor, AbstractC11361v02.m25294b(c11187te0.f43187i, c11187te0.mo8094p()), 0);
                                    }
                                    O90.m5968f(constructor, "constructor");
                                    Class declaringClass = constructor.getDeclaringClass();
                                    O90.m5967e(declaringClass, "getDeclaringClass(...)");
                                    Type[] genericParameterTypes = constructor.getGenericParameterTypes();
                                    O90.m5967e(genericParameterTypes, "getGenericParameterTypes(...)");
                                    return new C0740Ll(constructor, declaringClass, null, (Type[]) (genericParameterTypes.length <= 1 ? new Type[0] : AbstractC0576J8.m4183j(genericParameterTypes, 0, genericParameterTypes.length - 1)), 0);
                                }
                            }
                        }
                    }
                }
            }
        }
        if (c11187te0.mo8097s()) {
            return new C0678Kl(constructor, AbstractC11361v02.m25294b(c11187te0.f43187i, c11187te0.mo8094p()), 1);
        }
        O90.m5968f(constructor, "constructor");
        Class declaringClass2 = constructor.getDeclaringClass();
        O90.m5967e(declaringClass2, "getDeclaringClass(...)");
        Class declaringClass3 = constructor.getDeclaringClass();
        Class<?> declaringClass4 = declaringClass3.getDeclaringClass();
        if (declaringClass4 != null && !Modifier.isStatic(declaringClass3.getModifiers())) {
            cls = declaringClass4;
        }
        Type[] genericParameterTypes2 = constructor.getGenericParameterTypes();
        O90.m5967e(genericParameterTypes2, "getGenericParameterTypes(...)");
        return new C0740Ll(constructor, declaringClass2, cls, genericParameterTypes2, 1);
    }

    @Override // p000.InterfaceC6625pZ
    /* renamed from: b */
    public final Object mo300b(Object obj, Object obj2, Object obj3) {
        return call(obj, obj2, obj3);
    }

    public final boolean equals(Object obj) {
        C11187te0 c11187te0M2750b = AbstractC7589Fh1.m2750b(obj);
        return c11187te0M2750b != null && O90.m5963a(this.f43185g, c11187te0M2750b.f43185g) && getName().equals(c11187te0M2750b.getName()) && O90.m5963a(this.f43186h, c11187te0M2750b.f43186h) && O90.m5963a(this.f43187i, c11187te0M2750b.f43187i);
    }

    @Override // p000.InterfaceC6957uZ
    public final int getArity() {
        return EQ1.m2265b(mo8091m());
    }

    @Override // p000.InterfaceC8152Qd0
    public final String getName() {
        String strM7801b = ((AbstractC0203DD) mo8094p()).getName().m7801b();
        O90.m5967e(strM7801b, "asString(...)");
        return strM7801b;
    }

    public final int hashCode() {
        return this.f43186h.hashCode() + ((getName().hashCode() + (this.f43185g.hashCode() * 31)) * 31);
    }

    @Override // p000.InterfaceC6434mZ
    public final Object invoke() {
        return call(new Object[0]);
    }

    @Override // p000.InterfaceC10931re0
    public final boolean isExternal() {
        return mo8094p().isExternal();
    }

    @Override // p000.InterfaceC10931re0
    public final boolean isInfix() {
        return mo8094p().isInfix();
    }

    @Override // p000.InterfaceC10931re0
    public final boolean isInline() {
        return mo8094p().isInline();
    }

    @Override // p000.InterfaceC10931re0
    public final boolean isOperator() {
        return mo8094p().isOperator();
    }

    @Override // p000.InterfaceC8152Qd0, p000.InterfaceC10931re0
    public final boolean isSuspend() {
        return mo8094p().isSuspend();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // p000.AbstractC8360Ud0
    /* renamed from: m */
    public final InterfaceC0615Jl mo8091m() {
        return (InterfaceC0615Jl) this.f43189k.getValue();
    }

    @Override // p000.AbstractC8360Ud0
    /* renamed from: n */
    public final AbstractC10675pe0 mo8092n() {
        return this.f43185g;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // p000.AbstractC8360Ud0
    /* renamed from: o */
    public final InterfaceC0615Jl mo8093o() {
        return (InterfaceC0615Jl) this.f43190l.getValue();
    }

    @Override // p000.AbstractC8360Ud0
    /* renamed from: s */
    public final boolean mo8097s() {
        return !O90.m5963a(this.f43187i, AbstractC7284zl.NO_RECEIVER);
    }

    public final String toString() {
        C6417mI c6417mI = QP0.f9616a;
        return QP0.m6683b(mo8094p());
    }

    @Override // p000.AbstractC8360Ud0
    /* renamed from: u, reason: merged with bridge method [inline-methods] */
    public final InterfaceC0036AZ mo8094p() {
        InterfaceC10293mf0 interfaceC10293mf0 = f43184m[0];
        Object objInvoke = this.f43188j.invoke();
        O90.m5967e(objInvoke, "getValue(...)");
        return (InterfaceC0036AZ) objInvoke;
    }

    @Override // p000.InterfaceC6497nZ
    public final Object invoke(Object obj) {
        return call(obj);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return call(obj, obj2);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    public C11187te0(AbstractC10675pe0 abstractC10675pe0, InterfaceC0036AZ interfaceC0036AZ) {
        O90.m5968f(abstractC10675pe0, "container");
        O90.m5968f(interfaceC0036AZ, "descriptor");
        String strM7801b = ((AbstractC0203DD) interfaceC0036AZ).getName().m7801b();
        O90.m5967e(strM7801b, "asString(...)");
        this(abstractC10675pe0, strM7801b, AbstractC10527oU0.m23470c(interfaceC0036AZ).mo6561a(), interfaceC0036AZ, AbstractC7284zl.NO_RECEIVER);
    }
}
