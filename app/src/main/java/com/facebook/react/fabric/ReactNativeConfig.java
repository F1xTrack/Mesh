package com.facebook.react.fabric;

import com.huawei.hms.push.constant.RemoteMessageConst;
import kotlin.Metadata;
import p000.InterfaceC0965PK;

@Metadata(m22266d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\bg\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bJ\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H'J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u0005H'J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u0005H'J\u0010\u0010\n\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0005H'ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\fÀ\u0006\u0001"}, m22267d2 = {"Lcom/facebook/react/fabric/ReactNativeConfig;", "", "getBool", "", RemoteMessageConst.MessageBody.PARAM, "", "getDouble", "", "getInt64", "", "getString", "Companion", "ReactAndroid_release"}, m22268k = 1, m22269mv = {1, 9, 0}, m22271xi = 48)
@InterfaceC0965PK
/* loaded from: classes.dex */
public interface ReactNativeConfig {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.$$INSTANCE;
    public static final ReactNativeConfig DEFAULT_CONFIG = new EmptyReactNativeConfig();

    @Metadata(m22266d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0013\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0001¨\u0006\u0005"}, m22267d2 = {"Lcom/facebook/react/fabric/ReactNativeConfig$Companion;", "", "()V", "DEFAULT_CONFIG", "Lcom/facebook/react/fabric/ReactNativeConfig;", "ReactAndroid_release"}, m22268k = 1, m22269mv = {1, 9, 0}, m22271xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }
    }

    @InterfaceC0965PK
    boolean getBool(String str);

    @InterfaceC0965PK
    double getDouble(String str);

    @InterfaceC0965PK
    long getInt64(String str);

    @InterfaceC0965PK
    String getString(String str);
}
