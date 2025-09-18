package p000;

import java.lang.reflect.Method;

/* renamed from: vB1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC11386vB1 {

    /* renamed from: a */
    public static final Object f44238a = new Object();

    /* renamed from: b */
    public static Method f44239b;

    /* renamed from: c */
    public static boolean f44240c;

    /* renamed from: a */
    public static void m25371a(StringBuilder sb, String str) {
        O90.m5968f(str, "key");
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
