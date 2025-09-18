package com.swmansion.rnscreens;

import android.view.View;
import com.facebook.react.uimanager.ViewGroupManager;
import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;
import p000.AbstractC0852NX;
import p000.AbstractC10889rJ0;
import p000.C6340l4;
import p000.InterfaceC7543Ek1;
import p000.InterfaceC9101dL0;
import p000.InterfaceC9863jI0;
import p000.InterfaceC9871jM0;
import p000.O90;
import p000.QW0;
import p000.S91;
import p000.XW0;

@InterfaceC9101dL0(name = SearchBarManager.REACT_CLASS)
@Metadata(m22266d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0019\b\u0007\u0018\u0000 C2\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003:\u0001DB\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006H\u0014¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0014¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\u0012\u0010\u0013J!\u0010\u0015\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u00022\b\u0010\u0014\u001a\u0004\u0018\u00010\tH\u0017¢\u0006\u0004\b\u0015\u0010\u0016J!\u0010\u0019\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u00022\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0007¢\u0006\u0004\b\u0019\u0010\u001aJ!\u0010\u001d\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u00022\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0017¢\u0006\u0004\b\u001d\u0010\u001eJ\u001f\u0010 \u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u001f\u001a\u00020\u0017H\u0017¢\u0006\u0004\b \u0010!J!\u0010#\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u00022\b\u0010\"\u001a\u0004\u0018\u00010\tH\u0017¢\u0006\u0004\b#\u0010\u0016J!\u0010%\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u00022\b\u0010$\u001a\u0004\u0018\u00010\tH\u0017¢\u0006\u0004\b%\u0010\u0016J!\u0010&\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u00022\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0017¢\u0006\u0004\b&\u0010\u001eJ!\u0010'\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u00022\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0017¢\u0006\u0004\b'\u0010\u001eJ!\u0010(\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u00022\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0017¢\u0006\u0004\b(\u0010\u001eJ\u001f\u0010*\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010)\u001a\u00020\u0017H\u0017¢\u0006\u0004\b*\u0010!J\u001d\u0010-\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020,\u0018\u00010+H\u0016¢\u0006\u0004\b-\u0010.J\u0019\u0010/\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b/\u0010\u0013J\u0019\u00100\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b0\u0010\u0013J\u0019\u00101\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b1\u0010\u0013J!\u00103\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u00022\u0006\u00102\u001a\u00020\u0017H\u0016¢\u0006\u0004\b3\u0010!J#\u00105\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u00022\b\u00104\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b5\u0010\u0016J\u0019\u00106\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b6\u0010\u0013J!\u00107\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u00022\b\u0010$\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b7\u0010\u0016J!\u00109\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u00022\u0006\u00108\u001a\u00020\u0017H\u0016¢\u0006\u0004\b9\u0010!J!\u0010:\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u00022\u0006\u00108\u001a\u00020\u0017H\u0016¢\u0006\u0004\b:\u0010!J!\u0010;\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u00022\u0006\u00108\u001a\u00020\u0017H\u0016¢\u0006\u0004\b;\u0010!J#\u0010<\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u00022\b\u00108\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b<\u0010\u0016J#\u0010=\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u00022\b\u00108\u001a\u0004\u0018\u00010\u001bH\u0016¢\u0006\u0004\b=\u0010\u001eJ\u0017\u0010?\u001a\u00020\u00112\u0006\u0010>\u001a\u00020\tH\u0002¢\u0006\u0004\b?\u0010@R\u001a\u0010A\u001a\b\u0012\u0004\u0012\u00020\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010B¨\u0006E"}, m22267d2 = {"Lcom/swmansion/rnscreens/SearchBarManager;", "Lcom/facebook/react/uimanager/ViewGroupManager;", "LXW0;", "LjI0;", "<init>", "()V", "LEk1;", "getDelegate", "()LEk1;", "", "getName", "()Ljava/lang/String;", "LS91;", "context", "createViewInstance", "(LS91;)LXW0;", "view", "LTf1;", "onAfterUpdateTransaction", "(LXW0;)V", "autoCapitalize", "setAutoCapitalize", "(LXW0;Ljava/lang/String;)V", "", "autoFocus", "setAutoFocus", "(LXW0;Ljava/lang/Boolean;)V", "", "color", "setBarTintColor", "(LXW0;Ljava/lang/Integer;)V", "disableBackButtonOverride", "setDisableBackButtonOverride", "(LXW0;Z)V", RemoteMessageConst.INPUT_TYPE, "setInputType", "placeholder", "setPlaceholder", "setTextColor", "setHeaderIconColor", "setHintTextColor", "shouldShowHintSearchIcon", "setShouldShowHintSearchIcon", "", "", "getExportedCustomDirectEventTypeConstants", "()Ljava/util/Map;", "blur", "focus", "clearText", "flag", "toggleCancelButton", "text", "setText", "cancelSearch", "setPlacement", "value", "setHideWhenScrolling", "setObscureBackground", "setHideNavigationBar", "setCancelButtonText", "setTintColor", "propName", "logNotAvailable", "(Ljava/lang/String;)V", "delegate", "LEk1;", "Companion", "QW0", "react-native-screens_release"}, m22268k = 1, m22269mv = {1, 9, 0}, m22271xi = 48)
/* loaded from: classes2.dex */
public final class SearchBarManager extends ViewGroupManager<XW0> implements InterfaceC9863jI0 {
    public static final QW0 Companion = new QW0();
    public static final String REACT_CLASS = "RNSSearchBar";
    private final InterfaceC7543Ek1 delegate = new C6340l4(this, 15);

    private final void logNotAvailable(String propName) {
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public InterfaceC7543Ek1 getDelegate() {
        return this.delegate;
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public Map<String, Object> getExportedCustomDirectEventTypeConstants() {
        HashMap mapM24256c = AbstractC10889rJ0.m24256c("registrationName", "onSearchBlur");
        HashMap mapM24256c2 = AbstractC10889rJ0.m24256c("registrationName", "onChangeText");
        HashMap mapM24256c3 = AbstractC10889rJ0.m24256c("registrationName", "onClose");
        HashMap mapM24256c4 = AbstractC10889rJ0.m24256c("registrationName", "onSearchFocus");
        HashMap mapM24256c5 = AbstractC10889rJ0.m24256c("registrationName", "onOpen");
        HashMap mapM24256c6 = AbstractC10889rJ0.m24256c("registrationName", "onSearchButtonPress");
        HashMap map = new HashMap();
        map.put("topSearchBlur", mapM24256c);
        map.put("topChangeText", mapM24256c2);
        map.put("topClose", mapM24256c3);
        map.put("topSearchFocus", mapM24256c4);
        map.put("topOpen", mapM24256c5);
        map.put("topSearchButtonPress", mapM24256c6);
        return map;
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager, p000.I50
    public /* bridge */ /* synthetic */ void removeAllViews(View view) {
        AbstractC0852NX.m5754c(this, view);
    }

    @InterfaceC9871jM0(name = "autoFocus")
    public final void setAutoFocus(XW0 view, Boolean autoFocus) {
        O90.m5968f(view, "view");
        view.setAutoFocus(autoFocus != null ? autoFocus.booleanValue() : false);
    }

    @Override // p000.InterfaceC9863jI0
    public void blur(XW0 view) {
        if (view != null) {
            view.m9064o();
        }
    }

    @Override // p000.InterfaceC9863jI0
    public void cancelSearch(XW0 view) {
        if (view != null) {
            view.m9066q();
        }
    }

    @Override // p000.InterfaceC9863jI0
    public void clearText(XW0 view) {
        if (view != null) {
            view.m9065p();
        }
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public XW0 createViewInstance(S91 context) {
        O90.m5968f(context, "context");
        return new XW0(context);
    }

    @Override // p000.InterfaceC9863jI0
    public void focus(XW0 view) {
        if (view != null) {
            view.m9066q();
        }
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public void onAfterUpdateTransaction(XW0 view) {
        O90.m5968f(view, "view");
        super.onAfterUpdateTransaction((SearchBarManager) view);
        view.m9069t();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0036, code lost:
    
        if (r3.equals(com.huawei.hms.rn.push.constants.LocalNotification.Importance.NONE) != false) goto L21;
     */
    @Override // p000.InterfaceC9863jI0
    @p000.InterfaceC9871jM0(name = "autoCapitalize")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void setAutoCapitalize(p000.XW0 r2, java.lang.String r3) {
        /*
            r1 = this;
            java.lang.String r0 = "view"
            p000.O90.m5968f(r2, r0)
            if (r3 == 0) goto L41
            int r0 = r3.hashCode()
            switch(r0) {
                case 3387192: goto L30;
                case 113318569: goto L25;
                case 490141296: goto L1a;
                case 1245424234: goto Lf;
                default: goto Le;
            }
        Le:
            goto L39
        Lf:
            java.lang.String r0 = "characters"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L39
            RW0 r3 = p000.RW0.f10252d
            goto L43
        L1a:
            java.lang.String r0 = "sentences"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L39
            RW0 r3 = p000.RW0.f10251c
            goto L43
        L25:
            java.lang.String r0 = "words"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L39
            RW0 r3 = p000.RW0.f10250b
            goto L43
        L30:
            java.lang.String r0 = "none"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L39
            goto L41
        L39:
            com.facebook.react.bridge.JSApplicationIllegalArgumentException r2 = new com.facebook.react.bridge.JSApplicationIllegalArgumentException
            java.lang.String r3 = "Forbidden auto capitalize value passed"
            r2.<init>(r3)
            throw r2
        L41:
            RW0 r3 = p000.RW0.f10249a
        L43:
            r2.setAutoCapitalize(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.swmansion.rnscreens.SearchBarManager.setAutoCapitalize(XW0, java.lang.String):void");
    }

    @Override // p000.InterfaceC9863jI0
    @InterfaceC9871jM0(customType = RemoteMessageAttributes.COLOR, name = "barTintColor")
    public void setBarTintColor(XW0 view, Integer color) {
        O90.m5968f(view, "view");
        view.setTintColor(color);
    }

    @Override // p000.InterfaceC9863jI0
    public void setCancelButtonText(XW0 view, String value) {
        logNotAvailable("cancelButtonText");
    }

    @Override // p000.InterfaceC9863jI0
    @InterfaceC9871jM0(name = "disableBackButtonOverride")
    public void setDisableBackButtonOverride(XW0 view, boolean disableBackButtonOverride) {
        O90.m5968f(view, "view");
        view.setShouldOverrideBackButton(!disableBackButtonOverride);
    }

    @Override // p000.InterfaceC9863jI0
    @InterfaceC9871jM0(customType = RemoteMessageAttributes.COLOR, name = "headerIconColor")
    public void setHeaderIconColor(XW0 view, Integer color) {
        O90.m5968f(view, "view");
        view.setHeaderIconColor(color);
    }

    @Override // p000.InterfaceC9863jI0
    public void setHideNavigationBar(XW0 view, boolean value) {
        logNotAvailable("hideNavigationBar");
    }

    @Override // p000.InterfaceC9863jI0
    public void setHideWhenScrolling(XW0 view, boolean value) {
        logNotAvailable("hideWhenScrolling");
    }

    @Override // p000.InterfaceC9863jI0
    @InterfaceC9871jM0(customType = RemoteMessageAttributes.COLOR, name = "hintTextColor")
    public void setHintTextColor(XW0 view, Integer color) {
        O90.m5968f(view, "view");
        view.setHintTextColor(color);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x002b, code lost:
    
        if (r3.equals("text") != false) goto L21;
     */
    @Override // p000.InterfaceC9863jI0
    @p000.InterfaceC9871jM0(name = com.huawei.hms.push.constant.RemoteMessageConst.INPUT_TYPE)
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void setInputType(p000.XW0 r2, java.lang.String r3) {
        /*
            r1 = this;
            java.lang.String r0 = "view"
            p000.O90.m5968f(r2, r0)
            if (r3 == 0) goto L41
            int r0 = r3.hashCode()
            switch(r0) {
                case -1034364087: goto L2e;
                case 3556653: goto L25;
                case 96619420: goto L1a;
                case 106642798: goto Lf;
                default: goto Le;
            }
        Le:
            goto L39
        Lf:
            java.lang.String r0 = "phone"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L39
            UW0 r3 = p000.WW0.f13238b
            goto L43
        L1a:
            java.lang.String r0 = "email"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L39
            SW0 r3 = p000.WW0.f13240d
            goto L43
        L25:
            java.lang.String r0 = "text"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L39
            goto L41
        L2e:
            java.lang.String r0 = "number"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L39
            TW0 r3 = p000.WW0.f13239c
            goto L43
        L39:
            com.facebook.react.bridge.JSApplicationIllegalArgumentException r2 = new com.facebook.react.bridge.JSApplicationIllegalArgumentException
            java.lang.String r3 = "Forbidden input type value"
            r2.<init>(r3)
            throw r2
        L41:
            VW0 r3 = p000.WW0.f13237a
        L43:
            r2.setInputType(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.swmansion.rnscreens.SearchBarManager.setInputType(XW0, java.lang.String):void");
    }

    @Override // p000.InterfaceC9863jI0
    public void setObscureBackground(XW0 view, boolean value) {
        logNotAvailable("hideNavigationBar");
    }

    @Override // p000.InterfaceC9863jI0
    @InterfaceC9871jM0(name = "placeholder")
    public void setPlaceholder(XW0 view, String placeholder) {
        O90.m5968f(view, "view");
        if (placeholder != null) {
            view.setPlaceholder(placeholder);
        }
    }

    @Override // p000.InterfaceC9863jI0
    public void setPlacement(XW0 view, String placeholder) {
        O90.m5968f(view, "view");
        logNotAvailable("setPlacement");
    }

    @Override // p000.InterfaceC9863jI0
    @InterfaceC9871jM0(name = "shouldShowHintSearchIcon")
    public void setShouldShowHintSearchIcon(XW0 view, boolean shouldShowHintSearchIcon) {
        O90.m5968f(view, "view");
        view.setShouldShowHintSearchIcon(shouldShowHintSearchIcon);
    }

    @Override // p000.InterfaceC9863jI0
    public void setText(XW0 view, String text) {
        if (view != null) {
            view.m9067r(text);
        }
    }

    @Override // p000.InterfaceC9863jI0
    @InterfaceC9871jM0(customType = RemoteMessageAttributes.COLOR, name = "textColor")
    public void setTextColor(XW0 view, Integer color) {
        O90.m5968f(view, "view");
        view.setTextColor(color);
    }

    @Override // p000.InterfaceC9863jI0
    public void setTintColor(XW0 view, Integer value) {
        logNotAvailable("tintColor");
    }

    @Override // p000.InterfaceC9863jI0
    public void toggleCancelButton(XW0 view, boolean flag) {
    }
}
