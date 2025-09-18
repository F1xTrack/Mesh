package defpackage;

import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import kotlin.KotlinVersion;

/* renamed from: ri1 */
/* loaded from: classes.dex */
public final class C6891ri1 {
    public static final Matrix p = new Matrix();
    public final Path a;
    public final Path b;
    public final Matrix c;
    public Paint d;
    public Paint e;
    public PathMeasure f;
    public final C6319oi1 g;
    public float h;
    public float i;
    public float j;
    public float k;
    public int l;
    public String m;
    public Boolean n;
    public final C7925x8 o;

    public C6891ri1() {
        this.c = new Matrix();
        this.h = 0.0f;
        this.i = 0.0f;
        this.j = 0.0f;
        this.k = 0.0f;
        this.l = KotlinVersion.MAX_COMPONENT_VALUE;
        this.m = null;
        this.n = null;
        this.o = new C7925x8();
        this.g = new C6319oi1();
        this.a = new Path();
        this.b = new Path();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x01e6  */
    /* JADX WARN: Type inference failed for: r11v0 */
    /* JADX WARN: Type inference failed for: r11v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r11v18 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(defpackage.C6319oi1 r19, android.graphics.Matrix r20, android.graphics.Canvas r21, int r22, int r23) {
        /*
            Method dump skipped, instructions count: 558
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C6891ri1.a(oi1, android.graphics.Matrix, android.graphics.Canvas, int, int):void");
    }

    public float getAlpha() {
        return getRootAlpha() / 255.0f;
    }

    public int getRootAlpha() {
        return this.l;
    }

    public void setAlpha(float f) {
        setRootAlpha((int) (f * 255.0f));
    }

    public void setRootAlpha(int i) {
        this.l = i;
    }

    public C6891ri1(C6891ri1 c6891ri1) {
        this.c = new Matrix();
        this.h = 0.0f;
        this.i = 0.0f;
        this.j = 0.0f;
        this.k = 0.0f;
        this.l = KotlinVersion.MAX_COMPONENT_VALUE;
        this.m = null;
        this.n = null;
        C7925x8 c7925x8 = new C7925x8();
        this.o = c7925x8;
        this.g = new C6319oi1(c6891ri1.g, c7925x8);
        this.a = new Path(c6891ri1.a);
        this.b = new Path(c6891ri1.b);
        this.h = c6891ri1.h;
        this.i = c6891ri1.i;
        this.j = c6891ri1.j;
        this.k = c6891ri1.k;
        this.l = c6891ri1.l;
        this.m = c6891ri1.m;
        String str = c6891ri1.m;
        if (str != null) {
            c7925x8.put(str, this);
        }
        this.n = c6891ri1.n;
    }
}
