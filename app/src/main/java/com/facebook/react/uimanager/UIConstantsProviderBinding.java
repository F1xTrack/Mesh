package com.facebook.react.uimanager;

import com.facebook.react.bridge.NativeMap;
import com.facebook.react.bridge.RuntimeExecutor;
import com.facebook.soloader.SoLoader;
import kotlin.Metadata;

@Metadata(m22266d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÁ\u0002\u0018\u00002\u00020\u0001:\u0003\u000f\u0010\u0011B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J0\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0087 ¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u0012"}, m22267d2 = {"Lcom/facebook/react/uimanager/UIConstantsProviderBinding;", "", "<init>", "()V", "Lcom/facebook/react/bridge/RuntimeExecutor;", "runtimeExecutor", "Lcom/facebook/react/uimanager/UIConstantsProviderBinding$DefaultEventTypesProvider;", "defaultEventTypesProvider", "Lcom/facebook/react/uimanager/UIConstantsProviderBinding$ConstantsForViewManagerProvider;", "viewManagerConstantsProvider", "Lcom/facebook/react/uimanager/UIConstantsProviderBinding$ConstantsProvider;", "constantsProvider", "LTf1;", "install", "(Lcom/facebook/react/bridge/RuntimeExecutor;Lcom/facebook/react/uimanager/UIConstantsProviderBinding$DefaultEventTypesProvider;Lcom/facebook/react/uimanager/UIConstantsProviderBinding$ConstantsForViewManagerProvider;Lcom/facebook/react/uimanager/UIConstantsProviderBinding$ConstantsProvider;)V", "ConstantsForViewManagerProvider", "ConstantsProvider", "DefaultEventTypesProvider", "ReactAndroid_release"}, m22268k = 1, m22269mv = {1, 9, 0}, m22271xi = 48)
/* loaded from: classes.dex */
public final class UIConstantsProviderBinding {
    public static final UIConstantsProviderBinding INSTANCE = new UIConstantsProviderBinding();

    @Metadata(m22266d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bg\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0006À\u0006\u0001"}, m22267d2 = {"Lcom/facebook/react/uimanager/UIConstantsProviderBinding$ConstantsForViewManagerProvider;", "", "getConstantsForViewManager", "Lcom/facebook/react/bridge/NativeMap;", "viewManagerName", "", "ReactAndroid_release"}, m22268k = 1, m22269mv = {1, 9, 0}, m22271xi = 48)
    public interface ConstantsForViewManagerProvider {
        NativeMap getConstantsForViewManager(String viewManagerName);
    }

    @Metadata(m22266d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0004À\u0006\u0001"}, m22267d2 = {"Lcom/facebook/react/uimanager/UIConstantsProviderBinding$ConstantsProvider;", "", "getConstants", "Lcom/facebook/react/bridge/NativeMap;", "ReactAndroid_release"}, m22268k = 1, m22269mv = {1, 9, 0}, m22271xi = 48)
    public interface ConstantsProvider {
        NativeMap getConstants();
    }

    @Metadata(m22266d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0004À\u0006\u0001"}, m22267d2 = {"Lcom/facebook/react/uimanager/UIConstantsProviderBinding$DefaultEventTypesProvider;", "", "getDefaultEventTypes", "Lcom/facebook/react/bridge/NativeMap;", "ReactAndroid_release"}, m22268k = 1, m22269mv = {1, 9, 0}, m22271xi = 48)
    public interface DefaultEventTypesProvider {
        NativeMap getDefaultEventTypes();
    }

    static {
        SoLoader.m11076j("uimanagerjni");
    }

    private UIConstantsProviderBinding() {
    }

    public static final native void install(RuntimeExecutor runtimeExecutor, DefaultEventTypesProvider defaultEventTypesProvider, ConstantsForViewManagerProvider viewManagerConstantsProvider, ConstantsProvider constantsProvider);
}
