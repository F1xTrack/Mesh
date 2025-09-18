package io.appmetrica.analytics.reactnative;

import com.facebook.react.bridge.ReadableMap;
import org.json.JSONObject;

/* loaded from: classes2.dex */
final class ExternalAttributionSerializer {
    private ExternalAttributionSerializer() {
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int parseSource(java.lang.String r7) {
        /*
            r0 = 5
            r1 = 4
            r2 = 3
            r3 = 2
            r4 = 1
            boolean r5 = android.text.TextUtils.isEmpty(r7)
            r6 = -1
            if (r5 == 0) goto Ld
            return r6
        Ld:
            r7.getClass()
            int r5 = r7.hashCode()
            switch(r5) {
                case -1793460750: goto L50;
                case 82339054: goto L45;
                case 570897463: goto L3a;
                case 1115758915: goto L2f;
                case 1956520879: goto L24;
                case 2096405811: goto L19;
                default: goto L17;
            }
        L17:
            r7 = r6
            goto L5a
        L19:
            java.lang.String r5 = "Airbridge"
            boolean r7 = r7.equals(r5)
            if (r7 != 0) goto L22
            goto L17
        L22:
            r7 = r0
            goto L5a
        L24:
            java.lang.String r5 = "Adjust"
            boolean r7 = r7.equals(r5)
            if (r7 != 0) goto L2d
            goto L17
        L2d:
            r7 = r1
            goto L5a
        L2f:
            java.lang.String r5 = "Kochava"
            boolean r7 = r7.equals(r5)
            if (r7 != 0) goto L38
            goto L17
        L38:
            r7 = r2
            goto L5a
        L3a:
            java.lang.String r5 = "Singular"
            boolean r7 = r7.equals(r5)
            if (r7 != 0) goto L43
            goto L17
        L43:
            r7 = r3
            goto L5a
        L45:
            java.lang.String r5 = "AppsFlyer"
            boolean r7 = r7.equals(r5)
            if (r7 != 0) goto L4e
            goto L17
        L4e:
            r7 = r4
            goto L5a
        L50:
            java.lang.String r5 = "Tenjin"
            boolean r7 = r7.equals(r5)
            if (r7 != 0) goto L59
            goto L17
        L59:
            r7 = 0
        L5a:
            switch(r7) {
                case 0: goto L67;
                case 1: goto L65;
                case 2: goto L63;
                case 3: goto L61;
                case 4: goto L5f;
                case 5: goto L68;
                default: goto L5d;
            }
        L5d:
            r0 = r6
            goto L68
        L5f:
            r0 = r3
            goto L68
        L61:
            r0 = r2
            goto L68
        L63:
            r0 = 6
            goto L68
        L65:
            r0 = r4
            goto L68
        L67:
            r0 = r1
        L68:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: io.appmetrica.analytics.reactnative.ExternalAttributionSerializer.parseSource(java.lang.String):int");
    }

    public static String parseValue(ReadableMap readableMap) {
        return readableMap == null ? "" : new JSONObject(readableMap.toHashMap()).toString();
    }
}
