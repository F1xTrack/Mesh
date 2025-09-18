package defpackage;

import android.os.Looper;
import java.util.concurrent.Executor;
import kotlin.KotlinVersion;

/* renamed from: Ph, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1210Ph extends AbstractC1611Uk1 {
    public C0390Et0 A;
    public Executor d;
    public EO1 e;
    public C0821Kh f;
    public C1155Oo1 g;
    public C1857Xo1 h;
    public C0999Mo1 i;
    public DialogInterfaceOnClickListenerC1132Oh j;
    public String k;
    public boolean m;
    public boolean n;
    public boolean o;
    public boolean p;
    public boolean q;
    public C0390Et0 r;
    public C0390Et0 s;
    public C0390Et0 t;
    public C0390Et0 u;
    public C0390Et0 v;
    public C0390Et0 x;
    public C0390Et0 z;
    public int l = 0;
    public boolean w = true;
    public int y = 0;

    public static void i(C0390Et0 c0390Et0, Object obj) {
        if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
            c0390Et0.j(obj);
        } else {
            c0390Et0.k(obj);
        }
    }

    public final int c() {
        C0821Kh c0821Kh = this.f;
        if (c0821Kh == null) {
            return 0;
        }
        C1155Oo1 c1155Oo1 = this.g;
        int i = c0821Kh.f;
        if (i != 0) {
            return i;
        }
        if (c1155Oo1 != null) {
            return 15;
        }
        return KotlinVersion.MAX_COMPONENT_VALUE;
    }

    public final CharSequence d() {
        String str = this.k;
        if (str != null) {
            return str;
        }
        C0821Kh c0821Kh = this.f;
        if (c0821Kh == null) {
            return null;
        }
        String str2 = c0821Kh.d;
        return str2 != null ? str2 : "";
    }

    public final void e(C7840wh c7840wh) {
        if (this.s == null) {
            this.s = new C0390Et0();
        }
        i(this.s, c7840wh);
    }

    public final void f(CharSequence charSequence) {
        if (this.A == null) {
            this.A = new C0390Et0();
        }
        i(this.A, charSequence);
    }

    public final void g(int i) {
        if (this.z == null) {
            this.z = new C0390Et0();
        }
        i(this.z, Integer.valueOf(i));
    }

    public final void h(boolean z) {
        if (this.v == null) {
            this.v = new C0390Et0();
        }
        i(this.v, Boolean.valueOf(z));
    }
}
