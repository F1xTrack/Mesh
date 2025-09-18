package p000;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: Tp0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8332Tp0 {

    /* renamed from: a */
    public boolean f11536a;

    /* renamed from: b */
    public final Object f11537b;

    /* renamed from: c */
    public final Object f11538c;

    /* renamed from: d */
    public final Object f11539d;

    /* renamed from: e */
    public final Object f11540e;

    /* renamed from: f */
    public final Object f11541f;

    /* renamed from: g */
    public final Object f11542g;

    /* renamed from: h */
    public final Object f11543h;

    /* renamed from: i */
    public final Object f11544i;

    /* renamed from: j */
    public final Object f11545j;

    /* renamed from: k */
    public Object f11546k;

    /* renamed from: l */
    public Object f11547l;

    public C8332Tp0() {
        this.f11537b = new C10563om0[4];
        this.f11538c = new Matrix[4];
        this.f11539d = new Matrix[4];
        this.f11540e = new PointF();
        this.f11541f = new Path();
        this.f11542g = new Path();
        this.f11543h = new C10563om0();
        this.f11544i = new float[2];
        this.f11545j = new float[2];
        this.f11546k = new Path();
        this.f11547l = new Path();
        this.f11536a = true;
        for (int i = 0; i < 4; i++) {
            ((C10563om0[]) this.f11537b)[i] = new C10563om0();
            ((Matrix[]) this.f11538c)[i] = new Matrix();
            ((Matrix[]) this.f11539d)[i] = new Matrix();
        }
    }

    /* renamed from: a */
    public AbstractC7419Ca1 m7777a(int i, ArrayList arrayList, C11869z01 c11869z01) {
        if (!arrayList.isEmpty()) {
            this.f11546k = c11869z01;
            for (int i2 = i; i2 < arrayList.size() + i; i2++) {
                C8280Sp0 c8280Sp0 = (C8280Sp0) arrayList.get(i2 - i);
                ArrayList arrayList2 = (ArrayList) this.f11538c;
                if (i2 > 0) {
                    C8280Sp0 c8280Sp02 = (C8280Sp0) arrayList2.get(i2 - 1);
                    c8280Sp0.f10999d = c8280Sp02.f10996a.f3896o.f3796b.mo1258o() + c8280Sp02.f10999d;
                    c8280Sp0.f11000e = false;
                    c8280Sp0.f10998c.clear();
                } else {
                    c8280Sp0.f10999d = 0;
                    c8280Sp0.f11000e = false;
                    c8280Sp0.f10998c.clear();
                }
                int iMo1258o = c8280Sp0.f10996a.f3896o.f3796b.mo1258o();
                for (int i3 = i2; i3 < arrayList2.size(); i3++) {
                    ((C8280Sp0) arrayList2.get(i3)).f10999d += iMo1258o;
                }
                arrayList2.add(i2, c8280Sp0);
                ((HashMap) this.f11540e).put(c8280Sp0.f10997b, c8280Sp0);
                if (this.f11536a) {
                    m7783g(c8280Sp0);
                    if (((IdentityHashMap) this.f11539d).isEmpty()) {
                        ((HashSet) this.f11543h).add(c8280Sp0);
                    } else {
                        C8228Rp0 c8228Rp0 = (C8228Rp0) ((HashMap) this.f11541f).get(c8280Sp0);
                        if (c8228Rp0 != null) {
                            c8228Rp0.f10440a.m24439c(c8228Rp0.f10441b);
                        }
                    }
                }
            }
        }
        return m7779c();
    }

    /* renamed from: b */
    public void m7778b(LZ0 lz0, float f, RectF rectF, C7391Bm1 c7391Bm1, Path path) {
        Matrix[] matrixArr;
        Matrix[] matrixArr2;
        C10563om0[] c10563om0Arr;
        int i;
        float[] fArr;
        int i2;
        C8332Tp0 c8332Tp0 = this;
        path.rewind();
        Path path2 = (Path) c8332Tp0.f11541f;
        path2.rewind();
        Path path3 = (Path) c8332Tp0.f11542g;
        path3.rewind();
        path3.addRect(rectF, Path.Direction.CW);
        int i3 = 0;
        while (true) {
            matrixArr = (Matrix[]) c8332Tp0.f11539d;
            matrixArr2 = (Matrix[]) c8332Tp0.f11538c;
            c10563om0Arr = (C10563om0[]) c8332Tp0.f11537b;
            i = 4;
            fArr = (float[]) c8332Tp0.f11544i;
            if (i3 >= 4) {
                break;
            }
            InterfaceC7235yz interfaceC7235yz = i3 != 1 ? i3 != 2 ? i3 != 3 ? lz0.f6719f : lz0.f6718e : lz0.f6721h : lz0.f6720g;
            AbstractC10784qU1 abstractC10784qU1 = i3 != 1 ? i3 != 2 ? i3 != 3 ? lz0.f6715b : lz0.f6714a : lz0.f6717d : lz0.f6716c;
            C10563om0 c10563om0 = c10563om0Arr[i3];
            abstractC10784qU1.getClass();
            abstractC10784qU1.mo3068b(c10563om0, f, interfaceC7235yz.mo22818a(rectF));
            int i4 = i3 + 1;
            float f2 = (i4 % 4) * 90;
            matrixArr2[i3].reset();
            PointF pointF = (PointF) c8332Tp0.f11540e;
            if (i3 == 1) {
                i2 = i4;
                pointF.set(rectF.right, rectF.bottom);
            } else if (i3 == 2) {
                i2 = i4;
                pointF.set(rectF.left, rectF.bottom);
            } else if (i3 != 3) {
                i2 = i4;
                pointF.set(rectF.right, rectF.top);
            } else {
                i2 = i4;
                pointF.set(rectF.left, rectF.top);
            }
            matrixArr2[i3].setTranslate(pointF.x, pointF.y);
            matrixArr2[i3].preRotate(f2);
            C10563om0 c10563om02 = c10563om0Arr[i3];
            fArr[0] = c10563om02.f39254b;
            fArr[1] = c10563om02.f39255c;
            matrixArr2[i3].mapPoints(fArr);
            matrixArr[i3].reset();
            matrixArr[i3].setTranslate(fArr[0], fArr[1]);
            matrixArr[i3].preRotate(f2);
            i3 = i2;
        }
        int i5 = 0;
        while (i5 < i) {
            C10563om0 c10563om03 = c10563om0Arr[i5];
            c10563om03.getClass();
            fArr[0] = 0.0f;
            fArr[1] = c10563om03.f39253a;
            matrixArr2[i5].mapPoints(fArr);
            if (i5 == 0) {
                path.moveTo(fArr[0], fArr[1]);
            } else {
                path.lineTo(fArr[0], fArr[1]);
            }
            c10563om0Arr[i5].m23554b(matrixArr2[i5], path);
            if (c7391Bm1 != null) {
                C10563om0 c10563om04 = c10563om0Arr[i5];
                Matrix matrix = matrixArr2[i5];
                C10439no0 c10439no0 = (C10439no0) c7391Bm1.f1022b;
                BitSet bitSet = c10439no0.f38519d;
                c10563om04.getClass();
                bitSet.set(i5, false);
                c10563om04.m23553a(c10563om04.f39257e);
                c10439no0.f38517b[i5] = new WZ0(new ArrayList((ArrayList) c10563om04.f39259g), new Matrix(matrix));
            }
            int i6 = i5 + 1;
            int i7 = i6 % 4;
            C10563om0 c10563om05 = c10563om0Arr[i5];
            fArr[0] = c10563om05.f39254b;
            fArr[1] = c10563om05.f39255c;
            matrixArr2[i5].mapPoints(fArr);
            C10563om0 c10563om06 = c10563om0Arr[i7];
            c10563om06.getClass();
            float[] fArr2 = (float[]) c8332Tp0.f11545j;
            fArr2[0] = 0.0f;
            fArr2[1] = c10563om06.f39253a;
            matrixArr2[i7].mapPoints(fArr2);
            float fMax = Math.max(((float) Math.hypot(fArr[0] - fArr2[0], fArr[1] - fArr2[1])) - 0.001f, 0.0f);
            C10563om0 c10563om07 = c10563om0Arr[i5];
            fArr[0] = c10563om07.f39254b;
            fArr[1] = c10563om07.f39255c;
            matrixArr2[i5].mapPoints(fArr);
            if (i5 == 1 || i5 == 3) {
                Math.abs(rectF.centerX() - fArr[0]);
            } else {
                Math.abs(rectF.centerY() - fArr[1]);
            }
            C10563om0 c10563om08 = (C10563om0) c8332Tp0.f11543h;
            c10563om08.m23556d(0.0f, 270.0f, 0.0f);
            (i5 != 1 ? i5 != 2 ? i5 != 3 ? lz0.f6723j : lz0.f6722i : lz0.f6725l : lz0.f6724k).getClass();
            c10563om08.m23555c(fMax, 0.0f);
            Path path4 = (Path) c8332Tp0.f11546k;
            path4.reset();
            c10563om08.m23554b(matrixArr[i5], path4);
            if (c8332Tp0.f11536a && (c8332Tp0.m7782f(path4, i5) || c8332Tp0.m7782f(path4, i7))) {
                path4.op(path4, path3, Path.Op.DIFFERENCE);
                fArr[0] = 0.0f;
                fArr[1] = c10563om08.f39253a;
                matrixArr[i5].mapPoints(fArr);
                path2.moveTo(fArr[0], fArr[1]);
                c10563om08.m23554b(matrixArr[i5], path2);
            } else {
                c10563om08.m23554b(matrixArr[i5], path);
            }
            if (c7391Bm1 != null) {
                Matrix matrix2 = matrixArr[i5];
                C10439no0 c10439no02 = (C10439no0) c7391Bm1.f1022b;
                c10439no02.f38519d.set(i5 + 4, false);
                c10563om08.m23553a(c10563om08.f39257e);
                c10439no02.f38518c[i5] = new WZ0(new ArrayList((ArrayList) c10563om08.f39259g), new Matrix(matrix2));
            }
            i = 4;
            c8332Tp0 = this;
            i5 = i6;
        }
        path.close();
        path2.close();
        if (path2.isEmpty()) {
            return;
        }
        path.op(path2, Path.Op.UNION);
    }

    /* renamed from: c */
    public AbstractC7419Ca1 m7779c() {
        ArrayList arrayList = (ArrayList) this.f11538c;
        if (arrayList.isEmpty()) {
            return AbstractC7419Ca1.f1466a;
        }
        int iMo1258o = 0;
        for (int i = 0; i < arrayList.size(); i++) {
            C8280Sp0 c8280Sp0 = (C8280Sp0) arrayList.get(i);
            c8280Sp0.f10999d = iMo1258o;
            iMo1258o += c8280Sp0.f10996a.f3896o.f3796b.mo1258o();
        }
        return new SB0(arrayList, (C11869z01) this.f11546k);
    }

    /* renamed from: d */
    public void m7780d() {
        Iterator it = ((HashSet) this.f11543h).iterator();
        while (it.hasNext()) {
            C8280Sp0 c8280Sp0 = (C8280Sp0) it.next();
            if (c8280Sp0.f10998c.isEmpty()) {
                C8228Rp0 c8228Rp0 = (C8228Rp0) ((HashMap) this.f11541f).get(c8280Sp0);
                if (c8228Rp0 != null) {
                    c8228Rp0.f10440a.m24439c(c8228Rp0.f10441b);
                }
                it.remove();
            }
        }
    }

    /* renamed from: e */
    public void m7781e(C8280Sp0 c8280Sp0) {
        if (c8280Sp0.f11000e && c8280Sp0.f10998c.isEmpty()) {
            C8228Rp0 c8228Rp0 = (C8228Rp0) ((HashMap) this.f11541f).remove(c8280Sp0);
            c8228Rp0.getClass();
            C7968Mp0 c7968Mp0 = c8228Rp0.f10441b;
            AbstractC6758rg abstractC6758rg = c8228Rp0.f10440a;
            abstractC6758rg.m24443p(c7968Mp0);
            CC0 cc0 = c8228Rp0.f10442c;
            abstractC6758rg.m24445s(cc0);
            abstractC6758rg.m24444r(cc0);
            ((HashSet) this.f11543h).remove(c8280Sp0);
        }
    }

    /* renamed from: f */
    public boolean m7782f(Path path, int i) {
        Path path2 = (Path) this.f11547l;
        path2.reset();
        ((C10563om0[]) this.f11537b)[i].m23554b(((Matrix[]) this.f11538c)[i], path2);
        RectF rectF = new RectF();
        path.computeBounds(rectF, true);
        path2.computeBounds(rectF, true);
        path.op(path2, Path.Op.INTERSECT);
        path.computeBounds(rectF, true);
        if (rectF.isEmpty()) {
            return rectF.width() > 1.0f && rectF.height() > 1.0f;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [Gp0, Mp0] */
    /* renamed from: g */
    public void m7783g(C8280Sp0 c8280Sp0) {
        C7652Gn0 c7652Gn0 = c8280Sp0.f10996a;
        ?? r1 = new InterfaceC7656Gp0() { // from class: Mp0
            @Override // p000.InterfaceC7656Gp0
            /* renamed from: a */
            public final void mo3172a(AbstractC6758rg abstractC6758rg, AbstractC7419Ca1 abstractC7419Ca1) {
                R71 r71 = ((C3928dR) this.f7364a.f11542g).f26088h;
                r71.m6906d(2);
                r71.m6907e(22);
            }
        };
        CC0 cc0 = new CC0(this, c8280Sp0, false, 19);
        ((HashMap) this.f11541f).put(c8280Sp0, new C8228Rp0(c7652Gn0, r1, cc0));
        int i = AbstractC7485Dh1.f2166a;
        Looper looperMyLooper = Looper.myLooper();
        if (looperMyLooper == null) {
            looperMyLooper = Looper.getMainLooper();
        }
        Handler handler = new Handler(looperMyLooper, null);
        c7652Gn0.getClass();
        C1356VY c1356vy = c7652Gn0.f41799c;
        c1356vy.getClass();
        C7812Jp0 c7812Jp0 = new C7812Jp0();
        c7812Jp0.f5713a = handler;
        c7812Jp0.f5714b = cc0;
        ((CopyOnWriteArrayList) c1356vy.f12613d).add(c7812Jp0);
        Looper looperMyLooper2 = Looper.myLooper();
        if (looperMyLooper2 == null) {
            looperMyLooper2 = Looper.getMainLooper();
        }
        Handler handler2 = new Handler(looperMyLooper2, null);
        C0903OL c0903ol = c7652Gn0.f41800d;
        c0903ol.getClass();
        C0840NL c0840nl = new C0840NL();
        c0840nl.f7729a = handler2;
        c0840nl.f7730b = cc0;
        c0903ol.f8366c.add(c0840nl);
        c7652Gn0.m24441k(r1, (InterfaceC9648hc1) this.f11547l, (NB0) this.f11537b);
    }

    /* renamed from: h */
    public void m7784h(InterfaceC11973zp0 interfaceC11973zp0) {
        IdentityHashMap identityHashMap = (IdentityHashMap) this.f11539d;
        C8280Sp0 c8280Sp0 = (C8280Sp0) identityHashMap.remove(interfaceC11973zp0);
        c8280Sp0.getClass();
        c8280Sp0.f10996a.mo3164o(interfaceC11973zp0);
        c8280Sp0.f10998c.remove(((C7496Dn0) interfaceC11973zp0).f2244a);
        if (!identityHashMap.isEmpty()) {
            m7780d();
        }
        m7781e(c8280Sp0);
    }

    /* renamed from: i */
    public void m7785i(int i, int i2) {
        for (int i3 = i2 - 1; i3 >= i; i3--) {
            ArrayList arrayList = (ArrayList) this.f11538c;
            C8280Sp0 c8280Sp0 = (C8280Sp0) arrayList.remove(i3);
            ((HashMap) this.f11540e).remove(c8280Sp0.f10997b);
            int i4 = -c8280Sp0.f10996a.f3896o.f3796b.mo1258o();
            for (int i5 = i3; i5 < arrayList.size(); i5++) {
                ((C8280Sp0) arrayList.get(i5)).f10999d += i4;
            }
            c8280Sp0.f11000e = true;
            if (this.f11536a) {
                m7781e(c8280Sp0);
            }
        }
    }

    public C8332Tp0(C3928dR c3928dR, C7251zE c7251zE, R71 r71, NB0 nb0) {
        this.f11537b = nb0;
        this.f11542g = c3928dR;
        this.f11546k = new C11869z01();
        this.f11539d = new IdentityHashMap();
        this.f11540e = new HashMap();
        this.f11538c = new ArrayList();
        this.f11544i = c7251zE;
        this.f11545j = r71;
        this.f11541f = new HashMap();
        this.f11543h = new HashSet();
    }
}
