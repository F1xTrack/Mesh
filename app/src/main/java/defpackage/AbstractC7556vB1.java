package defpackage;

import java.lang.reflect.Method;

/* renamed from: vB1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC7556vB1 {
    public static final Object a = new Object();
    public static Method b;
    public static boolean c;

    public static void a(StringBuilder sb, String str) {
        O90.f(str, "key");
        sb.append('\"');
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char cCharAt = str.charAt(i);
            if (cCharAt == '\n') {
                sb.append("%0A");
            } else if (cCharAt == '\r') {
                sb.append("%0D");
            } else if (cCharAt == '\"') {
                sb.append("%22");
            } else {
                sb.append(cCharAt);
            }
        }
        sb.append('\"');
    }
}
