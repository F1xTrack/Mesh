package com.huawei.hms.hatool;

import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;

/* renamed from: com.huawei.hms.hatool.d1 */
/* loaded from: classes.dex */
public class C2139d1 implements InterfaceRunnableC2146g {

    /* renamed from: a */
    private String f19162a;

    /* renamed from: b */
    private String f19163b;

    /* renamed from: c */
    private String f19164c;

    /* renamed from: d */
    private List<C2133b1> f19165d;

    public C2139d1(List<C2133b1> list, String str, String str2, String str3) {
        this.f19162a = str;
        this.f19163b = str2;
        this.f19164c = str3;
        this.f19165d = list;
    }

    /* renamed from: a */
    private void m11962a() {
        C2137d.m11957a(AbstractC2177q0.m12197i(), "backup_event", AbstractC2169n1.m12140a(this.f19162a, this.f19164c, this.f19163b));
    }

    @Override // java.lang.Runnable
    public void run() {
        List<C2133b1> list = this.f19165d;
        if (list == null || list.size() == 0) {
            C2186v.m12273d("hmsSdk", "failed events is empty");
            return;
        }
        if (C2135c0.m11945a(AbstractC2177q0.m12197i(), "cached_v2_1", AbstractC2177q0.m12199k() * 1048576)) {
            C2186v.m12275e("hmsSdk", "The cacheFile is full,Can not writing data! reqID:" + this.f19163b);
            return;
        }
        String strM12139a = AbstractC2169n1.m12139a(this.f19162a, this.f19164c);
        List<C2133b1> list2 = C2136c1.m11952b(AbstractC2177q0.m12197i(), "cached_v2_1", strM12139a).get(strM12139a);
        if (list2 != null && list2.size() != 0) {
            this.f19165d.addAll(list2);
        }
        JSONArray jSONArray = new JSONArray();
        Iterator<C2133b1> it = this.f19165d.iterator();
        while (it.hasNext()) {
            try {
                jSONArray.put(it.next().m11937d());
            } catch (JSONException unused) {
                C2186v.m12275e("hmsSdk", "event to json error");
            }
        }
        String string = jSONArray.toString();
        if (string.length() > AbstractC2177q0.m12195h() * 1048576) {
            C2186v.m12275e("hmsSdk", "this failed data is too long,can not writing it");
            this.f19165d = null;
            return;
        }
        C2186v.m12273d("hmsSdk", "data send failed, write to cache file...reqID:" + this.f19163b);
        C2137d.m11960b(AbstractC2177q0.m12197i(), "cached_v2_1", strM12139a, string);
        m11962a();
    }
}
