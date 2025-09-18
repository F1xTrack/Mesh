package com.yandex.metrica.impl.ob;

import android.text.TextUtils;
import java.util.Comparator;

/* loaded from: classes2.dex */
public class mo implements Comparator<Z2> {
    @Override // java.util.Comparator
    public int compare(Z2 z2, Z2 z22) {
        Z2 z23 = z2;
        Z2 z24 = z22;
        return (TextUtils.equals(z23.a, z24.a) && TextUtils.equals(z23.b, z24.b)) ? 0 : 10;
    }
}
