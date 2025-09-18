package defpackage;

import java.util.Collection;

/* renamed from: zu */
/* loaded from: classes2.dex */
public abstract class AbstractC8449zu extends AbstractC8259yu {
    public static int k(Iterable iterable) {
        O90.f(iterable, "<this>");
        if (iterable instanceof Collection) {
            return ((Collection) iterable).size();
        }
        return 10;
    }
}
