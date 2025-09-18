package defpackage;

import com.vk.push.common.Logger;

/* renamed from: fG, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3738fG implements Logger {
    public final String a;

    public C3738fG(String str) {
        this.a = str;
    }

    @Override // com.vk.push.common.Logger
    public final Logger createLogger(Object obj) {
        O90.f(obj, "any");
        return Logger.DefaultImpls.createLogger(this, obj);
    }

    @Override // com.vk.push.common.Logger
    public final void debug(String str, Throwable th) {
        O90.f(str, "message");
    }

    @Override // com.vk.push.common.Logger
    public final void error(String str, Throwable th) {
        O90.f(str, "message");
    }

    @Override // com.vk.push.common.Logger
    public final void info(String str, Throwable th) {
        O90.f(str, "message");
    }

    @Override // com.vk.push.common.Logger
    public final void verbose(String str, Throwable th) {
        O90.f(str, "message");
    }

    @Override // com.vk.push.common.Logger
    public final void warn(String str, Throwable th) {
        O90.f(str, "message");
    }

    @Override // com.vk.push.common.Logger
    public final Logger createLogger(String str) {
        O90.f(str, "tag");
        String str2 = this.a;
        if (str2 != null) {
            str = str2 + ':' + str;
        }
        return new C3738fG(str);
    }
}
