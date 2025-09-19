package com.reactnativecommunity.slider;

import android.R;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.widget.SeekBar;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.SimpleViewManager;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import p000.AbstractC10889rJ0;
import p000.C10169lh0;
import p000.GM0;
import p000.IM0;
import p000.InterfaceC9871jM0;
import p000.JM0;
import p000.S91;

/* loaded from: classes2.dex */
public class ReactSliderManager extends SimpleViewManager<GM0> {
    private static final SeekBar.OnSeekBarChangeListener ON_CHANGE_LISTENER = new IM0();

    @Override // com.facebook.react.uimanager.ViewManager
    public GM0 createViewInstance(S91 s91) {
        GM0 gm0 = new GM0(s91);
        gm0.setSplitTrack(false);
        return gm0;
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public Map getExportedCustomDirectEventTypeConstants() {
        return AbstractC10889rJ0.m24257d("topSlidingComplete", AbstractC10889rJ0.m24256c("registrationName", "onRNCSliderSlidingComplete"), "topSlidingStart", AbstractC10889rJ0.m24256c("registrationName", "onRNCSliderSlidingStart"));
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return "RNCSlider";
    }

    @Override // com.facebook.react.uimanager.SimpleViewManager, com.facebook.react.uimanager.ViewManager
    public Class getShadowNodeClass() {
        return JM0.class;
    }

    @InterfaceC9871jM0(name = "accessibilityIncrements")
    public void setAccessibilityIncrements(GM0 gm0, ReadableArray readableArray) {
        ArrayList<Object> arrayList = readableArray.toArrayList();
        ArrayList arrayList2 = new ArrayList();
        Iterator<Object> it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add((String) it.next());
        }
        gm0.setAccessibilityIncrements(arrayList2);
    }

    @InterfaceC9871jM0(name = "accessibilityUnits")
    public void setAccessibilityUnits(GM0 gm0, String str) {
        gm0.setAccessibilityUnits(str);
    }

    @InterfaceC9871jM0(defaultBoolean = false, name = "disabled")
    public void setDisabled(GM0 gm0, boolean z) {
        gm0.setEnabled(!z);
    }

    @InterfaceC9871jM0(defaultBoolean = false, name = "inverted")
    public void setInverted(GM0 gm0, boolean z) {
        if (z) {
            gm0.setScaleX(-1.0f);
        } else {
            gm0.setScaleX(1.0f);
        }
    }

    @InterfaceC9871jM0(name = "lowerLimit")
    public void setLowerLimit(GM0 gm0, float f) {
        gm0.setLowerLimit(f);
    }

    @InterfaceC9871jM0(customType = RemoteMessageAttributes.COLOR, name = "maximumTrackTintColor")
    public void setMaximumTrackTintColor(GM0 gm0, Integer num) {
        Drawable drawableFindDrawableByLayerId = ((LayerDrawable) gm0.getProgressDrawable().getCurrent()).findDrawableByLayerId(R.id.background);
        if (num == null) {
            drawableFindDrawableByLayerId.clearColorFilter();
        } else if (Build.VERSION.SDK_INT > 28) {
            drawableFindDrawableByLayerId.setColorFilter(new PorterDuffColorFilter(num.intValue(), PorterDuff.Mode.SRC_IN));
        } else {
            drawableFindDrawableByLayerId.setColorFilter(num.intValue(), PorterDuff.Mode.SRC_IN);
        }
    }

    @InterfaceC9871jM0(defaultFloat = 1.0f, name = "maximumValue")
    public void setMaximumValue(GM0 gm0, float f) {
        gm0.setMaxValue(f);
    }

    @InterfaceC9871jM0(customType = RemoteMessageAttributes.COLOR, name = "minimumTrackTintColor")
    public void setMinimumTrackTintColor(GM0 gm0, Integer num) {
        Drawable drawableFindDrawableByLayerId = ((LayerDrawable) gm0.getProgressDrawable().getCurrent()).findDrawableByLayerId(R.id.progress);
        if (num == null) {
            drawableFindDrawableByLayerId.clearColorFilter();
        } else if (Build.VERSION.SDK_INT > 28) {
            drawableFindDrawableByLayerId.setColorFilter(new PorterDuffColorFilter(num.intValue(), PorterDuff.Mode.SRC_IN));
        } else {
            drawableFindDrawableByLayerId.setColorFilter(num.intValue(), PorterDuff.Mode.SRC_IN);
        }
    }

    @InterfaceC9871jM0(defaultFloat = 0.0f, name = "minimumValue")
    public void setMinimumValue(GM0 gm0, float f) {
        gm0.setMinValue(f);
    }

    @InterfaceC9871jM0(defaultFloat = 0.0f, name = "step")
    public void setStep(GM0 gm0, float f) {
        gm0.setStep(f);
    }

    @InterfaceC9871jM0(name = "thumbImage")
    public void setThumbImage(GM0 gm0, ReadableMap readableMap) {
        gm0.setThumbImage(readableMap != null ? readableMap.getString("uri") : null);
    }

    @InterfaceC9871jM0(customType = RemoteMessageAttributes.COLOR, name = "thumbTintColor")
    public void setThumbTintColor(GM0 gm0, Integer num) {
        if (gm0.getThumb() != null) {
            if (num == null) {
                gm0.getThumb().clearColorFilter();
            } else {
                gm0.getThumb().setColorFilter(num.intValue(), PorterDuff.Mode.SRC_IN);
            }
        }
    }

    @InterfaceC9871jM0(name = "upperLimit")
    public void setUpperLimit(GM0 gm0, float f) {
        gm0.setUpperLimit(f);
    }

    @InterfaceC9871jM0(defaultFloat = 0.0f, name = "value")
    public void setValue(GM0 gm0, float f) {
        double d = f;
        if (gm0.f3702e) {
            return;
        }
        gm0.setValue(d);
        if (!gm0.isAccessibilityFocused() || Build.VERSION.SDK_INT <= 29) {
            return;
        }
        gm0.setupAccessibility((int) d);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void addEventEmitters(S91 s91, GM0 gm0) {
        gm0.setOnSeekBarChangeListener(ON_CHANGE_LISTENER);
    }

    @Override // com.facebook.react.uimanager.SimpleViewManager, com.facebook.react.uimanager.ViewManager
    public C10169lh0 createShadowNodeInstance() {
        JM0 jm0 = new JM0();
        jm0.m2173D(jm0);
        return jm0;
    }
}
