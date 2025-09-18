package com.facebook.react.modules.debug;

import com.facebook.fbreact.specs.NativeSourceCodeSpec;
import com.facebook.react.bridge.ReactApplicationContext;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import p000.AbstractC11205tn0;
import p000.InterfaceC9101dL0;
import p000.O90;
import p000.UN1;

@InterfaceC9101dL0(name = NativeSourceCodeSpec.NAME)
@Metadata(m22266d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0014\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006H\u0014¨\u0006\t"}, m22267d2 = {"Lcom/facebook/react/modules/debug/SourceCodeModule;", "Lcom/facebook/fbreact/specs/NativeSourceCodeSpec;", "reactContext", "Lcom/facebook/react/bridge/ReactApplicationContext;", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "getTypedExportedConstants", "", "", "", "ReactAndroid_release"}, m22268k = 1, m22269mv = {1, 9, 0}, m22271xi = 48)
/* loaded from: classes.dex */
public final class SourceCodeModule extends NativeSourceCodeSpec {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SourceCodeModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        O90.m5968f(reactApplicationContext, "reactContext");
    }

    @Override // com.facebook.fbreact.specs.NativeSourceCodeSpec
    public Map<String, Object> getTypedExportedConstants() {
        String sourceURL = getReactApplicationContext().getSourceURL();
        UN1.m8000d(sourceURL, "No source URL loaded, have you initialised the instance?");
        return AbstractC11205tn0.m24984c(new Pair("scriptURL", sourceURL));
    }
}
