package defpackage;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* renamed from: zh0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C8411zh0 extends AbstractC7683vs implements InterfaceC1814Xa0 {
    public final C6045nH g;
    public final C3957gP0 h;
    public final InterfaceC7492us i;
    public final C6045nH j;
    public final F71 k;
    public final EnumC0152Bs l;
    public final EnumC6348os0 m;
    public final AbstractC6952s2 n;
    public final boolean o;
    public final GI p;
    public final C0276Dh0 q;
    public final KV0 r;
    public final C7546v80 s;
    public final C1445Sh0 t;
    public final C8031xh0 u;
    public final C1688Vk0 v;

    static {
        J8.F(new String[]{"equals", "hashCode", "getClass", "wait", "notify", "notifyAll", "toString"});
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C8411zh0(C6045nH c6045nH, CD cd, C3957gP0 c3957gP0, InterfaceC7492us interfaceC7492us) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        EnumC6348os0 enumC6348os0O;
        O90.f(c6045nH, "outerContext");
        O90.f(cd, "containingDeclaration");
        O90.f(c3957gP0, "jClass");
        C4375ib0 c4375ib0 = (C4375ib0) c6045nH.b;
        super((C1922Yk0) c4375ib0.a, cd, c3957gP0.e(), ((C6518pl0) c4375ib0.j).n(c3957gP0));
        this.g = c6045nH;
        this.h = c3957gP0;
        this.i = interfaceC7492us;
        C6045nH c6045nHA = XT1.a(c6045nH, this, c3957gP0, 4);
        this.j = c6045nHA;
        C4375ib0 c4375ib02 = (C4375ib0) c6045nHA.b;
        ((C0162Bv0) c4375ib02.g).getClass();
        this.k = LB.b(new C8221yh0(this, 2));
        Class cls = c3957gP0.a;
        this.l = cls.isAnnotation() ? EnumC0152Bs.e : cls.isInterface() ? EnumC0152Bs.b : cls.isEnum() ? EnumC0152Bs.c : EnumC0152Bs.a;
        if (cls.isAnnotation() || cls.isEnum()) {
            enumC6348os0O = EnumC6348os0.b;
        } else {
            C0318Dv0 c0318Dv0 = EnumC6348os0.a;
            boolean zH = c3957gP0.h();
            boolean z = c3957gP0.h() || Modifier.isAbstract(cls.getModifiers()) || cls.isInterface();
            boolean z2 = !Modifier.isFinal(cls.getModifiers());
            c0318Dv0.getClass();
            enumC6348os0O = C0318Dv0.o(zH, z, z2);
        }
        this.m = enumC6348os0O;
        int modifiers = cls.getModifiers();
        this.n = Modifier.isPublic(modifiers) ? C2004Zl1.d : Modifier.isPrivate(modifiers) ? C1770Wl1.d : Modifier.isProtected(modifiers) ? Modifier.isStatic(modifiers) ? C0804Kb0.d : C0726Jb0.d : C0648Ib0.d;
        Class<?> declaringClass = cls.getDeclaringClass();
        this.o = ((declaringClass != null ? new C3957gP0(declaringClass) : null) == null || Modifier.isStatic(cls.getModifiers())) ? false : true;
        this.p = new GI(this);
        C0276Dh0 c0276Dh0 = new C0276Dh0(c6045nHA, this, c3957gP0, interfaceC7492us != null, null);
        this.q = c0276Dh0;
        C7304tt c7304tt = KV0.d;
        C1922Yk0 c1922Yk0 = (C1922Yk0) c4375ib02.a;
        ((C7883wv0) c4375ib02.u).getClass();
        C8277z c8277z = new C8277z(24, this);
        c7304tt.getClass();
        O90.f(c1922Yk0, "storageManager");
        this.r = new KV0(this, c1922Yk0, c8277z);
        this.s = new C7546v80(c0276Dh0);
        this.t = new C1445Sh0(c6045nHA, c3957gP0, this);
        this.u = AbstractC1993Zi.e(c6045nHA, c3957gP0);
        C8221yh0 c8221yh0 = new C8221yh0(this, 1);
        c1922Yk0.getClass();
        this.v = new C1688Vk0(c1922Yk0, c8221yh0);
    }

    @Override // defpackage.InterfaceC7492us
    public final boolean A() {
        return false;
    }

    @Override // defpackage.D, defpackage.InterfaceC7492us
    public final InterfaceC5578kq0 I0() {
        return this.s;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [MN, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v7, types: [java.util.ArrayList] */
    @Override // defpackage.InterfaceC7492us
    public final Collection J() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        Class[] clsArr;
        EnumC6348os0 enumC6348os0 = EnumC6348os0.c;
        ?? arrayList = MN.a;
        if (this.m != enumC6348os0) {
            return arrayList;
        }
        Object obj = null;
        C8203yb0 c8203yb0A = K22.a(EnumC8403ze1.b, false, false, null, 7);
        Class cls = this.h.a;
        O90.f(cls, "clazz");
        C6860rY0 c6860rY0 = G22.a;
        if (c6860rY0 == null) {
            try {
                c6860rY0 = new C6860rY0(Class.class.getMethod("isSealed", null), Class.class.getMethod("getPermittedSubclasses", null), Class.class.getMethod("isRecord", null), Class.class.getMethod("getRecordComponents", null), 9);
            } catch (NoSuchMethodException unused) {
                c6860rY0 = new C6860rY0(obj, obj, obj, obj, 9);
            }
            G22.a = c6860rY0;
        }
        Method method = (Method) c6860rY0.c;
        if (method == null) {
            clsArr = null;
        } else {
            Object objInvoke = method.invoke(cls, null);
            O90.d(objInvoke, "null cannot be cast to non-null type kotlin.Array<java.lang.Class<*>>");
            clsArr = (Class[]) objInvoke;
        }
        if (clsArr != null) {
            arrayList = new ArrayList(clsArr.length);
            for (Class cls2 : clsArr) {
                arrayList.add(new C4339iP0(cls2));
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = ((Iterable) arrayList).iterator();
        while (it.hasNext()) {
            InterfaceC1087Ns interfaceC1087NsA = ((C1857Xo1) this.j.e).V((C4339iP0) it.next(), c8203yb0A).E().a();
            InterfaceC7492us interfaceC7492us = interfaceC1087NsA instanceof InterfaceC7492us ? (InterfaceC7492us) interfaceC1087NsA : null;
            if (interfaceC7492us != null) {
                arrayList2.add(interfaceC7492us);
            }
        }
        return AbstractC8069xu.W(arrayList2, new C2209aq0(16));
    }

    @Override // defpackage.InterfaceC7492us
    public final AbstractC1134Oh1 J0() {
        return null;
    }

    @Override // defpackage.InterfaceC7492us
    public final boolean K() {
        return false;
    }

    @Override // defpackage.InterfaceC2400bq0
    public final boolean M() {
        return false;
    }

    @Override // defpackage.InterfaceC1165Os
    public final boolean N() {
        return this.o;
    }

    @Override // defpackage.D, defpackage.InterfaceC7492us
    public final InterfaceC5578kq0 O0() {
        return (C0276Dh0) super.O0();
    }

    @Override // defpackage.InterfaceC2400bq0
    public final boolean Q0() {
        return false;
    }

    @Override // defpackage.InterfaceC7492us
    public final C6729qs V() {
        return null;
    }

    @Override // defpackage.InterfaceC7492us
    public final InterfaceC5578kq0 W() {
        return this.t;
    }

    @Override // defpackage.InterfaceC7492us
    public final boolean X0() {
        return false;
    }

    @Override // defpackage.InterfaceC7492us, defpackage.InterfaceC2400bq0
    public final EnumC6348os0 f() {
        return this.m;
    }

    @Override // defpackage.InterfaceC7492us
    public final Collection g() {
        return (List) this.q.q.invoke();
    }

    @Override // defpackage.InterfaceC6391p5
    public final I5 getAnnotations() {
        return this.u;
    }

    @Override // defpackage.InterfaceC7492us, defpackage.HD, defpackage.InterfaceC2400bq0
    public final C7575vI getVisibility() {
        C7575vI c7575vI = AbstractC7765wI.a;
        AbstractC6952s2 abstractC6952s2 = this.n;
        if (O90.a(abstractC6952s2, c7575vI)) {
            Class<?> declaringClass = this.h.a.getDeclaringClass();
            if ((declaringClass != null ? new C3957gP0(declaringClass) : null) == null) {
                C7575vI c7575vI2 = AbstractC2164ab0.a;
                O90.c(c7575vI2);
                return c7575vI2;
            }
        }
        return AbstractC6947s02.a(abstractC6952s2);
    }

    @Override // defpackage.InterfaceC7492us
    public final boolean isInline() {
        return false;
    }

    @Override // defpackage.InterfaceC7492us
    public final EnumC0152Bs l() {
        return this.l;
    }

    @Override // defpackage.AbstractC8064xs0
    public final InterfaceC5578kq0 n(C1130Og0 c1130Og0) {
        KV0 kv0 = this.r;
        AbstractC7384uI.j(kv0.a);
        return (C0276Dh0) ((InterfaceC5578kq0) WS1.b(kv0.c, KV0.e[0]));
    }

    @Override // defpackage.InterfaceC7492us, defpackage.InterfaceC1165Os
    public final List o() {
        return (List) this.v.invoke();
    }

    public final String toString() {
        return "Lazy Java class " + AbstractC7384uI.h(this);
    }

    public final C0276Dh0 u() {
        return (C0276Dh0) super.O0();
    }

    @Override // defpackage.InterfaceC1087Ns
    public final InterfaceC1200Pd1 v() {
        return this.p;
    }

    @Override // defpackage.InterfaceC7492us
    public final boolean w() {
        return false;
    }
}
