package com.facebook.react.bridge;

import com.facebook.react.bridge.ReadableNativeMap;
import java.util.HashMap;
import kotlin.Metadata;
import p000.AbstractC8418Vg0;
import p000.InterfaceC6434mZ;
import p000.O90;

@Metadata(m22266d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u001e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003`\u0004H\n¢\u0006\u0002\b\u0005"}, m22267d2 = {"<anonymous>", "Ljava/util/HashMap;", "", "Lcom/facebook/react/bridge/ReadableType;", "Lkotlin/collections/HashMap;", "invoke"}, m22268k = 3, m22269mv = {1, 9, 0}, m22271xi = 48)
/* loaded from: classes.dex */
public final class ReadableNativeMap$localTypeMap$2 extends AbstractC8418Vg0 implements InterfaceC6434mZ {
    final /* synthetic */ ReadableNativeMap this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReadableNativeMap$localTypeMap$2(ReadableNativeMap readableNativeMap) {
        super(0);
        this.this$0 = readableNativeMap;
    }

    @Override // p000.InterfaceC6434mZ
    public final HashMap<String, ReadableType> invoke() {
        int length = this.this$0.getKeys().length;
        HashMap<String, ReadableType> map = new HashMap<>(length);
        Object[] objArrImportTypes = this.this$0.importTypes();
        ReadableNativeMap.Companion unused = ReadableNativeMap.Companion;
        ReadableNativeMap.jniPassCounter++;
        for (int i = 0; i < length; i++) {
            String str = this.this$0.getKeys()[i];
            Object obj = objArrImportTypes[i];
            O90.m5966d(obj, "null cannot be cast to non-null type com.facebook.react.bridge.ReadableType");
            map.put(str, (ReadableType) obj);
        }
        return map;
    }
}
