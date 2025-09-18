package com.facebook.react.views.text;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.view.View;
import com.facebook.react.uimanager.BaseViewManager;
import com.huawei.hms.p015rn.push.constants.LocalNotification;
import com.huawei.hms.p015rn.push.constants.RemoteMessageAttributes;
import com.swmansion.reanimated.layoutReanimation.Snapshot;
import java.lang.reflect.InvocationTargetException;
import p000.AbstractC11406vL1;
import p000.AbstractC11619x12;
import p000.AbstractC3929dS;
import p000.C9105dN0;
import p000.InterfaceC9871jM0;
import p000.InterfaceC9999kM0;
import p000.KJ0;
import p000.O90;

/* loaded from: classes.dex */
public abstract class ReactTextAnchorViewManager<T extends View, C extends KJ0> extends BaseViewManager<T, C> {
    private static final int[] SPACING_TYPES = {8, 0, 2, 1, 3};
    private static final String TAG = "ReactTextAnchorViewManager";

    @InterfaceC9871jM0(name = "accessible")
    public void setAccessible(C9105dN0 c9105dN0, boolean z) {
        c9105dN0.setFocusable(z);
    }

    @InterfaceC9871jM0(name = "adjustsFontSizeToFit")
    public void setAdjustFontSizeToFit(C9105dN0 c9105dN0, boolean z) {
        c9105dN0.setAdjustFontSizeToFit(z);
    }

    @InterfaceC9871jM0(name = "android_hyphenationFrequency")
    public void setAndroidHyphenationFrequency(C9105dN0 c9105dN0, String str) {
        if (str == null || str.equals(LocalNotification.Importance.NONE)) {
            c9105dN0.setHyphenationFrequency(0);
            return;
        }
        if (str.equals("full")) {
            c9105dN0.setHyphenationFrequency(2);
        } else {
            if (str.equals("normal")) {
                c9105dN0.setHyphenationFrequency(1);
                return;
            }
            "Invalid android_hyphenationFrequency: ".concat(str);
            AbstractC3929dS.m17683p("ReactNative");
            c9105dN0.setHyphenationFrequency(0);
        }
    }

    @InterfaceC9999kM0(customType = RemoteMessageAttributes.COLOR, names = {"borderColor", "borderLeftColor", "borderRightColor", "borderTopColor", "borderBottomColor"})
    public void setBorderColor(C9105dN0 c9105dN0, int i, Integer num) {
        c9105dN0.f26007s.m8469G().m7441i(SPACING_TYPES[i], num == null ? Float.NaN : num.intValue() & 16777215, num != null ? num.intValue() >>> 24 : Float.NaN);
    }

    @InterfaceC9999kM0(defaultFloat = Float.NaN, names = {Snapshot.BORDER_RADIUS, Snapshot.BORDER_TOP_LEFT_RADIUS, Snapshot.BORDER_TOP_RIGHT_RADIUS, Snapshot.BORDER_BOTTOM_RIGHT_RADIUS, Snapshot.BORDER_BOTTOM_LEFT_RADIUS})
    public void setBorderRadius(C9105dN0 c9105dN0, int i, float f) {
        if (!AbstractC11619x12.m25735a(f)) {
            f = AbstractC11406vL1.m25403b(f);
        }
        if (i == 0) {
            c9105dN0.setBorderRadius(f);
        } else {
            c9105dN0.f26007s.m8469G().m7445m(f, i - 1);
        }
    }

    @InterfaceC9871jM0(name = "borderStyle")
    public void setBorderStyle(C9105dN0 c9105dN0, String str) {
        c9105dN0.setBorderStyle(str);
    }

    @InterfaceC9999kM0(defaultFloat = Float.NaN, names = {"borderWidth", "borderLeftWidth", "borderRightWidth", "borderTopWidth", "borderBottomWidth"})
    public void setBorderWidth(C9105dN0 c9105dN0, int i, float f) {
        if (!AbstractC11619x12.m25735a(f)) {
            f = AbstractC11406vL1.m25403b(f);
        }
        c9105dN0.f26007s.m8469G().m7443k(SPACING_TYPES[i], f);
    }

