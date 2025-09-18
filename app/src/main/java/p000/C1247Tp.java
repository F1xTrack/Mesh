package p000;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: Tp */
/* loaded from: classes.dex */
public final class C1247Tp {

    /* renamed from: a */
    public final List f11535a;

    public C1247Tp(List list) {
        if (list == null || list.isEmpty()) {
            throw new IllegalArgumentException("Cannot set an empty CaptureStage list.");
        }
        this.f11535a = Collections.unmodifiableList(new ArrayList(list));
    }
}
