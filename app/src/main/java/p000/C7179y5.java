package p000;

import java.util.Map;

/* renamed from: y5 */
/* loaded from: classes2.dex */
public final class C7179y5 implements InterfaceC7116x5 {

    /* renamed from: a */
    public final X01 f46081a;

    /* renamed from: b */
    public final Map f46082b;

    /* renamed from: c */
    public final W21 f46083c;

    public C7179y5(X01 x01, Map map, W21 w21) {
        if (x01 == null) {
            m26043a(0);
            throw null;
        }
        if (map == null) {
            m26043a(1);
            throw null;
        }
        this.f46081a = x01;
        this.f46082b = map;
        this.f46083c = w21;
    }

    /* renamed from: a */
    public static /* synthetic */ void m26043a(int i) {
        String str = (i == 3 || i == 4 || i == 5) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 3 || i == 4 || i == 5) ? 2 : 3];
        if (i == 1) {
            objArr[0] = "valueArguments";
        } else if (i == 2) {
            objArr[0] = "source";
        } else if (i == 3 || i == 4 || i == 5) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/annotations/AnnotationDescriptorImpl";
        } else {
            objArr[0] = "annotationType";
        }
        if (i == 3) {
            objArr[1] = "getType";
        } else if (i == 4) {
            objArr[1] = "getAllValueArguments";
        } else if (i != 5) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/annotations/AnnotationDescriptorImpl";
        } else {
            objArr[1] = "getSource";
        }
        if (i != 3 && i != 4 && i != 5) {
            objArr[2] = "<init>";
        }
        String str2 = String.format(str, objArr);
        if (i != 3 && i != 4 && i != 5) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @Override // p000.InterfaceC7116x5
    /* renamed from: e */
    public final W21 mo4959e() {
        W21 w21 = this.f46083c;
        if (w21 != null) {
            return w21;
        }
        m26043a(5);
        throw null;
    }

    @Override // p000.InterfaceC7116x5
    /* renamed from: f */
    public final C0664KX mo4960f() {
        InterfaceC6976us interfaceC6976usM25151d = AbstractC6940uI.m25151d(this);
        if (interfaceC6976usM25151d == null) {
            return null;
        }
        if (C6298kP.m22200f(interfaceC6976usM25151d)) {
            interfaceC6976usM25151d = null;
        }
        if (interfaceC6976usM25151d != null) {
            return AbstractC6940uI.m25150c(interfaceC6976usM25151d);
        }
        return null;
    }

    @Override // p000.InterfaceC7116x5
    /* renamed from: g */
    public final Map mo4961g() {
        Map map = this.f46082b;
        if (map != null) {
            return map;
        }
        m26043a(4);
        throw null;
    }

    @Override // p000.InterfaceC7116x5
    public final AbstractC7742Ig0 getType() {
        X01 x01 = this.f46081a;
        if (x01 != null) {
            return x01;
        }
        m26043a(3);
        throw null;
    }

    public final String toString() {
        return C6417mI.f37617c.m22768x(this, null);
    }
}
