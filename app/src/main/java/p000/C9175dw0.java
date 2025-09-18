package p000;

import android.app.Notification;

/* renamed from: dw0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9175dw0 extends AbstractC9559gw0 {

    /* renamed from: e */
    public CharSequence f26395e;

    @Override // p000.AbstractC9559gw0
    /* renamed from: a */
    public final void mo17436a(C8071Oo1 c8071Oo1) {
        Notification.BigTextStyle bigTextStyleBigText = new Notification.BigTextStyle((Notification.Builder) c8071Oo1.f8628b).setBigContentTitle((CharSequence) this.f28106c).bigText(this.f26395e);
        if (this.f28104a) {
            bigTextStyleBigText.setSummaryText((CharSequence) this.f28107d);
        }
    }

    @Override // p000.AbstractC9559gw0
    /* renamed from: d */
    public final String mo17437d() {
        return "androidx.core.app.NotificationCompat$BigTextStyle";
    }

    /* renamed from: l */
    public final void m17778l(String str) {
        this.f26395e = C9431fw0.m18310b(str);
    }
}
