package defpackage;

import android.widget.SeekBar;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.uimanager.UIManagerModule;

/* loaded from: classes2.dex */
public final class IM0 implements SeekBar.OnSeekBarChangeListener {
    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        GM0 gm0 = (GM0) seekBar;
        if (i < gm0.getLowerLimit()) {
            i = gm0.getLowerLimit();
            seekBar.setProgress(i);
        } else if (i > gm0.getUpperLimit()) {
            i = gm0.getUpperLimit();
            seekBar.setProgress(i);
        }
        ReactContext reactContext = (ReactContext) seekBar.getContext();
        if (z) {
            ((UIManagerModule) reactContext.getNativeModule(UIManagerModule.class)).getEventDispatcher().g(new HM0(seekBar.getId(), gm0.a(i), true));
        }
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStartTrackingTouch(SeekBar seekBar) {
        ReactContext reactContext = (ReactContext) seekBar.getContext();
        GM0 gm0 = (GM0) seekBar;
        gm0.e = true;
        ((UIManagerModule) reactContext.getNativeModule(UIManagerModule.class)).getEventDispatcher().g(new KM0(gm0.a(seekBar.getProgress()), seekBar.getId(), 1));
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStopTrackingTouch(SeekBar seekBar) {
        ReactContext reactContext = (ReactContext) seekBar.getContext();
        GM0 gm0 = (GM0) seekBar;
        gm0.e = false;
        ((UIManagerModule) reactContext.getNativeModule(UIManagerModule.class)).getEventDispatcher().g(new KM0(gm0.a(seekBar.getProgress()), seekBar.getId(), 0));
        ((UIManagerModule) reactContext.getNativeModule(UIManagerModule.class)).getEventDispatcher().g(new HM0(seekBar.getId(), gm0.a(seekBar.getProgress()), !gm0.e));
    }
}
