package p000;

import com.facebook.react.bridge.ModuleHolder;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.config.ReactFeatureFlags;
import com.facebook.react.module.model.ReactModuleInfo;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;

/* renamed from: yg */
/* loaded from: classes.dex */
public final class C7216yg implements Iterator {

    /* renamed from: a */
    public Map.Entry f46409a = null;

    /* renamed from: b */
    public final /* synthetic */ Iterator f46410b;

    /* renamed from: c */
    public final /* synthetic */ ReactApplicationContext f46411c;

    /* renamed from: d */
    public final /* synthetic */ AbstractC7279zg f46412d;

    public C7216yg(AbstractC7279zg abstractC7279zg, Iterator it, ReactApplicationContext reactApplicationContext) {
        this.f46412d = abstractC7279zg;
        this.f46410b = it;
        this.f46411c = reactApplicationContext;
    }

    /* renamed from: a */
    public final void m26215a() {
        while (this.f46410b.hasNext()) {
            Map.Entry entry = (Map.Entry) this.f46410b.next();
            ReactModuleInfo reactModuleInfo = (ReactModuleInfo) entry.getValue();
            if (!ReactFeatureFlags.useTurboModules || !reactModuleInfo.f17919f) {
                this.f46409a = entry;
                return;
            }
        }
        this.f46409a = null;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f46409a == null) {
            m26215a();
        }
        return this.f46409a != null;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f46409a == null) {
            m26215a();
        }
        Map.Entry entry = this.f46409a;
        if (entry == null) {
            throw new NoSuchElementException("ModuleHolder not found");
        }
        m26215a();
        return new ModuleHolder((ReactModuleInfo) entry.getValue(), new C8539Xo1(this.f46412d, (String) entry.getKey(), this.f46411c, 5));
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Cannot remove native modules from the list");
    }
}
