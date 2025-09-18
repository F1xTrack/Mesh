package p000;

import java.util.HashSet;

/* renamed from: rp0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC10953rp0 {

    /* renamed from: a */
    public static final HashSet f41924a = new HashSet();

    /* renamed from: b */
    public static String f41925b = "media3.common";

    /* renamed from: a */
    public static synchronized void m24489a(String str) {
        if (f41924a.add(str)) {
            f41925b += ", " + str;
        }
    }
}