    @InterfaceC9871jM0(name = "dataDetectorType")
    public void setDataDetectorType(C9105dN0 c9105dN0, String str) {
        if (str != null) {
            switch (str) {
                case "phoneNumber":
                    c9105dN0.setLinkifyMask(4);
                    break;
                case "all":
                    c9105dN0.setLinkifyMask(15);
                    break;
                case "link":
                    c9105dN0.setLinkifyMask(1);
                    break;
                case "email":
                    c9105dN0.setLinkifyMask(2);
                    break;
            }
            return;
        }
        c9105dN0.setLinkifyMask(0);
    }

    @InterfaceC9871jM0(defaultBoolean = false, name = "disabled")
    public void setDisabled(C9105dN0 c9105dN0, boolean z) {
        c9105dN0.setEnabled(!z);
    }

    @InterfaceC9871jM0(name = "ellipsizeMode")
    public void setEllipsizeMode(C9105dN0 c9105dN0, String str) {
        if (str == null || str.equals("tail")) {
            c9105dN0.setEllipsizeLocation(TextUtils.TruncateAt.END);
            return;
        }
        if (str.equals("head")) {
            c9105dN0.setEllipsizeLocation(TextUtils.TruncateAt.START);
            return;
        }
        if (str.equals("middle")) {
            c9105dN0.setEllipsizeLocation(TextUtils.TruncateAt.MIDDLE);
        } else {
            if (str.equals("clip")) {
                c9105dN0.setEllipsizeLocation(null);
                return;
            }
            "Invalid ellipsizeMode: ".concat(str);
            AbstractC3929dS.m17683p("ReactNative");
            c9105dN0.setEllipsizeLocation(TextUtils.TruncateAt.END);
        }
    }

    @InterfaceC9871jM0(name = "fontSize")
    public void setFontSize(C9105dN0 c9105dN0, float f) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        c9105dN0.setFontSize(f);
    }

    @InterfaceC9871jM0(defaultBoolean = true, name = "includeFontPadding")
    public void setIncludeFontPadding(C9105dN0 c9105dN0, boolean z) {
        c9105dN0.setIncludeFontPadding(z);
    }

    @InterfaceC9871jM0(defaultFloat = 0.0f, name = "letterSpacing")
    public void setLetterSpacing(C9105dN0 c9105dN0, float f) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        c9105dN0.setLetterSpacing(f);
    }

    @InterfaceC9871jM0(name = "onInlineViewLayout")
    public void setNotifyOnInlineViewLayout(C9105dN0 c9105dN0, boolean z) {
        c9105dN0.setNotifyOnInlineViewLayout(z);
    }

    @InterfaceC9871jM0(defaultInt = Integer.MAX_VALUE, name = "numberOfLines")
    public void setNumberOfLines(C9105dN0 c9105dN0, int i) {
        c9105dN0.setNumberOfLines(i);
    }

    @InterfaceC9871jM0(name = "selectable")
    public void setSelectable(C9105dN0 c9105dN0, boolean z) {
        c9105dN0.setTextIsSelectable(z);
    }

    @InterfaceC9871jM0(customType = RemoteMessageAttributes.COLOR, name = "selectionColor")
    public void setSelectionColor(C9105dN0 c9105dN0, Integer num) {
        if (num != null) {
            c9105dN0.setHighlightColor(num.intValue());
            return;
        }
        Context context = c9105dN0.getContext();
        O90.m5968f(context, "context");
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{R.attr.textColorHighlight});
        O90.m5967e(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
        ColorStateList colorStateList = typedArrayObtainStyledAttributes.getColorStateList(0);
        c9105dN0.setHighlightColor(colorStateList != null ? colorStateList.getDefaultColor() : 0);
    }

    @InterfaceC9871jM0(name = "textAlignVertical")
    public void setTextAlignVertical(C9105dN0 c9105dN0, String str) {
        if (str == null || "auto".equals(str)) {
            c9105dN0.setGravityVertical(0);
            return;
        }
        if ("top".equals(str)) {
            c9105dN0.setGravityVertical(48);
            return;
        }
        if ("bottom".equals(str)) {
            c9105dN0.setGravityVertical(80);
        } else {
            if ("center".equals(str)) {
                c9105dN0.setGravityVertical(16);
                return;
            }
            "Invalid textAlignVertical: ".concat(str);
            AbstractC3929dS.m17683p("ReactNative");
            c9105dN0.setGravityVertical(0);
        }
    }
}
