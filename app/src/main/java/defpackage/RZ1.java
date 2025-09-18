package defpackage;

import android.widget.ImageView;
import com.huawei.hms.rn.push.constants.LocalNotification;
import java.io.IOException;
import java.io.InputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;

/* loaded from: classes.dex */
public abstract class RZ1 {
    public static HashMap a() {
        C1135Oi c1135OiA = AbstractC6815rJ0.a();
        c1135OiA.k("topChange", AbstractC6815rJ0.c("phasedRegistrationNames", AbstractC6815rJ0.d("bubbled", "onChange", "captured", "onChangeCapture")));
        c1135OiA.k("topSelect", AbstractC6815rJ0.c("phasedRegistrationNames", AbstractC6815rJ0.d("bubbled", "onSelect", "captured", "onSelectCapture")));
        C3759fN c3759fN = EnumC7824wb1.b;
        EnumC7824wb1.b.getClass();
        c1135OiA.k("topTouchStart", AbstractC6815rJ0.c("phasedRegistrationNames", AbstractC6815rJ0.d("bubbled", "onTouchStart", "captured", "onTouchStartCapture")));
        C3759fN c3759fN2 = EnumC7824wb1.b;
        c1135OiA.k("topTouchMove", AbstractC6815rJ0.c("phasedRegistrationNames", AbstractC6815rJ0.d("bubbled", "onTouchMove", "captured", "onTouchMoveCapture")));
        C3759fN c3759fN3 = EnumC7824wb1.b;
        c1135OiA.k("topTouchEnd", AbstractC6815rJ0.c("phasedRegistrationNames", AbstractC6815rJ0.d("bubbled", "onTouchEnd", "captured", "onTouchEndCapture")));
        C3759fN c3759fN4 = EnumC7824wb1.b;
        c1135OiA.k("topTouchCancel", AbstractC6815rJ0.c("phasedRegistrationNames", AbstractC6815rJ0.d("bubbled", "onTouchCancel", "captured", "onTouchCancelCapture")));
        return c1135OiA.h();
    }

    public static HashMap b() {
        HashMap map = new HashMap();
        map.put("UIView", AbstractC6815rJ0.c("ContentMode", AbstractC6815rJ0.e("ScaleAspectFit", Integer.valueOf(ImageView.ScaleType.FIT_CENTER.ordinal()), "ScaleAspectFill", Integer.valueOf(ImageView.ScaleType.CENTER_CROP.ordinal()), "ScaleAspectCenter", Integer.valueOf(ImageView.ScaleType.CENTER_INSIDE.ordinal()))));
        C5806m12 c5806m12 = XB0.a;
        map.put("StyleConstants", AbstractC6815rJ0.c("PointerEventsValues", AbstractC6815rJ0.b(LocalNotification.Importance.NONE, 0, "boxNone", 1, "boxOnly", 2, LocalNotification.Importance.UNSPECIFIED, 3)));
        map.put("AccessibilityEventTypes", AbstractC6815rJ0.e("typeWindowStateChanged", 32, "typeViewFocused", 8, "typeViewClicked", 1));
        return map;
    }

    public static HashMap c() {
        C1135Oi c1135OiA = AbstractC6815rJ0.a();
        c1135OiA.k("topContentSizeChange", AbstractC6815rJ0.c("registrationName", "onContentSizeChange"));
        c1135OiA.k("topLayout", AbstractC6815rJ0.c("registrationName", "onLayout"));
        c1135OiA.k("topLoadingError", AbstractC6815rJ0.c("registrationName", "onLoadingError"));
        c1135OiA.k("topLoadingFinish", AbstractC6815rJ0.c("registrationName", "onLoadingFinish"));
        c1135OiA.k("topLoadingStart", AbstractC6815rJ0.c("registrationName", "onLoadingStart"));
        c1135OiA.k("topSelectionChange", AbstractC6815rJ0.c("registrationName", "onSelectionChange"));
        c1135OiA.k("topMessage", AbstractC6815rJ0.c("registrationName", "onMessage"));
        c1135OiA.k("topScrollBeginDrag", AbstractC6815rJ0.c("registrationName", "onScrollBeginDrag"));
        c1135OiA.k("topScrollEndDrag", AbstractC6815rJ0.c("registrationName", "onScrollEndDrag"));
        c1135OiA.k("topScroll", AbstractC6815rJ0.c("registrationName", "onScroll"));
        c1135OiA.k("topMomentumScrollBegin", AbstractC6815rJ0.c("registrationName", "onMomentumScrollBegin"));
        c1135OiA.k("topMomentumScrollEnd", AbstractC6815rJ0.c("registrationName", "onMomentumScrollEnd"));
        return c1135OiA.h();
    }

    public static byte[] d(InputStream inputStream) throws NoSuchAlgorithmException, IOException {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            byte[] bArr = new byte[1024];
            int i = inputStream.read(bArr, 0, 1024);
            while (i > -1) {
                messageDigest.update(bArr, 0, i);
                i = inputStream.read(bArr, 0, 1024);
            }
            return messageDigest.digest();
        } catch (NoSuchAlgorithmException e) {
            throw new IllegalArgumentException(e);
        }
    }
}
