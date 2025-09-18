package com.huawei.hms.common.internal;

import android.app.Activity;
import com.huawei.hms.support.api.client.SubAppInfo;
import com.huawei.hms.support.api.entity.auth.Scope;
import java.lang.ref.WeakReference;
import java.util.List;

/* loaded from: classes.dex */
public class ClientSettings {

    /* renamed from: a */
    private String f18941a;

    /* renamed from: b */
    private String f18942b;

    /* renamed from: c */
    private List<Scope> f18943c;

    /* renamed from: d */
    private String f18944d;

    /* renamed from: e */
    private List<String> f18945e;

    /* renamed from: f */
    private String f18946f;

    /* renamed from: g */
    private SubAppInfo f18947g;

    /* renamed from: h */
    private WeakReference<Activity> f18948h;

    /* renamed from: i */
    private boolean f18949i;

    /* renamed from: j */
    private String f18950j;

    /* renamed from: k */
    private boolean f18951k;

    public ClientSettings(String str, String str2, List<Scope> list, String str3, List<String> list2) {
        this.f18941a = str;
        this.f18942b = str2;
        this.f18943c = list;
        this.f18944d = str3;
        this.f18945e = list2;
    }

    public List<String> getApiName() {
        return this.f18945e;
    }

    public String getAppID() {
        return this.f18944d;
    }

    public String getClientClassName() {
        return this.f18942b;
    }

    public String getClientPackageName() {
        return this.f18941a;
    }

    public Activity getCpActivity() {
        WeakReference<Activity> weakReference = this.f18948h;
        if (weakReference == null) {
            return null;
        }
        return weakReference.get();
    }

    public String getCpID() {
        return this.f18946f;
    }

    public String getInnerHmsPkg() {
        return this.f18950j;
    }

    public List<Scope> getScopes() {
        return this.f18943c;
    }

    public SubAppInfo getSubAppID() {
        return this.f18947g;
    }

    public boolean isHasActivity() {
        return this.f18949i;
    }

    public boolean isUseInnerHms() {
        return this.f18951k;
    }

    public void setApiName(List<String> list) {
        this.f18945e = list;
    }

    public void setAppID(String str) {
        this.f18944d = str;
    }

    public void setClientClassName(String str) {
        this.f18942b = str;
    }

    public void setClientPackageName(String str) {
        this.f18941a = str;
    }

    public void setCpActivity(Activity activity) {
        this.f18948h = new WeakReference<>(activity);
        this.f18949i = true;
    }

    public void setCpID(String str) {
        this.f18946f = str;
    }

    public void setInnerHmsPkg(String str) {
        this.f18950j = str;
    }

    public void setScopes(List<Scope> list) {
        this.f18943c = list;
    }

    public void setSubAppId(SubAppInfo subAppInfo) {
        this.f18947g = subAppInfo;
    }

    public void setUseInnerHms(boolean z) {
        this.f18951k = z;
    }

    public ClientSettings(String str, String str2, List<Scope> list, String str3, List<String> list2, SubAppInfo subAppInfo) {
        this(str, str2, list, str3, list2);
        this.f18947g = subAppInfo;
    }
}
