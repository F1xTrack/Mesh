package p000;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: lT0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10141lT0 {

    /* renamed from: a */
    public final ArrayList f37076a;

    /* renamed from: b */
    public int f37077b;

    public C10141lT0() {
        this.f37076a = new ArrayList();
        this.f37077b = 128;
    }

    /* renamed from: a */
    public synchronized List m22429a() {
        return Collections.unmodifiableList(new ArrayList(this.f37076a));
    }

    /* renamed from: b */
    public boolean m22430b() {
        return this.f37077b < this.f37076a.size();
    }

    /* renamed from: c */
    public synchronized boolean m22431c(List list) {
        this.f37076a.clear();
        int size = list.size();
        int i = this.f37077b;
        if (size <= i) {
            return this.f37076a.addAll(list);
        }
        return this.f37076a.addAll(list.subList(0, i));
    }

    public C10141lT0(ArrayList arrayList) {
        this.f37076a = arrayList;
    }
}
