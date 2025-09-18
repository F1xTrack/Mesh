package com.huawei.hms.framework.network.grs.p008g;

import android.content.Context;
import com.huawei.hms.framework.common.ExceptionCode;
import com.huawei.hms.framework.common.Logger;
import com.huawei.hms.framework.common.StringUtils;
import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;
import com.huawei.hms.framework.common.hianalytics.HianalyticsHelper;
import com.huawei.hms.framework.common.hianalytics.LinkedHashMapPack;
import com.huawei.hms.framework.network.grs.p008g.p010j.C2112a;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import org.json.JSONArray;
import org.json.JSONObject;
import p000.AbstractC7222ym;

/* renamed from: com.huawei.hms.framework.network.grs.g.e */
/* loaded from: classes.dex */
public class C2107e {

    /* renamed from: com.huawei.hms.framework.network.grs.g.e$a */
    public class a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ long f19083a;

        /* renamed from: b */
        final /* synthetic */ ArrayList f19084b;

        /* renamed from: c */
        final /* synthetic */ JSONArray f19085c;

        public a(long j, ArrayList arrayList, JSONArray jSONArray) {
            this.f19083a = j;
            this.f19084b = arrayList;
            this.f19085c = jSONArray;
        }

        @Override // java.lang.Runnable
        public void run() {
            C2112a c2112a = new C2112a();
            c2112a.put("total_time", this.f19083a);
            Iterator it = this.f19084b.iterator();
            while (it.hasNext()) {
                C2106d c2106d = (C2106d) it.next();
                if (c2106d.m11828o() || c2106d.m11826m()) {
                    c2112a.put(C2107e.m11831b(c2106d));
                    it.remove();
                    break;
                }
            }
            if (this.f19084b.size() > 0) {
                C2106d c2106d2 = (C2106d) AbstractC7222ym.m26228e(1, this.f19084b);
                c2112a.put(C2107e.m11831b(c2106d2));
                this.f19084b.remove(c2106d2);
            }
            if (this.f19084b.size() > 0) {
                Iterator it2 = this.f19084b.iterator();
                while (it2.hasNext()) {
                    this.f19085c.put(new JSONObject(C2107e.m11831b((C2106d) it2.next())));
                }
            }
            if (this.f19085c.length() > 0) {
                c2112a.put("failed_info", this.f19085c.toString());
            }
            Logger.m11681d("HaReportHelper", "grssdk report data to aiops is: %s", new JSONObject(c2112a.get()));
            HianalyticsHelper.getInstance().onEvent(c2112a.get(), "grs_request");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public static LinkedHashMap<String, String> m11831b(C2106d c2106d) {
        LinkedHashMapPack linkedHashMapPack = new LinkedHashMapPack();
        Exception excM11817d = c2106d.m11817d();
        if (excM11817d != null) {
            linkedHashMapPack.put("error_code", ExceptionCode.getErrorCodeFromException(excM11817d));
            linkedHashMapPack.put(CrashHianalyticsData.EXCEPTION_NAME, excM11817d.getClass().getSimpleName());
            linkedHashMapPack.put("message", StringUtils.anonymizeMessage(excM11817d.getMessage()));
        } else {
            linkedHashMapPack.put("error_code", c2106d.m11813b());
            linkedHashMapPack.put(CrashHianalyticsData.EXCEPTION_NAME, c2106d.m11816c());
        }
        try {
            linkedHashMapPack.put("domain", new URL(c2106d.m11825l()).getHost());
        } catch (MalformedURLException e) {
            Logger.m11690w("HaReportHelper", "report host MalformedURLException", e);
        }
        linkedHashMapPack.put("req_start_time", c2106d.m11821h());
        linkedHashMapPack.put("req_end_time", c2106d.m11820g());
        linkedHashMapPack.put("req_total_time", c2106d.m11822i());
        return linkedHashMapPack.getAll();
    }

    /* renamed from: a */
    public static void m11830a(ArrayList<C2106d> arrayList, long j, JSONArray jSONArray, Context context) {
        if (context == null || arrayList == null || arrayList.size() <= 0 || !HianalyticsHelper.getInstance().isEnableReport(context)) {
            return;
        }
        HianalyticsHelper.getInstance().getReportExecutor().submit(new a(j, arrayList, jSONArray));
    }
}
