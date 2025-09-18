package defpackage;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;

/* renamed from: Pc1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1197Pc1 {
    public final View b;
    public final HashMap a = new HashMap();
    public final ArrayList c = new ArrayList();

    public C1197Pc1(View view) {
        this.b = view;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C1197Pc1)) {
            return false;
        }
        C1197Pc1 c1197Pc1 = (C1197Pc1) obj;
        return this.b == c1197Pc1.b && this.a.equals(c1197Pc1.a);
    }

    public final int hashCode() {
        return this.a.hashCode() + (this.b.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sbK = NX.k("TransitionValues@" + Integer.toHexString(hashCode()) + ":\n", "    view = ");
        sbK.append(this.b);
        sbK.append("\n");
        String strI = AbstractC8235ym.i(sbK.toString(), "    values:");
        HashMap map = this.a;
        for (String str : map.keySet()) {
            strI = strI + "    " + str + ": " + map.get(str) + "\n";
        }
        return strI;
    }
}
