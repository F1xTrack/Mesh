package p000;

import com.p019vk.push.common.Logger;

/* renamed from: fG */
/* loaded from: classes2.dex */
public final class C4042fG implements Logger {

    /* renamed from: a */
    public final String f27124a;

    public C4042fG(String str) {
        this.f27124a = str;
    }

    @Override // com.p019vk.push.common.Logger
    public final Logger createLogger(Object obj) {
        O90.m5968f(obj, "any");
        return Logger.DefaultImpls.createLogger(this, obj);
    }

    @Override // com.p019vk.push.common.Logger
    public final void debug(String str, Throwable th) {
        O90.m5968f(str, "message");
    }

    @Override // com.p019vk.push.common.Logger
    public final void error(String str, Throwable th) {
        O90.m5968f(str, "message");
    }

    @Override // com.p019vk.push.common.Logger
    public final void info(String str, Throwable th) {
        O90.m5968f(str, "message");
    }

    @Override // com.p019vk.push.common.Logger
    public final void verbose(String str, Throwable th) {
        O90.m5968f(str, "message");
    }

    @Override // com.p019vk.push.common.Logger
    public final void warn(String str, Throwable th) {
        O90.m5968f(str, "message");
    }

    @Override // com.p019vk.push.common.Logger
    public final Logger createLogger(String str) {
        O90.m5968f(str, "tag");
        String str2 = this.f27124a;
        if (str2 != null) {
            str = str2 + ':' + str;
        }
        return new C4042fG(str);
    }
}
