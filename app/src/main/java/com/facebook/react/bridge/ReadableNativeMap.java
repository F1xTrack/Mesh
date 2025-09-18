package com.facebook.react.bridge;

import android.annotation.SuppressLint;
import com.facebook.jni.HybridData;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p000.AbstractC0705LB;
import p000.AbstractC11153tN0;
import p000.EnumC9659hi0;
import p000.F91;
import p000.O90;
import p000.UN1;

@Metadata(m22266d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010(\n\u0002\u0010&\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0017\u0018\u0000 B2\u00020\u00012\u00020\u0002:\u0001BB\u0011\b\u0004\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004¢\u0006\u0002\u0010\u0005J6\u0010\u001d\u001a\u0002H\u001e\"\u0006\b\u0000\u0010\u001e\u0018\u00012\u0006\u0010\u001f\u001a\u00020\t2\b\u0010 \u001a\u0004\u0018\u00010\n2\f\u0010!\u001a\b\u0012\u0004\u0012\u0002H\u001e0\"H\u0083\b¢\u0006\u0002\u0010#J\u0013\u0010$\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010\nH\u0096\u0002J\u0012\u0010'\u001a\u0004\u0018\u00010(2\u0006\u0010\u001f\u001a\u00020\tH\u0016J\u0010\u0010)\u001a\u00020%2\u0006\u0010\u001f\u001a\u00020\tH\u0016J\u0010\u0010*\u001a\u00020+2\u0006\u0010\u001f\u001a\u00020\tH\u0016J\u0010\u0010,\u001a\u00020-2\u0006\u0010\u001f\u001a\u00020\tH\u0016J\u0010\u0010.\u001a\u00020/2\u0006\u0010\u001f\u001a\u00020\tH\u0016J\u0010\u00100\u001a\u0002012\u0006\u0010\u001f\u001a\u00020\tH\u0016J\u0012\u00102\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u001f\u001a\u00020\tH\u0016J\u0012\u00103\u001a\u0004\u0018\u00010\n2\u0006\u0010\u001f\u001a\u00020\tH\u0002J.\u00103\u001a\u0004\u0018\u0001H\u001e\"\u0006\b\u0000\u0010\u001e\u0018\u00012\u0006\u0010\u001f\u001a\u00020\t2\f\u0010!\u001a\b\u0012\u0004\u0012\u0002H\u001e0\"H\u0082\b¢\u0006\u0002\u00104J\u0012\u00105\u001a\u0004\u0018\u00010\t2\u0006\u0010\u001f\u001a\u00020\tH\u0016J\u0010\u00106\u001a\u00020\u001a2\u0006\u0010\u001f\u001a\u00020\tH\u0016J\u0010\u00107\u001a\u00020\n2\u0006\u0010\u001f\u001a\u00020\tH\u0002J,\u00107\u001a\u0002H\u001e\"\u0006\b\u0000\u0010\u001e\u0018\u00012\u0006\u0010\u001f\u001a\u00020\t2\f\u0010!\u001a\b\u0012\u0004\u0012\u0002H\u001e0\"H\u0082\b¢\u0006\u0002\u00104J\u0010\u00108\u001a\u00020%2\u0006\u0010\u001f\u001a\u00020\tH\u0016J\b\u00109\u001a\u00020/H\u0016J\u0014\u0010:\u001a\b\u0012\u0004\u0012\u00020\t0\u000eH\u0082 ¢\u0006\u0002\u0010\u0010J\u0014\u0010;\u001a\b\u0012\u0004\u0012\u00020\n0\u000eH\u0082 ¢\u0006\u0002\u0010<J\u0014\u0010=\u001a\b\u0012\u0004\u0012\u00020\n0\u000eH\u0082 ¢\u0006\u0002\u0010<J\u0010\u0010>\u001a\u00020%2\u0006\u0010\u001f\u001a\u00020\tH\u0016J\b\u0010?\u001a\u00020@H\u0016J$\u0010A\u001a\u001e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\u0014j\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n`\u0015H\u0016R&\u0010\u0006\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b0\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR!\u0010\r\u001a\b\u0012\u0004\u0012\u00020\t0\u000e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u000f\u0010\u0010R7\u0010\u0013\u001a\u001e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\u0014j\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n`\u00158BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u0012\u001a\u0004\b\u0016\u0010\u0017R7\u0010\u0019\u001a\u001e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u001a0\u0014j\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u001a`\u00158BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001c\u0010\u0012\u001a\u0004\b\u001b\u0010\u0017¨\u0006C"}, m22267d2 = {"Lcom/facebook/react/bridge/ReadableNativeMap;", "Lcom/facebook/react/bridge/NativeMap;", "Lcom/facebook/react/bridge/ReadableMap;", "hybridData", "Lcom/facebook/jni/HybridData;", "(Lcom/facebook/jni/HybridData;)V", "entryIterator", "", "", "", "", "getEntryIterator", "()Ljava/util/Iterator;", "keys", "", "getKeys", "()[Ljava/lang/String;", "keys$delegate", "Lkotlin/Lazy;", "localMap", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "getLocalMap", "()Ljava/util/HashMap;", "localMap$delegate", "localTypeMap", "Lcom/facebook/react/bridge/ReadableType;", "getLocalTypeMap", "localTypeMap$delegate", "checkInstance", "T", "name", "instance", "type", "Ljava/lang/Class;", "(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Class;)Ljava/lang/Object;", "equals", "", "other", "getArray", "Lcom/facebook/react/bridge/ReadableArray;", "getBoolean", "getDouble", "", "getDynamic", "Lcom/facebook/react/bridge/Dynamic;", "getInt", "", "getLong", "", "getMap", "getNullableValue", "(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;", "getString", "getType", "getValue", "hasKey", "hashCode", "importKeys", "importTypes", "()[Ljava/lang/Object;", "importValues", "isNull", "keySetIterator", "Lcom/facebook/react/bridge/ReadableMapKeySetIterator;", "toHashMap", "Companion", "ReactAndroid_release"}, m22268k = 1, m22269mv = {1, 9, 0}, m22271xi = 48)
/* loaded from: classes.dex */
public class ReadableNativeMap extends NativeMap implements ReadableMap {
    private static final Companion Companion = new Companion(null);
    private static int jniPassCounter;

