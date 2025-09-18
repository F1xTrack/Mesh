package defpackage;

import android.app.Notification;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Build;
import androidx.core.graphics.drawable.IconCompat;

/* renamed from: cw0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3293cw0 extends AbstractC4056gw0 {
    public IconCompat e;
    public IconCompat f;
    public boolean g;

    @Override // defpackage.AbstractC4056gw0
    public final void a(C1155Oo1 c1155Oo1) {
        Bitmap bitmapA;
        Notification.BigPictureStyle bigContentTitle = new Notification.BigPictureStyle((Notification.Builder) c1155Oo1.b).setBigContentTitle((CharSequence) this.c);
        IconCompat iconCompat = this.e;
        Context context = (Context) c1155Oo1.a;
        if (iconCompat != null) {
            if (Build.VERSION.SDK_INT >= 31) {
                AbstractC2418bw0.a(bigContentTitle, K50.c(iconCompat, context));
            } else if (iconCompat.d() == 1) {
                IconCompat iconCompat2 = this.e;
                int i = iconCompat2.a;
                if (i == -1) {
                    Object obj = iconCompat2.b;
                    bitmapA = obj instanceof Bitmap ? (Bitmap) obj : null;
                } else if (i == 1) {
                    bitmapA = (Bitmap) iconCompat2.b;
                } else {
                    if (i != 5) {
                        throw new IllegalStateException("called getBitmap() on " + iconCompat2);
                    }
                    bitmapA = IconCompat.a((Bitmap) iconCompat2.b, true);
                }
                bigContentTitle = bigContentTitle.bigPicture(bitmapA);
            }
        }
        if (this.g) {
            IconCompat iconCompat3 = this.f;
            if (iconCompat3 == null) {
                bigContentTitle.bigLargeIcon((Bitmap) null);
            } else {
                AbstractC2227aw0.a(bigContentTitle, K50.c(iconCompat3, context));
            }
        }
        if (this.a) {
            bigContentTitle.setSummaryText((CharSequence) this.d);
        }
        if (Build.VERSION.SDK_INT >= 31) {
            AbstractC2418bw0.c(bigContentTitle, false);
            AbstractC2418bw0.b(bigContentTitle, null);
        }
    }

    @Override // defpackage.AbstractC4056gw0
    public final String d() {
        return "androidx.core.app.NotificationCompat$BigPictureStyle";
    }

    public final void l(String str) {
        this.c = C3865fw0.b(str);
    }
}
