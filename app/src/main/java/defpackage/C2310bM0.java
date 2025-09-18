package defpackage;

import com.facebook.react.bridge.ModuleHolder;
import com.facebook.react.bridge.NativeModule;
import java.util.Iterator;
import java.util.List;

/* renamed from: bM0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2310bM0 implements Iterator {
    public int a = 0;
    public final /* synthetic */ List b;

    public C2310bM0(List list) {
        this.b = list;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.a < this.b.size();
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.a;
        this.a = i + 1;
        return new ModuleHolder((NativeModule) this.b.get(i));
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Cannot remove methods ");
    }
}
