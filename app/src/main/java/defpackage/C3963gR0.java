package defpackage;

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
public final class C3963gR0 implements HL, InterfaceC6407pA0, Y10, InterfaceC4198hg, InterfaceC1127Of0 {
    public final Matrix a = new Matrix();
    public final Path b = new Path();
    public final C5948mm0 c;
    public final AbstractC6120ng d;
    public final String e;
    public final boolean f;
    public final C6090nW g;
    public final C6090nW h;
    public final C7064sc1 i;
    public C7891wy j;

    public C3963gR0(C5948mm0 c5948mm0, AbstractC6120ng abstractC6120ng, C5876mO0 c5876mO0) {
        this.c = c5948mm0;
        this.d = abstractC6120ng;
        this.e = c5876mO0.b;
        this.f = c5876mO0.d;
        C6090nW c6090nWM0 = c5876mO0.c.M0();
        this.g = c6090nWM0;
        abstractC6120ng.e(c6090nWM0);
        c6090nWM0.a(this);
        C6090nW c6090nWM02 = ((L4) c5876mO0.e).M0();
        this.h = c6090nWM02;
        abstractC6120ng.e(c6090nWM02);
        c6090nWM02.a(this);
        P4 p4 = (P4) c5876mO0.f;
        p4.getClass();
        C7064sc1 c7064sc1 = new C7064sc1(p4);
        this.i = c7064sc1;
        c7064sc1.a(abstractC6120ng);
        c7064sc1.b(this);
    }

    @Override // defpackage.InterfaceC4198hg
    public final void a() {
        this.c.invalidateSelf();
    }

    @Override // defpackage.InterfaceC6937ry
    public final void b(List list, List list2) {
        this.j.b(list, list2);
    }

    @Override // defpackage.InterfaceC1049Nf0
    public final void c(C0971Mf0 c0971Mf0, int i, ArrayList arrayList, C0971Mf0 c0971Mf02) {
        AbstractC2215as0.f(c0971Mf0, i, arrayList, c0971Mf02, this);
        for (int i2 = 0; i2 < this.j.h.size(); i2++) {
            InterfaceC6937ry interfaceC6937ry = (InterfaceC6937ry) this.j.h.get(i2);
            if (interfaceC6937ry instanceof InterfaceC1127Of0) {
                AbstractC2215as0.f(c0971Mf0, i, arrayList, c0971Mf02, (InterfaceC1127Of0) interfaceC6937ry);
            }
        }
    }

    @Override // defpackage.HL
    public final void d(RectF rectF, Matrix matrix, boolean z) {
        this.j.d(rectF, matrix, z);
    }

    @Override // defpackage.Y10
    public final void e(ListIterator listIterator) {
        if (this.j != null) {
            return;
        }
        while (listIterator.hasPrevious() && listIterator.previous() != this) {
        }
        ArrayList arrayList = new ArrayList();
        while (listIterator.hasPrevious()) {
            arrayList.add((InterfaceC6937ry) listIterator.previous());
            listIterator.remove();
        }
        Collections.reverse(arrayList);
        this.j = new C7891wy(this.c, this.d, "Repeater", this.f, arrayList, null);
    }

    @Override // defpackage.HL
    public final void f(Canvas canvas, Matrix matrix, int i) {
        float fFloatValue = ((Float) this.g.e()).floatValue();
        float fFloatValue2 = ((Float) this.h.e()).floatValue();
        C7064sc1 c7064sc1 = this.i;
        float fFloatValue3 = ((Float) c7064sc1.m.e()).floatValue() / 100.0f;
        float fFloatValue4 = ((Float) c7064sc1.n.e()).floatValue() / 100.0f;
        for (int i2 = ((int) fFloatValue) - 1; i2 >= 0; i2--) {
            Matrix matrix2 = this.a;
            matrix2.set(matrix);
            float f = i2;
            matrix2.preConcat(c7064sc1.f(f + fFloatValue2));
            this.j.f(canvas, matrix2, (int) (AbstractC2215as0.e(fFloatValue3, fFloatValue4, f / fFloatValue) * i));
        }
    }

    @Override // defpackage.InterfaceC6407pA0
    public final Path g() {
        Path pathG = this.j.g();
        Path path = this.b;
        path.reset();
        float fFloatValue = ((Float) this.g.e()).floatValue();
        float fFloatValue2 = ((Float) this.h.e()).floatValue();
        for (int i = ((int) fFloatValue) - 1; i >= 0; i--) {
            Matrix matrix = this.a;
            matrix.set(this.i.f(i + fFloatValue2));
            path.addPath(pathG, matrix);
        }
        return path;
    }

    @Override // defpackage.InterfaceC6937ry
    public final String getName() {
        return this.e;
    }

    @Override // defpackage.InterfaceC1049Nf0
    public final void h(ColorFilter colorFilter, ES1 es1) {
        if (this.i.c(colorFilter, es1)) {
            return;
        }
        if (colorFilter == InterfaceC6902rm0.p) {
            this.g.j(es1);
        } else if (colorFilter == InterfaceC6902rm0.q) {
            this.h.j(es1);
        }
    }
}
