package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.modulesapi.internal.service.event.ModuleEventServiceHandlerFactory;
import java.util.LinkedHashMap;
import java.util.Map;
import p000.AbstractC11205tn0;

/* renamed from: io.appmetrica.analytics.impl.Ec */
/* loaded from: classes2.dex */
public final class C4469Ec {

    /* renamed from: a */
    public final LinkedHashMap f30068a = new LinkedHashMap();

    /* renamed from: a */
    public final LinkedHashMap m19351a(String str) {
        LinkedHashMap linkedHashMap = this.f30068a;
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(AbstractC11205tn0.m24983b(linkedHashMap.size()));
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            linkedHashMap2.put(entry.getKey(), ((ModuleEventServiceHandlerFactory) entry.getValue()).createEventHandler(str));
        }
        return linkedHashMap2;
    }
}
