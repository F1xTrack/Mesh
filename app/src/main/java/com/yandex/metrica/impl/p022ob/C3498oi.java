package com.yandex.metrica.impl.p022ob;

import android.util.Pair;
import java.util.List;
import p000.AbstractC11153tN0;

/* renamed from: com.yandex.metrica.impl.ob.oi */
/* loaded from: classes2.dex */
public class C3498oi {

    /* renamed from: a */
    public final List<Pair<String, a>> f24393a;

    /* renamed from: com.yandex.metrica.impl.ob.oi$a */
    public static class a {

        /* renamed from: a */
        public final String f24394a;

        public a(String str) {
            this.f24394a = str;
        }

        public String toString() {
            return this.f24394a;
        }
    }

    public C3498oi(List<Pair<String, a>> list) {
        this.f24393a = list;
    }

    public String toString() {
        return AbstractC11153tN0.m24883A(new StringBuilder("AttributionConfig{deeplinkConditions="), this.f24393a, '}');
    }
}
