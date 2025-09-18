package com.yandex.metrica.impl.ob;

import android.util.Pair;
import defpackage.AbstractC7209tN0;
import java.util.List;

/* renamed from: com.yandex.metrica.impl.ob.oi, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C2982oi {
    public final List<Pair<String, a>> a;

    /* renamed from: com.yandex.metrica.impl.ob.oi$a */
    public static class a {
        public final String a;

        public a(String str) {
            this.a = str;
        }

        public String toString() {
            return this.a;
        }
    }

    public C2982oi(List<Pair<String, a>> list) {
        this.a = list;
    }

    public String toString() {
        return AbstractC7209tN0.A(new StringBuilder("AttributionConfig{deeplinkConditions="), this.a, '}');
    }
}
