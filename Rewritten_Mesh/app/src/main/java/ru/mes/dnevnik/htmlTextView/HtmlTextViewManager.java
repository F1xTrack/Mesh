package ru.mes.dnevnik.htmlTextView;

import com.facebook.react.views.text.ReactTextViewManager;
import kotlin.Metadata;
import p000.C8844bN0;
import p000.T30;

@Metadata(m22266d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\u000b\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\nH\u0016¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, m22267d2 = {"Lru/mes/dnevnik/htmlTextView/HtmlTextViewManager;", "Lcom/facebook/react/views/text/ReactTextViewManager;", "<init>", "()V", "", "getName", "()Ljava/lang/String;", "LbN0;", "createShadowNodeInstance", "()LbN0;", "Ljava/lang/Class;", "getShadowNodeClass", "()Ljava/lang/Class;", "app_moscowRelease"}, m22268k = 1, m22269mv = {1, 9, 0}, m22271xi = 48)
/* loaded from: classes2.dex */
public final class HtmlTextViewManager extends ReactTextViewManager {
    @Override // com.facebook.react.views.text.ReactTextViewManager, com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return "HtmlTextView";
    }

    @Override // com.facebook.react.views.text.ReactTextViewManager, com.facebook.react.uimanager.ViewManager
    public Class<C8844bN0> getShadowNodeClass() {
        return T30.class;
    }

    @Override // com.facebook.react.views.text.ReactTextViewManager, com.facebook.react.uimanager.ViewManager
    public C8844bN0 createShadowNodeInstance() {
        return new T30();
    }
}
