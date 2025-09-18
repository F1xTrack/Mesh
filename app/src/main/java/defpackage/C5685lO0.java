package defpackage;

import android.graphics.ColorFilter;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import java.util.ArrayList;

/* renamed from: lO0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5685lO0 implements InterfaceC4198hg, InterfaceC1127Of0, InterfaceC6407pA0 {
    public final String c;
    public final boolean d;
    public final C5948mm0 e;
    public final AbstractC5738lg f;
    public final AbstractC5738lg g;
    public final C6090nW h;
    public boolean k;
    public final Path a = new Path();
    public final RectF b = new RectF();
    public final C0481Fx1 i = new C0481Fx1(9);
    public AbstractC5738lg j = null;

    public C5685lO0(C5948mm0 c5948mm0, AbstractC6120ng abstractC6120ng, C5876mO0 c5876mO0) {
        this.c = c5876mO0.b;
        this.d = c5876mO0.d;
        this.e = c5948mm0;
        AbstractC5738lg abstractC5738lgM0 = c5876mO0.e.M0();
        this.f = abstractC5738lgM0;
        AbstractC5738lg abstractC5738lgM02 = ((K4) c5876mO0.f).M0();
        this.g = abstractC5738lgM02;
        C6090nW c6090nWM0 = c5876mO0.c.M0();
        this.h = c6090nWM0;
        abstractC6120ng.e(abstractC5738lgM0);
        abstractC6120ng.e(abstractC5738lgM02);
        abstractC6120ng.e(c6090nWM0);
        abstractC5738lgM0.a(this);
        abstractC5738lgM02.a(this);
        c6090nWM0.a(this);
    }

    @Override // defpackage.InterfaceC4198hg
    public final void a() {
        this.k = false;
        this.e.invalidateSelf();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
    @Override // defpackage.InterfaceC6937ry
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(java.util.List r5, java.util.List r6) {
        /*
            r4 = this;
            r6 = 0
        L1:
            r0 = r5
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            int r1 = r0.size()
            if (r6 >= r1) goto L36
            java.lang.Object r0 = r0.get(r6)
            ry r0 = (defpackage.InterfaceC6937ry) r0
            boolean r1 = r0 instanceof defpackage.C3428dd1
            if (r1 == 0) goto L29
            r1 = r0
            dd1 r1 = (defpackage.C3428dd1) r1
            int r2 = r1.c
            r3 = 1
            if (r2 != r3) goto L29
            Fx1 r0 = r4.i
            java.lang.Object r0 = r0.a
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            r0.add(r1)
            r1.c(r4)
            goto L33
        L29:
            boolean r1 = r0 instanceof defpackage.IT0
            if (r1 == 0) goto L33
            IT0 r0 = (defpackage.IT0) r0
            lg r0 = r0.b
            r4.j = r0
        L33:
            int r6 = r6 + 1
            goto L1
        L36:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C5685lO0.b(java.util.List, java.util.List):void");
    }

    @Override // defpackage.InterfaceC1049Nf0
    public final void c(C0971Mf0 c0971Mf0, int i, ArrayList arrayList, C0971Mf0 c0971Mf02) {
        AbstractC2215as0.f(c0971Mf0, i, arrayList, c0971Mf02, this);
    }

    @Override // defpackage.InterfaceC6407pA0
    public final Path g() {
        AbstractC5738lg abstractC5738lg;
        boolean z = this.k;
        Path path = this.a;
        if (z) {
            return path;
        }
        path.reset();
        if (this.d) {
            this.k = true;
            return path;
        }
        PointF pointF = (PointF) this.g.e();
        float f = pointF.x / 2.0f;
        float f2 = pointF.y / 2.0f;
        C6090nW c6090nW = this.h;
        float fK = c6090nW == null ? 0.0f : c6090nW.k();
        if (fK == 0.0f && (abstractC5738lg = this.j) != null) {
            fK = Math.min(((Float) abstractC5738lg.e()).floatValue(), Math.min(f, f2));
        }
        float fMin = Math.min(f, f2);
        if (fK > fMin) {
            fK = fMin;
        }
        PointF pointF2 = (PointF) this.f.e();
        path.moveTo(pointF2.x + f, (pointF2.y - f2) + fK);
        path.lineTo(pointF2.x + f, (pointF2.y + f2) - fK);
        RectF rectF = this.b;
        if (fK > 0.0f) {
            float f3 = pointF2.x + f;
            float f4 = fK * 2.0f;
            float f5 = pointF2.y + f2;
            rectF.set(f3 - f4, f5 - f4, f3, f5);
            path.arcTo(rectF, 0.0f, 90.0f, false);
        }
        path.lineTo((pointF2.x - f) + fK, pointF2.y + f2);
        if (fK > 0.0f) {
            float f6 = pointF2.x - f;
            float f7 = pointF2.y + f2;
            float f8 = fK * 2.0f;
            rectF.set(f6, f7 - f8, f8 + f6, f7);
            path.arcTo(rectF, 90.0f, 90.0f, false);
        }
        path.lineTo(pointF2.x - f, (pointF2.y - f2) + fK);
        if (fK > 0.0f) {
            float f9 = pointF2.x - f;
            float f10 = pointF2.y - f2;
            float f11 = fK * 2.0f;
            rectF.set(f9, f10, f9 + f11, f11 + f10);
            path.arcTo(rectF, 180.0f, 90.0f, false);
        }
        path.lineTo((pointF2.x + f) - fK, pointF2.y - f2);
        if (fK > 0.0f) {
            float f12 = pointF2.x + f;
            float f13 = fK * 2.0f;
            float f14 = pointF2.y - f2;
            rectF.set(f12 - f13, f14, f12, f13 + f14);
            path.arcTo(rectF, 270.0f, 90.0f, false);
        }
        path.close();
        this.i.f(path);
        this.k = true;
        return path;
    }

    @Override // defpackage.InterfaceC6937ry
    public final String getName() {
        return this.c;
    }

    @Override // defpackage.InterfaceC1049Nf0
    public final void h(ColorFilter colorFilter, ES1 es1) {
        if (colorFilter == InterfaceC6902rm0.g) {
            this.g.j(es1);
        } else if (colorFilter == InterfaceC6902rm0.i) {
            this.f.j(es1);
        } else if (colorFilter == InterfaceC6902rm0.h) {
            this.h.j(es1);
        }
    }
}
