package p000;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
public final class UE0 extends AbstractC11359v00 {

    /* renamed from: d */
    public int f11697d;

    /* renamed from: e */
    public int f11698e;

    /* renamed from: f */
    public List f11699f;

    /* renamed from: g */
    public List f11700g;

    /* renamed from: m */
    public static UE0 m7946m() {
        UE0 ue0 = new UE0();
        ue0.f11698e = 6;
        ue0.f11699f = Collections.emptyList();
        ue0.f11700g = Collections.emptyList();
        return ue0;
    }

    public final Object clone() {
        UE0 ue0M7946m = m7946m();
        ue0M7946m.m7948n(m7947l());
        return ue0M7946m;
    }

    @Override // p000.AbstractC10847r00
    /* renamed from: h */
    public final AbstractC0631K0 mo566h() {
        VE0 ve0M7947l = m7947l();
        if (ve0M7947l.mo131e()) {
            return ve0M7947l;
        }
        throw new C6838sg();
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x001b  */
    @Override // p000.AbstractC10847r00
    /* renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final p000.AbstractC10847r00 mo567i(p000.C6392lu r3, p000.C0217DR r4) throws java.lang.Throwable {
        /*
            r2 = this;
            r0 = 0
            xd0 r1 = p000.VE0.f12451j     // Catch: java.lang.Throwable -> Lf p000.Y90 -> L11
            r1.getClass()     // Catch: java.lang.Throwable -> Lf p000.Y90 -> L11
            VE0 r1 = new VE0     // Catch: java.lang.Throwable -> Lf p000.Y90 -> L11
            r1.<init>(r3, r4)     // Catch: java.lang.Throwable -> Lf p000.Y90 -> L11
            r2.m7948n(r1)
            return r2
        Lf:
            r3 = move-exception
            goto L19
        L11:
            r3 = move-exception
            K0 r4 = r3.f14178a     // Catch: java.lang.Throwable -> Lf
            VE0 r4 = (p000.VE0) r4     // Catch: java.lang.Throwable -> Lf
            throw r3     // Catch: java.lang.Throwable -> L17
        L17:
            r3 = move-exception
            r0 = r4
        L19:
            if (r0 == 0) goto L1e
            r2.m7948n(r0)
        L1e:
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.UE0.mo567i(lu, DR):r00");
    }

    @Override // p000.AbstractC10847r00
    /* renamed from: j */
    public final /* bridge */ /* synthetic */ AbstractC10847r00 mo568j(A00 a00) {
        m7948n((VE0) a00);
        return this;
    }

    /* renamed from: l */
    public final VE0 m7947l() {
        VE0 ve0 = new VE0(this);
        int i = this.f11697d;
        int i2 = (i & 1) != 1 ? 0 : 1;
        ve0.f12454d = this.f11698e;
        if ((i & 2) == 2) {
            this.f11699f = Collections.unmodifiableList(this.f11699f);
            this.f11697d &= -3;
        }
        ve0.f12455e = this.f11699f;
        if ((this.f11697d & 4) == 4) {
            this.f11700g = Collections.unmodifiableList(this.f11700g);
            this.f11697d &= -5;
        }
        ve0.f12456f = this.f11700g;
        ve0.f12453c = i2;
        return ve0;
    }

    /* renamed from: n */
    public final void m7948n(VE0 ve0) {
        if (ve0 == VE0.f12450i) {
            return;
        }
        if ((ve0.f12453c & 1) == 1) {
            int i = ve0.f12454d;
            this.f11697d = 1 | this.f11697d;
            this.f11698e = i;
        }
        if (!ve0.f12455e.isEmpty()) {
            if (this.f11699f.isEmpty()) {
                this.f11699f = ve0.f12455e;
                this.f11697d &= -3;
            } else {
                if ((this.f11697d & 2) != 2) {
                    this.f11699f = new ArrayList(this.f11699f);
                    this.f11697d |= 2;
                }
                this.f11699f.addAll(ve0.f12455e);
            }
        }
        if (!ve0.f12456f.isEmpty()) {
            if (this.f11700g.isEmpty()) {
                this.f11700g = ve0.f12456f;
                this.f11697d &= -5;
            } else {
                if ((this.f11697d & 4) != 4) {
                    this.f11700g = new ArrayList(this.f11700g);
                    this.f11697d |= 4;
                }
                this.f11700g.addAll(ve0.f12456f);
            }
        }
        m25292k(ve0);
        this.f41281a = this.f41281a.m3573d(ve0.f12452b);
    }
}
