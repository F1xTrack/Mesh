package com.facebook.react.uimanager;

import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Paint;
import android.graphics.RenderEffect;
import android.graphics.Shader;
import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewParent;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableMapKeySetIterator;
import com.facebook.react.bridge.ReadableType;
import com.huawei.hms.p015rn.push.constants.LocalNotification;
import com.huawei.hms.p015rn.push.constants.RemoteMessageAttributes;
import com.swmansion.reanimated.layoutReanimation.Snapshot;
import com.yandex.varioqub.config.model.ConfigValue;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import p000.AbstractC10672pc1;
import p000.AbstractC10889rJ0;
import p000.AbstractC10944rk1;
import p000.AbstractC11147tK0;
import p000.AbstractC11406vL1;
import p000.AbstractC3929dS;
import p000.AbstractC7222ym;
import p000.AbstractC8301Sz1;
import p000.AbstractC8927c12;
import p000.AbstractC9536gk1;
import p000.C0926Oi;
import p000.C10169lh0;
import p000.C11079so0;
import p000.C11782yJ0;
import p000.C8326Tm0;
import p000.EnumC11528wJ0;
import p000.EnumC11655xJ0;
import p000.InterfaceC0798Mg;
import p000.InterfaceC10257mN0;
import p000.InterfaceC9871jM0;
import p000.O90;
import p000.R02;
import p000.S91;
import p000.UN1;
import p000.WB0;
import p000.XZ1;
import ru.mes.dnevnik.R;

/* loaded from: classes.dex */
public abstract class BaseViewManager<T extends View, C extends C10169lh0> extends ViewManager<T, C> implements InterfaceC0798Mg, View.OnLayoutChangeListener {
    private static final int PERSPECTIVE_ARRAY_INVERTED_CAMERA_DISTANCE_INDEX = 2;
    private static final String STATE_BUSY = "busy";
    private static final String STATE_CHECKED = "checked";
    private static final String STATE_EXPANDED = "expanded";
    private static final String STATE_MIXED = "mixed";
    private static final float CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER = (float) Math.sqrt(5.0d);
    private static final C11079so0 sMatrixDecompositionContext = new C11079so0();
    private static final double[] sTransformDecompositionArray = new double[16];

    public BaseViewManager() {
        super(null);
    }

