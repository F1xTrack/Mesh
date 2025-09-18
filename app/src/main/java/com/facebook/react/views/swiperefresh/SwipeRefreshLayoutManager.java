package com.facebook.react.views.swiperefresh;

import android.view.View;
import android.view.ViewConfiguration;
import com.facebook.react.bridge.ColorPropConverter;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.uimanager.ViewGroupManager;
import com.p003BV.LinearGradient.LinearGradientManager;
import java.util.HashMap;
import java.util.Map;
import p000.AbstractC0852NX;
import p000.AbstractC10889rJ0;
import p000.C0926Oi;
import p000.C6340l4;
import p000.ES1;
import p000.InterfaceC0257E4;
import p000.InterfaceC7543Ek1;
import p000.InterfaceC9101dL0;
import p000.InterfaceC9871jM0;
import p000.PM0;
import p000.S91;

@InterfaceC9101dL0(name = SwipeRefreshLayoutManager.REACT_CLASS)
/* loaded from: classes.dex */
public class SwipeRefreshLayoutManager extends ViewGroupManager<PM0> implements InterfaceC0257E4 {
    public static final String REACT_CLASS = "AndroidSwipeRefreshLayout";
    private final InterfaceC7543Ek1 mDelegate = new C6340l4(this, 2);

    @Override // com.facebook.react.uimanager.ViewManager
    /* renamed from: getDelegate */
    public InterfaceC7543Ek1 getMDelegate() {
        return this.mDelegate;
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public Map<String, Object> getExportedCustomDirectEventTypeConstants() {
        Map<String, Object> exportedCustomDirectEventTypeConstants = super.getExportedCustomDirectEventTypeConstants();
        if (exportedCustomDirectEventTypeConstants == null) {
            exportedCustomDirectEventTypeConstants = new HashMap<>();
        }
        C0926Oi c0926OiM24254a = AbstractC10889rJ0.m24254a();
        c0926OiM24254a.m6125k("topRefresh", AbstractC10889rJ0.m24256c("registrationName", "onRefresh"));
        exportedCustomDirectEventTypeConstants.putAll(c0926OiM24254a.m6122h());
        return exportedCustomDirectEventTypeConstants;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public Map<String, Object> getExportedViewConstants() {
        return AbstractC10889rJ0.m24256c("SIZE", AbstractC10889rJ0.m24257d("DEFAULT", 1, "LARGE", 0));
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager, p000.I50
    public /* bridge */ /* synthetic */ void removeAllViews(View view) {
        AbstractC0852NX.m5754c(this, view);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void addEventEmitters(S91 s91, PM0 pm0) {
        pm0.setOnRefreshListener(new ES1(s91, pm0, false, 22));
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public PM0 createViewInstance(S91 s91) {
        PM0 pm0 = new PM0(s91);
        pm0.f9006L = false;
        pm0.f9007M = false;
        pm0.f9008N = 0.0f;
        pm0.f9012R = false;
        pm0.f9009O = ViewConfiguration.get(s91).getScaledTouchSlop();
        return pm0;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void receiveCommand(PM0 pm0, String str, ReadableArray readableArray) {
        str.getClass();
        if (str.equals("setNativeRefreshing") && readableArray != null) {
            setRefreshing(pm0, readableArray.getBoolean(0));
        }
    }

    @Override // p000.InterfaceC0257E4
    @InterfaceC9871jM0(customType = "ColorArray", name = LinearGradientManager.PROP_COLORS)
    public void setColors(PM0 pm0, ReadableArray readableArray) {
        if (readableArray == null) {
            pm0.setColorSchemeColors(new int[0]);
            return;
        }
        int[] iArr = new int[readableArray.size()];
        for (int i = 0; i < readableArray.size(); i++) {
            if (readableArray.getType(i) == ReadableType.Map) {
                iArr[i] = ColorPropConverter.getColor(readableArray.getMap(i), pm0.getContext()).intValue();
            } else {
                iArr[i] = readableArray.getInt(i);
            }
        }
        pm0.setColorSchemeColors(iArr);
    }

    @Override // p000.InterfaceC0257E4
    @InterfaceC9871jM0(defaultBoolean = true, name = "enabled")
    public void setEnabled(PM0 pm0, boolean z) {
        pm0.setEnabled(z);
    }

    @Override // p000.InterfaceC0257E4
    public void setNativeRefreshing(PM0 pm0, boolean z) {
        setRefreshing(pm0, z);
    }

    @Override // p000.InterfaceC0257E4
    @InterfaceC9871jM0(customType = RemoteMessageAttributes.COLOR, name = "progressBackgroundColor")
    public void setProgressBackgroundColor(PM0 pm0, Integer num) {
        pm0.setProgressBackgroundColorSchemeColor(num == null ? 0 : num.intValue());
    }

    @Override // p000.InterfaceC0257E4
    @InterfaceC9871jM0(defaultFloat = 0.0f, name = "progressViewOffset")
    public void setProgressViewOffset(PM0 pm0, float f) {
        pm0.setProgressViewOffset(f);
    }

    @Override // p000.InterfaceC0257E4
    @InterfaceC9871jM0(name = "refreshing")
    public void setRefreshing(PM0 pm0, boolean z) {
        pm0.setRefreshing(z);
    }

    public void setSize(PM0 pm0, int i) {
        pm0.setSize(i);
    }

    @Override // p000.InterfaceC0257E4
    public void setSize(PM0 pm0, String str) {
        if (str != null && !str.equals("default")) {
            if (str.equals("large")) {
                pm0.setSize(0);
                return;
            }
            throw new IllegalArgumentException("Size must be 'default' or 'large', received: ".concat(str));
        }
        pm0.setSize(1);
    }

    @InterfaceC9871jM0(name = "size")
    public void setSize(PM0 pm0, Dynamic dynamic) {
        if (dynamic.isNull()) {
            pm0.setSize(1);
        } else if (dynamic.getType() == ReadableType.Number) {
            pm0.setSize(dynamic.asInt());
        } else {
            if (dynamic.getType() == ReadableType.String) {
                setSize(pm0, dynamic.asString());
                return;
            }
            throw new IllegalArgumentException("Size must be 'default' or 'large'");
        }
    }
}
