package com.huawei.hms.rn.push.local;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import com.facebook.react.bridge.Promise;
import com.huawei.hms.rn.push.constants.LocalNotification;
import defpackage.AbstractC1438Sf;
import defpackage.AbstractC3795fZ;
import defpackage.C2196am;
import defpackage.C2455c70;
import defpackage.C6589q70;
import defpackage.C6779r70;
import defpackage.EnumC6398p70;
import defpackage.EnumC7179tD0;
import defpackage.ML1;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public class HmsLocalNotificationPicturesLoader {
    private Bitmap bigPictureImage;
    private Callback callback;
    private volatile AtomicInteger count = new AtomicInteger(0);
    private Bitmap largeIconImage;
    private Promise reactPromise;

    public interface Callback {
        void call(Bitmap bitmap, Bitmap bitmap2, Promise promise);
    }

    public HmsLocalNotificationPicturesLoader(Callback callback) {
        this.callback = callback;
    }

    private void checkAllFinished() {
        Callback callback;
        if (this.count.incrementAndGet() < 3 || (callback = this.callback) == null) {
            return;
        }
        callback.call(this.largeIconImage, this.bigPictureImage, this.reactPromise);
    }

    private void download(Context context, Uri uri, AbstractC1438Sf abstractC1438Sf) {
        C6779r70 c6779r70C = C6779r70.c(uri);
        c6779r70C.j = EnumC7179tD0.c;
        c6779r70C.b = EnumC6398p70.FULL_FETCH;
        C6589q70 c6589q70A = c6779r70C.a();
        if (!AbstractC3795fZ.b) {
            AbstractC3795fZ.c(context, null);
        }
        C2455c70 c2455c70 = C2455c70.t;
        ML1.d(c2455c70, "ImagePipelineFactory was not initialized!");
        c2455c70.e().a(c6589q70A, context, null, null, null).l(abstractC1438Sf, C2196am.a);
    }

    public void setBigPicture(Bitmap bitmap) {
        this.bigPictureImage = bitmap;
        checkAllFinished();
    }

    public void setBigPictureUrl(Context context, String str) {
        if (str == null) {
            setBigPicture(null);
            return;
        }
        try {
            download(context, Uri.parse(str), new BitmapDataSubscriber(this, LocalNotification.Bitmap.BIG_PICTURE));
        } catch (Exception unused) {
            setBigPicture(null);
        }
    }

    public void setLargeIcon(Bitmap bitmap) {
        this.largeIconImage = bitmap;
        checkAllFinished();
    }

    public void setLargeIconUrl(Context context, String str) {
        if (str == null) {
            setLargeIcon(null);
            return;
        }
        try {
            download(context, Uri.parse(str), new BitmapDataSubscriber(this, LocalNotification.Bitmap.LARGE_ICON));
        } catch (Exception unused) {
            setLargeIcon(null);
        }
    }

    public void setReactPromise(Promise promise) {
        this.reactPromise = promise;
        checkAllFinished();
    }
}
