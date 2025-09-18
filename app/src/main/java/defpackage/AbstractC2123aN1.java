package defpackage;

/* renamed from: aN1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2123aN1 {
    public static final AF0 b(AF0 af0, C5826m71 c5826m71) {
        O90.f(af0, "<this>");
        O90.f(c5826m71, "typeTable");
        int i = af0.c;
        if ((i & 256) == 256) {
            return af0.m;
        }
        if ((i & 512) == 512) {
            return c5826m71.h(af0.n);
        }
        return null;
    }

    public static final AF0 c(C4309iF0 c4309iF0, C5826m71 c5826m71) {
        O90.f(c4309iF0, "<this>");
        O90.f(c5826m71, "typeTable");
        if (c4309iF0.p()) {
            return c4309iF0.j;
        }
        if ((c4309iF0.c & 64) == 64) {
            return c5826m71.h(c4309iF0.k);
        }
        return null;
    }

    public static final AF0 d(C4309iF0 c4309iF0, C5826m71 c5826m71) {
        O90.f(c4309iF0, "<this>");
        O90.f(c5826m71, "typeTable");
        int i = c4309iF0.c;
        if ((i & 8) == 8) {
            AF0 af0 = c4309iF0.g;
            O90.e(af0, "getReturnType(...)");
            return af0;
        }
        if ((i & 16) == 16) {
            return c5826m71.h(c4309iF0.h);
        }
        throw new IllegalStateException("No returnType in ProtoBuf.Function");
    }

    public static final AF0 e(C6613qF0 c6613qF0, C5826m71 c5826m71) {
        O90.f(c6613qF0, "<this>");
        O90.f(c5826m71, "typeTable");
        int i = c6613qF0.c;
        if ((i & 8) == 8) {
            AF0 af0 = c6613qF0.g;
            O90.e(af0, "getReturnType(...)");
            return af0;
        }
        if ((i & 16) == 16) {
            return c5826m71.h(c6613qF0.h);
        }
        throw new IllegalStateException("No returnType in ProtoBuf.Property");
    }

    public static final AF0 i(IF0 if0, C5826m71 c5826m71) {
        O90.f(c5826m71, "typeTable");
        int i = if0.c;
        if ((i & 4) == 4) {
            AF0 af0 = if0.f;
            O90.e(af0, "getType(...)");
            return af0;
        }
        if ((i & 8) == 8) {
            return c5826m71.h(if0.g);
        }
        throw new IllegalStateException("No type in ProtoBuf.ValueParameter");
    }

    public boolean a() {
        return false;
    }

    public abstract void g();

    public abstract void h();

    public void f() {
    }
}
