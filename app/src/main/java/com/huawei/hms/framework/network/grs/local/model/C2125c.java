package com.huawei.hms.framework.network.grs.local.model;

import android.text.TextUtils;
import com.huawei.hms.framework.common.Logger;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.huawei.hms.framework.network.grs.local.model.c */
/* loaded from: classes.dex */
public class C2125c {

    /* renamed from: a */
    private String f19124a;

    /* renamed from: b */
    private final Map<String, C2126d> f19125b = new ConcurrentHashMap(16);

    /* renamed from: c */
    private List<C2124b> f19126c = new ArrayList(16);

    /* renamed from: a */
    public C2126d m11887a(String str) {
        if (!TextUtils.isEmpty(str)) {
            return this.f19125b.get(str);
        }
        Logger.m11689w("Service", "In servings.getServing(String groupId), the groupId is Empty or null");
        return null;
    }

    /* renamed from: b */
    public String m11891b() {
        return this.f19124a;
    }

    /* renamed from: c */
    public void m11893c(String str) {
        this.f19124a = str;
    }

    /* renamed from: a */
    public List<C2124b> m11888a() {
        return this.f19126c;
    }

    /* renamed from: b */
    public void m11892b(String str) {
    }

    /* renamed from: a */
    public void m11889a(String str, C2126d c2126d) {
        if (TextUtils.isEmpty(str) || c2126d == null) {
            return;
        }
        this.f19125b.put(str, c2126d);
    }

    /* renamed from: a */
    public void m11890a(List<C2124b> list) {
        this.f19126c = list;
    }
}
