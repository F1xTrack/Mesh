package p000;

import android.graphics.ColorFilter;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import java.util.ArrayList;

/* renamed from: lO0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10131lO0 implements InterfaceC4194hg, InterfaceC8052Of0, InterfaceC10615pA0 {

    /* renamed from: c */
    public final String f37032c;

    /* renamed from: d */
    public final boolean f37033d;

    /* renamed from: e */
    public final C10307mm0 f37034e;

    /* renamed from: f */
    public final AbstractC6378lg f37035f;

    /* renamed from: g */
    public final AbstractC6378lg f37036g;

    /* renamed from: h */
    public final C6494nW f37037h;

    /* renamed from: k */
    public boolean f37040k;

    /* renamed from: a */
    public final Path f37030a = new Path();

    /* renamed from: b */
    public final RectF f37031b = new RectF();

    /* renamed from: i */
    public final C7621Fx1 f37038i = new C7621Fx1(9);

    /* renamed from: j */
    public AbstractC6378lg f37039j = null;

    public C10131lO0(C10307mm0 c10307mm0, AbstractC6504ng abstractC6504ng, C10259mO0 c10259mO0) {
        this.f37032c = c10259mO0.f37664b;
        this.f37033d = c10259mO0.f37666d;
        this.f37034e = c10307mm0;
        AbstractC6378lg abstractC6378lgMo4553M0 = c10259mO0.f37667e.mo4553M0();
        this.f37035f = abstractC6378lgMo4553M0;
        AbstractC6378lg abstractC6378lgMo4553M02 = ((C0635K4) c10259mO0.f37668f).mo4553M0();
        this.f37036g = abstractC6378lgMo4553M02;
        C6494nW c6494nWMo4553M0 = c10259mO0.f37665c.mo4553M0();
        this.f37037h = c6494nWMo4553M0;
        abstractC6504ng.m23162e(abstractC6378lgMo4553M0);
        abstractC6504ng.m23162e(abstractC6378lgMo4553M02);
        abstractC6504ng.m23162e(c6494nWMo4553M0);
        abstractC6378lgMo4553M0.m22527a(this);
        abstractC6378lgMo4553M02.m22527a(this);
        c6494nWMo4553M0.m22527a(this);
    }

    @Override // p000.InterfaceC4194hg
    /* renamed from: a */
    public final void mo1741a() {
        this.f37040k = false;
        this.f37034e.invalidateSelf();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
    @Override // p000.InterfaceC6793ry
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void mo1742b(java.util.List r5, java.util.List r6) {
        /*
            r4 = this;
            r6 = 0
        L1:
            r0 = r5
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            int r1 = r0.size()
            if (r6 >= r1) goto L36
            java.lang.Object r0 = r0.get(r6)
            ry r0 = (p000.InterfaceC6793ry) r0
            boolean r1 = r0 instanceof p000.C9138dd1
            if (r1 == 0) goto L29
            r1 = r0
            dd1 r1 = (p000.C9138dd1) r1
            int r2 = r1.f26172c
            r3 = 1
            if (r2 != r3) goto L29
            Fx1 r0 = r4.f37038i
            java.lang.Object r0 = r0.f3494a
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            r0.add(r1)
            r1.m17719c(r4)
            goto L33
        L29:
            boolean r1 = r0 instanceof p000.IT0
            if (r1 == 0) goto L33
            IT0 r0 = (p000.IT0) r0
            lg r0 = r0.f4946b
            r4.f37039j = r0
        L33:
            int r6 = r6 + 1
            goto L1
        L36:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C10131lO0.mo1742b(java.util.List, java.util.List):void");
    }

    @Override // p000.InterfaceC8000Nf0
    /* renamed from: c */
    public final void mo1743c(C7948Mf0 c7948Mf0, int i, ArrayList arrayList, C7948Mf0 c7948Mf02) {
        AbstractC8778as0.m10354f(c7948Mf0, i, arrayList, c7948Mf02, this);
    }

    @Override // p000.InterfaceC10615pA0
    /* renamed from: g */
    public final Path mo5778g() {
        AbstractC6378lg abstractC6378lg;
        boolean z = this.f37040k;
        Path path = this.f37030a;
        if (z) {
            return path;
        }
        path.reset();
        if (this.f37033d) {
            this.f37040k = true;
            return path;
        }
        PointF pointF = (PointF) this.f37036g.mo5063e();
        float f = pointF.x / 2.0f;
        float f2 = pointF.y / 2.0f;
        C6494nW c6494nW = this.f37037h;
        float fM23152k = c6494nW == null ? 0.0f : c6494nW.m23152k();
        if (fM23152k == 0.0f && (abstractC6378lg = this.f37039j) != null) {
            fM23152k = Math.min(((Float) abstractC6378lg.mo5063e()).floatValue(), Math.min(f, f2));
        }
        float fMin = Math.min(f, f2);
        if (fM23152k > fMin) {
            fM23152k = fMin;
        }
        PointF pointF2 = (PointF) this.f37035f.mo5063e();
        path.moveTo(pointF2.x + f, (pointF2.y - f2) + fM23152k);
        path.lineTo(pointF2.x + f, (pointF2.y + f2) - fM23152k);
        RectF rectF = this.f37031b;
        if (fM23152k > 0.0f) {
            float f3 = pointF2.x + f;
            float f4 = fM23152k * 2.0f;
            float f5 = pointF2.y + f2;
            rectF.set(f3 - f4, f5 - f4, f3, f5);
            path.arcTo(rectF, 0.0f, 90.0f, false);
        }
        path.lineTo((pointF2.x - f) + fM23152k, pointF2.y + f2);
        if (fM23152k > 0.0f) {
            float f6 = pointF2.x - f;
            float f7 = pointF2.y + f2;
            float f8 = fM23152k * 2.0f;
            rectF.set(f6, f7 - f8, f8 + f6, f7);
            path.arcTo(rectF, 90.0f, 90.0f, false);
        }
        path.lineTo(pointF2.x - f, (pointF2.y - f2) + fM23152k);
        if (fM23152k > 0.0f) {
            float f9 = pointF2.x - f;
            float f10 = pointF2.y - f2;
            float f11 = fM23152k * 2.0f;
            rectF.set(f9, f10, f9 + f11, f11 + f10);
            path.arcTo(rectF, 180.0f, 90.0f, false);
        }
        path.lineTo((pointF2.x + f) - fM23152k, pointF2.y - f2);
        if (fM23152k > 0.0f) {
            float f12 = pointF2.x + f;
            float f13 = fM23152k * 2.0f;
            float f14 = pointF2.y - f2;
            rectF.set(f12 - f13, f14, f12, f13 + f14);
            path.arcTo(rectF, 270.0f, 90.0f, false);
        }
        path.close();
        this.f37038i.m2843f(path);
        this.f37040k = true;
        return path;
    }

    @Override // p000.InterfaceC6793ry
    public final String getName() {
        return this.f37032c;
    }

    @Override // p000.InterfaceC8000Nf0
    /* renamed from: h */
    public final void mo1746h(ColorFilter colorFilter, ES1 es1) {
        if (colorFilter == InterfaceC10947rm0.f41875g) {
            this.f37036g.m22530j(es1);
        } else if (colorFilter == InterfaceC10947rm0.f41877i) {
            this.f37035f.m22530j(es1);
        } else if (colorFilter == InterfaceC10947rm0.f41876h) {
            this.f37037h.m22530j(es1);
        }
    }
}
