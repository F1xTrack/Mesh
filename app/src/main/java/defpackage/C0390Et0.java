package defpackage;

import androidx.lifecycle.b;

/* renamed from: Et0 */
/* loaded from: classes.dex */
public class C0390Et0 extends b {
    @Override // androidx.lifecycle.b
    public void j(Object obj) {
        b.a("setValue");
        this.g++;
        this.e = obj;
        c(null);
    }

    public final void k(Object obj) {
        boolean z;
        synchronized (this.a) {
            z = this.f == b.k;
            this.f = obj;
        }
        if (z) {
            C4287i8.c().d(this.j);
        }
    }
}
