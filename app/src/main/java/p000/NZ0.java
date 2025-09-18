package p000;

import android.graphics.ColorFilter;
import android.graphics.Path;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class NZ0 implements InterfaceC10615pA0, InterfaceC4194hg, InterfaceC8052Of0 {

    /* renamed from: b */
    public final String f7872b;

    /* renamed from: c */
    public final boolean f7873c;

    /* renamed from: d */
    public final C10307mm0 f7874d;

    /* renamed from: e */
    public final UZ0 f7875e;

    /* renamed from: f */
    public boolean f7876f;

    /* renamed from: a */
    public final Path f7871a = new Path();

    /* renamed from: g */
    public final C7621Fx1 f7877g = new C7621Fx1(9);

    public NZ0(C10307mm0 c10307mm0, AbstractC6504ng abstractC6504ng, C9056d01 c9056d01) {
        this.f7872b = c9056d01.f25760a;
        this.f7873c = c9056d01.f25763d;
        this.f7874d = c10307mm0;
        UZ0 uz0 = new UZ0((List) c9056d01.f25762c.f11615b);
        this.f7875e = uz0;
        abstractC6504ng.m23162e(uz0);
        uz0.m22527a(this);
    }

    @Override // p000.InterfaceC4194hg
    /* renamed from: a */
    public final void mo1741a() {
        this.f7876f = false;
        this.f7874d.invalidateSelf();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002a  */
    @Override // p000.InterfaceC6793ry
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void mo1742b(java.util.List r6, java.util.List r7) {
        /*
            r5 = this;
            r7 = 0
            r0 = 0
        L2:
            r1 = r6
            java.util.ArrayList r1 = (java.util.ArrayList) r1
            int r2 = r1.size()
            if (r0 >= r2) goto L3d
            java.lang.Object r1 = r1.get(r0)
            ry r1 = (p000.InterfaceC6793ry) r1
            boolean r2 = r1 instanceof p000.C9138dd1
            if (r2 == 0) goto L2a
            r2 = r1
            dd1 r2 = (p000.C9138dd1) r2
            int r3 = r2.f26172c
            r4 = 1
            if (r3 != r4) goto L2a
            Fx1 r1 = r5.f7877g
            java.lang.Object r1 = r1.f3494a
            java.util.ArrayList r1 = (java.util.ArrayList) r1
            r1.add(r2)
            r2.m17719c(r5)
            goto L3a
        L2a:
            boolean r2 = r1 instanceof p000.IT0
            if (r2 == 0) goto L3a
            if (r7 != 0) goto L35
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
        L35:
            IT0 r1 = (p000.IT0) r1
            r7.add(r1)
        L3a:
            int r0 = r0 + 1
            goto L2
        L3d:
            UZ0 r6 = r5.f7875e
            r6.f11910m = r7
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.NZ0.mo1742b(java.util.List, java.util.List):void");
    }

    @Override // p000.InterfaceC8000Nf0
    /* renamed from: c */
    public final void mo1743c(C7948Mf0 c7948Mf0, int i, ArrayList arrayList, C7948Mf0 c7948Mf02) {
        AbstractC8778as0.m10354f(c7948Mf0, i, arrayList, c7948Mf02, this);
    }

    @Override // p000.InterfaceC10615pA0
    /* renamed from: g */
    public final Path mo5778g() {
        boolean z = this.f7876f;
        Path path = this.f7871a;
        UZ0 uz0 = this.f7875e;
        if (z && uz0.f37232e == null) {
            return path;
        }
        path.reset();
        if (this.f7873c) {
            this.f7876f = true;
            return path;
        }
        Path path2 = (Path) uz0.mo5063e();
        if (path2 == null) {
            return path;
        }
        path.set(path2);
        path.setFillType(Path.FillType.EVEN_ODD);
        this.f7877g.m2843f(path);
        this.f7876f = true;
        return path;
    }

    @Override // p000.InterfaceC6793ry
    public final String getName() {
        return this.f7872b;
    }

    @Override // p000.InterfaceC8000Nf0
    /* renamed from: h */
    public final void mo1746h(ColorFilter colorFilter, ES1 es1) {
        if (colorFilter == InterfaceC10947rm0.f41868K) {
            this.f7875e.m22530j(es1);
        }
    }
}
