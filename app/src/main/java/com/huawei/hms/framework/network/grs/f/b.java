package com.huawei.hms.framework.network.grs.f;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.hms.framework.common.AssetsUtil;
import com.huawei.hms.framework.common.Logger;
import com.huawei.hms.framework.network.grs.GrsApp;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public class b {
    private static final Map<String, b> b = new ConcurrentHashMap(16);
    private static final Object c = new Object();
    private a a;

    public b(Context context, boolean z) throws IOException {
        a(context, z);
        b.put(context.getPackageName(), this);
    }

    public static b a(String str) {
        return b.get(str);
    }

    public Set<String> b() {
        return this.a.b();
    }

    public com.huawei.hms.framework.network.grs.local.model.a a() {
        return this.a.a();
    }

    public String a(Context context, com.huawei.hms.framework.network.grs.e.a aVar, GrsBaseInfo grsBaseInfo, String str, String str2, boolean z) {
        String strA;
        synchronized (c) {
            strA = this.a.a(context, aVar, grsBaseInfo, str, str2, z);
        }
        return strA;
    }

    public Map<String, String> a(Context context, com.huawei.hms.framework.network.grs.e.a aVar, GrsBaseInfo grsBaseInfo, String str, boolean z) {
        Map<String, String> mapA;
        synchronized (c) {
            mapA = this.a.a(context, aVar, grsBaseInfo, str, z);
        }
        return mapA;
    }

    private void a(Context context, boolean z) throws IOException {
        long jCurrentTimeMillis;
        String[] strArrSplit;
        StringBuilder sb;
        long jCurrentTimeMillis2 = System.currentTimeMillis();
        String strA = com.huawei.hms.framework.network.grs.h.c.a("grs_route_config_files_list.txt", context);
        Logger.i("LocalManagerProxy", "Io.getConfigContent timeCost:" + (System.currentTimeMillis() - jCurrentTimeMillis2));
        Logger.i("LocalManagerProxy", "initLocalManager configFileListContent:" + strA);
        if (TextUtils.isEmpty(strA)) {
            Logger.i("LocalManagerProxy", "Get config files list by AssetsManager");
            jCurrentTimeMillis = System.currentTimeMillis();
            strArrSplit = AssetsUtil.list(context, GrsApp.getInstance().getBrand(""));
            sb = new StringBuilder("list timeCost:");
        } else {
            jCurrentTimeMillis = System.currentTimeMillis();
            Logger.i("LocalManagerProxy", "Get config files list use configFileListContent: " + strA);
            strArrSplit = strA.split("#");
            sb = new StringBuilder("list timeCost:");
        }
        sb.append(System.currentTimeMillis() - jCurrentTimeMillis);
        Logger.i("LocalManagerProxy", sb.toString());
        List<String> arrayList = strArrSplit == null ? new ArrayList<>() : Arrays.asList(strArrSplit);
        String appConfigName = GrsApp.getInstance().getAppConfigName();
        Logger.i("LocalManagerProxy", "appConfigName is: " + appConfigName);
        Logger.i("LocalManagerProxy", "contains APP_20_CONFIG_FILE_NAME: " + arrayList.contains("grs_app_global_route_config.json"));
        this.a = new d(false, z);
        if (arrayList.contains("grs_app_global_route_config.json") || !TextUtils.isEmpty(appConfigName)) {
            this.a = new d(context, appConfigName, z);
        }
        if (!this.a.c() && arrayList.contains("grs_sdk_global_route_config.json")) {
            this.a = new c(context, z);
        }
        this.a.a(context, arrayList);
        StringBuilder sb2 = new StringBuilder("on initLocalManager finish, check appGrs: ");
        sb2.append(this.a.a == null);
        Logger.i("LocalManagerProxy", sb2.toString());
    }
}
