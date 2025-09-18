package com.facebook.react.views.switchview;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.widget.CompoundButton;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.SimpleViewManager;
import p000.AbstractC11406vL1;
import p000.AbstractC11746y12;
import p000.C10169lh0;
import p000.C6340l4;
import p000.EnumC7813Jp1;
import p000.InterfaceC0320F4;
import p000.InterfaceC7543Ek1;
import p000.InterfaceC9871jM0;
import p000.QM0;
import p000.RM0;
import p000.S91;
import p000.SM0;

/* loaded from: classes.dex */
public class ReactSwitchManager extends SimpleViewManager<QM0> implements InterfaceC0320F4 {
    private static final CompoundButton.OnCheckedChangeListener ON_CHECKED_CHANGE_LISTENER = new RM0();
    public static final String REACT_CLASS = "AndroidSwitch";
    private final InterfaceC7543Ek1 mDelegate = new C6340l4(this, 3);

    private static void setValueInternal(QM0 qm0, boolean z) throws Resources.NotFoundException {
        qm0.setOnCheckedChangeListener(null);
        qm0.m6673e(z);
        qm0.setOnCheckedChangeListener(ON_CHECKED_CHANGE_LISTENER);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    /* renamed from: getDelegate */
    public InterfaceC7543Ek1 getMDelegate() {
        return this.mDelegate;
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }

    @Override // com.facebook.react.uimanager.SimpleViewManager, com.facebook.react.uimanager.ViewManager
    public Class getShadowNodeClass() {
        return SM0.class;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public long measure(Context context, ReadableMap readableMap, ReadableMap readableMap2, ReadableMap readableMap3, float f, EnumC7813Jp1 enumC7813Jp1, float f2, EnumC7813Jp1 enumC7813Jp12, float[] fArr) {
        QM0 qm0 = new QM0(context);
        qm0.setShowText(false);
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        qm0.measure(iMakeMeasureSpec, iMakeMeasureSpec);
        return AbstractC11746y12.m26033b(AbstractC11406vL1.m25402a(qm0.getMeasuredWidth()), AbstractC11406vL1.m25402a(qm0.getMeasuredHeight()));
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void addEventEmitters(S91 s91, QM0 qm0) {
        qm0.setOnCheckedChangeListener(ON_CHECKED_CHANGE_LISTENER);
    }

    @Override // com.facebook.react.uimanager.SimpleViewManager, com.facebook.react.uimanager.ViewManager
    public C10169lh0 createShadowNodeInstance() {
        SM0 sm0 = new SM0();
        sm0.m2173D(sm0);
        return sm0;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public QM0 createViewInstance(S91 s91) {
        QM0 qm0 = new QM0(s91);
        qm0.setShowText(false);
        return qm0;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void receiveCommand(QM0 qm0, String str, ReadableArray readableArray) throws Resources.NotFoundException {
        str.getClass();
        if (str.equals("setNativeValue")) {
            boolean z = false;
            if (readableArray != null && readableArray.getBoolean(0)) {
                z = true;
            }
            setValueInternal(qm0, z);
        }
    }

    @Override // p000.InterfaceC0320F4
    @InterfaceC9871jM0(defaultBoolean = false, name = "disabled")
    public void setDisabled(QM0 qm0, boolean z) {
        qm0.setEnabled(!z);
    }

    @Override // p000.InterfaceC0320F4
    @InterfaceC9871jM0(defaultBoolean = true, name = "enabled")
    public void setEnabled(QM0 qm0, boolean z) {
        qm0.setEnabled(z);
    }

    @Override // p000.InterfaceC0320F4
    public void setNativeValue(QM0 qm0, boolean z) throws Resources.NotFoundException {
        setValueInternal(qm0, z);
    }

    @Override // p000.InterfaceC0320F4
    @InterfaceC9871jM0(name = "on")
    public void setOn(QM0 qm0, boolean z) throws Resources.NotFoundException {
        setValueInternal(qm0, z);
    }

    @Override // p000.InterfaceC0320F4
    @InterfaceC9871jM0(customType = RemoteMessageAttributes.COLOR, name = "thumbColor")
    public void setThumbColor(QM0 qm0, Integer num) {
        qm0.m6674f(num);
    }

    @Override // p000.InterfaceC0320F4
    @InterfaceC9871jM0(customType = RemoteMessageAttributes.COLOR, name = "thumbTintColor")
    public void setThumbTintColor(QM0 qm0, Integer num) {
        setThumbColor(qm0, num);
    }

    @Override // p000.InterfaceC0320F4
    @InterfaceC9871jM0(customType = RemoteMessageAttributes.COLOR, name = "trackColorForFalse")
    public void setTrackColorForFalse(QM0 qm0, Integer num) {
        if (num == qm0.f9598U) {
            return;
        }
        qm0.f9598U = num;
        if (qm0.isChecked()) {
            return;
        }
        qm0.m6675g(qm0.f9598U);
    }

    @Override // p000.InterfaceC0320F4
    @InterfaceC9871jM0(customType = RemoteMessageAttributes.COLOR, name = "trackColorForTrue")
    public void setTrackColorForTrue(QM0 qm0, Integer num) {
        if (num == qm0.f9599V) {
            return;
        }
        qm0.f9599V = num;
        if (qm0.isChecked()) {
            qm0.m6675g(qm0.f9599V);
        }
    }

    @Override // p000.InterfaceC0320F4
    @InterfaceC9871jM0(customType = RemoteMessageAttributes.COLOR, name = "trackTintColor")
    public void setTrackTintColor(QM0 qm0, Integer num) {
        qm0.m6675g(num);
    }

    @Override // p000.InterfaceC0320F4
    @InterfaceC9871jM0(name = "value")
    public void setValue(QM0 qm0, boolean z) throws Resources.NotFoundException {
        setValueInternal(qm0, z);
    }
}
