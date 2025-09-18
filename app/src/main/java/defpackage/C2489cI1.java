package defpackage;

import android.os.Bundle;
import java.util.HashSet;

/* renamed from: cI1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2489cI1 implements AR1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ C2489cI1(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.AR1
    public final void a(long j, Bundle bundle, String str, String str2) {
        Object obj = this.b;
        switch (this.a) {
            case 0:
                ES1 es1 = (ES1) obj;
                if (((HashSet) es1.b).contains(str2)) {
                    Bundle bundle2 = new Bundle();
                    V70 v70 = AbstractC6420pE1.a;
                    String strB = L22.b(str2, AbstractC6441pL1.c, AbstractC6441pL1.a);
                    if (strB != null) {
                        str2 = strB;
                    }
                    bundle2.putString("events", str2);
                    ((N8) es1.c).v(2, bundle2);
                    break;
                }
                break;
            default:
                if (str != null && !AbstractC6420pE1.a.contains(str2)) {
                    Bundle bundle3 = new Bundle();
                    bundle3.putString("name", str2);
                    bundle3.putLong("timestampInMillis", j);
                    bundle3.putBundle("params", bundle);
                    ((N8) ((C6446pN0) obj).b).v(3, bundle3);
                    break;
                }
                break;
        }
    }
}
