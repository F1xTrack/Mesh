package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.modulesapi.internal.service.event.ModuleServiceEventHandler;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;

/* renamed from: io.appmetrica.analytics.impl.Mc */
/* loaded from: classes2.dex */
public final class C4661Mc extends AbstractC5200ig {

    /* renamed from: b */
    public final ArrayList f30479b;

    public C4661Mc(C5139g5 c5139g5) {
        super(c5139g5);
        String strM20055b = c5139g5.mo19229b().m20055b();
        strM20055b = strM20055b == null ? "empty" : strM20055b;
        String.format("[ModulesEventHandler-%s]", Arrays.copyOf(new Object[]{strM20055b}, 1));
        LinkedHashMap linkedHashMapM19351a = C5244ka.m20614h().m20627l().m19351a(strM20055b);
        ArrayList arrayList = new ArrayList(linkedHashMapM19351a.size());
        for (Map.Entry entry : linkedHashMapM19351a.entrySet()) {
            arrayList.add(new Pair(entry.getValue(), new C4444Dc(c5139g5, (String) entry.getKey())));
        }
        this.f30479b = arrayList;
    }

    @Override // io.appmetrica.analytics.impl.AbstractC5200ig
    /* renamed from: a */
    public final boolean mo19341a(C4821T5 c4821t5) {
        ArrayList arrayList = this.f30479b;
        if (!(arrayList instanceof Collection) || !arrayList.isEmpty()) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                Pair pair = (Pair) it.next();
                ModuleServiceEventHandler moduleServiceEventHandler = (ModuleServiceEventHandler) pair.f36702a;
                C4444Dc c4444Dc = (C4444Dc) pair.f36703b;
                if (moduleServiceEventHandler.handle(new C4517Gc(c4444Dc.f30012b, c4444Dc.f30011a, new C4493Fc(c4444Dc.f30013c, c4821t5)), c4821t5)) {
                    return true;
                }
            }
        }
        return false;
    }
}
