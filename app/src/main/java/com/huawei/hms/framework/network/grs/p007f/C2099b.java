package com.huawei.hms.framework.network.grs.p007f;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.hms.framework.common.AssetsUtil;
import com.huawei.hms.framework.common.Logger;
import com.huawei.hms.framework.network.grs.GrsApp;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import com.huawei.hms.framework.network.grs.local.model.C2123a;
import com.huawei.hms.framework.network.grs.p006e.C2095a;
import com.huawei.hms.framework.network.grs.p011h.C2118c;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.huawei.hms.framework.network.grs.f.b */
/* loaded from: classes.dex */
public class C2099b {

    /* renamed from: b */
    private static final Map<String, C2099b> f19040b = new ConcurrentHashMap(16);

    /* renamed from: c */
    private static final Object f19041c = new Object();

    /* renamed from: a */
    private AbstractC2098a f19042a;

    public C2099b(Context context, boolean z) throws IOException {
        m11768a(context, z);
        f19040b.put(context.getPackageName(), this);
    }

    /* renamed from: a */
    public static C2099b m11767a(String str) {
        return f19040b.get(str);
    }

    /* renamed from: b */
    public Set<String> m11772b() {
        return this.f19042a.m11760b();
    }

    /* renamed from: a */
    public C2123a m11769a() {
        return this.f19042a.m11753a();
    }

    /* renamed from: a */
    public String m11770a(Context context, C2095a c2095a, GrsBaseInfo grsBaseInfo, String str, String str2, boolean z) {
        String strM11754a;
        synchronized (f19041c) {
            strM11754a = this.f19042a.m11754a(context, c2095a, grsBaseInfo, str, str2, z);
        }
        return strM11754a;
    }

    /* renamed from: a */
    public Map<String, String> m11771a(Context context, C2095a c2095a, GrsBaseInfo grsBaseInfo, String str, boolean z) {
        Map<String, String> mapM11757a;
        synchronized (f19041c) {
            mapM11757a = this.f19042a.m11757a(context, c2095a, grsBaseInfo, str, z);
        }
        return mapM11757a;
    }

    /* renamed from: a */
    private void m11768a(Context context, boolean z) throws IOException {
        long jCurrentTimeMillis;
        String[] strArrSplit;
        StringBuilder sb;
        long jCurrentTimeMillis2 = System.currentTimeMillis();
        String strM11866a = C2118c.m11866a("grs_route_config_files_list.txt", context);
        Logger.m11685i("LocalManagerProxy", "Io.getConfigContent timeCost:" + (System.currentTimeMillis() - jCurrentTimeMillis2));
        Logger.m11685i("LocalManagerProxy", "initLocalManager configFileListContent:" + strM11866a);
        if (TextUtils.isEmpty(strM11866a)) {
            Logger.m11685i("LocalManagerProxy", "Get config files list by AssetsManager");
            jCurrentTimeMillis = System.currentTimeMillis();
            strArrSplit = AssetsUtil.list(context, GrsApp.getInstance().getBrand(""));
            sb = new StringBuilder("list timeCost:");
        } else {
            jCurrentTimeMillis = System.currentTimeMillis();
            Logger.m11685i("LocalManagerProxy", "Get config files list use configFileListContent: " + strM11866a);
            strArrSplit = strM11866a.split("#");
            sb = new StringBuilder("list timeCost:");
        }
        sb.append(System.currentTimeMillis() - jCurrentTimeMillis);
        Logger.m11685i("LocalManagerProxy", sb.toString());
        List<String> arrayList = strArrSplit == null ? new ArrayList<>() : Arrays.asList(strArrSplit);
        String appConfigName = GrsApp.getInstance().getAppConfigName();
        Logger.m11685i("LocalManagerProxy", "appConfigName is: " + appConfigName);
        Logger.m11685i("LocalManagerProxy", "contains APP_20_CONFIG_FILE_NAME: " + arrayList.contains("grs_app_global_route_config.json"));
        this.f19042a = new C2101d(false, z);
        if (arrayList.contains("grs_app_global_route_config.json") || !TextUtils.isEmpty(appConfigName)) {
            this.f19042a = new C2101d(context, appConfigName, z);
        }
        if (!this.f19042a.m11763c() && arrayList.contains("grs_sdk_global_route_config.json")) {
            this.f19042a = new C2100c(context, z);
        }
        this.f19042a.m11758a(context, arrayList);
        StringBuilder sb2 = new StringBuilder("on initLocalManager finish, check appGrs: ");
        sb2.append(this.f19042a.f19035a == null);
        Logger.m11685i("LocalManagerProxy", sb2.toString());
    }
}
