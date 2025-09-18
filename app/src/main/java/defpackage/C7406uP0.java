package defpackage;

import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.TypeVariable;
import java.util.Collection;

/* renamed from: uP0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C7406uP0 extends AbstractC5497kP0 implements InterfaceC1502Ta0 {
    public final TypeVariable a;

    public C7406uP0(TypeVariable typeVariable) {
        O90.f(typeVariable, "typeVariable");
        this.a = typeVariable;
    }

    @Override // defpackage.InterfaceC1502Ta0
    public final WO0 a(KX kx) {
        Annotation[] declaredAnnotations;
        O90.f(kx, "fqName");
        TypeVariable typeVariable = this.a;
        AnnotatedElement annotatedElement = typeVariable instanceof AnnotatedElement ? (AnnotatedElement) typeVariable : null;
        if (annotatedElement == null || (declaredAnnotations = annotatedElement.getDeclaredAnnotations()) == null) {
            return null;
        }
        return AbstractC5307jP1.b(declaredAnnotations, kx);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C7406uP0) {
            if (O90.a(this.a, ((C7406uP0) obj).a)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.InterfaceC1502Ta0
    public final Collection getAnnotations() {
        Annotation[] declaredAnnotations;
        TypeVariable typeVariable = this.a;
        AnnotatedElement annotatedElement = typeVariable instanceof AnnotatedElement ? (AnnotatedElement) typeVariable : null;
        return (annotatedElement == null || (declaredAnnotations = annotatedElement.getDeclaredAnnotations()) == null) ? MN.a : AbstractC5307jP1.c(declaredAnnotations);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        NX.n(C7406uP0.class, sb, ": ");
        sb.append(this.a);
        return sb.toString();
    }
}
