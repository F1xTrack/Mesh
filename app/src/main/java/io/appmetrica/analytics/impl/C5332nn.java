package io.appmetrica.analytics.impl;

import android.text.TextUtils;
import java.util.LinkedList;
import java.util.List;

/* renamed from: io.appmetrica.analytics.impl.nn */
/* loaded from: classes2.dex */
public final class C5332nn implements InterfaceC5357on {
    @Override // io.appmetrica.analytics.impl.InterfaceC5357on
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C5307mn mo19211a(List<C5307mn> list) {
        LinkedList linkedList = new LinkedList();
        boolean z = true;
        for (C5307mn c5307mn : list) {
            if (!c5307mn.f32232a) {
                linkedList.add(c5307mn.f32233b);
                z = false;
            }
        }
        return z ? new C5307mn(this, true, "") : new C5307mn(this, false, TextUtils.join(", ", linkedList));
    }
}
