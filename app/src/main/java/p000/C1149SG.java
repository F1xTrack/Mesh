package p000;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import java.util.HashMap;
import java.util.Map;

/* renamed from: SG */
/* loaded from: classes.dex */
public final class C1149SG extends C8565Yb1 {

    /* renamed from: r */
    public boolean f10660r;

    /* renamed from: s */
    public boolean f10661s;

    /* renamed from: t */
    public boolean f10662t;

    /* renamed from: u */
    public boolean f10663u;

    /* renamed from: v */
    public boolean f10664v;

    /* renamed from: w */
    public boolean f10665w;

    /* renamed from: x */
    public boolean f10666x;

    /* renamed from: y */
    public final SparseArray f10667y;

    /* renamed from: z */
    public final SparseBooleanArray f10668z;

    /* JADX WARN: Removed duplicated region for block: B:109:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x00fc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C1149SG(android.content.Context r9) throws java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 280
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C1149SG.<init>(android.content.Context):void");
    }

    @Override // p000.C8565Yb1
    /* renamed from: b */
    public final C8565Yb1 mo7207b(int i, int i2) {
        super.mo7207b(i, i2);
        return this;
    }

    /* renamed from: c */
    public final void m7208c() {
        this.f10660r = true;
        this.f10661s = true;
        this.f10662t = true;
        this.f10663u = true;
        this.f10664v = true;
        this.f10665w = true;
        this.f10666x = true;
    }

    public C1149SG(C1212TG c1212tg) {
        m9322a(c1212tg);
        this.f10660r = c1212tg.f11263r;
        this.f10661s = c1212tg.f11264s;
        this.f10662t = c1212tg.f11265t;
        this.f10663u = c1212tg.f11266u;
        this.f10664v = c1212tg.f11267v;
        this.f10665w = c1212tg.f11268w;
        this.f10666x = c1212tg.f11269x;
        SparseArray sparseArray = new SparseArray();
        int i = 0;
        while (true) {
            SparseArray sparseArray2 = c1212tg.f11270y;
            if (i < sparseArray2.size()) {
                sparseArray.put(sparseArray2.keyAt(i), new HashMap((Map) sparseArray2.valueAt(i)));
                i++;
            } else {
                this.f10667y = sparseArray;
                this.f10668z = c1212tg.f11271z.clone();
                return;
            }
        }
    }

    public C1149SG() {
        this.f10667y = new SparseArray();
        this.f10668z = new SparseBooleanArray();
        m7208c();
    }
}
