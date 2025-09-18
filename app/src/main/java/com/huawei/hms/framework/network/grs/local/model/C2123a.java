package com.huawei.hms.framework.network.grs.local.model;

import android.text.TextUtils;
import com.huawei.hms.framework.common.Logger;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.huawei.hms.framework.network.grs.local.model.a */
/* loaded from: classes.dex */
public class C2123a {

    /* renamed from: a */
    private String f19120a;

    /* renamed from: b */
    private final Map<String, C2125c> f19121b = new ConcurrentHashMap(16);

    /* renamed from: a */
    public C2125c m11876a(String str) {
        if (!TextUtils.isEmpty(str)) {
            return this.f19121b.get(str);
        }
        Logger.m11689w("ApplicationBean", "In getServing(String serviceName), the serviceName is Empty or null");
        return null;
    }

    /* renamed from: b */
    public void m11880b(String str) {
        this.f19120a = str;
    }

    /* renamed from: a */
    public String m11877a() {
        return this.f19120a;
    }

    /* renamed from: a */
    public void m11878a(long j) {
    }

    /* renamed from: a */
    public void m11879a(String str, C2125c c2125c) {
        if (TextUtils.isEmpty(str) || c2125c == null) {
            return;
        }
        this.f19121b.put(str, c2125c);
    }
}
