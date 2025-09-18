package com.huawei.hms.p015rn.push.local;

import android.graphics.Bitmap;
import com.huawei.hms.p015rn.push.constants.LocalNotification;
import p000.AbstractC1174Sf;
import p000.InterfaceC1523YC;

/* loaded from: classes.dex */
public class BitmapDataSubscriber extends AbstractC1174Sf {
    LocalNotification.Bitmap bitmapType;
    HmsLocalNotificationPicturesLoader hmsLocalNotificationPicturesLoader;

    public BitmapDataSubscriber(HmsLocalNotificationPicturesLoader hmsLocalNotificationPicturesLoader, LocalNotification.Bitmap bitmap) {
        this.hmsLocalNotificationPicturesLoader = hmsLocalNotificationPicturesLoader;
        this.bitmapType = bitmap;
    }

    @Override // p000.AbstractC1489Xf
    public void onFailureImpl(InterfaceC1523YC interfaceC1523YC) {
        if (this.bitmapType.equals(LocalNotification.Bitmap.LARGE_ICON)) {
            this.hmsLocalNotificationPicturesLoader.setLargeIcon(null);
        } else {
            this.hmsLocalNotificationPicturesLoader.setBigPicture(null);
        }
    }

    @Override // p000.AbstractC1174Sf
    public void onNewResultImpl(Bitmap bitmap) {
        if (this.bitmapType.equals(LocalNotification.Bitmap.LARGE_ICON)) {
            this.hmsLocalNotificationPicturesLoader.setLargeIcon(bitmap);
        } else {
            this.hmsLocalNotificationPicturesLoader.setBigPicture(bitmap);
        }
    }
}
