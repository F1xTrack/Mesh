package defpackage;

import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Member;
import java.lang.reflect.Modifier;
import java.util.Collection;

/* renamed from: oP0 */
/* loaded from: classes2.dex */
public abstract class AbstractC6261oP0 extends AbstractC5497kP0 implements InterfaceC1502Ta0, InterfaceC2355bb0 {
    @Override // defpackage.InterfaceC1502Ta0
    public final WO0 a(KX kx) {
        O90.f(kx, "fqName");
        Member memberB = b();
        O90.d(memberB, "null cannot be cast to non-null type java.lang.reflect.AnnotatedElement");
        Annotation[] declaredAnnotations = ((AnnotatedElement) memberB).getDeclaredAnnotations();
        if (declaredAnnotations != null) {
            return AbstractC5307jP1.b(declaredAnnotations, kx);
        }
        return null;
    }

    public abstract Member b();

    public final C1559Tt0 c() {
        String name = b().getName();
        C1559Tt0 c1559Tt0E = name != null ? C1559Tt0.e(name) : null;
        return c1559Tt0E == null ? AbstractC5431k31.a : c1559Tt0E;
    }

    /* JADX WARN: Removed duplicated region for block: B:111:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x012b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.ArrayList d(java.lang.reflect.Type[] r13, java.lang.annotation.Annotation[][] r14, boolean r15) throws java.lang.IllegalAccessException, java.lang.IllegalArgumentException, java.lang.reflect.InvocationTargetException {
        /*
            Method dump skipped, instructions count: 315
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC6261oP0.d(java.lang.reflect.Type[], java.lang.annotation.Annotation[][], boolean):java.util.ArrayList");
    }

    public final AbstractC6952s2 e() {
        int modifiers = b().getModifiers();
        return Modifier.isPublic(modifiers) ? C2004Zl1.d : Modifier.isPrivate(modifiers) ? C1770Wl1.d : Modifier.isProtected(modifiers) ? Modifier.isStatic(modifiers) ? C0804Kb0.d : C0726Jb0.d : C0648Ib0.d;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof AbstractC6261oP0) && O90.a(b(), ((AbstractC6261oP0) obj).b());
    }

    @Override // defpackage.InterfaceC1502Ta0
    public final Collection getAnnotations() {
        Member memberB = b();
        O90.d(memberB, "null cannot be cast to non-null type java.lang.reflect.AnnotatedElement");
        Annotation[] declaredAnnotations = ((AnnotatedElement) memberB).getDeclaredAnnotations();
        return declaredAnnotations != null ? AbstractC5307jP1.c(declaredAnnotations) : MN.a;
    }

    public final int hashCode() {
        return b().hashCode();
    }

    public final String toString() {
        return getClass().getName() + ": " + b();
    }
}
