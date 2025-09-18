package com.yandex.mapkit.road_events.internal;

import com.yandex.mapkit.road_events.EventInfoSession;
import com.yandex.runtime.NativeObject;

/* loaded from: classes2.dex */
public class EventInfoSessionBinding implements EventInfoSession {
    private final NativeObject nativeObject;

    public EventInfoSessionBinding(NativeObject nativeObject) {
        this.nativeObject = nativeObject;
    }

    @Override // com.yandex.mapkit.road_events.EventInfoSession
    public native void cancel();

    @Override // com.yandex.mapkit.road_events.EventInfoSession
    public native void retry(EventInfoSession.EventInfoListener eventInfoListener);
}
