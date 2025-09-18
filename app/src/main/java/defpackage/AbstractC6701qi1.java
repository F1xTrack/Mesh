package defpackage;

/* renamed from: qi1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC6701qi1 extends AbstractC6510pi1 {
    public C7361uA0[] a;
    public String b;
    public int c;

    public AbstractC6701qi1() {
        this.a = null;
        this.c = 0;
    }

    public C7361uA0[] getPathData() {
        return this.a;
    }

    public String getPathName() {
        return this.b;
    }

    public void setPathData(C7361uA0[] c7361uA0Arr) {
        if (!AbstractC7963xK1.a(this.a, c7361uA0Arr)) {
            this.a = AbstractC7963xK1.e(c7361uA0Arr);
            return;
        }
        C7361uA0[] c7361uA0Arr2 = this.a;
        for (int i = 0; i < c7361uA0Arr.length; i++) {
            c7361uA0Arr2[i].a = c7361uA0Arr[i].a;
            int i2 = 0;
            while (true) {
                float[] fArr = c7361uA0Arr[i].b;
                if (i2 < fArr.length) {
                    c7361uA0Arr2[i].b[i2] = fArr[i2];
                    i2++;
                }
            }
        }
    }

    public AbstractC6701qi1(AbstractC6701qi1 abstractC6701qi1) {
        this.a = null;
        this.c = 0;
        this.b = abstractC6701qi1.b;
        this.a = AbstractC7963xK1.e(abstractC6701qi1.a);
    }
}
