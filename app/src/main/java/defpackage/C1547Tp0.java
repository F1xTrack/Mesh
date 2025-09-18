package defpackage;

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
public final class C1547Tp0 {
    public boolean a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;
    public final Object g;
    public final Object h;
    public final Object i;
    public final Object j;
    public Object k;
    public Object l;

    public C1547Tp0() {
        this.b = new C6330om0[4];
        this.c = new Matrix[4];
        this.d = new Matrix[4];
        this.e = new PointF();
        this.f = new Path();
        this.g = new Path();
        this.h = new C6330om0();
        this.i = new float[2];
        this.j = new float[2];
        this.k = new Path();
        this.l = new Path();
        this.a = true;
        for (int i = 0; i < 4; i++) {
            ((C6330om0[]) this.b)[i] = new C6330om0();
            ((Matrix[]) this.c)[i] = new Matrix();
            ((Matrix[]) this.d)[i] = new Matrix();
        }
    }

    public AbstractC0178Ca1 a(int i, ArrayList arrayList, C8280z01 c8280z01) {
        if (!arrayList.isEmpty()) {
            this.k = c8280z01;
            for (int i2 = i; i2 < arrayList.size() + i; i2++) {
                C1469Sp0 c1469Sp0 = (C1469Sp0) arrayList.get(i2 - i);
                ArrayList arrayList2 = (ArrayList) this.c;
                if (i2 > 0) {
                    C1469Sp0 c1469Sp02 = (C1469Sp0) arrayList2.get(i2 - 1);
                    c1469Sp0.d = c1469Sp02.a.o.b.o() + c1469Sp02.d;
                    c1469Sp0.e = false;
                    c1469Sp0.c.clear();
                } else {
                    c1469Sp0.d = 0;
                    c1469Sp0.e = false;
                    c1469Sp0.c.clear();
                }
                int iO = c1469Sp0.a.o.b.o();
                for (int i3 = i2; i3 < arrayList2.size(); i3++) {
                    ((C1469Sp0) arrayList2.get(i3)).d += iO;
                }
                arrayList2.add(i2, c1469Sp0);
                ((HashMap) this.e).put(c1469Sp0.b, c1469Sp0);
                if (this.a) {
                    g(c1469Sp0);
                    if (((IdentityHashMap) this.d).isEmpty()) {
                        ((HashSet) this.h).add(c1469Sp0);
                    } else {
                        C1391Rp0 c1391Rp0 = (C1391Rp0) ((HashMap) this.f).get(c1469Sp0);
                        if (c1391Rp0 != null) {
                            c1391Rp0.a.c(c1391Rp0.b);
                        }
                    }
                }
            }
        }
        return c();
    }

