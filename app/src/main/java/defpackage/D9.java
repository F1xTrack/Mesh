package defpackage;

import java.util.ArrayList;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class D9 extends F9 {
    public final long c;
    public final ArrayList d;
    public final ArrayList e;

    public D9(int i, long j) {
        super(i, 0);
        this.c = j;
        this.d = new ArrayList();
        this.e = new ArrayList();
    }

    public final D9 t(int i) {
        ArrayList arrayList = this.e;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            D9 d9 = (D9) arrayList.get(i2);
            if (d9.b == i) {
                return d9;
            }
        }
        return null;
    }

    @Override // defpackage.F9
    public final String toString() {
        return F9.e(this.b) + " leaves: " + Arrays.toString(this.d.toArray()) + " containers: " + Arrays.toString(this.e.toArray());
    }

    public final E9 u(int i) {
        ArrayList arrayList = this.d;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            E9 e9 = (E9) arrayList.get(i2);
            if (e9.b == i) {
                return e9;
            }
        }
        return null;
    }
}