    private void applyFilter(T t, ReadableArray readableArray) {
        ColorMatrix colorMatrix;
        ColorMatrix colorMatrixM10567e;
        String str;
        RenderEffect renderEffectM10563a;
        RenderEffect renderEffectM10563a2;
        ReadableArray readableArray2 = readableArray;
        if (Build.VERSION.SDK_INT >= 31) {
            t.setRenderEffect(null);
        }
        Boolean bool = (Boolean) t.getTag(R.id.use_hardware_layer);
        t.setLayerType((bool == null || !bool.booleanValue()) ? 0 : 2, null);
        if (readableArray2 == null) {
            return;
        }
        int size = readableArray.size();
        int i = 0;
        while (true) {
            String str2 = "null cannot be cast to non-null type kotlin.Double";
            if (i >= size) {
                Paint paint = new Paint();
                ColorMatrix colorMatrix2 = new ColorMatrix();
                int size2 = readableArray.size();
                int i2 = 0;
                while (i2 < size2) {
                    Map.Entry<String, Object> next = readableArray2.getMap(i2).getEntryIterator().next();
                    String key = next.getKey();
                    Object value = next.getValue();
                    O90.m5966d(value, "null cannot be cast to non-null type kotlin.Double");
                    float fDoubleValue = (float) ((Double) value).doubleValue();
                    switch (key.hashCode()) {
                        case -2114203985:
                            if (!key.equals("saturate")) {
                                throw new IllegalArgumentException("Invalid color matrix filter: ".concat(key));
                            }
                            colorMatrix = new ColorMatrix();
                            colorMatrix.setSaturation(fDoubleValue);
                            colorMatrixM10567e = colorMatrix;
                            colorMatrix2.preConcat(colorMatrixM10567e);
                            i2++;
                            readableArray2 = readableArray;
                        case -1267206133:
                            if (!key.equals("opacity")) {
                                throw new IllegalArgumentException("Invalid color matrix filter: ".concat(key));
                            }
                            colorMatrix = new ColorMatrix();
                            colorMatrix.setScale(1.0f, 1.0f, 1.0f, fDoubleValue);
                            colorMatrixM10567e = colorMatrix;
                            colorMatrix2.preConcat(colorMatrixM10567e);
                            i2++;
                            readableArray2 = readableArray;
                        case -1183703082:
                            if (!key.equals("invert")) {
                                throw new IllegalArgumentException("Invalid color matrix filter: ".concat(key));
                            }
                            colorMatrixM10567e = AbstractC8927c12.m10567e(fDoubleValue);
                            colorMatrix2.preConcat(colorMatrixM10567e);
                            i2++;
                            readableArray2 = readableArray;
                        case -905411385:
                            if (!key.equals("grayscale")) {
                                throw new IllegalArgumentException("Invalid color matrix filter: ".concat(key));
                            }
                            colorMatrixM10567e = AbstractC8927c12.m10565c(fDoubleValue);
                            colorMatrix2.preConcat(colorMatrixM10567e);
                            i2++;
                            readableArray2 = readableArray;
                        case -566947070:
                            if (!key.equals("contrast")) {
                                throw new IllegalArgumentException("Invalid color matrix filter: ".concat(key));
                            }
                            colorMatrixM10567e = AbstractC8927c12.m10564b(fDoubleValue);
                            colorMatrix2.preConcat(colorMatrixM10567e);
                            i2++;
                            readableArray2 = readableArray;
                        case 109324790:
                            if (!key.equals("sepia")) {
                                throw new IllegalArgumentException("Invalid color matrix filter: ".concat(key));
                            }
                            colorMatrixM10567e = AbstractC8927c12.m10568f(fDoubleValue);
                            colorMatrix2.preConcat(colorMatrixM10567e);
                            i2++;
                            readableArray2 = readableArray;
                        case 648162385:
                            if (!key.equals("brightness")) {
                                throw new IllegalArgumentException("Invalid color matrix filter: ".concat(key));
                            }
                            ColorMatrix colorMatrix3 = new ColorMatrix();
                            colorMatrix3.setScale(fDoubleValue, fDoubleValue, fDoubleValue, 1.0f);
                            colorMatrixM10567e = colorMatrix3;
                            colorMatrix2.preConcat(colorMatrixM10567e);
                            i2++;
                            readableArray2 = readableArray;
                        case 650888307:
                            if (!key.equals("hueRotate")) {
                                throw new IllegalArgumentException("Invalid color matrix filter: ".concat(key));
                            }
                            colorMatrixM10567e = AbstractC8927c12.m10566d(fDoubleValue);
                            colorMatrix2.preConcat(colorMatrixM10567e);
                            i2++;
                            readableArray2 = readableArray;
                        default:
                            throw new IllegalArgumentException("Invalid color matrix filter: ".concat(key));
                    }
                }
                paint.setColorFilter(new ColorMatrixColorFilter(colorMatrix2));
                t.setLayerType(2, paint);
                return;
            }
            String str3 = "blur";
            if (O90.m5963a(readableArray2.getMap(i).getEntryIterator().next().getKey(), "blur")) {
                if (Build.VERSION.SDK_INT >= 31) {
                    int size3 = readableArray.size();
                    int i3 = 0;
                    RenderEffect renderEffect = null;
                    while (i3 < size3) {
                        Map.Entry<String, Object> next2 = readableArray2.getMap(i3).getEntryIterator().next();
                        int i4 = size3;
                        String key2 = next2.getKey();
                        Object value2 = next2.getValue();
                        O90.m5966d(value2, str2);
                        String str4 = str2;
                        float fDoubleValue2 = (float) ((Double) value2).doubleValue();
                        switch (key2.hashCode()) {
                            case -2114203985:
                                str = str3;
                                if (!key2.equals("saturate")) {
                                    throw new IllegalArgumentException("Invalid filter name: ".concat(key2));
                                }
                                ColorMatrix colorMatrix4 = new ColorMatrix();
                                colorMatrix4.setSaturation(fDoubleValue2);
                                renderEffectM10563a = AbstractC8927c12.m10563a(colorMatrix4, renderEffect);
                                renderEffect = renderEffectM10563a;
                                i3++;
                                size3 = i4;
                                str2 = str4;
                                str3 = str;
                            case -1267206133:
                                str = str3;
                                if (!key2.equals("opacity")) {
                                    throw new IllegalArgumentException("Invalid filter name: ".concat(key2));
                                }
                                ColorMatrix colorMatrix5 = new ColorMatrix();
                                colorMatrix5.setScale(1.0f, 1.0f, 1.0f, fDoubleValue2);
                                renderEffectM10563a = AbstractC8927c12.m10563a(colorMatrix5, renderEffect);
                                renderEffect = renderEffectM10563a;
                                i3++;
                                size3 = i4;
                                str2 = str4;
                                str3 = str;
                            case -1183703082:
                                str = str3;
                                if (!key2.equals("invert")) {
                                    throw new IllegalArgumentException("Invalid filter name: ".concat(key2));
                                }
                                renderEffectM10563a = AbstractC8927c12.m10563a(AbstractC8927c12.m10567e(fDoubleValue2), renderEffect);
                                renderEffect = renderEffectM10563a;
                                i3++;
                                size3 = i4;
                                str2 = str4;
                                str3 = str;
                            case -905411385:
                                str = str3;
                                if (!key2.equals("grayscale")) {
                                    throw new IllegalArgumentException("Invalid filter name: ".concat(key2));
                                }
                                renderEffectM10563a = AbstractC8927c12.m10563a(AbstractC8927c12.m10565c(fDoubleValue2), renderEffect);
                                renderEffect = renderEffectM10563a;
                                i3++;
                                size3 = i4;
                                str2 = str4;
                                str3 = str;
                            case -566947070:
                                str = str3;
                                if (!key2.equals("contrast")) {
                                    throw new IllegalArgumentException("Invalid filter name: ".concat(key2));
                                }
                                renderEffectM10563a = AbstractC8927c12.m10563a(AbstractC8927c12.m10564b(fDoubleValue2), renderEffect);
                                renderEffect = renderEffectM10563a;
                                i3++;
                                size3 = i4;
                                str2 = str4;
                                str3 = str;
                            case 3027047:
                                if (!key2.equals(str3)) {
                                    throw new IllegalArgumentException("Invalid filter name: ".concat(key2));
                                }
                                str = str3;
                                if (fDoubleValue2 <= 0.5d) {
                                    renderEffectM10563a = null;
                                } else {
                                    float fM25403b = (AbstractC11406vL1.m25403b(fDoubleValue2) - 0.5f) / 0.57735f;
                                    renderEffectM10563a = renderEffect == null ? RenderEffect.createBlurEffect(fM25403b, fM25403b, Shader.TileMode.DECAL) : RenderEffect.createBlurEffect(fM25403b, fM25403b, renderEffect, Shader.TileMode.DECAL);
                                }
                                renderEffect = renderEffectM10563a;
                                i3++;
                                size3 = i4;
                                str2 = str4;
                                str3 = str;
                            case 109324790:
                                if (!key2.equals("sepia")) {
                                    throw new IllegalArgumentException("Invalid filter name: ".concat(key2));
                                }
                                renderEffectM10563a2 = AbstractC8927c12.m10563a(AbstractC8927c12.m10568f(fDoubleValue2), renderEffect);
                                renderEffect = renderEffectM10563a2;
                                str = str3;
                                i3++;
                                size3 = i4;
                                str2 = str4;
                                str3 = str;
                            case 648162385:
                                if (!key2.equals("brightness")) {
                                    throw new IllegalArgumentException("Invalid filter name: ".concat(key2));
                                }
                                ColorMatrix colorMatrix6 = new ColorMatrix();
                                colorMatrix6.setScale(fDoubleValue2, fDoubleValue2, fDoubleValue2, 1.0f);
                                renderEffectM10563a2 = AbstractC8927c12.m10563a(colorMatrix6, renderEffect);
                                renderEffect = renderEffectM10563a2;
                                str = str3;
                                i3++;
                                size3 = i4;
                                str2 = str4;
                                str3 = str;
                            case 650888307:
                                if (!key2.equals("hueRotate")) {
                                    throw new IllegalArgumentException("Invalid filter name: ".concat(key2));
                                }
                                renderEffectM10563a2 = AbstractC8927c12.m10563a(AbstractC8927c12.m10566d(fDoubleValue2), renderEffect);
                                renderEffect = renderEffectM10563a2;
                                str = str3;
                                i3++;
                                size3 = i4;
                                str2 = str4;
                                str3 = str;
                            default:
                                throw new IllegalArgumentException("Invalid filter name: ".concat(key2));
                        }
                    }
                    t.setRenderEffect(renderEffect);
                    return;
                }
                return;
            }
            i++;
        }
    }

