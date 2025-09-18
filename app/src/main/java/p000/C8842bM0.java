package p000;

import com.facebook.react.bridge.ModuleHolder;
import com.facebook.react.bridge.NativeModule;
import java.util.Iterator;
import java.util.List;

/* renamed from: bM0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8842bM0 implements Iterator {

    /* renamed from: a */
    public int f16988a = 0;

    /* renamed from: b */
    public final /* synthetic */ List f16989b;

    public C8842bM0(List list) {
        this.f16989b = list;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f16988a < this.f16989b.size();
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.f16988a;
        this.f16988a = i + 1;
        return new ModuleHolder((NativeModule) this.f16989b.get(i));
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Cannot remove methods ");
    }
}
