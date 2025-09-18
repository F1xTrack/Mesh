package p000;

import android.os.Bundle;
import java.util.HashSet;

/* renamed from: cI1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8963cI1 implements AR1 {

    /* renamed from: a */
    public final /* synthetic */ int f17416a;

    /* renamed from: b */
    public final /* synthetic */ Object f17417b;

    public /* synthetic */ C8963cI1(int i, Object obj) {
        this.f17416a = i;
        this.f17417b = obj;
    }

    @Override // p000.AR1
    /* renamed from: a */
    public final void mo181a(long j, Bundle bundle, String str, String str2) {
        Object obj = this.f17417b;
        switch (this.f17416a) {
            case 0:
                ES1 es1 = (ES1) obj;
                if (((HashSet) es1.f2708b).contains(str2)) {
                    Bundle bundle2 = new Bundle();
                    V70 v70 = AbstractC10624pE1.f39956a;
                    String strM4896b = L22.m4896b(str2, AbstractC10638pL1.f40029c, AbstractC10638pL1.f40027a);
                    if (strM4896b != null) {
                        str2 = strM4896b;
                    }
                    bundle2.putString("events", str2);
                    ((C0827N8) es1.f2709c).m5566v(2, bundle2);
                    break;
                }
                break;
            default:
                if (str != null && !AbstractC10624pE1.f39956a.contains(str2)) {
                    Bundle bundle3 = new Bundle();
                    bundle3.putString("name", str2);
                    bundle3.putLong("timestampInMillis", j);
                    bundle3.putBundle("params", bundle);
                    ((C0827N8) ((C10641pN0) obj).f40042b).m5566v(3, bundle3);
                    break;
                }
                break;
        }
    }
}
