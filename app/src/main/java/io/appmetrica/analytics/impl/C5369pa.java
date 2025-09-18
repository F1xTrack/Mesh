package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.pa */
/* loaded from: classes2.dex */
public final class C5369pa extends AbstractC4579J2 {
    public C5369pa(int i) {
        super(i);
    }

    @Override // io.appmetrica.analytics.impl.AbstractC4579J2, io.appmetrica.analytics.impl.InterfaceC5394qa
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C4575Im mo19520a(String str) {
        int length = 0;
        if (str != null) {
            int length2 = str.length();
            int i = this.f30329a;
            if (length2 > i) {
                String strSubstring = str.substring(0, i);
                length = str.getBytes().length - strSubstring.getBytes().length;
                str = strSubstring;
            }
        }
        return new C4575Im(str, new C5412r3(length));
    }
}
