package defpackage;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.List;

/* renamed from: wy, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7891wy implements HL, InterfaceC6407pA0, InterfaceC4198hg, InterfaceC1049Nf0 {
    public final C1520Tg0 a;
    public final RectF b;
    public final Matrix c;
    public final Path d;
    public final RectF e;
    public final String f;
    public final boolean g;
    public final ArrayList h;
    public final C5948mm0 i;
    public ArrayList j;
    public final C7064sc1 k;

    public C7891wy(C5948mm0 c5948mm0, AbstractC6120ng abstractC6120ng, SZ0 sz0, C1847Xl0 c1847Xl0) {
        P4 p4;
        String str = sz0.a;
        List list = sz0.b;
        ArrayList arrayList = new ArrayList(list.size());
        int i = 0;
        for (int i2 = 0; i2 < list.size(); i2++) {
            InterfaceC6937ry interfaceC6937ryA = ((InterfaceC0326Dy) list.get(i2)).a(c5948mm0, c1847Xl0, abstractC6120ng);
            if (interfaceC6937ryA != null) {
                arrayList.add(interfaceC6937ryA);
            }
        }
        while (true) {
            if (i >= list.size()) {
                p4 = null;
                break;
            }
            InterfaceC0326Dy interfaceC0326Dy = (InterfaceC0326Dy) list.get(i);
            if (interfaceC0326Dy instanceof P4) {
                p4 = (P4) interfaceC0326Dy;
                break;
            }
            i++;
        }
        this(c5948mm0, abstractC6120ng, str, sz0.c, arrayList, p4);
    }

    @Override // defpackage.InterfaceC4198hg
    public final void a() {
        this.i.invalidateSelf();
    }

    @Override // defpackage.InterfaceC6937ry
    public final void b(List list, List list2) {
        int size = list.size();
        ArrayList arrayList = this.h;
        ArrayList arrayList2 = new ArrayList(arrayList.size() + size);
        arrayList2.addAll(list);
        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
            InterfaceC6937ry interfaceC6937ry = (InterfaceC6937ry) arrayList.get(size2);
            interfaceC6937ry.b(arrayList2, arrayList.subList(0, size2));
            arrayList2.add(interfaceC6937ry);
        }
    }

    @Override // defpackage.InterfaceC1049Nf0
    public final void c(C0971Mf0 c0971Mf0, int i, ArrayList arrayList, C0971Mf0 c0971Mf02) {
        String str = this.f;
        if (!c0971Mf0.c(i, str) && !"__container".equals(str)) {
            return;
        }
        if (!"__container".equals(str)) {
            c0971Mf02.getClass();
            C0971Mf0 c0971Mf03 = new C0971Mf0(c0971Mf02);
            c0971Mf03.a.add(str);
            if (c0971Mf0.a(i, str)) {
                C0971Mf0 c0971Mf04 = new C0971Mf0(c0971Mf03);
                c0971Mf04.b = this;
                arrayList.add(c0971Mf04);
            }
            c0971Mf02 = c0971Mf03;
        }
        if (!c0971Mf0.d(i, str)) {
            return;
        }
        int iB = c0971Mf0.b(i, str) + i;
        int i2 = 0;
        while (true) {
            ArrayList arrayList2 = this.h;
            if (i2 >= arrayList2.size()) {
                return;
            }
            InterfaceC6937ry interfaceC6937ry = (InterfaceC6937ry) arrayList2.get(i2);
            if (interfaceC6937ry instanceof InterfaceC1049Nf0) {
                ((InterfaceC1049Nf0) interfaceC6937ry).c(c0971Mf0, iB, arrayList, c0971Mf02);
            }
            i2++;
        }
    }

    @Override // defpackage.HL
    public final void d(RectF rectF, Matrix matrix, boolean z) {
        Matrix matrix2 = this.c;
        matrix2.set(matrix);
        C7064sc1 c7064sc1 = this.k;
        if (c7064sc1 != null) {
            matrix2.preConcat(c7064sc1.e());
        }
        RectF rectF2 = this.e;
        rectF2.set(0.0f, 0.0f, 0.0f, 0.0f);
        ArrayList arrayList = this.h;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            InterfaceC6937ry interfaceC6937ry = (InterfaceC6937ry) arrayList.get(size);
            if (interfaceC6937ry instanceof HL) {
                ((HL) interfaceC6937ry).d(rectF2, matrix2, z);
                rectF.union(rectF2);
            }
        }
    }

    public final List e() {
        if (this.j == null) {
            this.j = new ArrayList();
            int i = 0;
            while (true) {
                ArrayList arrayList = this.h;
                if (i >= arrayList.size()) {
                    break;
                }
                InterfaceC6937ry interfaceC6937ry = (InterfaceC6937ry) arrayList.get(i);
                if (interfaceC6937ry instanceof InterfaceC6407pA0) {
                    this.j.add((InterfaceC6407pA0) interfaceC6937ry);
                }
                i++;
            }
        }
        return this.j;
    }

    @Override // defpackage.HL
    public final void f(Canvas canvas, Matrix matrix, int i) {
        if (this.g) {
            return;
        }
        Matrix matrix2 = this.c;
        matrix2.set(matrix);
        C7064sc1 c7064sc1 = this.k;
        if (c7064sc1 != null) {
            matrix2.preConcat(c7064sc1.e());
            i = (int) (((((c7064sc1.j == null ? 100 : ((Integer) r9.e()).intValue()) / 100.0f) * i) / 255.0f) * 255.0f);
        }
        boolean z = this.i.u;
        ArrayList arrayList = this.h;
        boolean z2 = false;
        if (z) {
            int i2 = 0;
            int i3 = 0;
            while (true) {
                if (i2 >= arrayList.size()) {
                    break;
                }
                if (!(arrayList.get(i2) instanceof HL) || (i3 = i3 + 1) < 2) {
                    i2++;
                } else if (i != 255) {
                    z2 = true;
                }
            }
        }
        if (z2) {
            RectF rectF = this.b;
            rectF.set(0.0f, 0.0f, 0.0f, 0.0f);
            d(rectF, matrix2, true);
            C1520Tg0 c1520Tg0 = this.a;
            c1520Tg0.setAlpha(i);
            C6987sD c6987sD = AbstractC0667Ih1.a;
            canvas.saveLayer(rectF, c1520Tg0);
        }
        if (z2) {
            i = 255;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            Object obj = arrayList.get(size);
            if (obj instanceof HL) {
                ((HL) obj).f(canvas, matrix2, i);
            }
        }
        if (z2) {
            canvas.restore();
        }
    }

    @Override // defpackage.InterfaceC6407pA0
    public final Path g() {
        Matrix matrix = this.c;
        matrix.reset();
        C7064sc1 c7064sc1 = this.k;
        if (c7064sc1 != null) {
            matrix.set(c7064sc1.e());
        }
        Path path = this.d;
        path.reset();
        if (this.g) {
            return path;
        }
        ArrayList arrayList = this.h;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            InterfaceC6937ry interfaceC6937ry = (InterfaceC6937ry) arrayList.get(size);
            if (interfaceC6937ry instanceof InterfaceC6407pA0) {
                path.addPath(((InterfaceC6407pA0) interfaceC6937ry).g(), matrix);
            }
        }
        return path;
    }

    @Override // defpackage.InterfaceC6937ry
    public final String getName() {
        throw null;
    }

    @Override // defpackage.InterfaceC1049Nf0
    public final void h(ColorFilter colorFilter, ES1 es1) {
        C7064sc1 c7064sc1 = this.k;
        if (c7064sc1 != null) {
            c7064sc1.c(colorFilter, es1);
        }
    }

    public C7891wy(C5948mm0 c5948mm0, AbstractC6120ng abstractC6120ng, String str, boolean z, ArrayList arrayList, P4 p4) {
        this.a = new C1520Tg0();
        this.b = new RectF();
        this.c = new Matrix();
        this.d = new Path();
        this.e = new RectF();
        this.f = str;
        this.i = c5948mm0;
        this.g = z;
        this.h = arrayList;
        if (p4 != null) {
            C7064sc1 c7064sc1 = new C7064sc1(p4);
            this.k = c7064sc1;
            c7064sc1.a(abstractC6120ng);
            c7064sc1.b(this);
        }
        ArrayList arrayList2 = new ArrayList();
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            InterfaceC6937ry interfaceC6937ry = (InterfaceC6937ry) arrayList.get(size);
            if (interfaceC6937ry instanceof Y10) {
                arrayList2.add((Y10) interfaceC6937ry);
            }
        }
        for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
            ((Y10) arrayList2.get(size2)).e(arrayList.listIterator(arrayList.size()));
        }
    }
}
