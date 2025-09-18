package com.horcrux.svg;

import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReadableMap;
import com.swmansion.reanimated.layoutReanimation.Snapshot;

/* loaded from: classes.dex */
public final class V implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ReadableMap b;
    public final /* synthetic */ Callback c;
    public final /* synthetic */ int d;

    public V(int i, ReadableMap readableMap, Callback callback, int i2) {
        this.a = i;
        this.b = readableMap;
        this.c = callback;
        this.d = i2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        SvgView svgViewByTag = SvgViewManager.getSvgViewByTag(i);
        if (svgViewByTag == null) {
            SvgViewManager.runWhenViewIsAvailable(i, new U(this, 0));
            return;
        }
        if (svgViewByTag.notRendered()) {
            svgViewByTag.setToDataUrlTask(new U(this, 1));
            return;
        }
        Callback callback = this.c;
        ReadableMap readableMap = this.b;
        if (readableMap != null) {
            callback.invoke(svgViewByTag.toDataURL(readableMap.getInt(Snapshot.WIDTH), readableMap.getInt(Snapshot.HEIGHT)));
        } else {
            callback.invoke(svgViewByTag.toDataURL());
        }
    }
}
