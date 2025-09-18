package com.facebook.react.views.textinput;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.BlendMode;
import android.graphics.BlendModeColorFilter;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.InputFilter;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactSoftExceptionLogger;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.common.mapbuffer.ReadableMapBuffer;
import com.facebook.react.uimanager.BaseViewManager;
import com.facebook.react.views.textinput.ReactTextInputManager;
import com.google.android.gms.common.Scopes;
import com.huawei.hms.p015rn.push.constants.LocalNotification;
import com.huawei.hms.p015rn.push.constants.RemoteMessageAttributes;
import com.swmansion.reanimated.layoutReanimation.Snapshot;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Locale;
import java.util.Map;
import kotlin.KotlinVersion;
import p000.AbstractC0628Jy;
import p000.AbstractC10889rJ0;
import p000.AbstractC11406vL1;
import p000.AbstractC11619x12;
import p000.AbstractC3929dS;
import p000.AbstractC9685hv0;
import p000.C0926Oi;
import p000.C0977PW;
import p000.C10169lh0;
import p000.C10779qS0;
import p000.C1210TE;
import p000.C1380Vw;
import p000.C4187hZ;
import p000.C6846so;
import p000.C8716aN0;
import p000.C8972cN0;
import p000.C9099dK0;
import p000.F91;
import p000.G41;
import p000.InterfaceC6947uP;
import p000.InterfaceC9101dL0;
import p000.InterfaceC9233eN0;
import p000.InterfaceC9871jM0;
import p000.InterfaceC9999kM0;
import p000.KJ0;
import p000.MW0;
import p000.NM0;
import p000.O90;
import p000.OZ1;
import p000.S91;
import p000.UO1;
import p000.YM0;
import p000.ZM0;

@InterfaceC9101dL0(name = ReactTextInputManager.REACT_CLASS)
/* loaded from: classes.dex */
public class ReactTextInputManager extends BaseViewManager<C9099dK0, C10169lh0> {
    private static final int AUTOCAPITALIZE_FLAGS = 28672;
    private static final int BLUR_TEXT_INPUT = 2;
    private static final String[] DRAWABLE_HANDLE_FIELDS;
    private static final String[] DRAWABLE_HANDLE_RESOURCES;
    private static final InputFilter[] EMPTY_FILTERS;
    private static final int FOCUS_TEXT_INPUT = 1;
    private static final int IME_ACTION_ID = 1648;
    private static final int INPUT_TYPE_KEYBOARD_DECIMAL_PAD = 8194;
    private static final int INPUT_TYPE_KEYBOARD_NUMBERED = 12290;
    private static final int INPUT_TYPE_KEYBOARD_NUMBER_PAD = 2;
    private static final String KEYBOARD_TYPE_DECIMAL_PAD = "decimal-pad";
    private static final String KEYBOARD_TYPE_EMAIL_ADDRESS = "email-address";
    private static final String KEYBOARD_TYPE_NUMBER_PAD = "number-pad";
    private static final String KEYBOARD_TYPE_NUMERIC = "numeric";
    private static final String KEYBOARD_TYPE_PHONE_PAD = "phone-pad";
    private static final String KEYBOARD_TYPE_URI = "url";
    private static final String KEYBOARD_TYPE_VISIBLE_PASSWORD = "visible-password";
    private static final int PASSWORD_VISIBILITY_FLAG = 16;
    public static final String REACT_CLASS = "AndroidTextInput";
    private static final Map<String, String> REACT_PROPS_AUTOFILL_HINTS_MAP;
    private static final int SET_MOST_RECENT_EVENT_COUNT = 3;
    private static final int SET_TEXT_AND_SELECTION = 4;
    private static final int[] SPACING_TYPES = {8, 0, 2, 1, 3};
    public static final String TAG = "ReactTextInputManager";
    private static final short TX_STATE_KEY_ATTRIBUTED_STRING = 0;
    private static final short TX_STATE_KEY_HASH = 2;
    private static final short TX_STATE_KEY_MOST_RECENT_EVENT_COUNT = 3;
    private static final short TX_STATE_KEY_PARAGRAPH_ATTRIBUTES = 1;
    private static final int UNSET = -1;
    protected InterfaceC9233eN0 mReactTextViewManagerCallback;

    static {
        C1380Vw c1380Vw = new C1380Vw();
        c1380Vw.put("birthdate-day", "birthDateDay");
        c1380Vw.put("birthdate-full", "birthDateFull");
        c1380Vw.put("birthdate-month", "birthDateMonth");
        c1380Vw.put("birthdate-year", "birthDateYear");
        c1380Vw.put("cc-csc", "creditCardSecurityCode");
        c1380Vw.put("cc-exp", "creditCardExpirationDate");
        c1380Vw.put("cc-exp-day", "creditCardExpirationDay");
        c1380Vw.put("cc-exp-month", "creditCardExpirationMonth");
        c1380Vw.put("cc-exp-year", "creditCardExpirationYear");
        c1380Vw.put("cc-number", "creditCardNumber");
        c1380Vw.put(Scopes.EMAIL, "emailAddress");
        c1380Vw.put("gender", "gender");
        c1380Vw.put("name", "personName");
        c1380Vw.put("name-family", "personFamilyName");
        c1380Vw.put("name-given", "personGivenName");
        c1380Vw.put("name-middle", "personMiddleName");
        c1380Vw.put("name-middle-initial", "personMiddleInitial");
        c1380Vw.put("name-prefix", "personNamePrefix");
        c1380Vw.put("name-suffix", "personNameSuffix");
        c1380Vw.put("password", "password");
        c1380Vw.put("password-new", "newPassword");
        c1380Vw.put("postal-address", "postalAddress");
        c1380Vw.put("postal-address-country", "addressCountry");
        c1380Vw.put("postal-address-extended", "extendedAddress");
        c1380Vw.put("postal-address-extended-postal-code", "extendedPostalCode");
        c1380Vw.put("postal-address-locality", "addressLocality");
        c1380Vw.put("postal-address-region", "addressRegion");
        c1380Vw.put("postal-code", "postalCode");
        c1380Vw.put("street-address", "streetAddress");
        c1380Vw.put("sms-otp", "smsOTPCode");
        c1380Vw.put("tel", "phoneNumber");
        c1380Vw.put("tel-country-code", "phoneCountryCode");
        c1380Vw.put("tel-national", "phoneNational");
        c1380Vw.put("tel-device", "phoneNumberDevice");
        c1380Vw.put("username", "username");
        c1380Vw.put("username-new", "newUsername");
        REACT_PROPS_AUTOFILL_HINTS_MAP = c1380Vw;
        EMPTY_FILTERS = new InputFilter[0];
        DRAWABLE_HANDLE_RESOURCES = new String[]{"mTextSelectHandleLeftRes", "mTextSelectHandleRightRes", "mTextSelectHandleRes"};
        DRAWABLE_HANDLE_FIELDS = new String[]{"mSelectHandleLeft", "mSelectHandleRight", "mSelectHandleCenter"};
    }

