package p000;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.List;

/* renamed from: wy */
/* loaded from: classes.dex */
public final class C7108wy implements InterfaceC0463HL, InterfaceC10615pA0, InterfaceC4194hg, InterfaceC8000Nf0 {

    /* renamed from: a */
    public final C8314Tg0 f45178a;

    /* renamed from: b */
    public final RectF f45179b;

    /* renamed from: c */
    public final Matrix f45180c;

    /* renamed from: d */
    public final Path f45181d;

    /* renamed from: e */
    public final RectF f45182e;

    /* renamed from: f */
    public final String f45183f;

    /* renamed from: g */
    public final boolean f45184g;

    /* renamed from: h */
    public final ArrayList f45185h;

    /* renamed from: i */
    public final C10307mm0 f45186i;

    /* renamed from: j */
    public ArrayList f45187j;

    /* renamed from: k */
    public final C11056sc1 f45188k;

    public C7108wy(C10307mm0 c10307mm0, AbstractC6504ng abstractC6504ng, SZ0 sz0, C8532Xl0 c8532Xl0) {
        C0949P4 c0949p4;
        String str = sz0.f10856a;
        List list = sz0.f10857b;
        ArrayList arrayList = new ArrayList(list.size());
        int i = 0;
        for (int i2 = 0; i2 < list.size(); i2++) {
            InterfaceC6793ry interfaceC6793ryMo1954a = ((InterfaceC0250Dy) list.get(i2)).mo1954a(c10307mm0, c8532Xl0, abstractC6504ng);
            if (interfaceC6793ryMo1954a != null) {
                arrayList.add(interfaceC6793ryMo1954a);
            }
        }
        while (true) {
            if (i >= list.size()) {
                c0949p4 = null;
                break;
            }
            InterfaceC0250Dy interfaceC0250Dy = (InterfaceC0250Dy) list.get(i);
            if (interfaceC0250Dy instanceof C0949P4) {
                c0949p4 = (C0949P4) interfaceC0250Dy;
                break;
            }
            i++;
        }
        this(c10307mm0, abstractC6504ng, str, sz0.f10858c, arrayList, c0949p4);
    }

    @Override // p000.InterfaceC4194hg
    /* renamed from: a */
    public final void mo1741a() {
        this.f45186i.invalidateSelf();
    }

