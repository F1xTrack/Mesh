package com.huawei.hms.p015rn.push.local;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import com.facebook.react.bridge.Promise;
import com.huawei.hms.p015rn.push.constants.LocalNotification;
import java.util.concurrent.atomic.AtomicInteger;
import p000.AbstractC1174Sf;
import p000.AbstractC4061fZ;
import p000.C10737q70;
import p000.C10865r70;
import p000.C1685am;
import p000.C8940c70;
import p000.EnumC10609p70;
import p000.EnumC11133tD0;
import p000.ML1;

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

    private void download(Context context, Uri uri, AbstractC1174Sf abstractC1174Sf) {
        C10865r70 c10865r70M24160c = C10865r70.m24160c(uri);
        c10865r70M24160c.f41347j = EnumC11133tD0.f42955c;
        c10865r70M24160c.f41339b = EnumC10609p70.FULL_FETCH;
        C10737q70 c10737q70M24161a = c10865r70M24160c.m24161a();
        if (!AbstractC4061fZ.f27230b) {
            AbstractC4061fZ.m18253c(context, null);
        }
        C8940c70 c8940c70 = C8940c70.f17308t;
        ML1.m5337d(c8940c70, "ImagePipelineFactory was not initialized!");
        c8940c70.m10592e().m9486a(c10737q70M24161a, context, null, null, null).m3673l(abstractC1174Sf, C1685am.f15687a);
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
