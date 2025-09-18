package io.appmetrica.analytics.logger.common.impl;

import java.util.ArrayList;

/* renamed from: io.appmetrica.analytics.logger.common.impl.b */
/* loaded from: classes2.dex */
public final class C5663b {

    /* renamed from: a */
    public final C5666e f33022a;

    public C5663b() {
        this(new C5666e());
    }

    /* renamed from: a */
    public final ArrayList m21286a(String str) {
        String[] strArrSplit = str.split("\\n");
        ArrayList arrayList = new ArrayList();
        for (String str2 : strArrSplit) {
            int i = 0;
            while (str2.length() > i) {
                int length = str2.length();
                int i2 = i + 3800;
                int iMin = Math.min(length, i2);
                if (length > i2) {
                    int iM21287a = C5666e.m21287a(this.f33022a.f33027a.matcher(str2), i, iMin);
                    length = iM21287a == -1 ? iMin : iM21287a + 1;
                }
                arrayList.add(str2.substring(i, length));
                i = length;
            }
        }
        return arrayList;
    }

    public C5663b(C5666e c5666e) {
        this.f33022a = c5666e;
    }
}
