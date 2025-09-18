package defpackage;

import java.lang.annotation.Annotation;
import java.util.Collection;

/* renamed from: vP0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C7597vP0 extends AbstractC5497kP0 implements InterfaceC1502Ta0 {
    public final AbstractC7215tP0 a;
    public final Annotation[] b;
    public final String c;
    public final boolean d;

    public C7597vP0(AbstractC7215tP0 abstractC7215tP0, Annotation[] annotationArr, String str, boolean z) {
        O90.f(annotationArr, "reflectAnnotations");
        this.a = abstractC7215tP0;
        this.b = annotationArr;
        this.c = str;
        this.d = z;
    }

    @Override // defpackage.InterfaceC1502Ta0
    public final WO0 a(KX kx) {
        O90.f(kx, "fqName");
        return AbstractC5307jP1.b(this.b, kx);
    }

    @Override // defpackage.InterfaceC1502Ta0
    public final Collection getAnnotations() {
        return AbstractC5307jP1.c(this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        NX.n(C7597vP0.class, sb, ": ");
        sb.append(this.d ? "vararg " : "");
        String str = this.c;
        sb.append(str != null ? C1559Tt0.d(str) : null);
        sb.append(": ");
        sb.append(this.a);
        return sb.toString();
    }
}
