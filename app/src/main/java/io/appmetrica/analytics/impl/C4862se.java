package io.appmetrica.analytics.impl;

import defpackage.AbstractC8069xu;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* renamed from: io.appmetrica.analytics.impl.se, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4862se implements Xm {
    public final boolean a;

    public C4862se(C4910ue c4910ue) {
        boolean z;
        List<C4886te> list = c4910ue.b;
        if ((list instanceof Collection) && list.isEmpty()) {
            z = true;
        } else {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                if (((C4886te) it.next()).c == P7.c) {
                    z = false;
                    break;
                }
            }
            z = true;
        }
        this.a = z;
    }

    @Override // io.appmetrica.analytics.impl.Xm, kotlin.jvm.functions.Function2
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final List<C4886te> invoke(List<? extends C4886te> list, He he) {
        C4886te c4886te = new C4886te(he.a, he.b, he.e);
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                if (((C4886te) it.next()).c == he.e) {
                    if (c4886te.c == P7.c && this.a) {
                        return AbstractC8069xu.O(list, c4886te);
                    }
                    return null;
                }
            }
        }
        return AbstractC8069xu.O(list, c4886te);
    }
}
