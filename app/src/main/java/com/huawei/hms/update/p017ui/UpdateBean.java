package com.huawei.hms.update.p017ui;

import java.io.Serializable;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public class UpdateBean implements Serializable {

    /* renamed from: a */
    private boolean f19586a;

    /* renamed from: b */
    private boolean f19587b;

    /* renamed from: c */
    private String f19588c;

    /* renamed from: d */
    private int f19589d;

    /* renamed from: e */
    private String f19590e;

    /* renamed from: f */
    private String f19591f;

    /* renamed from: g */
    private ArrayList f19592g;

    /* renamed from: h */
    private boolean f19593h = true;

    /* renamed from: a */
    private static <T> T m12633a(T t) {
        return t;
    }

    public String getClientAppId() {
        return (String) m12633a(this.f19590e);
    }

    public String getClientAppName() {
        return (String) m12633a(this.f19591f);
    }

    public String getClientPackageName() {
        return (String) m12633a(this.f19588c);
    }

    public int getClientVersionCode() {
        return ((Integer) m12633a(Integer.valueOf(this.f19589d))).intValue();
    }

    public boolean getResolutionInstallHMS() {
        return this.f19587b;
    }

    public ArrayList getTypeList() {
        return (ArrayList) m12633a(this.f19592g);
    }

    public boolean isHmsOrApkUpgrade() {
        return ((Boolean) m12633a(Boolean.valueOf(this.f19586a))).booleanValue();
    }

    public boolean isNeedConfirm() {
        return ((Boolean) m12633a(Boolean.valueOf(this.f19593h))).booleanValue();
    }

    public void setClientAppId(String str) {
        this.f19590e = str;
    }

    public void setClientAppName(String str) {
        this.f19591f = str;
    }

    public void setClientPackageName(String str) {
        this.f19588c = str;
    }

    public void setClientVersionCode(int i) {
        this.f19589d = i;
    }

    public void setHmsOrApkUpgrade(boolean z) {
        this.f19586a = z;
    }

    public void setNeedConfirm(boolean z) {
        this.f19593h = z;
    }

    public void setResolutionInstallHMS(boolean z) {
        this.f19587b = z;
    }

    public void setTypeList(ArrayList arrayList) {
        this.f19592g = arrayList;
    }
}
