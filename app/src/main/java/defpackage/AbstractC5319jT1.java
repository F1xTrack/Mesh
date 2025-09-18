package defpackage;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.widget.Button;
import androidx.fragment.app.g;
import androidx.fragment.app.l;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReadableMap;
import com.yandex.varioqub.config.model.ConfigValue;
import java.util.Calendar;
import java.util.SimpleTimeZone;
import java.util.TimeZone;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: jT1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC5319jT1 {
    public static Bundle a(ReadableMap readableMap) {
        Bundle bundleB = b(readableMap);
        if (readableMap.hasKey("minimumDate") && !readableMap.isNull("minimumDate")) {
            bundleB.putLong("minimumDate", (long) readableMap.getDouble("minimumDate"));
        }
        if (readableMap.hasKey("maximumDate") && !readableMap.isNull("maximumDate")) {
            bundleB.putLong("maximumDate", (long) readableMap.getDouble("maximumDate"));
        }
        if (readableMap.hasKey("display") && !readableMap.isNull("display")) {
            bundleB.putString("display", readableMap.getString("display"));
        }
        if (readableMap.hasKey("dialogButtons") && !readableMap.isNull("dialogButtons")) {
            bundleB.putBundle("dialogButtons", Arguments.toBundle(readableMap.getMap("dialogButtons")));
        }
        if (readableMap.hasKey("timeZoneOffsetInMinutes") && !readableMap.isNull("timeZoneOffsetInMinutes")) {
            bundleB.putLong("timeZoneOffsetInMinutes", (long) readableMap.getDouble("timeZoneOffsetInMinutes"));
        }
        if (readableMap.hasKey("testID") && !readableMap.isNull("testID")) {
            bundleB.putString("testID", readableMap.getString("testID"));
        }
        if (readableMap.hasKey("fullscreen") && !readableMap.isNull("fullscreen")) {
            bundleB.putBoolean("fullscreen", readableMap.getBoolean("fullscreen"));
        }
        if (readableMap.hasKey("firstDayOfWeek") && !readableMap.isNull("firstDayOfWeek")) {
            bundleB.putInt("firstDayOfWeek", readableMap.getInt("firstDayOfWeek") + 1);
        }
        return bundleB;
    }

    public static Bundle b(ReadableMap readableMap) {
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

    public static Bundle c(ReadableMap readableMap) {
        Bundle bundleB = b(readableMap);
        if (readableMap.hasKey("is24Hour") && !readableMap.isNull("is24Hour")) {
            bundleB.putBoolean("is24Hour", readableMap.getBoolean("is24Hour"));
        }
        if (readableMap.hasKey("display") && !readableMap.isNull("display")) {
            bundleB.putString("display", readableMap.getString("display"));
        }
        if (readableMap.hasKey("dialogButtons") && !readableMap.isNull("dialogButtons")) {
            bundleB.putBundle("dialogButtons", Arguments.toBundle(readableMap.getMap("dialogButtons")));
        }
        if (readableMap.hasKey("minuteInterval") && !readableMap.isNull("minuteInterval")) {
            bundleB.putInt("minuteInterval", readableMap.getInt("minuteInterval"));
        }
        if (readableMap.hasKey("timeZoneOffsetInMinutes") && !readableMap.isNull("timeZoneOffsetInMinutes")) {
            bundleB.putLong("timeZoneOffsetInMinutes", (long) readableMap.getDouble("timeZoneOffsetInMinutes"));
        }
        return bundleB;
    }

    public static void d(l lVar, String str, Promise promise) {
        if (lVar == null) {
            promise.reject("E_NO_ACTIVITY", "Tried to close a " + str + " dialog while not attached to an Activity");
            return;
        }
        try {
            g gVar = (g) lVar.e().B(str);
            boolean z = gVar != null;
            if (z) {
                gVar.dismiss();
            }
            promise.resolve(Boolean.valueOf(z));
        } catch (Exception e) {
            promise.reject(e);
        }
    }

    public static TimeZone e(Bundle bundle) {
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
            StringBuilder sbQ = AbstractC8235ym.q("'", string, "' does not exist in TimeZone.getAvailableIDs(). Falling back to TimeZone.getDefault()=");
            sbQ.append(TimeZone.getDefault().getID());
            O90.f(sbQ.toString(), "message");
            AbstractC3393dS.p("ReactNative");
        }
        return TimeZone.getDefault();
    }

    public static String f(String str, Object... objArr) {
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
                    StringBuilder sbQ = AbstractC8235ym.q("<", str2, " threw ");
                    sbQ.append(e.getClass().getName());
                    sbQ.append(">");
                    string = sbQ.toString();
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

    public static long g(Bundle bundle) {
        if (!bundle.containsKey("maximumDate")) {
            return Long.MAX_VALUE;
        }
        Calendar calendar = Calendar.getInstance(e(bundle));
        calendar.setTimeInMillis(bundle.getLong("maximumDate"));
        calendar.set(11, 23);
        calendar.set(12, 59);
        calendar.set(13, 59);
        calendar.set(14, 999);
        return calendar.getTimeInMillis();
    }

    public static long h(Bundle bundle) {
        if (!bundle.containsKey("minimumDate")) {
            return 0L;
        }
        Calendar calendar = Calendar.getInstance(e(bundle));
        calendar.setTimeInMillis(bundle.getLong("minimumDate"));
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        return calendar.getTimeInMillis();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void i(Bundle bundle, AlertDialog alertDialog, DialogInterface.OnClickListener onClickListener) {
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

    public static void j(Button button, String str, Bundle bundle, boolean z, int i) {
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
