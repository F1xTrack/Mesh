package com.reactnativecommunity.webview;

import com.facebook.react.bridge.JavaScriptModule;
import com.facebook.react.bridge.WritableMap;
import kotlin.Metadata;

@Metadata(m22266d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b`\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0007\u0010\u0006¨\u0006\b"}, m22267d2 = {"Lcom/reactnativecommunity/webview/RNCWebViewMessagingModule;", "Lcom/facebook/react/bridge/JavaScriptModule;", "Lcom/facebook/react/bridge/WritableMap;", "event", "LTf1;", "onShouldStartLoadWithRequest", "(Lcom/facebook/react/bridge/WritableMap;)V", "onMessage", "react-native-webview_release"}, m22268k = 1, m22269mv = {1, 9, 0}, m22271xi = 48)
/* loaded from: classes2.dex */
public interface RNCWebViewMessagingModule extends JavaScriptModule {
    void onMessage(WritableMap event);

    void onShouldStartLoadWithRequest(WritableMap event);
}
