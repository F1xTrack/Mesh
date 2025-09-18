package com.yandex.metrica.impl.p022ob;

import android.text.TextUtils;
import java.util.Comparator;

/* renamed from: com.yandex.metrica.impl.ob.mo */
/* loaded from: classes2.dex */
public class C3452mo implements Comparator<C3093Z2> {
    @Override // java.util.Comparator
    public int compare(C3093Z2 c3093z2, C3093Z2 c3093z22) {
        C3093Z2 c3093z23 = c3093z2;
        C3093Z2 c3093z24 = c3093z22;
        return (TextUtils.equals(c3093z23.f22909a, c3093z24.f22909a) && TextUtils.equals(c3093z23.f22910b, c3093z24.f22910b)) ? 0 : 10;
    }
}
