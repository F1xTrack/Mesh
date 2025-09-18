package com.facebook.react.views.drawer;

import android.view.View;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.uimanager.ViewGroupManager;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import p000.AbstractC0852NX;
import p000.AbstractC10889rJ0;
import p000.AbstractC10944rk1;
import p000.AbstractC11406vL1;
import p000.AbstractC3929dS;
import p000.AbstractC7222ym;
import p000.C6340l4;
import p000.C7258zL;
import p000.InterfaceC6403m4;
import p000.InterfaceC6947uP;
import p000.InterfaceC7543Ek1;
import p000.InterfaceC9101dL0;
import p000.InterfaceC9871jM0;
import p000.OZ1;
import p000.S91;
import p000.XJ0;
import p000.YJ0;

@InterfaceC9101dL0(name = ReactDrawerLayoutManager.REACT_CLASS)
/* loaded from: classes.dex */
public class ReactDrawerLayoutManager extends ViewGroupManager<XJ0> implements InterfaceC6403m4 {
    public static final int CLOSE_DRAWER = 2;
    public static final int OPEN_DRAWER = 1;
    public static final String REACT_CLASS = "AndroidDrawerLayout";
    private final InterfaceC7543Ek1 mDelegate = new C6340l4(this, 0);

    private void setDrawerPositionInternal(XJ0 xj0, String str) {
        if (str.equals("left")) {
            xj0.m8970u(8388611);
        } else {
            if (str.equals("right")) {
                xj0.m8970u(8388613);
                return;
            }
            "drawerPosition must be 'left' or 'right', received".concat(str);
            AbstractC3929dS.m17683p("ReactNative");
            xj0.m8970u(8388611);
        }
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public Map<String, Integer> getCommandsMap() {
        return AbstractC10889rJ0.m24257d("openDrawer", 1, "closeDrawer", 2);
    }

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
        exportedCustomDirectEventTypeConstants.putAll(AbstractC10889rJ0.m24255b("topDrawerSlide", AbstractC10889rJ0.m24256c("registrationName", "onDrawerSlide"), "topDrawerOpen", AbstractC10889rJ0.m24256c("registrationName", "onDrawerOpen"), "topDrawerClose", AbstractC10889rJ0.m24256c("registrationName", "onDrawerClose"), "topDrawerStateChanged", AbstractC10889rJ0.m24256c("registrationName", "onDrawerStateChanged")));
        return exportedCustomDirectEventTypeConstants;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public Map<String, Object> getExportedViewConstants() {
        return AbstractC10889rJ0.m24256c("DrawerPosition", AbstractC10889rJ0.m24257d("Left", 8388611, "Right", 8388613));
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager, p000.J50
    public boolean needsCustomLayoutForChildren() {
        return true;
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager, p000.I50
    public /* bridge */ /* synthetic */ void removeAllViews(View view) {
        AbstractC0852NX.m5754c(this, view);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void addEventEmitters(S91 s91, XJ0 xj0) {
        InterfaceC6947uP interfaceC6947uPM6091b = OZ1.m6091b(s91, xj0.getId());
        if (interfaceC6947uPM6091b == null) {
            return;
        }
        YJ0 yj0 = new YJ0(xj0, interfaceC6947uPM6091b);
        if (xj0.f2635t == null) {
            xj0.f2635t = new ArrayList();
        }
        xj0.f2635t.add(yj0);
    }

    @Override // p000.InterfaceC6403m4
    public void closeDrawer(XJ0 xj0) {
        xj0.m8968s();
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public XJ0 createViewInstance(S91 s91) {
        XJ0 xj0 = new XJ0(s91);
        xj0.f13670I = 8388611;
        xj0.f13671J = -1;
        xj0.f13672K = false;
        AbstractC10944rk1.m24482n(xj0, new C7258zL(5));
        return xj0;
    }

    @Override // p000.InterfaceC6403m4
    public void openDrawer(XJ0 xj0) {
        xj0.m8969t();
    }

    @Override // p000.InterfaceC6403m4
    @InterfaceC9871jM0(customType = RemoteMessageAttributes.COLOR, name = "drawerBackgroundColor")
    public void setDrawerBackgroundColor(XJ0 xj0, Integer num) {
    }

    @Override // p000.InterfaceC6403m4
    @InterfaceC9871jM0(name = "drawerLockMode")
    public void setDrawerLockMode(XJ0 xj0, String str) {
        if (str == null || "unlocked".equals(str)) {
            xj0.setDrawerLockMode(0);
            return;
        }
        if ("locked-closed".equals(str)) {
            xj0.setDrawerLockMode(1);
        } else {
            if ("locked-open".equals(str)) {
                xj0.setDrawerLockMode(2);
                return;
            }
            "Unknown drawerLockMode ".concat(str);
            AbstractC3929dS.m17683p("ReactNative");
            xj0.setDrawerLockMode(0);
        }
    }

    @Override // p000.InterfaceC6403m4
    public void setDrawerPosition(XJ0 xj0, String str) {
        if (str == null) {
            xj0.m8970u(8388611);
        } else {
            setDrawerPositionInternal(xj0, str);
        }
    }

    @InterfaceC9871jM0(defaultFloat = Float.NaN, name = "drawerWidth")
    public void setDrawerWidth(XJ0 xj0, float f) {
        xj0.f13671J = Float.isNaN(f) ? -1 : Math.round(AbstractC11406vL1.m25403b(f));
        xj0.m8971v();
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, p000.InterfaceC0798Mg
    public void setElevation(XJ0 xj0, float f) {
        xj0.setDrawerElevation(AbstractC11406vL1.m25403b(f));
    }

    @Override // p000.InterfaceC6403m4
    @InterfaceC9871jM0(name = "keyboardDismissMode")
    public void setKeyboardDismissMode(XJ0 xj0, String str) {
    }

    @Override // p000.InterfaceC6403m4
    @InterfaceC9871jM0(customType = RemoteMessageAttributes.COLOR, name = "statusBarBackgroundColor")
    public void setStatusBarBackgroundColor(XJ0 xj0, Integer num) {
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager
    public void addView(XJ0 xj0, View view, int i) {
        if (getChildCount((ReactDrawerLayoutManager) xj0) >= 2) {
            throw new JSApplicationIllegalArgumentException("The Drawer cannot have more than two children");
        }
        if (i != 0 && i != 1) {
            throw new JSApplicationIllegalArgumentException(AbstractC7222ym.m26230g(i, "The only valid indices for drawer's child are 0 or 1. Got ", " instead."));
        }
        xj0.addView(view, i);
        xj0.m8971v();
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void receiveCommand(XJ0 xj0, int i, ReadableArray readableArray) {
        if (i == 1) {
            xj0.m8969t();
        } else {
            if (i != 2) {
                return;
            }
            xj0.m8968s();
        }
    }

    @InterfaceC9871jM0(name = "drawerPosition")
    public void setDrawerPosition(XJ0 xj0, Dynamic dynamic) {
        if (dynamic.isNull()) {
            xj0.m8970u(8388611);
            return;
        }
        if (dynamic.getType() == ReadableType.Number) {
            int iAsInt = dynamic.asInt();
            if (8388611 != iAsInt && 8388613 != iAsInt) {
                AbstractC3929dS.m17683p("ReactNative");
                xj0.m8970u(8388611);
                return;
            } else {
                xj0.m8970u(iAsInt);
                return;
            }
        }
        if (dynamic.getType() == ReadableType.String) {
            setDrawerPositionInternal(xj0, dynamic.asString());
        } else {
            AbstractC3929dS.m17683p("ReactNative");
            xj0.m8970u(8388611);
        }
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void receiveCommand(XJ0 xj0, String str, ReadableArray readableArray) {
        str.getClass();
        if (str.equals("closeDrawer")) {
            xj0.m8968s();
        } else if (str.equals("openDrawer")) {
            xj0.m8969t();
        }
    }

    @Override // p000.InterfaceC6403m4
    public void setDrawerWidth(XJ0 xj0, Float f) {
        xj0.f13671J = f == null ? -1 : Math.round(AbstractC11406vL1.m25403b(f.floatValue()));
        xj0.m8971v();
    }
}
