package defpackage;

import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.List;

/* renamed from: gT1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC3970gT1 {
    public static final void a(AbstractCollection abstractCollection, Object obj) {
        if (obj != null) {
            abstractCollection.add(obj);
        }
    }

    public static final List b(ArrayList arrayList) {
        O90.f(arrayList, "<this>");
        int size = arrayList.size();
        if (size == 0) {
            return MN.a;
        }
        if (size == 1) {
            return AbstractC8259yu.e(AbstractC8069xu.A(arrayList));
        }
        arrayList.trimToSize();
        return arrayList;
    }

    public static String c(String str, String str2) {
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
