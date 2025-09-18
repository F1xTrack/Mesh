package com.yandex.metrica.impl.ob;

import android.app.WallpaperManager;

/* loaded from: classes2.dex */
final class V2<T, R> implements Wm<WallpaperManager, Integer> {
    final /* synthetic */ int a;

    public V2(int i) {
        this.a = i;
    }

    @Override // com.yandex.metrica.impl.ob.Wm
    public Integer a(WallpaperManager wallpaperManager) {
        return Integer.valueOf(wallpaperManager.getWallpaperId(this.a));
    }
}
