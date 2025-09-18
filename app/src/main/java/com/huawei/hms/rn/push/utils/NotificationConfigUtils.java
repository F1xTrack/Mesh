package com.huawei.hms.rn.push.utils;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import com.huawei.hms.rn.push.constants.Core;
import com.huawei.hms.rn.push.constants.NotificationConstants;
import java.security.SecureRandom;
import java.util.Date;
import java.util.Locale;

/* loaded from: classes.dex */
public class NotificationConfigUtils {
    private static final SecureRandom RANDOM = new SecureRandom();

    private NotificationConfigUtils() {
        throw new IllegalStateException("Utility class");
    }

    public static void configId(Bundle bundle) {
        if (BundleUtils.get(bundle, NotificationConstants.ID) == null) {
            bundle.putString(NotificationConstants.ID, generateNotificationId());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x006a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int configImportance(android.os.Bundle r7) {
        /*
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 24
            r2 = 4
            if (r0 >= r1) goto L8
            return r2
        L8:
            java.lang.String r0 = "importance"
            java.lang.String r7 = com.huawei.hms.rn.push.utils.BundleUtils.get(r7, r0)
            if (r7 != 0) goto L11
            return r2
        L11:
            java.util.Locale r0 = java.util.Locale.ENGLISH     // Catch: java.lang.RuntimeException -> L80
            java.lang.String r7 = r7.toLowerCase(r0)     // Catch: java.lang.RuntimeException -> L80
            int r0 = r7.hashCode()     // Catch: java.lang.RuntimeException -> L80
            r1 = 0
            r3 = 1
            r4 = 2
            r5 = 3
            r6 = 5
            switch(r0) {
                case -1626174665: goto L60;
                case 107348: goto L56;
                case 107876: goto L4c;
                case 108114: goto L42;
                case 3202466: goto L38;
                case 3387192: goto L2e;
                case 1544803905: goto L24;
                default: goto L23;
            }     // Catch: java.lang.RuntimeException -> L80
        L23:
            goto L6a
        L24:
            java.lang.String r0 = "default"
            boolean r7 = r7.equals(r0)     // Catch: java.lang.RuntimeException -> L80
            if (r7 == 0) goto L6a
            r7 = r6
            goto L6b
        L2e:
            java.lang.String r0 = "none"
            boolean r7 = r7.equals(r0)     // Catch: java.lang.RuntimeException -> L80
            if (r7 == 0) goto L6a
            r7 = r5
            goto L6b
        L38:
            java.lang.String r0 = "high"
            boolean r7 = r7.equals(r0)     // Catch: java.lang.RuntimeException -> L80
            if (r7 == 0) goto L6a
            r7 = 6
            goto L6b
        L42:
            java.lang.String r0 = "min"
            boolean r7 = r7.equals(r0)     // Catch: java.lang.RuntimeException -> L80
            if (r7 == 0) goto L6a
            r7 = r4
            goto L6b
        L4c:
            java.lang.String r0 = "max"
            boolean r7 = r7.equals(r0)     // Catch: java.lang.RuntimeException -> L80
            if (r7 == 0) goto L6a
            r7 = r1
            goto L6b
        L56:
            java.lang.String r0 = "low"
            boolean r7 = r7.equals(r0)     // Catch: java.lang.RuntimeException -> L80
            if (r7 == 0) goto L6a
            r7 = r3
            goto L6b
        L60:
            java.lang.String r0 = "unspecified"
            boolean r7 = r7.equals(r0)     // Catch: java.lang.RuntimeException -> L80
            if (r7 == 0) goto L6a
            r7 = r2
            goto L6b
        L6a:
            r7 = -1
        L6b:
            if (r7 == 0) goto L7f
            if (r7 == r3) goto L7e
            if (r7 == r4) goto L7d
            if (r7 == r5) goto L7c
            if (r7 == r2) goto L79
            if (r7 == r6) goto L78
            return r2
        L78:
            return r5
        L79:
            r7 = -1000(0xfffffffffffffc18, float:NaN)
            return r7
        L7c:
            return r1
        L7d:
            return r3
        L7e:
            return r4
        L7f:
            return r6
        L80:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.hms.rn.push.utils.NotificationConfigUtils.configImportance(android.os.Bundle):int");
    }

    public static Bitmap configLargeIcon(Bundle bundle, Context context, Bitmap bitmap) {
        Resources resources = context.getResources();
        String packageName = context.getPackageName();
        if (bitmap != null) {
            return bitmap;
        }
        String str = BundleUtils.get(bundle, NotificationConstants.LARGE_ICON);
        int identifier = str != null ? resources.getIdentifier(str, Core.Resource.MIPMAP, packageName) : 0;
        return identifier != 0 ? BitmapFactory.decodeResource(resources, identifier) : bitmap;
    }

    public static String configMessage(Bundle bundle, Context context) {
        String str = BundleUtils.get(bundle, "message");
        if (str != null) {
            return str;
        }
        String string = context.getPackageManager().getApplicationLabel(context.getApplicationInfo()).toString();
        bundle.putString("message", string);
        return string;
    }

    public static long configNextFireDate(Bundle bundle) {
        long l;
        long j;
        String str = BundleUtils.get(bundle, NotificationConstants.REPEAT_TYPE);
        long l2 = BundleUtils.getL(bundle, NotificationConstants.REPEAT_TIME);
        if (str == null) {
            return 0L;
        }
        l = BundleUtils.getL(bundle, NotificationConstants.FIRE_DATE);
        if (l == 0) {
            l = new Date().getTime();
        }
        String lowerCase = str.toLowerCase(Locale.ENGLISH);
        lowerCase.getClass();
        switch (lowerCase) {
            case "custom_time":
                if (l2 <= 0) {
                    return 0L;
                }
                return l + l2;
            case "minute":
                j = 60000;
                break;
            case "day":
                j = 86400000;
                break;
            case "hour":
                j = 3600000;
                break;
            case "week":
                j = 604800000;
                break;
            default:
                return 0L;
        }
        return l + j;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:23:0x004e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int configPriority(android.os.Bundle r6) {
        /*
            java.lang.String r0 = "priority"
            java.lang.String r6 = com.huawei.hms.rn.push.utils.BundleUtils.get(r6, r0)
            r0 = 1
            if (r6 != 0) goto La
            return r0
        La:
            java.util.Locale r1 = java.util.Locale.ENGLISH
            java.lang.String r6 = r6.toLowerCase(r1)
            int r1 = r6.hashCode()
            r2 = 0
            r3 = 3
            r4 = -1
            r5 = 2
            switch(r1) {
                case 107348: goto L44;
                case 107876: goto L3a;
                case 108114: goto L30;
                case 3202466: goto L26;
                case 1544803905: goto L1c;
                default: goto L1b;
            }
        L1b:
            goto L4e
        L1c:
            java.lang.String r1 = "default"
            boolean r6 = r6.equals(r1)
            if (r6 == 0) goto L4e
            r6 = r3
            goto L4f
        L26:
            java.lang.String r1 = "high"
            boolean r6 = r6.equals(r1)
            if (r6 == 0) goto L4e
            r6 = 4
            goto L4f
        L30:
            java.lang.String r1 = "min"
            boolean r6 = r6.equals(r1)
            if (r6 == 0) goto L4e
            r6 = r5
            goto L4f
        L3a:
            java.lang.String r1 = "max"
            boolean r6 = r6.equals(r1)
            if (r6 == 0) goto L4e
            r6 = r2
            goto L4f
        L44:
            java.lang.String r1 = "low"
            boolean r6 = r6.equals(r1)
            if (r6 == 0) goto L4e
            r6 = r0
            goto L4f
        L4e:
            r6 = r4
        L4f:
            if (r6 == 0) goto L5c
            if (r6 == r0) goto L5b
            if (r6 == r5) goto L59
            if (r6 == r3) goto L58
            return r0
        L58:
            return r2
        L59:
            r6 = -2
            return r6
        L5b:
            return r4
        L5c:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.hms.rn.push.utils.NotificationConfigUtils.configPriority(android.os.Bundle):int");
    }

    public static int configSmallIcon(Bundle bundle, Context context) {
        Resources resources = context.getResources();
        String packageName = context.getPackageName();
        String str = BundleUtils.get(bundle, NotificationConstants.SMALL_ICON);
        int identifier = str != null ? resources.getIdentifier(str, Core.Resource.MIPMAP, packageName) : resources.getIdentifier(Core.Resource.NOTIFICATION, Core.Resource.MIPMAP, packageName);
        if (identifier != 0) {
            return identifier;
        }
        int identifier2 = resources.getIdentifier(Core.Resource.LAUNCHER, Core.Resource.MIPMAP, packageName);
        return identifier2 == 0 ? R.drawable.ic_dialog_info : identifier2;
    }

    public static String configTitle(Bundle bundle, Context context) {
        String str = BundleUtils.get(bundle, "title");
        if (str != null) {
            return str;
        }
        return context.getPackageManager().getApplicationLabel(context.getApplicationInfo()).toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0044  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int configVisibility(android.os.Bundle r5) {
        /*
            java.lang.String r0 = "visibility"
            java.lang.String r5 = com.huawei.hms.rn.push.utils.BundleUtils.get(r5, r0)
            r0 = 1
            if (r5 != 0) goto La
            return r0
        La:
            java.util.Locale r1 = java.util.Locale.ENGLISH
            java.lang.String r5 = r5.toLowerCase(r1)
            int r1 = r5.hashCode()
            r2 = -977423767(0xffffffffc5bdb269, float:-6070.3013)
            r3 = 0
            r4 = -1
            if (r1 == r2) goto L3a
            r2 = -906277200(0xffffffffc9fb4eb0, float:-2058710.0)
            if (r1 == r2) goto L30
            r2 = -314497661(0xffffffffed412583, float:-3.7359972E27)
            if (r1 == r2) goto L26
            goto L44
        L26:
            java.lang.String r1 = "private"
            boolean r5 = r5.equals(r1)
            if (r5 == 0) goto L44
            r5 = 2
            goto L45
        L30:
            java.lang.String r1 = "secret"
            boolean r5 = r5.equals(r1)
            if (r5 == 0) goto L44
            r5 = r0
            goto L45
        L3a:
            java.lang.String r1 = "public"
            boolean r5 = r5.equals(r1)
            if (r5 == 0) goto L44
            r5 = r3
            goto L45
        L44:
            r5 = r4
        L45:
            if (r5 == 0) goto L4b
            if (r5 == r0) goto L4a
            return r3
        L4a:
            return r4
        L4b:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.hms.rn.push.utils.NotificationConfigUtils.configVisibility(android.os.Bundle):int");
    }

    public static String generateNotificationId() {
        return String.valueOf(RANDOM.nextInt());
    }
}
