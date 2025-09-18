package p000;

import android.app.Notification;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Build;
import androidx.core.graphics.drawable.IconCompat;

/* renamed from: cw0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9047cw0 extends AbstractC9559gw0 {

    /* renamed from: e */
    public IconCompat f25724e;

    /* renamed from: f */
    public IconCompat f25725f;

    /* renamed from: g */
    public boolean f25726g;

    @Override // p000.AbstractC9559gw0
    /* renamed from: a */
    public final void mo17436a(C8071Oo1 c8071Oo1) {
        Bitmap bitmapM9977a;
        Notification.BigPictureStyle bigContentTitle = new Notification.BigPictureStyle((Notification.Builder) c8071Oo1.f8628b).setBigContentTitle((CharSequence) this.f28106c);
        IconCompat iconCompat = this.f25724e;
        Context context = (Context) c8071Oo1.f8627a;
        if (iconCompat != null) {
            if (Build.VERSION.SDK_INT >= 31) {
                AbstractC8914bw0.m10543a(bigContentTitle, K50.m4556c(iconCompat, context));
            } else if (iconCompat.m9980d() == 1) {
                IconCompat iconCompat2 = this.f25724e;
                int i = iconCompat2.f16097a;
                if (i == -1) {
                    Object obj = iconCompat2.f16098b;
                    bitmapM9977a = obj instanceof Bitmap ? (Bitmap) obj : null;
                } else if (i == 1) {
                    bitmapM9977a = (Bitmap) iconCompat2.f16098b;
                } else {
                    if (i != 5) {
                        throw new IllegalStateException("called getBitmap() on " + iconCompat2);
                    }
                    bitmapM9977a = IconCompat.m9977a((Bitmap) iconCompat2.f16098b, true);
                }
                bigContentTitle = bigContentTitle.bigPicture(bitmapM9977a);
            }
        }
        if (this.f25726g) {
            IconCompat iconCompat3 = this.f25725f;
            if (iconCompat3 == null) {
                bigContentTitle.bigLargeIcon((Bitmap) null);
            } else {
                AbstractC8786aw0.m10396a(bigContentTitle, K50.m4556c(iconCompat3, context));
            }
        }
        if (this.f28104a) {
            bigContentTitle.setSummaryText((CharSequence) this.f28107d);
        }
        if (Build.VERSION.SDK_INT >= 31) {
            AbstractC8914bw0.m10545c(bigContentTitle, false);
            AbstractC8914bw0.m10544b(bigContentTitle, null);
        }
    }

    @Override // p000.AbstractC9559gw0
    /* renamed from: d */
    public final String mo17437d() {
        return "androidx.core.app.NotificationCompat$BigPictureStyle";
    }

    /* renamed from: l */
    public final void m17438l(String str) {
        this.f28106c = C9431fw0.m18310b(str);
    }
}
