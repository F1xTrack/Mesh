package com.huawei.hms.hatool;

import android.content.Context;
import android.text.TextUtils;
import java.util.LinkedHashMap;
import org.json.JSONException;

/* renamed from: com.huawei.hms.hatool.z0 */
/* loaded from: classes.dex */
public class C2195z0 {

    /* renamed from: a */
    private String f19322a;

    /* renamed from: b */
    public C2163l1 f19323b;

    public C2195z0(String str) {
        this.f19322a = str;
        this.f19323b = new C2163l1(str);
        C2180s.m12212c().m12216a(this.f19322a, this.f19323b);
    }

    /* renamed from: b */
    private C2181s0 m12318b(int i) {
        if (i == 0) {
            return this.f19323b.m12110c();
        }
        if (i == 1) {
            return this.f19323b.m12108b();
        }
        if (i == 2) {
            return this.f19323b.m12111d();
        }
        if (i != 3) {
            return null;
        }
        return this.f19323b.m12105a();
    }

    /* renamed from: c */
    private boolean m12319c(int i) {
        String str;
        if (i != 2) {
            C2181s0 c2181s0M12318b = m12318b(i);
            if (c2181s0M12318b != null && !TextUtils.isEmpty(c2181s0M12318b.m12241h())) {
                return true;
            }
            str = "verifyURL(): URL check failed. type: " + i;
        } else {
            if ("_default_config_tag".equals(this.f19322a)) {
                return true;
            }
            str = "verifyURL(): type: preins. Only default config can report Pre-install data.";
        }
        C2186v.m12275e("hmsSdk", str);
        return false;
    }

    /* renamed from: a */
    public void m12320a(int i) {
        C2186v.m12273d("hmsSdk", "onReport. TAG: " + this.f19322a + ", TYPE: " + i);
        C2147g0.m11993a().m11997a(this.f19322a, i);
    }

    /* renamed from: a */
    public void m12321a(int i, String str, LinkedHashMap<String, String> linkedHashMap) throws JSONException {
        C2186v.m12273d("hmsSdk", "onEvent. TAG: " + this.f19322a + ", TYPE: " + i + ", eventId : " + str);
        if (C2142e1.m11983a(str) || !m12319c(i)) {
            C2186v.m12275e("hmsSdk", "onEvent() parameters check fail. Nothing will be recorded.TAG: " + this.f19322a + ", TYPE: " + i);
            return;
        }
        if (!C2142e1.m11986a(linkedHashMap)) {
            C2186v.m12275e("hmsSdk", "onEvent() parameter mapValue will be cleared.TAG: " + this.f19322a + ", TYPE: " + i);
            linkedHashMap = null;
        }
        C2147g0.m11993a().m11998a(this.f19322a, i, str, linkedHashMap);
    }

    /* renamed from: b */
    public void m12324b(int i, String str, LinkedHashMap<String, String> linkedHashMap) throws JSONException {
        C2186v.m12273d("hmsSdk", "onStreamEvent. TAG: " + this.f19322a + ", TYPE: " + i + ", eventId : " + str);
        if (C2142e1.m11983a(str) || !m12319c(i)) {
            C2186v.m12275e("hmsSdk", "onStreamEvent() parameters check fail. Nothing will be recorded.TAG: " + this.f19322a + ", TYPE: " + i);
            return;
        }
        if (!C2142e1.m11986a(linkedHashMap)) {
            C2186v.m12275e("hmsSdk", "onStreamEvent() parameter mapValue will be cleared.TAG: " + this.f19322a + ", TYPE: " + i);
            linkedHashMap = null;
        }
        C2147g0.m11993a().m12000b(this.f19322a, i, str, linkedHashMap);
    }

    /* renamed from: a */
    public void m12322a(Context context, String str, String str2) throws JSONException {
        C2186v.m12273d("hmsSdk", "onEvent(context). TAG: " + this.f19322a + ", eventId : " + str);
        if (context == null) {
            C2186v.m12275e("hmsSdk", "context is null in onevent ");
            return;
        }
        if (C2142e1.m11983a(str) || !m12319c(0)) {
            C2186v.m12275e("hmsSdk", "onEvent() parameters check fail. Nothing will be recorded.TAG: " + this.f19322a);
        } else {
            if (!C2142e1.m11984a("value", str2, 65536)) {
                C2186v.m12275e("hmsSdk", "onEvent() parameter VALUE is overlong, content will be cleared.TAG: " + this.f19322a);
                str2 = "";
            }
            C2147g0.m11993a().m11999a(this.f19322a, context, str, str2);
        }
    }

    /* renamed from: b */
    public void m12325b(C2181s0 c2181s0) {
        C2186v.m12271c("hmsSdk", "HiAnalyticsInstanceImpl.setOperConf() is executed.TAG: " + this.f19322a);
        if (c2181s0 != null) {
            this.f19323b.m12109b(c2181s0);
        } else {
            this.f19323b.m12109b(null);
            C2186v.m12275e("hmsSdk", "HiAnalyticsInstanceImpl.setOperConf(): config for oper is null!");
        }
    }

    /* renamed from: a */
    public void m12323a(C2181s0 c2181s0) {
        C2186v.m12271c("hmsSdk", "HiAnalyticsInstanceImpl.setMaintConf() is executed.TAG : " + this.f19322a);
        if (c2181s0 != null) {
            this.f19323b.m12107a(c2181s0);
        } else {
            C2186v.m12275e("hmsSdk", "HiAnalyticsInstanceImpl.setMaintConf(): config for maint is null!");
            this.f19323b.m12107a((C2181s0) null);
        }
    }
}