    public void b(LZ0 lz0, float f, RectF rectF, C0136Bm1 c0136Bm1, Path path) {
        Matrix[] matrixArr;
        Matrix[] matrixArr2;
        C6330om0[] c6330om0Arr;
        int i;
        float[] fArr;
        int i2;
        C1547Tp0 c1547Tp0 = this;
        path.rewind();
        Path path2 = (Path) c1547Tp0.f;
        path2.rewind();
        Path path3 = (Path) c1547Tp0.g;
        path3.rewind();
        path3.addRect(rectF, Path.Direction.CW);
        int i3 = 0;
        while (true) {
            matrixArr = (Matrix[]) c1547Tp0.d;
            matrixArr2 = (Matrix[]) c1547Tp0.c;
            c6330om0Arr = (C6330om0[]) c1547Tp0.b;
            i = 4;
            fArr = (float[]) c1547Tp0.i;
            if (i3 >= 4) {
                break;
            }
            InterfaceC8274yz interfaceC8274yz = i3 != 1 ? i3 != 2 ? i3 != 3 ? lz0.f : lz0.e : lz0.h : lz0.g;
            AbstractC6659qU1 abstractC6659qU1 = i3 != 1 ? i3 != 2 ? i3 != 3 ? lz0.b : lz0.a : lz0.d : lz0.c;
            C6330om0 c6330om0 = c6330om0Arr[i3];
            abstractC6659qU1.getClass();
            abstractC6659qU1.b(c6330om0, f, interfaceC8274yz.a(rectF));
            int i4 = i3 + 1;
            float f2 = (i4 % 4) * 90;
            matrixArr2[i3].reset();
            PointF pointF = (PointF) c1547Tp0.e;
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
            C6330om0 c6330om02 = c6330om0Arr[i3];
            fArr[0] = c6330om02.b;
            fArr[1] = c6330om02.c;
            matrixArr2[i3].mapPoints(fArr);
            matrixArr[i3].reset();
            matrixArr[i3].setTranslate(fArr[0], fArr[1]);
            matrixArr[i3].preRotate(f2);
            i3 = i2;
        }
        int i5 = 0;
        while (i5 < i) {
            C6330om0 c6330om03 = c6330om0Arr[i5];
            c6330om03.getClass();
            fArr[0] = 0.0f;
            fArr[1] = c6330om03.a;
            matrixArr2[i5].mapPoints(fArr);
            if (i5 == 0) {
                path.moveTo(fArr[0], fArr[1]);
            } else {
                path.lineTo(fArr[0], fArr[1]);
            }
            c6330om0Arr[i5].b(matrixArr2[i5], path);
            if (c0136Bm1 != null) {
                C6330om0 c6330om04 = c6330om0Arr[i5];
                Matrix matrix = matrixArr2[i5];
                C6145no0 c6145no0 = (C6145no0) c0136Bm1.b;
                BitSet bitSet = c6145no0.d;
                c6330om04.getClass();
                bitSet.set(i5, false);
                c6330om04.a(c6330om04.e);
                c6145no0.b[i5] = new WZ0(new ArrayList((ArrayList) c6330om04.g), new Matrix(matrix));
            }
            int i6 = i5 + 1;
            int i7 = i6 % 4;
            C6330om0 c6330om05 = c6330om0Arr[i5];
            fArr[0] = c6330om05.b;
            fArr[1] = c6330om05.c;
            matrixArr2[i5].mapPoints(fArr);
            C6330om0 c6330om06 = c6330om0Arr[i7];
            c6330om06.getClass();
            float[] fArr2 = (float[]) c1547Tp0.j;
            fArr2[0] = 0.0f;
            fArr2[1] = c6330om06.a;
            matrixArr2[i7].mapPoints(fArr2);
            float fMax = Math.max(((float) Math.hypot(fArr[0] - fArr2[0], fArr[1] - fArr2[1])) - 0.001f, 0.0f);
            C6330om0 c6330om07 = c6330om0Arr[i5];
            fArr[0] = c6330om07.b;
            fArr[1] = c6330om07.c;
            matrixArr2[i5].mapPoints(fArr);
            if (i5 == 1 || i5 == 3) {
                Math.abs(rectF.centerX() - fArr[0]);
            } else {
                Math.abs(rectF.centerY() - fArr[1]);
            }
            C6330om0 c6330om08 = (C6330om0) c1547Tp0.h;
            c6330om08.d(0.0f, 270.0f, 0.0f);
            (i5 != 1 ? i5 != 2 ? i5 != 3 ? lz0.j : lz0.i : lz0.l : lz0.k).getClass();
            c6330om08.c(fMax, 0.0f);
            Path path4 = (Path) c1547Tp0.k;
            path4.reset();
            c6330om08.b(matrixArr[i5], path4);
            if (c1547Tp0.a && (c1547Tp0.f(path4, i5) || c1547Tp0.f(path4, i7))) {
                path4.op(path4, path3, Path.Op.DIFFERENCE);
                fArr[0] = 0.0f;
                fArr[1] = c6330om08.a;
                matrixArr[i5].mapPoints(fArr);
                path2.moveTo(fArr[0], fArr[1]);
                c6330om08.b(matrixArr[i5], path2);
            } else {
                c6330om08.b(matrixArr[i5], path);
            }
            if (c0136Bm1 != null) {
                Matrix matrix2 = matrixArr[i5];
                C6145no0 c6145no02 = (C6145no0) c0136Bm1.b;
                c6145no02.d.set(i5 + 4, false);
                c6330om08.a(c6330om08.e);
                c6145no02.c[i5] = new WZ0(new ArrayList((ArrayList) c6330om08.g), new Matrix(matrix2));
            }
            i = 4;
            c1547Tp0 = this;
            i5 = i6;
        }
        path.close();
        path2.close();
        if (path2.isEmpty()) {
            return;
        }
        path.op(path2, Path.Op.UNION);
    }

    public AbstractC0178Ca1 c() {
        ArrayList arrayList = (ArrayList) this.c;
        if (arrayList.isEmpty()) {
            return AbstractC0178Ca1.a;
        }
        int iO = 0;
        for (int i = 0; i < arrayList.size(); i++) {
            C1469Sp0 c1469Sp0 = (C1469Sp0) arrayList.get(i);
            c1469Sp0.d = iO;
            iO += c1469Sp0.a.o.b.o();
        }
        return new SB0(arrayList, (C8280z01) this.k);
    }

