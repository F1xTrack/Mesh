package p000;

/* renamed from: qi1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC10812qi1 extends AbstractC10684pi1 {

    /* renamed from: a */
    public C11255uA0[] f41110a;

    /* renamed from: b */
    public String f41111b;

    /* renamed from: c */
    public int f41112c;

    public AbstractC10812qi1() {
        this.f41110a = null;
        this.f41112c = 0;
    }

    public C11255uA0[] getPathData() {
        return this.f41110a;
    }

    public String getPathName() {
        return this.f41111b;
    }

    public void setPathData(C11255uA0[] c11255uA0Arr) {
        if (!AbstractC11658xK1.m25837a(this.f41110a, c11255uA0Arr)) {
            this.f41110a = AbstractC11658xK1.m25841e(c11255uA0Arr);
            return;
        }
        C11255uA0[] c11255uA0Arr2 = this.f41110a;
        for (int i = 0; i < c11255uA0Arr.length; i++) {
            c11255uA0Arr2[i].f43543a = c11255uA0Arr[i].f43543a;
            int i2 = 0;
            while (true) {
                float[] fArr = c11255uA0Arr[i].f43544b;
                if (i2 < fArr.length) {
                    c11255uA0Arr2[i].f43544b[i2] = fArr[i2];
                    i2++;
                }
            }
        }
    }

    public AbstractC10812qi1(AbstractC10812qi1 abstractC10812qi1) {
        this.f41110a = null;
        this.f41112c = 0;
        this.f41111b = abstractC10812qi1.f41111b;
        this.f41110a = AbstractC11658xK1.m25841e(abstractC10812qi1.f41110a);
    }
}
