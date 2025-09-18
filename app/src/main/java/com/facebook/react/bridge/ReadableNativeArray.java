package com.facebook.react.bridge;

import com.facebook.jni.HybridData;
import java.util.ArrayList;
import java.util.Arrays;
import p000.AbstractC7222ym;
import p000.InterfaceC0965PK;
import p000.UN1;

@InterfaceC0965PK
/* loaded from: classes.dex */
public class ReadableNativeArray extends NativeArray implements ReadableArray {
    private static int jniPassCounter;
    private Object[] mLocalArray;
    private ReadableType[] mLocalTypeArray;

    /* renamed from: com.facebook.react.bridge.ReadableNativeArray$1 */
    public static /* synthetic */ class C19071 {
        static final /* synthetic */ int[] $SwitchMap$com$facebook$react$bridge$ReadableType;

        static {
            int[] iArr = new int[ReadableType.values().length];
            $SwitchMap$com$facebook$react$bridge$ReadableType = iArr;
            try {
                iArr[ReadableType.Null.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$facebook$react$bridge$ReadableType[ReadableType.Boolean.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$facebook$react$bridge$ReadableType[ReadableType.Number.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$facebook$react$bridge$ReadableType[ReadableType.String.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$facebook$react$bridge$ReadableType[ReadableType.Map.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$facebook$react$bridge$ReadableType[ReadableType.Array.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    static {
        ReactBridge.staticInit();
        jniPassCounter = 0;
    }

    public ReadableNativeArray(HybridData hybridData) {
        super(hybridData);
    }

    public static int getJNIPassCounter() {
        return jniPassCounter;
    }

    private Object[] getLocalArray() {
        Object[] objArr = this.mLocalArray;
        if (objArr != null) {
            return objArr;
        }
        synchronized (this) {
            try {
                if (this.mLocalArray == null) {
                    jniPassCounter++;
                    Object[] objArrImportArray = importArray();
                    UN1.m7999c(objArrImportArray);
                    this.mLocalArray = objArrImportArray;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return this.mLocalArray;
    }

    private ReadableType[] getLocalTypeArray() {
        ReadableType[] readableTypeArr = this.mLocalTypeArray;
        if (readableTypeArr != null) {
            return readableTypeArr;
        }
        synchronized (this) {
            try {
                if (this.mLocalTypeArray == null) {
                    jniPassCounter++;
                    Object[] objArrImportTypeArray = importTypeArray();
                    UN1.m7999c(objArrImportTypeArray);
                    this.mLocalTypeArray = (ReadableType[]) Arrays.copyOf(objArrImportTypeArray, objArrImportTypeArray.length, ReadableType[].class);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return this.mLocalTypeArray;
    }

    private native Object[] importArray();

    private native Object[] importTypeArray();

    public boolean equals(Object obj) {
        if (obj instanceof ReadableNativeArray) {
            return Arrays.deepEquals(getLocalArray(), ((ReadableNativeArray) obj).getLocalArray());
        }
        return false;
    }

    @Override // com.facebook.react.bridge.ReadableArray
    public boolean getBoolean(int i) {
        return ((Boolean) getLocalArray()[i]).booleanValue();
    }

    @Override // com.facebook.react.bridge.ReadableArray
    public double getDouble(int i) {
        return ((Double) getLocalArray()[i]).doubleValue();
    }

    @Override // com.facebook.react.bridge.ReadableArray
    public Dynamic getDynamic(int i) {
        return DynamicFromArray.create(this, i);
    }

    @Override // com.facebook.react.bridge.ReadableArray
    public int getInt(int i) {
        return ((Double) getLocalArray()[i]).intValue();
    }

    @Override // com.facebook.react.bridge.ReadableArray
    public long getLong(int i) {
        return ((Long) getLocalArray()[i]).longValue();
    }

    @Override // com.facebook.react.bridge.ReadableArray
    public String getString(int i) {
        return (String) getLocalArray()[i];
    }

    @Override // com.facebook.react.bridge.ReadableArray
    public ReadableType getType(int i) {
        return getLocalTypeArray()[i];
    }

    public int hashCode() {
        return getLocalArray().hashCode();
    }

    @Override // com.facebook.react.bridge.ReadableArray
    public boolean isNull(int i) {
        return getLocalArray()[i] == null;
    }

    @Override // com.facebook.react.bridge.ReadableArray
    public int size() {
        return getLocalArray().length;
    }

    @Override // com.facebook.react.bridge.ReadableArray
    public ArrayList<Object> toArrayList() {
        ArrayList<Object> arrayList = new ArrayList<>();
        for (int i = 0; i < size(); i++) {
            switch (C19071.$SwitchMap$com$facebook$react$bridge$ReadableType[getType(i).ordinal()]) {
                case 1:
                    arrayList.add(null);
                    break;
                case 2:
                    arrayList.add(Boolean.valueOf(getBoolean(i)));
                    break;
                case 3:
                    arrayList.add(Double.valueOf(getDouble(i)));
                    break;
                case 4:
                    arrayList.add(getString(i));
                    break;
                case 5:
                    arrayList.add(getMap(i).toHashMap());
                    break;
                case 6:
                    arrayList.add(getArray(i).toArrayList());
                    break;
                default:
                    throw new IllegalArgumentException(AbstractC7222ym.m26230g(i, "Could not convert object at index: ", "."));
            }
        }
        return arrayList;
    }

    @Override // com.facebook.react.bridge.ReadableArray
    public ReadableNativeArray getArray(int i) {
        return (ReadableNativeArray) getLocalArray()[i];
    }

    @Override // com.facebook.react.bridge.ReadableArray
    public ReadableNativeMap getMap(int i) {
        return (ReadableNativeMap) getLocalArray()[i];
    }
}
