package defpackage;

import android.os.Bundle;
import android.text.Spanned;

/* loaded from: classes.dex */
public abstract class PB {
    public static final String a;
    public static final String b;
    public static final String c;
    public static final String d;
    public static final String e;

    static {
        int i = AbstractC0277Dh1.a;
        a = Integer.toString(0, 36);
        b = Integer.toString(1, 36);
        c = Integer.toString(2, 36);
        d = Integer.toString(3, 36);
        e = Integer.toString(4, 36);
    }

    public static Bundle a(Spanned spanned, InterfaceC1754Wg0 interfaceC1754Wg0, int i, Bundle bundle) {
        Bundle bundle2 = new Bundle();
        bundle2.putInt(a, spanned.getSpanStart(interfaceC1754Wg0));
        bundle2.putInt(b, spanned.getSpanEnd(interfaceC1754Wg0));
        bundle2.putInt(c, spanned.getSpanFlags(interfaceC1754Wg0));
        bundle2.putInt(d, i);
        if (bundle != null) {
            bundle2.putBundle(e, bundle);
        }
        return bundle2;
    }
}
