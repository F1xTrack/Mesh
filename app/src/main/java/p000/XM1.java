package p000;

import java.util.List;

/* loaded from: classes.dex */
public abstract class XM1 implements InterfaceC7458Cu0 {
    /* renamed from: a */
    public static final Object m8993a(AbstractC11487w00 abstractC11487w00, C11741y00 c11741y00) {
        O90.m5968f(abstractC11487w00, "<this>");
        O90.m5968f(c11741y00, "extension");
        if (abstractC11487w00.m25538l(c11741y00)) {
            return abstractC11487w00.m25537k(c11741y00);
        }
        return null;
    }

    /* renamed from: b */
    public static final Object m8994b(AbstractC11487w00 abstractC11487w00, C11741y00 c11741y00, int i) {
        O90.m5968f(abstractC11487w00, "<this>");
        O90.m5968f(c11741y00, "extension");
        abstractC11487w00.m25541o(c11741y00);
        C4118gT c4118gT = abstractC11487w00.f44633a;
        c4118gT.getClass();
        C11614x00 c11614x00 = c11741y00.f46006d;
        if (!c11614x00.f45253c) {
            throw new IllegalArgumentException("getRepeatedField() can only be called on repeated fields.");
        }
        C10342n21 c10342n21 = c4118gT.f27808a;
        Object obj = c10342n21.get(c11614x00);
        if (i >= (obj == null ? 0 : ((List) obj).size())) {
            return null;
        }
        abstractC11487w00.m25541o(c11741y00);
        if (!c11614x00.f45253c) {
            throw new IllegalArgumentException("getRepeatedField() can only be called on repeated fields.");
        }
        Object obj2 = c10342n21.get(c11614x00);
        if (obj2 != null) {
            return c11741y00.m26030a(((List) obj2).get(i));
        }
        throw new IndexOutOfBoundsException();
    }
}
