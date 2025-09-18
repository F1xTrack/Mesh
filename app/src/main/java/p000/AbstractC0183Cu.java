package p000;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* renamed from: Cu */
/* loaded from: classes2.dex */
public abstract class AbstractC0183Cu extends AbstractC0120Bu {
    /* renamed from: l */
    public static void m1455l(List list, Comparator comparator) {
        O90.m5968f(list, "<this>");
        O90.m5968f(comparator, "comparator");
        if (list.size() > 1) {
            Collections.sort(list, comparator);
        }
    }
}
