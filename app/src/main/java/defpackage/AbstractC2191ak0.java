package defpackage;

import androidx.lifecycle.b;

/* renamed from: ak0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2191ak0 {
    public final InterfaceC3677ex0 a;
    public boolean b;
    public int c = -1;
    public final /* synthetic */ b d;

    public AbstractC2191ak0(b bVar, InterfaceC3677ex0 interfaceC3677ex0) {
        this.d = bVar;
        this.a = interfaceC3677ex0;
    }

    public final void a(boolean z) {
        if (z == this.b) {
            return;
        }
        this.b = z;
        int i = z ? 1 : -1;
        b bVar = this.d;
        int i2 = bVar.c;
        bVar.c = i + i2;
        if (!bVar.d) {
            bVar.d = true;
            while (true) {
                try {
                    int i3 = bVar.c;
                    if (i2 == i3) {
                        break;
                    }
                    boolean z2 = i2 == 0 && i3 > 0;
                    boolean z3 = i2 > 0 && i3 == 0;
                    if (z2) {
                        bVar.g();
                    } else if (z3) {
                        bVar.h();
                    }
                    i2 = i3;
                } catch (Throwable th) {
                    bVar.d = false;
                    throw th;
                }
            }
            bVar.d = false;
        }
        if (this.b) {
            bVar.c(this);
        }
    }

    public boolean c(InterfaceC0903Li0 interfaceC0903Li0) {
        return false;
    }

    public abstract boolean d();

    public void b() {
    }
}
