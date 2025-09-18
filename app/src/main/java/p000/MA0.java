package p000;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class MA0 {

    /* renamed from: a */
    public final String f7013a;

    /* renamed from: b */
    public final long f7014b;

    /* renamed from: c */
    public final List f7015c;

    /* renamed from: d */
    public final List f7016d;

    public MA0(String str, long j, ArrayList arrayList, List list) {
        this.f7013a = str;
        this.f7014b = j;
        this.f7015c = Collections.unmodifiableList(arrayList);
        this.f7016d = Collections.unmodifiableList(list);
    }
}
