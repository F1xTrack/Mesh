package defpackage;

import android.graphics.ColorFilter;
import android.graphics.Path;
import android.graphics.PointF;
import java.util.ArrayList;
import java.util.List;

/* renamed from: tN, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7208tN implements InterfaceC6407pA0, InterfaceC4198hg, InterfaceC1127Of0 {
    public final String b;
    public final C5948mm0 c;
    public final R10 d;
    public final AbstractC5738lg e;
    public final C5202is f;
    public boolean h;
    public final Path a = new Path();
    public final C0481Fx1 g = new C0481Fx1(9);

    public C7208tN(C5948mm0 c5948mm0, AbstractC6120ng abstractC6120ng, C5202is c5202is) {
        this.b = c5202is.a;
        this.c = c5948mm0;
        AbstractC5738lg abstractC5738lgM0 = c5202is.c.M0();
        this.d = (R10) abstractC5738lgM0;
        AbstractC5738lg abstractC5738lgM02 = c5202is.b.M0();
        this.e = abstractC5738lgM02;
        this.f = c5202is;
        abstractC6120ng.e(abstractC5738lgM0);
        abstractC6120ng.e(abstractC5738lgM02);
        abstractC5738lgM0.a(this);
        abstractC5738lgM02.a(this);
    }

    @Override // defpackage.InterfaceC4198hg
    public final void a() {
        this.h = false;
        this.c.invalidateSelf();
    }

    @Override // defpackage.InterfaceC6937ry
    public final void b(List list, List list2) {
        int i = 0;
        while (true) {
            ArrayList arrayList = (ArrayList) list;
            if (i >= arrayList.size()) {
                return;
            }
            InterfaceC6937ry interfaceC6937ry = (InterfaceC6937ry) arrayList.get(i);
            if (interfaceC6937ry instanceof C3428dd1) {
                C3428dd1 c3428dd1 = (C3428dd1) interfaceC6937ry;
                if (c3428dd1.c == 1) {
                    ((ArrayList) this.g.a).add(c3428dd1);
                    c3428dd1.c(this);
                }
            }
            i++;
        }
    }

    @Override // defpackage.InterfaceC1049Nf0
    public final void c(C0971Mf0 c0971Mf0, int i, ArrayList arrayList, C0971Mf0 c0971Mf02) {
        AbstractC2215as0.f(c0971Mf0, i, arrayList, c0971Mf02, this);
    }

    @Override // defpackage.InterfaceC6407pA0
    public final Path g() {
        boolean z = this.h;
        Path path = this.a;
        if (z) {
            return path;
        }
        path.reset();
        C5202is c5202is = this.f;
        if (c5202is.e) {
            this.h = true;
            return path;
        }
        PointF pointF = (PointF) this.d.e();
        float f = pointF.x / 2.0f;
        float f2 = pointF.y / 2.0f;
        float f3 = f * 0.55228f;
        float f4 = f2 * 0.55228f;
        path.reset();
        if (c5202is.d) {
            float f5 = -f2;
            path.moveTo(0.0f, f5);
            float f6 = 0.0f - f3;
            float f7 = -f;
            float f8 = 0.0f - f4;
            path.cubicTo(f6, f5, f7, f8, f7, 0.0f);
            float f9 = f4 + 0.0f;
            path.cubicTo(f7, f9, f6, f2, 0.0f, f2);
            float f10 = f3 + 0.0f;
            path.cubicTo(f10, f2, f, f9, f, 0.0f);
            path.cubicTo(f, f8, f10, f5, 0.0f, f5);
        } else {
            float f11 = -f2;
            path.moveTo(0.0f, f11);
            float f12 = f3 + 0.0f;
            float f13 = 0.0f - f4;
            path.cubicTo(f12, f11, f, f13, f, 0.0f);
            float f14 = f4 + 0.0f;
            path.cubicTo(f, f14, f12, f2, 0.0f, f2);
            float f15 = 0.0f - f3;
            float f16 = -f;
            path.cubicTo(f15, f2, f16, f14, f16, 0.0f);
            path.cubicTo(f16, f13, f15, f11, 0.0f, f11);
        }
        PointF pointF2 = (PointF) this.e.e();
        path.offset(pointF2.x, pointF2.y);
        path.close();
        this.g.f(path);
        this.h = true;
        return path;
    }

    @Override // defpackage.InterfaceC6937ry
    public final String getName() {
        return this.b;
    }

    @Override // defpackage.InterfaceC1049Nf0
    public final void h(ColorFilter colorFilter, ES1 es1) {
        if (colorFilter == InterfaceC6902rm0.f) {
            this.d.j(es1);
        } else if (colorFilter == InterfaceC6902rm0.i) {
            this.e.j(es1);
        }
    }
}
