package defpackage;

import java.util.regex.Pattern;

/* renamed from: Ga0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0489Ga0 {
    public static final Pattern a = Pattern.compile("\\b((?:seg-\\d+(?:_\\d+)?|\\d+)\\.js)");

    /* JADX WARN: Removed duplicated region for block: B:15:0x0061  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.String a(com.facebook.react.bridge.ReadableArray r7, java.lang.String r8) {
        /*
            java.lang.String r0 = "message"
            defpackage.O90.f(r8, r0)
            java.lang.String r0 = "stack"
            defpackage.O90.f(r7, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r8)
            java.lang.String r8 = ", stack:\n"
            r0.append(r8)
            int r8 = r7.size()
            r1 = 0
        L19:
            if (r1 >= r8) goto Lb1
            com.facebook.react.bridge.ReadableMap r2 = r7.getMap(r1)
            java.lang.String r3 = "methodName"
            java.lang.String r3 = r2.getString(r3)
            r0.append(r3)
            java.lang.String r3 = "@"
            r0.append(r3)
            java.lang.String r3 = "file"
            boolean r4 = r2.hasKey(r3)
            java.lang.String r5 = ":"
            if (r4 == 0) goto L61
            boolean r4 = r2.isNull(r3)
            if (r4 != 0) goto L61
            com.facebook.react.bridge.ReadableType r4 = r2.getType(r3)
            com.facebook.react.bridge.ReadableType r6 = com.facebook.react.bridge.ReadableType.String
            if (r4 != r6) goto L61
            java.lang.String r3 = r2.getString(r3)
            if (r3 == 0) goto L61
            java.util.regex.Pattern r4 = defpackage.AbstractC0489Ga0.a
            java.util.regex.Matcher r3 = r4.matcher(r3)
            boolean r4 = r3.find()
            if (r4 == 0) goto L61
            r4 = 1
            java.lang.String r3 = r3.group(r4)
            java.lang.String r3 = defpackage.AbstractC8235ym.i(r3, r5)
            goto L63
        L61:
            java.lang.String r3 = ""
        L63:
            r0.append(r3)
            java.lang.String r3 = "lineNumber"
            boolean r4 = r2.hasKey(r3)
            if (r4 == 0) goto L84
            boolean r4 = r2.isNull(r3)
            if (r4 != 0) goto L84
            com.facebook.react.bridge.ReadableType r4 = r2.getType(r3)
            com.facebook.react.bridge.ReadableType r6 = com.facebook.react.bridge.ReadableType.Number
            if (r4 != r6) goto L84
            int r3 = r2.getInt(r3)
            r0.append(r3)
            goto L88
        L84:
            r3 = -1
            r0.append(r3)
        L88:
            java.lang.String r3 = "column"
            boolean r4 = r2.hasKey(r3)
            if (r4 == 0) goto La8
            boolean r4 = r2.isNull(r3)
            if (r4 != 0) goto La8
            com.facebook.react.bridge.ReadableType r4 = r2.getType(r3)
            com.facebook.react.bridge.ReadableType r6 = com.facebook.react.bridge.ReadableType.Number
            if (r4 != r6) goto La8
            r0.append(r5)
            int r2 = r2.getInt(r3)
            r0.append(r2)
        La8:
            java.lang.String r2 = "\n"
            r0.append(r2)
            int r1 = r1 + 1
            goto L19
        Lb1:
            java.lang.String r7 = r0.toString()
            java.lang.String r8 = "toString(...)"
            defpackage.O90.e(r7, r8)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC0489Ga0.a(com.facebook.react.bridge.ReadableArray, java.lang.String):java.lang.String");
    }
}
