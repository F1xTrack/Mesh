package p000;

import java.lang.annotation.Annotation;
import java.util.Collection;

/* renamed from: vP0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C11413vP0 extends AbstractC10005kP0 implements InterfaceC8302Ta0 {

    /* renamed from: a */
    public final AbstractC11157tP0 f44364a;

    /* renamed from: b */
    public final Annotation[] f44365b;

    /* renamed from: c */
    public final String f44366c;

    /* renamed from: d */
    public final boolean f44367d;

    public C11413vP0(AbstractC11157tP0 abstractC11157tP0, Annotation[] annotationArr, String str, boolean z) {
        O90.m5968f(annotationArr, "reflectAnnotations");
        this.f44364a = abstractC11157tP0;
        this.f44365b = annotationArr;
        this.f44366c = str;
        this.f44367d = z;
    }

    @Override // p000.InterfaceC8302Ta0
    /* renamed from: a */
    public final WO0 mo7705a(C0664KX c0664kx) {
        O90.m5968f(c0664kx, "fqName");
        return AbstractC9878jP1.m22032b(this.f44365b, c0664kx);
    }

    @Override // p000.InterfaceC8302Ta0
    public final Collection getAnnotations() {
        return AbstractC9878jP1.m22033c(this.f44365b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        AbstractC0852NX.m5765n(C11413vP0.class, sb, ": ");
        sb.append(this.f44367d ? "vararg " : "");
        String str = this.f44366c;
        sb.append(str != null ? C8340Tt0.m7797d(str) : null);
        sb.append(": ");
        sb.append(this.f44364a);
        return sb.toString();
    }
}
