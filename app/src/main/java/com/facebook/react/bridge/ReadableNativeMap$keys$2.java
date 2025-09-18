package com.facebook.react.bridge;

import com.facebook.react.bridge.ReadableNativeMap;
import kotlin.Metadata;
import p000.AbstractC8418Vg0;
import p000.InterfaceC6434mZ;

@Metadata(m22266d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m22267d2 = {"<anonymous>", "", "", "invoke", "()[Ljava/lang/String;"}, m22268k = 3, m22269mv = {1, 9, 0}, m22271xi = 48)
/* loaded from: classes.dex */
public final class ReadableNativeMap$keys$2 extends AbstractC8418Vg0 implements InterfaceC6434mZ {
    final /* synthetic */ ReadableNativeMap this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReadableNativeMap$keys$2(ReadableNativeMap readableNativeMap) {
        super(0);
        this.this$0 = readableNativeMap;
    }

    @Override // p000.InterfaceC6434mZ
    public final String[] invoke() {
        String[] strArrImportKeys = this.this$0.importKeys();
        ReadableNativeMap.Companion unused = ReadableNativeMap.Companion;
        ReadableNativeMap.jniPassCounter++;
        return strArrImportKeys;
    }
}