    @Override // p000.InterfaceC6793ry
    /* renamed from: b */
    public final void mo1742b(List list, List list2) {
        int size = list.size();
        ArrayList arrayList = this.f45185h;
        ArrayList arrayList2 = new ArrayList(arrayList.size() + size);
        arrayList2.addAll(list);
        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
            InterfaceC6793ry interfaceC6793ry = (InterfaceC6793ry) arrayList.get(size2);
            interfaceC6793ry.mo1742b(arrayList2, arrayList.subList(0, size2));
            arrayList2.add(interfaceC6793ry);
        }
    }

    @Override // p000.InterfaceC8000Nf0
    /* renamed from: c */
    public final void mo1743c(C7948Mf0 c7948Mf0, int i, ArrayList arrayList, C7948Mf0 c7948Mf02) {
        String str = this.f45183f;
        if (!c7948Mf0.m5415c(i, str) && !"__container".equals(str)) {
            return;
        }
        if (!"__container".equals(str)) {
            c7948Mf02.getClass();
            C7948Mf0 c7948Mf03 = new C7948Mf0(c7948Mf02);
            c7948Mf03.f7293a.add(str);
            if (c7948Mf0.m5413a(i, str)) {
                C7948Mf0 c7948Mf04 = new C7948Mf0(c7948Mf03);
                c7948Mf04.f7294b = this;
                arrayList.add(c7948Mf04);
            }
            c7948Mf02 = c7948Mf03;
        }
        if (!c7948Mf0.m5416d(i, str)) {
            return;
        }
        int iM5414b = c7948Mf0.m5414b(i, str) + i;
        int i2 = 0;
        while (true) {
            ArrayList arrayList2 = this.f45185h;
            if (i2 >= arrayList2.size()) {
                return;
            }
            InterfaceC6793ry interfaceC6793ry = (InterfaceC6793ry) arrayList2.get(i2);
            if (interfaceC6793ry instanceof InterfaceC8000Nf0) {
                ((InterfaceC8000Nf0) interfaceC6793ry).mo1743c(c7948Mf0, iM5414b, arrayList, c7948Mf02);
            }
            i2++;
        }
    }

    @Override // p000.InterfaceC0463HL
    /* renamed from: d */
    public final void mo1744d(RectF rectF, Matrix matrix, boolean z) {
        Matrix matrix2 = this.f45180c;
        matrix2.set(matrix);
        C11056sc1 c11056sc1 = this.f45188k;
        if (c11056sc1 != null) {
            matrix2.preConcat(c11056sc1.m24754e());
        }
        RectF rectF2 = this.f45182e;
        rectF2.set(0.0f, 0.0f, 0.0f, 0.0f);
        ArrayList arrayList = this.f45185h;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            InterfaceC6793ry interfaceC6793ry = (InterfaceC6793ry) arrayList.get(size);
            if (interfaceC6793ry instanceof InterfaceC0463HL) {
                ((InterfaceC0463HL) interfaceC6793ry).mo1744d(rectF2, matrix2, z);
                rectF.union(rectF2);
            }
        }
    }

    /* renamed from: e */
    public final List m25727e() {
        if (this.f45187j == null) {
            this.f45187j = new ArrayList();
            int i = 0;
            while (true) {
                ArrayList arrayList = this.f45185h;
                if (i >= arrayList.size()) {
                    break;
                }
                InterfaceC6793ry interfaceC6793ry = (InterfaceC6793ry) arrayList.get(i);
                if (interfaceC6793ry instanceof InterfaceC10615pA0) {
                    this.f45187j.add((InterfaceC10615pA0) interfaceC6793ry);
                }
                i++;
            }
        }
        return this.f45187j;
    }

    @Override // p000.InterfaceC0463HL
    /* renamed from: f */
    public final void mo1745f(Canvas canvas, Matrix matrix, int i) {
        if (this.f45184g) {
            return;
        }
        Matrix matrix2 = this.f45180c;
        matrix2.set(matrix);
        C11056sc1 c11056sc1 = this.f45188k;
        if (c11056sc1 != null) {
            matrix2.preConcat(c11056sc1.m24754e());
            i = (int) (((((c11056sc1.f42510j == null ? 100 : ((Integer) r9.mo5063e()).intValue()) / 100.0f) * i) / 255.0f) * 255.0f);
        }
        boolean z = this.f45186i.f37907u;
        ArrayList arrayList = this.f45185h;
        boolean z2 = false;
        if (z) {
            int i2 = 0;
            int i3 = 0;
            while (true) {
                if (i2 >= arrayList.size()) {
                    break;
                }
                if (!(arrayList.get(i2) instanceof InterfaceC0463HL) || (i3 = i3 + 1) < 2) {
                    i2++;
                } else if (i != 255) {
                    z2 = true;
                }
            }
        }
        if (z2) {
            RectF rectF = this.f45179b;
            rectF.set(0.0f, 0.0f, 0.0f, 0.0f);
            mo1744d(rectF, matrix2, true);
            C8314Tg0 c8314Tg0 = this.f45178a;
            c8314Tg0.setAlpha(i);
            C6809sD c6809sD = AbstractC7745Ih1.f5085a;
            canvas.saveLayer(rectF, c8314Tg0);
        }
        if (z2) {
            i = 255;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            Object obj = arrayList.get(size);
            if (obj instanceof InterfaceC0463HL) {
                ((InterfaceC0463HL) obj).mo1745f(canvas, matrix2, i);
            }
        }
        if (z2) {
            canvas.restore();
        }
    }

    @Override // p000.InterfaceC10615pA0
    /* renamed from: g */
    public final Path mo5778g() {
        Matrix matrix = this.f45180c;
        matrix.reset();
        C11056sc1 c11056sc1 = this.f45188k;
        if (c11056sc1 != null) {
            matrix.set(c11056sc1.m24754e());
        }
        Path path = this.f45181d;
        path.reset();
        if (this.f45184g) {
            return path;
        }
        ArrayList arrayList = this.f45185h;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            InterfaceC6793ry interfaceC6793ry = (InterfaceC6793ry) arrayList.get(size);
            if (interfaceC6793ry instanceof InterfaceC10615pA0) {
                path.addPath(((InterfaceC10615pA0) interfaceC6793ry).mo5778g(), matrix);
            }
        }
        return path;
    }

    @Override // p000.InterfaceC6793ry
    public final String getName() {
        throw null;
    }

    @Override // p000.InterfaceC8000Nf0
    /* renamed from: h */
    public final void mo1746h(ColorFilter colorFilter, ES1 es1) {
        C11056sc1 c11056sc1 = this.f45188k;
        if (c11056sc1 != null) {
            c11056sc1.m24752c(colorFilter, es1);
        }
    }

    public C7108wy(C10307mm0 c10307mm0, AbstractC6504ng abstractC6504ng, String str, boolean z, ArrayList arrayList, C0949P4 c0949p4) {
        this.f45178a = new C8314Tg0();
        this.f45179b = new RectF();
        this.f45180c = new Matrix();
        this.f45181d = new Path();
        this.f45182e = new RectF();
        this.f45183f = str;
        this.f45186i = c10307mm0;
        this.f45184g = z;
        this.f45185h = arrayList;
        if (c0949p4 != null) {
            C11056sc1 c11056sc1 = new C11056sc1(c0949p4);
            this.f45188k = c11056sc1;
            c11056sc1.m24750a(abstractC6504ng);
            c11056sc1.m24751b(this);
        }
        ArrayList arrayList2 = new ArrayList();
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            InterfaceC6793ry interfaceC6793ry = (InterfaceC6793ry) arrayList.get(size);
            if (interfaceC6793ry instanceof Y10) {
                arrayList2.add((Y10) interfaceC6793ry);
            }
        }
        for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
            ((Y10) arrayList2.get(size2)).mo9205e(arrayList.listIterator(arrayList.size()));
        }
    }
}
