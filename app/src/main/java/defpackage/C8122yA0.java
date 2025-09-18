package defpackage;

import android.util.SizeF;
import android.util.SparseBooleanArray;
import io.legere.pdfiumandroid.PdfDocument;
import io.legere.pdfiumandroid.PdfiumCore;
import io.legere.pdfiumandroid.util.Size;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: yA0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8122yA0 {
    public static final Object v = new Object();
    public PdfDocument a;
    public final PdfiumCore b;
    public final int c;
    public final Size g;
    public final Size h;
    public final boolean k;
    public final boolean l;
    public final int m;
    public final boolean n;
    public final JV r;
    public final boolean s;
    public final boolean t;
    public int[] u;
    public final ArrayList d = new ArrayList();
    public final ArrayList e = new ArrayList();
    public final SparseBooleanArray f = new SparseBooleanArray();
    public SizeF i = new SizeF(0.0f, 0.0f);
    public SizeF j = new SizeF(0.0f, 0.0f);
    public final ArrayList o = new ArrayList();
    public final ArrayList p = new ArrayList();
    public float q = 0.0f;

    public C8122yA0(PdfiumCore pdfiumCore, PdfDocument pdfDocument, JV jv, Size size, int[] iArr, boolean z, boolean z2, int i, boolean z3, boolean z4, boolean z5) {
        this.c = 0;
        this.g = new Size(0, 0);
        this.h = new Size(0, 0);
        this.k = z;
        this.b = pdfiumCore;
        this.a = pdfDocument;
        this.r = jv;
        this.u = iArr;
        this.l = z2;
        this.m = i;
        this.n = z3;
        this.s = z4;
        this.t = z5;
        if (iArr != null) {
            this.c = iArr.length;
        } else {
            this.c = pdfDocument.getPageCount();
        }
        for (int i2 = 0; i2 < this.c; i2++) {
            Size pageSize = this.b.getPageSize(this.a, a(i2));
            if (pageSize.getWidth() > this.g.getWidth()) {
                this.g = pageSize;
            }
            if (pageSize.getHeight() > this.h.getHeight()) {
                this.h = pageSize;
            }
            this.d.add(pageSize);
        }
        j(size);
    }

    public final int a(int i) {
        int i2;
        int[] iArr = this.u;
        if (iArr == null) {
            i2 = i;
        } else {
            if (i < 0 || i >= iArr.length) {
                return -1;
            }
            i2 = iArr[i];
        }
        if (i2 < 0 || i >= this.c) {
            return -1;
        }
        return i2;
    }

    public final float b() {
        return (this.l ? this.j : this.i).getHeight();
    }

    public final float c() {
        return (this.l ? this.j : this.i).getWidth();
    }

    public final int d(float f, float f2) {
        int i = 0;
        for (int i2 = 0; i2 < this.c; i2++) {
            if ((((Float) this.o.get(i2)).floatValue() * f2) - (((this.n ? ((Float) this.p.get(i2)).floatValue() : this.m) * f2) / 2.0f) >= f) {
                break;
            }
            i++;
        }
        int i3 = i - 1;
        if (i3 >= 0) {
            return i3;
        }
        return 0;
    }

    public final float e(float f, int i) {
        SizeF sizeFG = g(i);
        return (this.l ? sizeFG.getHeight() : sizeFG.getWidth()) * f;
    }

    public final float f(float f, int i) {
        if (a(i) < 0) {
            return 0.0f;
        }
        return ((Float) this.o.get(i)).floatValue() * f;
    }

    public final SizeF g(int i) {
        return a(i) < 0 ? new SizeF(0.0f, 0.0f) : (SizeF) this.e.get(i);
    }

    public final SizeF h(float f, int i) {
        SizeF sizeFG = g(i);
        return new SizeF(sizeFG.getWidth() * f, sizeFG.getHeight() * f);
    }

    public final float i(float f, int i) {
        float fB;
        float height;
        SizeF sizeFG = g(i);
        if (this.l) {
            fB = c();
            height = sizeFG.getWidth();
        } else {
            fB = b();
            height = sizeFG.getHeight();
        }
        return ((fB - height) * f) / 2.0f;
    }

    public final void j(Size size) {
        float fFloatValue;
        float width;
        float width2;
        SizeF sizeF;
        float width3;
        float f;
        int width4;
        float f2;
        ArrayList arrayList = this.e;
        arrayList.clear();
        C1265Pz0 c1265Pz0 = new C1265Pz0(this.r, this.g, this.h, size, this.s);
        this.j = c1265Pz0.c;
        this.i = c1265Pz0.d;
        Iterator it = this.d.iterator();
        while (true) {
            fFloatValue = 0.0f;
            if (!it.hasNext()) {
                break;
            }
            Size size2 = (Size) it.next();
            if (size2.getWidth() <= 0 || size2.getHeight() <= 0) {
                sizeF = new SizeF(0.0f, 0.0f);
            } else {
                boolean z = c1265Pz0.g;
                boolean z2 = this.k;
                Size size3 = c1265Pz0.b;
                if (!z2 || this.t) {
                    if (z) {
                        width4 = size3.getWidth();
                        f2 = width4;
                    } else {
                        width3 = size2.getWidth();
                        f = c1265Pz0.e;
                        f2 = width3 * f;
                    }
                } else if (z) {
                    width4 = size3.getWidth();
                    f2 = width4;
                } else {
                    width3 = size2.getWidth() / 2;
                    f = c1265Pz0.e;
                    f2 = width3 * f;
                }
                float height = z ? size3.getHeight() : size2.getHeight() * c1265Pz0.f;
                int iOrdinal = c1265Pz0.a.ordinal();
                sizeF = iOrdinal != 1 ? iOrdinal != 2 ? C1265Pz0.c(size2, f2) : C1265Pz0.a(size2, f2, height) : C1265Pz0.b(size2, height);
            }
            arrayList.add(sizeF);
        }
        int i = this.m;
        boolean z3 = this.l;
        ArrayList arrayList2 = this.p;
        boolean z4 = this.n;
        if (z4) {
            arrayList2.clear();
            for (int i2 = 0; i2 < this.c; i2++) {
                SizeF sizeF2 = (SizeF) arrayList.get(i2);
                if (z3) {
                    width = size.getHeight();
                    width2 = sizeF2.getHeight();
                } else {
                    width = size.getWidth();
                    width2 = sizeF2.getWidth();
                }
                float fMax = Math.max(0.0f, width - width2);
                if (i2 < this.c - 1) {
                    fMax += i;
                }
                arrayList2.add(Float.valueOf(fMax));
            }
        }
        float height2 = 0.0f;
        for (int i3 = 0; i3 < this.c; i3++) {
            SizeF sizeF3 = (SizeF) arrayList.get(i3);
            height2 += z3 ? sizeF3.getHeight() : sizeF3.getWidth();
            if (z4) {
                height2 = ((Float) arrayList2.get(i3)).floatValue() + height2;
            } else if (i3 < this.c - 1) {
                height2 += i;
            }
        }
        this.q = height2;
        ArrayList arrayList3 = this.o;
        arrayList3.clear();
        for (int i4 = 0; i4 < this.c; i4++) {
            SizeF sizeF4 = (SizeF) arrayList.get(i4);
            float height3 = z3 ? sizeF4.getHeight() : sizeF4.getWidth();
            if (z4) {
                float fFloatValue2 = (((Float) arrayList2.get(i4)).floatValue() / 2.0f) + fFloatValue;
                if (i4 == 0) {
                    fFloatValue2 -= i / 2.0f;
                } else if (i4 == this.c - 1) {
                    fFloatValue2 += i / 2.0f;
                }
                arrayList3.add(Float.valueOf(fFloatValue2));
                fFloatValue = (((Float) arrayList2.get(i4)).floatValue() / 2.0f) + height3 + fFloatValue2;
            } else {
                arrayList3.add(Float.valueOf(fFloatValue));
                fFloatValue = height3 + i + fFloatValue;
            }
        }
    }
}
