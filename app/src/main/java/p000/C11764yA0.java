package p000;

import android.util.SizeF;
import android.util.SparseBooleanArray;
import io.legere.pdfiumandroid.PdfDocument;
import io.legere.pdfiumandroid.PdfiumCore;
import io.legere.pdfiumandroid.util.Size;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: yA0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11764yA0 {

    /* renamed from: v */
    public static final Object f46108v = new Object();

    /* renamed from: a */
    public PdfDocument f46109a;

    /* renamed from: b */
    public final PdfiumCore f46110b;

    /* renamed from: c */
    public final int f46111c;

    /* renamed from: g */
    public final Size f46115g;

    /* renamed from: h */
    public final Size f46116h;

    /* renamed from: k */
    public final boolean f46119k;

    /* renamed from: l */
    public final boolean f46120l;

    /* renamed from: m */
    public final int f46121m;

    /* renamed from: n */
    public final boolean f46122n;

    /* renamed from: r */
    public final EnumC0599JV f46126r;

    /* renamed from: s */
    public final boolean f46127s;

    /* renamed from: t */
    public final boolean f46128t;

    /* renamed from: u */
    public int[] f46129u;

    /* renamed from: d */
    public final ArrayList f46112d = new ArrayList();

    /* renamed from: e */
    public final ArrayList f46113e = new ArrayList();

    /* renamed from: f */
    public final SparseBooleanArray f46114f = new SparseBooleanArray();

    /* renamed from: i */
    public SizeF f46117i = new SizeF(0.0f, 0.0f);

    /* renamed from: j */
    public SizeF f46118j = new SizeF(0.0f, 0.0f);

    /* renamed from: o */
    public final ArrayList f46123o = new ArrayList();

    /* renamed from: p */
    public final ArrayList f46124p = new ArrayList();

    /* renamed from: q */
    public float f46125q = 0.0f;

    public C11764yA0(PdfiumCore pdfiumCore, PdfDocument pdfDocument, EnumC0599JV enumC0599JV, Size size, int[] iArr, boolean z, boolean z2, int i, boolean z3, boolean z4, boolean z5) {
        this.f46111c = 0;
        this.f46115g = new Size(0, 0);
        this.f46116h = new Size(0, 0);
        this.f46119k = z;
        this.f46110b = pdfiumCore;
        this.f46109a = pdfDocument;
        this.f46126r = enumC0599JV;
        this.f46129u = iArr;
        this.f46120l = z2;
        this.f46121m = i;
        this.f46122n = z3;
        this.f46127s = z4;
        this.f46128t = z5;
        if (iArr != null) {
            this.f46111c = iArr.length;
        } else {
            this.f46111c = pdfDocument.getPageCount();
        }
        for (int i2 = 0; i2 < this.f46111c; i2++) {
            Size pageSize = this.f46110b.getPageSize(this.f46109a, m26050a(i2));
            if (pageSize.getWidth() > this.f46115g.getWidth()) {
                this.f46115g = pageSize;
            }
            if (pageSize.getHeight() > this.f46116h.getHeight()) {
                this.f46116h = pageSize;
            }
            this.f46112d.add(pageSize);
        }
        m26059j(size);
    }

    /* renamed from: a */
    public final int m26050a(int i) {
        int i2;
        int[] iArr = this.f46129u;
        if (iArr == null) {
            i2 = i;
        } else {
            if (i < 0 || i >= iArr.length) {
                return -1;
            }
            i2 = iArr[i];
        }
        if (i2 < 0 || i >= this.f46111c) {
            return -1;
        }
        return i2;
    }

    /* renamed from: b */
    public final float m26051b() {
        return (this.f46120l ? this.f46118j : this.f46117i).getHeight();
    }

    /* renamed from: c */
    public final float m26052c() {
        return (this.f46120l ? this.f46118j : this.f46117i).getWidth();
    }

    /* renamed from: d */
    public final int m26053d(float f, float f2) {
        int i = 0;
        for (int i2 = 0; i2 < this.f46111c; i2++) {
            if ((((Float) this.f46123o.get(i2)).floatValue() * f2) - (((this.f46122n ? ((Float) this.f46124p.get(i2)).floatValue() : this.f46121m) * f2) / 2.0f) >= f) {
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

    /* renamed from: e */
    public final float m26054e(float f, int i) {
        SizeF sizeFM26056g = m26056g(i);
        return (this.f46120l ? sizeFM26056g.getHeight() : sizeFM26056g.getWidth()) * f;
    }

    /* renamed from: f */
    public final float m26055f(float f, int i) {
        if (m26050a(i) < 0) {
            return 0.0f;
        }
        return ((Float) this.f46123o.get(i)).floatValue() * f;
    }

    /* renamed from: g */
    public final SizeF m26056g(int i) {
        return m26050a(i) < 0 ? new SizeF(0.0f, 0.0f) : (SizeF) this.f46113e.get(i);
    }

    /* renamed from: h */
    public final SizeF m26057h(float f, int i) {
        SizeF sizeFM26056g = m26056g(i);
        return new SizeF(sizeFM26056g.getWidth() * f, sizeFM26056g.getHeight() * f);
    }

    /* renamed from: i */
    public final float m26058i(float f, int i) {
        float fM26051b;
        float height;
        SizeF sizeFM26056g = m26056g(i);
        if (this.f46120l) {
            fM26051b = m26052c();
            height = sizeFM26056g.getWidth();
        } else {
            fM26051b = m26051b();
            height = sizeFM26056g.getHeight();
        }
        return ((fM26051b - height) * f) / 2.0f;
    }

    /* renamed from: j */
    public final void m26059j(Size size) {
        float fFloatValue;
        float width;
        float width2;
        SizeF sizeF;
        float width3;
        float f;
        int width4;
        float f2;
        ArrayList arrayList = this.f46113e;
        arrayList.clear();
        C8144Pz0 c8144Pz0 = new C8144Pz0(this.f46126r, this.f46115g, this.f46116h, size, this.f46127s);
        this.f46118j = c8144Pz0.f9386c;
        this.f46117i = c8144Pz0.f9387d;
        Iterator it = this.f46112d.iterator();
        while (true) {
            fFloatValue = 0.0f;
            if (!it.hasNext()) {
                break;
            }
            Size size2 = (Size) it.next();
            if (size2.getWidth() <= 0 || size2.getHeight() <= 0) {
                sizeF = new SizeF(0.0f, 0.0f);
            } else {
                boolean z = c8144Pz0.f9390g;
                boolean z2 = this.f46119k;
                Size size3 = c8144Pz0.f9385b;
                if (!z2 || this.f46128t) {
                    if (z) {
                        width4 = size3.getWidth();
                        f2 = width4;
                    } else {
                        width3 = size2.getWidth();
                        f = c8144Pz0.f9388e;
                        f2 = width3 * f;
                    }
                } else if (z) {
                    width4 = size3.getWidth();
                    f2 = width4;
                } else {
                    width3 = size2.getWidth() / 2;
                    f = c8144Pz0.f9388e;
                    f2 = width3 * f;
                }
                float height = z ? size3.getHeight() : size2.getHeight() * c8144Pz0.f9389f;
                int iOrdinal = c8144Pz0.f9384a.ordinal();
                sizeF = iOrdinal != 1 ? iOrdinal != 2 ? C8144Pz0.m6521c(size2, f2) : C8144Pz0.m6519a(size2, f2, height) : C8144Pz0.m6520b(size2, height);
            }
            arrayList.add(sizeF);
        }
        int i = this.f46121m;
        boolean z3 = this.f46120l;
        ArrayList arrayList2 = this.f46124p;
        boolean z4 = this.f46122n;
        if (z4) {
            arrayList2.clear();
            for (int i2 = 0; i2 < this.f46111c; i2++) {
                SizeF sizeF2 = (SizeF) arrayList.get(i2);
                if (z3) {
                    width = size.getHeight();
                    width2 = sizeF2.getHeight();
                } else {
                    width = size.getWidth();
                    width2 = sizeF2.getWidth();
                }
                float fMax = Math.max(0.0f, width - width2);
                if (i2 < this.f46111c - 1) {
                    fMax += i;
                }
                arrayList2.add(Float.valueOf(fMax));
            }
        }
        float height2 = 0.0f;
        for (int i3 = 0; i3 < this.f46111c; i3++) {
            SizeF sizeF3 = (SizeF) arrayList.get(i3);
            height2 += z3 ? sizeF3.getHeight() : sizeF3.getWidth();
            if (z4) {
                height2 = ((Float) arrayList2.get(i3)).floatValue() + height2;
            } else if (i3 < this.f46111c - 1) {
                height2 += i;
            }
        }
        this.f46125q = height2;
        ArrayList arrayList3 = this.f46123o;
        arrayList3.clear();
        for (int i4 = 0; i4 < this.f46111c; i4++) {
            SizeF sizeF4 = (SizeF) arrayList.get(i4);
            float height3 = z3 ? sizeF4.getHeight() : sizeF4.getWidth();
            if (z4) {
                float fFloatValue2 = (((Float) arrayList2.get(i4)).floatValue() / 2.0f) + fFloatValue;
                if (i4 == 0) {
                    fFloatValue2 -= i / 2.0f;
                } else if (i4 == this.f46111c - 1) {
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
