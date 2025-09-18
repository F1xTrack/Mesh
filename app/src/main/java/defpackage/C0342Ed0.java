package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: Ed0 */
/* loaded from: classes2.dex */
public final class C0342Ed0 extends AbstractC6754r00 implements InterfaceC6917rr0 {
    public int b;
    public int c;
    public int d;
    public Object e;
    public EnumC0420Fd0 f;
    public List g;
    public List h;

    public static C0342Ed0 l() {
        C0342Ed0 c0342Ed0 = new C0342Ed0();
        c0342Ed0.c = 1;
        c0342Ed0.e = "";
        c0342Ed0.f = EnumC0420Fd0.NONE;
        c0342Ed0.g = Collections.emptyList();
        c0342Ed0.h = Collections.emptyList();
        return c0342Ed0;
    }

    public final Object clone() {
        C0342Ed0 c0342Ed0L = l();
        c0342Ed0L.m(k());
        return c0342Ed0L;
    }

    @Override // defpackage.AbstractC6754r00
    public final K0 h() {
        C0498Gd0 c0498Gd0K = k();
        if (c0498Gd0K.e()) {
            return c0498Gd0K;
        }
        throw new C7074sg();
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x001b  */
    @Override // defpackage.AbstractC6754r00
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.AbstractC6754r00 i(defpackage.C5780lu r2, defpackage.DR r3) throws java.lang.Throwable {
        /*
            r1 = this;
            r3 = 0
            xd0 r0 = defpackage.C0498Gd0.n     // Catch: java.lang.Throwable -> Lf defpackage.Y90 -> L11
            r0.getClass()     // Catch: java.lang.Throwable -> Lf defpackage.Y90 -> L11
            Gd0 r0 = new Gd0     // Catch: java.lang.Throwable -> Lf defpackage.Y90 -> L11
            r0.<init>(r2)     // Catch: java.lang.Throwable -> Lf defpackage.Y90 -> L11
            r1.m(r0)
            return r1
        Lf:
            r2 = move-exception
            goto L19
        L11:
            r2 = move-exception
            K0 r0 = r2.a     // Catch: java.lang.Throwable -> Lf
            Gd0 r0 = (defpackage.C0498Gd0) r0     // Catch: java.lang.Throwable -> Lf
            throw r2     // Catch: java.lang.Throwable -> L17
        L17:
            r2 = move-exception
            r3 = r0
        L19:
            if (r3 == 0) goto L1e
            r1.m(r3)
        L1e:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C0342Ed0.i(lu, DR):r00");
    }

    @Override // defpackage.AbstractC6754r00
    public final /* bridge */ /* synthetic */ AbstractC6754r00 j(A00 a00) {
        m((C0498Gd0) a00);
        return this;
    }

    public final C0498Gd0 k() {
        C0498Gd0 c0498Gd0 = new C0498Gd0(this);
        int i = this.b;
        int i2 = (i & 1) != 1 ? 0 : 1;
        c0498Gd0.c = this.c;
        if ((i & 2) == 2) {
            i2 |= 2;
        }
        c0498Gd0.d = this.d;
        if ((i & 4) == 4) {
            i2 |= 4;
        }
        c0498Gd0.e = this.e;
        if ((i & 8) == 8) {
            i2 |= 8;
        }
        c0498Gd0.f = this.f;
        if ((i & 16) == 16) {
            this.g = Collections.unmodifiableList(this.g);
            this.b &= -17;
        }
        c0498Gd0.g = this.g;
        if ((this.b & 32) == 32) {
            this.h = Collections.unmodifiableList(this.h);
            this.b &= -33;
        }
        c0498Gd0.i = this.h;
        c0498Gd0.b = i2;
        return c0498Gd0;
    }

    public final void m(C0498Gd0 c0498Gd0) {
        if (c0498Gd0 == C0498Gd0.m) {
            return;
        }
        int i = c0498Gd0.b;
        if ((i & 1) == 1) {
            int i2 = c0498Gd0.c;
            this.b = 1 | this.b;
            this.c = i2;
        }
        if ((i & 2) == 2) {
            int i3 = c0498Gd0.d;
            this.b = 2 | this.b;
            this.d = i3;
        }
        if ((i & 4) == 4) {
            this.b |= 4;
            this.e = c0498Gd0.e;
        }
        if ((i & 8) == 8) {
            EnumC0420Fd0 enumC0420Fd0 = c0498Gd0.f;
            enumC0420Fd0.getClass();
            this.b = 8 | this.b;
            this.f = enumC0420Fd0;
        }
        if (!c0498Gd0.g.isEmpty()) {
            if (this.g.isEmpty()) {
                this.g = c0498Gd0.g;
                this.b &= -17;
            } else {
                if ((this.b & 16) != 16) {
                    this.g = new ArrayList(this.g);
                    this.b |= 16;
                }
                this.g.addAll(c0498Gd0.g);
            }
        }
        if (!c0498Gd0.i.isEmpty()) {
            if (this.h.isEmpty()) {
                this.h = c0498Gd0.i;
                this.b &= -33;
            } else {
                if ((this.b & 32) != 32) {
                    this.h = new ArrayList(this.h);
                    this.b |= 32;
                }
                this.h.addAll(c0498Gd0.i);
            }
        }
        this.a = this.a.d(c0498Gd0.a);
    }
}
