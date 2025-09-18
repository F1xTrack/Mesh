package defpackage;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* renamed from: Cu, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC0236Cu extends AbstractC0158Bu {
    public static void l(List list, Comparator comparator) {
        O90.f(list, "<this>");
        O90.f(comparator, "comparator");
        if (list.size() > 1) {
            Collections.sort(list, comparator);
        }
    }
}
