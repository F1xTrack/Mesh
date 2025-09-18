package p000;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import android.view.MotionEvent;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* loaded from: classes.dex */
public abstract class E12 {
    /* renamed from: a */
    public static String m1983a(Context context, String str, String str2, String str3) {
        int identifier;
        try {
            String str4 = str2 + AbstractC8803b30.m10419b(MessageDigest.getInstance("SHA-256").digest(str3.getBytes("utf-8")));
            if (TextUtils.isEmpty(str4) || (identifier = context.getResources().getIdentifier(str4, "string", str)) == 0) {
                return null;
            }
            try {
                return context.getResources().getString(identifier);
            } catch (Resources.NotFoundException unused) {
                return null;
            }
        } catch (UnsupportedEncodingException | NoSuchAlgorithmException e) {
            e.getMessage();
            return null;
        }
    }

    /* renamed from: b */
    public static float m1984b(MotionEvent motionEvent, boolean z) {
        O90.m5968f(motionEvent, "event");
        int actionIndex = motionEvent.getActionMasked() == 6 ? motionEvent.getActionIndex() : -1;
        if (!z) {
            int pointerCount = motionEvent.getPointerCount();
            int i = pointerCount - 1;
            if (i == actionIndex) {
                i = pointerCount - 2;
            }
            return motionEvent.getX(i);
        }
        int pointerCount2 = motionEvent.getPointerCount();
        float x = 0.0f;
        int i2 = 0;
        for (int i3 = 0; i3 < pointerCount2; i3++) {
            if (i3 != actionIndex) {
                i2++;
                x = motionEvent.getX(i3) + x;
            }
        }
        return x / i2;
    }

    /* renamed from: c */
    public static float m1985c(MotionEvent motionEvent, boolean z) {
        O90.m5968f(motionEvent, "event");
        int actionIndex = motionEvent.getActionMasked() == 6 ? motionEvent.getActionIndex() : -1;
        if (!z) {
            int pointerCount = motionEvent.getPointerCount();
            int i = pointerCount - 1;
            if (i == actionIndex) {
                i = pointerCount - 2;
            }
            return motionEvent.getY(i);
        }
        int pointerCount2 = motionEvent.getPointerCount();
        float y = 0.0f;
        int i2 = 0;
        for (int i3 = 0; i3 < pointerCount2; i3++) {
            if (i3 != actionIndex) {
                i2++;
                y = motionEvent.getY(i3) + y;
            }
        }
        return y / i2;
    }
}