    /* renamed from: keys$delegate, reason: from kotlin metadata */
    private final Lazy keys;

    /* renamed from: localMap$delegate, reason: from kotlin metadata */
    private final Lazy localMap;

    /* renamed from: localTypeMap$delegate, reason: from kotlin metadata */
    private final Lazy localTypeMap;

    @Metadata(m22266d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0005\u001a\u00020\u0004H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, m22267d2 = {"Lcom/facebook/react/bridge/ReadableNativeMap$Companion;", "", "()V", "jniPassCounter", "", "getJNIPassCounter", "ReactAndroid_release"}, m22268k = 1, m22269mv = {1, 9, 0}, m22271xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int getJNIPassCounter() {
            return ReadableNativeMap.jniPassCounter;
        }

        private Companion() {
        }
    }

    @Metadata(m22268k = 3, m22269mv = {1, 9, 0}, m22271xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ReadableType.values().length];
            try {
                iArr[ReadableType.Null.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ReadableType.Boolean.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ReadableType.Number.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ReadableType.String.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[ReadableType.Map.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[ReadableType.Array.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Metadata(m22266d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\b\u001a\u00020\tH\u0016J\b\u0010\n\u001a\u00020\u000bH\u0016R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007¨\u0006\f"}, m22267d2 = {"com/facebook/react/bridge/ReadableNativeMap$keySetIterator$1", "Lcom/facebook/react/bridge/ReadableMapKeySetIterator;", "currentIndex", "", "getCurrentIndex", "()I", "setCurrentIndex", "(I)V", "hasNextKey", "", "nextKey", "", "ReactAndroid_release"}, m22268k = 1, m22269mv = {1, 9, 0}, m22271xi = 48)
    /* renamed from: com.facebook.react.bridge.ReadableNativeMap$keySetIterator$1 */
    public static final class C19081 implements ReadableMapKeySetIterator {
        final /* synthetic */ String[] $iteratorKeys;
        private int currentIndex;

        public C19081(String[] strArr) {
            strArr = strArr;
        }

        public final int getCurrentIndex() {
            return this.currentIndex;
        }

        @Override // com.facebook.react.bridge.ReadableMapKeySetIterator
        public boolean hasNextKey() {
            return this.currentIndex < strArr.length;
        }

        @Override // com.facebook.react.bridge.ReadableMapKeySetIterator
        public String nextKey() {
            String[] strArr = strArr;
            int i = this.currentIndex;
            this.currentIndex = i + 1;
            return strArr[i];
        }

        public final void setCurrentIndex(int i) {
            this.currentIndex = i;
        }
    }

    static {
        ReactBridge.staticInit();
    }

    public ReadableNativeMap(HybridData hybridData) {
        super(hybridData);
        EnumC9659hi0 enumC9659hi0 = EnumC9659hi0.f28537a;
        this.keys = AbstractC0705LB.m4916c(enumC9659hi0, new ReadableNativeMap$keys$2(this));
        this.localMap = AbstractC0705LB.m4916c(enumC9659hi0, new ReadableNativeMap$localMap$2(this));
        this.localTypeMap = AbstractC0705LB.m4916c(enumC9659hi0, new ReadableNativeMap$localTypeMap$2(this));
    }

    @SuppressLint({"ReflectionMethodUse"})
    private final /* synthetic */ <T> T checkInstance(String name, Object instance, Class<T> type) {
        O90.m5974l();
        throw null;
    }

    public static final int getJNIPassCounter() {
        return Companion.getJNIPassCounter();
    }

    public final String[] getKeys() {
        return (String[]) this.keys.getValue();
    }

    private final HashMap<String, Object> getLocalMap() {
        return (HashMap) this.localMap.getValue();
    }

    private final HashMap<String, ReadableType> getLocalTypeMap() {
        return (HashMap) this.localTypeMap.getValue();
    }

    private final Object getNullableValue(String name) {
        return getLocalMap().get(name);
    }

    private final Object getValue(String name) {
        if (!hasKey(name)) {
            throw new NoSuchKeyException(name);
        }
        Object obj = getLocalMap().get(name);
        UN1.m7999c(obj);
        return obj;
    }

    public final native String[] importKeys();

    public final native Object[] importTypes();

    public final native Object[] importValues();

    public boolean equals(Object other) {
        if (other instanceof ReadableNativeMap) {
            return O90.m5963a(getLocalMap(), ((ReadableNativeMap) other).getLocalMap());
        }
        return false;
    }

    @Override // com.facebook.react.bridge.ReadableMap
    public ReadableArray getArray(String name) {
        O90.m5968f(name, "name");
        Object nullableValue = getNullableValue(name);
        ReadableArray readableArray = null;
        if (nullableValue != null) {
            readableArray = (ReadableArray) (nullableValue instanceof ReadableArray ? nullableValue : null);
            if (readableArray == null) {
                throw new UnexpectedNativeTypeException(AbstractC11153tN0.m24912x("Value for ", name, " cannot be cast from ", nullableValue.getClass().getSimpleName(), " to ReadableArray"));
            }
        }
        return readableArray;
    }

    @Override // com.facebook.react.bridge.ReadableMap
    public boolean getBoolean(String name) {
        O90.m5968f(name, "name");
        Class cls = Boolean.TYPE;
        Object value = getValue(name);
        Boolean bool = (Boolean) (!(value instanceof Boolean) ? null : value);
        if (bool != null) {
            return bool.booleanValue();
        }
        String simpleName = value != null ? value.getClass().getSimpleName() : null;
        if (simpleName == null) {
            simpleName = "NULL";
        }
        String simpleName2 = cls.getSimpleName();
        StringBuilder sbM2541x = F91.m2541x("Value for ", name, " cannot be cast from ", simpleName, " to ");
        sbM2541x.append(simpleName2);
        throw new UnexpectedNativeTypeException(sbM2541x.toString());
    }

    @Override // com.facebook.react.bridge.ReadableMap
    public double getDouble(String name) {
        O90.m5968f(name, "name");
        Class cls = Double.TYPE;
        Object value = getValue(name);
        Double d = (Double) (!(value instanceof Double) ? null : value);
        if (d != null) {
            return d.doubleValue();
        }
        String simpleName = value != null ? value.getClass().getSimpleName() : null;
        if (simpleName == null) {
            simpleName = "NULL";
        }
        String simpleName2 = cls.getSimpleName();
        StringBuilder sbM2541x = F91.m2541x("Value for ", name, " cannot be cast from ", simpleName, " to ");
        sbM2541x.append(simpleName2);
        throw new UnexpectedNativeTypeException(sbM2541x.toString());
    }

    @Override // com.facebook.react.bridge.ReadableMap
    public Dynamic getDynamic(String name) {
        O90.m5968f(name, "name");
        DynamicFromMap dynamicFromMapCreate = DynamicFromMap.create(this, name);
        O90.m5967e(dynamicFromMapCreate, "create(...)");
        return dynamicFromMapCreate;
    }

    @Override // com.facebook.react.bridge.ReadableMap
    public Iterator<Map.Entry<String, Object>> getEntryIterator() {
        ReadableNativeMap$entryIterator$1$1 readableNativeMap$entryIterator$1$1;
        synchronized (this) {
            String[] keys = getKeys();
            Object[] objArrImportValues = importValues();
            jniPassCounter++;
            readableNativeMap$entryIterator$1$1 = new ReadableNativeMap$entryIterator$1$1(keys, objArrImportValues);
        }
        return readableNativeMap$entryIterator$1$1;
    }

    @Override // com.facebook.react.bridge.ReadableMap
    public int getInt(String name) {
        O90.m5968f(name, "name");
        Class cls = Double.TYPE;
        Object value = getValue(name);
        Double d = (Double) (!(value instanceof Double) ? null : value);
        if (d != null) {
            return (int) d.doubleValue();
        }
        String simpleName = value != null ? value.getClass().getSimpleName() : null;
        if (simpleName == null) {
            simpleName = "NULL";
        }
        String simpleName2 = cls.getSimpleName();
        StringBuilder sbM2541x = F91.m2541x("Value for ", name, " cannot be cast from ", simpleName, " to ");
        sbM2541x.append(simpleName2);
        throw new UnexpectedNativeTypeException(sbM2541x.toString());
    }

    @Override // com.facebook.react.bridge.ReadableMap
    public long getLong(String name) {
        O90.m5968f(name, "name");
        Class cls = Long.TYPE;
        Object value = getValue(name);
        Long l = (Long) (!(value instanceof Long) ? null : value);
        if (l != null) {
            return l.longValue();
        }
        String simpleName = value != null ? value.getClass().getSimpleName() : null;
        if (simpleName == null) {
            simpleName = "NULL";
        }
        String simpleName2 = cls.getSimpleName();
        StringBuilder sbM2541x = F91.m2541x("Value for ", name, " cannot be cast from ", simpleName, " to ");
        sbM2541x.append(simpleName2);
        throw new UnexpectedNativeTypeException(sbM2541x.toString());
    }

    @Override // com.facebook.react.bridge.ReadableMap
    public String getString(String name) {
        O90.m5968f(name, "name");
        Object nullableValue = getNullableValue(name);
        String str = null;
        if (nullableValue != null) {
            str = (String) (nullableValue instanceof String ? nullableValue : null);
            if (str == null) {
                throw new UnexpectedNativeTypeException(AbstractC11153tN0.m24912x("Value for ", name, " cannot be cast from ", nullableValue.getClass().getSimpleName(), " to String"));
            }
        }
        return str;
    }

    @Override // com.facebook.react.bridge.ReadableMap
    public ReadableType getType(String name) {
        O90.m5968f(name, "name");
        ReadableType readableType = getLocalTypeMap().get(name);
        if (readableType != null) {
            return readableType;
        }
        throw new NoSuchKeyException(name);
    }

    @Override // com.facebook.react.bridge.ReadableMap
    public boolean hasKey(String name) {
        O90.m5968f(name, "name");
        return getLocalMap().containsKey(name);
    }

    public int hashCode() {
        return getLocalMap().hashCode();
    }

    @Override // com.facebook.react.bridge.ReadableMap
    public boolean isNull(String name) {
        O90.m5968f(name, "name");
        if (getLocalMap().containsKey(name)) {
            return getLocalMap().get(name) == null;
        }
        throw new NoSuchKeyException(name);
    }

    @Override // com.facebook.react.bridge.ReadableMap
    public ReadableMapKeySetIterator keySetIterator() {
        return new ReadableMapKeySetIterator() { // from class: com.facebook.react.bridge.ReadableNativeMap.keySetIterator.1
            final /* synthetic */ String[] $iteratorKeys;
            private int currentIndex;

            public C19081(String[] strArr) {
                strArr = strArr;
            }

            public final int getCurrentIndex() {
                return this.currentIndex;
            }

            @Override // com.facebook.react.bridge.ReadableMapKeySetIterator
            public boolean hasNextKey() {
                return this.currentIndex < strArr.length;
            }

            @Override // com.facebook.react.bridge.ReadableMapKeySetIterator
            public String nextKey() {
                String[] strArr = strArr;
                int i = this.currentIndex;
                this.currentIndex = i + 1;
                return strArr[i];
            }

            public final void setCurrentIndex(int i) {
                this.currentIndex = i;
            }
        };
    }

    @Override // com.facebook.react.bridge.ReadableMap
    public HashMap<String, Object> toHashMap() {
        HashMap<String, Object> map = new HashMap<>(getLocalMap());
        for (String str : map.keySet()) {
            O90.m5966d(str, "null cannot be cast to non-null type kotlin.String");
            String str2 = str;
            switch (WhenMappings.$EnumSwitchMapping$0[getType(str2).ordinal()]) {
                case 5:
                    ReadableNativeMap map2 = getMap(str2);
                    UN1.m7999c(map2);
                    map.put(str2, map2.toHashMap());
                    break;
                case 6:
                    ReadableArray array = getArray(str2);
                    UN1.m7999c(array);
                    map.put(str2, array.toArrayList());
                    break;
            }
        }
        return map;
    }

    private final /* synthetic */ <T> T getNullableValue(String name, Class<T> type) {
        if (getNullableValue(name) == null) {
            return null;
        }
        O90.m5974l();
        throw null;
    }

    @Override // com.facebook.react.bridge.ReadableMap
    public ReadableNativeMap getMap(String name) {
        O90.m5968f(name, "name");
        Object nullableValue = getNullableValue(name);
        ReadableNativeMap readableNativeMap = null;
        if (nullableValue != null) {
            readableNativeMap = (ReadableNativeMap) (nullableValue instanceof ReadableNativeMap ? nullableValue : null);
            if (readableNativeMap == null) {
                throw new UnexpectedNativeTypeException(AbstractC11153tN0.m24912x("Value for ", name, " cannot be cast from ", nullableValue.getClass().getSimpleName(), " to ReadableNativeMap"));
            }
        }
        return readableNativeMap;
    }

    private final /* synthetic */ <T> T getValue(String name, Class<T> type) {
        getValue(name);
        O90.m5974l();
        throw null;
    }
}
