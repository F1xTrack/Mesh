package defpackage;

import android.graphics.Matrix;
import android.graphics.Paint;
import java.util.ArrayList;

/* renamed from: oi1 */
/* loaded from: classes.dex */
public final class C6319oi1 extends AbstractC6510pi1 {
    public final Matrix a;
    public final ArrayList b;
    public float c;
    public float d;
    public float e;
    public float f;
    public float g;
    public float h;
    public float i;
    public final Matrix j;
    public String k;

    public C6319oi1() {
        this.a = new Matrix();
        this.b = new ArrayList();
        this.c = 0.0f;
        this.d = 0.0f;
        this.e = 0.0f;
        this.f = 1.0f;
        this.g = 1.0f;
        this.h = 0.0f;
        this.i = 0.0f;
        this.j = new Matrix();
        this.k = null;
    }

    @Override // defpackage.AbstractC6510pi1
    public final boolean a() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.b;
            if (i >= arrayList.size()) {
                return false;
            }
            if (((AbstractC6510pi1) arrayList.get(i)).a()) {
                return true;
            }
            i++;
        }
    }

    @Override // defpackage.AbstractC6510pi1
    public final boolean b(int[] iArr) {
        int i = 0;
        boolean zB = false;
        while (true) {
            ArrayList arrayList = this.b;
            if (i >= arrayList.size()) {
                return zB;
            }
            zB |= ((AbstractC6510pi1) arrayList.get(i)).b(iArr);
            i++;
        }
    }

    public final void c() {
        Matrix matrix = this.j;
        matrix.reset();
        matrix.postTranslate(-this.d, -this.e);
        matrix.postScale(this.f, this.g);
        matrix.postRotate(this.c, 0.0f, 0.0f);
        matrix.postTranslate(this.h + this.d, this.i + this.e);
    }

    public String getGroupName() {
        return this.k;
    }

    public Matrix getLocalMatrix() {
        return this.j;
    }

    public float getPivotX() {
        return this.d;
    }

    public float getPivotY() {
        return this.e;
    }

    public float getRotation() {
        return this.c;
    }

    public float getScaleX() {
        return this.f;
    }

    public float getScaleY() {
        return this.g;
    }

    public float getTranslateX() {
        return this.h;
    }

    public float getTranslateY() {
        return this.i;
    }

    public void setPivotX(float f) {
        if (f != this.d) {
            this.d = f;
            c();
        }
    }

    public void setPivotY(float f) {
        if (f != this.e) {
            this.e = f;
            c();
        }
    }

    public void setRotation(float f) {
        if (f != this.c) {
            this.c = f;
            c();
        }
    }

    public void setScaleX(float f) {
        if (f != this.f) {
            this.f = f;
            c();
        }
    }

    public void setScaleY(float f) {
        if (f != this.g) {
            this.g = f;
            c();
        }
    }

    public void setTranslateX(float f) {
        if (f != this.h) {
            this.h = f;
            c();
        }
    }

    public void setTranslateY(float f) {
        if (f != this.i) {
            this.i = f;
            c();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C6319oi1(C6319oi1 c6319oi1, C7925x8 c7925x8) {
        C5937mi1 c5937mi1;
        this.a = new Matrix();
        this.b = new ArrayList();
        this.c = 0.0f;
        this.d = 0.0f;
        this.e = 0.0f;
        this.f = 1.0f;
        this.g = 1.0f;
        this.h = 0.0f;
        this.i = 0.0f;
        Matrix matrix = new Matrix();
        this.j = matrix;
        this.k = null;
        this.c = c6319oi1.c;
        this.d = c6319oi1.d;
        this.e = c6319oi1.e;
        this.f = c6319oi1.f;
        this.g = c6319oi1.g;
        this.h = c6319oi1.h;
        this.i = c6319oi1.i;
        String str = c6319oi1.k;
        this.k = str;
        if (str != null) {
            c7925x8.put(str, this);
        }
        matrix.set(c6319oi1.j);
        ArrayList arrayList = c6319oi1.b;
        for (int i = 0; i < arrayList.size(); i++) {
            Object obj = arrayList.get(i);
            if (obj instanceof C6319oi1) {
                this.b.add(new C6319oi1((C6319oi1) obj, c7925x8));
            } else {
                if (obj instanceof C6128ni1) {
                    C6128ni1 c6128ni1 = (C6128ni1) obj;
                    C6128ni1 c6128ni12 = new C6128ni1(c6128ni1);
                    c6128ni12.e = 0.0f;
                    c6128ni12.g = 1.0f;
                    c6128ni12.h = 1.0f;
                    c6128ni12.i = 0.0f;
                    c6128ni12.j = 1.0f;
                    c6128ni12.k = 0.0f;
                    c6128ni12.l = Paint.Cap.BUTT;
                    c6128ni12.m = Paint.Join.MITER;
                    c6128ni12.n = 4.0f;
                    c6128ni12.d = c6128ni1.d;
                    c6128ni12.e = c6128ni1.e;
                    c6128ni12.g = c6128ni1.g;
                    c6128ni12.f = c6128ni1.f;
                    c6128ni12.c = c6128ni1.c;
                    c6128ni12.h = c6128ni1.h;
                    c6128ni12.i = c6128ni1.i;
                    c6128ni12.j = c6128ni1.j;
                    c6128ni12.k = c6128ni1.k;
                    c6128ni12.l = c6128ni1.l;
                    c6128ni12.m = c6128ni1.m;
                    c6128ni12.n = c6128ni1.n;
                    c5937mi1 = c6128ni12;
                } else if (obj instanceof C5937mi1) {
                    c5937mi1 = new C5937mi1((C5937mi1) obj);
                } else {
                    throw new IllegalStateException("Unknown object in the tree!");
                }
                this.b.add(c5937mi1);
                Object obj2 = c5937mi1.b;
                if (obj2 != null) {
                    c7925x8.put(obj2, c5937mi1);
                }
            }
        }
    }
}
