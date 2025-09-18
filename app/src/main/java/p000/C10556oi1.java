package p000;

import android.graphics.Matrix;
import android.graphics.Paint;
import java.util.ArrayList;

/* renamed from: oi1 */
/* loaded from: classes.dex */
public final class C10556oi1 extends AbstractC10684pi1 {

    /* renamed from: a */
    public final Matrix f39183a;

    /* renamed from: b */
    public final ArrayList f39184b;

    /* renamed from: c */
    public float f39185c;

    /* renamed from: d */
    public float f39186d;

    /* renamed from: e */
    public float f39187e;

    /* renamed from: f */
    public float f39188f;

    /* renamed from: g */
    public float f39189g;

    /* renamed from: h */
    public float f39190h;

    /* renamed from: i */
    public float f39191i;

    /* renamed from: j */
    public final Matrix f39192j;

    /* renamed from: k */
    public String f39193k;

    public C10556oi1() {
        this.f39183a = new Matrix();
        this.f39184b = new ArrayList();
        this.f39185c = 0.0f;
        this.f39186d = 0.0f;
        this.f39187e = 0.0f;
        this.f39188f = 1.0f;
        this.f39189g = 1.0f;
        this.f39190h = 0.0f;
        this.f39191i = 0.0f;
        this.f39192j = new Matrix();
        this.f39193k = null;
    }

    @Override // p000.AbstractC10684pi1
    /* renamed from: a */
    public final boolean mo23172a() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f39184b;
            if (i >= arrayList.size()) {
                return false;
            }
            if (((AbstractC10684pi1) arrayList.get(i)).mo23172a()) {
                return true;
            }
            i++;
        }
    }

    @Override // p000.AbstractC10684pi1
    /* renamed from: b */
    public final boolean mo23173b(int[] iArr) {
        int i = 0;
        boolean zMo23173b = false;
        while (true) {
            ArrayList arrayList = this.f39184b;
            if (i >= arrayList.size()) {
                return zMo23173b;
            }
            zMo23173b |= ((AbstractC10684pi1) arrayList.get(i)).mo23173b(iArr);
            i++;
        }
    }

    /* renamed from: c */
    public final void m23527c() {
        Matrix matrix = this.f39192j;
        matrix.reset();
        matrix.postTranslate(-this.f39186d, -this.f39187e);
        matrix.postScale(this.f39188f, this.f39189g);
        matrix.postRotate(this.f39185c, 0.0f, 0.0f);
        matrix.postTranslate(this.f39190h + this.f39186d, this.f39191i + this.f39187e);
    }

    public String getGroupName() {
        return this.f39193k;
    }

    public Matrix getLocalMatrix() {
        return this.f39192j;
    }

    public float getPivotX() {
        return this.f39186d;
    }

    public float getPivotY() {
        return this.f39187e;
    }

    public float getRotation() {
        return this.f39185c;
    }

    public float getScaleX() {
        return this.f39188f;
    }

    public float getScaleY() {
        return this.f39189g;
    }

    public float getTranslateX() {
        return this.f39190h;
    }

    public float getTranslateY() {
        return this.f39191i;
    }

    public void setPivotX(float f) {
        if (f != this.f39186d) {
            this.f39186d = f;
            m23527c();
        }
    }

    public void setPivotY(float f) {
        if (f != this.f39187e) {
            this.f39187e = f;
            m23527c();
        }
    }

    public void setRotation(float f) {
        if (f != this.f39185c) {
            this.f39185c = f;
            m23527c();
        }
    }

    public void setScaleX(float f) {
        if (f != this.f39188f) {
            this.f39188f = f;
            m23527c();
        }
    }

    public void setScaleY(float f) {
        if (f != this.f39189g) {
            this.f39189g = f;
            m23527c();
        }
    }

    public void setTranslateX(float f) {
        if (f != this.f39190h) {
            this.f39190h = f;
            m23527c();
        }
    }

    public void setTranslateY(float f) {
        if (f != this.f39191i) {
            this.f39191i = f;
            m23527c();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C10556oi1(C10556oi1 c10556oi1, C7119x8 c7119x8) {
        C10300mi1 c10300mi1;
        this.f39183a = new Matrix();
        this.f39184b = new ArrayList();
        this.f39185c = 0.0f;
        this.f39186d = 0.0f;
        this.f39187e = 0.0f;
        this.f39188f = 1.0f;
        this.f39189g = 1.0f;
        this.f39190h = 0.0f;
        this.f39191i = 0.0f;
        Matrix matrix = new Matrix();
        this.f39192j = matrix;
        this.f39193k = null;
        this.f39185c = c10556oi1.f39185c;
        this.f39186d = c10556oi1.f39186d;
        this.f39187e = c10556oi1.f39187e;
        this.f39188f = c10556oi1.f39188f;
        this.f39189g = c10556oi1.f39189g;
        this.f39190h = c10556oi1.f39190h;
        this.f39191i = c10556oi1.f39191i;
        String str = c10556oi1.f39193k;
        this.f39193k = str;
        if (str != null) {
            c7119x8.put(str, this);
        }
        matrix.set(c10556oi1.f39192j);
        ArrayList arrayList = c10556oi1.f39184b;
        for (int i = 0; i < arrayList.size(); i++) {
            Object obj = arrayList.get(i);
            if (obj instanceof C10556oi1) {
                this.f39184b.add(new C10556oi1((C10556oi1) obj, c7119x8));
            } else {
                if (obj instanceof C10428ni1) {
                    C10428ni1 c10428ni1 = (C10428ni1) obj;
                    C10428ni1 c10428ni12 = new C10428ni1(c10428ni1);
                    c10428ni12.f38477e = 0.0f;
                    c10428ni12.f38479g = 1.0f;
                    c10428ni12.f38480h = 1.0f;
                    c10428ni12.f38481i = 0.0f;
                    c10428ni12.f38482j = 1.0f;
                    c10428ni12.f38483k = 0.0f;
                    c10428ni12.f38484l = Paint.Cap.BUTT;
                    c10428ni12.f38485m = Paint.Join.MITER;
                    c10428ni12.f38486n = 4.0f;
                    c10428ni12.f38476d = c10428ni1.f38476d;
                    c10428ni12.f38477e = c10428ni1.f38477e;
                    c10428ni12.f38479g = c10428ni1.f38479g;
                    c10428ni12.f38478f = c10428ni1.f38478f;
                    c10428ni12.f41112c = c10428ni1.f41112c;
                    c10428ni12.f38480h = c10428ni1.f38480h;
                    c10428ni12.f38481i = c10428ni1.f38481i;
                    c10428ni12.f38482j = c10428ni1.f38482j;
                    c10428ni12.f38483k = c10428ni1.f38483k;
                    c10428ni12.f38484l = c10428ni1.f38484l;
                    c10428ni12.f38485m = c10428ni1.f38485m;
                    c10428ni12.f38486n = c10428ni1.f38486n;
                    c10300mi1 = c10428ni12;
                } else if (obj instanceof C10300mi1) {
                    c10300mi1 = new C10300mi1((C10300mi1) obj);
                } else {
                    throw new IllegalStateException("Unknown object in the tree!");
                }
                this.f39184b.add(c10300mi1);
                Object obj2 = c10300mi1.f41111b;
                if (obj2 != null) {
                    c7119x8.put(obj2, c10300mi1);
                }
            }
        }
    }
}