    private static void checkPasswordType(C9099dK0 c9099dK0) {
        if ((c9099dK0.getStagedInputType() & INPUT_TYPE_KEYBOARD_NUMBERED) == 0 || (c9099dK0.getStagedInputType() & 128) == 0) {
            return;
        }
        updateStagedInputTypeFlag(c9099dK0, 128, 16);
    }

    public static InterfaceC6947uP getEventDispatcher(ReactContext reactContext, C9099dK0 c9099dK0) {
        return OZ1.m6091b(reactContext, c9099dK0.getId());
    }

    private C8972cN0 getReactTextUpdate(String str, int i) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) F91.m2533p(5, str));
        return new C8972cN0(spannableStringBuilder, i, false, 0.0f, 0.0f, 0.0f, 0.0f, 0, 0, 0);
    }

    public static void lambda$addEventEmitters$0(S91 s91, C9099dK0 c9099dK0, View view, boolean z) {
        int i = s91.f10603b;
        InterfaceC6947uP eventDispatcher = getEventDispatcher(s91, c9099dK0);
        if (z) {
            eventDispatcher.mo11046g(new C6846so(i, c9099dK0.getId(), 13));
            return;
        }
        eventDispatcher.mo11046g(new C6846so(i, c9099dK0.getId(), 12));
        int id = c9099dK0.getId();
        String string = c9099dK0.getText().toString();
        C0977PW c0977pw = new C0977PW(i, id, 2);
        c0977pw.f9103b = string;
        eventDispatcher.mo11046g(c0977pw);
    }

    public static boolean lambda$addEventEmitters$1(C9099dK0 c9099dK0, S91 s91, TextView textView, int i, KeyEvent keyEvent) {
        if ((i & KotlinVersion.MAX_COMPONENT_VALUE) == 0 && i != 0) {
            return true;
        }
        boolean zM17535d = c9099dK0.m17535d();
        boolean zM17540i = c9099dK0.m17540i();
        String submitBehavior = c9099dK0.getSubmitBehavior();
        boolean zEquals = submitBehavior == null ? !c9099dK0.m17535d() : submitBehavior.equals("blurAndSubmit");
        if (zM17540i) {
            InterfaceC6947uP eventDispatcher = getEventDispatcher(s91, c9099dK0);
            int i2 = s91.f10603b;
            int id = c9099dK0.getId();
            String string = c9099dK0.getText().toString();
            C0977PW c0977pw = new C0977PW(i2, id, 4);
            c0977pw.f9103b = string;
            eventDispatcher.mo11046g(c0977pw);
        }
        if (zEquals) {
            c9099dK0.clearFocus();
        }
        return zEquals || zM17540i || !zM17535d || i == 5 || i == 7;
    }

    private void setAutofillHints(C9099dK0 c9099dK0, String... strArr) {
        if (Build.VERSION.SDK_INT < 26) {
            return;
        }
        c9099dK0.setAutofillHints(strArr);
    }

    private static boolean shouldHideCursorForEmailTextInput() {
        return Build.VERSION.SDK_INT == 29 && Build.MANUFACTURER.toLowerCase(Locale.ROOT).contains("xiaomi");
    }

    private static void updateStagedInputTypeFlag(C9099dK0 c9099dK0, int i, int i2) {
        c9099dK0.setStagedInputType(((~i) & c9099dK0.getStagedInputType()) | i2);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public Map<String, Integer> getCommandsMap() {
        return AbstractC10889rJ0.m24257d("focusTextInput", 1, "blurTextInput", 2);
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public Map<String, Object> getExportedCustomBubblingEventTypeConstants() {
        Map<String, Object> exportedCustomBubblingEventTypeConstants = super.getExportedCustomBubblingEventTypeConstants();
        if (exportedCustomBubblingEventTypeConstants == null) {
            exportedCustomBubblingEventTypeConstants = new HashMap<>();
        }
        C0926Oi c0926OiM24254a = AbstractC10889rJ0.m24254a();
        c0926OiM24254a.m6125k("topSubmitEditing", AbstractC10889rJ0.m24256c("phasedRegistrationNames", AbstractC10889rJ0.m24257d("bubbled", "onSubmitEditing", "captured", "onSubmitEditingCapture")));
        c0926OiM24254a.m6125k("topEndEditing", AbstractC10889rJ0.m24256c("phasedRegistrationNames", AbstractC10889rJ0.m24257d("bubbled", "onEndEditing", "captured", "onEndEditingCapture")));
        c0926OiM24254a.m6125k("topFocus", AbstractC10889rJ0.m24256c("phasedRegistrationNames", AbstractC10889rJ0.m24257d("bubbled", "onFocus", "captured", "onFocusCapture")));
        c0926OiM24254a.m6125k("topBlur", AbstractC10889rJ0.m24256c("phasedRegistrationNames", AbstractC10889rJ0.m24257d("bubbled", "onBlur", "captured", "onBlurCapture")));
        c0926OiM24254a.m6125k("topKeyPress", AbstractC10889rJ0.m24256c("phasedRegistrationNames", AbstractC10889rJ0.m24257d("bubbled", "onKeyPress", "captured", "onKeyPressCapture")));
        exportedCustomBubblingEventTypeConstants.putAll(c0926OiM24254a.m6122h());
        return exportedCustomBubblingEventTypeConstants;
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public Map<String, Object> getExportedCustomDirectEventTypeConstants() {
        Map<String, Object> exportedCustomDirectEventTypeConstants = super.getExportedCustomDirectEventTypeConstants();
        if (exportedCustomDirectEventTypeConstants == null) {
            exportedCustomDirectEventTypeConstants = new HashMap<>();
        }
        C0926Oi c0926OiM24254a = AbstractC10889rJ0.m24254a();
        MW0 mw0 = MW0.f7205d;
        MW0.f7202a.getClass();
        c0926OiM24254a.m6125k(C1210TE.m7635J(mw0), AbstractC10889rJ0.m24256c("registrationName", "onScroll"));
        exportedCustomDirectEventTypeConstants.putAll(c0926OiM24254a.m6122h());
        return exportedCustomDirectEventTypeConstants;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public Map<String, Object> getExportedViewConstants() {
        return AbstractC10889rJ0.m24256c("AutoCapitalizationType", AbstractC10889rJ0.m24255b(LocalNotification.Importance.NONE, 0, "characters", 4096, "words", 8192, "sentences", 16384));
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public Class<? extends C10169lh0> getShadowNodeClass() {
        return C8716aN0.class;
    }

    @InterfaceC9871jM0(defaultBoolean = true, name = "allowFontScaling")
    public void setAllowFontScaling(C9099dK0 c9099dK0, boolean z) {
        c9099dK0.setAllowFontScaling(z);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:62:0x005a  */
    @p000.InterfaceC9871jM0(name = "autoCapitalize")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void setAutoCapitalize(p000.C9099dK0 r5, com.facebook.react.bridge.Dynamic r6) {
        /*
            r4 = this;
            r0 = 0
            com.facebook.react.bridge.ReadableType r1 = r6.getType()
            com.facebook.react.bridge.ReadableType r2 = com.facebook.react.bridge.ReadableType.Number
            if (r1 != r2) goto Le
            int r0 = r6.asInt()
            goto L5e
        Le:
            com.facebook.react.bridge.ReadableType r1 = r6.getType()
            com.facebook.react.bridge.ReadableType r2 = com.facebook.react.bridge.ReadableType.String
            r3 = 16384(0x4000, float:2.2959E-41)
            if (r1 != r2) goto L5a
            java.lang.String r6 = r6.asString()
            r6.getClass()
            r1 = -1
            int r2 = r6.hashCode()
            switch(r2) {
                case 3387192: goto L49;
                case 113318569: goto L3e;
                case 490141296: goto L33;
                case 1245424234: goto L28;
                default: goto L27;
            }
        L27:
            goto L53
        L28:
            java.lang.String r2 = "characters"
            boolean r6 = r6.equals(r2)
            if (r6 != 0) goto L31
            goto L53
        L31:
            r1 = 3
            goto L53
        L33:
            java.lang.String r2 = "sentences"
            boolean r6 = r6.equals(r2)
            if (r6 != 0) goto L3c
            goto L53
        L3c:
            r1 = 2
            goto L53
        L3e:
            java.lang.String r2 = "words"
            boolean r6 = r6.equals(r2)
            if (r6 != 0) goto L47
            goto L53
        L47:
            r1 = 1
            goto L53
        L49:
            java.lang.String r2 = "none"
            boolean r6 = r6.equals(r2)
            if (r6 != 0) goto L52
            goto L53
        L52:
            r1 = r0
        L53:
            switch(r1) {
                case 0: goto L5e;
                case 1: goto L5c;
                case 2: goto L5a;
                case 3: goto L57;
                default: goto L56;
            }
        L56:
            goto L5a
        L57:
            r0 = 4096(0x1000, float:5.74E-42)
            goto L5e
        L5a:
            r0 = r3
            goto L5e
        L5c:
            r0 = 8192(0x2000, float:1.148E-41)
        L5e:
            r6 = 28672(0x7000, float:4.0178E-41)
            updateStagedInputTypeFlag(r5, r6, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.views.textinput.ReactTextInputManager.setAutoCapitalize(dK0, com.facebook.react.bridge.Dynamic):void");
    }

    @InterfaceC9871jM0(name = "autoCorrect")
    public void setAutoCorrect(C9099dK0 c9099dK0, Boolean bool) {
        updateStagedInputTypeFlag(c9099dK0, 557056, bool != null ? bool.booleanValue() ? 32768 : 524288 : 0);
    }

    @InterfaceC9871jM0(defaultBoolean = false, name = "autoFocus")
    public void setAutoFocus(C9099dK0 c9099dK0, boolean z) {
        c9099dK0.setAutoFocus(z);
    }

    @InterfaceC9999kM0(customType = RemoteMessageAttributes.COLOR, names = {"borderColor", "borderLeftColor", "borderRightColor", "borderTopColor", "borderBottomColor"})
    public void setBorderColor(C9099dK0 c9099dK0, int i, Integer num) {
        c9099dK0.f25951I.m8469G().m7441i(SPACING_TYPES[i], num == null ? Float.NaN : num.intValue() & 16777215, num != null ? num.intValue() >>> 24 : Float.NaN);
    }

    @InterfaceC9999kM0(defaultFloat = Float.NaN, names = {Snapshot.BORDER_RADIUS, Snapshot.BORDER_TOP_LEFT_RADIUS, Snapshot.BORDER_TOP_RIGHT_RADIUS, Snapshot.BORDER_BOTTOM_RIGHT_RADIUS, Snapshot.BORDER_BOTTOM_LEFT_RADIUS})
    public void setBorderRadius(C9099dK0 c9099dK0, int i, float f) {
        if (!AbstractC11619x12.m25735a(f)) {
            f = AbstractC11406vL1.m25403b(f);
        }
        if (i == 0) {
            c9099dK0.setBorderRadius(f);
        } else {
            c9099dK0.f25951I.m8469G().m7445m(f, i - 1);
        }
    }

    @InterfaceC9871jM0(name = "borderStyle")
    public void setBorderStyle(C9099dK0 c9099dK0, String str) {
        c9099dK0.setBorderStyle(str);
    }

    @InterfaceC9999kM0(defaultFloat = Float.NaN, names = {"borderWidth", "borderLeftWidth", "borderRightWidth", "borderTopWidth", "borderBottomWidth"})
    public void setBorderWidth(C9099dK0 c9099dK0, int i, float f) {
        if (!AbstractC11619x12.m25735a(f)) {
            f = AbstractC11406vL1.m25403b(f);
        }
        c9099dK0.f25951I.m8469G().m7443k(SPACING_TYPES[i], f);
    }

    @InterfaceC9871jM0(defaultBoolean = false, name = "caretHidden")
    public void setCaretHidden(C9099dK0 c9099dK0, boolean z) {
        if (c9099dK0.getStagedInputType() == 32 && shouldHideCursorForEmailTextInput()) {
            return;
        }
        c9099dK0.setCursorVisible(!z);
    }

    @InterfaceC9871jM0(customType = RemoteMessageAttributes.COLOR, name = "color")
    public void setColor(C9099dK0 c9099dK0, Integer num) {
        if (num != null) {
            c9099dK0.setTextColor(num.intValue());
            return;
        }
        Context context = c9099dK0.getContext();
        O90.m5968f(context, "context");
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{R.attr.textColor});
        O90.m5967e(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
        ColorStateList colorStateList = typedArrayObtainStyledAttributes.getColorStateList(0);
        if (colorStateList != null) {
            c9099dK0.setTextColor(colorStateList);
            return;
        }
        Context context2 = c9099dK0.getContext();
        String str = TAG;
        StringBuilder sb = new StringBuilder("Could not get default text color from View Context: ");
        sb.append(context2 != null ? context2.getClass().getCanonicalName() : "null");
        ReactSoftExceptionLogger.logSoftException(str, new IllegalStateException(sb.toString()));
    }

    @InterfaceC9871jM0(defaultBoolean = false, name = "contextMenuHidden")
    public void setContextMenuHidden(C9099dK0 c9099dK0, boolean z) {
        c9099dK0.setContextMenuHidden(z);
    }

    @InterfaceC9871jM0(customType = RemoteMessageAttributes.COLOR, name = "cursorColor")
    public void setCursorColor(C9099dK0 c9099dK0, Integer num) throws IllegalAccessException, NoSuchFieldException, SecurityException, IllegalArgumentException {
        int i = Build.VERSION.SDK_INT;
        if (i >= 29) {
            Drawable textCursorDrawable = c9099dK0.getTextCursorDrawable();
            if (textCursorDrawable != null) {
                if (num != null) {
                    AbstractC9685hv0.m18902l();
                    textCursorDrawable.setColorFilter(AbstractC9685hv0.m18895e(num.intValue(), BlendMode.SRC_IN));
                } else {
                    textCursorDrawable.clearColorFilter();
                }
                c9099dK0.setTextCursorDrawable(textCursorDrawable);
                return;
            }
            return;
        }
        if (i == 28) {
            return;
        }
        try {
            Field declaredField = c9099dK0.getClass().getDeclaredField("mCursorDrawableRes");
            declaredField.setAccessible(true);
            int i2 = declaredField.getInt(c9099dK0);
            if (i2 == 0) {
                return;
            }
            Drawable drawableMutate = AbstractC0628Jy.m4480b(c9099dK0.getContext(), i2).mutate();
            if (num != null) {
                drawableMutate.setColorFilter(num.intValue(), PorterDuff.Mode.SRC_IN);
            } else {
                drawableMutate.clearColorFilter();
            }
            Field declaredField2 = TextView.class.getDeclaredField("mEditor");
            declaredField2.setAccessible(true);
            Object obj = declaredField2.get(c9099dK0);
            Field declaredField3 = obj.getClass().getDeclaredField("mCursorDrawable");
            declaredField3.setAccessible(true);
            declaredField3.set(obj, new Drawable[]{drawableMutate, drawableMutate});
        } catch (IllegalAccessException | NoSuchFieldException unused) {
        }
    }

    @InterfaceC9871jM0(defaultBoolean = false, name = "disableFullscreenUI")
    public void setDisableFullscreenUI(C9099dK0 c9099dK0, boolean z) {
        c9099dK0.setDisableFullscreenUI(z);
    }

    @InterfaceC9871jM0(defaultBoolean = true, name = "editable")
    public void setEditable(C9099dK0 c9099dK0, boolean z) {
        c9099dK0.setEnabled(z);
    }

    @InterfaceC9871jM0(name = "fontFamily")
    public void setFontFamily(C9099dK0 c9099dK0, String str) {
        c9099dK0.setFontFamily(str);
    }

    @InterfaceC9871jM0(defaultFloat = 14.0f, name = "fontSize")
    public void setFontSize(C9099dK0 c9099dK0, float f) {
        c9099dK0.setFontSize(f);
    }

    @InterfaceC9871jM0(name = "fontStyle")
    public void setFontStyle(C9099dK0 c9099dK0, String str) {
        c9099dK0.setFontStyle(str);
    }

    @InterfaceC9871jM0(name = "fontVariant")
    public void setFontVariant(C9099dK0 c9099dK0, ReadableArray readableArray) {
        c9099dK0.setFontFeatureSettings(UO1.m8007d(readableArray));
    }

    @InterfaceC9871jM0(name = "fontWeight")
    public void setFontWeight(C9099dK0 c9099dK0, String str) {
        c9099dK0.setFontWeight(str);
    }

    @InterfaceC9871jM0(name = "importantForAutofill")
    public void setImportantForAutofill(C9099dK0 c9099dK0, String str) {
        setImportantForAutofill(c9099dK0, "no".equals(str) ? 2 : "noExcludeDescendants".equals(str) ? 8 : "yes".equals(str) ? 1 : "yesExcludeDescendants".equals(str) ? 4 : 0);
    }

    @InterfaceC9871jM0(defaultBoolean = true, name = "includeFontPadding")
    public void setIncludeFontPadding(C9099dK0 c9099dK0, boolean z) {
        c9099dK0.setIncludeFontPadding(z);
    }

    @InterfaceC9871jM0(name = "inlineImageLeft")
    public void setInlineImageLeft(C9099dK0 c9099dK0, String str) {
        c9099dK0.setCompoundDrawablesWithIntrinsicBounds(C10779qS0.f40878b.m24000b(c9099dK0.getContext(), str), 0, 0, 0);
    }

    @InterfaceC9871jM0(name = "inlineImagePadding")
    public void setInlineImagePadding(C9099dK0 c9099dK0, int i) {
        c9099dK0.setCompoundDrawablePadding(i);
    }

    @InterfaceC9871jM0(name = "keyboardType")
    public void setKeyboardType(C9099dK0 c9099dK0, String str) {
        int i;
        if (KEYBOARD_TYPE_NUMERIC.equalsIgnoreCase(str)) {
            i = INPUT_TYPE_KEYBOARD_NUMBERED;
        } else if (KEYBOARD_TYPE_NUMBER_PAD.equalsIgnoreCase(str)) {
            i = 2;
        } else if (KEYBOARD_TYPE_DECIMAL_PAD.equalsIgnoreCase(str)) {
            i = INPUT_TYPE_KEYBOARD_DECIMAL_PAD;
        } else if (KEYBOARD_TYPE_EMAIL_ADDRESS.equalsIgnoreCase(str)) {
            if (shouldHideCursorForEmailTextInput()) {
                c9099dK0.setCursorVisible(false);
            }
            i = 33;
        } else {
            i = KEYBOARD_TYPE_PHONE_PAD.equalsIgnoreCase(str) ? 3 : KEYBOARD_TYPE_VISIBLE_PASSWORD.equalsIgnoreCase(str) ? 144 : "url".equalsIgnoreCase(str) ? 16 : 1;
        }
        updateStagedInputTypeFlag(c9099dK0, 15, i);
        checkPasswordType(c9099dK0);
    }

    @InterfaceC9871jM0(defaultFloat = 0.0f, name = "letterSpacing")
    public void setLetterSpacing(C9099dK0 c9099dK0, float f) {
        c9099dK0.setLetterSpacingPt(f);
    }

    @InterfaceC9871jM0(defaultFloat = 0.0f, name = "lineHeight")
    public void setLineHeight(C9099dK0 c9099dK0, int i) {
        c9099dK0.setLineHeight(i);
    }

    @InterfaceC9871jM0(defaultFloat = Float.NaN, name = "maxFontSizeMultiplier")
    public void setMaxFontSizeMultiplier(C9099dK0 c9099dK0, float f) {
        c9099dK0.setMaxFontSizeMultiplier(f);
    }

    @InterfaceC9871jM0(name = "maxLength")
    public void setMaxLength(C9099dK0 c9099dK0, Integer num) {
        InputFilter[] filters = c9099dK0.getFilters();
        InputFilter[] inputFilterArr = EMPTY_FILTERS;
        if (num == null) {
            if (filters.length > 0) {
                LinkedList linkedList = new LinkedList();
                for (InputFilter inputFilter : filters) {
                    if (!(inputFilter instanceof InputFilter.LengthFilter)) {
                        linkedList.add(inputFilter);
                    }
                }
                if (!linkedList.isEmpty()) {
                    inputFilterArr = (InputFilter[]) linkedList.toArray(new InputFilter[linkedList.size()]);
                }
            }
        } else if (filters.length > 0) {
            boolean z = false;
            for (int i = 0; i < filters.length; i++) {
                if (filters[i] instanceof InputFilter.LengthFilter) {
                    filters[i] = new InputFilter.LengthFilter(num.intValue());
                    z = true;
                }
            }
            if (!z) {
                InputFilter[] inputFilterArr2 = new InputFilter[filters.length + 1];
                System.arraycopy(filters, 0, inputFilterArr2, 0, filters.length);
                filters[filters.length] = new InputFilter.LengthFilter(num.intValue());
                filters = inputFilterArr2;
            }
            inputFilterArr = filters;
        } else {
            inputFilterArr = new InputFilter[]{new InputFilter.LengthFilter(num.intValue())};
        }
        c9099dK0.setFilters(inputFilterArr);
    }

    @InterfaceC9871jM0(defaultBoolean = false, name = "multiline")
    public void setMultiline(C9099dK0 c9099dK0, boolean z) {
        updateStagedInputTypeFlag(c9099dK0, z ? 0 : 131072, z ? 131072 : 0);
    }

    @InterfaceC9871jM0(defaultInt = 1, name = "numberOfLines")
    public void setNumLines(C9099dK0 c9099dK0, int i) {
        c9099dK0.setLines(i);
    }

    @InterfaceC9871jM0(defaultBoolean = false, name = "onContentSizeChange")
    public void setOnContentSizeChange(C9099dK0 c9099dK0, boolean z) {
        if (z) {
            c9099dK0.setContentSizeWatcher(new YM0(c9099dK0, 0));
        } else {
            c9099dK0.setContentSizeWatcher(null);
        }
    }

    @InterfaceC9871jM0(defaultBoolean = false, name = "onKeyPress")
    public void setOnKeyPress(C9099dK0 c9099dK0, boolean z) {
        c9099dK0.setOnKeyPress(z);
    }

    @InterfaceC9871jM0(defaultBoolean = false, name = "onScroll")
    public void setOnScroll(C9099dK0 c9099dK0, boolean z) {
        if (z) {
            c9099dK0.setScrollWatcher(new YM0(c9099dK0, 1));
        } else {
            c9099dK0.setScrollWatcher(null);
        }
    }

    @InterfaceC9871jM0(defaultBoolean = false, name = "onSelectionChange")
    public void setOnSelectionChange(C9099dK0 c9099dK0, boolean z) {
        if (z) {
            c9099dK0.setSelectionWatcher(new YM0(c9099dK0, 2));
        } else {
            c9099dK0.setSelectionWatcher(null);
        }
    }

    @InterfaceC9871jM0(name = "overflow")
    public void setOverflow(C9099dK0 c9099dK0, String str) {
        c9099dK0.setOverflow(str);
    }

    @InterfaceC9871jM0(name = "placeholder")
    public void setPlaceholder(C9099dK0 c9099dK0, String str) {
        c9099dK0.setPlaceholder(str);
    }

    @InterfaceC9871jM0(customType = RemoteMessageAttributes.COLOR, name = "placeholderTextColor")
    public void setPlaceholderTextColor(C9099dK0 c9099dK0, Integer num) {
        if (num != null) {
            c9099dK0.setHintTextColor(num.intValue());
            return;
        }
        Context context = c9099dK0.getContext();
        O90.m5968f(context, "context");
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{R.attr.textColorHint});
        O90.m5967e(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
        c9099dK0.setHintTextColor(typedArrayObtainStyledAttributes.getColorStateList(0));
    }

    @InterfaceC9871jM0(name = "returnKeyLabel")
    public void setReturnKeyLabel(C9099dK0 c9099dK0, String str) {
        c9099dK0.setImeActionLabel(str, IME_ACTION_ID);
    }

    @InterfaceC9871jM0(name = "returnKeyType")
    public void setReturnKeyType(C9099dK0 c9099dK0, String str) {
        c9099dK0.setReturnKeyType(str);
    }

    @InterfaceC9871jM0(defaultBoolean = false, name = "secureTextEntry")
    public void setSecureTextEntry(C9099dK0 c9099dK0, boolean z) {
        updateStagedInputTypeFlag(c9099dK0, 144, z ? 128 : 0);
        checkPasswordType(c9099dK0);
    }

    @InterfaceC9871jM0(defaultBoolean = false, name = "selectTextOnFocus")
    public void setSelectTextOnFocus(C9099dK0 c9099dK0, boolean z) {
        c9099dK0.setSelectAllOnFocus(z);
    }

    @InterfaceC9871jM0(customType = RemoteMessageAttributes.COLOR, name = "selectionColor")
    public void setSelectionColor(C9099dK0 c9099dK0, Integer num) {
        if (num != null) {
            c9099dK0.setHighlightColor(num.intValue());
            return;
        }
        Context context = c9099dK0.getContext();
        O90.m5968f(context, "context");
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{R.attr.textColorHighlight});
        O90.m5967e(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
        ColorStateList colorStateList = typedArrayObtainStyledAttributes.getColorStateList(0);
        c9099dK0.setHighlightColor(colorStateList != null ? colorStateList.getDefaultColor() : 0);
    }

    @InterfaceC9871jM0(customType = RemoteMessageAttributes.COLOR, name = "selectionHandleColor")
    public void setSelectionHandleColor(C9099dK0 c9099dK0, Integer num) throws IllegalAccessException, NoSuchFieldException, SecurityException, IllegalArgumentException {
        int i;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 29) {
            Drawable drawableMutate = c9099dK0.getTextSelectHandle().mutate();
            Drawable drawableMutate2 = c9099dK0.getTextSelectHandleLeft().mutate();
            Drawable drawableMutate3 = c9099dK0.getTextSelectHandleRight().mutate();
            if (num != null) {
                AbstractC9685hv0.m18902l();
                BlendModeColorFilter blendModeColorFilterM18895e = AbstractC9685hv0.m18895e(num.intValue(), BlendMode.SRC_IN);
                drawableMutate.setColorFilter(blendModeColorFilterM18895e);
                drawableMutate2.setColorFilter(blendModeColorFilterM18895e);
                drawableMutate3.setColorFilter(blendModeColorFilterM18895e);
            } else {
                drawableMutate.clearColorFilter();
                drawableMutate2.clearColorFilter();
                drawableMutate3.clearColorFilter();
            }
            c9099dK0.setTextSelectHandle(drawableMutate);
            c9099dK0.setTextSelectHandleLeft(drawableMutate2);
            c9099dK0.setTextSelectHandleRight(drawableMutate3);
            return;
        }
        if (i2 == 28) {
            return;
        }
        int i3 = 0;
        while (true) {
            String[] strArr = DRAWABLE_HANDLE_RESOURCES;
            if (i3 >= strArr.length) {
                return;
            }
            try {
                Field declaredField = c9099dK0.getClass().getDeclaredField(strArr[i3]);
                declaredField.setAccessible(true);
                i = declaredField.getInt(c9099dK0);
            } catch (IllegalAccessException | NoSuchFieldException unused) {
            }
            if (i == 0) {
                return;
            }
            Drawable drawableMutate4 = AbstractC0628Jy.m4480b(c9099dK0.getContext(), i).mutate();
            if (num != null) {
                drawableMutate4.setColorFilter(num.intValue(), PorterDuff.Mode.SRC_IN);
            } else {
                drawableMutate4.clearColorFilter();
            }
            Field declaredField2 = TextView.class.getDeclaredField("mEditor");
            declaredField2.setAccessible(true);
            Object obj = declaredField2.get(c9099dK0);
            Field declaredField3 = obj.getClass().getDeclaredField(DRAWABLE_HANDLE_FIELDS[i3]);
            declaredField3.setAccessible(true);
            declaredField3.set(obj, drawableMutate4);
            i3++;
        }
    }

    @InterfaceC9871jM0(name = "submitBehavior")
    public void setSubmitBehavior(C9099dK0 c9099dK0, String str) {
        c9099dK0.setSubmitBehavior(str);
    }

    @InterfaceC9871jM0(name = "textAlign")
    public void setTextAlign(C9099dK0 c9099dK0, String str) {
        if ("justify".equals(str)) {
            if (Build.VERSION.SDK_INT >= 26) {
                c9099dK0.setJustificationMode(1);
            }
            c9099dK0.setGravityHorizontal(3);
            return;
        }
        if (Build.VERSION.SDK_INT >= 26) {
            c9099dK0.setJustificationMode(0);
        }
        if (str == null || "auto".equals(str)) {
            c9099dK0.setGravityHorizontal(0);
            return;
        }
        if ("left".equals(str)) {
            c9099dK0.setGravityHorizontal(3);
            return;
        }
        if ("right".equals(str)) {
            c9099dK0.setGravityHorizontal(5);
        } else {
            if ("center".equals(str)) {
                c9099dK0.setGravityHorizontal(1);
                return;
            }
            "Invalid textAlign: ".concat(str);
            AbstractC3929dS.m17683p("ReactNative");
            c9099dK0.setGravityHorizontal(0);
        }
    }

    @InterfaceC9871jM0(name = "textAlignVertical")
    public void setTextAlignVertical(C9099dK0 c9099dK0, String str) {
        if (str == null || "auto".equals(str)) {
            c9099dK0.setGravityVertical(0);
            return;
        }
        if ("top".equals(str)) {
            c9099dK0.setGravityVertical(48);
            return;
        }
        if ("bottom".equals(str)) {
            c9099dK0.setGravityVertical(80);
        } else {
            if ("center".equals(str)) {
                c9099dK0.setGravityVertical(16);
                return;
            }
            "Invalid textAlignVertical: ".concat(str);
            AbstractC3929dS.m17683p("ReactNative");
            c9099dK0.setGravityVertical(0);
        }
    }

    @InterfaceC9871jM0(name = "autoComplete")
    public void setTextContentType(C9099dK0 c9099dK0, String str) {
        if (str == null) {
            setImportantForAutofill(c9099dK0, 2);
            return;
        }
        if ("off".equals(str)) {
            setImportantForAutofill(c9099dK0, 2);
            return;
        }
        Map<String, String> map = REACT_PROPS_AUTOFILL_HINTS_MAP;
        if (map.containsKey(str)) {
            setAutofillHints(c9099dK0, map.get(str));
            return;
        }
        "Invalid autoComplete: ".concat(str);
        AbstractC3929dS.m17683p("ReactNative");
        setImportantForAutofill(c9099dK0, 2);
    }

    @InterfaceC9871jM0(name = "textDecorationLine")
    public void setTextDecorationLine(C9099dK0 c9099dK0, String str) {
        c9099dK0.setPaintFlags(c9099dK0.getPaintFlags() & (-25));
        for (String str2 : str.split(" ")) {
            if (str2.equals("underline")) {
                c9099dK0.setPaintFlags(c9099dK0.getPaintFlags() | 8);
            } else if (str2.equals("line-through")) {
                c9099dK0.setPaintFlags(c9099dK0.getPaintFlags() | 16);
            }
        }
    }

    @InterfaceC9871jM0(customType = RemoteMessageAttributes.COLOR, name = "underlineColorAndroid")
    public void setUnderlineColor(C9099dK0 c9099dK0, Integer num) {
        Drawable background = c9099dK0.getBackground();
        if (background == null) {
            return;
        }
        if (background.getConstantState() != null) {
            try {
                background = background.mutate();
            } catch (NullPointerException unused) {
                AbstractC3929dS.m17675h(TAG);
            }
        }
        if (num == null) {
            background.clearColorFilter();
        } else {
            background.setColorFilter(num.intValue(), PorterDuff.Mode.SRC_IN);
        }
    }

    @InterfaceC9871jM0(defaultBoolean = true, name = "showSoftInputOnFocus")
    public void showKeyboardOnFocus(C9099dK0 c9099dK0, boolean z) {
        c9099dK0.setShowSoftInputOnFocus(z);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void addEventEmitters(final S91 s91, final C9099dK0 c9099dK0) {
        c9099dK0.setEventDispatcher(getEventDispatcher(s91, c9099dK0));
        c9099dK0.addTextChangedListener(new ZM0(s91, c9099dK0));
        c9099dK0.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: WM0
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z) {
                ReactTextInputManager.lambda$addEventEmitters$0(s91, c9099dK0, view, z);
            }
        });
        c9099dK0.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: XM0
            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
                return ReactTextInputManager.lambda$addEventEmitters$1(c9099dK0, s91, textView, i, keyEvent);
            }
        });
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public KJ0 createShadowNodeInstance() {
        return new C8716aN0(null);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public C9099dK0 createViewInstance(S91 s91) {
        C9099dK0 c9099dK0 = new C9099dK0(s91);
        c9099dK0.setInputType(c9099dK0.getInputType() & (-131073));
        c9099dK0.setReturnKeyType("done");
        c9099dK0.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        return c9099dK0;
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public void onAfterUpdateTransaction(C9099dK0 c9099dK0) {
        super.onAfterUpdateTransaction((ReactTextInputManager) c9099dK0);
        if (c9099dK0.f25943A) {
            c9099dK0.f25943A = false;
            c9099dK0.setTypeface(UO1.m8004a(c9099dK0.getTypeface(), c9099dK0.f25946D, c9099dK0.f25945C, c9099dK0.f25944B, c9099dK0.getContext().getAssets()));
            if (c9099dK0.f25946D == -1 && c9099dK0.f25945C == -1 && c9099dK0.f25944B == null && c9099dK0.getFontFeatureSettings() == null) {
                c9099dK0.setPaintFlags(c9099dK0.getPaintFlags() & (-129));
            } else {
                c9099dK0.setPaintFlags(c9099dK0.getPaintFlags() | 128);
            }
        }
        c9099dK0.m17534c();
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void setPadding(C9099dK0 c9099dK0, int i, int i2, int i3, int i4) {
        c9099dK0.setPadding(i, i2, i3, i4);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void updateExtraData(C9099dK0 c9099dK0, Object obj) {
        if (obj instanceof C8972cN0) {
            C8972cN0 c8972cN0 = (C8972cN0) obj;
            int paddingLeft = (int) c8972cN0.f17457d;
            int paddingTop = (int) c8972cN0.f17458e;
            int paddingRight = (int) c8972cN0.f17459f;
            int paddingBottom = (int) c8972cN0.f17460g;
            int length = -1;
            if (paddingLeft != -1 || paddingTop != -1 || paddingRight != -1 || paddingBottom != -1) {
                if (paddingLeft == -1) {
                    paddingLeft = c9099dK0.getPaddingLeft();
                }
                if (paddingTop == -1) {
                    paddingTop = c9099dK0.getPaddingTop();
                }
                if (paddingRight == -1) {
                    paddingRight = c9099dK0.getPaddingRight();
                }
                if (paddingBottom == -1) {
                    paddingBottom = c9099dK0.getPaddingBottom();
                }
                c9099dK0.setPadding(paddingLeft, paddingTop, paddingRight, paddingBottom);
            }
            boolean z = c8972cN0.f17456c;
            Spannable spannable = c8972cN0.f17454a;
            if (z) {
                C4187hZ.m18837a(spannable, c9099dK0);
            }
            if (c9099dK0.getSelectionStart() == c9099dK0.getSelectionEnd()) {
                length = spannable.length() - ((c9099dK0.getText() == null ? 0 : c9099dK0.getText().length()) - c9099dK0.getSelectionStart());
            }
            c9099dK0.m17537f(c8972cN0);
            c9099dK0.m17536e(c8972cN0.f17455b, length, length);
        }
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public Object updateState(C9099dK0 c9099dK0, NM0 nm0, G41 g41) {
        if (c9099dK0.getStateWrapper() == null) {
            c9099dK0.setPadding(0, 0, 0, 0);
        }
        c9099dK0.setStateWrapper(g41);
        ReadableMapBuffer stateDataMapBuffer = g41.getStateDataMapBuffer();
        if (stateDataMapBuffer != null) {
            return getReactTextUpdate(c9099dK0, nm0, stateDataMapBuffer);
        }
        return null;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void receiveCommand(C9099dK0 c9099dK0, int i, ReadableArray readableArray) {
        if (i == 1) {
            receiveCommand(c9099dK0, "focus", readableArray);
        } else if (i == 2) {
            receiveCommand(c9099dK0, "blur", readableArray);
        } else {
            if (i != 4) {
                return;
            }
            receiveCommand(c9099dK0, "setTextAndSelection", readableArray);
        }
    }

    public KJ0 createShadowNodeInstance(InterfaceC9233eN0 interfaceC9233eN0) {
        return new C8716aN0(interfaceC9233eN0);
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0085  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object getReactTextUpdate(p000.C9099dK0 r13, p000.NM0 r14, p000.InterfaceC8534Xm0 r15) {
        /*
            r12 = this;
            int r0 = r15.getF17901c()
            if (r0 != 0) goto L8
            r13 = 0
            return r13
        L8:
            r0 = 0
            Xm0 r1 = r15.mo9115W(r0)
            r2 = 1
            Xm0 r3 = r15.mo9115W(r2)
            android.content.Context r4 = r13.getContext()
            eN0 r5 = r12.mReactTextViewManagerCallback
            android.text.Spannable r7 = p000.A91.m93c(r4, r1, r5)
            r4 = 2
            java.lang.String r3 = r3.getString(r4)
            if (r3 == 0) goto L33
            java.lang.String r5 = "balanced"
            boolean r5 = r3.equals(r5)
            if (r5 != 0) goto L37
            java.lang.String r4 = "simple"
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L35
        L33:
            r10 = r2
            goto L38
        L35:
            r10 = r0
            goto L38
        L37:
            r10 = r4
        L38:
            int r3 = android.os.Build.VERSION.SDK_INT
            r4 = 26
            if (r3 >= r4) goto L40
            r3 = r0
            goto L44
        L40:
            int r3 = p000.AbstractC8962cI0.m10641a(r13)
        L44:
            r4 = 3
            int r8 = r15.getInt(r4)
            boolean r15 = p000.A91.m95e(r1)
            int r13 = r13.getGravityHorizontal()
            com.facebook.react.bridge.ReadableMap r1 = r14.f7734a
            java.lang.String r5 = "textAlign"
            boolean r1 = r1.hasKey(r5)
            if (r1 != 0) goto L5d
            r9 = r13
            goto La8
        L5d:
            com.facebook.react.bridge.ReadableMap r13 = r14.f7734a
            java.lang.String r13 = r13.getString(r5)
            java.lang.String r1 = "justify"
            boolean r1 = r1.equals(r13)
            if (r1 == 0) goto L6d
            r9 = r4
            goto La8
        L6d:
            if (r13 == 0) goto L86
            java.lang.String r1 = "auto"
            boolean r1 = r1.equals(r13)
            if (r1 == 0) goto L78
            goto L86
        L78:
            java.lang.String r1 = "left"
            boolean r1 = r1.equals(r13)
            r5 = 5
            if (r1 == 0) goto L88
            if (r15 == 0) goto L85
        L83:
            r0 = r5
            goto L86
        L85:
            r0 = r4
        L86:
            r9 = r0
            goto La8
        L88:
            java.lang.String r1 = "right"
            boolean r1 = r1.equals(r13)
            if (r1 == 0) goto L93
            if (r15 == 0) goto L83
            goto L85
        L93:
            java.lang.String r15 = "center"
            boolean r15 = r15.equals(r13)
            if (r15 == 0) goto L9d
            r9 = r2
            goto La8
        L9d:
            java.lang.String r15 = "Invalid textAlign: "
            r15.concat(r13)
            java.lang.String r13 = "ReactNative"
            p000.AbstractC3929dS.m17683p(r13)
            goto L86
        La8:
            int r11 = p000.C9718i91.m18974a(r3, r14)
            cN0 r13 = new cN0
            r6 = r13
            r6.<init>(r7, r8, r9, r10, r11)
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.views.textinput.ReactTextInputManager.getReactTextUpdate(dK0, NM0, Xm0):java.lang.Object");
    }

    private void setImportantForAutofill(C9099dK0 c9099dK0, int i) {
        if (Build.VERSION.SDK_INT < 26) {
            return;
        }
        c9099dK0.setImportantForAutofill(i);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:47:0x000f  */
    @Override // com.facebook.react.uimanager.ViewManager
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void receiveCommand(p000.C9099dK0 r7, java.lang.String r8, com.facebook.react.bridge.ReadableArray r9) {
        /*
            r6 = this;
            r0 = 3
            r1 = 2
            r2 = 1
            r3 = 0
            r8.getClass()
            r4 = -1
            int r5 = r8.hashCode()
            switch(r5) {
                case -1699362314: goto L3d;
                case 3027047: goto L32;
                case 97604824: goto L27;
                case 1427010500: goto L1c;
                case 1690703013: goto L11;
                default: goto Lf;
            }
        Lf:
            r8 = r4
            goto L47
        L11:
            java.lang.String r5 = "focusTextInput"
            boolean r8 = r8.equals(r5)
            if (r8 != 0) goto L1a
            goto Lf
        L1a:
            r8 = 4
            goto L47
        L1c:
            java.lang.String r5 = "setTextAndSelection"
            boolean r8 = r8.equals(r5)
            if (r8 != 0) goto L25
            goto Lf
        L25:
            r8 = r0
            goto L47
        L27:
            java.lang.String r5 = "focus"
            boolean r8 = r8.equals(r5)
            if (r8 != 0) goto L30
            goto Lf
        L30:
            r8 = r1
            goto L47
        L32:
            java.lang.String r5 = "blur"
            boolean r8 = r8.equals(r5)
            if (r8 != 0) goto L3b
            goto Lf
        L3b:
            r8 = r2
            goto L47
        L3d:
            java.lang.String r5 = "blurTextInput"
            boolean r8 = r8.equals(r5)
            if (r8 != 0) goto L46
            goto Lf
        L46:
            r8 = r3
        L47:
            switch(r8) {
                case 0: goto L7a;
                case 1: goto L7a;
                case 2: goto L76;
                case 3: goto L4b;
                case 4: goto L76;
                default: goto L4a;
            }
        L4a:
            goto L7d
        L4b:
            int r8 = r9.getInt(r3)
            if (r8 != r4) goto L52
            return
        L52:
            int r1 = r9.getInt(r1)
            int r0 = r9.getInt(r0)
            if (r0 != r4) goto L5d
            r0 = r1
        L5d:
            boolean r4 = r9.isNull(r2)
            if (r4 != 0) goto L72
            java.lang.String r9 = r9.getString(r2)
            cN0 r9 = r6.getReactTextUpdate(r9, r8)
            r7.f25957i = r2
            r7.m17537f(r9)
            r7.f25957i = r3
        L72:
            r7.m17536e(r8, r1, r0)
            goto L7d
        L76:
            r7.m17539h()
            goto L7d
        L7a:
            r7.clearFocus()
        L7d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.views.textinput.ReactTextInputManager.receiveCommand(dK0, java.lang.String, com.facebook.react.bridge.ReadableArray):void");
    }
}
