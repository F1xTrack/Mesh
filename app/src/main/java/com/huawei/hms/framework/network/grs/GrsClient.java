package com.huawei.hms.framework.network.grs;

import android.content.Context;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class GrsClient {
    private static final String EMPTY_STRING = "";
    private final C2093c grsClientGlobal;
    private int queryTimeout;

    public GrsClient(Context context, GrsBaseInfo grsBaseInfo) {
        if (context == null || grsBaseInfo == null) {
            throw new NullPointerException("invalid init params for context is null or GrsBaseInfo instance is null Object.");
        }
        this.grsClientGlobal = C2094d.m11730a(grsBaseInfo, context);
        this.queryTimeout = grsBaseInfo.getQueryTimeout();
    }

    public void ayncGetGrsUrl(String str, String str2, IQueryUrlCallBack iQueryUrlCallBack) {
        C2093c c2093c = this.grsClientGlobal;
        if (c2093c == null) {
            iQueryUrlCallBack.onCallBackFail(-8);
        } else {
            c2093c.m11727a(str, str2, iQueryUrlCallBack, this.queryTimeout);
        }
    }

    public void ayncGetGrsUrls(String str, IQueryUrlsCallBack iQueryUrlsCallBack) {
        C2093c c2093c = this.grsClientGlobal;
        if (c2093c == null) {
            iQueryUrlsCallBack.onCallBackFail(-8);
        } else {
            c2093c.m11726a(str, iQueryUrlsCallBack, this.queryTimeout);
        }
    }

    public void clearSp() {
        C2093c c2093c = this.grsClientGlobal;
        if (c2093c == null) {
            return;
        }
        c2093c.m11725a();
    }

    public boolean forceExpire() {
        C2093c c2093c = this.grsClientGlobal;
        if (c2093c == null) {
            return false;
        }
        return c2093c.m11729b();
    }

    public String synGetGrsUrl(String str, String str2) {
        C2093c c2093c = this.grsClientGlobal;
        return c2093c == null ? "" : c2093c.m11723a(str, str2, this.queryTimeout);
    }

    public Map<String, String> synGetGrsUrls(String str) {
        C2093c c2093c = this.grsClientGlobal;
        return c2093c == null ? new HashMap() : c2093c.m11724a(str, this.queryTimeout);
    }
}
