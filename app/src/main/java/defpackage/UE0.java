package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
public final class UE0 extends AbstractC7518v00 {
    public int d;
    public int e;
    public List f;
    public List g;

    public static UE0 m() {
        UE0 ue0 = new UE0();
        ue0.e = 6;
        ue0.f = Collections.emptyList();
        ue0.g = Collections.emptyList();
        return ue0;
    }

    public final Object clone() {
        UE0 ue0M = m();
        ue0M.n(l());
        return ue0M;
    }

    @Override // defpackage.AbstractC6754r00
    public final K0 h() {
        VE0 ve0L = l();
        if (ve0L.e()) {
            return ve0L;
        }
        throw new C7074sg();
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x001b  */
    @Override // defpackage.AbstractC6754r00
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.AbstractC6754r00 i(defpackage.C5780lu r3, defpackage.DR r4) throws java.lang.Throwable {
        /*
            r2 = this;
            r0 = 0
            xd0 r1 = defpackage.VE0.j     // Catch: java.lang.Throwable -> Lf defpackage.Y90 -> L11
            r1.getClass()     // Catch: java.lang.Throwable -> Lf defpackage.Y90 -> L11
            VE0 r1 = new VE0     // Catch: java.lang.Throwable -> Lf defpackage.Y90 -> L11
            r1.<init>(r3, r4)     // Catch: java.lang.Throwable -> Lf defpackage.Y90 -> L11
            r2.n(r1)
            return r2
        Lf:
            r3 = move-exception
            goto L19
        L11:
            r3 = move-exception
            K0 r4 = r3.a     // Catch: java.lang.Throwable -> Lf
            VE0 r4 = (defpackage.VE0) r4     // Catch: java.lang.Throwable -> Lf
            throw r3     // Catch: java.lang.Throwable -> L17
        L17:
            r3 = move-exception
            r0 = r4
        L19:
            if (r0 == 0) goto L1e
            r2.n(r0)
        L1e:
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.UE0.i(lu, DR):r00");
    }

    @Override // defpackage.AbstractC6754r00
    public final /* bridge */ /* synthetic */ AbstractC6754r00 j(A00 a00) {
        n((VE0) a00);
        return this;
    }

    public final VE0 l() {
        VE0 ve0 = new VE0(this);
        int i = this.d;
        int i2 = (i & 1) != 1 ? 0 : 1;
        ve0.d = this.e;
        if ((i & 2) == 2) {
            this.f = Collections.unmodifiableList(this.f);
            this.d &= -3;
        }
        ve0.e = this.f;
        if ((this.d & 4) == 4) {
            this.g = Collections.unmodifiableList(this.g);
            this.d &= -5;
        }
        ve0.f = this.g;
        ve0.c = i2;
        return ve0;
    }

    public final void n(VE0 ve0) {
        if (ve0 == VE0.i) {
            return;
        }
        if ((ve0.c & 1) == 1) {
            int i = ve0.d;
            this.d = 1 | this.d;
            this.e = i;
        }
        if (!ve0.e.isEmpty()) {
            if (this.f.isEmpty()) {
                this.f = ve0.e;
                this.d &= -3;
            } else {
                if ((this.d & 2) != 2) {
                    this.f = new ArrayList(this.f);
                    this.d |= 2;
                }
                this.f.addAll(ve0.e);
            }
        }
        if (!ve0.f.isEmpty()) {
            if (this.g.isEmpty()) {
                this.g = ve0.f;
                this.d &= -5;
            } else {
                if ((this.d & 4) != 4) {
                    this.g = new ArrayList(this.g);
                    this.d |= 4;
                }
                this.g.addAll(ve0.f);
            }
        }
        k(ve0);
        this.a = this.a.d(ve0.b);
    }
}
