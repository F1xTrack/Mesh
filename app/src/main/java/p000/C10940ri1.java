package p000;

import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import kotlin.KotlinVersion;

/* renamed from: ri1 */
/* loaded from: classes.dex */
public final class C10940ri1 {

    /* renamed from: p */
    public static final Matrix f41815p = new Matrix();

    /* renamed from: a */
    public final Path f41816a;

    /* renamed from: b */
    public final Path f41817b;

    /* renamed from: c */
    public final Matrix f41818c;

    /* renamed from: d */
    public Paint f41819d;

    /* renamed from: e */
    public Paint f41820e;

    /* renamed from: f */
    public PathMeasure f41821f;

    /* renamed from: g */
    public final C10556oi1 f41822g;

    /* renamed from: h */
    public float f41823h;

    /* renamed from: i */
    public float f41824i;

    /* renamed from: j */
    public float f41825j;

    /* renamed from: k */
    public float f41826k;

    /* renamed from: l */
    public int f41827l;

    /* renamed from: m */
    public String f41828m;

    /* renamed from: n */
    public Boolean f41829n;

    /* renamed from: o */
    public final C7119x8 f41830o;

    public C10940ri1() {
        this.f41818c = new Matrix();
        this.f41823h = 0.0f;
        this.f41824i = 0.0f;
        this.f41825j = 0.0f;
        this.f41826k = 0.0f;
        this.f41827l = KotlinVersion.MAX_COMPONENT_VALUE;
        this.f41828m = null;
        this.f41829n = null;
        this.f41830o = new C7119x8();
        this.f41822g = new C10556oi1();
        this.f41816a = new Path();
        this.f41817b = new Path();
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
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m24463a(p000.C10556oi1 r19, android.graphics.Matrix r20, android.graphics.Canvas r21, int r22, int r23) {
        /*
            Method dump skipped, instructions count: 558
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C10940ri1.m24463a(oi1, android.graphics.Matrix, android.graphics.Canvas, int, int):void");
    }

    public float getAlpha() {
        return getRootAlpha() / 255.0f;
    }

    public int getRootAlpha() {
        return this.f41827l;
    }

    public void setAlpha(float f) {
        setRootAlpha((int) (f * 255.0f));
    }

    public void setRootAlpha(int i) {
        this.f41827l = i;
    }

    public C10940ri1(C10940ri1 c10940ri1) {
        this.f41818c = new Matrix();
        this.f41823h = 0.0f;
        this.f41824i = 0.0f;
        this.f41825j = 0.0f;
        this.f41826k = 0.0f;
        this.f41827l = KotlinVersion.MAX_COMPONENT_VALUE;
        this.f41828m = null;
        this.f41829n = null;
        C7119x8 c7119x8 = new C7119x8();
        this.f41830o = c7119x8;
        this.f41822g = new C10556oi1(c10940ri1.f41822g, c7119x8);
        this.f41816a = new Path(c10940ri1.f41816a);
        this.f41817b = new Path(c10940ri1.f41817b);
        this.f41823h = c10940ri1.f41823h;
        this.f41824i = c10940ri1.f41824i;
        this.f41825j = c10940ri1.f41825j;
        this.f41826k = c10940ri1.f41826k;
        this.f41827l = c10940ri1.f41827l;
        this.f41828m = c10940ri1.f41828m;
        String str = c10940ri1.f41828m;
        if (str != null) {
            c7119x8.put(str, this);
        }
        this.f41829n = c10940ri1.f41829n;
    }
}
