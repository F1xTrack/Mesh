package ru.p031ok.tracer.base.datetime;

import android.os.Build;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import kotlin.Metadata;
import p000.O90;

@Metadata(m22266d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003¨\u0006\u0004"}, m22267d2 = {"formatISO8601", "", NotificationConstants.DATE, "Ljava/util/Date;", "tracer-base_release"}, m22268k = 2, m22269mv = {1, 7, 1}, m22271xi = 48)
/* loaded from: classes2.dex */
public final class DateTimeUtils {
    public static final String formatISO8601(Date date) {
        O90.m5968f(date, NotificationConstants.DATE);
        if (Build.VERSION.SDK_INT >= 24) {
            String str = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssXXX", Locale.US).format(date);
            O90.m5967e(str, "{\n        SimpleDateForm…      .format(date)\n    }");
            return str;
        }
        StringBuilder sb = new StringBuilder(new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssZ", Locale.US).format(date));
        sb.insert(sb.length() - 2, ':');
        String string = sb.toString();
        O90.m5967e(string, "{\n        SimpleDateForm…        .toString()\n    }");
        return string;
    }
}
