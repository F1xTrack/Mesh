package p000;

/* renamed from: aN1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC8717aN1 {
    /* renamed from: b */
    public static final AF0 m9722b(AF0 af0, C10226m71 c10226m71) {
        O90.m5968f(af0, "<this>");
        O90.m5968f(c10226m71, "typeTable");
        int i = af0.f126c;
        if ((i & 256) == 256) {
            return af0.f136m;
        }
        if ((i & 512) == 512) {
            return c10226m71.m22681h(af0.f137n);
        }
        return null;
    }

    /* renamed from: c */
    public static final AF0 m9723c(C9729iF0 c9729iF0, C10226m71 c10226m71) {
        O90.m5968f(c9729iF0, "<this>");
        O90.m5968f(c10226m71, "typeTable");
        if (c9729iF0.m18989p()) {
            return c9729iF0.f28989j;
        }
        if ((c9729iF0.f28982c & 64) == 64) {
            return c10226m71.m22681h(c9729iF0.f28990k);
        }
        return null;
    }

    /* renamed from: d */
    public static final AF0 m9724d(C9729iF0 c9729iF0, C10226m71 c10226m71) {
        O90.m5968f(c9729iF0, "<this>");
        O90.m5968f(c10226m71, "typeTable");
        int i = c9729iF0.f28982c;
        if ((i & 8) == 8) {
            AF0 af0 = c9729iF0.f28986g;
            O90.m5967e(af0, "getReturnType(...)");
            return af0;
        }
        if ((i & 16) == 16) {
            return c10226m71.m22681h(c9729iF0.f28987h);
        }
        throw new IllegalStateException("No returnType in ProtoBuf.Function");
    }

    /* renamed from: e */
    public static final AF0 m9725e(C10753qF0 c10753qF0, C10226m71 c10226m71) {
        O90.m5968f(c10753qF0, "<this>");
        O90.m5968f(c10226m71, "typeTable");
        int i = c10753qF0.f40687c;
        if ((i & 8) == 8) {
            AF0 af0 = c10753qF0.f40691g;
            O90.m5967e(af0, "getReturnType(...)");
            return af0;
        }
        if ((i & 16) == 16) {
            return c10226m71.m22681h(c10753qF0.f40692h);
        }
        throw new IllegalStateException("No returnType in ProtoBuf.Property");
    }

    /* renamed from: i */
    public static final AF0 m9726i(IF0 if0, C10226m71 c10226m71) {
        O90.m5968f(c10226m71, "typeTable");
        int i = if0.f4863c;
        if ((i & 4) == 4) {
            AF0 af0 = if0.f4866f;
            O90.m5967e(af0, "getType(...)");
            return af0;
        }
        if ((i & 8) == 8) {
            return c10226m71.m22681h(if0.f4867g);
        }
        throw new IllegalStateException("No type in ProtoBuf.ValueParameter");
    }

    /* renamed from: a */
    public boolean mo8926a() {
        return false;
    }

    /* renamed from: g */
    public abstract void mo8290g();

    /* renamed from: h */
    public abstract void mo8291h();

    /* renamed from: f */
    public void mo8927f() {
    }
}
