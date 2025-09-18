package p000;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

/* renamed from: gR0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9497gR0 implements InterfaceC0463HL, InterfaceC10615pA0, Y10, InterfaceC4194hg, InterfaceC8052Of0 {

    /* renamed from: a */
    public final Matrix f27789a = new Matrix();

    /* renamed from: b */
    public final Path f27790b = new Path();

    /* renamed from: c */
    public final C10307mm0 f27791c;

    /* renamed from: d */
    public final AbstractC6504ng f27792d;

    /* renamed from: e */
    public final String f27793e;

    /* renamed from: f */
    public final boolean f27794f;

    /* renamed from: g */
    public final C6494nW f27795g;

    /* renamed from: h */
    public final C6494nW f27796h;

    /* renamed from: i */
    public final C11056sc1 f27797i;

    /* renamed from: j */
    public C7108wy f27798j;

    public C9497gR0(C10307mm0 c10307mm0, AbstractC6504ng abstractC6504ng, C10259mO0 c10259mO0) {
        this.f27791c = c10307mm0;
        this.f27792d = abstractC6504ng;
        this.f27793e = c10259mO0.f37664b;
        this.f27794f = c10259mO0.f37666d;
        C6494nW c6494nWMo4553M0 = c10259mO0.f37665c.mo4553M0();
        this.f27795g = c6494nWMo4553M0;
        abstractC6504ng.m23162e(c6494nWMo4553M0);
        c6494nWMo4553M0.m22527a(this);
        C6494nW c6494nWMo4553M02 = ((C0698L4) c10259mO0.f37667e).mo4553M0();
        this.f27796h = c6494nWMo4553M02;
        abstractC6504ng.m23162e(c6494nWMo4553M02);
        c6494nWMo4553M02.m22527a(this);
        C0949P4 c0949p4 = (C0949P4) c10259mO0.f37668f;
        c0949p4.getClass();
        C11056sc1 c11056sc1 = new C11056sc1(c0949p4);
        this.f27797i = c11056sc1;
        c11056sc1.m24750a(abstractC6504ng);
        c11056sc1.m24751b(this);
    }

    @Override // p000.InterfaceC4194hg
    /* renamed from: a */
    public final void mo1741a() {
        this.f27791c.invalidateSelf();
    }

    @Override // p000.InterfaceC6793ry
    /* renamed from: b */
    public final void mo1742b(List list, List list2) {
        this.f27798j.mo1742b(list, list2);
    }

    @Override // p000.InterfaceC8000Nf0
    /* renamed from: c */
    public final void mo1743c(C7948Mf0 c7948Mf0, int i, ArrayList arrayList, C7948Mf0 c7948Mf02) {
        AbstractC8778as0.m10354f(c7948Mf0, i, arrayList, c7948Mf02, this);
        for (int i2 = 0; i2 < this.f27798j.f45185h.size(); i2++) {
            InterfaceC6793ry interfaceC6793ry = (InterfaceC6793ry) this.f27798j.f45185h.get(i2);
            if (interfaceC6793ry instanceof InterfaceC8052Of0) {
                AbstractC8778as0.m10354f(c7948Mf0, i, arrayList, c7948Mf02, (InterfaceC8052Of0) interfaceC6793ry);
            }
        }
    }

    @Override // p000.InterfaceC0463HL
    /* renamed from: d */
    public final void mo1744d(RectF rectF, Matrix matrix, boolean z) {
        this.f27798j.mo1744d(rectF, matrix, z);
    }

    @Override // p000.Y10
    /* renamed from: e */
    public final void mo9205e(ListIterator listIterator) {
        if (this.f27798j != null) {
            return;
        }
        while (listIterator.hasPrevious() && listIterator.previous() != this) {
        }
        ArrayList arrayList = new ArrayList();
        while (listIterator.hasPrevious()) {
            arrayList.add((InterfaceC6793ry) listIterator.previous());
            listIterator.remove();
        }
        Collections.reverse(arrayList);
        this.f27798j = new C7108wy(this.f27791c, this.f27792d, "Repeater", this.f27794f, arrayList, null);
    }

    @Override // p000.InterfaceC0463HL
    /* renamed from: f */
    public final void mo1745f(Canvas canvas, Matrix matrix, int i) {
        float fFloatValue = ((Float) this.f27795g.mo5063e()).floatValue();
        float fFloatValue2 = ((Float) this.f27796h.mo5063e()).floatValue();
        C11056sc1 c11056sc1 = this.f27797i;
        float fFloatValue3 = ((Float) c11056sc1.f42513m.mo5063e()).floatValue() / 100.0f;
        float fFloatValue4 = ((Float) c11056sc1.f42514n.mo5063e()).floatValue() / 100.0f;
        for (int i2 = ((int) fFloatValue) - 1; i2 >= 0; i2--) {
            Matrix matrix2 = this.f27789a;
            matrix2.set(matrix);
            float f = i2;
            matrix2.preConcat(c11056sc1.m24755f(f + fFloatValue2));
            this.f27798j.mo1745f(canvas, matrix2, (int) (AbstractC8778as0.m10353e(fFloatValue3, fFloatValue4, f / fFloatValue) * i));
        }
    }

    @Override // p000.InterfaceC10615pA0
    /* renamed from: g */
    public final Path mo5778g() {
        Path pathMo5778g = this.f27798j.mo5778g();
        Path path = this.f27790b;
        path.reset();
        float fFloatValue = ((Float) this.f27795g.mo5063e()).floatValue();
        float fFloatValue2 = ((Float) this.f27796h.mo5063e()).floatValue();
        for (int i = ((int) fFloatValue) - 1; i >= 0; i--) {
            Matrix matrix = this.f27789a;
            matrix.set(this.f27797i.m24755f(i + fFloatValue2));
            path.addPath(pathMo5778g, matrix);
        }
        return path;
    }

    @Override // p000.InterfaceC6793ry
    public final String getName() {
        return this.f27793e;
    }

    @Override // p000.InterfaceC8000Nf0
    /* renamed from: h */
    public final void mo1746h(ColorFilter colorFilter, ES1 es1) {
        if (this.f27797i.m24752c(colorFilter, es1)) {
            return;
        }
        if (colorFilter == InterfaceC10947rm0.f41884p) {
            this.f27795g.m22530j(es1);
        } else if (colorFilter == InterfaceC10947rm0.f41885q) {
            this.f27796h.m22530j(es1);
        }
    }
}
