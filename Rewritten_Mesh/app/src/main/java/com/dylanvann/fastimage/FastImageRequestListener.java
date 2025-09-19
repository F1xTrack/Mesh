package com.dylanvann.fastimage;

import android.graphics.drawable.Drawable;
import com.dylanvann.fastimage.events.FastImageErrorEvent;
import com.dylanvann.fastimage.events.FastImageLoadEndEvent;
import com.dylanvann.fastimage.events.FastImageLoadEvent;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.bridge.WritableNativeMap;
import com.swmansion.reanimated.layoutReanimation.Snapshot;
import p000.A81;
import p000.C0029AS;
import p000.C11871z10;
import p000.C1864ci;
import p000.EnumC1460XC;
import p000.FR0;
import p000.InterfaceC6947uP;
import p000.OZ1;
import p000.S91;

/* loaded from: classes.dex */
public class FastImageRequestListener<T extends Drawable> implements FR0 {
    static final String REACT_ON_ERROR_EVENT = "onFastImageError";
    static final String REACT_ON_LOAD_END_EVENT = "onFastImageLoadEnd";
    static final String REACT_ON_LOAD_EVENT = "onFastImageLoad";
    private final String key;

    public FastImageRequestListener(String str) {
        this.key = str;
    }

    private static WritableMap mapFromResource(Drawable drawable) {
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        writableNativeMap.putInt(Snapshot.WIDTH, drawable.getIntrinsicWidth());
        writableNativeMap.putInt(Snapshot.HEIGHT, drawable.getIntrinsicHeight());
        return writableNativeMap;
    }

    @Override // p000.FR0
    public boolean onLoadFailed(C11871z10 c11871z10, Object obj, A81 a81, boolean z) {
        FastImageOkHttpProgressGlideModule.forget(this.key);
        if (!(a81 instanceof C1864ci)) {
            return false;
        }
        C0029AS c0029as = (C0029AS) ((C1864ci) a81).f44516a;
        InterfaceC6947uP interfaceC6947uPM6091b = OZ1.m6091b((S91) c0029as.getContext(), c0029as.getId());
        int iM6094e = OZ1.m6094e(c0029as);
        if (interfaceC6947uPM6091b != null) {
            interfaceC6947uPM6091b.mo11046g(new FastImageErrorEvent(iM6094e, c0029as.getId(), null));
            interfaceC6947uPM6091b.mo11046g(new FastImageLoadEndEvent(iM6094e, c0029as.getId()));
        }
        return false;
    }

    @Override // p000.FR0
    public boolean onResourceReady(T t, Object obj, A81 a81, EnumC1460XC enumC1460XC, boolean z) {
        if (!(a81 instanceof C1864ci)) {
            return false;
        }
        C0029AS c0029as = (C0029AS) ((C1864ci) a81).f44516a;
        InterfaceC6947uP interfaceC6947uPM6091b = OZ1.m6091b((S91) c0029as.getContext(), c0029as.getId());
        int iM6094e = OZ1.m6094e(c0029as);
        if (interfaceC6947uPM6091b != null) {
            interfaceC6947uPM6091b.mo11046g(new FastImageLoadEvent(iM6094e, c0029as.getId(), t.getIntrinsicWidth(), t.getIntrinsicHeight()));
            interfaceC6947uPM6091b.mo11046g(new FastImageLoadEndEvent(iM6094e, c0029as.getId()));
        }
        return false;
    }
}
