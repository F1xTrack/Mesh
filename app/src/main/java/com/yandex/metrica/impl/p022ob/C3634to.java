package com.yandex.metrica.impl.p022ob;

import android.text.TextUtils;
import java.util.LinkedList;
import java.util.List;

/* renamed from: com.yandex.metrica.impl.ob.to */
/* loaded from: classes2.dex */
public class C3634to implements InterfaceC3660uo<List<C3608so>> {
    @Override // com.yandex.metrica.impl.p022ob.InterfaceC3660uo
    /* renamed from: a */
    public C3608so mo14391a(List<C3608so> list) {
        LinkedList linkedList = new LinkedList();
        boolean z = true;
        for (C3608so c3608so : list) {
            if (!c3608so.m16805b()) {
                linkedList.add(c3608so.m16804a());
                z = false;
            }
        }
        return z ? C3608so.m16802a(this) : C3608so.m16803a(this, TextUtils.join(", ", linkedList));
    }
}
