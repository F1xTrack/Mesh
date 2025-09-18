package com.yandex.metrica.impl.ob;

import com.yandex.metrica.impl.ob.Be;
import defpackage.AbstractC8069xu;
import defpackage.O90;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public final class Ae implements T2<Be.a, Le> {
    private final boolean a;

    public Ae(Be be) {
        boolean z;
        List<Be.a> list = be.b;
        O90.e(list, "stateFromDisk.candidates");
        if ((list instanceof Collection) && list.isEmpty()) {
            z = true;
        } else {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                if (((Be.a) it.next()).c == E0.APP) {
                    z = false;
                    break;
                }
            }
            z = true;
        }
        this.a = z;
    }

    @Override // com.yandex.metrica.impl.ob.T2, kotlin.jvm.functions.Function2
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public List<Be.a> invoke(List<? extends Be.a> list, Le le) {
        Be.a aVar = new Be.a(le.a, le.b, le.e);
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                if (((Be.a) it.next()).c == le.e) {
                    if (aVar.c == E0.APP && this.a) {
                        return AbstractC8069xu.O(list, aVar);
                    }
                    return null;
                }
            }
        }
        return AbstractC8069xu.O(list, aVar);
    }
}
