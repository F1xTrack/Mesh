package p000;

import android.os.Looper;
import java.util.concurrent.Executor;
import kotlin.KotlinVersion;

/* renamed from: Ph */
/* loaded from: classes.dex */
public final class C0988Ph extends AbstractC8375Uk1 {

    /* renamed from: A */
    public C7560Et0 f9226A;

    /* renamed from: d */
    public Executor f9227d;

    /* renamed from: e */
    public EO1 f9228e;

    /* renamed from: f */
    public C0674Kh f9229f;

    /* renamed from: g */
    public C8071Oo1 f9230g;

    /* renamed from: h */
    public C8539Xo1 f9231h;

    /* renamed from: i */
    public C7967Mo1 f9232i;

    /* renamed from: j */
    public DialogInterfaceOnClickListenerC0925Oh f9233j;

    /* renamed from: k */
    public String f9234k;

    /* renamed from: m */
    public boolean f9236m;

    /* renamed from: n */
    public boolean f9237n;

    /* renamed from: o */
    public boolean f9238o;

    /* renamed from: p */
    public boolean f9239p;

    /* renamed from: q */
    public boolean f9240q;

    /* renamed from: r */
    public C7560Et0 f9241r;

    /* renamed from: s */
    public C7560Et0 f9242s;

    /* renamed from: t */
    public C7560Et0 f9243t;

    /* renamed from: u */
    public C7560Et0 f9244u;

    /* renamed from: v */
    public C7560Et0 f9245v;

    /* renamed from: x */
    public C7560Et0 f9247x;

    /* renamed from: z */
    public C7560Et0 f9249z;

    /* renamed from: l */
    public int f9235l = 0;

    /* renamed from: w */
    public boolean f9246w = true;

    /* renamed from: y */
    public int f9248y = 0;

    /* renamed from: i */
    public static void m6411i(C7560Et0 c7560Et0, Object obj) {
        if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
            c7560Et0.mo2439j(obj);
        } else {
            c7560Et0.m2440k(obj);
        }
    }

    /* renamed from: c */
    public final int m6412c() {
        C0674Kh c0674Kh = this.f9229f;
        if (c0674Kh == null) {
            return 0;
        }
        C8071Oo1 c8071Oo1 = this.f9230g;
        int i = c0674Kh.f6257f;
        if (i != 0) {
            return i;
        }
        if (c8071Oo1 != null) {
            return 15;
        }
        return KotlinVersion.MAX_COMPONENT_VALUE;
    }

    /* renamed from: d */
    public final CharSequence m6413d() {
        String str = this.f9234k;
        if (str != null) {
            return str;
        }
        C0674Kh c0674Kh = this.f9229f;
        if (c0674Kh == null) {
            return null;
        }
        String str2 = c0674Kh.f6255d;
        return str2 != null ? str2 : "";
    }

    /* renamed from: e */
    public final void m6414e(C7091wh c7091wh) {
        if (this.f9242s == null) {
            this.f9242s = new C7560Et0();
        }
        m6411i(this.f9242s, c7091wh);
    }

    /* renamed from: f */
    public final void m6415f(CharSequence charSequence) {
        if (this.f9226A == null) {
            this.f9226A = new C7560Et0();
        }
        m6411i(this.f9226A, charSequence);
    }

    /* renamed from: g */
    public final void m6416g(int i) {
        if (this.f9249z == null) {
            this.f9249z = new C7560Et0();
        }
        m6411i(this.f9249z, Integer.valueOf(i));
    }

    /* renamed from: h */
    public final void m6417h(boolean z) {
        if (this.f9245v == null) {
            this.f9245v = new C7560Et0();
        }
        m6411i(this.f9245v, Boolean.valueOf(z));
    }
}
