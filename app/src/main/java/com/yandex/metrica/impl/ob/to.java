package com.yandex.metrica.impl.ob;

import android.text.TextUtils;
import java.util.LinkedList;
import java.util.List;

/* loaded from: classes2.dex */
public class to implements uo<List<so>> {
    @Override // com.yandex.metrica.impl.ob.uo
    public so a(List<so> list) {
        LinkedList linkedList = new LinkedList();
        boolean z = true;
        for (so soVar : list) {
            if (!soVar.b()) {
                linkedList.add(soVar.a());
                z = false;
            }
        }
        return z ? so.a(this) : so.a(this, TextUtils.join(", ", linkedList));
    }
}
