package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.pa, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4787pa extends J2 {
    public C4787pa(int i) {
        super(i);
    }

    @Override // io.appmetrica.analytics.impl.J2, io.appmetrica.analytics.impl.InterfaceC4811qa
    public final Im a(String str) {
        int length = 0;
        if (str != null) {
            int length2 = str.length();
            int i = this.a;
            if (length2 > i) {
                String strSubstring = str.substring(0, i);
                length = str.getBytes().length - strSubstring.getBytes().length;
                str = strSubstring;
            }
        }
        return new Im(str, new C4827r3(length));
    }
}
