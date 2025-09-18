package com.yandex.metrica.impl.ob;

import java.util.HashMap;
import org.json.JSONException;

/* loaded from: classes2.dex */
public class Gm extends HashMap<String, String> {
    private int a;

    public Gm() {
        this.a = 0;
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public String put(String str, String str2) {
        if (!containsKey(str)) {
            if (str2 == null) {
                return null;
            }
            this.a = str2.length() + str.length() + this.a;
            return (String) super.put(str, str2);
        }
        if (str2 == null) {
            return remove(str);
        }
        String str3 = get(str);
        this.a = (str2.length() - (str3 == null ? 0 : str3.length())) + this.a;
        return (String) super.put(str, str2);
    }

    public Gm(String str) throws JSONException {
        super(C3240ym.e(str));
        this.a = 0;
        for (String str2 : keySet()) {
            String str3 = (String) get(str2);
            this.a = str2.length() + (str3 == null ? 0 : str3.length()) + this.a;
        }
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public String remove(Object obj) {
        if (containsKey(obj)) {
            String str = get(obj);
            this.a -= ((String) obj).length() + (str == null ? 0 : str.length());
        }
        return (String) super.remove(obj);
    }

    public int a() {
        return this.a;
    }
}
