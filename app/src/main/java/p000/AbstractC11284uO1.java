package p000;

import android.app.Activity;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import com.facebook.react.bridge.ReactContext;
import java.io.UnsupportedEncodingException;
import ru.mes.dnevnik.R;

/* renamed from: uO1 */
/* loaded from: classes.dex */
public abstract class AbstractC11284uO1 {
    /* renamed from: a */
    public static byte[] m25183a(String str, String str2, String str3, byte[] bArr, int i, boolean z) throws UnsupportedEncodingException {
        byte[] bArrM4864b = L12.m4864b(str);
        byte[] bArrM4864b2 = L12.m4864b(str2);
        byte[] bArrM4864b3 = L12.m4864b(str3);
        int length = bArrM4864b.length;
        int length2 = bArrM4864b2.length;
        int length3 = bArrM4864b3.length;
        if (length2 < length) {
            length = length2;
        }
        if (length3 >= length) {
            length3 = length;
        }
        if (!(bArr.length >= 16) || !(length3 >= 16)) {
            throw new IllegalArgumentException("key length must be more than 128bit.");
        }
        char[] cArr = new char[length3];
        for (int i2 = 0; i2 < length3; i2++) {
            cArr[i2] = (char) ((bArrM4864b[i2] ^ bArrM4864b2[i2]) ^ bArrM4864b3[i2]);
        }
        if (z) {
            return Build.VERSION.SDK_INT < 26 ? new byte[0] : YJ1.m9255a(cArr, bArr, i * 8, true);
        }
        return YJ1.m9255a(cArr, bArr, i * 8, false);
    }

    /* renamed from: b */
    public static final ViewGroup m25184b(ReactContext reactContext) {
        Window window;
        View decorView;
        View rootView;
        O90.m5968f(reactContext, "<this>");
        Activity currentActivity = reactContext.getCurrentActivity();
        if (currentActivity == null || (window = currentActivity.getWindow()) == null || (decorView = window.getDecorView()) == null || (rootView = decorView.getRootView()) == null) {
            return null;
        }
        return (ViewGroup) rootView.findViewById(R.id.action_bar_root);
    }
}
