package defpackage;

import android.app.Notification;

/* renamed from: dw0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3483dw0 extends AbstractC4056gw0 {
    public CharSequence e;

    @Override // defpackage.AbstractC4056gw0
    public final void a(C1155Oo1 c1155Oo1) {
        Notification.BigTextStyle bigTextStyleBigText = new Notification.BigTextStyle((Notification.Builder) c1155Oo1.b).setBigContentTitle((CharSequence) this.c).bigText(this.e);
        if (this.a) {
            bigTextStyleBigText.setSummaryText((CharSequence) this.d);
        }
    }

    @Override // defpackage.AbstractC4056gw0
    public final String d() {
        return "androidx.core.app.NotificationCompat$BigTextStyle";
    }

    public final void l(String str) {
        this.e = C3865fw0.b(str);
    }
}
