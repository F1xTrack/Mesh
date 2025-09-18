package com.huawei.hms.rn.push.local;

import android.graphics.Bitmap;
import com.huawei.hms.rn.push.constants.LocalNotification;
import defpackage.AbstractC1438Sf;
import defpackage.YC;

/* loaded from: classes.dex */
public class BitmapDataSubscriber extends AbstractC1438Sf {
    LocalNotification.Bitmap bitmapType;
    HmsLocalNotificationPicturesLoader hmsLocalNotificationPicturesLoader;

    public BitmapDataSubscriber(HmsLocalNotificationPicturesLoader hmsLocalNotificationPicturesLoader, LocalNotification.Bitmap bitmap) {
        this.hmsLocalNotificationPicturesLoader = hmsLocalNotificationPicturesLoader;
        this.bitmapType = bitmap;
    }

    @Override // defpackage.AbstractC1828Xf
    public void onFailureImpl(YC yc) {
        if (this.bitmapType.equals(LocalNotification.Bitmap.LARGE_ICON)) {
            this.hmsLocalNotificationPicturesLoader.setLargeIcon(null);
        } else {
            this.hmsLocalNotificationPicturesLoader.setBigPicture(null);
        }
    }

    @Override // defpackage.AbstractC1438Sf
    public void onNewResultImpl(Bitmap bitmap) {
        if (this.bitmapType.equals(LocalNotification.Bitmap.LARGE_ICON)) {
            this.hmsLocalNotificationPicturesLoader.setLargeIcon(bitmap);
        } else {
            this.hmsLocalNotificationPicturesLoader.setBigPicture(bitmap);
        }
    }
}
