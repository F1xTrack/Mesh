package com.huawei.hms.base.log;

import android.content.Context;

/* renamed from: com.huawei.hms.base.log.c */
/* loaded from: classes.dex */
public class C2049c implements InterfaceC2050d {

    /* renamed from: a */
    private InterfaceC2050d f18854a;

    @Override // com.huawei.hms.base.log.InterfaceC2050d
    /* renamed from: a */
    public void mo11539a(Context context, String str) {
        InterfaceC2050d interfaceC2050d = this.f18854a;
        if (interfaceC2050d != null) {
            interfaceC2050d.mo11539a(context, str);
        }
    }

    @Override // com.huawei.hms.base.log.InterfaceC2050d
    /* renamed from: a */
    public void mo11540a(InterfaceC2050d interfaceC2050d) {
        this.f18854a = interfaceC2050d;
    }

    @Override // com.huawei.hms.base.log.InterfaceC2050d
    /* renamed from: a */
    public void mo11541a(String str, int i, String str2, String str3) {
        InterfaceC2050d interfaceC2050d = this.f18854a;
        if (interfaceC2050d != null) {
            interfaceC2050d.mo11541a(str, i, str2, str3);
        }
    }
}
