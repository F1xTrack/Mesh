package io.appmetrica.analytics.impl;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import p000.AbstractC7167xu;

/* renamed from: io.appmetrica.analytics.impl.se */
/* loaded from: classes2.dex */
public final class C5448se implements InterfaceC4934Xm {

    /* renamed from: a */
    public final boolean f32568a;

    public C5448se(C5498ue c5498ue) {
        boolean z;
        List<C5473te> list = c5498ue.f32690b;
        if ((list instanceof Collection) && list.isEmpty()) {
            z = true;
        } else {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                if (((C5473te) it.next()).f32632c == EnumC4728P7.f30605c) {
                    z = false;
                    break;
                }
            }
            z = true;
        }
        this.f32568a = z;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC4934Xm, kotlin.jvm.functions.Function2
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final List<C5473te> invoke(List<? extends C5473te> list, C4543He c4543He) {
        C5473te c5473te = new C5473te(c4543He.f30251a, c4543He.f30252b, c4543He.f30255e);
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                if (((C5473te) it.next()).f32632c == c4543He.f30255e) {
                    if (c5473te.f32632c == EnumC4728P7.f30605c && this.f32568a) {
                        return AbstractC7167xu.m25969O(list, c5473te);
                    }
                    return null;
                }
            }
        }
        return AbstractC7167xu.m25969O(list, c5473te);
    }
}
