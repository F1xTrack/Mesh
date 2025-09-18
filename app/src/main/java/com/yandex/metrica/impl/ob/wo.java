package com.yandex.metrica.impl.ob;

import java.util.Map;

/* loaded from: classes2.dex */
public class wo implements uo<String> {
    private final Map<String, ?> a;

    public wo(Map<String, ?> map) {
        this.a = map;
    }

    @Override // com.yandex.metrica.impl.ob.uo
    public so a(String str) {
        String str2 = str;
        if (!this.a.containsKey(str2)) {
            return so.a(this);
        }
        return so.a(this, "Failed to activate AppMetrica with provided apiKey ApiKey " + str2 + " has already been used by another reporter.");
    }
}
