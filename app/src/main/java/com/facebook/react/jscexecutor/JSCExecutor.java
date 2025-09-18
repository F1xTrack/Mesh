package com.facebook.react.jscexecutor;

import com.facebook.jni.HybridData;
import com.facebook.react.bridge.JavaScriptExecutor;
import com.facebook.react.bridge.ReadableNativeMap;
import com.facebook.soloader.SoLoader;
import kotlin.Metadata;
import p000.InterfaceC0965PK;

@Metadata(m22266d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m22267d2 = {"Lcom/facebook/react/jscexecutor/JSCExecutor;", "Lcom/facebook/react/bridge/JavaScriptExecutor;", "ReactAndroid_release"}, m22268k = 1, m22269mv = {1, 9, 0}, m22271xi = 48)
@InterfaceC0965PK
/* loaded from: classes.dex */
public final class JSCExecutor extends JavaScriptExecutor {

    /* renamed from: a */
    public static final /* synthetic */ int f17913a = 0;

    static {
        SoLoader.m11076j("jscexecutor");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final native HybridData initHybrid(ReadableNativeMap readableNativeMap);

    @Override // com.facebook.react.bridge.JavaScriptExecutor
    public final String getName() {
        return "JSCExecutor";
    }
}
