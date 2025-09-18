package p000;

import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Member;
import java.lang.reflect.Modifier;
import java.util.Collection;

/* renamed from: oP0 */
/* loaded from: classes2.dex */
public abstract class AbstractC10517oP0 extends AbstractC10005kP0 implements InterfaceC8302Ta0, InterfaceC8872bb0 {
    @Override // p000.InterfaceC8302Ta0
    /* renamed from: a */
    public final WO0 mo7705a(C0664KX c0664kx) {
        O90.m5968f(c0664kx, "fqName");
        Member memberMo22030b = mo22030b();
        O90.m5966d(memberMo22030b, "null cannot be cast to non-null type java.lang.reflect.AnnotatedElement");
        Annotation[] declaredAnnotations = ((AnnotatedElement) memberMo22030b).getDeclaredAnnotations();
        if (declaredAnnotations != null) {
            return AbstractC9878jP1.m22032b(declaredAnnotations, c0664kx);
        }
        return null;
    }

    /* renamed from: b */
    public abstract Member mo22030b();

    /* renamed from: c */
    public final C8340Tt0 m23388c() {
        String name = mo22030b().getName();
        C8340Tt0 c8340Tt0M7798e = name != null ? C8340Tt0.m7798e(name) : null;
        return c8340Tt0M7798e == null ? AbstractC9961k31.f36274a : c8340Tt0M7798e;
    }

    /* JADX WARN: Removed duplicated region for block: B:111:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x012b  */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.ArrayList m23389d(java.lang.reflect.Type[] r13, java.lang.annotation.Annotation[][] r14, boolean r15) throws java.lang.IllegalAccessException, java.lang.IllegalArgumentException, java.lang.reflect.InvocationTargetException {
        /*
            Method dump skipped, instructions count: 315
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.AbstractC10517oP0.m23389d(java.lang.reflect.Type[], java.lang.annotation.Annotation[][], boolean):java.util.ArrayList");
    }

    /* renamed from: e */
    public final AbstractC6798s2 m23390e() {
        int modifiers = mo22030b().getModifiers();
        return Modifier.isPublic(modifiers) ? C8637Zl1.f15112d : Modifier.isPrivate(modifiers) ? C8481Wl1.f13392d : Modifier.isProtected(modifiers) ? Modifier.isStatic(modifiers) ? C7836Kb0.f6222d : C7784Jb0.f5623d : C7732Ib0.f5028d;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof AbstractC10517oP0) && O90.m5963a(mo22030b(), ((AbstractC10517oP0) obj).mo22030b());
    }

    @Override // p000.InterfaceC8302Ta0
    public final Collection getAnnotations() {
        Member memberMo22030b = mo22030b();
        O90.m5966d(memberMo22030b, "null cannot be cast to non-null type java.lang.reflect.AnnotatedElement");
        Annotation[] declaredAnnotations = ((AnnotatedElement) memberMo22030b).getDeclaredAnnotations();
        return declaredAnnotations != null ? AbstractC9878jP1.m22033c(declaredAnnotations) : C0779MN.f7117a;
    }

    public final int hashCode() {
        return mo22030b().hashCode();
    }

    public final String toString() {
        return getClass().getName() + ": " + mo22030b();
    }
}
