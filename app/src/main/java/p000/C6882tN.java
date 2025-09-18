package p000;

import android.graphics.ColorFilter;
import android.graphics.Path;
import android.graphics.PointF;
import java.util.ArrayList;
import java.util.List;

/* renamed from: tN */
/* loaded from: classes.dex */
public final class C6882tN implements InterfaceC10615pA0, InterfaceC4194hg, InterfaceC8052Of0 {

    /* renamed from: b */
    public final String f43040b;

    /* renamed from: c */
    public final C10307mm0 f43041c;

    /* renamed from: d */
    public final R10 f43042d;

    /* renamed from: e */
    public final AbstractC6378lg f43043e;

    /* renamed from: f */
    public final C6202is f43044f;

    /* renamed from: h */
    public boolean f43046h;

    /* renamed from: a */
    public final Path f43039a = new Path();

    /* renamed from: g */
    public final C7621Fx1 f43045g = new C7621Fx1(9);

    public C6882tN(C10307mm0 c10307mm0, AbstractC6504ng abstractC6504ng, C6202is c6202is) {
        this.f43040b = c6202is.f34779a;
        this.f43041c = c10307mm0;
        AbstractC6378lg abstractC6378lgMo4553M0 = c6202is.f34781c.mo4553M0();
        this.f43042d = (R10) abstractC6378lgMo4553M0;
        AbstractC6378lg abstractC6378lgMo4553M02 = c6202is.f34780b.mo4553M0();
        this.f43043e = abstractC6378lgMo4553M02;
        this.f43044f = c6202is;
        abstractC6504ng.m23162e(abstractC6378lgMo4553M0);
        abstractC6504ng.m23162e(abstractC6378lgMo4553M02);
        abstractC6378lgMo4553M0.m22527a(this);
        abstractC6378lgMo4553M02.m22527a(this);
    }

    @Override // p000.InterfaceC4194hg
    /* renamed from: a */
    public final void mo1741a() {
        this.f43046h = false;
        this.f43041c.invalidateSelf();
    }

    @Override // p000.InterfaceC6793ry
    /* renamed from: b */
    public final void mo1742b(List list, List list2) {
        int i = 0;
        while (true) {
            ArrayList arrayList = (ArrayList) list;
            if (i >= arrayList.size()) {
                return;
            }
            InterfaceC6793ry interfaceC6793ry = (InterfaceC6793ry) arrayList.get(i);
            if (interfaceC6793ry instanceof C9138dd1) {
                C9138dd1 c9138dd1 = (C9138dd1) interfaceC6793ry;
                if (c9138dd1.f26172c == 1) {
                    ((ArrayList) this.f43045g.f3494a).add(c9138dd1);
                    c9138dd1.m17719c(this);
                }
            }
            i++;
        }
    }

    @Override // p000.InterfaceC8000Nf0
    /* renamed from: c */
    public final void mo1743c(C7948Mf0 c7948Mf0, int i, ArrayList arrayList, C7948Mf0 c7948Mf02) {
        AbstractC8778as0.m10354f(c7948Mf0, i, arrayList, c7948Mf02, this);
    }

    @Override // p000.InterfaceC10615pA0
    /* renamed from: g */
    public final Path mo5778g() {
        boolean z = this.f43046h;
        Path path = this.f43039a;
        if (z) {
            return path;
        }
        path.reset();
        C6202is c6202is = this.f43044f;
        if (c6202is.f34783e) {
            this.f43046h = true;
            return path;
        }
        PointF pointF = (PointF) this.f43042d.mo5063e();
        float f = pointF.x / 2.0f;
        float f2 = pointF.y / 2.0f;
        float f3 = f * 0.55228f;
        float f4 = f2 * 0.55228f;
        path.reset();
        if (c6202is.f34782d) {
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
        PointF pointF2 = (PointF) this.f43043e.mo5063e();
        path.offset(pointF2.x, pointF2.y);
        path.close();
        this.f43045g.m2843f(path);
        this.f43046h = true;
        return path;
    }

    @Override // p000.InterfaceC6793ry
    public final String getName() {
        return this.f43040b;
    }

    @Override // p000.InterfaceC8000Nf0
    /* renamed from: h */
    public final void mo1746h(ColorFilter colorFilter, ES1 es1) {
        if (colorFilter == InterfaceC10947rm0.f41874f) {
            this.f43042d.m22530j(es1);
        } else if (colorFilter == InterfaceC10947rm0.f41877i) {
            this.f43043e.m22530j(es1);
        }
    }
}
