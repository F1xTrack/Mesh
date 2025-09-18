package p000;

import android.os.Bundle;
import android.text.Spanned;

/* renamed from: PB */
/* loaded from: classes.dex */
public abstract class AbstractC0956PB {

    /* renamed from: a */
    public static final String f8883a;

    /* renamed from: b */
    public static final String f8884b;

    /* renamed from: c */
    public static final String f8885c;

    /* renamed from: d */
    public static final String f8886d;

    /* renamed from: e */
    public static final String f8887e;

    static {
        int i = AbstractC7485Dh1.f2166a;
        f8883a = Integer.toString(0, 36);
        f8884b = Integer.toString(1, 36);
        f8885c = Integer.toString(2, 36);
        f8886d = Integer.toString(3, 36);
        f8887e = Integer.toString(4, 36);
    }

    /* renamed from: a */
    public static Bundle m6253a(Spanned spanned, InterfaceC8470Wg0 interfaceC8470Wg0, int i, Bundle bundle) {
        Bundle bundle2 = new Bundle();
        bundle2.putInt(f8883a, spanned.getSpanStart(interfaceC8470Wg0));
        bundle2.putInt(f8884b, spanned.getSpanEnd(interfaceC8470Wg0));
        bundle2.putInt(f8885c, spanned.getSpanFlags(interfaceC8470Wg0));
        bundle2.putInt(f8886d, i);
        if (bundle != null) {
            bundle2.putBundle(f8887e, bundle);
        }
        return bundle2;
    }
}
