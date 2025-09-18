package p000;

import java.util.Enumeration;
import java.util.HashMap;

/* renamed from: mQ */
/* loaded from: classes.dex */
public final class C6425mQ implements Enumeration {

    /* renamed from: a */
    public final /* synthetic */ int f37674a;

    /* renamed from: b */
    public int f37675b;

    @Override // java.util.Enumeration
    public final boolean hasMoreElements() {
        switch (this.f37674a) {
            case 0:
                int i = this.f37675b;
                C0216DQ[] c0216dqArr = C6616pQ.f40055c;
                if (i < 4) {
                    break;
                }
                break;
            default:
                int i2 = this.f37675b;
                C0216DQ[] c0216dqArr2 = C6616pQ.f40055c;
                if (i2 < 4) {
                    break;
                }
                break;
        }
        return true;
    }

    @Override // java.util.Enumeration
    public final Object nextElement() {
        switch (this.f37674a) {
            case 0:
                HashMap map = new HashMap();
                for (C0216DQ c0216dq : C6616pQ.f40056d[this.f37675b]) {
                    map.put(c0216dq.f2009b, c0216dq);
                }
                this.f37675b++;
                return map;
            default:
                this.f37675b++;
                return new HashMap();
        }
    }
}
