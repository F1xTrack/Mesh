package defpackage;

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
public abstract class AbstractC7404uO1 {
    public static byte[] a(String str, String str2, String str3, byte[] bArr, int i, boolean z) throws UnsupportedEncodingException {
        byte[] bArrB = L12.b(str);
        byte[] bArrB2 = L12.b(str2);
        byte[] bArrB3 = L12.b(str3);
        int length = bArrB.length;
        int length2 = bArrB2.length;
        int length3 = bArrB3.length;
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
            cArr[i2] = (char) ((bArrB[i2] ^ bArrB2[i2]) ^ bArrB3[i2]);
        }
        if (z) {
            return Build.VERSION.SDK_INT < 26 ? new byte[0] : YJ1.a(cArr, bArr, i * 8, true);
        }
        return YJ1.a(cArr, bArr, i * 8, false);
    }

    public static final ViewGroup b(ReactContext reactContext) {
        Window window;
        View decorView;
        View rootView;
        O90.f(reactContext, "<this>");
        Activity currentActivity = reactContext.getCurrentActivity();
        if (currentActivity == null || (window = currentActivity.getWindow()) == null || (decorView = window.getDecorView()) == null || (rootView = decorView.getRootView()) == null) {
            return null;
        }
        return (ViewGroup) rootView.findViewById(R.id.action_bar_root);
    }
}
