package com.horcrux.svg;

import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReadableMap;
import com.swmansion.reanimated.layoutReanimation.Snapshot;

/* renamed from: com.horcrux.svg.V */
/* loaded from: classes.dex */
public final class RunnableC1980V implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f18549a;

    /* renamed from: b */
    public final /* synthetic */ ReadableMap f18550b;

    /* renamed from: c */
    public final /* synthetic */ Callback f18551c;

    /* renamed from: d */
    public final /* synthetic */ int f18552d;

    public RunnableC1980V(int i, ReadableMap readableMap, Callback callback, int i2) {
        this.f18549a = i;
        this.f18550b = readableMap;
        this.f18551c = callback;
        this.f18552d = i2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f18549a;
        SvgView svgViewByTag = SvgViewManager.getSvgViewByTag(i);
        if (svgViewByTag == null) {
            SvgViewManager.runWhenViewIsAvailable(i, new RunnableC1979U(this, 0));
            return;
        }
        if (svgViewByTag.notRendered()) {
            svgViewByTag.setToDataUrlTask(new RunnableC1979U(this, 1));
            return;
        }
        Callback callback = this.f18551c;
        ReadableMap readableMap = this.f18550b;
        if (readableMap != null) {
            callback.invoke(svgViewByTag.toDataURL(readableMap.getInt(Snapshot.WIDTH), readableMap.getInt(Snapshot.HEIGHT)));
        } else {
            callback.invoke(svgViewByTag.toDataURL());
        }
    }
}
