package defpackage;

import java.util.HashSet;

/* renamed from: rp0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC6911rp0 {
    public static final HashSet a = new HashSet();
    public static String b = "media3.common";

    public static synchronized void a(String str) {
        if (a.add(str)) {
            b += ", " + str;
        }
    }
}
