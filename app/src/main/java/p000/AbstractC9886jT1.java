package p000;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.widget.Button;
import androidx.fragment.app.AbstractActivityC1730l;
import androidx.fragment.app.DialogInterfaceOnCancelListenerC1725g;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReadableMap;
import com.huawei.hms.p015rn.push.constants.LocalNotification;
import com.yandex.varioqub.config.model.ConfigValue;
import java.util.Calendar;
import java.util.SimpleTimeZone;
import java.util.TimeZone;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: jT1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC9886jT1 {
    /* renamed from: a */
    public static Bundle m22035a(ReadableMap readableMap) {
        Bundle bundleM22036b = m22036b(readableMap);
        if (readableMap.hasKey("minimumDate") && !readableMap.isNull("minimumDate")) {
            bundleM22036b.putLong("minimumDate", (long) readableMap.getDouble("minimumDate"));
        }
        if (readableMap.hasKey("maximumDate") && !readableMap.isNull("maximumDate")) {
            bundleM22036b.putLong("maximumDate", (long) readableMap.getDouble("maximumDate"));
        }
        if (readableMap.hasKey("display") && !readableMap.isNull("display")) {
            bundleM22036b.putString("display", readableMap.getString("display"));
        }
        if (readableMap.hasKey("dialogButtons") && !readableMap.isNull("dialogButtons")) {
            bundleM22036b.putBundle("dialogButtons", Arguments.toBundle(readableMap.getMap("dialogButtons")));
        }
        if (readableMap.hasKey("timeZoneOffsetInMinutes") && !readableMap.isNull("timeZoneOffsetInMinutes")) {
            bundleM22036b.putLong("timeZoneOffsetInMinutes", (long) readableMap.getDouble("timeZoneOffsetInMinutes"));
        }
        if (readableMap.hasKey("testID") && !readableMap.isNull("testID")) {
            bundleM22036b.putString("testID", readableMap.getString("testID"));
        }
        if (readableMap.hasKey("fullscreen") && !readableMap.isNull("fullscreen")) {
            bundleM22036b.putBoolean("fullscreen", readableMap.getBoolean("fullscreen"));
        }
        if (readableMap.hasKey("firstDayOfWeek") && !readableMap.isNull("firstDayOfWeek")) {
            bundleM22036b.putInt("firstDayOfWeek", readableMap.getInt("firstDayOfWeek") + 1);
        }
        return bundleM22036b;
    }

    /* renamed from: b */
    public static Bundle m22036b(ReadableMap readableMap) {
        Bundle bundle = new Bundle();
        if (readableMap.hasKey("value") && !readableMap.isNull("value")) {
            bundle.putLong("value", (long) readableMap.getDouble("value"));
        }
        if (readableMap.hasKey("timeZoneName") && !readableMap.isNull("timeZoneName")) {
            bundle.putString("timeZoneName", readableMap.getString("timeZoneName"));
        }
        if (readableMap.hasKey("title") && !readableMap.isNull("title")) {
            bundle.putString("title", readableMap.getString("title"));
        }
        if (readableMap.hasKey("initialInputMode") && !readableMap.isNull("initialInputMode")) {
            bundle.putString("initialInputMode", readableMap.getString("initialInputMode"));
        }
        return bundle;
    }

    /* renamed from: c */
    public static Bundle m22037c(ReadableMap readableMap) {
        Bundle bundleM22036b = m22036b(readableMap);
        if (readableMap.hasKey("is24Hour") && !readableMap.isNull("is24Hour")) {
            bundleM22036b.putBoolean("is24Hour", readableMap.getBoolean("is24Hour"));
        }
        if (readableMap.hasKey("display") && !readableMap.isNull("display")) {
            bundleM22036b.putString("display", readableMap.getString("display"));
        }
        if (readableMap.hasKey("dialogButtons") && !readableMap.isNull("dialogButtons")) {
            bundleM22036b.putBundle("dialogButtons", Arguments.toBundle(readableMap.getMap("dialogButtons")));
        }
        if (readableMap.hasKey("minuteInterval") && !readableMap.isNull("minuteInterval")) {
            bundleM22036b.putInt("minuteInterval", readableMap.getInt("minuteInterval"));
        }
        if (readableMap.hasKey("timeZoneOffsetInMinutes") && !readableMap.isNull("timeZoneOffsetInMinutes")) {
            bundleM22036b.putLong("timeZoneOffsetInMinutes", (long) readableMap.getDouble("timeZoneOffsetInMinutes"));
        }
        return bundleM22036b;
    }

    /* renamed from: d */
    public static void m22038d(AbstractActivityC1730l abstractActivityC1730l, String str, Promise promise) {
        if (abstractActivityC1730l == null) {
            promise.reject("E_NO_ACTIVITY", "Tried to close a " + str + " dialog while not attached to an Activity");
            return;
        }
        try {
            DialogInterfaceOnCancelListenerC1725g dialogInterfaceOnCancelListenerC1725g = (DialogInterfaceOnCancelListenerC1725g) abstractActivityC1730l.m10034e().m10039B(str);
            boolean z = dialogInterfaceOnCancelListenerC1725g != null;
            if (z) {
                dialogInterfaceOnCancelListenerC1725g.dismiss();
            }
            promise.resolve(Boolean.valueOf(z));
        } catch (Exception e) {
            promise.reject(e);
        }
    }

    /* renamed from: e */
    public static TimeZone m22039e(Bundle bundle) {
        if (bundle != null && bundle.containsKey("timeZoneOffsetInMinutes")) {
            return new SimpleTimeZone(((int) bundle.getLong("timeZoneOffsetInMinutes")) * LocalNotification.Repeat.Time.ONE_MINUTE, "GMT");
        }
        if (bundle != null && bundle.containsKey("timeZoneName")) {
            String string = bundle.getString("timeZoneName");
            if ("GMT".equals(string)) {
                return TimeZone.getTimeZone("GMT");
            }
            if (!"GMT".equals(TimeZone.getTimeZone(string).getID())) {
                return TimeZone.getTimeZone(string);
            }
            StringBuilder sbM26240q = AbstractC7222ym.m26240q("'", string, "' does not exist in TimeZone.getAvailableIDs(). Falling back to TimeZone.getDefault()=");
            sbM26240q.append(TimeZone.getDefault().getID());
            O90.m5968f(sbM26240q.toString(), "message");
            AbstractC3929dS.m17683p("ReactNative");
        }
        return TimeZone.getDefault();
    }

    /* renamed from: f */
    public static String m22040f(String str, Object... objArr) {
        int iIndexOf;
        String string;
        int i = 0;
        for (int i2 = 0; i2 < objArr.length; i2++) {
            Object obj = objArr[i2];
            if (obj == null) {
                string = "null";
            } else {
                try {
                    string = obj.toString();
                } catch (Exception e) {
                    String str2 = obj.getClass().getName() + '@' + Integer.toHexString(System.identityHashCode(obj));
                    Logger.getLogger("com.google.common.base.Strings").log(Level.WARNING, "Exception during lenientFormat for " + str2, (Throwable) e);
                    StringBuilder sbM26240q = AbstractC7222ym.m26240q("<", str2, " threw ");
                    sbM26240q.append(e.getClass().getName());
                    sbM26240q.append(">");
                    string = sbM26240q.toString();
                }
            }
            objArr[i2] = string;
        }
        StringBuilder sb = new StringBuilder((objArr.length * 16) + str.length());
        int i3 = 0;
        while (i < objArr.length && (iIndexOf = str.indexOf("%s", i3)) != -1) {
            sb.append((CharSequence) str, i3, iIndexOf);
            sb.append(objArr[i]);
            i3 = iIndexOf + 2;
            i++;
        }
        sb.append((CharSequence) str, i3, str.length());
        if (i < objArr.length) {
            sb.append(" [");
            sb.append(objArr[i]);
            for (int i4 = i + 1; i4 < objArr.length; i4++) {
                sb.append(", ");
                sb.append(objArr[i4]);
            }
            sb.append(']');
        }
        return sb.toString();
    }

    /* renamed from: g */
    public static long m22041g(Bundle bundle) {
        if (!bundle.containsKey("maximumDate")) {
            return Long.MAX_VALUE;
        }
        Calendar calendar = Calendar.getInstance(m22039e(bundle));
        calendar.setTimeInMillis(bundle.getLong("maximumDate"));
        calendar.set(11, 23);
        calendar.set(12, 59);
        calendar.set(13, 59);
        calendar.set(14, 999);
        return calendar.getTimeInMillis();
    }

    /* renamed from: h */
    public static long m22042h(Bundle bundle) {
        if (!bundle.containsKey("minimumDate")) {
            return 0L;
        }
        Calendar calendar = Calendar.getInstance(m22039e(bundle));
        calendar.setTimeInMillis(bundle.getLong("minimumDate"));
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        return calendar.getTimeInMillis();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: i */
    public static void m22043i(Bundle bundle, AlertDialog alertDialog, DialogInterface.OnClickListener onClickListener) {
        Bundle bundle2 = bundle.getBundle("dialogButtons");
        if (bundle2 == null) {
            return;
        }
        Bundle bundle3 = bundle2.getBundle("neutral");
        if (bundle3 != null && bundle3.getString("label") != null) {
            alertDialog.setButton(-3, bundle3.getString("label"), onClickListener);
        }
        Bundle bundle4 = bundle2.getBundle("positive");
        DialogInterface.OnClickListener onClickListener2 = (DialogInterface.OnClickListener) alertDialog;
        if (bundle4 != null && bundle4.getString("label") != null) {
            alertDialog.setButton(-1, bundle4.getString("label"), onClickListener2);
        }
        Bundle bundle5 = bundle2.getBundle("negative");
        if (bundle5 == null || bundle5.getString("label") == null) {
            return;
        }
        alertDialog.setButton(-2, bundle5.getString("label"), onClickListener2);
    }

    /* renamed from: j */
    public static void m22044j(Button button, String str, Bundle bundle, boolean z, int i) {
        Bundle bundle2;
        int i2;
        if (button == null) {
            return;
        }
        Bundle bundle3 = bundle.getBundle("dialogButtons");
        Integer numValueOf = null;
        if (bundle3 != null && (bundle2 = bundle3.getBundle(str)) != null && (i2 = (int) bundle2.getDouble("textColor", ConfigValue.DOUBLE_DEFAULT_VALUE)) != 0) {
            numValueOf = Integer.valueOf(i2);
        }
        if (z || numValueOf != null) {
            if (numValueOf != null) {
                i = numValueOf.intValue();
            }
            button.setTextColor(i);
        }
    }
}
