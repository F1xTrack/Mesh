package defpackage;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class SG extends C1896Yb1 {
    public boolean r;
    public boolean s;
    public boolean t;
    public boolean u;
    public boolean v;
    public boolean w;
    public boolean x;
    public final SparseArray y;
    public final SparseBooleanArray z;

    /* JADX WARN: Removed duplicated region for block: B:109:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x00fc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public SG(android.content.Context r9) throws java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 280
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.SG.<init>(android.content.Context):void");
    }

    @Override // defpackage.C1896Yb1
    public final C1896Yb1 b(int i, int i2) {
        super.b(i, i2);
        return this;
    }

    public final void c() {
        this.r = true;
        this.s = true;
        this.t = true;
        this.u = true;
        this.v = true;
        this.w = true;
        this.x = true;
    }

    public SG(TG tg) {
        a(tg);
        this.r = tg.r;
        this.s = tg.s;
        this.t = tg.t;
        this.u = tg.u;
        this.v = tg.v;
        this.w = tg.w;
        this.x = tg.x;
        SparseArray sparseArray = new SparseArray();
        int i = 0;
        while (true) {
            SparseArray sparseArray2 = tg.y;
            if (i < sparseArray2.size()) {
                sparseArray.put(sparseArray2.keyAt(i), new HashMap((Map) sparseArray2.valueAt(i)));
                i++;
            } else {
                this.y = sparseArray;
                this.z = tg.z.clone();
                return;
            }
        }
    }

    public SG() {
        this.y = new SparseArray();
        this.z = new SparseBooleanArray();
        c();
    }
}
