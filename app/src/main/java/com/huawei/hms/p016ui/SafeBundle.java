package com.huawei.hms.p016ui;

import android.os.Bundle;
import com.huawei.hms.base.p005ui.LogUtil;

/* loaded from: classes2.dex */
public class SafeBundle {

    /* renamed from: a */
    private final Bundle f19579a;

    public SafeBundle() {
        this(new Bundle());
    }

    public boolean containsKey(String str) {
        try {
            return this.f19579a.containsKey(str);
        } catch (Throwable unused) {
            LogUtil.m11561e("SafeBundle", "containsKey exception. key:");
            return false;
        }
    }

    public Object get(String str) {
        try {
            return this.f19579a.get(str);
        } catch (Exception e) {
            LogUtil.m11562e("SafeBundle", "get exception: " + e.getMessage(), true);
            return null;
        }
    }

    public Bundle getBundle() {
        return this.f19579a;
    }

    public int getInt(String str) {
        return getInt(str, 0);
    }

    public String getString(String str) {
        try {
            return this.f19579a.getString(str);
        } catch (Throwable th) {
            LogUtil.m11562e("SafeBundle", "getString exception: " + th.getMessage(), true);
            return "";
        }
    }

    public boolean isEmpty() {
        try {
            return this.f19579a.isEmpty();
        } catch (Exception unused) {
            LogUtil.m11561e("SafeBundle", "isEmpty exception");
            return true;
        }
    }

    public int size() {
        try {
            return this.f19579a.size();
        } catch (Exception unused) {
            LogUtil.m11561e("SafeBundle", "size exception");
            return 0;
        }
    }

    public String toString() {
        return this.f19579a.toString();
    }

    public SafeBundle(Bundle bundle) {
        this.f19579a = bundle == null ? new Bundle() : bundle;
    }

    public int getInt(String str, int i) {
        try {
            return this.f19579a.getInt(str, i);
        } catch (Throwable th) {
            LogUtil.m11562e("SafeBundle", "getInt exception: " + th.getMessage(), true);
            return i;
        }
    }

    public String getString(String str, String str2) {
        try {
            return this.f19579a.getString(str, str2);
        } catch (Exception e) {
            LogUtil.m11562e("SafeBundle", "getString exception: " + e.getMessage(), true);
            return str2;
        }
    }
}
