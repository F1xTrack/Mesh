package com.huawei.hms.base.log;

import android.content.Context;
import com.huawei.hms.support.log.HMSExtLogger;

/* renamed from: com.huawei.hms.base.log.a */
/* loaded from: classes.dex */
public class C2047a implements InterfaceC2050d {

    /* renamed from: a */
    private final HMSExtLogger f18849a;

    /* renamed from: b */
    private InterfaceC2050d f18850b;

    public C2047a(HMSExtLogger hMSExtLogger) {
        this.f18849a = hMSExtLogger;
    }

    @Override // com.huawei.hms.base.log.InterfaceC2050d
    /* renamed from: a */
    public void mo11539a(Context context, String str) {
        InterfaceC2050d interfaceC2050d = this.f18850b;
        if (interfaceC2050d != null) {
            interfaceC2050d.mo11539a(context, str);
        }
    }

    @Override // com.huawei.hms.base.log.InterfaceC2050d
    /* renamed from: a */
    public void mo11540a(InterfaceC2050d interfaceC2050d) {
        this.f18850b = interfaceC2050d;
    }

    @Override // com.huawei.hms.base.log.InterfaceC2050d
    /* renamed from: a */
    public void mo11541a(String str, int i, String str2, String str3) {
        HMSExtLogger hMSExtLogger = this.f18849a;
        if (hMSExtLogger != null) {
            if (i == 3) {
                hMSExtLogger.m12612d(str2, str3);
            } else if (i == 4) {
                hMSExtLogger.m12614i(str2, str3);
            } else if (i != 5) {
                hMSExtLogger.m12613e(str2, str3);
            } else {
                hMSExtLogger.m12615w(str2, str3);
            }
        }
        InterfaceC2050d interfaceC2050d = this.f18850b;
        if (interfaceC2050d != null) {
            interfaceC2050d.mo11541a(str, i, str2, str3);
        }
    }
}
