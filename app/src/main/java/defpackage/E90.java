package defpackage;

import java.util.Map;

/* loaded from: classes.dex */
public final class E90 implements ER0, TD0 {
    public final CX a;
    public final ER0 b;
    public final CX c;
    public final BX d;

    public E90(CX cx, BX bx) {
        this.a = cx;
        this.b = bx;
        this.c = cx;
        this.d = bx;
    }

    @Override // defpackage.TD0
    public final void a(RD0 rd0, String str, Map map) {
        O90.f(rd0, "context");
        CX cx = this.a;
        if (cx != null) {
            cx.i(((C7647vg) rd0).b, str, map);
        }
        ER0 er0 = this.b;
        if (er0 != null) {
            er0.a(rd0, str, map);
        }
    }

    @Override // defpackage.ER0
    public final void b(C8387zZ0 c8387zZ0) {
        CX cx = this.c;
        if (cx != null) {
            boolean zH = c8387zZ0.h();
            cx.b(c8387zZ0.a, c8387zZ0.d, c8387zZ0.b, zH);
        }
        BX bx = this.d;
        if (bx != null) {
            bx.b(c8387zZ0);
        }
    }

    @Override // defpackage.TD0
    public final void c(RD0 rd0) {
        O90.f(rd0, "context");
        CX cx = this.a;
        if (cx != null) {
            cx.g(((C7647vg) rd0).b);
        }
        ER0 er0 = this.b;
        if (er0 != null) {
            er0.c(rd0);
        }
    }

    @Override // defpackage.ER0
    public final void d(C8387zZ0 c8387zZ0, Throwable th) {
        O90.f(c8387zZ0, "producerContext");
        CX cx = this.c;
        if (cx != null) {
            cx.c(c8387zZ0.a, c8387zZ0.b, th, c8387zZ0.h());
        }
        BX bx = this.d;
        if (bx != null) {
            bx.d(c8387zZ0, th);
        }
    }

    @Override // defpackage.TD0
    public final void e(RD0 rd0, String str, Throwable th, Map map) {
        O90.f(rd0, "context");
        CX cx = this.a;
        if (cx != null) {
            cx.j(((C7647vg) rd0).b, str, th, map);
        }
        ER0 er0 = this.b;
        if (er0 != null) {
            er0.e(rd0, str, th, map);
        }
    }

    @Override // defpackage.TD0
    public final void f(RD0 rd0, String str, boolean z) {
        O90.f(rd0, "context");
        CX cx = this.a;
        if (cx != null) {
            cx.f(((C7647vg) rd0).b, str, z);
        }
        ER0 er0 = this.b;
        if (er0 != null) {
            er0.f(rd0, str, z);
        }
    }

    @Override // defpackage.ER0
    public final void g(RD0 rd0) {
        O90.f(rd0, "producerContext");
        CX cx = this.c;
        if (cx != null) {
            C7647vg c7647vg = (C7647vg) rd0;
            cx.a(c7647vg.a, c7647vg.b, c7647vg.h());
        }
        BX bx = this.d;
        if (bx != null) {
            bx.g(rd0);
        }
    }

    @Override // defpackage.ER0
    public final void h(RD0 rd0) {
        O90.f(rd0, "producerContext");
        CX cx = this.c;
        if (cx != null) {
            cx.k(((C7647vg) rd0).b);
        }
        BX bx = this.d;
        if (bx != null) {
            bx.h(rd0);
        }
    }

    @Override // defpackage.TD0
    public final boolean i(RD0 rd0, String str) {
        O90.f(rd0, "context");
        CX cx = this.a;
        Boolean boolValueOf = cx != null ? Boolean.valueOf(cx.h(((C7647vg) rd0).b)) : null;
        if (!O90.a(boolValueOf, Boolean.TRUE)) {
            ER0 er0 = this.b;
            boolValueOf = er0 != null ? Boolean.valueOf(er0.i(rd0, str)) : null;
        }
        if (boolValueOf != null) {
            return boolValueOf.booleanValue();
        }
        return false;
    }

    @Override // defpackage.TD0
    public final void j(RD0 rd0, String str) {
        O90.f(rd0, "context");
        CX cx = this.a;
        if (cx != null) {
            cx.d(((C7647vg) rd0).b, str);
        }
        ER0 er0 = this.b;
        if (er0 != null) {
            er0.j(rd0, str);
        }
    }

    @Override // defpackage.TD0
    public final void k(RD0 rd0, String str) {
        O90.f(rd0, "context");
        CX cx = this.a;
        if (cx != null) {
            cx.e(((C7647vg) rd0).b, str);
        }
        ER0 er0 = this.b;
        if (er0 != null) {
            er0.k(rd0, str);
        }
    }
}
