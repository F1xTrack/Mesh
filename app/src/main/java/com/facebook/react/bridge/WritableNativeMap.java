package com.facebook.react.bridge;

import com.facebook.jni.HybridData;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p000.InterfaceC0965PK;
import p000.O90;
import p000.UN1;

@Metadata(m22266d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 +2\u00020\u00012\u00020\u0002:\u0001+B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\"\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\u0001H\u0082 ¢\u0006\u0004\b\t\u0010\nJ\"\u0010\f\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\u000bH\u0082 ¢\u0006\u0004\b\f\u0010\rJ\u0018\u0010\u000f\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\u0001H\u0082 ¢\u0006\u0004\b\u000f\u0010\u0010J \u0010\u0012\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0011H\u0096 ¢\u0006\u0004\b\u0012\u0010\u0013J \u0010\u0015\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0014H\u0096 ¢\u0006\u0004\b\u0015\u0010\u0016J \u0010\u0018\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0017H\u0096 ¢\u0006\u0004\b\u0018\u0010\u0019J \u0010\u001b\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u001aH\u0096 ¢\u0006\u0004\b\u001b\u0010\u001cJ\u0018\u0010\u001d\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u0005H\u0096 ¢\u0006\u0004\b\u001d\u0010\u001eJ\"\u0010\u001f\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005H\u0096 ¢\u0006\u0004\b\u001f\u0010 J!\u0010\"\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010!H\u0016¢\u0006\u0004\b\"\u0010#J!\u0010%\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010$H\u0016¢\u0006\u0004\b%\u0010&J\u0017\u0010'\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020!H\u0016¢\u0006\u0004\b'\u0010(J\u000f\u0010)\u001a\u00020\u0002H\u0016¢\u0006\u0004\b)\u0010*¨\u0006,"}, m22267d2 = {"Lcom/facebook/react/bridge/WritableNativeMap;", "Lcom/facebook/react/bridge/ReadableNativeMap;", "Lcom/facebook/react/bridge/WritableMap;", "<init>", "()V", "", "key", "value", "LTf1;", "putNativeMap", "(Ljava/lang/String;Lcom/facebook/react/bridge/ReadableNativeMap;)V", "Lcom/facebook/react/bridge/ReadableNativeArray;", "putNativeArray", "(Ljava/lang/String;Lcom/facebook/react/bridge/ReadableNativeArray;)V", "source", "mergeNativeMap", "(Lcom/facebook/react/bridge/ReadableNativeMap;)V", "", "putBoolean", "(Ljava/lang/String;Z)V", "", "putDouble", "(Ljava/lang/String;D)V", "", "putInt", "(Ljava/lang/String;I)V", "", "putLong", "(Ljava/lang/String;J)V", "putNull", "(Ljava/lang/String;)V", "putString", "(Ljava/lang/String;Ljava/lang/String;)V", "Lcom/facebook/react/bridge/ReadableMap;", "putMap", "(Ljava/lang/String;Lcom/facebook/react/bridge/ReadableMap;)V", "Lcom/facebook/react/bridge/ReadableArray;", "putArray", "(Ljava/lang/String;Lcom/facebook/react/bridge/ReadableArray;)V", "merge", "(Lcom/facebook/react/bridge/ReadableMap;)V", "copy", "()Lcom/facebook/react/bridge/WritableMap;", "Companion", "ReactAndroid_release"}, m22268k = 1, m22269mv = {1, 9, 0}, m22271xi = 48)
@InterfaceC0965PK
/* loaded from: classes.dex */
public final class WritableNativeMap extends ReadableNativeMap implements WritableMap {
    private static final Companion Companion = new Companion(null);

    @Metadata(m22266d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000b\u0010\u0003\u001a\u0004\u0018\u00010\u0004H\u0083 ¨\u0006\u0005"}, m22267d2 = {"Lcom/facebook/react/bridge/WritableNativeMap$Companion;", "", "()V", "initHybrid", "Lcom/facebook/jni/HybridData;", "ReactAndroid_release"}, m22268k = 1, m22269mv = {1, 9, 0}, m22271xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final HybridData initHybrid() {
            return WritableNativeMap.initHybrid();
        }

        private Companion() {
        }
    }

    static {
        ReactBridge.staticInit();
    }

    public WritableNativeMap() {
        super(Companion.initHybrid());
    }

    public static final native HybridData initHybrid();

    private final native void mergeNativeMap(ReadableNativeMap source);

    private final native void putNativeArray(String key, ReadableNativeArray value);

    private final native void putNativeMap(String key, ReadableNativeMap value);

    @Override // com.facebook.react.bridge.WritableMap
    public WritableMap copy() {
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        writableNativeMap.merge(this);
        return writableNativeMap;
    }

    @Override // com.facebook.react.bridge.WritableMap
    public void merge(ReadableMap source) {
        O90.m5968f(source, "source");
        UN1.m7998b(source instanceof ReadableNativeMap, "Illegal type provided");
        mergeNativeMap((ReadableNativeMap) source);
    }

    @Override // com.facebook.react.bridge.WritableMap
    public void putArray(String key, ReadableArray value) {
        O90.m5968f(key, "key");
        UN1.m7998b(value == null || (value instanceof ReadableNativeArray), "Illegal type provided");
        putNativeArray(key, (ReadableNativeArray) value);
    }

    @Override // com.facebook.react.bridge.WritableMap
    public native void putBoolean(String key, boolean value);

    @Override // com.facebook.react.bridge.WritableMap
    public native void putDouble(String key, double value);

    @Override // com.facebook.react.bridge.WritableMap
    public native void putInt(String key, int value);

    @Override // com.facebook.react.bridge.WritableMap
    public native void putLong(String key, long value);

    @Override // com.facebook.react.bridge.WritableMap
    public void putMap(String key, ReadableMap value) {
        O90.m5968f(key, "key");
        UN1.m7998b(value == null || (value instanceof ReadableNativeMap), "Illegal type provided");
        putNativeMap(key, (ReadableNativeMap) value);
    }

    @Override // com.facebook.react.bridge.WritableMap
    public native void putNull(String key);

    @Override // com.facebook.react.bridge.WritableMap
    public native void putString(String key, String value);
}
