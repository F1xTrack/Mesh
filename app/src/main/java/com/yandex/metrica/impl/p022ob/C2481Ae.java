package com.yandex.metrica.impl.p022ob;

import com.yandex.metrica.impl.p022ob.C2506Be;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import p000.AbstractC7167xu;
import p000.O90;

/* renamed from: com.yandex.metrica.impl.ob.Ae */
/* loaded from: classes2.dex */
public final class C2481Ae implements InterfaceC2943T2<C2506Be.a, C2756Le> {

    /* renamed from: a */
    private final boolean f20857a;

    public C2481Ae(C2506Be c2506Be) {
        boolean z;
        List<C2506Be.a> list = c2506Be.f20931b;
        O90.m5967e(list, "stateFromDisk.candidates");
        if ((list instanceof Collection) && list.isEmpty()) {
            z = true;
        } else {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                if (((C2506Be.a) it.next()).f20934c == EnumC2567E0.APP) {
                    z = false;
                    break;
                }
            }
            z = true;
        }
        this.f20857a = z;
    }

    @Override // com.yandex.metrica.impl.p022ob.InterfaceC2943T2, kotlin.jvm.functions.Function2
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public List<C2506Be.a> invoke(List<? extends C2506Be.a> list, C2756Le c2756Le) {
        C2506Be.a aVar = new C2506Be.a(c2756Le.f21638a, c2756Le.f21639b, c2756Le.f21642e);
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                if (((C2506Be.a) it.next()).f20934c == c2756Le.f21642e) {
                    if (aVar.f20934c == EnumC2567E0.APP && this.f20857a) {
                        return AbstractC7167xu.m25969O(list, aVar);
                    }
                    return null;
                }
            }
        }
        return AbstractC7167xu.m25969O(list, aVar);
    }
}
