package defpackage;

import android.graphics.ColorFilter;
import android.graphics.Path;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class NZ0 implements InterfaceC6407pA0, InterfaceC4198hg, InterfaceC1127Of0 {
    public final String b;
    public final boolean c;
    public final C5948mm0 d;
    public final UZ0 e;
    public boolean f;
    public final Path a = new Path();
    public final C0481Fx1 g = new C0481Fx1(9);

    public NZ0(C5948mm0 c5948mm0, AbstractC6120ng abstractC6120ng, C3307d01 c3307d01) {
        this.b = c3307d01.a;
        this.c = c3307d01.d;
        this.d = c5948mm0;
        UZ0 uz0 = new UZ0((List) c3307d01.c.b);
        this.e = uz0;
        abstractC6120ng.e(uz0);
        uz0.a(this);
    }

    @Override // defpackage.InterfaceC4198hg
    public final void a() {
        this.f = false;
        this.d.invalidateSelf();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002a  */
    @Override // defpackage.InterfaceC6937ry
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(java.util.List r6, java.util.List r7) {
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
            ry r1 = (defpackage.InterfaceC6937ry) r1
            boolean r2 = r1 instanceof defpackage.C3428dd1
            if (r2 == 0) goto L2a
            r2 = r1
            dd1 r2 = (defpackage.C3428dd1) r2
            int r3 = r2.c
            r4 = 1
            if (r3 != r4) goto L2a
            Fx1 r1 = r5.g
            java.lang.Object r1 = r1.a
            java.util.ArrayList r1 = (java.util.ArrayList) r1
            r1.add(r2)
            r2.c(r5)
            goto L3a
        L2a:
            boolean r2 = r1 instanceof defpackage.IT0
            if (r2 == 0) goto L3a
            if (r7 != 0) goto L35
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
        L35:
            IT0 r1 = (defpackage.IT0) r1
            r7.add(r1)
        L3a:
            int r0 = r0 + 1
            goto L2
        L3d:
            UZ0 r6 = r5.e
            r6.m = r7
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.NZ0.b(java.util.List, java.util.List):void");
    }

    @Override // defpackage.InterfaceC1049Nf0
    public final void c(C0971Mf0 c0971Mf0, int i, ArrayList arrayList, C0971Mf0 c0971Mf02) {
        AbstractC2215as0.f(c0971Mf0, i, arrayList, c0971Mf02, this);
    }

    @Override // defpackage.InterfaceC6407pA0
    public final Path g() {
        boolean z = this.f;
        Path path = this.a;
        UZ0 uz0 = this.e;
        if (z && uz0.e == null) {
            return path;
        }
        path.reset();
        if (this.c) {
            this.f = true;
            return path;
        }
        Path path2 = (Path) uz0.e();
        if (path2 == null) {
            return path;
        }
        path.set(path2);
        path.setFillType(Path.FillType.EVEN_ODD);
        this.g.f(path);
        this.f = true;
        return path;
    }

    @Override // defpackage.InterfaceC6937ry
    public final String getName() {
        return this.b;
    }

    @Override // defpackage.InterfaceC1049Nf0
    public final void h(ColorFilter colorFilter, ES1 es1) {
        if (colorFilter == InterfaceC6902rm0.K) {
            this.e.j(es1);
        }
    }
}
