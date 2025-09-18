package defpackage;

import com.facebook.react.bridge.ModuleHolder;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.config.ReactFeatureFlags;
import com.facebook.react.module.model.ReactModuleInfo;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;

/* renamed from: yg, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8217yg implements Iterator {
    public Map.Entry a = null;
    public final /* synthetic */ Iterator b;
    public final /* synthetic */ ReactApplicationContext c;
    public final /* synthetic */ AbstractC8407zg d;

    public C8217yg(AbstractC8407zg abstractC8407zg, Iterator it, ReactApplicationContext reactApplicationContext) {
        this.d = abstractC8407zg;
        this.b = it;
        this.c = reactApplicationContext;
    }

    public final void a() {
        while (this.b.hasNext()) {
            Map.Entry entry = (Map.Entry) this.b.next();
            ReactModuleInfo reactModuleInfo = (ReactModuleInfo) entry.getValue();
            if (!ReactFeatureFlags.useTurboModules || !reactModuleInfo.f) {
                this.a = entry;
                return;
            }
        }
        this.a = null;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.a == null) {
            a();
        }
        return this.a != null;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.a == null) {
            a();
        }
        Map.Entry entry = this.a;
        if (entry == null) {
            throw new NoSuchElementException("ModuleHolder not found");
        }
        a();
        return new ModuleHolder((ReactModuleInfo) entry.getValue(), new C1857Xo1(this.d, (String) entry.getKey(), this.c, 5));
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Cannot remove native modules from the list");
    }
}
