package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.modulesapi.internal.service.event.ModuleServiceEventHandler;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;

/* loaded from: classes2.dex */
public final class Mc extends AbstractC4625ig {
    public final ArrayList b;

    public Mc(C4567g5 c4567g5) {
        super(c4567g5);
        String strB = c4567g5.b().b();
        strB = strB == null ? "empty" : strB;
        String.format("[ModulesEventHandler-%s]", Arrays.copyOf(new Object[]{strB}, 1));
        LinkedHashMap linkedHashMapA = C4667ka.h().l().a(strB);
        ArrayList arrayList = new ArrayList(linkedHashMapA.size());
        for (Map.Entry entry : linkedHashMapA.entrySet()) {
            arrayList.add(new Pair(entry.getValue(), new Dc(c4567g5, (String) entry.getKey())));
        }
        this.b = arrayList;
    }

    @Override // io.appmetrica.analytics.impl.AbstractC4625ig
    public final boolean a(T5 t5) {
        ArrayList arrayList = this.b;
        if (!(arrayList instanceof Collection) || !arrayList.isEmpty()) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                Pair pair = (Pair) it.next();
                ModuleServiceEventHandler moduleServiceEventHandler = (ModuleServiceEventHandler) pair.a;
                Dc dc = (Dc) pair.b;
                if (moduleServiceEventHandler.handle(new Gc(dc.b, dc.a, new Fc(dc.c, t5)), t5)) {
                    return true;
                }
            }
        }
        return false;
    }
}
