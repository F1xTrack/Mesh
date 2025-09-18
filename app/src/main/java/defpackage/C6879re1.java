package defpackage;

import java.util.List;

/* renamed from: re1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6879re1 implements InterfaceC7454uf0 {
    public final InterfaceC1667Vd0 a;
    public final List b;
    public final int c;

    public C6879re1(InterfaceC1667Vd0 interfaceC1667Vd0, List list, boolean z) {
        O90.f(interfaceC1667Vd0, "classifier");
        O90.f(list, "arguments");
        this.a = interfaceC1667Vd0;
        this.b = list;
        this.c = z ? 1 : 0;
    }

    public final String b(boolean z) {
        String name;
        InterfaceC1667Vd0 interfaceC1667Vd0 = this.a;
        InterfaceC1667Vd0 interfaceC1667Vd02 = interfaceC1667Vd0 instanceof InterfaceC1667Vd0 ? interfaceC1667Vd0 : null;
        Class clsB = interfaceC1667Vd02 != null ? P22.b(interfaceC1667Vd02) : null;
        if (clsB == null) {
            name = interfaceC1667Vd0.toString();
        } else if (clsB.isArray()) {
            name = clsB.equals(boolean[].class) ? "kotlin.BooleanArray" : clsB.equals(char[].class) ? "kotlin.CharArray" : clsB.equals(byte[].class) ? "kotlin.ByteArray" : clsB.equals(short[].class) ? "kotlin.ShortArray" : clsB.equals(int[].class) ? "kotlin.IntArray" : clsB.equals(float[].class) ? "kotlin.FloatArray" : clsB.equals(long[].class) ? "kotlin.LongArray" : clsB.equals(double[].class) ? "kotlin.DoubleArray" : "kotlin.Array";
        } else if (z && clsB.isPrimitive()) {
            O90.d(interfaceC1667Vd0, "null cannot be cast to non-null type kotlin.reflect.KClass<*>");
            name = P22.c(interfaceC1667Vd0).getName();
        } else {
            name = clsB.getName();
        }
        List list = this.b;
        return AbstractC1705Vq.h(name, list.isEmpty() ? "" : AbstractC8069xu.H(list, ", ", "<", ">", new C5661lG0(12, this), 24), e() ? "?" : "");
    }

    @Override // defpackage.InterfaceC7454uf0
    public final boolean e() {
        return (this.c & 1) != 0;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C6879re1) {
            C6879re1 c6879re1 = (C6879re1) obj;
            if (O90.a(this.a, c6879re1.a) && O90.a(this.b, c6879re1.b) && O90.a(null, null) && this.c == c6879re1.c) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.InterfaceC1199Pd0
    public final List getAnnotations() {
        return MN.a;
    }

    @Override // defpackage.InterfaceC7454uf0
    public final List h() {
        return this.b;
    }

    public final int hashCode() {
        return ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31) + this.c;
    }

    @Override // defpackage.InterfaceC7454uf0
    public final InterfaceC4384ie0 i() {
        return this.a;
    }

    public final String toString() {
        return b(false) + " (Kotlin reflection is not available)";
    }
}