    public void d() {
        Iterator it = ((HashSet) this.h).iterator();
        while (it.hasNext()) {
            C1469Sp0 c1469Sp0 = (C1469Sp0) it.next();
            if (c1469Sp0.c.isEmpty()) {
                C1391Rp0 c1391Rp0 = (C1391Rp0) ((HashMap) this.f).get(c1469Sp0);
                if (c1391Rp0 != null) {
                    c1391Rp0.a.c(c1391Rp0.b);
                }
                it.remove();
            }
        }
    }

    public void e(C1469Sp0 c1469Sp0) {
        if (c1469Sp0.e && c1469Sp0.c.isEmpty()) {
            C1391Rp0 c1391Rp0 = (C1391Rp0) ((HashMap) this.f).remove(c1469Sp0);
            c1391Rp0.getClass();
            C1001Mp0 c1001Mp0 = c1391Rp0.b;
            AbstractC6883rg abstractC6883rg = c1391Rp0.a;
            abstractC6883rg.p(c1001Mp0);
            CC0 cc0 = c1391Rp0.c;
            abstractC6883rg.s(cc0);
            abstractC6883rg.r(cc0);
            ((HashSet) this.h).remove(c1469Sp0);
        }
    }

    public boolean f(Path path, int i) {
        Path path2 = (Path) this.l;
        path2.reset();
        ((C6330om0[]) this.b)[i].b(((Matrix[]) this.c)[i], path2);
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
    public void g(C1469Sp0 c1469Sp0) {
        C0528Gn0 c0528Gn0 = c1469Sp0.a;
        ?? r1 = new InterfaceC0534Gp0() { // from class: Mp0
            @Override // defpackage.InterfaceC0534Gp0
            public final void a(AbstractC6883rg abstractC6883rg, AbstractC0178Ca1 abstractC0178Ca1) {
                R71 r71 = ((C3390dR) this.a.g).h;
                r71.d(2);
                r71.e(22);
            }
        };
        CC0 cc0 = new CC0(this, c1469Sp0, false, 19);
        ((HashMap) this.f).put(c1469Sp0, new C1391Rp0(c0528Gn0, r1, cc0));
        int i = AbstractC0277Dh1.a;
        Looper looperMyLooper = Looper.myLooper();
        if (looperMyLooper == null) {
            looperMyLooper = Looper.getMainLooper();
        }
        Handler handler = new Handler(looperMyLooper, null);
        c0528Gn0.getClass();
        VY vy = c0528Gn0.c;
        vy.getClass();
        C0768Jp0 c0768Jp0 = new C0768Jp0();
        c0768Jp0.a = handler;
        c0768Jp0.b = cc0;
        ((CopyOnWriteArrayList) vy.d).add(c0768Jp0);
        Looper looperMyLooper2 = Looper.myLooper();
        if (looperMyLooper2 == null) {
            looperMyLooper2 = Looper.getMainLooper();
        }
        Handler handler2 = new Handler(looperMyLooper2, null);
        OL ol = c0528Gn0.d;
        ol.getClass();
        NL nl = new NL();
        nl.a = handler2;
        nl.b = cc0;
        ol.c.add(nl);
        c0528Gn0.k(r1, (InterfaceC4188hc1) this.l, (NB0) this.b);
    }

    public void h(InterfaceC8435zp0 interfaceC8435zp0) {
        IdentityHashMap identityHashMap = (IdentityHashMap) this.d;
        C1469Sp0 c1469Sp0 = (C1469Sp0) identityHashMap.remove(interfaceC8435zp0);
        c1469Sp0.getClass();
        c1469Sp0.a.o(interfaceC8435zp0);
        c1469Sp0.c.remove(((C0294Dn0) interfaceC8435zp0).a);
        if (!identityHashMap.isEmpty()) {
            d();
        }
        e(c1469Sp0);
    }

    public void i(int i, int i2) {
        for (int i3 = i2 - 1; i3 >= i; i3--) {
            ArrayList arrayList = (ArrayList) this.c;
            C1469Sp0 c1469Sp0 = (C1469Sp0) arrayList.remove(i3);
            ((HashMap) this.e).remove(c1469Sp0.b);
            int i4 = -c1469Sp0.a.o.b.o();
            for (int i5 = i3; i5 < arrayList.size(); i5++) {
                ((C1469Sp0) arrayList.get(i5)).d += i4;
            }
            c1469Sp0.e = true;
            if (this.a) {
                e(c1469Sp0);
            }
        }
    }

    public C1547Tp0(C3390dR c3390dR, C8323zE c8323zE, R71 r71, NB0 nb0) {
        this.b = nb0;
        this.g = c3390dR;
        this.k = new C8280z01();
        this.d = new IdentityHashMap();
        this.e = new HashMap();
        this.c = new ArrayList();
        this.i = c8323zE;
        this.j = r71;
        this.f = new HashMap();
        this.h = new HashSet();
    }
}
