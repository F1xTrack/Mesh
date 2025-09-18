package p000;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;

/* renamed from: Pc1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8099Pc1 {

    /* renamed from: b */
    public final View f9198b;

    /* renamed from: a */
    public final HashMap f9197a = new HashMap();

    /* renamed from: c */
    public final ArrayList f9199c = new ArrayList();

    public C8099Pc1(View view) {
        this.f9198b = view;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C8099Pc1)) {
            return false;
        }
        C8099Pc1 c8099Pc1 = (C8099Pc1) obj;
        return this.f9198b == c8099Pc1.f9198b && this.f9197a.equals(c8099Pc1.f9197a);
    }

    public final int hashCode() {
        return this.f9197a.hashCode() + (this.f9198b.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sbM5762k = AbstractC0852NX.m5762k("TransitionValues@" + Integer.toHexString(hashCode()) + ":\n", "    view = ");
        sbM5762k.append(this.f9198b);
        sbM5762k.append("\n");
        String strM26232i = AbstractC7222ym.m26232i(sbM5762k.toString(), "    values:");
        HashMap map = this.f9197a;
        for (String str : map.keySet()) {
            strM26232i = strM26232i + "    " + str + ": " + map.get(str) + "\n";
        }
        return strM26232i;
    }
}
