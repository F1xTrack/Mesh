package com.huawei.hms.activity.internal;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class ForegroundBusResponseMgr {

    /* renamed from: b */
    private static final ForegroundBusResponseMgr f18709b = new ForegroundBusResponseMgr();

    /* renamed from: a */
    private final Map<String, BusResponseCallback> f18710a = new HashMap();

    public static ForegroundBusResponseMgr getInstance() {
        return f18709b;
    }

    public BusResponseCallback get(String str) {
        BusResponseCallback busResponseCallback;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        synchronized (this.f18710a) {
            busResponseCallback = this.f18710a.get(str);
        }
        return busResponseCallback;
    }

    public void registerObserver(String str, BusResponseCallback busResponseCallback) {
        if (TextUtils.isEmpty(str) || busResponseCallback == null) {
            return;
        }
        synchronized (this.f18710a) {
            try {
                if (!this.f18710a.containsKey(str)) {
                    this.f18710a.put(str, busResponseCallback);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void unRegisterObserver(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        synchronized (this.f18710a) {
            this.f18710a.remove(str);
        }
    }
}
