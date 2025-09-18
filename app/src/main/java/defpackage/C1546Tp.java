package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: Tp, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1546Tp {
    public final List a;

    public C1546Tp(List list) {
        if (list == null || list.isEmpty()) {
            throw new IllegalArgumentException("Cannot set an empty CaptureStage list.");
        }
        this.a = Collections.unmodifiableList(new ArrayList(list));
    }
}
