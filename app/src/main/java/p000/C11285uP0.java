package p000;

import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.TypeVariable;
import java.util.Collection;

/* renamed from: uP0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C11285uP0 extends AbstractC10005kP0 implements InterfaceC8302Ta0 {

    /* renamed from: a */
    public final TypeVariable f43688a;

    public C11285uP0(TypeVariable typeVariable) {
        O90.m5968f(typeVariable, "typeVariable");
        this.f43688a = typeVariable;
    }

    @Override // p000.InterfaceC8302Ta0
    /* renamed from: a */
    public final WO0 mo7705a(C0664KX c0664kx) {
        Annotation[] declaredAnnotations;
        O90.m5968f(c0664kx, "fqName");
        TypeVariable typeVariable = this.f43688a;
        AnnotatedElement annotatedElement = typeVariable instanceof AnnotatedElement ? (AnnotatedElement) typeVariable : null;
        if (annotatedElement == null || (declaredAnnotations = annotatedElement.getDeclaredAnnotations()) == null) {
            return null;
        }
        return AbstractC9878jP1.m22032b(declaredAnnotations, c0664kx);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C11285uP0) {
            if (O90.m5963a(this.f43688a, ((C11285uP0) obj).f43688a)) {
                return true;
            }
        }
        return false;
    }

    @Override // p000.InterfaceC8302Ta0
    public final Collection getAnnotations() {
        Annotation[] declaredAnnotations;
        TypeVariable typeVariable = this.f43688a;
        AnnotatedElement annotatedElement = typeVariable instanceof AnnotatedElement ? (AnnotatedElement) typeVariable : null;
        return (annotatedElement == null || (declaredAnnotations = annotatedElement.getDeclaredAnnotations()) == null) ? C0779MN.f7117a : AbstractC9878jP1.m22033c(declaredAnnotations);
    }

    public final int hashCode() {
        return this.f43688a.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        AbstractC0852NX.m5765n(C11285uP0.class, sb, ": ");
        sb.append(this.f43688a);
        return sb.toString();
    }
}
