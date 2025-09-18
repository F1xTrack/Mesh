package p000;

import java.util.Map;

/* loaded from: classes.dex */
public final class E90 implements ER0, TD0 {

    /* renamed from: a */
    public final C0160CX f2512a;

    /* renamed from: b */
    public final ER0 f2513b;

    /* renamed from: c */
    public final C0160CX f2514c;

    /* renamed from: d */
    public final C0097BX f2515d;

    public E90(C0160CX c0160cx, C0097BX c0097bx) {
        this.f2512a = c0160cx;
        this.f2513b = c0097bx;
        this.f2514c = c0160cx;
        this.f2515d = c0097bx;
    }

    @Override // p000.TD0
    /* renamed from: a */
    public final void mo743a(RD0 rd0, String str, Map map) {
        O90.m5968f(rd0, "context");
        C0160CX c0160cx = this.f2512a;
        if (c0160cx != null) {
            c0160cx.mo1202i(((C7027vg) rd0).f44474b, str, map);
        }
        ER0 er0 = this.f2513b;
        if (er0 != null) {
            er0.mo743a(rd0, str, map);
        }
    }

    @Override // p000.ER0
    /* renamed from: b */
    public final void mo744b(C11941zZ0 c11941zZ0) {
        C0160CX c0160cx = this.f2514c;
        if (c0160cx != null) {
            boolean zM25466h = c11941zZ0.m25466h();
            c0160cx.mo1195b(c11941zZ0.f44473a, c11941zZ0.f44476d, c11941zZ0.f44474b, zM25466h);
        }
        C0097BX c0097bx = this.f2515d;
        if (c0097bx != null) {
            c0097bx.mo744b(c11941zZ0);
        }
    }

    @Override // p000.TD0
    /* renamed from: c */
    public final void mo745c(RD0 rd0) {
        O90.m5968f(rd0, "context");
        C0160CX c0160cx = this.f2512a;
        if (c0160cx != null) {
            c0160cx.mo1200g(((C7027vg) rd0).f44474b);
        }
        ER0 er0 = this.f2513b;
        if (er0 != null) {
            er0.mo745c(rd0);
        }
    }

    @Override // p000.ER0
    /* renamed from: d */
    public final void mo746d(C11941zZ0 c11941zZ0, Throwable th) {
        O90.m5968f(c11941zZ0, "producerContext");
        C0160CX c0160cx = this.f2514c;
        if (c0160cx != null) {
            c0160cx.mo1196c(c11941zZ0.f44473a, c11941zZ0.f44474b, th, c11941zZ0.m25466h());
        }
        C0097BX c0097bx = this.f2515d;
        if (c0097bx != null) {
            c0097bx.mo746d(c11941zZ0, th);
        }
    }

    @Override // p000.TD0
    /* renamed from: e */
    public final void mo747e(RD0 rd0, String str, Throwable th, Map map) {
        O90.m5968f(rd0, "context");
        C0160CX c0160cx = this.f2512a;
        if (c0160cx != null) {
            c0160cx.mo1203j(((C7027vg) rd0).f44474b, str, th, map);
        }
        ER0 er0 = this.f2513b;
        if (er0 != null) {
            er0.mo747e(rd0, str, th, map);
        }
    }

    @Override // p000.TD0
    /* renamed from: f */
    public final void mo748f(RD0 rd0, String str, boolean z) {
        O90.m5968f(rd0, "context");
        C0160CX c0160cx = this.f2512a;
        if (c0160cx != null) {
            c0160cx.mo1199f(((C7027vg) rd0).f44474b, str, z);
        }
        ER0 er0 = this.f2513b;
        if (er0 != null) {
            er0.mo748f(rd0, str, z);
        }
    }

    @Override // p000.ER0
    /* renamed from: g */
    public final void mo749g(RD0 rd0) {
        O90.m5968f(rd0, "producerContext");
        C0160CX c0160cx = this.f2514c;
        if (c0160cx != null) {
            C7027vg c7027vg = (C7027vg) rd0;
            c0160cx.mo1194a(c7027vg.f44473a, c7027vg.f44474b, c7027vg.m25466h());
        }
        C0097BX c0097bx = this.f2515d;
        if (c0097bx != null) {
            c0097bx.mo749g(rd0);
        }
    }

    @Override // p000.ER0
    /* renamed from: h */
    public final void mo750h(RD0 rd0) {
        O90.m5968f(rd0, "producerContext");
        C0160CX c0160cx = this.f2514c;
        if (c0160cx != null) {
            c0160cx.mo1204k(((C7027vg) rd0).f44474b);
        }
        C0097BX c0097bx = this.f2515d;
        if (c0097bx != null) {
            c0097bx.mo750h(rd0);
        }
    }

    @Override // p000.TD0
    /* renamed from: i */
    public final boolean mo751i(RD0 rd0, String str) {
        O90.m5968f(rd0, "context");
        C0160CX c0160cx = this.f2512a;
        Boolean boolValueOf = c0160cx != null ? Boolean.valueOf(c0160cx.mo1201h(((C7027vg) rd0).f44474b)) : null;
        if (!O90.m5963a(boolValueOf, Boolean.TRUE)) {
            ER0 er0 = this.f2513b;
            boolValueOf = er0 != null ? Boolean.valueOf(er0.mo751i(rd0, str)) : null;
        }
        if (boolValueOf != null) {
            return boolValueOf.booleanValue();
        }
        return false;
    }

    @Override // p000.TD0
    /* renamed from: j */
    public final void mo752j(RD0 rd0, String str) {
        O90.m5968f(rd0, "context");
        C0160CX c0160cx = this.f2512a;
        if (c0160cx != null) {
            c0160cx.mo1197d(((C7027vg) rd0).f44474b, str);
        }
        ER0 er0 = this.f2513b;
        if (er0 != null) {
            er0.mo752j(rd0, str);
        }
    }

    @Override // p000.TD0
    /* renamed from: k */
    public final void mo753k(RD0 rd0, String str) {
        O90.m5968f(rd0, "context");
        C0160CX c0160cx = this.f2512a;
        if (c0160cx != null) {
            c0160cx.mo1198e(((C7027vg) rd0).f44474b, str);
        }
        ER0 er0 = this.f2513b;
        if (er0 != null) {
            er0.mo753k(rd0, str);
        }
    }
}
