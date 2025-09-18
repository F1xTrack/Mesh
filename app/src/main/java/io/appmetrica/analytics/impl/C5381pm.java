package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.data.TempCacheStorage;
import java.util.Collection;

/* renamed from: io.appmetrica.analytics.impl.pm */
/* loaded from: classes2.dex */
public final class C5381pm implements TempCacheStorage {

    /* renamed from: a */
    public final TempCacheStorage f32408a;

    public C5381pm(Context context, EnumC4837Tl enumC4837Tl, TempCacheStorage tempCacheStorage) {
        this.f32408a = tempCacheStorage;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.TempCacheStorage
    public final TempCacheStorage.Entry get(String str) {
        return this.f32408a.get(str);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.TempCacheStorage
    public final long put(String str, long j, byte[] bArr) {
        return this.f32408a.put(str, j, bArr);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.TempCacheStorage
    public final void remove(long j) {
        this.f32408a.remove(j);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.TempCacheStorage
    public final void removeOlderThan(String str, long j) {
        this.f32408a.removeOlderThan(str, j);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.TempCacheStorage
    public final Collection<TempCacheStorage.Entry> get(String str, int i) {
        return this.f32408a.get(str, i);
    }
}
