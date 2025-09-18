package p000;

import android.widget.ImageView;
import java.io.IOException;
import java.io.InputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;

/* loaded from: classes.dex */
public abstract class RZ1 {
    /* renamed from: a */
    public static HashMap m7036a() {
        C0926Oi c0926OiM24254a = AbstractC10889rJ0.m24254a();
        c0926OiM24254a.m6125k("topChange", AbstractC10889rJ0.m24256c("phasedRegistrationNames", AbstractC10889rJ0.m24257d("bubbled", "onChange", "captured", "onChangeCapture")));
        c0926OiM24254a.m6125k("topSelect", AbstractC10889rJ0.m24256c("phasedRegistrationNames", AbstractC10889rJ0.m24257d("bubbled", "onSelect", "captured", "onSelectCapture")));
        C4049fN c4049fN = EnumC11565wb1.f44986b;
        EnumC11565wb1.f44986b.getClass();
        c0926OiM24254a.m6125k("topTouchStart", AbstractC10889rJ0.m24256c("phasedRegistrationNames", AbstractC10889rJ0.m24257d("bubbled", "onTouchStart", "captured", "onTouchStartCapture")));
        C4049fN c4049fN2 = EnumC11565wb1.f44986b;
        c0926OiM24254a.m6125k("topTouchMove", AbstractC10889rJ0.m24256c("phasedRegistrationNames", AbstractC10889rJ0.m24257d("bubbled", "onTouchMove", "captured", "onTouchMoveCapture")));
        C4049fN c4049fN3 = EnumC11565wb1.f44986b;
        c0926OiM24254a.m6125k("topTouchEnd", AbstractC10889rJ0.m24256c("phasedRegistrationNames", AbstractC10889rJ0.m24257d("bubbled", "onTouchEnd", "captured", "onTouchEndCapture")));
        C4049fN c4049fN4 = EnumC11565wb1.f44986b;
        c0926OiM24254a.m6125k("topTouchCancel", AbstractC10889rJ0.m24256c("phasedRegistrationNames", AbstractC10889rJ0.m24257d("bubbled", "onTouchCancel", "captured", "onTouchCancelCapture")));
        return c0926OiM24254a.m6122h();
    }

    /* renamed from: b */
    public static HashMap m7037b() {
        HashMap map = new HashMap();
        map.put("UIView", AbstractC10889rJ0.m24256c("ContentMode", AbstractC10889rJ0.m24258e("ScaleAspectFit", Integer.valueOf(ImageView.ScaleType.FIT_CENTER.ordinal()), "ScaleAspectFill", Integer.valueOf(ImageView.ScaleType.CENTER_CROP.ordinal()), "ScaleAspectCenter", Integer.valueOf(ImageView.ScaleType.CENTER_INSIDE.ordinal()))));
        C10212m12 c10212m12 = XB0.f13606a;
        map.put("StyleConstants", AbstractC10889rJ0.m24256c("PointerEventsValues", AbstractC10889rJ0.m24255b(LocalNotification.Importance.NONE, 0, "boxNone", 1, "boxOnly", 2, LocalNotification.Importance.UNSPECIFIED, 3)));
        map.put("AccessibilityEventTypes", AbstractC10889rJ0.m24258e("typeWindowStateChanged", 32, "typeViewFocused", 8, "typeViewClicked", 1));
        return map;
    }

    /* renamed from: c */
    public static HashMap m7038c() {
        C0926Oi c0926OiM24254a = AbstractC10889rJ0.m24254a();
        c0926OiM24254a.m6125k("topContentSizeChange", AbstractC10889rJ0.m24256c("registrationName", "onContentSizeChange"));
        c0926OiM24254a.m6125k("topLayout", AbstractC10889rJ0.m24256c("registrationName", "onLayout"));
        c0926OiM24254a.m6125k("topLoadingError", AbstractC10889rJ0.m24256c("registrationName", "onLoadingError"));
        c0926OiM24254a.m6125k("topLoadingFinish", AbstractC10889rJ0.m24256c("registrationName", "onLoadingFinish"));
        c0926OiM24254a.m6125k("topLoadingStart", AbstractC10889rJ0.m24256c("registrationName", "onLoadingStart"));
        c0926OiM24254a.m6125k("topSelectionChange", AbstractC10889rJ0.m24256c("registrationName", "onSelectionChange"));
        c0926OiM24254a.m6125k("topMessage", AbstractC10889rJ0.m24256c("registrationName", "onMessage"));
        c0926OiM24254a.m6125k("topScrollBeginDrag", AbstractC10889rJ0.m24256c("registrationName", "onScrollBeginDrag"));
        c0926OiM24254a.m6125k("topScrollEndDrag", AbstractC10889rJ0.m24256c("registrationName", "onScrollEndDrag"));
        c0926OiM24254a.m6125k("topScroll", AbstractC10889rJ0.m24256c("registrationName", "onScroll"));
        c0926OiM24254a.m6125k("topMomentumScrollBegin", AbstractC10889rJ0.m24256c("registrationName", "onMomentumScrollBegin"));
        c0926OiM24254a.m6125k("topMomentumScrollEnd", AbstractC10889rJ0.m24256c("registrationName", "onMomentumScrollEnd"));
        return c0926OiM24254a.m6122h();
    }

    /* renamed from: d */
    public static byte[] m7039d(InputStream inputStream) throws NoSuchAlgorithmException, IOException {
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
