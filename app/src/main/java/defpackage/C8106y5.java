package defpackage;

import java.util.Map;

/* renamed from: y5, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C8106y5 implements InterfaceC7916x5 {
    public final X01 a;
    public final Map b;
    public final W21 c;

    public C8106y5(X01 x01, Map map, W21 w21) {
        if (x01 == null) {
            a(0);
            throw null;
        }
        if (map == null) {
            a(1);
            throw null;
        }
        this.a = x01;
        this.b = map;
        this.c = w21;
    }

    public static /* synthetic */ void a(int i) {
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

    @Override // defpackage.InterfaceC7916x5
    public final W21 e() {
        W21 w21 = this.c;
        if (w21 != null) {
            return w21;
        }
        a(5);
        throw null;
    }

    @Override // defpackage.InterfaceC7916x5
    public final KX f() {
        InterfaceC7492us interfaceC7492usD = AbstractC7384uI.d(this);
        if (interfaceC7492usD == null) {
            return null;
        }
        if (C5496kP.f(interfaceC7492usD)) {
            interfaceC7492usD = null;
        }
        if (interfaceC7492usD != null) {
            return AbstractC7384uI.c(interfaceC7492usD);
        }
        return null;
    }

    @Override // defpackage.InterfaceC7916x5
    public final Map g() {
        Map map = this.b;
        if (map != null) {
            return map;
        }
        a(4);
        throw null;
    }

    @Override // defpackage.InterfaceC7916x5
    public final AbstractC0663Ig0 getType() {
        X01 x01 = this.a;
        if (x01 != null) {
            return x01;
        }
        a(3);
        throw null;
    }

    public final String toString() {
        return C5857mI.c.x(this, null);
    }
}
