package io.appmetrica.analytics.impl;

import java.util.HashMap;

/* renamed from: io.appmetrica.analytics.impl.qc */
/* loaded from: classes2.dex */
public final class C5396qc extends HashMap {

    /* renamed from: a */
    public int f32444a;

    public C5396qc() {
        this.f32444a = 0;
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final String put(String str, String str2) {
        if (!containsKey(str)) {
            if (str2 == null) {
                return null;
            }
            this.f32444a = str2.length() + str.length() + this.f32444a;
            return (String) super.put(str, str2);
        }
        if (str2 != null) {
            String str3 = (String) get(str);
            this.f32444a = (str2.length() - (str3 != null ? str3.length() : 0)) + this.f32444a;
            return (String) super.put(str, str2);
        }
        if (containsKey(str)) {
            String str4 = (String) get(str);
            this.f32444a -= str.length() + (str4 != null ? str4.length() : 0);
        }
        return (String) super.remove(str);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        if (containsKey(obj)) {
            String str = (String) get(obj);
            this.f32444a -= ((String) obj).length() + (str == null ? 0 : str.length());
        }
        return (String) super.remove(obj);
    }

    public C5396qc(String str) {
        super(AbstractC5020bb.m20177d(str));
        this.f32444a = 0;
        for (String str2 : keySet()) {
            String str3 = (String) get(str2);
            this.f32444a = str2.length() + (str3 == null ? 0 : str3.length()) + this.f32444a;
        }
    }
}
