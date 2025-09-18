package p000;

import java.io.Serializable;
import java.util.Collections;

/* loaded from: classes2.dex */
public abstract class A00 extends AbstractC0631K0 implements Serializable {
    /* renamed from: g */
    public static C11741y00 m5g(AbstractC11487w00 abstractC11487w00, A00 a00, int i, C9800io1 c9800io1, Class cls) {
        return new C11741y00(abstractC11487w00, Collections.emptyList(), a00, new C11614x00(i, c9800io1, true), cls);
    }

    /* renamed from: h */
    public static C11741y00 m6h(AbstractC11487w00 abstractC11487w00, Serializable serializable, A00 a00, int i, EnumC10568oo1 enumC10568oo1, Class cls) {
        return new C11741y00(abstractC11487w00, serializable, a00, new C11614x00(i, enumC10568oo1, false), cls);
    }
}
