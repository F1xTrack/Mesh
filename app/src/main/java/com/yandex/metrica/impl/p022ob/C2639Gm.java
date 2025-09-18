package com.yandex.metrica.impl.p022ob;

import java.util.HashMap;
import org.json.JSONException;

/* renamed from: com.yandex.metrica.impl.ob.Gm */
/* loaded from: classes2.dex */
public class C2639Gm extends HashMap<String, String> {

    /* renamed from: a */
    private int f21324a;

    public C2639Gm() {
        this.f21324a = 0;
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public String put(String str, String str2) {
        if (!containsKey(str)) {
            if (str2 == null) {
                return null;
            }
            this.f21324a = str2.length() + str.length() + this.f21324a;
            return (String) super.put(str, str2);
        }
        if (str2 == null) {
            return remove(str);
        }
        String str3 = get(str);
        this.f21324a = (str2.length() - (str3 == null ? 0 : str3.length())) + this.f21324a;
        return (String) super.put(str, str2);
    }

    public C2639Gm(String str) throws JSONException {
        super(C3762ym.m17301e(str));
        this.f21324a = 0;
        for (String str2 : keySet()) {
            String str3 = (String) get(str2);
            this.f21324a = str2.length() + (str3 == null ? 0 : str3.length()) + this.f21324a;
        }
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public String remove(Object obj) {
        if (containsKey(obj)) {
            String str = get(obj);
            this.f21324a -= ((String) obj).length() + (str == null ? 0 : str.length());
        }
        return (String) super.remove(obj);
    }

    /* renamed from: a */
    public int m14210a() {
        return this.f21324a;
    }
}
