package p000;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* renamed from: zh0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C11957zh0 extends AbstractC7039vs implements InterfaceC8510Xa0 {

    /* renamed from: g */
    public final C6479nH f46931g;

    /* renamed from: h */
    public final C9493gP0 f46932h;

    /* renamed from: i */
    public final InterfaceC6976us f46933i;

    /* renamed from: j */
    public final C6479nH f46934j;

    /* renamed from: k */
    public final F71 f46935k;

    /* renamed from: l */
    public final EnumC0118Bs f46936l;

    /* renamed from: m */
    public final EnumC10575os0 f46937m;

    /* renamed from: n */
    public final AbstractC6798s2 f46938n;

    /* renamed from: o */
    public final boolean f46939o;

    /* renamed from: p */
    public final C0397GI f46940p;

    /* renamed from: q */
    public final C7484Dh0 f46941q;

    /* renamed from: r */
    public final KV0 f46942r;

    /* renamed from: s */
    public final C11379v80 f46943s;

    /* renamed from: t */
    public final C8264Sh0 f46944t;

    /* renamed from: u */
    public final C11703xh0 f46945u;

    /* renamed from: v */
    public final C8426Vk0 f46946v;

    static {
        AbstractC0576J8.m4175F(new String[]{"equals", "hashCode", "getClass", "wait", "notify", "notifyAll", "toString"});
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C11957zh0(C6479nH c6479nH, InterfaceC0140CD interfaceC0140CD, C9493gP0 c9493gP0, InterfaceC6976us interfaceC6976us) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        EnumC10575os0 enumC10575os0M1930o;
        O90.m5968f(c6479nH, "outerContext");
        O90.m5968f(interfaceC0140CD, "containingDeclaration");
        O90.m5968f(c9493gP0, "jClass");
        C9773ib0 c9773ib0 = (C9773ib0) c6479nH.f38228b;
        super((C8582Yk0) c9773ib0.f29338a, interfaceC0140CD, c9493gP0.m18515e(), ((C10689pl0) c9773ib0.f29347j).m23868n(c9493gP0));
        this.f46931g = c6479nH;
        this.f46932h = c9493gP0;
        this.f46933i = interfaceC6976us;
        C6479nH c6479nHM9056a = XT1.m9056a(c6479nH, this, c9493gP0, 4);
        this.f46934j = c6479nHM9056a;
        C9773ib0 c9773ib02 = (C9773ib0) c6479nHM9056a.f38228b;
        ((C7408Bv0) c9773ib02.f29344g).getClass();
        this.f46935k = AbstractC0705LB.m4915b(new C11830yh0(this, 2));
        Class cls = c9493gP0.f27782a;
        this.f46936l = cls.isAnnotation() ? EnumC0118Bs.f1064e : cls.isInterface() ? EnumC0118Bs.f1061b : cls.isEnum() ? EnumC0118Bs.f1062c : EnumC0118Bs.f1060a;
        if (cls.isAnnotation() || cls.isEnum()) {
            enumC10575os0M1930o = EnumC10575os0.f39323b;
        } else {
            C7512Dv0 c7512Dv0 = EnumC10575os0.f39322a;
            boolean zM18518h = c9493gP0.m18518h();
            boolean z = c9493gP0.m18518h() || Modifier.isAbstract(cls.getModifiers()) || cls.isInterface();
            boolean z2 = !Modifier.isFinal(cls.getModifiers());
            c7512Dv0.getClass();
            enumC10575os0M1930o = C7512Dv0.m1930o(zM18518h, z, z2);
        }
        this.f46937m = enumC10575os0M1930o;
        int modifiers = cls.getModifiers();
        this.f46938n = Modifier.isPublic(modifiers) ? C8637Zl1.f15112d : Modifier.isPrivate(modifiers) ? C8481Wl1.f13392d : Modifier.isProtected(modifiers) ? Modifier.isStatic(modifiers) ? C7836Kb0.f6222d : C7784Jb0.f5623d : C7732Ib0.f5028d;
        Class<?> declaringClass = cls.getDeclaringClass();
        this.f46939o = ((declaringClass != null ? new C9493gP0(declaringClass) : null) == null || Modifier.isStatic(cls.getModifiers())) ? false : true;
        this.f46940p = new C0397GI(this);
        C7484Dh0 c7484Dh0 = new C7484Dh0(c6479nHM9056a, this, c9493gP0, interfaceC6976us != null, null);
        this.f46941q = c7484Dh0;
        C6914tt c6914tt = KV0.f6128d;
        C8582Yk0 c8582Yk0 = (C8582Yk0) c9773ib02.f29338a;
        ((C11604wv0) c9773ib02.f29358u).getClass();
        C7236z c7236z = new C7236z(24, this);
        c6914tt.getClass();
        O90.m5968f(c8582Yk0, "storageManager");
        this.f46942r = new KV0(this, c8582Yk0, c7236z);
        this.f46943s = new C11379v80(c7484Dh0);
        this.f46944t = new C8264Sh0(c6479nHM9056a, c9493gP0, this);
        this.f46945u = AbstractC1618Zi.m9582e(c6479nHM9056a, c9493gP0);
        C11830yh0 c11830yh0 = new C11830yh0(this, 1);
        c8582Yk0.getClass();
        this.f46946v = new C8426Vk0(c8582Yk0, c11830yh0);
    }

    @Override // p000.InterfaceC6976us
    /* renamed from: A */
    public final boolean mo1427A() {
        return false;
    }

    @Override // p000.AbstractC0189D, p000.InterfaceC6976us
    /* renamed from: I0 */
    public final InterfaceC10059kq0 mo1486I0() {
        return this.f46943s;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [MN, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v7, types: [java.util.ArrayList] */
    @Override // p000.InterfaceC6976us
    /* renamed from: J */
    public final Collection mo1428J() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        Class[] clsArr;
        EnumC10575os0 enumC10575os0 = EnumC10575os0.f39324c;
        ?? arrayList = C0779MN.f7117a;
        if (this.f46937m != enumC10575os0) {
            return arrayList;
        }
        Object obj = null;
        C11818yb0 c11818yb0M4530a = K22.m4530a(EnumC11952ze1.f46923b, false, false, null, 7);
        Class cls = this.f46932h.f27782a;
        O90.m5968f(cls, "clazz");
        C10919rY0 c10919rY0 = G22.f3551a;
        if (c10919rY0 == null) {
            try {
                c10919rY0 = new C10919rY0(Class.class.getMethod("isSealed", null), Class.class.getMethod("getPermittedSubclasses", null), Class.class.getMethod("isRecord", null), Class.class.getMethod("getRecordComponents", null), 9);
            } catch (NoSuchMethodException unused) {
                c10919rY0 = new C10919rY0(obj, obj, obj, obj, 9);
            }
            G22.f3551a = c10919rY0;
        }
        Method method = (Method) c10919rY0.f41729c;
        if (method == null) {
            clsArr = null;
        } else {
            Object objInvoke = method.invoke(cls, null);
            O90.m5966d(objInvoke, "null cannot be cast to non-null type kotlin.Array<java.lang.Class<*>>");
            clsArr = (Class[]) objInvoke;
        }
        if (clsArr != null) {
            arrayList = new ArrayList(clsArr.length);
            for (Class cls2 : clsArr) {
                arrayList.add(new C9749iP0(cls2));
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = ((Iterable) arrayList).iterator();
        while (it.hasNext()) {
            InterfaceC0873Ns interfaceC0873NsMo1962a = ((C8539Xo1) this.f46934j.f38231e).m9139V((C9749iP0) it.next(), c11818yb0M4530a).mo3797E().mo1962a();
            InterfaceC6976us interfaceC6976us = interfaceC0873NsMo1962a instanceof InterfaceC6976us ? (InterfaceC6976us) interfaceC0873NsMo1962a : null;
            if (interfaceC6976us != null) {
                arrayList2.add(interfaceC6976us);
            }
        }
        return AbstractC7167xu.m25977W(arrayList2, new C8774aq0(16));
    }

    @Override // p000.InterfaceC6976us
    /* renamed from: J0 */
    public final AbstractC8057Oh1 mo1429J0() {
        return null;
    }

    @Override // p000.InterfaceC6976us
    /* renamed from: K */
    public final boolean mo1430K() {
        return false;
    }

    @Override // p000.InterfaceC8902bq0
    /* renamed from: M */
    public final boolean mo111M() {
        return false;
    }

    @Override // p000.InterfaceC0936Os
    /* renamed from: N */
    public final boolean mo1431N() {
        return this.f46939o;
    }

    @Override // p000.AbstractC0189D, p000.InterfaceC6976us
    /* renamed from: O0 */
    public final InterfaceC10059kq0 mo1487O0() {
        return (C7484Dh0) super.mo1487O0();
    }

    @Override // p000.InterfaceC8902bq0
    /* renamed from: Q0 */
    public final boolean mo112Q0() {
        return false;
    }

    @Override // p000.InterfaceC6976us
    /* renamed from: V */
    public final C6707qs mo1432V() {
        return null;
    }

    @Override // p000.InterfaceC6976us
    /* renamed from: W */
    public final InterfaceC10059kq0 mo1433W() {
        return this.f46944t;
    }

    @Override // p000.InterfaceC6976us
    /* renamed from: X0 */
    public final boolean mo1434X0() {
        return false;
    }

    @Override // p000.InterfaceC6976us, p000.InterfaceC8902bq0
    /* renamed from: f */
    public final EnumC10575os0 mo115f() {
        return this.f46937m;
    }

    @Override // p000.InterfaceC6976us
    /* renamed from: g */
    public final Collection mo1435g() {
        return (List) this.f46941q.f2161q.invoke();
    }

    @Override // p000.InterfaceC6595p5
    public final InterfaceC0510I5 getAnnotations() {
        return this.f46945u;
    }

    @Override // p000.InterfaceC6976us, p000.InterfaceC0455HD, p000.InterfaceC8902bq0
    public final C7003vI getVisibility() {
        C7003vI c7003vI = AbstractC7066wI.f44760a;
        AbstractC6798s2 abstractC6798s2 = this.f46938n;
        if (O90.m5963a(abstractC6798s2, c7003vI)) {
            Class<?> declaringClass = this.f46932h.f27782a.getDeclaringClass();
            if ((declaringClass != null ? new C9493gP0(declaringClass) : null) == null) {
                C7003vI c7003vI2 = AbstractC8744ab0.f15575a;
                O90.m5965c(c7003vI2);
                return c7003vI2;
            }
        }
        return AbstractC10977s02.m24575a(abstractC6798s2);
    }

    @Override // p000.InterfaceC6976us
    public final boolean isInline() {
        return false;
    }

    @Override // p000.InterfaceC6976us
    /* renamed from: l */
    public final EnumC0118Bs mo1436l() {
        return this.f46936l;
    }

    @Override // p000.AbstractC11725xs0
    /* renamed from: n */
    public final InterfaceC10059kq0 mo1437n(C8054Og0 c8054Og0) {
        KV0 kv0 = this.f46942r;
        AbstractC6940uI.m25157j(kv0.f6130a);
        return (C7484Dh0) ((InterfaceC10059kq0) WS1.m8763b(kv0.f6132c, KV0.f6129e[0]));
    }

    @Override // p000.InterfaceC6976us, p000.InterfaceC0936Os
    /* renamed from: o */
    public final List mo1438o() {
        return (List) this.f46946v.invoke();
    }

    public final String toString() {
        return "Lazy Java class " + AbstractC6940uI.m25155h(this);
    }

    /* renamed from: u */
    public final C7484Dh0 m26514u() {
        return (C7484Dh0) super.mo1487O0();
    }

    @Override // p000.InterfaceC0873Ns
    /* renamed from: v */
    public final InterfaceC8101Pd1 mo1439v() {
        return this.f46940p;
    }

    @Override // p000.InterfaceC6976us
    /* renamed from: w */
    public final boolean mo1440w() {
        return false;
    }
}
