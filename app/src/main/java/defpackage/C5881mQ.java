package defpackage;

import java.util.Enumeration;
import java.util.HashMap;

/* renamed from: mQ, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5881mQ implements Enumeration {
    public final /* synthetic */ int a;
    public int b;

    @Override // java.util.Enumeration
    public final boolean hasMoreElements() {
        switch (this.a) {
            case 0:
                int i = this.b;
                DQ[] dqArr = C6454pQ.c;
                if (i < 4) {
                    break;
                }
                break;
            default:
                int i2 = this.b;
                DQ[] dqArr2 = C6454pQ.c;
                if (i2 < 4) {
                    break;
                }
                break;
        }
        return true;
    }

    @Override // java.util.Enumeration
    public final Object nextElement() {
        switch (this.a) {
            case 0:
                HashMap map = new HashMap();
                for (DQ dq : C6454pQ.d[this.b]) {
                    map.put(dq.b, dq);
                }
                this.b++;
                return map;
            default:
                this.b++;
                return new HashMap();
        }
    }
}