    private void logUnsupportedPropertyWarning(String str) {
        AbstractC3929dS.m17684q("ReactNative", "%s doesn't support property '%s'", getName(), str);
    }

    private static float sanitizeFloatPropertyValue(float f) {
        if (f >= -3.4028235E38f && f <= Float.MAX_VALUE) {
            return f;
        }
        if (f < -3.4028235E38f || f == Float.NEGATIVE_INFINITY) {
            return -3.4028235E38f;
        }
        if (f > Float.MAX_VALUE || f == Float.POSITIVE_INFINITY) {
            return Float.MAX_VALUE;
        }
        if (Float.isNaN(f)) {
            return 0.0f;
        }
        throw new IllegalStateException("Invalid float property value: " + f);
    }

    private static void setPointerEventsFlag(View view, WB0 wb0, boolean z) {
        Integer num = (Integer) view.getTag(R.id.pointer_events);
        int iIntValue = num != null ? num.intValue() : 0;
        int iOrdinal = 1 << wb0.ordinal();
        view.setTag(R.id.pointer_events, Integer.valueOf(z ? iOrdinal | iIntValue : (~iOrdinal) & iIntValue));
    }

    private void updateViewAccessibility(T t) {
        boolean zIsFocusable = t.isFocusable();
        int importantForAccessibility = t.getImportantForAccessibility();
        int i = C11782yJ0.f46182v;
        if (AbstractC10944rk1.m24472d(t) != null) {
            return;
        }
        if (t.getTag(R.id.accessibility_role) == null && t.getTag(R.id.accessibility_state) == null && t.getTag(R.id.accessibility_actions) == null && t.getTag(R.id.react_test_id) == null && t.getTag(R.id.accessibility_collection_item) == null && t.getTag(R.id.accessibility_links) == null && t.getTag(R.id.role) == null) {
            return;
        }
        AbstractC10944rk1.m24482n(t, new C11782yJ0(importantForAccessibility, t, zIsFocusable));
    }

