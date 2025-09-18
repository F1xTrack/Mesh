package p000;

import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.List;

/* renamed from: gT1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC9502gT1 {
    /* renamed from: a */
    public static final void m18571a(AbstractCollection abstractCollection, Object obj) {
        if (obj != null) {
            abstractCollection.add(obj);
        }
    }

    /* renamed from: b */
    public static final List m18572b(ArrayList arrayList) {
        O90.m5968f(arrayList, "<this>");
        int size = arrayList.size();
        if (size == 0) {
            return C0779MN.f7117a;
        }
        if (size == 1) {
            return AbstractC7230yu.m26274e(AbstractC7167xu.m25955A(arrayList));
        }
        arrayList.trimToSize();
        return arrayList;
    }

    /* renamed from: c */
    public static String m18573c(String str, String str2) {
        int length = str.length() - str2.length();
        if (length < 0 || length > 1) {
            throw new IllegalArgumentException("Invalid input received");
        }
        StringBuilder sb = new StringBuilder(str2.length() + str.length());
        for (int i = 0; i < str.length(); i++) {
            sb.append(str.charAt(i));
            if (str2.length() > i) {
                sb.append(str2.charAt(i));
            }
        }
        return sb.toString();
    }
}
