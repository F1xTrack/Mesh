package defpackage;

import java.util.List;

/* loaded from: classes.dex */
public abstract class XM1 implements InterfaceC0237Cu0 {
    public static final Object a(AbstractC7709w00 abstractC7709w00, C8089y00 c8089y00) {
        O90.f(abstractC7709w00, "<this>");
        O90.f(c8089y00, "extension");
        if (abstractC7709w00.l(c8089y00)) {
            return abstractC7709w00.k(c8089y00);
        }
        return null;
    }

    public static final Object b(AbstractC7709w00 abstractC7709w00, C8089y00 c8089y00, int i) {
        O90.f(abstractC7709w00, "<this>");
        O90.f(c8089y00, "extension");
        abstractC7709w00.o(c8089y00);
        C3968gT c3968gT = abstractC7709w00.a;
        c3968gT.getClass();
        C7899x00 c7899x00 = c8089y00.d;
        if (!c7899x00.c) {
            throw new IllegalArgumentException("getRepeatedField() can only be called on repeated fields.");
        }
        C6000n21 c6000n21 = c3968gT.a;
        Object obj = c6000n21.get(c7899x00);
        if (i >= (obj == null ? 0 : ((List) obj).size())) {
            return null;
        }
        abstractC7709w00.o(c8089y00);
        if (!c7899x00.c) {
            throw new IllegalArgumentException("getRepeatedField() can only be called on repeated fields.");
        }
        Object obj2 = c6000n21.get(c7899x00);
        if (obj2 != null) {
            return c8089y00.a(((List) obj2).get(i));
        }
        throw new IndexOutOfBoundsException();
    }
}