    private void updateViewContentDescription(T t) {
        Dynamic dynamic;
        String str = (String) t.getTag(R.id.accessibility_label);
        ReadableMap readableMap = (ReadableMap) t.getTag(R.id.accessibility_state);
        ArrayList arrayList = new ArrayList();
        ReadableMap readableMap2 = (ReadableMap) t.getTag(R.id.accessibility_value);
        if (str != null) {
            arrayList.add(str);
        }
        if (readableMap != null) {
            ReadableMapKeySetIterator readableMapKeySetIteratorKeySetIterator = readableMap.keySetIterator();
            while (readableMapKeySetIteratorKeySetIterator.hasNextKey()) {
                String strNextKey = readableMapKeySetIteratorKeySetIterator.nextKey();
                Dynamic dynamic2 = readableMap.getDynamic(strNextKey);
                if (strNextKey.equals(STATE_CHECKED) && dynamic2.getType() == ReadableType.String && dynamic2.asString().equals(STATE_MIXED)) {
                    arrayList.add(t.getContext().getString(R.string.state_mixed_description));
                } else if (strNextKey.equals(STATE_BUSY) && dynamic2.getType() == ReadableType.Boolean && dynamic2.asBoolean()) {
                    arrayList.add(t.getContext().getString(R.string.state_busy_description));
                }
            }
        }
        if (readableMap2 != null && readableMap2.hasKey("text") && (dynamic = readableMap2.getDynamic("text")) != null && dynamic.getType() == ReadableType.String) {
            arrayList.add(dynamic.asString());
        }
        if (arrayList.size() > 0) {
            t.setContentDescription(TextUtils.join(", ", arrayList));
        }
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public Map<String, Object> getExportedCustomBubblingEventTypeConstants() {
        Map<String, Object> exportedCustomDirectEventTypeConstants = super.getExportedCustomDirectEventTypeConstants();
        if (exportedCustomDirectEventTypeConstants == null) {
            exportedCustomDirectEventTypeConstants = new HashMap<>();
        }
        C0926Oi c0926OiM24254a = AbstractC10889rJ0.m24254a();
        c0926OiM24254a.m6125k("topPointerCancel", AbstractC10889rJ0.m24256c("phasedRegistrationNames", AbstractC10889rJ0.m24257d("bubbled", "onPointerCancel", "captured", "onPointerCancelCapture")));
        c0926OiM24254a.m6125k("topPointerDown", AbstractC10889rJ0.m24256c("phasedRegistrationNames", AbstractC10889rJ0.m24257d("bubbled", "onPointerDown", "captured", "onPointerDownCapture")));
        Boolean bool = Boolean.TRUE;
        c0926OiM24254a.m6125k("topPointerEnter", AbstractC10889rJ0.m24256c("phasedRegistrationNames", AbstractC10889rJ0.m24258e("bubbled", "onPointerEnter", "captured", "onPointerEnterCapture", "skipBubbling", bool)));
        c0926OiM24254a.m6125k("topPointerLeave", AbstractC10889rJ0.m24256c("phasedRegistrationNames", AbstractC10889rJ0.m24258e("bubbled", "onPointerLeave", "captured", "onPointerLeaveCapture", "skipBubbling", bool)));
        c0926OiM24254a.m6125k("topPointerMove", AbstractC10889rJ0.m24256c("phasedRegistrationNames", AbstractC10889rJ0.m24257d("bubbled", "onPointerMove", "captured", "onPointerMoveCapture")));
        c0926OiM24254a.m6125k("topPointerUp", AbstractC10889rJ0.m24256c("phasedRegistrationNames", AbstractC10889rJ0.m24257d("bubbled", "onPointerUp", "captured", "onPointerUpCapture")));
        c0926OiM24254a.m6125k("topPointerOut", AbstractC10889rJ0.m24256c("phasedRegistrationNames", AbstractC10889rJ0.m24257d("bubbled", "onPointerOut", "captured", "onPointerOutCapture")));
        c0926OiM24254a.m6125k("topPointerOver", AbstractC10889rJ0.m24256c("phasedRegistrationNames", AbstractC10889rJ0.m24257d("bubbled", "onPointerOver", "captured", "onPointerOverCapture")));
        c0926OiM24254a.m6125k("topClick", AbstractC10889rJ0.m24256c("phasedRegistrationNames", AbstractC10889rJ0.m24257d("bubbled", "onClick", "captured", "onClickCapture")));
        exportedCustomDirectEventTypeConstants.putAll(c0926OiM24254a.m6122h());
        return exportedCustomDirectEventTypeConstants;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public Map<String, Object> getExportedCustomDirectEventTypeConstants() {
        Map<String, Object> exportedCustomDirectEventTypeConstants = super.getExportedCustomDirectEventTypeConstants();
        if (exportedCustomDirectEventTypeConstants == null) {
            exportedCustomDirectEventTypeConstants = new HashMap<>();
        }
        C0926Oi c0926OiM24254a = AbstractC10889rJ0.m24254a();
        c0926OiM24254a.m6125k("topAccessibilityAction", AbstractC10889rJ0.m24256c("registrationName", "onAccessibilityAction"));
        exportedCustomDirectEventTypeConstants.putAll(c0926OiM24254a.m6122h());
        return exportedCustomDirectEventTypeConstants;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void onAfterUpdateTransaction(T t) {
        super.onAfterUpdateTransaction(t);
        updateViewAccessibility(t);
        Boolean bool = (Boolean) t.getTag(R.id.invalidate_transform);
        if (bool != null && bool.booleanValue()) {
            t.addOnLayoutChangeListener(this);
            setTransformProperty(t, (ReadableArray) t.getTag(R.id.transform), (ReadableArray) t.getTag(R.id.transform_origin));
            t.setTag(R.id.invalidate_transform, Boolean.FALSE);
        }
        Boolean bool2 = (Boolean) t.getTag(R.id.use_hardware_layer);
        if (bool2 != null) {
            t.setLayerType(bool2.booleanValue() ? 2 : 0, null);
        }
        applyFilter(t, (ReadableArray) t.getTag(R.id.filter));
    }

    @Override // android.view.View.OnLayoutChangeListener
    public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        int i9 = i7 - i5;
        int i10 = i3 - i;
        if (i4 - i2 == i8 - i6 && i10 == i9) {
            return;
        }
        ReadableArray readableArray = (ReadableArray) view.getTag(R.id.transform_origin);
        ReadableArray readableArray2 = (ReadableArray) view.getTag(R.id.transform);
        if (readableArray2 == null && readableArray == null) {
            return;
        }
        setTransformProperty(view, readableArray2, readableArray);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public T prepareToRecycleView(S91 s91, T t) {
        t.setTag(null);
        t.setTag(R.id.pointer_events, null);
        t.setTag(R.id.react_test_id, null);
        t.setTag(R.id.view_tag_native_id, null);
        t.setTag(R.id.labelled_by, null);
        t.setTag(R.id.accessibility_label, null);
        t.setTag(R.id.accessibility_hint, null);
        t.setTag(R.id.accessibility_role, null);
        t.setTag(R.id.accessibility_state, null);
        t.setTag(R.id.accessibility_actions, null);
        t.setTag(R.id.accessibility_value, null);
        t.setTag(R.id.accessibility_state_expanded, null);
        setTransformProperty(t, null, null);
        t.resetPivot();
        t.setTop(0);
        t.setBottom(0);
        t.setLeft(0);
        t.setRight(0);
        t.setElevation(0.0f);
        t.setAnimationMatrix(null);
        t.setTag(R.id.transform, null);
        t.setTag(R.id.transform_origin, null);
        t.setTag(R.id.invalidate_transform, null);
        t.removeOnLayoutChangeListener(this);
        t.setTag(R.id.use_hardware_layer, null);
        t.setTag(R.id.filter, null);
        applyFilter(t, null);
        if (Build.VERSION.SDK_INT >= 28) {
            t.setOutlineAmbientShadowColor(-16777216);
            t.setOutlineSpotShadowColor(-16777216);
        }
        t.setNextFocusDownId(-1);
        t.setNextFocusForwardId(-1);
        t.setNextFocusRightId(-1);
        t.setNextFocusUpId(-1);
        t.setFocusable(false);
        t.setFocusableInTouchMode(false);
        t.setElevation(0.0f);
        t.setAlpha(1.0f);
        setPadding(t, 0, 0, 0, 0);
        t.setForeground(null);
        return t;
    }

    @Override // p000.InterfaceC0798Mg
    @InterfaceC9871jM0(name = "accessibilityActions")
    public void setAccessibilityActions(T t, ReadableArray readableArray) {
        if (readableArray == null) {
            return;
        }
        t.setTag(R.id.accessibility_actions, readableArray);
    }

    @Override // p000.InterfaceC0798Mg
    @InterfaceC9871jM0(name = "accessibilityCollection")
    public void setAccessibilityCollection(T t, ReadableMap readableMap) {
        t.setTag(R.id.accessibility_collection, readableMap);
    }

    @Override // p000.InterfaceC0798Mg
    @InterfaceC9871jM0(name = "accessibilityCollectionItem")
    public void setAccessibilityCollectionItem(T t, ReadableMap readableMap) {
        t.setTag(R.id.accessibility_collection_item, readableMap);
    }

    @Override // p000.InterfaceC0798Mg
    @InterfaceC9871jM0(name = "accessibilityHint")
    public void setAccessibilityHint(T t, String str) {
        t.setTag(R.id.accessibility_hint, str);
        updateViewContentDescription(t);
    }

    @Override // p000.InterfaceC0798Mg
    @InterfaceC9871jM0(name = "accessibilityLabel")
    public void setAccessibilityLabel(T t, String str) {
        t.setTag(R.id.accessibility_label, str);
        updateViewContentDescription(t);
    }

    @Override // p000.InterfaceC0798Mg
    @InterfaceC9871jM0(name = "accessibilityLabelledBy")
    public void setAccessibilityLabelledBy(T t, Dynamic dynamic) {
        if (dynamic.isNull()) {
            return;
        }
        if (dynamic.getType() == ReadableType.String) {
            t.setTag(R.id.labelled_by, dynamic.asString());
        } else if (dynamic.getType() == ReadableType.Array) {
            t.setTag(R.id.labelled_by, dynamic.asArray().getString(0));
        }
    }

    @Override // p000.InterfaceC0798Mg
    @InterfaceC9871jM0(name = "accessibilityLiveRegion")
    public void setAccessibilityLiveRegion(T t, String str) {
        if (str == null || str.equals(LocalNotification.Importance.NONE)) {
            WeakHashMap weakHashMap = AbstractC10944rk1.f41842a;
            t.setAccessibilityLiveRegion(0);
        } else if (str.equals("polite")) {
            WeakHashMap weakHashMap2 = AbstractC10944rk1.f41842a;
            t.setAccessibilityLiveRegion(1);
        } else if (str.equals("assertive")) {
            WeakHashMap weakHashMap3 = AbstractC10944rk1.f41842a;
            t.setAccessibilityLiveRegion(2);
        }
    }

    @Override // p000.InterfaceC0798Mg
    @InterfaceC9871jM0(name = "accessibilityRole")
    public void setAccessibilityRole(T t, String str) {
        if (str == null) {
            t.setTag(R.id.accessibility_role, null);
        } else {
            t.setTag(R.id.accessibility_role, EnumC11528wJ0.m25593a(str));
        }
    }

    @InterfaceC9871jM0(name = "accessibilityValue")
    public void setAccessibilityValue(T t, ReadableMap readableMap) {
        if (readableMap == null) {
            t.setTag(R.id.accessibility_value, null);
            t.setContentDescription(null);
        } else {
            t.setTag(R.id.accessibility_value, readableMap);
            if (readableMap.hasKey("text")) {
                updateViewContentDescription(t);
            }
        }
    }

    @Override // p000.InterfaceC0798Mg
    @InterfaceC9871jM0(customType = RemoteMessageAttributes.COLOR, defaultInt = 0, name = "backgroundColor")
    public void setBackgroundColor(T t, int i) {
        t.setBackgroundColor(i);
    }

    @Override // p000.InterfaceC0798Mg
    public void setBorderBottomLeftRadius(T t, float f) {
        logUnsupportedPropertyWarning(Snapshot.BORDER_BOTTOM_LEFT_RADIUS);
    }

    @Override // p000.InterfaceC0798Mg
    public void setBorderBottomRightRadius(T t, float f) {
        logUnsupportedPropertyWarning(Snapshot.BORDER_BOTTOM_RIGHT_RADIUS);
    }

    @Override // p000.InterfaceC0798Mg
    public void setBorderRadius(T t, float f) {
        logUnsupportedPropertyWarning(Snapshot.BORDER_RADIUS);
    }

    @Override // p000.InterfaceC0798Mg
    public void setBorderTopLeftRadius(T t, float f) {
        logUnsupportedPropertyWarning(Snapshot.BORDER_TOP_LEFT_RADIUS);
    }

    @Override // p000.InterfaceC0798Mg
    public void setBorderTopRightRadius(T t, float f) {
        logUnsupportedPropertyWarning(Snapshot.BORDER_TOP_RIGHT_RADIUS);
    }

    @InterfaceC9871jM0(name = "onClick")
    public void setClick(T t, boolean z) {
        setPointerEventsFlag(t, WB0.f13040c, z);
    }

    @InterfaceC9871jM0(name = "onClickCapture")
    public void setClickCapture(T t, boolean z) {
        setPointerEventsFlag(t, WB0.f13041d, z);
    }

    @Override // p000.InterfaceC0798Mg
    @InterfaceC9871jM0(name = "elevation")
    public void setElevation(T t, float f) {
        float fM25403b = AbstractC11406vL1.m25403b(f);
        WeakHashMap weakHashMap = AbstractC10944rk1.f41842a;
        AbstractC9536gk1.m18624s(t, fM25403b);
    }

    @InterfaceC9871jM0(customType = "Filter", name = "experimental_filter")
    public void setFilter(T t, ReadableArray readableArray) {
        t.setTag(R.id.filter, readableArray);
    }

    @Override // p000.InterfaceC0798Mg
    @InterfaceC9871jM0(name = "importantForAccessibility")
    public void setImportantForAccessibility(T t, String str) {
        if (str == null || str.equals("auto")) {
            WeakHashMap weakHashMap = AbstractC10944rk1.f41842a;
            t.setImportantForAccessibility(0);
            return;
        }
        if (str.equals("yes")) {
            WeakHashMap weakHashMap2 = AbstractC10944rk1.f41842a;
            t.setImportantForAccessibility(1);
        } else if (str.equals("no")) {
            WeakHashMap weakHashMap3 = AbstractC10944rk1.f41842a;
            t.setImportantForAccessibility(2);
        } else if (str.equals("no-hide-descendants")) {
            WeakHashMap weakHashMap4 = AbstractC10944rk1.f41842a;
            t.setImportantForAccessibility(4);
        }
    }

    @InterfaceC9871jM0(name = "onMoveShouldSetResponder")
    public void setMoveShouldSetResponder(T t, boolean z) {
    }

    @InterfaceC9871jM0(name = "onMoveShouldSetResponderCapture")
    public void setMoveShouldSetResponderCapture(T t, boolean z) {
    }

    @Override // p000.InterfaceC0798Mg
    @InterfaceC9871jM0(name = "nativeID")
    public void setNativeId(T t, String str) {
        t.setTag(R.id.view_tag_native_id, str);
        ArrayList arrayList = AbstractC11147tK0.f42994a;
        Object tag = t.getTag(R.id.view_tag_native_id);
        String str2 = tag instanceof String ? (String) tag : null;
        if (str2 == null) {
            return;
        }
        Iterator it = AbstractC11147tK0.f42994a.iterator();
        if (it.hasNext()) {
            throw AbstractC7222ym.m26227d(it);
        }
        for (Map.Entry entry : AbstractC11147tK0.f42995b.entrySet()) {
            Set set = (Set) entry.getValue();
            if (set != null && set.contains(str2)) {
                entry.getKey().getClass();
                throw new ClassCastException();
            }
        }
    }

    @Override // p000.InterfaceC0798Mg
    @InterfaceC9871jM0(defaultFloat = 1.0f, name = "opacity")
    public void setOpacity(T t, float f) {
        t.setAlpha(f);
    }

    @InterfaceC9871jM0(name = "onPointerEnter")
    public void setPointerEnter(T t, boolean z) {
        setPointerEventsFlag(t, WB0.f13044g, z);
    }

    @InterfaceC9871jM0(name = "onPointerEnterCapture")
    public void setPointerEnterCapture(T t, boolean z) {
        setPointerEventsFlag(t, WB0.f13045h, z);
    }

    @InterfaceC9871jM0(name = "onPointerLeave")
    public void setPointerLeave(T t, boolean z) {
        setPointerEventsFlag(t, WB0.f13046i, z);
    }

    @InterfaceC9871jM0(name = "onPointerLeaveCapture")
    public void setPointerLeaveCapture(T t, boolean z) {
        setPointerEventsFlag(t, WB0.f13047j, z);
    }

    @InterfaceC9871jM0(name = "onPointerMove")
    public void setPointerMove(T t, boolean z) {
        setPointerEventsFlag(t, WB0.f13048k, z);
    }

    @InterfaceC9871jM0(name = "onPointerMoveCapture")
    public void setPointerMoveCapture(T t, boolean z) {
        setPointerEventsFlag(t, WB0.f13049l, z);
    }

    @InterfaceC9871jM0(name = "onPointerOut")
    public void setPointerOut(T t, boolean z) {
        setPointerEventsFlag(t, WB0.f13052o, z);
    }

    @InterfaceC9871jM0(name = "onPointerOutCapture")
    public void setPointerOutCapture(T t, boolean z) {
        setPointerEventsFlag(t, WB0.f13053p, z);
    }

    @InterfaceC9871jM0(name = "onPointerOver")
    public void setPointerOver(T t, boolean z) {
        setPointerEventsFlag(t, WB0.f13054q, z);
    }

    @InterfaceC9871jM0(name = "onPointerOverCapture")
    public void setPointerOverCapture(T t, boolean z) {
        setPointerEventsFlag(t, WB0.f13055r, z);
    }

    @Override // p000.InterfaceC0798Mg
    @InterfaceC9871jM0(name = "renderToHardwareTextureAndroid")
    public void setRenderToHardwareTexture(T t, boolean z) {
        t.setTag(R.id.use_hardware_layer, Boolean.valueOf(z));
    }

    @InterfaceC9871jM0(name = "onResponderEnd")
    public void setResponderEnd(T t, boolean z) {
    }

    @InterfaceC9871jM0(name = "onResponderGrant")
    public void setResponderGrant(T t, boolean z) {
    }

    @InterfaceC9871jM0(name = "onResponderMove")
    public void setResponderMove(T t, boolean z) {
    }

    @InterfaceC9871jM0(name = "onResponderReject")
    public void setResponderReject(T t, boolean z) {
    }

    @InterfaceC9871jM0(name = "onResponderRelease")
    public void setResponderRelease(T t, boolean z) {
    }

    @InterfaceC9871jM0(name = "onResponderStart")
    public void setResponderStart(T t, boolean z) {
    }

    @InterfaceC9871jM0(name = "onResponderTerminate")
    public void setResponderTerminate(T t, boolean z) {
    }

    @InterfaceC9871jM0(name = "onResponderTerminationRequest")
    public void setResponderTerminationRequest(T t, boolean z) {
    }

    @Override // p000.InterfaceC0798Mg
    @InterfaceC9871jM0(name = "role")
    public void setRole(T t, String str) {
        EnumC11655xJ0 enumC11655xJ0 = null;
        if (str == null) {
            t.setTag(R.id.role, null);
            return;
        }
        EnumC11655xJ0[] enumC11655xJ0ArrValues = EnumC11655xJ0.values();
        int length = enumC11655xJ0ArrValues.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            }
            EnumC11655xJ0 enumC11655xJ02 = enumC11655xJ0ArrValues[i];
            if (enumC11655xJ02.name().equalsIgnoreCase(str)) {
                enumC11655xJ0 = enumC11655xJ02;
                break;
            }
            i++;
        }
        t.setTag(R.id.role, enumC11655xJ0);
    }

    @Override // p000.InterfaceC0798Mg
    @InterfaceC9871jM0(name = "rotation")
    @Deprecated
    public void setRotation(T t, float f) {
        t.setRotation(f);
    }

    @Override // p000.InterfaceC0798Mg
    @InterfaceC9871jM0(defaultFloat = 1.0f, name = "scaleX")
    @Deprecated
    public void setScaleX(T t, float f) {
        t.setScaleX(f);
    }

    @Override // p000.InterfaceC0798Mg
    @InterfaceC9871jM0(defaultFloat = 1.0f, name = "scaleY")
    @Deprecated
    public void setScaleY(T t, float f) {
        t.setScaleY(f);
    }

    @Override // p000.InterfaceC0798Mg
    @InterfaceC9871jM0(customType = RemoteMessageAttributes.COLOR, defaultInt = -16777216, name = "shadowColor")
    public void setShadowColor(T t, int i) {
        if (Build.VERSION.SDK_INT >= 28) {
            t.setOutlineAmbientShadowColor(i);
            t.setOutlineSpotShadowColor(i);
        }
    }

    @InterfaceC9871jM0(name = "onShouldBlockNativeResponder")
    public void setShouldBlockNativeResponder(T t, boolean z) {
    }

    @InterfaceC9871jM0(name = "onStartShouldSetResponder")
    public void setStartShouldSetResponder(T t, boolean z) {
    }

    @InterfaceC9871jM0(name = "onStartShouldSetResponderCapture")
    public void setStartShouldSetResponderCapture(T t, boolean z) {
    }

    @Override // p000.InterfaceC0798Mg
    @InterfaceC9871jM0(name = "testID")
    public void setTestId(T t, String str) {
        t.setTag(R.id.react_test_id, str);
        t.setTag(str);
    }

    @InterfaceC9871jM0(name = "onTouchCancel")
    public void setTouchCancel(T t, boolean z) {
    }

    @InterfaceC9871jM0(name = "onTouchEnd")
    public void setTouchEnd(T t, boolean z) {
    }

    @InterfaceC9871jM0(name = "onTouchMove")
    public void setTouchMove(T t, boolean z) {
    }

    @InterfaceC9871jM0(name = "onTouchStart")
    public void setTouchStart(T t, boolean z) {
    }

    @Override // p000.InterfaceC0798Mg
    @InterfaceC9871jM0(name = "transform")
    public void setTransform(T t, ReadableArray readableArray) {
        t.setTag(R.id.transform, readableArray);
        t.setTag(R.id.invalidate_transform, Boolean.TRUE);
    }

    @Override // p000.InterfaceC0798Mg
    @InterfaceC9871jM0(name = "transformOrigin")
    public void setTransformOrigin(T t, ReadableArray readableArray) {
        t.setTag(R.id.transform_origin, readableArray);
        t.setTag(R.id.invalidate_transform, Boolean.TRUE);
    }

    public void setTransformProperty(T t, ReadableArray readableArray, ReadableArray readableArray2) {
        if (readableArray == null) {
            t.setTranslationX(AbstractC11406vL1.m25403b(0.0f));
            t.setTranslationY(AbstractC11406vL1.m25403b(0.0f));
            t.setRotation(0.0f);
            t.setRotationX(0.0f);
            t.setRotationY(0.0f);
            t.setScaleX(1.0f);
            t.setScaleY(1.0f);
            t.setCameraDistance(0.0f);
            return;
        }
        O90.m5968f(t, "view");
        boolean z = R02.m6874b(t.getId()) == 2;
        C11079so0 c11079so0 = sMatrixDecompositionContext;
        C8326Tm0.m7739n(c11079so0.f42603a);
        C8326Tm0.m7739n(c11079so0.f42604b);
        C8326Tm0.m7739n(c11079so0.f42605c);
        C8326Tm0.m7739n(c11079so0.f42606d);
        C8326Tm0.m7739n(c11079so0.f42607e);
        double[] dArr = sTransformDecompositionArray;
        AbstractC10672pc1.m23823c(readableArray, dArr, AbstractC11406vL1.m25402a(t.getWidth()), AbstractC11406vL1.m25402a(t.getHeight()), readableArray2, z);
        UN1.m7997a(dArr.length == 16);
        if (!AbstractC8301Sz1.m7486i(dArr[15])) {
            double[][] dArr2 = new double[4][];
            for (int i = 0; i < 4; i++) {
                dArr2[i] = new double[4];
            }
            double[] dArr3 = new double[16];
            for (int i2 = 0; i2 < 4; i2++) {
                for (int i3 = 0; i3 < 4; i3++) {
                    int i4 = (i2 * 4) + i3;
                    double d = dArr[i4] / dArr[15];
                    dArr2[i2][i3] = d;
                    if (i3 == 3) {
                        d = 0.0d;
                    }
                    dArr3[i4] = d;
                }
            }
            dArr3[15] = 1.0d;
            if (!AbstractC8301Sz1.m7486i(AbstractC8301Sz1.m7481d(dArr3))) {
                boolean zM7486i = AbstractC8301Sz1.m7486i(dArr2[0][3]);
                double[] dArr4 = c11079so0.f42603a;
                if (zM7486i && AbstractC8301Sz1.m7486i(dArr2[1][3]) && AbstractC8301Sz1.m7486i(dArr2[2][3])) {
                    dArr4[2] = 0.0d;
                    dArr4[1] = 0.0d;
                    dArr4[0] = 0.0d;
                    dArr4[3] = 1.0d;
                } else {
                    AbstractC8301Sz1.m7488k(new double[]{dArr2[0][3], dArr2[1][3], dArr2[2][3], dArr2[3][3]}, AbstractC8301Sz1.m7496s(AbstractC8301Sz1.m7485h(dArr3)), dArr4);
                }
                for (int i5 = 0; i5 < 3; i5++) {
                    c11079so0.f42606d[i5] = dArr2[3][i5];
                }
                double[][] dArr5 = new double[3][];
                for (int i6 = 0; i6 < 3; i6++) {
                    dArr5[i6] = new double[3];
                }
                for (int i7 = 0; i7 < 3; i7++) {
                    double[] dArr6 = dArr5[i7];
                    double[] dArr7 = dArr2[i7];
                    dArr6[0] = dArr7[0];
                    dArr6[1] = dArr7[1];
                    dArr6[2] = dArr7[2];
                }
                double dM7500w = AbstractC8301Sz1.m7500w(dArr5[0]);
                double[] dArr8 = c11079so0.f42604b;
                dArr8[0] = dM7500w;
                double[] dArrM7501x = AbstractC8301Sz1.m7501x(dM7500w, dArr5[0]);
                dArr5[0] = dArrM7501x;
                double dM7499v = AbstractC8301Sz1.m7499v(dArrM7501x, dArr5[1]);
                double[] dArr9 = c11079so0.f42605c;
                dArr9[0] = dM7499v;
                double[] dArrM7497t = AbstractC8301Sz1.m7497t(dArr5[1], dArr5[0], -dM7499v);
                dArr5[1] = dArrM7497t;
                double dM7500w2 = AbstractC8301Sz1.m7500w(dArrM7497t);
                dArr8[1] = dM7500w2;
                dArr5[1] = AbstractC8301Sz1.m7501x(dM7500w2, dArr5[1]);
                dArr9[0] = dArr9[0] / dArr8[1];
                double dM7499v2 = AbstractC8301Sz1.m7499v(dArr5[0], dArr5[2]);
                dArr9[1] = dM7499v2;
                double[] dArrM7497t2 = AbstractC8301Sz1.m7497t(dArr5[2], dArr5[0], -dM7499v2);
                dArr5[2] = dArrM7497t2;
                double dM7499v3 = AbstractC8301Sz1.m7499v(dArr5[1], dArrM7497t2);
                dArr9[2] = dM7499v3;
                double[] dArrM7497t3 = AbstractC8301Sz1.m7497t(dArr5[2], dArr5[1], -dM7499v3);
                dArr5[2] = dArrM7497t3;
                double dM7500w3 = AbstractC8301Sz1.m7500w(dArrM7497t3);
                dArr8[2] = dM7500w3;
                double[] dArrM7501x2 = AbstractC8301Sz1.m7501x(dM7500w3, dArr5[2]);
                dArr5[2] = dArrM7501x2;
                double d2 = dArr9[1];
                double d3 = dArr8[2];
                dArr9[1] = d2 / d3;
                dArr9[2] = dArr9[2] / d3;
                if (AbstractC8301Sz1.m7499v(dArr5[0], AbstractC8301Sz1.m7498u(dArr5[1], dArrM7501x2)) < ConfigValue.DOUBLE_DEFAULT_VALUE) {
                    for (int i8 = 0; i8 < 3; i8++) {
                        dArr8[i8] = dArr8[i8] * (-1.0d);
                        double[] dArr10 = dArr5[i8];
                        dArr10[0] = dArr10[0] * (-1.0d);
                        dArr10[1] = dArr10[1] * (-1.0d);
                        dArr10[2] = dArr10[2] * (-1.0d);
                    }
                }
                double[] dArr11 = dArr5[2];
                double dM7493p = AbstractC8301Sz1.m7493p((-Math.atan2(dArr11[1], dArr11[2])) * 57.29577951308232d);
                double[] dArr12 = c11079so0.f42607e;
                dArr12[0] = dM7493p;
                double[] dArr13 = dArr5[2];
                double d4 = -dArr13[0];
                double d5 = dArr13[1];
                double d6 = dArr13[2];
                dArr12[1] = AbstractC8301Sz1.m7493p((-Math.atan2(d4, Math.sqrt((d6 * d6) + (d5 * d5)))) * 57.29577951308232d);
                dArr12[2] = AbstractC8301Sz1.m7493p((-Math.atan2(dArr5[1][0], dArr5[0][0])) * 57.29577951308232d);
            }
        }
        C11079so0 c11079so02 = sMatrixDecompositionContext;
        t.setTranslationX(AbstractC11406vL1.m25403b(sanitizeFloatPropertyValue((float) c11079so02.f42606d[0])));
        t.setTranslationY(AbstractC11406vL1.m25403b(sanitizeFloatPropertyValue((float) c11079so02.f42606d[1])));
        t.setRotation(sanitizeFloatPropertyValue((float) c11079so02.f42607e[2]));
        t.setRotationX(sanitizeFloatPropertyValue((float) c11079so02.f42607e[0]));
        t.setRotationY(sanitizeFloatPropertyValue((float) c11079so02.f42607e[1]));
        t.setScaleX(sanitizeFloatPropertyValue((float) c11079so02.f42604b[0]));
        t.setScaleY(sanitizeFloatPropertyValue((float) c11079so02.f42604b[1]));
        double[] dArr14 = c11079so02.f42603a;
        if (dArr14.length > 2) {
            float f = (float) dArr14[2];
            if (f == 0.0f) {
                f = 7.8125E-4f;
            }
            float f2 = (-1.0f) / f;
            float f3 = XZ1.m9087c().density;
            t.setCameraDistance(sanitizeFloatPropertyValue(f3 * f3 * f2 * CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER));
        }
    }

    @Override // p000.InterfaceC0798Mg
    @InterfaceC9871jM0(defaultFloat = 0.0f, name = "translateX")
    @Deprecated
    public void setTranslateX(T t, float f) {
        t.setTranslationX(AbstractC11406vL1.m25403b(f));
    }

    @Override // p000.InterfaceC0798Mg
    @InterfaceC9871jM0(defaultFloat = 0.0f, name = "translateY")
    @Deprecated
    public void setTranslateY(T t, float f) {
        t.setTranslationY(AbstractC11406vL1.m25403b(f));
    }

    @Override // p000.InterfaceC0798Mg
    @InterfaceC9871jM0(name = "accessibilityState")
    public void setViewState(T t, ReadableMap readableMap) {
        if (readableMap == null) {
            return;
        }
        if (readableMap.hasKey(STATE_EXPANDED)) {
            t.setTag(R.id.accessibility_state_expanded, Boolean.valueOf(readableMap.getBoolean(STATE_EXPANDED)));
        }
        if (readableMap.hasKey("selected")) {
            boolean zIsSelected = t.isSelected();
            boolean z = readableMap.getBoolean("selected");
            t.setSelected(z);
            if (t.isAccessibilityFocused() && zIsSelected && !z) {
                t.announceForAccessibility(t.getContext().getString(R.string.state_unselected_description));
            }
        } else {
            t.setSelected(false);
        }
        t.setTag(R.id.accessibility_state, readableMap);
        if (readableMap.hasKey("disabled") && !readableMap.getBoolean("disabled")) {
            t.setEnabled(true);
        }
        ReadableMapKeySetIterator readableMapKeySetIteratorKeySetIterator = readableMap.keySetIterator();
        while (readableMapKeySetIteratorKeySetIterator.hasNextKey()) {
            String strNextKey = readableMapKeySetIteratorKeySetIterator.nextKey();
            if (strNextKey.equals(STATE_BUSY) || strNextKey.equals(STATE_EXPANDED) || (strNextKey.equals(STATE_CHECKED) && readableMap.getType(STATE_CHECKED) == ReadableType.String)) {
                updateViewContentDescription(t);
                return;
            } else if (t.isAccessibilityFocused()) {
                t.sendAccessibilityEvent(1);
            }
        }
    }

    @Override // p000.InterfaceC0798Mg
    @InterfaceC9871jM0(name = "zIndex")
    public void setZIndex(T t, float f) {
        ViewGroupManager.setViewZIndex(t, Math.round(f));
        ViewParent parent = t.getParent();
        if (parent instanceof InterfaceC10257mN0) {
            ((InterfaceC10257mN0) parent).updateDrawingOrder();
        }
    }

    public BaseViewManager(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }
}
