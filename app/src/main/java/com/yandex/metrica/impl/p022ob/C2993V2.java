package com.yandex.metrica.impl.p022ob;

import android.app.WallpaperManager;

/* renamed from: com.yandex.metrica.impl.ob.V2 */
/* loaded from: classes2.dex */
final class C2993V2<T, R> implements InterfaceC3038Wm<WallpaperManager, Integer> {

    /* renamed from: a */
    final /* synthetic */ int f22506a;

    public C2993V2(int i) {
        this.f22506a = i;
    }

    @Override // com.yandex.metrica.impl.p022ob.InterfaceC3038Wm
    /* renamed from: a */
    public Integer mo14148a(WallpaperManager wallpaperManager) {
        return Integer.valueOf(wallpaperManager.getWallpaperId(this.f22506a));
    }
}
