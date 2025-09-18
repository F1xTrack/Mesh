package com.huawei.hms.hatool;

import android.content.Context;

/* renamed from: com.huawei.hms.hatool.b */
/* loaded from: classes.dex */
public class C2131b {

    /* renamed from: a */
    C2181s0 f19138a;

    /* renamed from: b */
    C2181s0 f19139b;

    /* renamed from: c */
    Context f19140c;

    /* renamed from: d */
    String f19141d;

    public C2131b(Context context) {
        if (context != null) {
            this.f19140c = context.getApplicationContext();
        }
        this.f19138a = new C2181s0();
        this.f19139b = new C2181s0();
    }

    /* renamed from: a */
    public C2131b m11920a(int i, String str) {
        C2181s0 c2181s0;
        C2186v.m12271c("hmsSdk", "Builder.setCollectURL(int type,String collectURL) is execute.TYPE : " + i);
        if (!C2175p1.m12176b(str)) {
            str = "";
        }
        if (i == 0) {
            c2181s0 = this.f19138a;
        } else {
            if (i != 1) {
                C2186v.m12276f("hmsSdk", "Builder.setCollectURL(int type,String collectURL): invalid type!");
                return this;
            }
            c2181s0 = this.f19139b;
        }
        c2181s0.m12226b(str);
        return this;
    }

    @Deprecated
    /* renamed from: b */
    public C2131b m11924b(boolean z) {
        C2186v.m12271c("hmsSdk", "Builder.setEnableSN(boolean isReportSN) is execute.");
        this.f19138a.m12243j().m12067b(z);
        this.f19139b.m12243j().m12067b(z);
        return this;
    }

    @Deprecated
    /* renamed from: c */
    public C2131b m11925c(boolean z) {
        C2186v.m12271c("hmsSdk", "Builder.setEnableUDID(boolean isReportUDID) is execute.");
        this.f19138a.m12243j().m12069c(z);
        this.f19139b.m12243j().m12069c(z);
        return this;
    }

    /* renamed from: a */
    public C2131b m11921a(String str) {
        C2186v.m12271c("hmsSdk", "Builder.setAppID is execute");
        this.f19141d = str;
        return this;
    }

    @Deprecated
    /* renamed from: a */
    public C2131b m11922a(boolean z) {
        C2186v.m12271c("hmsSdk", "Builder.setEnableImei(boolean isReportAndroidImei) is execute.");
        this.f19138a.m12243j().m12065a(z);
        this.f19139b.m12243j().m12065a(z);
        return this;
    }

    /* renamed from: a */
    public void m11923a() {
        if (this.f19140c == null) {
            C2186v.m12268b("hmsSdk", "analyticsConf create(): context is null,create failed!");
            return;
        }
        C2186v.m12271c("hmsSdk", "Builder.create() is execute.");
        C2195z0 c2195z0 = new C2195z0("_hms_config_tag");
        c2195z0.m12325b(new C2181s0(this.f19138a));
        c2195z0.m12323a(new C2181s0(this.f19139b));
        C2164m.m12112a().m12114a(this.f19140c);
        C2147g0.m11993a().m11996a(this.f19140c);
        C2176q.m12177c().m12178a(c2195z0);
        C2164m.m12112a().m12115a(this.f19141d);
    }
}
