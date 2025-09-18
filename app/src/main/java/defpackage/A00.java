package defpackage;

import java.io.Serializable;
import java.util.Collections;

/* loaded from: classes2.dex */
public abstract class A00 extends K0 implements Serializable {
    public static C8089y00 g(AbstractC7709w00 abstractC7709w00, A00 a00, int i, C5192io1 c5192io1, Class cls) {
        return new C8089y00(abstractC7709w00, Collections.emptyList(), a00, new C7899x00(i, c5192io1, true), cls);
    }

    public static C8089y00 h(AbstractC7709w00 abstractC7709w00, Serializable serializable, A00 a00, int i, EnumC6337oo1 enumC6337oo1, Class cls) {
        return new C8089y00(abstractC7709w00, serializable, a00, new C7899x00(i, enumC6337oo1, false), cls);
    }
}
