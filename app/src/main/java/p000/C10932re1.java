package p000;

import java.util.List;

/* renamed from: re1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C10932re1 implements InterfaceC11317uf0 {

    /* renamed from: a */
    public final InterfaceC8412Vd0 f41784a;

    /* renamed from: b */
    public final List f41785b;

    /* renamed from: c */
    public final int f41786c;

    public C10932re1(InterfaceC8412Vd0 interfaceC8412Vd0, List list, boolean z) {
        O90.m5968f(interfaceC8412Vd0, "classifier");
        O90.m5968f(list, "arguments");
        this.f41784a = interfaceC8412Vd0;
        this.f41785b = list;
        this.f41786c = z ? 1 : 0;
    }

    /* renamed from: b */
    public final String m24437b(boolean z) {
        String name;
        InterfaceC8412Vd0 interfaceC8412Vd0 = this.f41784a;
        InterfaceC8412Vd0 interfaceC8412Vd02 = interfaceC8412Vd0 instanceof InterfaceC8412Vd0 ? interfaceC8412Vd0 : null;
        Class clsM6213b = interfaceC8412Vd02 != null ? P22.m6213b(interfaceC8412Vd02) : null;
        if (clsM6213b == null) {
            name = interfaceC8412Vd0.toString();
        } else if (clsM6213b.isArray()) {
            name = clsM6213b.equals(boolean[].class) ? "kotlin.BooleanArray" : clsM6213b.equals(char[].class) ? "kotlin.CharArray" : clsM6213b.equals(byte[].class) ? "kotlin.ByteArray" : clsM6213b.equals(short[].class) ? "kotlin.ShortArray" : clsM6213b.equals(int[].class) ? "kotlin.IntArray" : clsM6213b.equals(float[].class) ? "kotlin.FloatArray" : clsM6213b.equals(long[].class) ? "kotlin.LongArray" : clsM6213b.equals(double[].class) ? "kotlin.DoubleArray" : "kotlin.Array";
        } else if (z && clsM6213b.isPrimitive()) {
            O90.m5966d(interfaceC8412Vd0, "null cannot be cast to non-null type kotlin.reflect.KClass<*>");
            name = P22.m6214c(interfaceC8412Vd0).getName();
        } else {
            name = clsM6213b.getName();
        }
        List list = this.f41785b;
        return AbstractC1374Vq.m8589h(name, list.isEmpty() ? "" : AbstractC7167xu.m25962H(list, ", ", "<", ">", new C10115lG0(12, this), 24), mo8537e() ? "?" : "");
    }

    @Override // p000.InterfaceC11317uf0
    /* renamed from: e */
    public final boolean mo8537e() {
        return (this.f41786c & 1) != 0;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C10932re1) {
            C10932re1 c10932re1 = (C10932re1) obj;
            if (O90.m5963a(this.f41784a, c10932re1.f41784a) && O90.m5963a(this.f41785b, c10932re1.f41785b) && O90.m5963a(null, null) && this.f41786c == c10932re1.f41786c) {
                return true;
            }
        }
        return false;
    }

    @Override // p000.InterfaceC8100Pd0
    public final List getAnnotations() {
        return C0779MN.f7117a;
    }

    @Override // p000.InterfaceC11317uf0
    /* renamed from: h */
    public final List mo8538h() {
        return this.f41785b;
    }

    public final int hashCode() {
        return ((this.f41785b.hashCode() + (this.f41784a.hashCode() * 31)) * 31) + this.f41786c;
    }

    @Override // p000.InterfaceC11317uf0
    /* renamed from: i */
    public final InterfaceC9779ie0 mo8539i() {
        return this.f41784a;
    }

    public final String toString() {
        return m24437b(false) + " (Kotlin reflection is not available)";
    }
}
